package com.crrepa.band.my.ble.band.utils;

import android.content.Context;
import android.media.MediaPlayer;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class f {
    private MediaPlayer mediaPlayer;

    private static class b {
        private static f INSTANCE = new f();

        private b() {
        }
    }

    public static f getInstance() {
        return b.INSTANCE;
    }

    public void playFindPhoneSound(Context context) {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = MediaPlayer.create(context, R.raw.find_phone);
        }
        this.mediaPlayer.setLooping(true);
        this.mediaPlayer.start();
    }

    public void stopFindPhoneSound() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    private f() {
    }
}
