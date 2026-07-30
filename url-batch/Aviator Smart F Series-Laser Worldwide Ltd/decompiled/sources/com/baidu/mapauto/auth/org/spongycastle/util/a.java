package com.baidu.mapauto.auth.org.spongycastle.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.baidu.mapauto.auth.org.spongycastle.util.a$a, reason: collision with other inner class name */
    public static class C0067a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f7860a;

        /* renamed from: b, reason: collision with root package name */
        public int f7861b = 0;

        public C0067a(T[] tArr) {
            this.f7860a = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7861b < this.f7860a.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i8 = this.f7861b;
            T[] tArr = this.f7860a;
            if (i8 != tArr.length) {
                this.f7861b = i8 + 1;
                return tArr[i8];
            }
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("Out of elements: ");
            a8.append(this.f7861b);
            throw new NoSuchElementException(a8.toString());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 != bArr.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i8;
            }
            i8 = (i8 * 257) ^ bArr[length];
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
