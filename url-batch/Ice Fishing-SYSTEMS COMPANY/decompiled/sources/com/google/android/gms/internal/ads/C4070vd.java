package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import w2.InterfaceC5156d;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4070vd implements InterfaceC5156d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f34812a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34814c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34815d;

    public C4070vd(HashSet hashSet, boolean z8, int i, boolean z9) {
        this.f34812a = hashSet;
        this.f34813b = z8;
        this.f34814c = i;
        this.f34815d = z9;
    }

    @Override // w2.InterfaceC5156d
    public final int a() {
        return this.f34814c;
    }

    @Override // w2.InterfaceC5156d
    public final boolean b() {
        return this.f34815d;
    }

    @Override // w2.InterfaceC5156d
    public final boolean c() {
        return this.f34813b;
    }

    @Override // w2.InterfaceC5156d
    public final Set d() {
        return this.f34812a;
    }
}
