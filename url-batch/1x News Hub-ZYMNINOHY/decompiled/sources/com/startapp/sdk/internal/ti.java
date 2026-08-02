package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ti {

    /* renamed from: a, reason: collision with root package name */
    public final int f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4490b;

    /* renamed from: c, reason: collision with root package name */
    public final cj f4491c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4492d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4493e;
    public final ArrayList f;

    public ti(int i3, int i4, cj cjVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f4489a = i3;
        this.f4490b = i4;
        this.f4491c = cjVar;
        this.f4492d = str;
        this.f4493e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ti.class == obj.getClass()) {
            ti tiVar = (ti) obj;
            if (this.f4489a == tiVar.f4489a && this.f4490b == tiVar.f4490b) {
                cj cjVar = this.f4491c;
                cj cjVar2 = tiVar.f4491c;
                WeakHashMap weakHashMap = si.f4438a;
                if (cjVar.equals(cjVar2) && si.a((Object) this.f4492d, (Object) tiVar.f4492d) && this.f4493e.equals(tiVar.f4493e) && this.f.equals(tiVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f4489a), Integer.valueOf(this.f4490b), this.f4491c, this.f4492d, this.f4493e, this.f};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
