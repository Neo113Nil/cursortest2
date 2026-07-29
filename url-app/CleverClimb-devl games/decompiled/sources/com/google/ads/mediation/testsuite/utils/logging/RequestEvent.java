package com.google.ads.mediation.testsuite.utils.logging;

import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RequestEvent implements LogEvent {
    private String adUnitId;
    private String adapterClass;
    private String format;
    private int requestResult;

    @Override // com.google.ads.mediation.testsuite.utils.logging.LogEvent
    public String getEventType() {
        return "request";
    }

    public RequestEvent(NetworkConfig networkConfig, int i) {
        this.adUnitId = networkConfig.getAdUnitId().getId();
        this.format = networkConfig.getAdapter().getFormat();
        this.adapterClass = networkConfig.getAdapter().getClassName();
        this.requestResult = i;
    }

    @Override // com.google.ads.mediation.testsuite.utils.logging.LogEvent
    public Map<String, String> getParameters() {
        HashMap hashMap = new HashMap();
        if (this.adUnitId != null) {
            hashMap.put("ad_unit", this.adUnitId);
        }
        if (this.requestResult == 5) {
            hashMap.put("request_result", "success");
        } else if (this.requestResult == -1) {
            hashMap.put("request_result", "incomplete");
        } else {
            hashMap.put("request_result", "failed");
            hashMap.put("error_code", new Integer(this.requestResult).toString());
        }
        if (TestSuiteState.sharedInstance().getOriginScreen() != null) {
            hashMap.put("origin_screen", TestSuiteState.sharedInstance().getOriginScreen().name());
        }
        hashMap.put("format", this.format);
        hashMap.put("adapter_class", this.adapterClass);
        return hashMap;
    }
}
