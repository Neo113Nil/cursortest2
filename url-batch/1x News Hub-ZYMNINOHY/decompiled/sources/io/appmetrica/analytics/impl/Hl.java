package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final String f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6096b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6097c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f6098d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6099e;
    public final Boolean f;

    public Hl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f6095a = str;
        this.f6096b = str2;
        this.f6097c = num;
        this.f6098d = num2;
        this.f6099e = str3;
        this.f = bool;
    }

    public Hl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
