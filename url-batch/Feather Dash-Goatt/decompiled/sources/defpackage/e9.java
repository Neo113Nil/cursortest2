package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ e9(int i) {
        this.d = 9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        c cVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Integer.valueOf(Math.round((1.0f + 0.0f) * ((((Integer) obj).intValue() - 0) / 2.0f)));
            case 1:
                return Integer.valueOf(Math.round((1.0f + (((vc0) obj2) == vc0.d ? -1.0f : 1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 2:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 3:
                hl hlVar = (hl) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    hlVar.R();
                }
                return Unit.a;
            case 4:
                hl hlVar2 = (hl) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!hlVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    hlVar2.R();
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element2.getClass();
                CoroutineContext w = coroutineContext.w(element2.getKey());
                g gVar = g.d;
                if (w == gVar) {
                    return element2;
                }
                gn gnVar = d.f;
                d dVar = (d) w.d(gnVar);
                if (dVar == null) {
                    cVar = new c(element2, w);
                } else {
                    CoroutineContext w2 = w.w(gnVar);
                    if (w2 == gVar) {
                        return new c(dVar, element2);
                    }
                    cVar = new c(dVar, new c(element2, w2));
                }
                return cVar;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((CoroutineContext) obj).i((CoroutineContext.Element) obj2);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((CoroutineContext) obj).i((CoroutineContext.Element) obj2);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 9:
                ((Integer) obj2).getClass();
                uq1.j(gb0.P(1), (hl) obj);
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                wf0 wf0Var = (wf0) obj2;
                return zh.e(Integer.valueOf(((xu0) wf0Var.e.b).h()), Integer.valueOf(((xu0) wf0Var.e.c).h()));
            case RequestError.STOP_TRACKING /* 11 */:
                Map c = ((zf0) obj2).c();
                if (c.isEmpty()) {
                    return null;
                }
                return c;
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 13:
                r51 r51Var = (r51) obj2;
                Map map = r51Var.d;
                vn0 vn0Var = r51Var.e;
                Object[] objArr = vn0Var.b;
                Object[] objArr2 = vn0Var.c;
                long[] jArr = vn0Var.a;
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
                                    Map c2 = ((t51) objArr2[i4]).c();
                                    if (c2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c2);
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
            case 14:
                return obj2;
            case 15:
                y7 y7Var = (y7) obj2;
                return zh.c(y7Var.e, o61.a(y7Var.d, o61.a, (o51) obj));
            case 16:
                return Integer.valueOf(((wg1) obj2).a);
            case 17:
                ah1 ah1Var = (ah1) obj2;
                return zh.c(Float.valueOf(ah1Var.a), Float.valueOf(ah1Var.b));
            case 18:
                o51 o51Var = (o51) obj;
                bh1 bh1Var = (bh1) obj2;
                wh1 wh1Var = new wh1(bh1Var.a);
                n61 n61Var = o61.v;
                return zh.c(o61.a(wh1Var, n61Var, o51Var), o61.a(new wh1(bh1Var.b), n61Var, o51Var));
            case 19:
                return Integer.valueOf(((x20) obj2).d);
            case 20:
                qh0 qh0Var = (qh0) obj2;
                return zh.c(qh0Var.a, o61.a(qh0Var.b, o61.i, (o51) obj));
            case 21:
                return Float.valueOf(((ad) obj2).a);
            case 22:
                o51 o51Var2 = (o51) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(o61.a((x7) list.get(i5), o61.b, o51Var2));
                }
                return arrayList;
            case 23:
                mh1 mh1Var = (mh1) obj2;
                return zh.c(Integer.valueOf((int) (mh1Var.a >> 32)), Integer.valueOf((int) (mh1Var.a & 4294967295L)));
            case 24:
                o51 o51Var3 = (o51) obj;
                s91 s91Var = (s91) obj2;
                return zh.c(o61.a(new hi(s91Var.a), o61.p, o51Var3), o61.a(new wq0(s91Var.b), o61.x, o51Var3), Float.valueOf(s91Var.c));
            case 25:
                return Integer.valueOf(((tg1) obj2).a);
            case 26:
                return Integer.valueOf(((yg1) obj2).a);
            case 27:
                return Integer.valueOf(((s60) obj2).a);
            case 28:
                return Integer.valueOf(((t20) obj2).a);
            default:
                return Integer.valueOf(((u20) obj2).a);
        }
    }

    public /* synthetic */ e9(int i, byte b) {
        this.d = i;
    }
}
