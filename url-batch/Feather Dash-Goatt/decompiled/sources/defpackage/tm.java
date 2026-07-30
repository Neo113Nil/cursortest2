package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tm implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tm(wm wmVar, sl1 sl1Var, jb0 jb0Var, b81 b81Var) {
        this.d = 0;
        this.e = wmVar;
        this.g = jb0Var;
        this.h = b81Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01ae  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float b;
        Iterator it;
        Iterator it2;
        Map map;
        int i = this.d;
        int i2 = 1;
        dn dnVar = null;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                wm wmVar = (wm) obj4;
                jb0 jb0Var = (jb0) obj3;
                b81 b81Var = (b81) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = wmVar.u ? 1.0f : -1.0f;
                d81 d81Var = wmVar.t;
                long e = d81Var.e(d81Var.h(f * floatValue));
                d81 d81Var2 = b81Var.a;
                float g = d81Var.g(d81Var.e(d81Var2.c(d81Var2.k, e, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    jb0Var.a(cancellationException);
                }
                return Unit.a;
            case 1:
                uy uyVar = uy.q;
                e40 e40Var = (e40) obj4;
                t5 t5Var = (t5) obj3;
                Map map2 = (Map) obj2;
                hu huVar = (hu) obj;
                huVar.getClass();
                e40Var.getClass();
                t5Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) * 0.02f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) * 0.92f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (huVar.x() >> 32)) * 0.24f;
                float f2 = (0.78f * intBitsToFloat2) + intBitsToFloat;
                long j = e40Var.g;
                if (j > 0) {
                    long j2 = e40Var.h;
                    long j3 = j + j2;
                    if (j3 > 0) {
                        float b2 = b11.b(j2 / j3, 0.0f, 1.0f);
                        float sin = (float) Math.sin(b2 * 3.141592653589793d);
                        float f3 = e40Var.i;
                        b = b11.b(((1.0f - (f3 * 0.35f)) * sin) + ((1.0f - b2) * f3), 0.0f, 1.15f);
                        float f4 = f2 - ((b * intBitsToFloat2) * 0.28f);
                        hu.V(huVar, la0.c(134228032), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (huVar.x() >> 32))) << 32), 120);
                        huVar.o(la0.c(1426063360), (Float.floatToRawIntBits(intBitsToFloat3 - 48.0f) << 32) | (Float.floatToRawIntBits(f2 + 44.0f) & 4294967295L), (Float.floatToRawIntBits(16.0f) & 4294967295L) | (Float.floatToRawIntBits(96.0f) << 32), (Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L), uyVar);
                        it = e40Var.f.iterator();
                        while (it.hasNext()) {
                            y50 y50Var = (y50) it.next();
                            t5 t5Var2 = (t5) map2.get(y50Var.b);
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (huVar.x() >> 32));
                            float f5 = y50Var.c;
                            z50 z50Var = y50Var.b;
                            float f6 = intBitsToFloat4 * f5;
                            if (-180.0f > f6 || f6 > Float.intBitsToFloat((int) (huVar.x() >> 32)) + 220.0f) {
                                it2 = it;
                                map = map2;
                            } else {
                                float b3 = b11.b(va1.b(huVar.x()) / 360.0f, 0.86f, 1.22f);
                                float f7 = 4.05f * z50Var.d * b3;
                                float f8 = z50Var.e * intBitsToFloat2 * 1.32f;
                                float f9 = b3 * 52.0f;
                                if (f8 < f9) {
                                    f8 = f9;
                                }
                                if (t5Var2 != null) {
                                    i8 v = huVar.v();
                                    long i3 = v.i();
                                    v.g().k();
                                    try {
                                        it2 = it;
                                        map = map2;
                                        ((s40) v.e).x(-1.0f, 1.0f, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
                                        hu huVar2 = huVar;
                                        hu.R(huVar2, t5Var2, 0L, (((int) (f6 - (f7 / 2.0f))) << 32) | (((int) (f2 - (f8 / 2.0f))) & 4294967295L), (((int) f7) << 32) | (((int) f8) & 4294967295L), 0.0f, null, 0, 998);
                                        huVar = huVar2;
                                    } finally {
                                        qy0.s(v, i3);
                                    }
                                } else {
                                    it2 = it;
                                    map = map2;
                                    huVar.o(la0.d(4293108514L), (Float.floatToRawIntBits(f6 - (r7 / 2.0f)) << 32) | (Float.floatToRawIntBits(f2 - (f8 / 2.0f)) & 4294967295L), (Float.floatToRawIntBits(r7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(10.0f) & 4294967295L) | (Float.floatToRawIntBits(10.0f) << 32), uyVar);
                                }
                            }
                            it = it2;
                            map2 = map;
                        }
                        int b4 = (int) b11.b(va1.b(huVar.x()) * 0.3f, 112.0f, 150.0f);
                        float f10 = b4 / 2.0f;
                        long j4 = b4;
                        hu.R(huVar, t5Var, 0L, (((int) (intBitsToFloat3 - f10)) << 32) | (((int) (f4 - f10)) & 4294967295L), (j4 << 32) | (j4 & 4294967295L), 0.0f, null, 0, 998);
                        return Unit.a;
                    }
                }
                b = 0.0f;
                float f42 = f2 - ((b * intBitsToFloat2) * 0.28f);
                hu.V(huVar, la0.c(134228032), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (huVar.x() >> 32))) << 32), 120);
                huVar.o(la0.c(1426063360), (Float.floatToRawIntBits(intBitsToFloat3 - 48.0f) << 32) | (Float.floatToRawIntBits(f2 + 44.0f) & 4294967295L), (Float.floatToRawIntBits(16.0f) & 4294967295L) | (Float.floatToRawIntBits(96.0f) << 32), (Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L), uyVar);
                it = e40Var.f.iterator();
                while (it.hasNext()) {
                }
                int b42 = (int) b11.b(va1.b(huVar.x()) * 0.3f, 112.0f, 150.0f);
                float f102 = b42 / 2.0f;
                long j42 = b42;
                hu.R(huVar, t5Var, 0L, (((int) (intBitsToFloat3 - f102)) << 32) | (((int) (f42 - f102)) & 4294967295L), (j42 << 32) | (j42 & 4294967295L), 0.0f, null, 0, 998);
                return Unit.a;
            case 2:
                ao0 ao0Var = (ao0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                yw0 yw0Var = (yw0) obj;
                yw0Var.d = true;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((sf0) arrayList.get(i4)).b(yw0Var);
                }
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((sf0) list.get(i5)).b(yw0Var);
                }
                yw0Var.d = false;
                ao0Var.getValue();
                return Unit.a;
            case 3:
                r51 r51Var = (r51) obj4;
                w51 w51Var = (w51) obj2;
                vn0 vn0Var = r51Var.e;
                if (vn0Var.b(obj3)) {
                    dd0.k("Key ", obj3, " was used multiple times ");
                    return null;
                }
                r51Var.d.remove(obj3);
                vn0Var.m(obj3, w51Var);
                return new q51(r51Var, obj3, w51Var);
            default:
                ((Boolean) obj).getClass();
                ((ao0) obj3).setValue(Boolean.TRUE);
                uq1.N((sn) obj4, null, new fd1((nd1) obj2, dnVar, i2), 3);
                return Unit.a;
        }
    }

    public /* synthetic */ tm(ao0 ao0Var, ArrayList arrayList, List list, boolean z) {
        this.d = 2;
        this.e = ao0Var;
        this.g = arrayList;
        this.h = list;
    }

    public /* synthetic */ tm(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
