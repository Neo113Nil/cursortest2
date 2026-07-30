package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yd implements CharSequence {
    public final List m;
    public final String n;
    public final ArrayList o;
    public final ArrayList p;

    static {
        tt1 tt1Var = he2.a;
    }

    public yd(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.m = list;
        this.n = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                xd xdVar = (xd) list.get(i);
                Object obj = xdVar.a;
                if (obj instanceof un2) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(xdVar);
                } else if (obj instanceof ez1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(xdVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.o = arrayList;
        this.p = arrayList2;
        List I = arrayList2 != null ? zv.I(arrayList2, new zo0(5)) : null;
        if (I == null || I.isEmpty()) {
            return;
        }
        int i2 = ((xd) zv.u(I)).c;
        int i3 = p31.a;
        ym1 ym1Var = new ym1(1);
        ym1Var.a(i2);
        int size2 = I.size();
        for (int i4 = 1; i4 < size2; i4++) {
            xd xdVar2 = (xd) I.get(i4);
            while (true) {
                if (ym1Var.b != 0) {
                    int d = ym1Var.d();
                    int i5 = xdVar2.b;
                    int i6 = xdVar2.c;
                    if (i5 >= d) {
                        ym1Var.e(ym1Var.b - 1);
                    } else if (i6 > d) {
                        i21.a("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + d);
                    }
                }
            }
            ym1Var.a(xdVar2.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r2.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yd subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            i21.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.n;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        yd ydVar = ae.a;
        if (i > i2) {
            i21.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.m;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                xd xdVar = (xd) list.get(i3);
                int i4 = xdVar.b;
                int i5 = xdVar.c;
                if (ae.b(i, i2, i4, i5)) {
                    arrayList.add(new xd(Math.max(i, xdVar.b) - i, Math.min(i2, i5) - i, xdVar.a, xdVar.d));
                }
            }
        }
        arrayList = null;
        return new yd(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.n.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return Intrinsics.b(this.n, ydVar.n) && Intrinsics.b(this.m, ydVar.m);
    }

    public final int hashCode() {
        int hashCode = this.n.hashCode() * 31;
        List list = this.m;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.n.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yd(int i, String str, ArrayList arrayList) {
        this(r4, str);
        List list;
        List list2 = (i & 2) != 0 ? ah0.m : arrayList;
        ah0 ah0Var = ah0.m;
        yd ydVar = ae.a;
        if (list2.isEmpty()) {
            ah0Var.getClass();
            list = null;
        } else {
            ah0Var.getClass();
            list = list2;
        }
    }

    public yd(String str) {
        this(str, ah0.m);
    }

    public yd(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
