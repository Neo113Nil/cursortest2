package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1913f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1913f2 f25579b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1913f2 f25580c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1913f2 f25581d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1913f2 f25582e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1913f2 f25583f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1913f2 f25584g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1913f2 f25585h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1913f2 f25586i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC1913f2[] f25587j;

    static {
        EnumC1913f2 enumC1913f2 = new EnumC1913f2(0, "INITIAL");
        f25579b = enumC1913f2;
        EnumC1913f2 enumC1913f22 = new EnumC1913f2(1, "PREPARING");
        f25580c = enumC1913f22;
        EnumC1913f2 enumC1913f23 = new EnumC1913f2(2, "PREPARED");
        f25581d = enumC1913f23;
        EnumC1913f2 enumC1913f24 = new EnumC1913f2(3, "FINISHED");
        f25582e = enumC1913f24;
        EnumC1913f2 enumC1913f25 = new EnumC1913f2(4, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        f25583f = enumC1913f25;
        EnumC1913f2 enumC1913f26 = new EnumC1913f2(5, "ERROR");
        f25584g = enumC1913f26;
        EnumC1913f2 enumC1913f27 = new EnumC1913f2(6, "PAUSED");
        f25585h = enumC1913f27;
        EnumC1913f2 enumC1913f28 = new EnumC1913f2(7, "PLAYING");
        f25586i = enumC1913f28;
        EnumC1913f2[] enumC1913f2Arr = {enumC1913f2, enumC1913f22, enumC1913f23, enumC1913f24, enumC1913f25, enumC1913f26, enumC1913f27, enumC1913f28};
        f25587j = enumC1913f2Arr;
        AbstractC1372b.a(enumC1913f2Arr);
    }

    private EnumC1913f2(int i4, String str) {
    }

    public static EnumC1913f2 valueOf(String str) {
        return (EnumC1913f2) Enum.valueOf(EnumC1913f2.class, str);
    }

    public static EnumC1913f2[] values() {
        return (EnumC1913f2[]) f25587j.clone();
    }
}
