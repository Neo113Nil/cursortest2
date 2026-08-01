package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2453a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2454b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f2455c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2456d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2457e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2458f;
    public final List g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2459h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2460i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final tb f2461k;

    public kd(boolean z10, b8.g gVar, v0 v0Var, String str, String str2, b8.g gVar2, b8.g gVar3, boolean z11, boolean z12, boolean z13, tb tbVar) {
        gVar.getClass();
        v0Var.getClass();
        str.getClass();
        str2.getClass();
        gVar2.getClass();
        gVar3.getClass();
        tbVar.getClass();
        this.f2453a = z10;
        this.f2454b = gVar;
        this.f2455c = v0Var;
        this.f2456d = str;
        this.f2457e = str2;
        this.f2458f = gVar2;
        this.g = gVar3;
        this.f2459h = z11;
        this.f2460i = z12;
        this.j = z13;
        this.f2461k = tbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return this.f2453a == kdVar.f2453a && Intrinsics.a(this.f2454b, kdVar.f2454b) && Intrinsics.a(this.f2455c, kdVar.f2455c) && Intrinsics.a(this.f2456d, kdVar.f2456d) && Intrinsics.a(this.f2457e, kdVar.f2457e) && Intrinsics.a(this.f2458f, kdVar.f2458f) && Intrinsics.a(this.g, kdVar.g) && this.f2459h == kdVar.f2459h && this.f2460i == kdVar.f2460i && this.j == kdVar.j && Intrinsics.a(this.f2461k, kdVar.f2461k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2453a), this.f2454b, this.f2455c, this.f2456d, this.f2457e, this.f2458f, this.g, Boolean.valueOf(this.f2459h), Boolean.valueOf(this.f2460i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z10 = this.f2453a;
        int length = String.valueOf(z10).length();
        List list = this.f2454b;
        int length2 = String.valueOf(list).length();
        v0 v0Var = this.f2455c;
        int length3 = String.valueOf(v0Var).length();
        String str = this.f2456d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f2457e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f2458f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z11 = this.f2459h;
        int length8 = String.valueOf(z11).length();
        boolean z12 = this.f2460i;
        int length9 = String.valueOf(z12).length();
        boolean z13 = this.j;
        int length10 = String.valueOf(z13).length();
        tb tbVar = this.f2461k;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(tbVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z10);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(v0Var);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z11);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z12);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z13);
        sb2.append(", clientFlags=");
        sb2.append(tbVar);
        sb2.append(")");
        return sb2.toString();
    }
}
