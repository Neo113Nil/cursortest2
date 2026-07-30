package defpackage;

import androidx.compose.foundation.layout.b;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ww implements Function2 {
    public final /* synthetic */ int m;

    public /* synthetic */ ww(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar;
        switch (this.m) {
            case 0:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 1:
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    k01.a(z71.u(), uj2.f(R.string.cd_back, a00Var), null, cw.u, a00Var, 3072, 4);
                } else {
                    a00Var.S();
                }
                return Unit.a;
            case 2:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yv2.b(uj2.f(R.string.atlas_search, a00Var2), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var2, 384, 0, 131066);
                } else {
                    a00Var2.S();
                }
                return Unit.a;
            case 3:
                a00 a00Var3 = (a00) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (a00Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    k01.a(bd3.z(), null, null, cw.i, a00Var3, 3120, 4);
                } else {
                    a00Var3.S();
                }
                return Unit.a;
            case 4:
                a00 a00Var4 = (a00) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    k01.a(z71.u(), uj2.f(R.string.cd_back, a00Var4), null, cw.h, a00Var4, 3072, 4);
                } else {
                    a00Var4.S();
                }
                return Unit.a;
            case 5:
                a00 a00Var5 = (a00) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (a00Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    k01.a(z71.u(), uj2.f(R.string.cd_back, a00Var5), null, cw.u, a00Var5, 3072, 4);
                } else {
                    a00Var5.S();
                }
                return Unit.a;
            case 6:
                a00 a00Var6 = (a00) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (a00Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    x01 x01Var = nk2.a;
                    if (x01Var == null) {
                        w01 w01Var = new w01("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        ah0 ah0Var = y33.a;
                        nn2 nn2Var = new nn2(aw.b);
                        lx0 lx0Var = new lx0(1);
                        lx0Var.k(18.0f, 16.08f);
                        lx0Var.f(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        lx0Var.i(8.91f, 12.7f);
                        lx0Var.f(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        lx0Var.m(-0.04f, -0.47f, -0.09f, -0.7f);
                        lx0Var.j(7.05f, -4.11f);
                        lx0Var.f(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        lx0Var.f(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        lx0Var.m(-1.34f, -3.0f, -3.0f, -3.0f);
                        lx0Var.m(-3.0f, 1.34f, -3.0f, 3.0f);
                        lx0Var.f(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        lx0Var.i(8.04f, 9.81f);
                        lx0Var.e(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        lx0Var.f(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        lx0Var.m(1.34f, 3.0f, 3.0f, 3.0f);
                        lx0Var.f(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        lx0Var.j(7.12f, 4.16f);
                        lx0Var.f(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        lx0Var.f(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        lx0Var.f(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                        lx0Var.m(-1.31f, -2.92f, -2.92f, -2.92f);
                        lx0Var.d();
                        w01.a(w01Var, lx0Var.m, nn2Var);
                        x01Var = w01Var.b();
                        nk2.a = x01Var;
                    }
                    k01.a(x01Var, uj2.f(R.string.btn_share, a00Var6), null, cw.u, a00Var6, 3072, 4);
                } else {
                    a00Var6.S();
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                a00 a00Var7 = (a00) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (a00Var7.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ph2.b(null, a00Var7, 0);
                } else {
                    a00Var7.S();
                }
                return Unit.a;
            case 8:
                a00 a00Var8 = (a00) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (a00Var8.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    kr2.a(b.b(sl1.a, 1.0f), null, 0L, 0L, z71.q, a00Var8, 12582918, 126);
                } else {
                    a00Var8.S();
                }
                return Unit.a;
            case 9:
                a00 a00Var9 = (a00) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (a00Var9.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ww2.a(false, z71.r, a00Var9, 432);
                } else {
                    a00Var9.S();
                }
                return Unit.a;
            case 10:
                a00 a00Var10 = (a00) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (a00Var10.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    yv2.b(uj2.f(R.string.search_hint, a00Var10), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var10, 384, 0, 131066);
                } else {
                    a00Var10.S();
                }
                return Unit.a;
            case 11:
                a00 a00Var11 = (a00) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (a00Var11.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    k01.a(bd3.z(), null, null, cw.i, a00Var11, 3120, 4);
                } else {
                    a00Var11.S();
                }
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                a00 a00Var12 = (a00) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (a00Var12.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    yv2.b(uj2.f(R.string.clear_confirm_title, a00Var12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var12, 0, 0, 131070);
                } else {
                    a00Var12.S();
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                a00 a00Var13 = (a00) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (a00Var13.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    yv2.b(uj2.f(R.string.clear_confirm_body, a00Var13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var13, 0, 0, 131070);
                } else {
                    a00Var13.S();
                }
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element2.getClass();
                CoroutineContext H = coroutineContext.H(element2.getKey());
                h hVar = h.m;
                if (H == hVar) {
                    return element2;
                }
                s30 s30Var = e.d;
                e eVar = (e) H.m(s30Var);
                if (eVar == null) {
                    dVar = new d(element2, H);
                } else {
                    CoroutineContext H2 = H.H(s30Var);
                    if (H2 == hVar) {
                        return new d(eVar, element2);
                    }
                    dVar = new d(eVar, new d(element2, H2));
                }
                return dVar;
            case 15:
                return ((CoroutineContext) obj).p((CoroutineContext.Element) obj2);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return ((CoroutineContext) obj).p((CoroutineContext.Element) obj2);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 19:
                kd2 kd2Var = (kd2) obj2;
                Map map = kd2Var.m;
                tn1 tn1Var = kd2Var.n;
                Object[] objArr = tn1Var.b;
                Object[] objArr2 = tn1Var.c;
                long[] jArr = tn1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map b = ((ld2) objArr2[i4]).b();
                                    if (b.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, b);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 20:
                return obj2;
            case 21:
                yd ydVar = (yd) obj2;
                return qv.d(ydVar.n, he2.a(ydVar.m, he2.a, (id2) obj));
            case 22:
                return Integer.valueOf(((xt2) obj2).a);
            case 23:
                qv2 qv2Var = (qv2) obj2;
                return qv.d(Float.valueOf(qv2Var.a), Float.valueOf(qv2Var.b));
            case 24:
                id2 id2Var = (id2) obj;
                rv2 rv2Var = (rv2) obj2;
                sw2 sw2Var = new sw2(rv2Var.a);
                ge2 ge2Var = he2.q;
                return qv.d(he2.a(sw2Var, ge2Var, id2Var), he2.a(new sw2(rv2Var.b), ge2Var, id2Var));
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return Integer.valueOf(((jq0) obj2).m);
            case 26:
                de1 de1Var = (de1) obj2;
                return qv.d(de1Var.a, he2.a(de1Var.b, he2.i, (id2) obj));
            case 27:
                return Float.valueOf(((nn) obj2).a);
            case 28:
                id2 id2Var2 = (id2) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(he2.a((xd) list.get(i5), he2.b, id2Var2));
                }
                return arrayList;
            default:
                jw2 jw2Var = (jw2) obj2;
                return qv.d(Integer.valueOf((int) (jw2Var.a >> 32)), Integer.valueOf((int) (jw2Var.a & 4294967295L)));
        }
    }
}
