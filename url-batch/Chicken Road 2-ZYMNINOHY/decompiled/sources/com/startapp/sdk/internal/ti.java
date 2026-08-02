package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ti {

    /* renamed from: a, reason: collision with root package name */
    public final int f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7628b;

    /* renamed from: c, reason: collision with root package name */
    public final cj f7629c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7630d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7631e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7632f;

    public ti(int i4, int i5, cj cjVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f7627a = i4;
        this.f7628b = i5;
        this.f7629c = cjVar;
        this.f7630d = str;
        this.f7631e = arrayList;
        this.f7632f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ti.class == obj.getClass()) {
            ti tiVar = (ti) obj;
            if (this.f7627a == tiVar.f7627a && this.f7628b == tiVar.f7628b) {
                cj cjVar = this.f7629c;
                cj cjVar2 = tiVar.f7629c;
                WeakHashMap weakHashMap = si.f7575a;
                if (cjVar.equals(cjVar2) && si.a((Object) this.f7630d, (Object) tiVar.f7630d) && this.f7631e.equals(tiVar.f7631e) && this.f7632f.equals(tiVar.f7632f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f7627a), Integer.valueOf(this.f7628b), this.f7629c, this.f7630d, this.f7631e, this.f7632f};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
