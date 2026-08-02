package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dl {

    /* renamed from: a, reason: collision with root package name */
    public final String f10218a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10219b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10220c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10221d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10222e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f10223f;

    public Dl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f10218a = str;
        this.f10219b = str2;
        this.f10220c = num;
        this.f10221d = num2;
        this.f10222e = str3;
        this.f10223f = bool;
    }

    public Dl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
