package com.crrepa.band.my.health.ecg;

import java.util.List;

/* loaded from: classes2.dex */
public interface e {
    void renderConnectBandView();

    void renderEcgAnalysisView();

    void renderEcgMeasureData(List<Integer> list);

    void renderEcgMeasureView();

    void renderEcgStatisticsView(long j8);

    void renderHeartRate(String str);

    void renderMeasureFail();

    void renderPrepareMeasureView();

    void renderPressElectrodeView();
}
