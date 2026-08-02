package io.flutter.embedding.engine.systemchannels;

import E.AbstractC0005f;
import android.os.Build;
import android.util.DisplayMetrics;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class SettingsChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String CONFIGURATION_ID = "configurationId";
    private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
    public final BasicMessageChannel<Object> channel;
    final ConfigurationQueue configurationQueue = new ConfigurationQueue();

    public static class ConfigurationQueue {
        private SentConfiguration currentConfiguration;
        private SentConfiguration previousEnqueuedConfiguration;
        final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue<>();

        public static class SentConfiguration {
            private static int nextConfigGeneration = Integer.MIN_VALUE;
            private final DisplayMetrics displayMetrics;
            public final int generationNumber;

            public SentConfiguration(DisplayMetrics displayMetrics) {
                int i4 = nextConfigGeneration;
                nextConfigGeneration = i4 + 1;
                this.generationNumber = i4;
                this.displayMetrics = displayMetrics;
            }
        }

        public BasicMessageChannel.Reply enqueueConfiguration(SentConfiguration sentConfiguration) {
            this.sentQueue.add(sentConfiguration);
            final SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
            this.previousEnqueuedConfiguration = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public void reply(Object obj) {
                    ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
                    if (ConfigurationQueue.this.sentQueue.isEmpty()) {
                        return;
                    }
                    Log.e(SettingsChannel.TAG, "The queue becomes empty after removing config generation " + sentConfiguration2.generationNumber);
                }
            };
        }

        public SentConfiguration getConfiguration(int i4) {
            SentConfiguration sentConfiguration;
            if (this.currentConfiguration == null) {
                this.currentConfiguration = this.sentQueue.poll();
            }
            while (true) {
                sentConfiguration = this.currentConfiguration;
                if (sentConfiguration == null || sentConfiguration.generationNumber >= i4) {
                    break;
                }
                this.currentConfiguration = this.sentQueue.poll();
            }
            if (sentConfiguration == null) {
                Log.e(SettingsChannel.TAG, "Cannot find config with generation: " + i4 + ", after exhausting the queue.");
                return null;
            }
            if (sentConfiguration.generationNumber == i4) {
                return sentConfiguration;
            }
            StringBuilder r4 = AbstractC0005f.r(i4, "Cannot find config with generation: ", ", the oldest config is now: ");
            r4.append(this.currentConfiguration.generationNumber);
            Log.e(SettingsChannel.TAG, r4.toString());
            return null;
        }
    }

    public class MessageBuilder {
        private DisplayMetrics displayMetrics;
        private Map<String, Object> message = new HashMap();

        public MessageBuilder() {
        }

        public void send() {
            Log.v(SettingsChannel.TAG, "Sending message: \ntextScaleFactor: " + this.message.get(SettingsChannel.TEXT_SCALE_FACTOR) + "\nalwaysUse24HourFormat: " + this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT) + "\nplatformBrightness: " + this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (!SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
                SettingsChannel.this.channel.send(this.message);
                return;
            }
            ConfigurationQueue.SentConfiguration sentConfiguration = new ConfigurationQueue.SentConfiguration(displayMetrics);
            BasicMessageChannel.Reply<Object> enqueueConfiguration = SettingsChannel.this.configurationQueue.enqueueConfiguration(sentConfiguration);
            this.message.put(SettingsChannel.CONFIGURATION_ID, Integer.valueOf(sentConfiguration.generationNumber));
            SettingsChannel.this.channel.send(this.message, enqueueConfiguration);
        }

        public MessageBuilder setBrieflyShowPassword(boolean z) {
            this.message.put(SettingsChannel.BRIEFLY_SHOW_PASSWORD, Boolean.valueOf(z));
            return this;
        }

        public MessageBuilder setDisplayMetrics(DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
            return this;
        }

        public MessageBuilder setNativeSpellCheckServiceDefined(boolean z) {
            this.message.put(SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, Boolean.valueOf(z));
            return this;
        }

        public MessageBuilder setPlatformBrightness(PlatformBrightness platformBrightness) {
            this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        public MessageBuilder setTextScaleFactor(float f4) {
            this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f4));
            return this;
        }

        public MessageBuilder setUse24HourFormat(boolean z) {
            this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z));
            return this;
        }
    }

    public enum PlatformBrightness {
        light("light"),
        dark("dark");

        public String name;

        PlatformBrightness(String str) {
            this.name = str;
        }
    }

    public SettingsChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
    }

    public static boolean hasNonlinearTextScalingSupport() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public DisplayMetrics getPastDisplayMetrics(int i4) {
        ConfigurationQueue.SentConfiguration configuration = this.configurationQueue.getConfiguration(i4);
        if (configuration == null) {
            return null;
        }
        return configuration.displayMetrics;
    }

    public MessageBuilder startMessage() {
        return new MessageBuilder();
    }
}
