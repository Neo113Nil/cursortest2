package com.zmxv.RNSound;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SoundSpec.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u001b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0015H\u0016J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016J\u0018\u0010'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0015H\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\rH\u0016J\b\u0010/\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/zmxv/RNSound/SoundSpec;", "Lcom/zmxv/RNSound/NativeSoundAndroidSpec;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "module", "Lcom/zmxv/RNSound/Sound;", "prepare", "", "fileName", "", "key", "", "options", "Lcom/facebook/react/bridge/ReadableMap;", "callback", "Lcom/facebook/react/bridge/Callback;", "setCategory", "value", "mixWithOthers", "", "play", "pause", "stop", "reset", "release", "setVolume", ViewProps.LEFT, ViewProps.RIGHT, "getSystemVolume", "setLooping", "looping", "setSpeed", "speed", "setPitch", "pitch", "setCurrentTime", "sec", "getCurrentTime", "setSpeakerphoneOn", "speaker", "setSystemVolume", "addListener", "eventName", "removeListeners", NewHtcHomeBadger.COUNT, "getName", "Companion", "react-native-sound_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SoundSpec extends NativeSoundAndroidSpec {
    public static final String NAME = "RNSound";
    private Sound module;

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void removeListeners(double count) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundSpec(ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.module = new Sound(context);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void prepare(String fileName, double key, ReadableMap options, Callback callback) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.prepare(fileName, Double.valueOf(key), options, callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setCategory(String value, boolean mixWithOthers) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.module.setCategory(value, Boolean.valueOf(mixWithOthers));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void play(double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.play(Double.valueOf(key), callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void pause(double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.pause(Double.valueOf(key), callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void stop(double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.stop(key, callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void reset(double key) {
        this.module.reset(Double.valueOf(key));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void release(double key) {
        this.module.release(key);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setVolume(double key, double left, double right) {
        this.module.setVolume(Double.valueOf(key), Float.valueOf((float) left), Float.valueOf((float) right));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void getSystemVolume(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.getSystemVolume(callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setLooping(double key, boolean looping) {
        this.module.setLooping(Double.valueOf(key), Boolean.valueOf(looping));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setSpeed(double key, double speed) {
        this.module.setSpeed(Double.valueOf(key), Float.valueOf((float) speed));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setPitch(double key, double pitch) {
        this.module.setPitch(Double.valueOf(key), Float.valueOf((float) pitch));
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setCurrentTime(double key, double sec) {
        this.module.setCurrentTime(Double.valueOf(key), (float) sec);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void getCurrentTime(double key, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.module.getCurrentTime(Double.valueOf(key), callback);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setSpeakerphoneOn(double key, boolean speaker) {
        this.module.setSpeakerphoneOn(Double.valueOf(key), speaker);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec
    public void setSystemVolume(double value) {
        this.module.setSystemVolume((float) value);
    }

    @Override // com.zmxv.RNSound.NativeSoundAndroidSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }
}
