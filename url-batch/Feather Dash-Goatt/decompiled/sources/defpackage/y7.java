package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y7 implements CharSequence {
    public final List d;
    public final String e;
    public final ArrayList g;
    public final ArrayList h;

    static {
        c51 c51Var = o61.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r8.a(r1.c);
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y7(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.d = list;
        this.e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                x7 x7Var = (x7) list.get(i);
                Object obj = x7Var.a;
                if (obj instanceof jc1) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(x7Var);
                } else if (obj instanceof uu0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(x7Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List w = arrayList2 != null ? CollectionsKt.w(arrayList2, new r10(5)) : null;
        if (w == null || w.isEmpty()) {
            return;
        }
        int i2 = ((x7) CollectionsKt.p(w)).c;
        dn0 dn0Var = p90.a;
        int i3 = 1;
        dn0 dn0Var2 = new dn0(1);
        dn0Var2.a(i2);
        int size2 = w.size();
        while (i3 < size2) {
            x7 x7Var2 = (x7) w.get(i3);
            while (true) {
                int i4 = dn0Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                int i5 = dn0Var2.a[i4 - 1];
                int i6 = x7Var2.b;
                int i7 = x7Var2.c;
                if (i6 >= i5) {
                    dn0Var2.d(i4 - 1);
                } else if (i7 > i5) {
                    p80.a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return Intrinsics.a(this.e, y7Var.e) && Intrinsics.a(this.d, y7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            p80.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.e;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        int i3 = z7.a;
        if (i > i2) {
            p80.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                x7 x7Var = (x7) list.get(i4);
                int i5 = x7Var.b;
                int i6 = x7Var.c;
                if (z7.a(i, i2, i5, i6)) {
                    arrayList.add(new x7(Math.max(i, x7Var.b) - i, Math.min(i2, i6) - i, x7Var.a, x7Var.d));
                }
            }
        }
        arrayList = null;
        return new y7(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    public y7(String str) {
        this(str, nv.d);
    }

    public y7(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
