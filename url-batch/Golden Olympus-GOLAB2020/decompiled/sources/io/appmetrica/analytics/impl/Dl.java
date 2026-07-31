package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Dl {

    /* renamed from: a, reason: collision with root package name */
    public final String f37377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37378b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f37379c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37380d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37381e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f37382f;

    public Dl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f37377a = str;
        this.f37378b = str2;
        this.f37379c = num;
        this.f37380d = num2;
        this.f37381e = str3;
        this.f37382f = bool;
    }

    public Dl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
