package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i50 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f27089c;

    /* renamed from: d, reason: collision with root package name */
    public static final i50 f27090d;

    /* renamed from: e, reason: collision with root package name */
    public static final i50 f27091e;

    /* renamed from: f, reason: collision with root package name */
    public static final i50 f27092f;

    /* renamed from: g, reason: collision with root package name */
    public static final i50 f27093g;

    /* renamed from: h, reason: collision with root package name */
    public static final i50 f27094h;

    /* renamed from: i, reason: collision with root package name */
    public static final i50 f27095i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ i50[] f27096j;

    /* renamed from: b, reason: collision with root package name */
    private final int f27097b;

    public static final class a {
        private a() {
        }

        @Nullable
        public static i50 a(int i4) {
            for (i50 i50Var : i50.values()) {
                if (i50Var.a() == i4) {
                    return i50Var;
                }
            }
            return null;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        i50 i50Var = new i50(0, 0, "NO_ERROR");
        f27090d = i50Var;
        i50 i50Var2 = new i50(1, 1, "PROTOCOL_ERROR");
        f27091e = i50Var2;
        i50 i50Var3 = new i50(2, 2, "INTERNAL_ERROR");
        f27092f = i50Var3;
        i50 i50Var4 = new i50(3, 3, "FLOW_CONTROL_ERROR");
        f27093g = i50Var4;
        i50 i50Var5 = new i50(4, 4, "SETTINGS_TIMEOUT");
        i50 i50Var6 = new i50(5, 5, "STREAM_CLOSED");
        i50 i50Var7 = new i50(6, 6, "FRAME_SIZE_ERROR");
        i50 i50Var8 = new i50(7, 7, "REFUSED_STREAM");
        f27094h = i50Var8;
        i50 i50Var9 = new i50(8, 8, "CANCEL");
        f27095i = i50Var9;
        i50[] i50VarArr = {i50Var, i50Var2, i50Var3, i50Var4, i50Var5, i50Var6, i50Var7, i50Var8, i50Var9, new i50(9, 9, "COMPRESSION_ERROR"), new i50(10, 10, "CONNECT_ERROR"), new i50(11, 11, "ENHANCE_YOUR_CALM"), new i50(12, 12, "INADEQUATE_SECURITY"), new i50(13, 13, "HTTP_1_1_REQUIRED")};
        f27096j = i50VarArr;
        AbstractC1372b.a(i50VarArr);
        f27089c = new a(0);
    }

    private i50(int i4, int i5, String str) {
        this.f27097b = i5;
    }

    public static i50 valueOf(String str) {
        return (i50) Enum.valueOf(i50.class, str);
    }

    public static i50[] values() {
        return (i50[]) f27096j.clone();
    }

    public final int a() {
        return this.f27097b;
    }
}
