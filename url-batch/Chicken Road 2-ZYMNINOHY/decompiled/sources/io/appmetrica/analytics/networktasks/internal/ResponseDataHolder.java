package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f13339a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f13340b;

    /* renamed from: c, reason: collision with root package name */
    private Map f13341c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f13342d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f13342d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f13339a;
    }

    public byte[] getResponseData() {
        return this.f13340b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f13341c;
    }

    public boolean isValidResponse() {
        return this.f13342d.isResponseValid(this.f13339a);
    }

    public void setResponseCode(int i4) {
        this.f13339a = i4;
    }

    public void setResponseData(byte[] bArr) {
        this.f13340b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f13341c = map;
    }
}
