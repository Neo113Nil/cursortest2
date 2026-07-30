package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FK implements CharSequence {

    /* renamed from: n, reason: collision with root package name */
    public char[] f24948n;

    /* renamed from: u, reason: collision with root package name */
    public String f24949u;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f24948n[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f24948n.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new String(this.f24948n, i, i4 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f24949u == null) {
            this.f24949u = new String(this.f24948n);
        }
        return this.f24949u;
    }
}
