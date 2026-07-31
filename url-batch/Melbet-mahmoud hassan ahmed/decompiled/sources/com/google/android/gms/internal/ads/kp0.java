package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* loaded from: classes.dex */
public class kp0 {

    /* renamed from: a, reason: collision with root package name */
    private int f7569a;

    /* renamed from: b, reason: collision with root package name */
    private int f7570b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7571c;

    /* renamed from: d, reason: collision with root package name */
    private final e73<String> f7572d;

    /* renamed from: e, reason: collision with root package name */
    private final e73<String> f7573e;

    /* renamed from: f, reason: collision with root package name */
    private final e73<String> f7574f;

    /* renamed from: g, reason: collision with root package name */
    private e73<String> f7575g;

    /* renamed from: h, reason: collision with root package name */
    private int f7576h;

    /* renamed from: i, reason: collision with root package name */
    private final i73<gk0, mr0> f7577i;

    /* renamed from: j, reason: collision with root package name */
    private final p73<Integer> f7578j;

    @Deprecated
    public kp0() {
        this.f7569a = Integer.MAX_VALUE;
        this.f7570b = Integer.MAX_VALUE;
        this.f7571c = true;
        this.f7572d = e73.w();
        this.f7573e = e73.w();
        this.f7574f = e73.w();
        this.f7575g = e73.w();
        this.f7576h = 0;
        this.f7577i = i73.d();
        this.f7578j = p73.t();
    }

    protected kp0(ns0 ns0Var) {
        this.f7569a = ns0Var.f9284i;
        this.f7570b = ns0Var.f9285j;
        this.f7571c = ns0Var.f9286k;
        this.f7572d = ns0Var.f9287l;
        this.f7573e = ns0Var.f9288m;
        this.f7574f = ns0Var.f9292q;
        this.f7575g = ns0Var.f9293r;
        this.f7576h = ns0Var.f9294s;
        this.f7577i = ns0Var.f9298w;
        this.f7578j = ns0Var.f9299x;
    }

    public final kp0 d(Context context) {
        CaptioningManager captioningManager;
        int i7 = n13.f8865a;
        if (i7 >= 19 && ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f7576h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f7575g = e73.x(n13.i(locale));
            }
        }
        return this;
    }

    public kp0 e(int i7, int i8, boolean z6) {
        this.f7569a = i7;
        this.f7570b = i8;
        this.f7571c = true;
        return this;
    }
}
