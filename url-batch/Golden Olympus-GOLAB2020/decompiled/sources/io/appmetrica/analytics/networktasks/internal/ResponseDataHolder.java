package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f40628a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f40629b;

    /* renamed from: c, reason: collision with root package name */
    private Map f40630c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f40631d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f40631d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f40628a;
    }

    public byte[] getResponseData() {
        return this.f40629b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f40630c;
    }

    public boolean isValidResponse() {
        return this.f40631d.isResponseValid(this.f40628a);
    }

    public void setResponseCode(int i4) {
        this.f40628a = i4;
    }

    public void setResponseData(byte[] bArr) {
        this.f40629b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f40630c = map;
    }
}
