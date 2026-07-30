package com.crrepa.band.my.device.setting.quickresponse;

import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.setting.quickresponse.model.BandQuickResponseChangeEvent;
import com.crrepa.band.my.model.band.provider.BandQuickResponseProvider;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class g implements com.moyoung.dafit.module.common.baseui.f {
    public static final byte START_RESPONSE_INDEX = 1;
    private int responseCount;
    private byte responseIndex = 1;
    private h view;

    public g() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private String getDefaultResponseMessage(int i8) {
        List<String> defaultResponseMessageList = BandQuickResponseProvider.getDefaultResponseMessageList(com.moyoung.dafit.module.common.utils.d.get());
        return defaultResponseMessageList.get((i8 - 1) % defaultResponseMessageList.size());
    }

    private void queryResponseMessage() {
        if (this.responseIndex <= this.responseCount) {
            i4.getInstance().queryQuickResponses(this.responseIndex);
        }
    }

    private void showLocalResponseList(Context context) {
        this.view.renderDefaultResponseList(BandQuickResponseProvider.getResponseMessageList(context));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.view = null;
    }

    public void getQuickResponseSetting(Context context) {
        this.view.renderQuickResponseState(BandQuickResponseProvider.getResponseState());
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            showLocalResponseList(context);
        } else {
            this.responseCount = BandQuickResponseProvider.getResponseCount();
            queryResponseMessage();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandQuickResponseChangeEvent(BandQuickResponseChangeEvent bandQuickResponseChangeEvent) {
        CRPQuickResponsesDetailInfo info = bandQuickResponseChangeEvent.getInfo();
        com.orhanobut.logger.f.d("CRPQuickResponsesDetailInfo: " + info);
        if (info == null || info.getId() != this.responseIndex) {
            return;
        }
        String message = info.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = getDefaultResponseMessage(info.getId());
        }
        this.view.renderResponseMessage(message);
        this.responseIndex = (byte) (this.responseIndex + 1);
        queryResponseMessage();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveResponseMessage(boolean z7, List<String> list) {
        if (z7) {
            i4.getInstance().enableQuickResponses();
        } else {
            i4.getInstance().disableQuickResponses();
        }
        int i8 = 0;
        while (i8 < list.size()) {
            CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo = new CRPQuickResponsesDetailInfo();
            int i9 = i8 + 1;
            cRPQuickResponsesDetailInfo.setId((byte) i9);
            cRPQuickResponsesDetailInfo.setMessage(list.get(i8));
            i4.getInstance().sendQuickResponses(cRPQuickResponsesDetailInfo);
            i8 = i9;
        }
        BandQuickResponseProvider.saveResponseState(z7);
        BandQuickResponseProvider.saveResponseMessageList(list);
    }

    public void setView(h hVar) {
        this.view = hVar;
    }
}
