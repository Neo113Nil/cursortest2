package com.crrepa.band.my.device.localvideo;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.localvideo.model.SavedVideoInfoEvent;
import com.crrepa.band.my.device.localvideo.model.VideoDeleteFailedEvent;
import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import com.crrepa.ble.conn.listener.CRPLocalVideoChangeListener;

/* loaded from: classes2.dex */
public class a implements CRPLocalVideoChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPLocalVideoChangeListener
    public void onLocalVideoDeleted(boolean z7) {
        Log.d("VideoChangeListener", "success=" + z7);
        if (z7) {
            i4.getInstance().queryLocalVideoInfo();
        } else {
            org.greenrobot.eventbus.c.getDefault().post(new VideoDeleteFailedEvent());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPLocalVideoChangeListener
    public void onLocalVideoInfo(CRPLocalVideoInfo cRPLocalVideoInfo) {
        Log.d("VideoChangeListener", "onLocalVideoInfo=" + cRPLocalVideoInfo.toString());
        m.saveCRPLocalVideoInfo(cRPLocalVideoInfo);
        org.greenrobot.eventbus.c.getDefault().post(new SavedVideoInfoEvent());
    }
}
