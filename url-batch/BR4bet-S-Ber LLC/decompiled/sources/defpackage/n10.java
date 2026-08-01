package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n10 {
    public final i10 a;
    public final ArrayList b;
    public final int c;
    public final uk d;
    public final b30 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public n10(i10 i10Var, ArrayList arrayList, int i, uk ukVar, b30 b30Var, int i2, int i3, int i4) {
        this.a = i10Var;
        this.b = arrayList;
        this.c = i;
        this.d = ukVar;
        this.e = b30Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static n10 a(n10 n10Var, int i, uk ukVar, b30 b30Var, int i2) {
        if ((i2 & 1) != 0) {
            i = n10Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            ukVar = n10Var.d;
        }
        uk ukVar2 = ukVar;
        if ((i2 & 4) != 0) {
            b30Var = n10Var.e;
        }
        b30 b30Var2 = b30Var;
        int i4 = n10Var.f;
        int i5 = n10Var.g;
        int i6 = n10Var.h;
        b30Var2.getClass();
        return new n10(n10Var.a, n10Var.b, i3, ukVar2, b30Var2, i4, i5, i6);
    }

    public final n30 b(b30 b30Var) {
        b30Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            g9.s("Check failed.");
            return null;
        }
        this.i++;
        uk ukVar = this.d;
        if (ukVar != null) {
            wk wkVar = ukVar.b;
            uq uqVar = b30Var.a;
            wkVar.getClass();
            uqVar.getClass();
            uq uqVar2 = wkVar.b.h;
            if (uqVar.e != uqVar2.e || !kr.b(uqVar.d, uqVar2.d)) {
                g9.q(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                g9.q(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        n10 a = a(this, i2, null, b30Var, 58);
        jr jrVar = (jr) arrayList.get(i);
        n30 a2 = jrVar.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + jrVar + " returned null");
        }
        if (ukVar != null && i2 < arrayList.size() && a.i != 1) {
            g9.q(jrVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.l != null) {
            return a2;
        }
        g9.q(jrVar, " returned a response with no body", "interceptor ");
        return null;
    }
}
