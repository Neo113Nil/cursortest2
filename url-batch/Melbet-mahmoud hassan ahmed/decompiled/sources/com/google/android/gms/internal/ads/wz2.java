package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wz2 {

    /* renamed from: a, reason: collision with root package name */
    private final dz2 f13974a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f13975b;

    public wz2(dz2 dz2Var, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f13975b = arrayList;
        this.f13974a = dz2Var;
        arrayList.add(str);
    }

    public final dz2 a() {
        return this.f13974a;
    }

    public final ArrayList<String> b() {
        return this.f13975b;
    }

    public final void c(String str) {
        this.f13975b.add(str);
    }
}
