package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f21296a;

    /* renamed from: b, reason: collision with root package name */
    private String f21297b;

    /* renamed from: c, reason: collision with root package name */
    private int f21298c;

    /* renamed from: d, reason: collision with root package name */
    private float f21299d;

    /* renamed from: e, reason: collision with root package name */
    private float f21300e;

    /* renamed from: f, reason: collision with root package name */
    private int f21301f;

    /* renamed from: g, reason: collision with root package name */
    private int f21302g;

    /* renamed from: h, reason: collision with root package name */
    private View f21303h;
    private List<d> i;

    /* renamed from: j, reason: collision with root package name */
    private int f21304j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21305k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f21306l;

    /* renamed from: m, reason: collision with root package name */
    private int f21307m;

    /* renamed from: n, reason: collision with root package name */
    private String f21308n;

    /* renamed from: o, reason: collision with root package name */
    private int f21309o;

    /* renamed from: p, reason: collision with root package name */
    private int f21310p;

    /* renamed from: q, reason: collision with root package name */
    private String f21311q;

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f21312a;

        /* renamed from: b, reason: collision with root package name */
        private String f21313b;

        /* renamed from: c, reason: collision with root package name */
        private int f21314c;

        /* renamed from: d, reason: collision with root package name */
        private float f21315d;

        /* renamed from: e, reason: collision with root package name */
        private float f21316e;

        /* renamed from: f, reason: collision with root package name */
        private int f21317f;

        /* renamed from: g, reason: collision with root package name */
        private int f21318g;

        /* renamed from: h, reason: collision with root package name */
        private View f21319h;
        private List<d> i;

        /* renamed from: j, reason: collision with root package name */
        private int f21320j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21321k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f21322l;

        /* renamed from: m, reason: collision with root package name */
        private int f21323m;

        /* renamed from: n, reason: collision with root package name */
        private String f21324n;

        /* renamed from: o, reason: collision with root package name */
        private int f21325o;

        /* renamed from: p, reason: collision with root package name */
        private int f21326p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f21327q;

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(Context context) {
            this.f21312a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(float f6) {
            this.f21316e = f6;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(int i) {
            this.f21318g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b d(int i) {
            this.f21320j = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b e(int i) {
            this.f21323m = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b f(int i) {
            this.f21325o = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b g(int i) {
            this.f21326p = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(String str) {
            this.f21313b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(int i) {
            this.f21317f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(String str) {
            this.f21327q = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(int i) {
            this.f21314c = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(List<String> list) {
            this.f21322l = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(float f6) {
            this.f21315d = f6;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(String str) {
            this.f21324n = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(View view) {
            this.f21319h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(List<d> list) {
            this.i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(boolean z8) {
            this.f21321k = z8;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    public interface b {
        b a(float f6);

        b a(int i);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<d> list);

        b a(boolean z8);

        c a();

        b b(float f6);

        b b(int i);

        b b(String str);

        b b(List<String> list);

        b c(int i);

        b c(String str);

        b d(int i);

        b e(int i);

        b f(int i);

        b g(int i);
    }

    public /* synthetic */ c(a aVar, byte b9) {
        this(aVar);
    }

    private List<String> o() {
        return this.f21306l;
    }

    private int p() {
        return this.f21307m;
    }

    private String q() {
        return this.f21308n;
    }

    private static a r() {
        return new a();
    }

    public final Context a() {
        return this.f21296a;
    }

    public final String b() {
        return this.f21297b;
    }

    public final float c() {
        return this.f21299d;
    }

    public final float d() {
        return this.f21300e;
    }

    public final int e() {
        return this.f21301f;
    }

    public final View f() {
        return this.f21303h;
    }

    public final List<d> g() {
        return this.i;
    }

    public final int h() {
        return this.f21298c;
    }

    public final int i() {
        return this.f21304j;
    }

    public final int j() {
        return this.f21302g;
    }

    public final boolean k() {
        return this.f21305k;
    }

    public final int l() {
        return this.f21309o;
    }

    public final int m() {
        return this.f21310p;
    }

    public final String n() {
        return this.f21311q;
    }

    private c(a aVar) {
        this.f21300e = aVar.f21316e;
        this.f21299d = aVar.f21315d;
        this.f21301f = aVar.f21317f;
        this.f21302g = aVar.f21318g;
        this.f21296a = aVar.f21312a;
        this.f21297b = aVar.f21313b;
        this.f21298c = aVar.f21314c;
        this.f21303h = aVar.f21319h;
        this.i = aVar.i;
        this.f21304j = aVar.f21320j;
        this.f21305k = aVar.f21321k;
        this.f21306l = aVar.f21322l;
        this.f21307m = aVar.f21323m;
        this.f21308n = aVar.f21324n;
    }
}
