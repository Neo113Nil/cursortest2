package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class AudioCapabilities {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 10;

    @VisibleForTesting
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 10);
    private static final ImmutableList<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.of(2, 5, 6);
    private static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    @RequiresApi(23)
    private static final class Api23 {
        private Api23() {
        }

        @DoNotInline
        private static final ImmutableSet<Integer> getAllBluetoothDeviceTypes() {
            ImmutableSet.Builder add = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            int i8 = Util.SDK_INT;
            if (i8 >= 31) {
                add.add((Object[]) new Integer[]{26, 27});
            }
            if (i8 >= 33) {
                add.add((ImmutableSet.Builder) 30);
            }
            return add.build();
        }

        @DoNotInline
        public static final boolean isBluetoothConnected(Context context) {
            AudioDeviceInfo[] devices;
            int type;
            devices = ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).getDevices(2);
            ImmutableSet<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                type = audioDeviceInfo.getType();
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(type))) {
                    return true;
                }
            }
            return false;
        }
    }

    @RequiresApi(29)
    private static final class Api29 {
        private static final android.media.AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        private Api29() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DoNotInline
        public static ImmutableList<Integer> getDirectPlaybackSupportedEncodings() {
            boolean isDirectPlaybackSupported;
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Util.SDK_INT >= 34 || intValue != 30) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), DEFAULT_AUDIO_ATTRIBUTES);
                    if (isDirectPlaybackSupported) {
                        builder.add((ImmutableList.Builder) Integer.valueOf(intValue));
                    }
                }
            }
            builder.add((ImmutableList.Builder) 2);
            return builder.build();
        }

        @DoNotInline
        public static int getMaxSupportedChannelCountForPassthrough(int i8, int i9) {
            boolean isDirectPlaybackSupported;
            for (int i10 = 10; i10 > 0; i10--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i9).setChannelMask(Util.getAudioTrackChannelConfig(i10)).build(), DEFAULT_AUDIO_ATTRIBUTES);
                if (isDirectPlaybackSupported) {
                    return i10;
                }
            }
            return 0;
        }
    }

    public AudioCapabilities(@Nullable int[] iArr, int i8) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.supportedEncodings = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i8;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        if (Util.SDK_INT >= 17) {
            String str = Util.MANUFACTURER;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static int getChannelConfigForPassthrough(int i8) {
        int i9 = Util.SDK_INT;
        if (i9 <= 28) {
            if (i8 == 7) {
                i8 = 8;
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                i8 = 6;
            }
        }
        if (i9 <= 26 && "fugu".equals(Util.DEVICE) && i8 == 1) {
            i8 = 2;
        }
        return Util.getAudioTrackChannelConfig(i8);
    }

    @Nullable
    static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i8, int i9) {
        return Util.SDK_INT >= 29 ? Api29.getMaxSupportedChannelCountForPassthrough(i8, i9) : ((Integer) Assertions.checkNotNull(ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(i8), 0))).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        int i8 = format.channelCount;
        if (i8 == -1 || encoding == 18) {
            int i9 = format.sampleRate;
            if (i9 == -1) {
                i9 = 48000;
            }
            i8 = getMaxSupportedChannelCountForPassthrough(encoding, i9);
        } else if (format.sampleMimeType.equals(MimeTypes.AUDIO_DTS_X)) {
            if (i8 > 10) {
                return null;
            }
        } else if (i8 > this.maxChannelCount) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(i8);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public boolean isPassthroughPlaybackSupported(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format) != null;
    }

    public boolean supportsEncoding(int i8) {
        return Arrays.binarySearch(this.supportedEncodings, i8) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + Arrays.toString(this.supportedEncodings) + "]";
    }

    @SuppressLint({"InlinedApi"})
    static AudioCapabilities getCapabilities(Context context, @Nullable Intent intent) {
        int i8 = Util.SDK_INT;
        if (i8 >= 23 && Api23.isBluetoothConnected(context)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (deviceMaySetExternalSurroundSoundGlobalSetting() && Settings.Global.getInt(context.getContentResolver(), EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            builder.addAll((Iterable) EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (i8 >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            builder.addAll((Iterable) Api29.getDirectPlaybackSupportedEncodings());
            return new AudioCapabilities(Ints.toArray(builder.build()), 10);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                builder.addAll((Iterable) Ints.asList(intArrayExtra));
            }
            return new AudioCapabilities(Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        }
        ImmutableSet build = builder.build();
        return !build.isEmpty() ? new AudioCapabilities(Ints.toArray(build), 10) : DEFAULT_AUDIO_CAPABILITIES;
    }
}
