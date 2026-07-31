package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ed2 {

    /* renamed from: b, reason: collision with root package name */
    public static final ed2 f25238b;

    /* renamed from: c, reason: collision with root package name */
    public static final ed2 f25239c;

    /* renamed from: d, reason: collision with root package name */
    public static final ed2 f25240d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed2 f25241e;

    /* renamed from: f, reason: collision with root package name */
    public static final ed2 f25242f;

    /* renamed from: g, reason: collision with root package name */
    public static final ed2 f25243g;

    /* renamed from: h, reason: collision with root package name */
    public static final ed2 f25244h;

    /* renamed from: i, reason: collision with root package name */
    public static final ed2 f25245i;

    /* renamed from: j, reason: collision with root package name */
    public static final ed2 f25246j;

    /* renamed from: k, reason: collision with root package name */
    public static final ed2 f25247k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ ed2[] f25248l;

    static {
        ed2 ed2Var = new ed2(0, "INITIAL");
        f25238b = ed2Var;
        ed2 ed2Var2 = new ed2(1, "PREPARING");
        f25239c = ed2Var2;
        ed2 ed2Var3 = new ed2(2, "PREPARED");
        f25240d = ed2Var3;
        ed2 ed2Var4 = new ed2(3, "PLAYING");
        f25241e = ed2Var4;
        ed2 ed2Var5 = new ed2(4, "STOPPED");
        f25242f = ed2Var5;
        ed2 ed2Var6 = new ed2(5, "FINISHED");
        f25243g = ed2Var6;
        ed2 ed2Var7 = new ed2(6, "PAUSED");
        f25244h = ed2Var7;
        ed2 ed2Var8 = new ed2(7, "BUFFERING");
        f25245i = ed2Var8;
        ed2 ed2Var9 = new ed2(8, "PLAYING_ERROR");
        f25246j = ed2Var9;
        ed2 ed2Var10 = new ed2(9, "PREPARING_ERROR");
        f25247k = ed2Var10;
        ed2[] ed2VarArr = {ed2Var, ed2Var2, ed2Var3, ed2Var4, ed2Var5, ed2Var6, ed2Var7, ed2Var8, ed2Var9, ed2Var10};
        f25248l = ed2VarArr;
        AbstractC1372b.a(ed2VarArr);
    }

    private ed2(int i4, String str) {
    }

    public static ed2 valueOf(String str) {
        return (ed2) Enum.valueOf(ed2.class, str);
    }

    public static ed2[] values() {
        return (ed2[]) f25248l.clone();
    }
}
