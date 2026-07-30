package com.crrepa.band.my.health.ecg.diagnosis;

import com.crrepa.band.my.health.ecg.n;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;
import com.crrepa.band.my.model.net.EcgAuxiliaryResultEntity;
import com.crrepa.band.my.model.net.KyAuthLoginEntity;
import io.reactivex.functions.Consumer;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a {
    private Ecg ecg;
    private int heartRate;
    private com.crrepa.band.my.health.ecg.diagnosis.b ecgDiagnosisManager = new com.crrepa.band.my.health.ecg.diagnosis.b();
    private int[] ecgData = null;

    /* renamed from: com.crrepa.band.my.health.ecg.diagnosis.a$a, reason: collision with other inner class name */
    class C0201a implements Consumer {
        C0201a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(KyAuthLoginEntity kyAuthLoginEntity) {
            if (kyAuthLoginEntity.getCode() == 200) {
                a.this.reportEcg(kyAuthLoginEntity.getData().getPublickey());
            }
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(EcgAuxiliaryResultEntity ecgAuxiliaryResultEntity) {
            if (ecgAuxiliaryResultEntity.getCode() == 200) {
                String viewUrl = ecgAuxiliaryResultEntity.getData().getViewUrl();
                a.this.saveDiagnosisUrl(viewUrl);
                a.this.postEcgDiagnosisCompleteEvent(viewUrl);
            }
        }
    }

    private void authLogin() {
        this.ecgDiagnosisManager.loginKy().subscribe(new C0201a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postEcgDiagnosisCompleteEvent(String str) {
        c.getDefault().post(new n(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportEcg(String str) {
        this.ecgDiagnosisManager.reportEcg(str, this.ecgData, this.heartRate).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDiagnosisUrl(String str) {
        this.ecg.setDiagnosisUrl(str);
        new EcgDaoProxy().insert(this.ecg);
    }

    public void ecgDiagnosis(int[] iArr, long j8) {
        Ecg ecg = new EcgDaoProxy().getEcg(j8);
        if (ecg == null || iArr == null) {
            return;
        }
        this.heartRate = ecg.getAverageHeartRate().intValue();
        this.ecgData = iArr;
        this.ecg = ecg;
        authLogin();
    }
}
