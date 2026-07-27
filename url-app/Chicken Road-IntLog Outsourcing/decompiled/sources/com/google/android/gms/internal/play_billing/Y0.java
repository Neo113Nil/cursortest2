package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0209d;
import b2.AbstractC0279e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class Y0 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f5142c = new Y0(AbstractC0349l1.f5206b);

    /* renamed from: a, reason: collision with root package name */
    public int f5143a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5144b;

    static {
        int i2 = U0.f5108a;
    }

    public Y0(byte[] bArr) {
        bArr.getClass();
        this.f5144b = bArr;
    }

    public static int e(int i2, int i3, int i6) {
        int i7 = i3 - i2;
        if ((i2 | i3 | i7 | (i6 - i3)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(B0.o.g(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(B0.o.h("Beginning index larger than ending index: ", i2, i3, ", "));
        }
        throw new IndexOutOfBoundsException(B0.o.h("End index: ", i3, i6, " >= "));
    }

    public static Y0 f(byte[] bArr, int i2, int i3) {
        e(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new Y0(bArr2);
    }

    public byte b(int i2) {
        return this.f5144b[i2];
    }

    public byte c(int i2) {
        return this.f5144b[i2];
    }

    public int d() {
        return this.f5144b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y0) || d() != ((Y0) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return obj.equals(this);
        }
        Y0 y02 = (Y0) obj;
        int i2 = this.f5143a;
        int i3 = y02.f5143a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int d6 = d();
        if (d6 > y02.d()) {
            throw new IllegalArgumentException("Length too large: " + d6 + d());
        }
        if (d6 > y02.d()) {
            throw new IllegalArgumentException(B0.o.h("Ran off end of other: 0, ", d6, y02.d(), ", "));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < d6) {
            if (this.f5144b[i6] != y02.f5144b[i7]) {
                return false;
            }
            i6++;
            i7++;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.f5143a;
        if (i2 != 0) {
            return i2;
        }
        int d6 = d();
        int i3 = d6;
        for (int i6 = 0; i6 < d6; i6++) {
            i3 = (i3 * 31) + this.f5144b[i6];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.f5143a = i3;
        return i3;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0209d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d6 = d();
        if (d() <= 50) {
            concat = AbstractC0325d1.f(this);
        } else {
            int e3 = e(0, 47, d());
            concat = AbstractC0325d1.f(e3 == 0 ? f5142c : new X0(e3, this.f5144b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d6);
        sb.append(" contents=\"");
        return AbstractC0279e.h(sb, concat, "\">");
    }
}
