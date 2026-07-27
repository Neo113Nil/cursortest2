package D;

import G.C0216p;
import com.appsflyer.attribution.RequestError;
import l.AbstractC0784j;
import q.AbstractC1024c;
import y2.C1338m;

/* loaded from: classes.dex */
public abstract class U1 {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f1662a = new G.Y0(L.f1473s);

    public static final A0.L a(int i2, C0216p c0216p) {
        T1 t12 = (T1) c0216p.k(f1662a);
        switch (AbstractC0784j.d(i2)) {
            case 0:
                return t12.f1650j;
            case 1:
                return t12.f1651k;
            case 2:
                return t12.f1652l;
            case 3:
                return t12.f1641a;
            case 4:
                return t12.f1642b;
            case 5:
                return t12.f1643c;
            case 6:
                return t12.f1644d;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return t12.f1645e;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return t12.f1646f;
            case AbstractC1024c.f9242c /* 9 */:
                return t12.f1653m;
            case 10:
                return t12.f1654n;
            case RequestError.STOP_TRACKING /* 11 */:
                return t12.f1655o;
            case 12:
                return t12.f1647g;
            case 13:
                return t12.f1648h;
            case 14:
                return t12.f1649i;
            default:
                throw new C1338m();
        }
    }
}
