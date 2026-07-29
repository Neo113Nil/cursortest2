package com.aiming.mdt.a;

import java.net.URI;
import java.util.HashMap;

/* renamed from: com.aiming.mdt.a.ʼˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0145 {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f475 = 1;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f476;

    /* renamed from: ʻ, reason: contains not printable characters */
    private HashMap<String, String> f477;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private byte[] f478;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private URI f479;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f480;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f482 = true;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private boolean f481 = false;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f483 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String m557() {
        int i = f476 + 33;
        f475 = i % 128;
        return !(i % 2 == 0) ? this.f480 : this.f480;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final C0145 m558(URI uri) {
        int i = f476 + 125;
        f475 = i % 128;
        int i2 = i % 2;
        this.f479 = uri;
        int i3 = f476 + 91;
        f475 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return this;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final boolean m559() {
        int i = f476 + 105;
        f475 = i % 128;
        if (i % 2 == 0) {
        }
        boolean z = this.f482;
        int i2 = f475 + 39;
        f476 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return z;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final byte[] m560() {
        int i = f475 + 89;
        f476 = i % 128;
        if (i % 2 != 0) {
        }
        byte[] bArr = this.f478;
        int i2 = f475 + 7;
        f476 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return bArr;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0145 m561(String str) {
        int i = f475 + 47;
        f476 = i % 128;
        int i2 = i % 2;
        this.f480 = str;
        int i3 = f476 + 41;
        f475 = i3 % 128;
        if ((i3 % 2 == 0 ? '.' : (char) 5) != 5) {
        }
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0145 m562(HashMap<String, String> hashMap) {
        int i = f475 + 69;
        f476 = i % 128;
        if ((i % 2 != 0 ? (char) 27 : (char) 25) != 27) {
            this.f477 = hashMap;
            return this;
        }
        this.f477 = hashMap;
        Object obj = null;
        super.hashCode();
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final URI m563() {
        int i = f475 + 5;
        f476 = i % 128;
        int i2 = i % 2;
        URI uri = this.f479;
        int i3 = f476 + 69;
        f475 = i3 % 128;
        if (!(i3 % 2 != 0)) {
        }
        return uri;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0145 m564(boolean z) {
        int i = f475 + 71;
        f476 = i % 128;
        if (i % 2 == 0) {
            this.f482 = z;
            return this;
        }
        this.f482 = z;
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0145 m565(byte[] bArr) {
        int i = f476 + 123;
        f475 = i % 128;
        if (i % 2 == 0) {
        }
        this.f478 = bArr;
        int i2 = f475 + 103;
        f476 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final HashMap<String, String> m566() {
        int i = f476 + 19;
        f475 = i % 128;
        int i2 = i % 2;
        HashMap<String, String> hashMap = this.f477;
        int i3 = f475 + 73;
        f476 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return hashMap;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final boolean m567() {
        int i = f476 + 81;
        f475 = i % 128;
        if (i % 2 == 0) {
        }
        boolean z = this.f483;
        int i2 = f475 + 47;
        f476 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return z;
    }
}
