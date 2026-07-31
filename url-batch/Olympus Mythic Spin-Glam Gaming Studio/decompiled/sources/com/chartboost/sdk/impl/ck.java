package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ck {
    public final ll a;
    public final qi b;
    public final Context c;
    public final he d;
    public final y2 e;
    public final Boolean f;
    public final u g;
    public final String h;
    public final String i;
    public final Long j;
    public final Long k;
    public final String l;
    public final String m;
    public final Long n;

    public ck(ll llVar, qi qiVar, Context androidContext, he omManager, y2 identity, Boolean bool, u uVar, String str, String str2, Long l, Long l2, String str3, String str4, Long l3) {
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(omManager, "omManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.a = llVar;
        this.b = qiVar;
        this.c = androidContext;
        this.d = omManager;
        this.e = identity;
        this.f = bool;
        this.g = uVar;
        this.h = str;
        this.i = str2;
        this.j = l;
        this.k = l2;
        this.l = str3;
        this.m = str4;
        this.n = l3;
    }

    public final ck a(ll llVar, qi qiVar, Context androidContext, he omManager, y2 identity, Boolean bool, u uVar, String str, String str2, Long l, Long l2, String str3, String str4, Long l3) {
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(omManager, "omManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        return new ck(llVar, qiVar, androidContext, omManager, identity, bool, uVar, str, str2, l, l2, str3, str4, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return Intrinsics.areEqual(this.a, ckVar.a) && Intrinsics.areEqual(this.b, ckVar.b) && Intrinsics.areEqual(this.c, ckVar.c) && Intrinsics.areEqual(this.d, ckVar.d) && Intrinsics.areEqual(this.e, ckVar.e) && Intrinsics.areEqual(this.f, ckVar.f) && this.g == ckVar.g && Intrinsics.areEqual(this.h, ckVar.h) && Intrinsics.areEqual(this.i, ckVar.i) && Intrinsics.areEqual(this.j, ckVar.j) && Intrinsics.areEqual(this.k, ckVar.k) && Intrinsics.areEqual(this.l, ckVar.l) && Intrinsics.areEqual(this.m, ckVar.m) && Intrinsics.areEqual(this.n, ckVar.n);
    }

    public int hashCode() {
        ll llVar = this.a;
        int hashCode = (llVar == null ? 0 : llVar.hashCode()) * 31;
        qi qiVar = this.b;
        int hashCode2 = (((((((hashCode + (qiVar == null ? 0 : qiVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Boolean bool = this.f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        u uVar = this.g;
        int hashCode4 = (hashCode3 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.j;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.k;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.n;
        return hashCode10 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "VastTrackingParams(viewabilityTracker=" + this.a + ", trackingEvent=" + this.b + ", androidContext=" + this.c + ", omManager=" + this.d + ", identity=" + this.e + ", isInitiallyMuted=" + this.f + ", adFormat=" + this.g + ", clickPos=" + this.h + ", clickType=" + this.i + ", videoDurationMs=" + this.j + ", countdownDurationSeconds=" + this.k + ", playerSize=" + this.l + ", assetUri=" + this.m + ", playheadMs=" + this.n + ")";
    }

    public final ll m() {
        return this.a;
    }

    public final qi k() {
        return this.b;
    }

    public final Context b() {
        return this.c;
    }

    public final he h() {
        return this.d;
    }

    public final y2 g() {
        return this.e;
    }

    public final Boolean n() {
        return this.f;
    }

    public final String d() {
        return this.h;
    }

    public final u a() {
        return this.g;
    }

    public final String e() {
        return this.i;
    }

    public final Long l() {
        return this.j;
    }

    public final Long f() {
        return this.k;
    }

    public final String i() {
        return this.l;
    }

    public final String c() {
        return this.m;
    }

    public final Long j() {
        return this.n;
    }

    public /* synthetic */ ck(ll llVar, qi qiVar, Context context, he heVar, y2 y2Var, Boolean bool, u uVar, String str, String str2, Long l, Long l2, String str3, String str4, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : llVar, (i & 2) != 0 ? null : qiVar, context, heVar, y2Var, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : uVar, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : l3);
    }
}
