package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class F implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public String f35672n;

    /* renamed from: v, reason: collision with root package name */
    public final String f35674v;

    /* renamed from: u, reason: collision with root package name */
    public int f35673u = 2;

    /* renamed from: w, reason: collision with root package name */
    public int f35675w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f35676x = Integer.MAX_VALUE;

    public F(String str) {
        this.f35674v = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4 = this.f35673u;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int i9 = i4 - 1;
        String str = null;
        if (i4 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f35673u = 4;
            int i10 = this.f35675w;
            while (true) {
                int i11 = this.f35675w;
                if (i11 == -1) {
                    this.f35673u = 3;
                    break;
                }
                String str2 = this.f35674v;
                int length = str2.length();
                E.d(i11, length);
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    if (str2.charAt(i11) == ',') {
                        break;
                    }
                    i11++;
                }
                if (i11 == -1) {
                    i11 = str2.length();
                    this.f35675w = -1;
                    i = -1;
                } else {
                    i = i11 + 1;
                    this.f35675w = i;
                }
                if (i == i10) {
                    int i12 = i + 1;
                    this.f35675w = i12;
                    if (i12 > str2.length()) {
                        this.f35675w = -1;
                    }
                } else {
                    if (i10 < i11) {
                        str2.charAt(i10);
                    }
                    if (i10 < i11) {
                        str2.charAt(i11 - 1);
                    }
                    int i13 = this.f35676x;
                    if (i13 == 1) {
                        i11 = str2.length();
                        this.f35675w = -1;
                        if (i11 > i10) {
                            str2.charAt(i11 - 1);
                        }
                    } else {
                        this.f35676x = i13 - 1;
                    }
                    str = str2.subSequence(i10, i11).toString();
                }
            }
            this.f35672n = str;
            if (this.f35673u != 3) {
                this.f35673u = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f35673u = 2;
        String str = this.f35672n;
        this.f35672n = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
