package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f14967a;

    /* renamed from: b, reason: collision with root package name */
    private final List<s5> f14968b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14969c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f14970d;

    public z6(int i7, List<s5> list, int i8, InputStream inputStream) {
        this.f14967a = i7;
        this.f14968b = list;
        this.f14969c = i8;
        this.f14970d = inputStream;
    }

    public final int a() {
        return this.f14969c;
    }

    public final int b() {
        return this.f14967a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f14970d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List<s5> d() {
        return Collections.unmodifiableList(this.f14968b);
    }
}
