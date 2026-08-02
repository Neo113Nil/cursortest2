package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f8920a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8921b;

    /* renamed from: c, reason: collision with root package name */
    private Map f8922c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f8923d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f8923d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f8920a;
    }

    public byte[] getResponseData() {
        return this.f8921b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f8922c;
    }

    public boolean isValidResponse() {
        return this.f8923d.isResponseValid(this.f8920a);
    }

    public void setResponseCode(int i3) {
        this.f8920a = i3;
    }

    public void setResponseData(byte[] bArr) {
        this.f8921b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f8922c = map;
    }
}
