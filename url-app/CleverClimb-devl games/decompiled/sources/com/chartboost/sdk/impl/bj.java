package com.chartboost.sdk.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bj extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3801a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f3802b;

    /* renamed from: c, reason: collision with root package name */
    private int f3803c;

    /* renamed from: d, reason: collision with root package name */
    private int f3804d;
    private byte[] e;
    private int f;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public bj() {
        this(1024);
    }

    public bj(int i) {
        this.f3802b = new ArrayList();
        if (i < 0) {
            throw new IllegalArgumentException("Negative initial size: " + i);
        }
        synchronized (this) {
            a(i);
        }
    }

    private void a(int i) {
        if (this.f3803c < this.f3802b.size() - 1) {
            this.f3804d += this.e.length;
            this.f3803c++;
            this.e = this.f3802b.get(this.f3803c);
            return;
        }
        if (this.e == null) {
            this.f3804d = 0;
        } else {
            i = Math.max(this.e.length << 1, i - this.f3804d);
            this.f3804d += this.e.length;
        }
        this.f3803c++;
        this.e = new byte[i];
        this.f3802b.add(this.e);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            int i4 = this.f + i2;
            int i5 = this.f - this.f3804d;
            while (i2 > 0) {
                int min = Math.min(i2, this.e.length - i5);
                System.arraycopy(bArr, i3 - i2, this.e, i5, min);
                i2 -= min;
                if (i2 > 0) {
                    a(i4);
                    i5 = 0;
                }
            }
            this.f = i4;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        int i2 = this.f - this.f3804d;
        if (i2 == this.e.length) {
            a(this.f + 1);
            i2 = 0;
        }
        this.e[i2] = (byte) i;
        this.f++;
    }

    public synchronized byte[] a() {
        int i = this.f;
        if (i == 0) {
            return f3801a;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this.f3802b) {
            int min = Math.min(bArr2.length, i);
            System.arraycopy(bArr2, 0, bArr, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return bArr;
    }

    public String toString() {
        return new String(a());
    }
}
