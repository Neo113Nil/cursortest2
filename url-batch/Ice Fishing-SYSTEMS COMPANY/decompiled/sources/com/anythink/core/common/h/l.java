package com.anythink.core.common.h;

import com.anythink.core.common.e.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14134a = 10;

    /* renamed from: b, reason: collision with root package name */
    private int f14135b;

    /* renamed from: c, reason: collision with root package name */
    private int f14136c;

    /* renamed from: d, reason: collision with root package name */
    private int f14137d;

    /* renamed from: e, reason: collision with root package name */
    private long f14138e;

    /* renamed from: f, reason: collision with root package name */
    private int f14139f;

    /* renamed from: g, reason: collision with root package name */
    private int f14140g;

    /* renamed from: h, reason: collision with root package name */
    private long f14141h;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14142a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14143b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14144c = 3;
    }

    private l() {
    }

    public static l a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        long optLong = jSONObject.optLong("req_pacing");
        if (optLong <= 0) {
            return null;
        }
        l lVar = new l();
        int optInt = jSONObject.optInt("id");
        if (optInt == 1) {
            lVar.f14136c = jSONObject.optInt("req_no_fill_nc");
        } else if (optInt == 2) {
            lVar.f14137d = jSONObject.optInt("req_no_fill_s");
            lVar.f14138e = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (optInt != 3) {
                return null;
            }
            lVar.f14139f = jSONObject.optInt("req_no_fill_sr");
            lVar.f14138e = jSONObject.optLong("req_no_fill_sgt");
            lVar.f14140g = jSONObject.optInt(a.C0076a.f13072n, 10);
        }
        lVar.f14135b = optInt;
        lVar.f14141h = optLong;
        if (lVar.f14136c > 0 || lVar.f14137d > 0 || lVar.f14138e > 0 || lVar.f14139f > 0 || optLong > 0) {
            return lVar;
        }
        return null;
    }

    public final int b() {
        return this.f14136c;
    }

    public final int c() {
        return this.f14137d;
    }

    public final long d() {
        return this.f14138e;
    }

    public final int e() {
        return this.f14139f;
    }

    public final long f() {
        return this.f14141h;
    }

    public final int g() {
        return this.f14140g;
    }

    public final String toString() {
        return "AdSourceFltRuleEntity{id=" + this.f14135b + ", reqNoFillNc=" + this.f14136c + ", reqNoFillS=" + this.f14137d + ", reqNoFillSgtTime=" + this.f14138e + ", reqNoFillSr=" + this.f14139f + ", reqPacingTime=" + this.f14141h + '}';
    }

    private void b(int i) {
        this.f14136c = i;
    }

    private void c(int i) {
        this.f14137d = i;
    }

    private void d(int i) {
        this.f14139f = i;
    }

    private void e(int i) {
        this.f14140g = i;
    }

    private void b(long j9) {
        this.f14141h = j9;
    }

    public final int a() {
        return this.f14135b;
    }

    private void a(int i) {
        this.f14135b = i;
    }

    private void a(long j9) {
        this.f14138e = j9;
    }
}
