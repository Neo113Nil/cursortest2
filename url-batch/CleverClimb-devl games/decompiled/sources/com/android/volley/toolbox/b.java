package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ByteArrayPool.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f2329a = new Comparator<byte[]>() { // from class: com.android.volley.toolbox.b.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private List<byte[]> f2330b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private List<byte[]> f2331c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f2332d = 0;
    private final int e;

    public b(int i) {
        this.e = i;
    }

    public synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.f2331c.size(); i2++) {
            byte[] bArr = this.f2331c.get(i2);
            if (bArr.length >= i) {
                this.f2332d -= bArr.length;
                this.f2331c.remove(i2);
                this.f2330b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.e) {
                this.f2330b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f2331c, bArr, f2329a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f2331c.add(binarySearch, bArr);
                this.f2332d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f2332d > this.e) {
            byte[] remove = this.f2330b.remove(0);
            this.f2331c.remove(remove);
            this.f2332d -= remove.length;
        }
    }
}
