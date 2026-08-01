package q4;

import com.appsflyer.attribution.RequestError;
import id.l;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import n4.b0;
import n4.s;
import te.a1;
import v.a0;
import v.h0;
import x2.k;
import x3.s0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7988d;

    public /* synthetic */ f(u8.g gVar) {
        this.f7988d = 3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7988d) {
            case 0:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                b0Var.f7033c = true;
                return Unit.f5554a;
            case 1:
                s sVar = (s) obj;
                sVar.getClass();
                return Integer.valueOf(sVar.f7115e.f1694a);
            case 2:
                r5.c cVar = (r5.c) obj;
                cVar.getClass();
                return cVar;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b4.a aVar = (b4.a) obj;
                b4.c cVar2 = u8.g.f9697c;
                Map a9 = aVar.a();
                LinkedHashMap linkedHashMap = aVar.f1092a;
                long j = 0;
                for (Map.Entry entry : a9.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        b4.c cVar3 = (b4.c) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String b10 = u8.g.b(System.currentTimeMillis());
                        if (set.contains(b10)) {
                            Object[] objArr = {b10};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                a1.d(obj2, "duplicate element: ");
                                return null;
                            }
                            aVar.c(cVar3, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            cVar3.getClass();
                            aVar.b();
                            linkedHashMap.remove(cVar3);
                        }
                    }
                }
                if (j != 0) {
                    aVar.c(cVar2, Long.valueOf(j));
                    return null;
                }
                cVar2.getClass();
                aVar.b();
                linkedHashMap.remove(cVar2);
                return null;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                h0 h0Var = (h0) obj;
                long j3 = h0Var.f9812t;
                b1.b0 b0Var2 = h0Var.f9814v;
                if (b0Var2 != null) {
                    b0Var2.c(h0Var, v.c.j, h0Var.f9813u);
                }
                long j10 = h0Var.f9812t;
                if (j3 != j10) {
                    a0 a0Var = h0Var.C;
                    if (a0Var != null) {
                        if (a0Var.f9724a > j10) {
                            h0Var.y();
                        } else {
                            a0Var.g = j10;
                            if (a0Var.f9725b == null) {
                                a0Var.f9730h = yd.c.b((1.0d - a0Var.f9728e.a(0)) * h0Var.f9812t);
                            }
                        }
                    } else if (j10 != 0) {
                        h0Var.B();
                    }
                }
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return new v.h(((Float) obj).floatValue());
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new v.h(((Integer) obj).intValue());
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf((int) ((v.h) obj).f9807a);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new v.h(((x2.f) obj).f10322d);
            case 9:
                return new x2.f(((v.h) obj).f9807a);
            case 10:
                x2.g gVar = (x2.g) obj;
                return new v.i(Float.intBitsToFloat((int) (gVar.f10323a >> 32)), Float.intBitsToFloat((int) (gVar.f10323a & 4294967295L)));
            case RequestError.STOP_TRACKING /* 11 */:
                v.i iVar = (v.i) obj;
                return new x2.g((Float.floatToRawIntBits(iVar.f9819a) << 32) | (Float.floatToRawIntBits(iVar.f9820b) & 4294967295L));
            case 12:
                j1.e eVar = (j1.e) obj;
                return new v.i(Float.intBitsToFloat((int) (eVar.f4927a >> 32)), Float.intBitsToFloat((int) (eVar.f4927a & 4294967295L)));
            case 13:
                v.i iVar2 = (v.i) obj;
                return new j1.e((Float.floatToRawIntBits(iVar2.f9819a) << 32) | (Float.floatToRawIntBits(iVar2.f9820b) & 4294967295L));
            case 14:
                j1.b bVar = (j1.b) obj;
                return new v.i(Float.intBitsToFloat((int) (bVar.f4914a >> 32)), Float.intBitsToFloat((int) (bVar.f4914a & 4294967295L)));
            case 15:
                v.i iVar3 = (v.i) obj;
                return new j1.b((Float.floatToRawIntBits(iVar3.f9819a) << 32) | (Float.floatToRawIntBits(iVar3.f9820b) & 4294967295L));
            case 16:
                long j11 = ((x2.i) obj).f10324a;
                return new v.i((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case 17:
                v.i iVar4 = (v.i) obj;
                return new x2.i((Math.round(iVar4.f9819a) << 32) | (Math.round(iVar4.f9820b) & 4294967295L));
            case 18:
                long j12 = ((k) obj).f10329a;
                return new v.i((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 19:
                v.i iVar5 = (v.i) obj;
                int round = Math.round(iVar5.f9819a);
                if (round < 0) {
                    round = 0;
                }
                return new k(((Math.round(iVar5.f9820b) >= 0 ? r12 : 0) & 4294967295L) | (round << 32));
            case 20:
                j1.c cVar4 = (j1.c) obj;
                return new v.k(cVar4.f4916a, cVar4.f4917b, cVar4.f4918c, cVar4.f4919d);
            case 21:
                v.k kVar = (v.k) obj;
                return new j1.c(kVar.f9828a, kVar.f9829b, kVar.f9830c, kVar.f9831d);
            case 22:
                return Float.valueOf(((v.h) obj).f9807a);
            case 23:
                return Unit.f5554a;
            case 24:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new s0(absolutePath);
            case 25:
                i5.c cVar5 = (i5.c) obj;
                cVar5.getClass();
                return Boolean.valueOf(cVar5.E());
            default:
                i5.c cVar6 = (i5.c) obj;
                cVar6.getClass();
                l lVar = new l();
                while (cVar6.E()) {
                    lVar.add(Integer.valueOf((int) cVar6.getLong(0)));
                }
                return u0.a(lVar);
        }
    }

    public /* synthetic */ f(int i3) {
        this.f7988d = i3;
    }
}
