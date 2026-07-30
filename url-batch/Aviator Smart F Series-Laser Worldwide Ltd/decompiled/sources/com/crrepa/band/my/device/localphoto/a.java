package com.crrepa.band.my.device.localphoto;

import android.util.Log;
import com.crrepa.band.my.device.localphoto.model.PhotoDeleteFailedEvent;
import com.crrepa.band.my.device.localphoto.model.PhotoDeleteSucceedEvent;
import com.crrepa.band.my.device.localphoto.model.PhotoInfoUpdatedEvent;
import com.crrepa.ble.conn.bean.CRPGalleryInfo;
import com.crrepa.ble.conn.listener.CRPGalleryChangeListener;

/* loaded from: classes2.dex */
public class a implements CRPGalleryChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPGalleryChangeListener
    public void onGalleryInfo(CRPGalleryInfo cRPGalleryInfo) {
        Log.d("LocalPhotoListener", "CRPGalleryInfo=" + cRPGalleryInfo.toString());
        l.saveCRPLocalPhotoInfo(cRPGalleryInfo);
        org.greenrobot.eventbus.c.getDefault().post(new PhotoInfoUpdatedEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPGalleryChangeListener
    public void onResult(int i8, boolean z7) {
        Log.d("LocalPhotoListener", "code=" + i8 + ",success=" + z7);
        if (z7) {
            org.greenrobot.eventbus.c.getDefault().post(new PhotoDeleteSucceedEvent());
        } else {
            org.greenrobot.eventbus.c.getDefault().post(new PhotoDeleteFailedEvent());
        }
    }
}
