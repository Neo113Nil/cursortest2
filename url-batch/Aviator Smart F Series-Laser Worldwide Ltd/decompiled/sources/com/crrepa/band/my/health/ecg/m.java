package com.crrepa.band.my.health.ecg;

import java.util.Date;

/* loaded from: classes2.dex */
public interface m {
    void renderAverageHr(int i8);

    void renderEcgAnalysis(String str, String[] strArr);

    void renderEcgAnalysisTextColor(int i8);

    void renderEcgData(int[] iArr, int i8, int i9);

    void renderEcgDiagnosisResult(String str);

    void renderFatigue(int i8);

    void renderHeartLoad(int i8);

    void renderHeartRateVariabilitValue(int i8);

    void renderHeartStrength(int i8);

    void renderMeasureDate(Date date);

    void renderMeasureTime(int i8);

    void renderMentalStress(int i8);

    void showEcgDiagnosisView();
}
