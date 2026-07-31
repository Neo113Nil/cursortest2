package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6528b;

    /* renamed from: c, reason: collision with root package name */
    public final List<h4> f6529c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6530d;

    public i4(int i7, String str, List<h4> list, byte[] bArr) {
        this.f6527a = i7;
        this.f6528b = str;
        this.f6529c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f6530d = bArr;
    }
}
