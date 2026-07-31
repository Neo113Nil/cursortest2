package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class hh0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f26744a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ze0> f26745b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26746c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f26747d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f26748e;

    public hh0(int i4, ArrayList arrayList, int i5, InputStream inputStream) {
        this.f26744a = i4;
        this.f26745b = arrayList;
        this.f26746c = i5;
        this.f26747d = inputStream;
        this.f26748e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f26747d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f26748e != null) {
            return new ByteArrayInputStream(this.f26748e);
        }
        return null;
    }

    public final byte[] b() {
        return this.f26748e;
    }

    public final int c() {
        return this.f26746c;
    }

    public final List<ze0> d() {
        return Collections.unmodifiableList(this.f26745b);
    }

    public final int e() {
        return this.f26744a;
    }

    public hh0(int i4, List<ze0> list, byte[] bArr) {
        this.f26744a = i4;
        this.f26745b = list;
        this.f26746c = bArr.length;
        this.f26748e = bArr;
        this.f26747d = null;
    }
}
