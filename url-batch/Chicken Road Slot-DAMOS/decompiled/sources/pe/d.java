package pe;

import com.google.android.gms.internal.measurement.se;
import e3.o;
import hd.h;
import hd.i;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import te.a1;
import te.b1;
import wd.b0;
import wd.c0;
import wd.g0;
import y6.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ce.b f7706a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f7707b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7708c;

    public d(ce.b bVar) {
        bVar.getClass();
        this.f7706a = bVar;
        this.f7707b = j0.f5574d;
        this.f7708c = h.a(i.f4507d, new a1.b(19, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    @Override // pe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o oVar, Object obj) {
        a aVar;
        obj.getClass();
        se seVar = (se) oVar.f3830d;
        seVar.getClass();
        ce.b bVar = this.f7706a;
        bVar.getClass();
        wd.h hVar = (wd.h) bVar;
        if (hVar.d(obj)) {
            Map map = (Map) ((Map) seVar.f2799e).get(hVar);
            aVar = map != null ? (a) map.get(c0.a(obj.getClass())) : null;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar == null) {
                Object obj2 = ((Map) seVar.f2800i).get(hVar);
                Function1 function1 = g0.d(1, obj2) ? (Function1) obj2 : null;
                if (function1 != null) {
                    aVar = (a) function1.invoke(obj);
                }
            }
            if (aVar != null) {
                wd.h a9 = c0.a(obj.getClass());
                String c10 = a9.c();
                if (c10 == null) {
                    c10 = String.valueOf(a9);
                }
                b1.i(c10, bVar);
                throw null;
            }
            d().getClass();
            re.e d10 = d();
            String a10 = aVar.d().a();
            d10.getClass();
            a10.getClass();
            oVar.e(d10, 0);
            oVar.n(a10);
            oVar.k(d(), 1, aVar, obj);
            return;
        }
        aVar = null;
        if (aVar != null) {
        }
    }

    @Override // pe.a
    public final Object b(l lVar) {
        d().getClass();
        b0 b0Var = new b0();
        Object obj = null;
        while (true) {
            int a9 = lVar.a(d());
            if (a9 == -1) {
                if (obj != null) {
                    return obj;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) b0Var.f10141d)).toString());
            }
            if (a9 != 0) {
                Object obj2 = b0Var.f10141d;
                if (a9 != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) obj2;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(a9);
                    throw new ee.h(sb2.toString());
                }
                if (obj2 == null) {
                    a1.e("Cannot read polymorphic value before its type token");
                    return null;
                }
                b0Var.f10141d = obj2;
                String str2 = (String) obj2;
                se seVar = (se) lVar.f10662r;
                seVar.getClass();
                ce.b bVar = this.f7706a;
                bVar.getClass();
                Map map = (Map) ((Map) seVar.f2801r).get(bVar);
                a aVar = map != null ? (a) map.get(str2) : null;
                if (aVar == null) {
                    aVar = null;
                }
                if (aVar == null) {
                    Object obj3 = ((Map) seVar.f2802s).get(bVar);
                    Function1 function1 = g0.d(1, obj3) ? (Function1) obj3 : null;
                    aVar = function1 != null ? (a) function1.invoke(str2) : null;
                }
                if (aVar == null) {
                    b1.i(str2, bVar);
                    throw null;
                }
                obj = l.d(lVar, d(), a9, aVar);
            } else {
                d().getClass();
                b0Var.f10141d = (String) lVar.e();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    @Override // pe.a
    public final re.e d() {
        return (re.e) this.f7708c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f7706a + ')';
    }
}
