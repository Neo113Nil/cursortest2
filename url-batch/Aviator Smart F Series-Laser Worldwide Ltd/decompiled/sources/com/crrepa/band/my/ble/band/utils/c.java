package com.crrepa.band.my.ble.band.utils;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import com.crrepa.band.my.ble.band.cmd.i4;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c {
    private static final String CMDNAME = "command";
    private static final String CMDNEXT = "next";
    private static final String CMDPAUSE = "pause";
    private static final String CMDPREVIOUS = "previous";
    private static final String CMDSTOP = "stop";
    private static final String CMDTOGGLEPAUSE = "togglepause";
    private static final int DEFAULT_MAX_VOLUME = 60;
    private static final String SERVICECMD = "com.android.music.musicservicecommand";
    private static AudioManager mAudioManager;
    private static c musicControlManager;
    private Context context;
    private Disposable playerSubscribe;
    private float volumeUnit = 1.0f;
    private boolean playerStateChange = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            c.this.playerStateChange = false;
        }
    }

    class b extends Thread {
        final /* synthetic */ int val$keyValue;

        b(int i8) {
            this.val$keyValue = i8;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                new Instrumentation().sendKeyDownUpSync(this.val$keyValue);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private c(Context context) {
        this.context = context;
    }

    public static c getInstance(Context context) {
        if (musicControlManager == null) {
            musicControlManager = new c(context);
        }
        mAudioManager = (AudioManager) context.getSystemService("audio");
        return musicControlManager;
    }

    private void sendKeyDown(int i8) {
        sendKeyDownOfDispatchMedia(i8);
    }

    @RequiresApi(api = 19)
    private void sendKeyDownOfDispatchMedia(int i8) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j8 = uptimeMillis - 1;
        mAudioManager.dispatchMediaKeyEvent(new KeyEvent(j8, j8, 0, i8, 0));
        if (!com.crrepa.band.my.device.pushmessage.notify.c.getInstance().is5Sing()) {
            com.orhanobut.logger.f.d("ACTION_UP");
            mAudioManager.dispatchMediaKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 1, i8, 0));
        }
        if (com.moyoung.dafit.module.common.utils.a.isEMUI()) {
            if (TextUtils.isEmpty(i8 == 87 ? CMDNEXT : i8 == 88 ? CMDPREVIOUS : null)) {
                return;
            }
            Intent intent = new Intent(SERVICECMD);
            intent.putExtra(CMDNAME, CMDNEXT);
            this.context.sendBroadcast(intent);
        }
    }

    private void sendKeyDownOfInstrumentation(int i8) {
        new b(i8).start();
    }

    public int getCurrentVolume() {
        return Math.round(mAudioManager.getStreamVolume(3) / this.volumeUnit);
    }

    public int getMaxVolume() {
        int streamMaxVolume = mAudioManager.getStreamMaxVolume(3);
        if (60 >= streamMaxVolume) {
            return streamMaxVolume;
        }
        int streamMaxVolume2 = mAudioManager.getStreamMaxVolume(1);
        this.volumeUnit = streamMaxVolume / Integer.valueOf(streamMaxVolume2).floatValue();
        com.orhanobut.logger.f.d("volumeUnit: " + this.volumeUnit);
        return streamMaxVolume2;
    }

    public int getRealCurrentVolume() {
        return mAudioManager.getStreamVolume(3);
    }

    public int getRealMaxVolume() {
        return mAudioManager.getStreamMaxVolume(3);
    }

    public boolean isMusicActive() {
        return mAudioManager.isMusicActive();
    }

    public boolean isPlayerStateChange() {
        return this.playerStateChange;
    }

    public void next() {
        sendKeyDown(87);
    }

    public void pause() {
        sendKeyDown(127);
    }

    public void play() {
        sendKeyDown(126);
    }

    public void previous() {
        sendKeyDown(88);
    }

    public void setStreamVolume(int i8) {
        com.orhanobut.logger.f.d("setStreamVolume: " + i8);
        mAudioManager.setStreamVolume(3, i8, 4);
    }

    public void swtichPlayState() {
        byte b8;
        if (isMusicActive()) {
            pause();
            b8 = 0;
        } else {
            play();
            b8 = 1;
        }
        i4.getInstance().setPlayerState(b8);
        this.playerStateChange = true;
        Disposable disposable = this.playerSubscribe;
        if (disposable != null && !disposable.isDisposed()) {
            this.playerSubscribe.dispose();
        }
        this.playerSubscribe = Observable.timer(400L, TimeUnit.MILLISECONDS).subscribe(new a());
    }

    public void volumeDown() {
        setStreamVolume(Math.round(mAudioManager.getStreamVolume(3) - this.volumeUnit));
    }

    public void volumeUp() {
        setStreamVolume(Math.round(mAudioManager.getStreamVolume(3) + this.volumeUnit));
    }
}
