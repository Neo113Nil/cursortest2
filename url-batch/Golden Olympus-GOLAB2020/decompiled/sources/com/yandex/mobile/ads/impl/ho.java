package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.ironsource.b9;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ho {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f26863c;

    /* renamed from: d, reason: collision with root package name */
    public static final ho f26864d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ho[] f26865e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26866b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        ho hoVar = new ho(0, "BROWSER", "browser");
        ho hoVar2 = new ho(1, "WEBVIEW", b9.h.f15449K);
        f26864d = hoVar2;
        ho[] hoVarArr = {hoVar, hoVar2};
        f26865e = hoVarArr;
        AbstractC1372b.a(hoVarArr);
        f26863c = new a(0);
    }

    private ho(int i4, String str, String str2) {
        this.f26866b = str2;
    }

    public static ho valueOf(String str) {
        return (ho) Enum.valueOf(ho.class, str);
    }

    public static ho[] values() {
        return (ho[]) f26865e.clone();
    }

    @NotNull
    public final String a() {
        return this.f26866b;
    }
}
