package t0;

import android.util.Log;
import com.crrepa.band.my.device.ai.debugmodel.g;
import com.crrepa.ble.conn.listener.CRPHealthAnalysisListener;

/* loaded from: classes2.dex */
public class f implements CRPHealthAnalysisListener {
    private final e analysisDelegate = new e();

    @Override // com.crrepa.ble.conn.listener.CRPHealthAnalysisListener
    public void onCancelHealthAnalysis() {
        Log.d("AIFetch", "onCancelHealthAnalysis");
        org.greenrobot.eventbus.c.getDefault().post(new g("onCancelHealthAnalysis()"));
        this.analysisDelegate.resetRequestId();
    }

    @Override // com.crrepa.ble.conn.listener.CRPHealthAnalysisListener
    public void onCancelHealthReport() {
        Log.d("AIFetch", "onCancelHealthReport");
        org.greenrobot.eventbus.c.getDefault().post(new g("onCancelHealthReport()"));
        this.analysisDelegate.resetRequestId();
    }

    @Override // com.crrepa.ble.conn.listener.CRPHealthAnalysisListener
    public void onRequestHealthAnalysis() {
        Log.d("AIFetch", "onRequestHealthAnalysis");
        org.greenrobot.eventbus.c.getDefault().post(new g("onRequestHealthAnalysis()"));
        this.analysisDelegate.analyzeHealthData(false);
    }

    @Override // com.crrepa.ble.conn.listener.CRPHealthAnalysisListener
    public void onRequestHealthReport() {
        Log.d("AIFetch", "onRequestHealthReport");
        org.greenrobot.eventbus.c.getDefault().post(new g("onRequestHealthReport()"));
        this.analysisDelegate.analyzeHealthData(true);
    }
}
