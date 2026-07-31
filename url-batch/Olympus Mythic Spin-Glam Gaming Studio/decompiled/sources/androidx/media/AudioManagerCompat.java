package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes10.dex */
public final class AudioManagerCompat {

    @RequiresApi
    private static class Api21Impl {
        @DoNotInline
        static boolean isVolumeFixed(AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }
    }

    @RequiresApi
    private static class Api26Impl {
        @DoNotInline
        static int abandonAudioFocusRequest(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        @DoNotInline
        static int requestAudioFocus(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    @RequiresApi
    private static class Api28Impl {
        @DoNotInline
        static int getStreamMinVolume(AudioManager audioManager, int i) {
            return audioManager.getStreamMinVolume(i);
        }
    }
}
