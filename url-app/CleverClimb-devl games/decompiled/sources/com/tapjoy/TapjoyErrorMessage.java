package com.tapjoy;

/* loaded from: classes2.dex */
public class TapjoyErrorMessage {

    /* renamed from: a, reason: collision with root package name */
    private ErrorType f7776a;

    /* renamed from: b, reason: collision with root package name */
    private String f7777b;

    public enum ErrorType {
        INTERNAL_ERROR,
        SDK_ERROR,
        SERVER_ERROR,
        INTEGRATION_ERROR,
        NETWORK_ERROR
    }

    public TapjoyErrorMessage(ErrorType errorType, String str) {
        this.f7776a = errorType;
        this.f7777b = str;
    }

    public ErrorType getType() {
        return this.f7776a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type=" + this.f7776a.toString());
        sb.append(";Message=" + this.f7777b);
        return sb.toString();
    }
}
