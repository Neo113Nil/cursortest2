package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes10.dex */
public abstract class VolumeProviderCompat {

    public static abstract class Callback {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ControlType {
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    /* renamed from: androidx.media.VolumeProviderCompat$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    class AnonymousClass1 extends VolumeProvider {
        final /* synthetic */ VolumeProviderCompat this$0;

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            this.this$0.onSetVolumeTo(i);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            this.this$0.onAdjustVolume(i);
        }
    }

    /* renamed from: androidx.media.VolumeProviderCompat$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    class AnonymousClass2 extends VolumeProvider {
        final /* synthetic */ VolumeProviderCompat this$0;

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            this.this$0.onSetVolumeTo(i);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            this.this$0.onAdjustVolume(i);
        }
    }

    @RequiresApi
    private static class Api21Impl {
        @DoNotInline
        static void setCurrentVolume(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }
}
