package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ly {
    public final gy a;
    public final ArrayList b;
    public final int c;
    public final ni d;
    public final xz e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public ly(gy gyVar, ArrayList arrayList, int i, ni niVar, xz xzVar, int i2, int i3, int i4) {
        this.a = gyVar;
        this.b = arrayList;
        this.c = i;
        this.d = niVar;
        this.e = xzVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static ly a(ly lyVar, int i, ni niVar, xz xzVar, int i2) {
        if ((i2 & 1) != 0) {
            i = lyVar.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            niVar = lyVar.d;
        }
        ni niVar2 = niVar;
        if ((i2 & 4) != 0) {
            xzVar = lyVar.e;
        }
        xz xzVar2 = xzVar;
        int i4 = lyVar.f;
        int i5 = lyVar.g;
        int i6 = lyVar.h;
        xzVar2.getClass();
        return new ly(lyVar.a, lyVar.b, i3, niVar2, xzVar2, i4, i5, i6);
    }

    public final i00 b(xz xzVar) {
        xzVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            t8.t("Check failed.");
            return null;
        }
        this.i++;
        ni niVar = this.d;
        if (niVar != null) {
            pi piVar = niVar.b;
            jo joVar = xzVar.a;
            piVar.getClass();
            joVar.getClass();
            jo joVar2 = piVar.b.h;
            if (joVar.e != joVar2.e || !zo.b(joVar.d, joVar2.d)) {
                t8.r(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                t8.r(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        ly a = a(this, i2, null, xzVar, 58);
        yo yoVar = (yo) arrayList.get(i);
        i00 a2 = yoVar.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + yoVar + " returned null");
        }
        if (niVar != null && i2 < arrayList.size() && a.i != 1) {
            t8.r(yoVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.l != null) {
            return a2;
        }
        t8.r(yoVar, " returned a response with no body", "interceptor ");
        return null;
    }
}
