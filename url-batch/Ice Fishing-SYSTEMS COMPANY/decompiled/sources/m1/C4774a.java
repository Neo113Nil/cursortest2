package m1;

import B.i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4774a {

    /* renamed from: e, reason: collision with root package name */
    public static final i f39542e = new i(3);

    /* renamed from: a, reason: collision with root package name */
    public int f39543a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39545c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39546d;

    public C4774a(int i, ArrayList arrayList, int i4, InputStream inputStream) {
        this.f39543a = i;
        this.f39544b = arrayList;
        this.f39545c = i4;
        this.f39546d = inputStream;
    }

    public synchronized byte[] a(int i) {
        for (int i4 = 0; i4 < ((ArrayList) this.f39546d).size(); i4++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f39546d).get(i4);
            if (bArr.length >= i) {
                this.f39543a -= bArr.length;
                ((ArrayList) this.f39546d).remove(i4);
                this.f39544b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f39545c) {
                this.f39544b.add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.f39546d, bArr, f39542e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.f39546d).add(binarySearch, bArr);
                this.f39543a += bArr.length;
                synchronized (this) {
                    while (this.f39543a > this.f39545c) {
                        byte[] bArr2 = (byte[]) this.f39544b.remove(0);
                        ((ArrayList) this.f39546d).remove(bArr2);
                        this.f39543a -= bArr2.length;
                    }
                }
            }
        }
    }

    public C4774a() {
        this.f39544b = new ArrayList();
        this.f39546d = new ArrayList(64);
        this.f39543a = 0;
        this.f39545c = 4096;
    }
}
