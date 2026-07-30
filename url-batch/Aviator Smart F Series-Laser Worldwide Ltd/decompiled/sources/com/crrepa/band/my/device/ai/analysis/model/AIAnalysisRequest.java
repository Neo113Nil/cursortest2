package com.crrepa.band.my.device.ai.analysis.model;

import java.util.List;

/* loaded from: classes2.dex */
public class AIAnalysisRequest {
    public int analysisType = 15;
    public List<HealthData> data;

    public static class HealthData {
        public String age;
        public String date;
        public String gender;
        public String height;
        public String hr;
        public String pressureAvg;
        public String pressureHigh;
        public String pressureLow;
        public String sao2;
        public String sleep;
        public String step;
        public String stress;
        public String temperature;
        public String weight;
    }
}
