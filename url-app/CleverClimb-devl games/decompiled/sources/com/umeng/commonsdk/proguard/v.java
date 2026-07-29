package com.umeng.commonsdk.proguard;

import java.io.Serializable;

/* compiled from: FieldValueMetaData.java */
/* loaded from: classes2.dex */
public class v implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9087a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f9088b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9089c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9090d;

    public v(byte b2, boolean z) {
        this.f9088b = b2;
        this.f9087a = false;
        this.f9089c = null;
        this.f9090d = z;
    }

    public v(byte b2) {
        this(b2, false);
    }

    public v(byte b2, String str) {
        this.f9088b = b2;
        this.f9087a = true;
        this.f9089c = str;
        this.f9090d = false;
    }

    public boolean a() {
        return this.f9087a;
    }

    public String b() {
        return this.f9089c;
    }

    public boolean c() {
        return this.f9088b == 12;
    }

    public boolean d() {
        return this.f9088b == 15 || this.f9088b == 13 || this.f9088b == 14;
    }

    public boolean e() {
        return this.f9090d;
    }
}
