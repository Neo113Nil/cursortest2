package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import androidx.datastore.preferences.protobuf.C0137d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class Y0 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f2822c = new Y0(AbstractC0240l1.f2881b);

    /* renamed from: a, reason: collision with root package name */
    public int f2823a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2824b;

    static {
        int i3 = U0.f2792a;
    }

    public Y0(byte[] bArr) {
        bArr.getClass();
        this.f2824b = bArr;
    }

    public static int e(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0033i.i(i3, "Beginning index: ", " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0033i.g(i4, i5, "End index: ", " >= "));
    }

    public static Y0 f(byte[] bArr, int i3, int i4) {
        e(i3, i3 + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i3, bArr2, 0, i4);
        return new Y0(bArr2);
    }

    public byte b(int i3) {
        return this.f2824b[i3];
    }

    public byte c(int i3) {
        return this.f2824b[i3];
    }

    public int d() {
        return this.f2824b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Y0) && d() == ((Y0) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof Y0)) {
                return obj.equals(this);
            }
            Y0 y02 = (Y0) obj;
            int i3 = this.f2823a;
            int i4 = y02.f2823a;
            if (i3 == 0 || i4 == 0 || i3 == i4) {
                int d3 = d();
                if (d3 > y02.d()) {
                    throw new IllegalArgumentException("Length too large: " + d3 + d());
                }
                if (d3 > y02.d()) {
                    throw new IllegalArgumentException(AbstractC0033i.g(d3, y02.d(), "Ran off end of other: 0, ", ", "));
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < d3) {
                    if (this.f2824b[i5] == y02.f2824b[i6]) {
                        i5++;
                        i6++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2823a;
        if (i3 != 0) {
            return i3;
        }
        int d3 = d();
        int i4 = d3;
        for (int i5 = 0; i5 < d3; i5++) {
            i4 = (i4 * 31) + this.f2824b[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2823a = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0137d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d3 = d();
        if (d() <= 50) {
            concat = AbstractC0216d1.e(this);
        } else {
            int e3 = e(0, 47, d());
            concat = AbstractC0216d1.e(e3 == 0 ? f2822c : new X0(e3, this.f2824b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d3);
        sb.append(" contents=\"");
        return AbstractC0033i.m(sb, concat, "\">");
    }
}
