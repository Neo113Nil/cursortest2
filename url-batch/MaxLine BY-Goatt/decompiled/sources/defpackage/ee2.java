package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ee2 implements Function2 {
    public final /* synthetic */ int m;

    public /* synthetic */ ee2(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        be beVar;
        Object a;
        switch (this.m) {
            case 0:
                id2 id2Var = (id2) obj;
                dk2 dk2Var = (dk2) obj2;
                return qv.d(he2.a(new aw(dk2Var.a), he2.p, id2Var), he2.a(new au1(dk2Var.b), he2.r, id2Var), Float.valueOf(dk2Var.c));
            case 1:
                sw2 sw2Var = (sw2) obj2;
                return sw2Var != null ? sw2.a(sw2Var.a, sw2.c) : false ? Boolean.FALSE : qv.d(Float.valueOf(sw2.c(sw2Var.a)), new tw2(sw2.b(sw2Var.a)));
            case 2:
                au1 au1Var = (au1) obj2;
                return au1Var != null ? au1.b(au1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : qv.d(Float.valueOf(Float.intBitsToFloat((int) (au1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (au1Var.a & 4294967295L))));
            case 3:
                id2 id2Var2 = (id2) obj;
                List list = ((sf1) obj2).m;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(he2.a((rf1) list.get(i), he2.t, id2Var2));
                }
                return arrayList;
            case 4:
                return ((rf1) obj2).a.toLanguageTag();
            case 5:
                ud1 ud1Var = (ud1) obj2;
                return qv.d(new rd1(ud1Var.a), new td1(ud1Var.b), new sd1());
            case 6:
                id2 id2Var3 = (id2) obj;
                xd xdVar = (xd) obj2;
                Object obj3 = xdVar.a;
                if (obj3 instanceof ez1) {
                    beVar = be.m;
                } else if (obj3 instanceof un2) {
                    beVar = be.n;
                } else if (obj3 instanceof l43) {
                    beVar = be.o;
                } else if (obj3 instanceof h33) {
                    beVar = be.p;
                } else if (obj3 instanceof de1) {
                    beVar = be.q;
                } else if (obj3 instanceof ce1) {
                    beVar = be.r;
                } else {
                    if (!(obj3 instanceof jp2)) {
                        throw new UnsupportedOperationException();
                    }
                    beVar = be.s;
                }
                switch (beVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a = he2.a((ez1) obj3, he2.g, id2Var3);
                        break;
                    case 1:
                        obj3.getClass();
                        a = he2.a((un2) obj3, he2.h, id2Var3);
                        break;
                    case 2:
                        obj3.getClass();
                        a = he2.a((l43) obj3, he2.c, id2Var3);
                        break;
                    case 3:
                        obj3.getClass();
                        a = he2.a((h33) obj3, he2.d, id2Var3);
                        break;
                    case 4:
                        obj3.getClass();
                        a = he2.a((de1) obj3, he2.e, id2Var3);
                        break;
                    case 5:
                        obj3.getClass();
                        a = he2.a((ce1) obj3, he2.f, id2Var3);
                        break;
                    case 6:
                        obj3.getClass();
                        a = ((jp2) obj3).a;
                        break;
                    default:
                        a.b();
                        return null;
                }
                return qv.d(beVar, a, Integer.valueOf(xdVar.b), Integer.valueOf(xdVar.c), xdVar.d);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ce1 ce1Var = (ce1) obj2;
                return qv.d(ce1Var.a, he2.a(ce1Var.b, he2.i, (id2) obj));
            case 8:
                return ((l43) obj2).a;
            case 9:
                return ((h33) obj2).a;
            case 10:
                id2 id2Var4 = (id2) obj;
                ez1 ez1Var = (ez1) obj2;
                ut2 ut2Var = new ut2(ez1Var.a);
                au2 au2Var = new au2(ez1Var.b);
                Object a2 = he2.a(new sw2(ez1Var.c), he2.q, id2Var4);
                rv2 rv2Var = ez1Var.d;
                rv2 rv2Var2 = rv2.c;
                Object a3 = he2.a(rv2Var, he2.l, id2Var4);
                Object a4 = he2.a(ez1Var.e, iv1.e, id2Var4);
                ud1 ud1Var2 = ez1Var.f;
                ud1 ud1Var3 = ud1.c;
                return qv.d(ut2Var, au2Var, a2, a3, a4, he2.a(ud1Var2, he2.u, id2Var4), he2.a(new pd1(ez1Var.g), iv1.f, id2Var4), new mz0(ez1Var.h), he2.a(ez1Var.i, iv1.g, id2Var4));
            case 11:
                id2 id2Var5 = (id2) obj;
                un2 un2Var = (un2) obj2;
                aw awVar = new aw(un2Var.a.b());
                ge2 ge2Var = he2.p;
                Object a5 = he2.a(awVar, ge2Var, id2Var5);
                sw2 sw2Var2 = new sw2(un2Var.b);
                ge2 ge2Var2 = he2.q;
                Object a6 = he2.a(sw2Var2, ge2Var2, id2Var5);
                jq0 jq0Var = un2Var.c;
                jq0 jq0Var2 = jq0.n;
                Object a7 = he2.a(jq0Var, he2.m, id2Var5);
                fq0 fq0Var = un2Var.d;
                gq0 gq0Var = un2Var.e;
                String str = un2Var.g;
                Object a8 = he2.a(new sw2(un2Var.h), ge2Var2, id2Var5);
                Object a9 = he2.a(un2Var.i, he2.n, id2Var5);
                Object a10 = he2.a(un2Var.j, he2.k, id2Var5);
                sf1 sf1Var = un2Var.k;
                sf1 sf1Var2 = sf1.o;
                Object a11 = he2.a(sf1Var, he2.s, id2Var5);
                Object a12 = he2.a(new aw(un2Var.l), ge2Var, id2Var5);
                Object a13 = he2.a(un2Var.m, he2.j, id2Var5);
                dk2 dk2Var2 = un2Var.n;
                dk2 dk2Var3 = dk2.d;
                return qv.d(a5, a6, a7, fq0Var, gq0Var, -1, str, a8, a9, a10, a11, a12, a13, he2.a(dk2Var2, he2.o, id2Var5));
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                id2 id2Var6 = (id2) obj;
                fw2 fw2Var = (fw2) obj2;
                un2 un2Var2 = fw2Var.a;
                tt1 tt1Var = he2.h;
                return qv.d(he2.a(un2Var2, tt1Var, id2Var6), he2.a(fw2Var.b, tt1Var, id2Var6), he2.a(fw2Var.c, tt1Var, id2Var6), he2.a(fw2Var.d, tt1Var, id2Var6));
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                Boolean valueOf = Boolean.valueOf(((a22) obj2).a);
                tt1 tt1Var2 = he2.a;
                return qv.d(valueOf, new pg0());
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return Integer.valueOf(((pd1) obj2).a);
            case 15:
                hw2 hw2Var = (hw2) obj2;
                gw2 gw2Var = new gw2(hw2Var.a);
                tt1 tt1Var3 = he2.a;
                return qv.d(gw2Var, Boolean.valueOf(hw2Var.b));
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof yw2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                yw2 yw2Var = (yw2) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (yw2Var != null) {
                    return yw2Var;
                }
                if (element2 instanceof yw2) {
                    return (yw2) element2;
                }
                return null;
            default:
                gx2 gx2Var = (gx2) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (element3 instanceof yw2) {
                    yw2 yw2Var2 = (yw2) element3;
                    CoroutineContext coroutineContext = gx2Var.a;
                    ax2 ax2Var = (ax2) yw2Var2;
                    ThreadLocal threadLocal = ax2Var.n;
                    Object obj4 = threadLocal.get();
                    threadLocal.set(ax2Var.m);
                    Object[] objArr = gx2Var.b;
                    int i2 = gx2Var.d;
                    objArr[i2] = obj4;
                    yw2[] yw2VarArr = gx2Var.c;
                    gx2Var.d = i2 + 1;
                    yw2VarArr[i2] = yw2Var2;
                }
                return gx2Var;
        }
    }
}
