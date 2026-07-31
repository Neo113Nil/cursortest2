package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ih2 implements bq0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ih2 f27201c;

    /* renamed from: d, reason: collision with root package name */
    public static final ih2 f27202d;

    /* renamed from: e, reason: collision with root package name */
    public static final ih2 f27203e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ih2[] f27204f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27205b;

    static {
        ih2 ih2Var = new ih2(0, "DEFAULT", "default");
        f27201c = ih2Var;
        ih2 ih2Var2 = new ih2(1, "LOADING", "loading");
        f27202d = ih2Var2;
        ih2 ih2Var3 = new ih2(2, "HIDDEN", "hidden");
        f27203e = ih2Var3;
        ih2[] ih2VarArr = {ih2Var, ih2Var2, ih2Var3};
        f27204f = ih2VarArr;
        AbstractC1372b.a(ih2VarArr);
    }

    private ih2(int i4, String str, String str2) {
        this.f27205b = str2;
    }

    public static ih2 valueOf(String str) {
        return (ih2) Enum.valueOf(ih2.class, str);
    }

    public static ih2[] values() {
        return (ih2[]) f27204f.clone();
    }

    @Override // com.yandex.mobile.ads.impl.bq0
    @NotNull
    public final String a() {
        String quote = JSONObject.quote(this.f27205b);
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        return C2284v0.a(new Object[]{quote}, 1, "state: %s", "format(...)");
    }
}
