package com.crrepa.band.my.device.pushmessage.notify.service;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RemoteController;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.connect.a;
import com.crrepa.band.my.device.pushmessage.notify.b;
import com.crrepa.band.my.device.pushmessage.notify.c;
import com.crrepa.band.my.device.setting.other.model.MusicPlayerStateEvent;
import com.crrepa.band.my.model.band.provider.BandMusicPlayerProvider;
import com.orhanobut.logger.f;
import l0.d;
import org.greenrobot.eventbus.l;

@SuppressLint({"OverrideAbstract"})
/* loaded from: classes2.dex */
public class NotificationCollectorService extends NotificationListenerService implements RemoteController.OnClientUpdateListener {
    private boolean musicPlayerEnable = BandMusicPlayerProvider.getMusicPlayerState();
    private RemoteController remoteController;
    private String songName;

    private void registerRemoteController() {
        if (this.remoteController != null) {
            return;
        }
        this.remoteController = new RemoteController(this, this);
        try {
            if (((AudioManager) getSystemService("audio")).registerRemoteController(this.remoteController)) {
                try {
                    this.remoteController.setArtworkConfiguration(100, 100);
                    this.remoteController.setSynchronizationMode(1);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void sendPlayerState(int i8) {
        if (this.musicPlayerEnable) {
            if (i8 == 2) {
                i4.getInstance().setPlayerState((byte) 0);
            } else if (i8 == 3) {
                i4.getInstance().setPlayerState((byte) 1);
            }
        }
    }

    private void unregisterRemoteController() {
        if (this.remoteController != null) {
            ((AudioManager) getSystemService("audio")).unregisterRemoteController(this.remoteController);
            this.remoteController = null;
        }
    }

    @l
    public void onBandBoundStateChangeEvent(d dVar) {
        if (dVar.isBound()) {
            registerRemoteController();
        } else {
            unregisterRemoteController();
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean z7) {
        f.d("onClientChange: " + z7);
        c.getInstance().clearPlayerName();
        if (z7 && this.musicPlayerEnable) {
            i4.getInstance().closeMusicControl();
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        String string = metadataEditor.getString(7, "");
        String string2 = metadataEditor.getString(2, "");
        f.d("onClientMetadataUpdate name: " + string);
        f.d("onClientMetadataUpdate artist: " + string2);
        this.songName = string;
        if (this.musicPlayerEnable) {
            i4.getInstance().sendSongName(string);
            i4.getInstance().sendLyrics(string2);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i8) {
        f.d("onClientPlaybackStateUpdate: " + i8);
        sendPlayerState(i8);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int i8) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        org.greenrobot.eventbus.c.getDefault().register(this);
        f.d("NotificationCollectorService onCreate");
        a.connect();
        registerRemoteController();
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        unregisterRemoteController();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
    }

    @l
    public void onMusicPlayerStateEvent(MusicPlayerStateEvent musicPlayerStateEvent) {
        this.musicPlayerEnable = musicPlayerStateEvent.isEnable();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        f.d("onNotificationPosted");
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() == null) {
            return;
        }
        try {
            b.sendMessageNotification(this, statusBarNotification.getNotification(), statusBarNotification.getPackageName(), this.songName);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i8, long j8, long j9, float f8) {
        f.d("onClientPlaybackStateUpdate: " + i8);
        sendPlayerState(i8);
    }
}
