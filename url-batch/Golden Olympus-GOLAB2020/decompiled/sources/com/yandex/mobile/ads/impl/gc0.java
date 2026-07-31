package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class gc0 implements su {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f26108d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f26109a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f26110b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26111c;

    static {
        boolean z4;
        if ("Amazon".equals(u82.f32875c)) {
            String str = u82.f32876d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
                f26108d = z4;
            }
        }
        z4 = false;
        f26108d = z4;
    }

    public gc0(UUID uuid, byte[] bArr, boolean z4) {
        this.f26109a = uuid;
        this.f26110b = bArr;
        this.f26111c = z4;
    }
}
