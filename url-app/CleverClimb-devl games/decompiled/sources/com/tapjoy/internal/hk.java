package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hk {
    public final o A;
    public final h B;
    final h C;
    final o D;

    /* renamed from: a, reason: collision with root package name */
    final Context f8286a;

    /* renamed from: b, reason: collision with root package name */
    final SharedPreferences f8287b;

    /* renamed from: c, reason: collision with root package name */
    final o f8288c;

    /* renamed from: d, reason: collision with root package name */
    final o f8289d;
    final k e;
    final k f;
    final o g;
    final k h;
    final l i;
    final l j;
    final l k;
    final o l;
    final k m;
    final i n;
    final l o;
    final i p;
    final o q;
    final o r;
    final k s;
    final k t;
    final o u;
    final o v;
    final o w;
    final o x;
    final o y;
    final o z;

    public static hk a(Context context) {
        return new hk(context);
    }

    private hk(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f8286a = applicationContext;
        this.f8287b = applicationContext.getSharedPreferences("fiverocks", 0);
        this.f8288c = new o(this.f8287b, TapjoyConstants.TJC_SDK_PLACEMENT);
        this.f8289d = new o(this.f8287b, "ir");
        this.e = new k(this.f8287b, "fql", 0);
        this.f = new k(this.f8287b, "fq", 0);
        this.g = new o(this.f8287b, "push");
        this.h = new k(this.f8287b, "ss", 0);
        this.i = new l(this.f8287b, "std");
        this.j = new l(this.f8287b, "slt");
        this.k = new l(this.f8287b, "sld");
        this.l = new o(this.f8287b, "ptc");
        this.m = new k(this.f8287b, "pc", 0);
        this.n = new i(this.f8287b, "ptp");
        this.o = new l(this.f8287b, "lpt");
        this.p = new i(this.f8287b, "plp");
        this.q = new o(this.f8287b, "adv");
        this.r = new o(this.f8287b, "ui");
        this.s = new k(this.f8287b, "ul", -1);
        this.t = new k(this.f8287b, "uf", -1);
        this.u = new o(this.f8287b, TapjoyConstants.TJC_USER_VARIABLE_1);
        this.v = new o(this.f8287b, TapjoyConstants.TJC_USER_VARIABLE_2);
        this.w = new o(this.f8287b, TapjoyConstants.TJC_USER_VARIABLE_3);
        this.x = new o(this.f8287b, TapjoyConstants.TJC_USER_VARIABLE_4);
        this.y = new o(this.f8287b, TapjoyConstants.TJC_USER_VARIABLE_5);
        this.z = new o(this.f8287b, "utags");
        this.A = new o(this.f8287b, "idfa");
        this.B = new h(this.f8287b, "idfa.optout");
        this.C = new h(this.f8287b, "push.optout");
        this.D = new o(this.f8287b, "appId");
    }

    final SharedPreferences.Editor a() {
        return this.f8287b.edit();
    }

    public final String b() {
        String string = this.f8287b.getString("ir", null);
        if (string != null) {
            if (string.length() > 0) {
                return string;
            }
            return null;
        }
        File file = new File(ha.c(this.f8286a), TapjoyConstants.TJC_REFERRER);
        if (file.exists()) {
            try {
                string = bg.a(file, ak.f7827c);
            } catch (IOException unused) {
            }
        }
        this.f8287b.edit().putString("ir", string != null ? string : "").apply();
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public final void a(boolean z) {
        n.a(this.f8287b, "gcm.onServer", z);
    }
}
