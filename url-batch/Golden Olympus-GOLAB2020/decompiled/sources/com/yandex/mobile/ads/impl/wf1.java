package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public class wf1 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34029b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34030c;

    protected wf1(String str, Exception exc, boolean z4, int i4) {
        super(str, exc);
        this.f34029b = z4;
        this.f34030c = i4;
    }

    public static wf1 a(String str, IllegalArgumentException illegalArgumentException) {
        return new wf1(str, illegalArgumentException, true, 0);
    }

    public static wf1 a(String str, Exception exc) {
        return new wf1(str, exc, true, 1);
    }

    public static wf1 a(String str) {
        return new wf1(str, null, false, 1);
    }
}
