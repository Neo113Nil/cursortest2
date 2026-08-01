package kotlin.ranges;

import be.b;
import be.c;
import java.util.Iterator;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a implements Iterable, xd.a {

    /* renamed from: r, reason: collision with root package name */
    public static final b f5598r = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f5599d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5600e;

    /* renamed from: i, reason: collision with root package name */
    public final int f5601i;

    public a(int i3, int i10, int i11) {
        if (i11 == 0) {
            a1.e("Step must be non-zero.");
            throw null;
        }
        if (i11 == Integer.MIN_VALUE) {
            a1.e("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f5599d = i3;
        if (i11 > 0) {
            if (i3 < i10) {
                int i12 = i10 % i11;
                int i13 = i3 % i11;
                int i14 = ((i12 < 0 ? i12 + i11 : i12) - (i13 < 0 ? i13 + i11 : i13)) % i11;
                i10 -= i14 < 0 ? i14 + i11 : i14;
            }
        } else {
            if (i11 >= 0) {
                a1.e("Step is zero.");
                throw null;
            }
            if (i3 > i10) {
                int i15 = -i11;
                int i16 = i3 % i15;
                int i17 = i10 % i15;
                int i18 = ((i16 < 0 ? i16 + i15 : i16) - (i17 < 0 ? i17 + i15 : i17)) % i15;
                i10 += i18 < 0 ? i18 + i15 : i18;
            }
        }
        this.f5600e = i10;
        this.f5601i = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f5599d == aVar.f5599d && this.f5600e == aVar.f5600e && this.f5601i == aVar.f5601i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5599d * 31) + this.f5600e) * 31) + this.f5601i;
    }

    public boolean isEmpty() {
        int i3 = this.f5600e;
        int i10 = this.f5601i;
        int i11 = this.f5599d;
        return i10 > 0 ? i11 > i3 : i11 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f5599d, this.f5600e, this.f5601i);
    }

    public String toString() {
        StringBuilder sb2;
        int i3 = this.f5600e;
        int i10 = this.f5601i;
        int i11 = this.f5599d;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i3);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i3);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
