package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class v0 implements Iterable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f2860e = new u0(r1.f2724a);

    /* renamed from: d, reason: collision with root package name */
    public int f2861d;

    static {
        int i3 = q0.f2690a;
    }

    public static u0 k(byte[] bArr, int i3, int i10) {
        try {
            return m(bArr, i3, i10);
        } catch (v1 e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static u0 m(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return f2860e;
        }
        o(i3, i3 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        return new u0(bArr2);
    }

    public static int o(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i3);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i3) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(i10).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i3);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean p(byte[] bArr, int i3, byte[] bArr2, int i10, int i11) {
        int i12 = i3 + i11;
        o(i3, i12, bArr.length);
        o(i10, i11 + i10, bArr2.length);
        while (i3 < i12) {
            if (bArr[i3] != bArr2[i10]) {
                return false;
            }
            i3++;
            i10++;
        }
        return true;
    }

    public abstract byte b(int i3);

    public abstract int c();

    public abstract t0 e(int i3, int i10);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        int c10 = c();
        if (c10 != v0Var.c()) {
            return false;
        }
        if (c10 == 0) {
            return true;
        }
        int i3 = this.f2861d;
        int i10 = v0Var.f2861d;
        if (i3 == 0 || i10 == 0 || i3 == i10) {
            return h(v0Var);
        }
        return false;
    }

    public abstract void f(int i3, byte[] bArr);

    public abstract void g(b1 b1Var);

    public abstract boolean h(v0 v0Var);

    public final int hashCode() {
        int i3 = this.f2861d;
        if (i3 == 0) {
            int c10 = c();
            i3 = i(c10, c10);
            if (i3 == 0) {
                i3 = 1;
            }
            this.f2861d = i3;
        }
        return i3;
    }

    public abstract int i(int i3, int i10);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.c(this);
    }

    public final byte[] n() {
        int c10 = c();
        if (c10 == 0) {
            return r1.f2724a;
        }
        byte[] bArr = new byte[c10];
        f(c10, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c10 = c();
        String d10 = c() <= 50 ? oa.d(n()) : oa.d(e(0, 47).n()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(c10);
        sb2.append(" contents=\"");
        return v4.a.o(sb2, d10, "\">");
    }
}
