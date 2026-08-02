package defpackage;

import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epa {
    public final koe a;
    public final Object b;
    public final Object c;
    public final Object d;

    public epa(Context context, koe koeVar, jpt jptVar, jpt jptVar2) {
        this.b = jptVar;
        this.d = context;
        this.a = koeVar;
        this.c = jptVar2;
    }

    public static boolean a(elx elxVar, elx elxVar2) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        if (!Objects.equals(elxVar.d, elxVar2.d) || !Objects.equals(elxVar.e, elxVar2.e) || (l = elxVar.b) == null || (l2 = elxVar.c) == null || (l3 = elxVar2.b) == null || (l4 = elxVar2.c) == null) {
            return false;
        }
        long longValue = l3.longValue() - l.longValue();
        long longValue2 = l4.longValue() - l2.longValue();
        if (longValue2 <= 0) {
            return false;
        }
        long abs = Math.abs(longValue - longValue2);
        if (abs >= 25) {
            return ((double) abs) / ((double) longValue2) <= 3.472222222222222E-5d;
        }
        return true;
    }

    public epa(String str, fwm fwmVar, dih dihVar, koe koeVar) {
        this.b = str;
        this.c = fwmVar;
        this.d = dihVar;
        this.a = koeVar;
    }
}
