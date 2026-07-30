package com.crrepa.band.my.health.ecg;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class l implements com.moyoung.dafit.module.common.baseui.f {
    private static final int DEFAULT_HEART_RATE_MALFUNCTION = 2;
    private static final int DEFAULT_MEASURE_TIME = 30;
    private m bandEcgStatisticsView;
    private Ecg ecg;

    class a implements Consumer {
        final /* synthetic */ int val$count;
        final /* synthetic */ int val$uvValue;

        a(int i8, int i9) {
            this.val$count = i8;
            this.val$uvValue = i9;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(int[] iArr) {
            l.this.showEcg(iArr, this.val$count, this.val$uvValue);
        }
    }

    class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        public int[] apply(String str) {
            return new n2.a().readEcgData(str);
        }
    }

    public l() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void analysisEcg(Context context, Ecg ecg) {
        String string;
        String[] stringArray;
        String[] strArr;
        String str;
        Integer diagnosisType = ecg.getDiagnosisType();
        if (diagnosisType == null) {
            diagnosisType = (ecg.getHeartRateFast() != null && ecg.getHeartRateFast().booleanValue()) ? 2 : (isArrhythmia(ecg.getPrematureBeat(), ecg.getHeartRateStop(), ecg.getLeakage()) || (ecg.getHeartRateMisaligned() != null ? ecg.getHeartRateMisaligned().booleanValue() : false)) ? 4 : 0;
            if (ecg.getHeartRateSlow() != null && ecg.getHeartRateSlow().booleanValue()) {
                diagnosisType = 1;
            }
        }
        int intValue = diagnosisType.intValue();
        if (intValue == 0) {
            showAnalysisNormalTextColor(context);
            string = context.getString(R.string.ecg_normal);
            stringArray = context.getResources().getStringArray(R.array.ecg_normal_description);
        } else if (intValue == 1) {
            string = context.getString(R.string.ecg_bradycardia);
            stringArray = context.getResources().getStringArray(R.array.ecg_bradycardia_description);
        } else if (intValue == 2) {
            string = context.getString(R.string.ecg_tachycardia);
            stringArray = context.getResources().getStringArray(R.array.ecg_tachycardia_description);
        } else if (intValue == 3) {
            string = context.getString(R.string.ecg_atrial_fibrillation);
            stringArray = context.getResources().getStringArray(R.array.ecg_atrial_fibrillation_description);
        } else {
            if (intValue != 4) {
                str = null;
                strArr = null;
                if (TextUtils.isEmpty(str)) {
                    this.bandEcgStatisticsView.renderEcgAnalysis(str, strArr);
                    return;
                }
                return;
            }
            string = context.getString(R.string.ecg_arrhythmia);
            stringArray = context.getResources().getStringArray(R.array.ecg_arrhythmia_description);
        }
        String str2 = string;
        strArr = stringArray;
        str = str2;
        if (TextUtils.isEmpty(str)) {
        }
    }

    private void getMeasureEcgData(String str, int i8, int i9) {
        Observable.just(str).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(i8, i9));
    }

    private boolean isArrhythmia(Integer num, Integer num2, Integer num3) {
        if (num != null && 2 < num.intValue()) {
            return true;
        }
        if (num2 == null || 2 >= num2.intValue()) {
            return num3 != null && 2 < num3.intValue();
        }
        return true;
    }

    private void showAnalysisNormalTextColor(Context context) {
        this.bandEcgStatisticsView.renderEcgAnalysisTextColor(ContextCompat.getColor(context, R.color.color_ecg_analysis_normal));
    }

    private void showAverageHeartRate(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderAverageHr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEcg(int[] iArr, int i8, int i9) {
        this.bandEcgStatisticsView.renderEcgData(iArr, i8, i9);
    }

    private void showEcgAuxiliaryResult(String str) {
        this.bandEcgStatisticsView.renderEcgDiagnosisResult(str);
    }

    private void showEcgDiagnosisView(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.bandEcgStatisticsView.showEcgDiagnosisView();
    }

    private void showFatigue(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderFatigue(num.intValue());
    }

    private void showHeartLoad(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderHeartLoad(num.intValue());
    }

    private void showHeartRateVariability(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderHeartRateVariabilitValue(num.intValue());
    }

    private void showHeartStrength(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderHeartStrength(num.intValue());
    }

    private void showMeasureTime(Integer num) {
        this.bandEcgStatisticsView.renderMeasureTime(num != null ? num.intValue() : 30);
    }

    private void showMentalStress(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        this.bandEcgStatisticsView.renderMentalStress(num.intValue());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.bandEcgStatisticsView = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getLastTimesEcgMeasureResult(Context context, long j8) {
        Date date;
        if (j8 == -1) {
            this.ecg = EcgDaoProxy.getInstance().getLastTimeEcg();
        } else {
            this.ecg = EcgDaoProxy.getInstance().getEcg(j8);
        }
        Ecg ecg = this.ecg;
        if (ecg == null) {
            date = new Date();
        } else {
            Date date2 = ecg.getDate();
            showHeartRateVariability(this.ecg.getHeartRateVariability());
            showFatigue(this.ecg.getFatigue());
            showMentalStress(this.ecg.getMentalStress());
            showHeartLoad(this.ecg.getHeartLoad());
            showHeartStrength(this.ecg.getHeartRateStrength());
            analysisEcg(context, this.ecg);
            showEcgDiagnosisView(this.ecg.getDiagnosisUrl());
            showMeasureTime(this.ecg.getTime());
            showAverageHeartRate(this.ecg.getAverageHeartRate());
            getMeasureEcgData(this.ecg.getPath(), this.ecg.getPerGridNumber().intValue(), com.crrepa.band.my.health.ecg.view.b.getPerGridUvValue(this.ecg.getPerGridUvValue()));
            date = date2;
        }
        this.bandEcgStatisticsView.renderMeasureDate(date);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEcgDiagnosisCompleteEvent(n nVar) {
        showEcgDiagnosisView(nVar.getUrl());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void seeEcgDiagnosisResult() {
        Ecg ecg = this.ecg;
        if (ecg == null || TextUtils.isEmpty(ecg.getDiagnosisUrl())) {
            return;
        }
        showEcgAuxiliaryResult(this.ecg.getDiagnosisUrl());
    }

    public void setView(m mVar) {
        this.bandEcgStatisticsView = mVar;
    }

    public void startEcgResultActivity(Context context) {
        Ecg ecg = this.ecg;
        if (ecg == null) {
            return;
        }
        context.startActivity(BandEcgResultActivity.getCallingIntent(context, ecg));
    }
}
