package com.crrepa.band.my.ble.band.cmd.listener;

import com.android.mltcode.paycertification.call.VerificationListener;
import com.android.mltcode.paycertificationapi.IWrite;
import com.android.mltcode.paycertificationapi.PayCertificationApi;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.listener.CRPOfflineVoiceListener;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class k implements CRPOfflineVoiceListener {

    class a implements IWrite {
        a() {
        }

        @Override // com.android.mltcode.paycertificationapi.IWrite
        public boolean onWrite(byte[] bArr) {
            com.orhanobut.logger.f.d("PayCertificationApi init: " + Arrays.toString(bArr));
            i4.getInstance().sendOfflineVoiceCertification(bArr);
            return true;
        }
    }

    class b implements VerificationListener {
        b() {
        }

        @Override // com.android.mltcode.paycertification.call.VerificationListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("PayCertificationApi onError: " + i8);
        }

        @Override // com.android.mltcode.paycertification.call.VerificationListener
        public void onSuccess() {
            com.orhanobut.logger.f.d("PayCertificationApi onSuccess");
        }

        @Override // com.android.mltcode.paycertification.call.VerificationListener
        public void onUnknown(int i8) {
            com.orhanobut.logger.f.d("PayCertificationApi onUnknown: " + i8);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPOfflineVoiceListener
    public void onAuthorizationResult(boolean z7) {
        com.orhanobut.logger.f.d("onAuthorizationResult: " + z7);
        if (z7) {
            return;
        }
        PayCertificationApi.init(com.moyoung.dafit.module.common.utils.d.get(), com.crrepa.band.my.ble.band.utils.a.getInstance().getName(), new a());
    }

    @Override // com.crrepa.ble.conn.listener.CRPOfflineVoiceListener
    public void onCertification(byte[] bArr) {
        com.orhanobut.logger.f.d("onCertification: " + Arrays.toString(bArr));
        PayCertificationApi.distributionData(bArr, new b());
    }
}
