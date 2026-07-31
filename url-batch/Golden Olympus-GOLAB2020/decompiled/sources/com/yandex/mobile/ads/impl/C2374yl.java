package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.yl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2374yl {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f35170e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f35171a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f35172b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f35173c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f35174d = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: com.yandex.mobile.ads.impl.yl$a */
    final class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i4) {
        for (int i5 = 0; i5 < this.f35172b.size(); i5++) {
            byte[] bArr = (byte[]) this.f35172b.get(i5);
            if (bArr.length >= i4) {
                this.f35173c -= bArr.length;
                this.f35172b.remove(i5);
                this.f35171a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i4];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f35174d) {
                this.f35171a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f35172b, bArr, f35170e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f35172b.add(binarySearch, bArr);
                this.f35173c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f35173c > this.f35174d) {
            byte[] bArr = (byte[]) this.f35171a.remove(0);
            this.f35172b.remove(bArr);
            this.f35173c -= bArr.length;
        }
    }
}
