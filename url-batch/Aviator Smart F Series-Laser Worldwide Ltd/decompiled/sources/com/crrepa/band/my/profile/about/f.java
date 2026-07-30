package com.crrepa.band.my.profile.about;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ota.model.BandNewFirmwareVersionEvent;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.moyoung.dafit.module.common.utils.u;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private g aboutUsView;
    private boolean checkBetaUpdate = false;

    public f() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    public void checkBetaFirmwareUpdate() {
        this.checkBetaUpdate = true;
        i4.getInstance().checkFirmwareVersion(BandInfoManager.getFirmwareVersion(), 1);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.aboutUsView = null;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandFirmwareVersionChangeEvent(BandNewFirmwareVersionEvent bandNewFirmwareVersionEvent) {
        if (this.checkBetaUpdate) {
            this.checkBetaUpdate = false;
            CRPFirmwareVersionInfo versionInfo = bandNewFirmwareVersionEvent.getVersionInfo();
            if (versionInfo == null) {
                this.aboutUsView.renderBetaFirmwareUpdate(null);
            } else if (versionInfo.getType() == 1) {
                this.aboutUsView.renderBetaFirmwareUpdate(r0.a.toBandFirmwareModel(versionInfo));
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(g gVar) {
        this.aboutUsView = gVar;
    }

    public void startAppScore(Context context) {
        String format = String.format(u.isZH() ? "https://sj.qq.com/appdetail/%s" : "https://play.google.com/store/apps/details?id=%s", context.getPackageName());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(format));
        context.startActivity(intent);
    }
}
