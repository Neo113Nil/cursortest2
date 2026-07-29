package com.umeng.commonsdk.proguard;

/* compiled from: TField.java */
/* loaded from: classes2.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    public final String f9011a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f9012b;

    /* renamed from: c, reason: collision with root package name */
    public final short f9013c;

    public ac() {
        this("", (byte) 0, (short) 0);
    }

    public ac(String str, byte b2, short s) {
        this.f9011a = str;
        this.f9012b = b2;
        this.f9013c = s;
    }

    public String toString() {
        return "<TField name:'" + this.f9011a + "' type:" + ((int) this.f9012b) + " field-id:" + ((int) this.f9013c) + ">";
    }

    public boolean a(ac acVar) {
        return this.f9012b == acVar.f9012b && this.f9013c == acVar.f9013c;
    }
}
