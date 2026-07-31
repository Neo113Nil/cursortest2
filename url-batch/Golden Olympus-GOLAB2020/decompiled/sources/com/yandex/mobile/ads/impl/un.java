package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f33181a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f33182b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f33183c = Charset.forName("UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f33184d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f33185e;

    static {
        Charset.forName("UTF-16BE");
        f33184d = Charset.forName("UTF-16LE");
        f33185e = Charset.forName("UTF-16");
    }
}
