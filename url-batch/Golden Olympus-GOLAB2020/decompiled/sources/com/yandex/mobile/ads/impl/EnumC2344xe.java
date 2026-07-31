package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2344xe {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2344xe f34531b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2344xe f34532c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2344xe f34533d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC2344xe[] f34534e;

    static {
        EnumC2344xe enumC2344xe = new EnumC2344xe(0, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        f34531b = enumC2344xe;
        EnumC2344xe enumC2344xe2 = new EnumC2344xe(1, "NETWORK");
        f34532c = enumC2344xe2;
        EnumC2344xe enumC2344xe3 = new EnumC2344xe(2, "INVALID_RESPONSE");
        f34533d = enumC2344xe3;
        EnumC2344xe[] enumC2344xeArr = {enumC2344xe, enumC2344xe2, enumC2344xe3};
        f34534e = enumC2344xeArr;
        AbstractC1372b.a(enumC2344xeArr);
    }

    private EnumC2344xe(int i4, String str) {
    }

    public static EnumC2344xe valueOf(String str) {
        return (EnumC2344xe) Enum.valueOf(EnumC2344xe.class, str);
    }

    public static EnumC2344xe[] values() {
        return (EnumC2344xe[]) f34534e.clone();
    }
}
