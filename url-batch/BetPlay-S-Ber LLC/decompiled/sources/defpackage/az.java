package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class az {
    public final vy a;
    public final ArrayList b;
    public final int c;
    public final gi d;
    public final pp e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public az(vy vyVar, ArrayList arrayList, int i, gi giVar, pp ppVar, int i2, int i3, int i4) {
        this.a = vyVar;
        this.b = arrayList;
        this.c = i;
        this.d = giVar;
        this.e = ppVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static az a(az azVar, int i, gi giVar, pp ppVar, int i2) {
        if ((i2 & 1) != 0) {
            i = azVar.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            giVar = azVar.d;
        }
        gi giVar2 = giVar;
        if ((i2 & 4) != 0) {
            ppVar = azVar.e;
        }
        pp ppVar2 = ppVar;
        int i4 = azVar.f;
        int i5 = azVar.g;
        int i6 = azVar.h;
        ppVar2.getClass();
        return new az(azVar.a, azVar.b, i3, giVar2, ppVar2, i4, i5, i6);
    }

    public final y00 b(pp ppVar) {
        ppVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            o8.t("Check failed.");
            return null;
        }
        this.i++;
        gi giVar = this.d;
        if (giVar != null) {
            ii iiVar = giVar.b;
            yo yoVar = (yo) ppVar.b;
            iiVar.getClass();
            yoVar.getClass();
            yo yoVar2 = iiVar.b.h;
            if (yoVar.e != yoVar2.e || !op.d(yoVar.d, yoVar2.d)) {
                o8.g(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                o8.g(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        az a = a(this, i2, null, ppVar, 58);
        np npVar = (np) arrayList.get(i);
        y00 a2 = npVar.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + npVar + " returned null");
        }
        if (giVar != null && i2 < arrayList.size() && a.i != 1) {
            o8.g(npVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.l != null) {
            return a2;
        }
        o8.g(npVar, " returned a response with no body", "interceptor ");
        return null;
    }
}
