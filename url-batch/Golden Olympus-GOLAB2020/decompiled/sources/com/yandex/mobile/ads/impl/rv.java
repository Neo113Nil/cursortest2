package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class rv {

    /* renamed from: c, reason: collision with root package name */
    public static final rv f31371c;

    /* renamed from: d, reason: collision with root package name */
    public static final rv f31372d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv f31373e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv f31374f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ rv[] f31375g;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31376b;

    static {
        rv rvVar = new rv(0, "CROSS_CLICKED", "cross_clicked");
        f31371c = rvVar;
        rv rvVar2 = new rv(1, "CROSS_TIMER_START", "cross_timer_start");
        f31372d = rvVar2;
        rv rvVar3 = new rv(2, "CROSS_TIMER_END", "cross_timer_end");
        f31373e = rvVar3;
        rv rvVar4 = new rv(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f31374f = rvVar4;
        rv[] rvVarArr = {rvVar, rvVar2, rvVar3, rvVar4, new rv(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        f31375g = rvVarArr;
        AbstractC1372b.a(rvVarArr);
    }

    private rv(int i4, String str, String str2) {
        this.f31376b = str2;
    }

    public static rv valueOf(String str) {
        return (rv) Enum.valueOf(rv.class, str);
    }

    public static rv[] values() {
        return (rv[]) f31375g.clone();
    }

    @NotNull
    public final String a() {
        return this.f31376b;
    }
}
