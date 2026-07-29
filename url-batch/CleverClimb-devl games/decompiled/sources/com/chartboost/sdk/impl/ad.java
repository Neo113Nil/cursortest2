package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ad<T> {

    /* renamed from: b, reason: collision with root package name */
    public final String f3699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3701d;
    public final File f;
    public final AtomicInteger e = new AtomicInteger();
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public int j = 0;

    public void a(CBError cBError, ag agVar) {
    }

    public void a(T t, ag agVar) {
    }

    public ad(String str, String str2, int i, File file) {
        this.f3699b = str;
        this.f3700c = str2;
        this.f3701d = i;
        this.f = file;
    }

    public ae a() {
        return new ae(null, null, null);
    }

    public af<T> a(ag agVar) {
        return af.a((Object) null);
    }

    public boolean b() {
        return this.e.compareAndSet(0, -1);
    }
}
