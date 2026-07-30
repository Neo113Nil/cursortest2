package com.crrepa.band.my.device.localmusic;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.localmusic.model.event.MusicDeletedEvent;
import com.crrepa.band.my.device.localmusic.model.event.MusicSavedCountChangedEvent;
import com.crrepa.band.my.device.localmusic.model.event.SavedMusicNameEvent;
import com.crrepa.ble.conn.listener.CRPMusicChangeListener;

/* loaded from: classes2.dex */
public class a implements CRPMusicChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPMusicChangeListener
    public void onAvailableSize(int i8) {
        Log.d("BandMusicChangeListener", "onAvailableSize-" + i8);
        i.saveAvailableSize(i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPMusicChangeListener
    public void onMusicDeleted(int i8, boolean z7) {
        Log.d("BandMusicChangeListener", "onMusicDeleted-" + i8 + "-" + z7);
        i4.getInstance().queryMusicAvailableSize();
        org.greenrobot.eventbus.c.getDefault().post(new MusicDeletedEvent(i8));
    }

    @Override // com.crrepa.ble.conn.listener.CRPMusicChangeListener
    public void onMusicName(int i8, String str) {
        Log.d("BandMusicChangeListener", "onMusicName-" + i8 + "-" + str);
        org.greenrobot.eventbus.c.getDefault().post(new SavedMusicNameEvent(i8, str));
    }

    @Override // com.crrepa.ble.conn.listener.CRPMusicChangeListener
    public void onMusicSavedCount(int i8, long j8) {
        Log.d("BandMusicChangeListener", "onMusicSavedCount-" + i8 + "-" + j8);
        i.saveMusicSavedCount(i8);
        org.greenrobot.eventbus.c.getDefault().post(new MusicSavedCountChangedEvent());
    }
}
