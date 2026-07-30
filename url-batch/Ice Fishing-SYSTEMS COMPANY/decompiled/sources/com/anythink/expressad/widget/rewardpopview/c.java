package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: U, reason: collision with root package name */
    private static final String f22741U = "AcquireRewardPopViewParameters";

    /* renamed from: T, reason: collision with root package name */
    public com.anythink.expressad.widget.rewardpopview.a f22760T;

    /* renamed from: a, reason: collision with root package name */
    public String f22761a;

    /* renamed from: b, reason: collision with root package name */
    public String f22762b;

    /* renamed from: c, reason: collision with root package name */
    public int f22763c;

    /* renamed from: g, reason: collision with root package name */
    public String f22767g;

    /* renamed from: h, reason: collision with root package name */
    public String f22768h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f22769j;

    /* renamed from: k, reason: collision with root package name */
    public String f22770k;

    /* renamed from: l, reason: collision with root package name */
    public String f22771l;

    /* renamed from: m, reason: collision with root package name */
    public String f22772m;

    /* renamed from: n, reason: collision with root package name */
    public String f22773n;

    /* renamed from: o, reason: collision with root package name */
    public String f22774o;

    /* renamed from: p, reason: collision with root package name */
    public String f22775p;

    /* renamed from: q, reason: collision with root package name */
    public List<String> f22776q;

    /* renamed from: r, reason: collision with root package name */
    public List<String> f22777r;

    /* renamed from: d, reason: collision with root package name */
    public int f22764d = 5;

    /* renamed from: e, reason: collision with root package name */
    public int f22765e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22766f = true;

    /* renamed from: s, reason: collision with root package name */
    public int f22778s = b.f22719c;

    /* renamed from: t, reason: collision with root package name */
    public int f22779t = b.f22720d;

    /* renamed from: u, reason: collision with root package name */
    public int f22780u = b.f22721e;

    /* renamed from: v, reason: collision with root package name */
    public int f22781v = b.f22722f;

    /* renamed from: w, reason: collision with root package name */
    public int f22782w = b.f22723g;

    /* renamed from: x, reason: collision with root package name */
    public int f22783x = b.f22727l;

    /* renamed from: y, reason: collision with root package name */
    public int f22784y = b.f22724h;

    /* renamed from: z, reason: collision with root package name */
    public int f22785z = b.i;

    /* renamed from: A, reason: collision with root package name */
    public int f22742A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f22743B = b.f22725j;

    /* renamed from: C, reason: collision with root package name */
    public int f22744C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f22745D = -1;

    /* renamed from: E, reason: collision with root package name */
    public int f22746E = b.f22728m;

    /* renamed from: F, reason: collision with root package name */
    public int f22747F = b.f22731p;

    /* renamed from: G, reason: collision with root package name */
    public int f22748G = b.f22732q;

    /* renamed from: H, reason: collision with root package name */
    public int f22749H = b.f22726k;

    /* renamed from: I, reason: collision with root package name */
    public int f22750I = 40;
    public float J = 3.0f;

    /* renamed from: K, reason: collision with root package name */
    public float f22751K = 1.5f;

    /* renamed from: L, reason: collision with root package name */
    public float f22752L = 1.8f;

    /* renamed from: M, reason: collision with root package name */
    public int f22753M = -1;

    /* renamed from: N, reason: collision with root package name */
    public int f22754N = b.f22729n;

    /* renamed from: O, reason: collision with root package name */
    public int f22755O = b.f22730o;

    /* renamed from: P, reason: collision with root package name */
    public int f22756P = 40;

    /* renamed from: Q, reason: collision with root package name */
    public float f22757Q = 3.0f;

    /* renamed from: R, reason: collision with root package name */
    public float f22758R = 1.5f;

    /* renamed from: S, reason: collision with root package name */
    public float f22759S = 1.8f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f22786a;

        public a(String str, String str2, int i, String str3) {
            c cVar = new c();
            this.f22786a = cVar;
            cVar.f22761a = str;
            cVar.f22762b = str2;
            cVar.f22763c = i;
            cVar.f22767g = str3;
            Context g9 = t.b().g();
            this.f22786a.f22768h = g9.getString(k.a(g9, "anythink_default_question_title_text", k.f19794g));
            this.f22786a.i = g9.getString(k.a(g9, "anythink_question_tip_text", k.f19794g));
            this.f22786a.f22769j = g9.getString(k.a(g9, "anythink_success_title_text", k.f19794g));
            this.f22786a.f22770k = g9.getString(k.a(g9, "anythink_success_tip_text", k.f19794g));
            this.f22786a.f22771l = g9.getString(k.a(g9, "anythink_fail_title_text", k.f19794g));
            this.f22786a.f22772m = g9.getString(k.a(g9, "anythink_fail_tip_text", k.f19794g));
            this.f22786a.f22773n = g9.getString(k.a(g9, "anythink_slide_title_text", k.f19794g));
            this.f22786a.f22774o = g9.getString(k.a(g9, "anythink_slide_tip_text", k.f19794g));
            this.f22786a.f22775p = g9.getString(k.a(g9, "anythink_slide_success_text", k.f19794g));
            String[] stringArray = g9.getResources().getStringArray(k.a(g9, "anythink_random_answers", "array"));
            this.f22786a.f22777r = Arrays.asList(stringArray);
        }

        private void b() {
            Context g9 = t.b().g();
            this.f22786a.f22768h = g9.getString(k.a(g9, "anythink_default_question_title_text", k.f19794g));
            this.f22786a.i = g9.getString(k.a(g9, "anythink_question_tip_text", k.f19794g));
            this.f22786a.f22769j = g9.getString(k.a(g9, "anythink_success_title_text", k.f19794g));
            this.f22786a.f22770k = g9.getString(k.a(g9, "anythink_success_tip_text", k.f19794g));
            this.f22786a.f22771l = g9.getString(k.a(g9, "anythink_fail_title_text", k.f19794g));
            this.f22786a.f22772m = g9.getString(k.a(g9, "anythink_fail_tip_text", k.f19794g));
            this.f22786a.f22773n = g9.getString(k.a(g9, "anythink_slide_title_text", k.f19794g));
            this.f22786a.f22774o = g9.getString(k.a(g9, "anythink_slide_tip_text", k.f19794g));
            this.f22786a.f22775p = g9.getString(k.a(g9, "anythink_slide_success_text", k.f19794g));
            String[] stringArray = g9.getResources().getStringArray(k.a(g9, "anythink_random_answers", "array"));
            this.f22786a.f22777r = Arrays.asList(stringArray);
        }

        private a c(String str) {
            this.f22786a.f22769j = str;
            return this;
        }

        private a d(String str) {
            this.f22786a.f22770k = str;
            return this;
        }

        private a e(String str) {
            this.f22786a.f22771l = str;
            return this;
        }

        private a f(String str) {
            this.f22786a.f22772m = str;
            return this;
        }

        private a g(String str) {
            this.f22786a.f22773n = str;
            return this;
        }

        private a h(String str) {
            this.f22786a.f22774o = str;
            return this;
        }

        private a i(String str) {
            this.f22786a.f22775p = str;
            return this;
        }

        private a j(int i) {
            this.f22786a.f22785z = i;
            return this;
        }

        private a k(int i) {
            this.f22786a.f22742A = i;
            return this;
        }

        private a l(int i) {
            this.f22786a.f22743B = i;
            return this;
        }

        private a m(int i) {
            this.f22786a.f22744C = i;
            return this;
        }

        private a n(int i) {
            this.f22786a.f22745D = i;
            return this;
        }

        private a o(int i) {
            this.f22786a.f22746E = i;
            return this;
        }

        private a p(int i) {
            this.f22786a.f22747F = i;
            return this;
        }

        private a q(int i) {
            this.f22786a.f22748G = i;
            return this;
        }

        private a r(int i) {
            this.f22786a.f22749H = i;
            return this;
        }

        private a s(int i) {
            this.f22786a.f22750I = i;
            return this;
        }

        private a t(int i) {
            this.f22786a.f22753M = i;
            return this;
        }

        private a u(int i) {
            this.f22786a.f22754N = i;
            return this;
        }

        private a v(int i) {
            this.f22786a.f22755O = i;
            return this;
        }

        private a w(int i) {
            this.f22786a.f22756P = i;
            return this;
        }

        public final a a(int i) {
            this.f22786a.f22764d = i;
            return this;
        }

        private a a(boolean z8) {
            this.f22786a.f22766f = z8;
            return this;
        }

        private a c(int i) {
            this.f22786a.f22778s = i;
            return this;
        }

        private a d(int i) {
            this.f22786a.f22779t = i;
            return this;
        }

        private a e(int i) {
            this.f22786a.f22780u = i;
            return this;
        }

        private a f(int i) {
            this.f22786a.f22781v = i;
            return this;
        }

        private a g(int i) {
            this.f22786a.f22782w = i;
            return this;
        }

        private a h(int i) {
            this.f22786a.f22783x = i;
            return this;
        }

        private a i(int i) {
            this.f22786a.f22784y = i;
            return this;
        }

        private a a(String str) {
            this.f22786a.f22768h = str;
            return this;
        }

        private a c(float f6) {
            this.f22786a.f22752L = f6;
            return this;
        }

        private a d(float f6) {
            this.f22786a.f22757Q = f6;
            return this;
        }

        private a e(float f6) {
            this.f22786a.f22758R = f6;
            return this;
        }

        private a f(float f6) {
            this.f22786a.f22759S = f6;
            return this;
        }

        public final a a(ArrayList<String> arrayList) {
            this.f22786a.f22776q = arrayList;
            return this;
        }

        private a a(float f6) {
            this.f22786a.J = f6;
            return this;
        }

        public final a a(com.anythink.expressad.widget.rewardpopview.a aVar) {
            this.f22786a.f22760T = aVar;
            return this;
        }

        public final c a() {
            return this.f22786a;
        }

        public final a b(int i) {
            this.f22786a.f22765e = i;
            return this;
        }

        private a b(String str) {
            this.f22786a.i = str;
            return this;
        }

        private a b(ArrayList<String> arrayList) {
            this.f22786a.f22777r = arrayList;
            return this;
        }

        private a b(float f6) {
            this.f22786a.f22751K = f6;
            return this;
        }
    }

    private static a a(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i == 0) {
            i = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new a(str, str2, i, str3);
    }
}
