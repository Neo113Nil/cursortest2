package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import androidx.datastore.preferences.protobuf.C0171d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0336n0 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0336n0 f5981c = new C0336n0(B0.f5804b);

    /* renamed from: a, reason: collision with root package name */
    public int f5982a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5983b;

    static {
        int i4 = AbstractC0326j0.f5958a;
    }

    public C0336n0(byte[] bArr) {
        bArr.getClass();
        this.f5983b = bArr;
    }

    public static int e(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0005f.k(i4, "Beginning index: ", " < 0"));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0005f.i(i5, i6, "End index: ", " >= "));
    }

    public static C0336n0 f(byte[] bArr, int i4, int i5) {
        e(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C0336n0(bArr2);
    }

    public byte b(int i4) {
        return this.f5983b[i4];
    }

    public byte c(int i4) {
        return this.f5983b[i4];
    }

    public int d() {
        return this.f5983b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C0336n0) && d() == ((C0336n0) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof C0336n0)) {
                return obj.equals(this);
            }
            C0336n0 c0336n0 = (C0336n0) obj;
            int i4 = this.f5982a;
            int i5 = c0336n0.f5982a;
            if (i4 == 0 || i5 == 0 || i4 == i5) {
                int d4 = d();
                if (d4 > c0336n0.d()) {
                    throw new IllegalArgumentException("Length too large: " + d4 + d());
                }
                if (d4 > c0336n0.d()) {
                    throw new IllegalArgumentException(AbstractC0005f.i(d4, c0336n0.d(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = c0336n0.f5983b;
                int i6 = 0;
                int i7 = 0;
                while (i6 < d4) {
                    if (this.f5983b[i6] == bArr[i7]) {
                        i6++;
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f5982a;
        if (i4 != 0) {
            return i4;
        }
        int d4 = d();
        int i5 = d4;
        for (int i6 = 0; i6 < d4; i6++) {
            i5 = (i5 * 31) + this.f5983b[i6];
        }
        if (i5 == 0) {
            i5 = 1;
        }
        this.f5982a = i5;
        return i5;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0171d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d4 = d();
        if (d() <= 50) {
            concat = AbstractC0347t0.x(this);
        } else {
            int e4 = e(0, 47, d());
            concat = AbstractC0347t0.x(e4 == 0 ? f5981c : new C0334m0(e4, this.f5983b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d4);
        sb.append(" contents=\"");
        return AbstractC0005f.q(sb, concat, "\">");
    }
}
