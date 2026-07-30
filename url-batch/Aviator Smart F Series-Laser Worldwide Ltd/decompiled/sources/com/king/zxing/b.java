package com.king.zxing;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class b implements MediaPlayer.OnErrorListener, Closeable {
    private static final float BEEP_VOLUME = 0.1f;
    private static final long VIBRATE_DURATION = 200;
    private final Activity activity;
    private MediaPlayer mediaPlayer = null;
    private boolean playBeep;
    private boolean vibrate;

    b(Activity activity) {
        this.activity = activity;
        updatePrefs();
    }

    @TargetApi(19)
    private MediaPlayer buildMediaPlayer(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(R$raw.zxl_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                mediaPlayer.setOnErrorListener(this);
                mediaPlayer.setAudioStreamType(3);
                mediaPlayer.setLooping(false);
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                openRawResourceFd.close();
                return mediaPlayer;
            } finally {
            }
        } catch (IOException e8) {
            b5.b.w(e8);
            mediaPlayer.release();
            return null;
        }
    }

    private static boolean shouldBeep(SharedPreferences sharedPreferences, Context context) {
        boolean z7 = sharedPreferences.getBoolean("preferences_play_beep", false);
        if (!z7 || ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2) {
            return z7;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
        try {
            if (i8 == 100) {
                this.activity.finish();
            } else {
                close();
                updatePrefs();
            }
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }

    synchronized void playBeepSoundAndVibrate() {
        MediaPlayer mediaPlayer;
        try {
            if (this.playBeep && (mediaPlayer = this.mediaPlayer) != null) {
                mediaPlayer.start();
            }
            if (this.vibrate) {
                ((Vibrator) this.activity.getSystemService("vibrator")).vibrate(VIBRATE_DURATION);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setPlayBeep(boolean z7) {
        this.playBeep = z7;
    }

    public void setVibrate(boolean z7) {
        this.vibrate = z7;
    }

    synchronized void updatePrefs() {
        shouldBeep(PreferenceManager.getDefaultSharedPreferences(this.activity), this.activity);
        if (this.playBeep && this.mediaPlayer == null) {
            this.activity.setVolumeControlStream(3);
            this.mediaPlayer = buildMediaPlayer(this.activity);
        }
    }
}
