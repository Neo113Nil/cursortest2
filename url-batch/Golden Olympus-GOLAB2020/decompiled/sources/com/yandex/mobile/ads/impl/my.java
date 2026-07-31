package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class my {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f29299b;

    /* renamed from: c, reason: collision with root package name */
    public static final my f29300c;

    /* renamed from: d, reason: collision with root package name */
    public static final my f29301d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ my[] f29302e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f29303f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        my myVar = new my(0, "DEFAULT");
        f29300c = myVar;
        my myVar2 = new my(1, "RESULT");
        f29301d = myVar2;
        my[] myVarArr = {myVar, myVar2};
        f29302e = myVarArr;
        f29303f = AbstractC1372b.a(myVarArr);
        f29299b = new a(0);
    }

    private my(int i4, String str) {
    }

    @NotNull
    public static InterfaceC1371a a() {
        return f29303f;
    }

    public static my valueOf(String str) {
        return (my) Enum.valueOf(my.class, str);
    }

    public static my[] values() {
        return (my[]) f29302e.clone();
    }
}
