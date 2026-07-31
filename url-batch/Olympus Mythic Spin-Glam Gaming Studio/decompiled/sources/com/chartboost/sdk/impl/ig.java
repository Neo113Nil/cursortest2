package com.chartboost.sdk.impl;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ig {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final JSONObject m;
    public final String n;
    public final String o;
    public final Integer p;
    public final y3 q;
    public final cf r;
    public final ah s;
    public final s9 t;
    public final pf u;
    public final wh v;
    public final i5 w;
    public final l6 x;
    public final lc y;

    public ig(String str, String str2, s9 s9Var, pf pfVar, y3 y3Var, ah ahVar, wh whVar, cf cfVar, i5 i5Var, l6 l6Var, lc lcVar) {
        String str3;
        this.t = s9Var;
        this.u = pfVar;
        this.q = y3Var;
        this.s = ahVar;
        this.v = whVar;
        this.r = cfVar;
        this.h = str;
        this.i = str2;
        this.w = i5Var;
        this.x = l6Var;
        this.y = lcVar;
        String str4 = Build.PRODUCT;
        if (!"sdk".equals(str4) && !"google_sdk".equals(str4) && ((str3 = Build.MANUFACTURER) == null || !str3.contains("Genymotion"))) {
            this.a = Build.MODEL;
        } else {
            this.a = "Android Simulator";
        }
        String str5 = Build.MANUFACTURER;
        this.k = str5 == null ? "unknown" : str5;
        this.j = str5 + " " + Build.MODEL;
        this.l = l6Var.b();
        this.b = "Android " + Build.VERSION.RELEASE;
        this.c = Locale.getDefault().getCountry();
        this.d = Locale.getDefault().getLanguage();
        this.g = "9.12.1";
        this.e = l6Var.i();
        this.f = l6Var.g();
        this.n = b(y3Var);
        this.m = a(y3Var);
        this.o = p3.a();
        this.p = pfVar.a();
    }

    public cf f() {
        return this.r;
    }

    public s9 c() {
        return this.t;
    }

    public pf g() {
        return this.u;
    }

    public final String b(y3 y3Var) {
        if (y3Var != null) {
            return y3Var.d();
        }
        return "";
    }

    public final JSONObject a(y3 y3Var) {
        if (y3Var != null) {
            return a(y3Var, new a4());
        }
        return new JSONObject();
    }

    public ah h() {
        return this.s;
    }

    public wh j() {
        return this.v;
    }

    public int i() {
        ah ahVar = this.s;
        if (ahVar != null) {
            return ahVar.f();
        }
        return -1;
    }

    public Integer e() {
        return Integer.valueOf(this.x.f());
    }

    public lc d() {
        return this.y;
    }

    public l6 b() {
        return this.x;
    }

    public i5 a() {
        return this.w;
    }

    public JSONObject a(y3 y3Var, a4 a4Var) {
        if (a4Var != null) {
            return a4Var.a(y3Var);
        }
        return new JSONObject();
    }
}
