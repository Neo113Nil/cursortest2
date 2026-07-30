package com.crrepa.band.my.ble.band.cmd.listener;

import android.telephony.SmsManager;
import android.text.TextUtils;
import com.crrepa.band.my.device.setting.quickresponse.model.BandQuickResponseChangeEvent;
import com.crrepa.band.my.device.setting.quickresponse.model.BandQuickResponseStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandQuickResponseProvider;
import com.crrepa.ble.conn.bean.CRPQuickResponsesCountInfo;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import com.crrepa.ble.conn.listener.CRPQuickResponsesChangeListener;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class l implements CRPQuickResponsesChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPQuickResponsesChangeListener
    public void onQuickResponsesCount(CRPQuickResponsesCountInfo cRPQuickResponsesCountInfo) {
        com.orhanobut.logger.f.d("onQuickResponsesCount: " + cRPQuickResponsesCountInfo.toString());
        BandQuickResponseProvider.saveResponseCount(cRPQuickResponsesCountInfo.getCount());
        boolean isEnable = cRPQuickResponsesCountInfo.isEnable();
        if (isEnable) {
            isEnable = q7.b.hasSelfPermissions(com.moyoung.dafit.module.common.utils.d.get(), "android.permission.SEND_SMS");
        }
        BandQuickResponseProvider.saveResponseState(isEnable);
        org.greenrobot.eventbus.c.getDefault().post(new BandQuickResponseStateChangeEvent(isEnable));
    }

    @Override // com.crrepa.ble.conn.listener.CRPQuickResponsesChangeListener
    public void onQuickResponsesDetail(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
        org.greenrobot.eventbus.c.getDefault().post(new BandQuickResponseChangeEvent(cRPQuickResponsesDetailInfo));
    }

    @Override // com.crrepa.ble.conn.listener.CRPQuickResponsesChangeListener
    public void onSendSms(String str) {
        String incomingNumber = com.crrepa.band.my.device.pushmessage.notify.a.getInstance().getIncomingNumber();
        com.orhanobut.logger.f.d("onSendSms: " + incomingNumber + ", " + str);
        if (TextUtils.isEmpty(incomingNumber) || TextUtils.isEmpty(str)) {
            return;
        }
        SmsManager smsManager = SmsManager.getDefault();
        ArrayList<String> divideMessage = smsManager.divideMessage(str);
        com.orhanobut.logger.f.d("onSendSms: " + divideMessage.size());
        smsManager.sendMultipartTextMessage(incomingNumber, null, divideMessage, null, null);
    }
}
