package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPBreathingTrainingInfo;
import java.util.List;

/* loaded from: classes3.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12539a = 3;

    private f1() {
    }

    public static byte[] a(CRPBreathingTrainingInfo cRPBreathingTrainingInfo) {
        List<CRPBreathingTrainingInfo.BreathingBean> breathingList;
        if (cRPBreathingTrainingInfo == null || (breathingList = cRPBreathingTrainingInfo.getBreathingList()) == null || breathingList.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[breathingList.size() + 3];
        bArr[0] = 3;
        bArr[1] = (byte) cRPBreathingTrainingInfo.getType().getValue();
        bArr[2] = (byte) cRPBreathingTrainingInfo.getTimes();
        for (int i8 = 0; i8 < breathingList.size(); i8++) {
            CRPBreathingTrainingInfo.BreathingBean breathingBean = breathingList.get(i8);
            bArr[i8 + 3] = (byte) (breathingBean.getType().getValue() + breathingBean.getSeconds());
        }
        return g.a(-71, bArr);
    }
}
