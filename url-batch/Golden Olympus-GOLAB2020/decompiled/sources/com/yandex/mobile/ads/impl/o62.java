package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o62 {

    /* renamed from: b, reason: collision with root package name */
    public static final o62 f29917b;

    /* renamed from: c, reason: collision with root package name */
    public static final o62 f29918c;

    /* renamed from: d, reason: collision with root package name */
    public static final o62 f29919d;

    /* renamed from: e, reason: collision with root package name */
    public static final o62 f29920e;

    /* renamed from: f, reason: collision with root package name */
    public static final o62 f29921f;

    /* renamed from: g, reason: collision with root package name */
    public static final o62 f29922g;

    /* renamed from: h, reason: collision with root package name */
    public static final o62 f29923h;

    /* renamed from: i, reason: collision with root package name */
    public static final o62 f29924i;

    /* renamed from: j, reason: collision with root package name */
    public static final o62 f29925j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ o62[] f29926k;

    static {
        o62 o62Var = new o62(0, "ADTUNE_CLICK");
        f29917b = o62Var;
        o62 o62Var2 = new o62(1, "ADTUNE_ITEM_CLICK");
        f29918c = o62Var2;
        o62 o62Var3 = new o62(2, "CLICK");
        f29919d = o62Var3;
        o62 o62Var4 = new o62(3, "FALSE_CLICK");
        f29920e = o62Var4;
        o62 o62Var5 = new o62(4, "MEDIATION_IMPRESSION");
        f29921f = o62Var5;
        o62 o62Var6 = new o62(5, "MEDIATION_RESPONSE");
        f29922g = o62Var6;
        o62 o62Var7 = new o62(6, "MRC_IMPRESSION");
        f29923h = o62Var7;
        o62 o62Var8 = new o62(7, "RENDER");
        f29924i = o62Var8;
        o62 o62Var9 = new o62(8, "SERVER_SIDE_REWARD");
        f29925j = o62Var9;
        o62[] o62VarArr = {o62Var, o62Var2, o62Var3, o62Var4, o62Var5, o62Var6, o62Var7, o62Var8, o62Var9, new o62(9, GrsBaseInfo.CountryCodeSource.UNKNOWN)};
        f29926k = o62VarArr;
        AbstractC1372b.a(o62VarArr);
    }

    private o62(int i4, String str) {
    }

    public static o62 valueOf(String str) {
        return (o62) Enum.valueOf(o62.class, str);
    }

    public static o62[] values() {
        return (o62[]) f29926k.clone();
    }
}
