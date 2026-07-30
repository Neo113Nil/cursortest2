package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3413jK {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC3413jK f32102n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC3413jK f32103u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC3413jK f32104v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC3413jK[] f32105w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3413jK EF0;

    static {
        EnumC3413jK enumC3413jK = new EnumC3413jK("SHA1", 0);
        EnumC3413jK enumC3413jK2 = new EnumC3413jK("SHA224", 1);
        EnumC3413jK enumC3413jK3 = new EnumC3413jK("SHA256", 2);
        f32102n = enumC3413jK3;
        EnumC3413jK enumC3413jK4 = new EnumC3413jK("SHA384", 3);
        f32103u = enumC3413jK4;
        EnumC3413jK enumC3413jK5 = new EnumC3413jK("SHA512", 4);
        f32104v = enumC3413jK5;
        f32105w = new EnumC3413jK[]{enumC3413jK, enumC3413jK2, enumC3413jK3, enumC3413jK4, enumC3413jK5};
    }

    public static EnumC3413jK[] values() {
        return (EnumC3413jK[]) f32105w.clone();
    }
}
