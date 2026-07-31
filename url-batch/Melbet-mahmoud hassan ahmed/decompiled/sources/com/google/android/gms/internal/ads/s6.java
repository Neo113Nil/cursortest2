package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class s6 {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator<byte[]> f11672d = new r6();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f11673a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f11674b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f11675c = 0;

    public s6(int i7) {
    }

    private final synchronized void c() {
        while (this.f11675c > 4096) {
            byte[] remove = this.f11673a.remove(0);
            this.f11674b.remove(remove);
            this.f11675c -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f11673a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f11674b, bArr, f11672d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f11674b.add(binarySearch, bArr);
                this.f11675c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i7) {
        for (int i8 = 0; i8 < this.f11674b.size(); i8++) {
            byte[] bArr = this.f11674b.get(i8);
            int length = bArr.length;
            if (length >= i7) {
                this.f11675c -= length;
                this.f11674b.remove(i8);
                this.f11673a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i7];
    }
}
