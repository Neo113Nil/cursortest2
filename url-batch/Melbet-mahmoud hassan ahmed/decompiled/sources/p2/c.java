package p2;

import android.os.Bundle;
import java.util.Arrays;
import r0.i;

/* loaded from: classes.dex */
public final class c implements r0.i {

    /* renamed from: k, reason: collision with root package name */
    public static final i.a<c> f19979k = new i.a() { // from class: p2.b
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            c e7;
            e7 = c.e(bundle);
            return e7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f19980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19982h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f19983i;

    /* renamed from: j, reason: collision with root package name */
    private int f19984j;

    public c(int i7, int i8, int i9, byte[] bArr) {
        this.f19980f = i7;
        this.f19981g = i8;
        this.f19982h = i9;
        this.f19983i = bArr;
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String d(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19980f == cVar.f19980f && this.f19981g == cVar.f19981g && this.f19982h == cVar.f19982h && Arrays.equals(this.f19983i, cVar.f19983i);
    }

    public int hashCode() {
        if (this.f19984j == 0) {
            this.f19984j = ((((((527 + this.f19980f) * 31) + this.f19981g) * 31) + this.f19982h) * 31) + Arrays.hashCode(this.f19983i);
        }
        return this.f19984j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f19980f);
        sb.append(", ");
        sb.append(this.f19981g);
        sb.append(", ");
        sb.append(this.f19982h);
        sb.append(", ");
        sb.append(this.f19983i != null);
        sb.append(")");
        return sb.toString();
    }
}
