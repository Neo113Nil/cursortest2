package n4;

import c2.w1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s.s0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends t {
    public final i0 g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7126h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7127i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i0 i0Var, Object obj, Map map) {
        super(i0Var.b(cf.c.x(w.class)), null, map);
        i0Var.getClass();
        obj.getClass();
        map.getClass();
        this.f7127i = new ArrayList();
        this.g = i0Var;
        this.f7126h = obj;
    }

    public final u i() {
        int hashCode;
        u uVar = (u) super.a();
        ArrayList arrayList = this.f7127i;
        arrayList.getClass();
        e3.o oVar = uVar.f7125t;
        oVar.getClass();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            s sVar = (s) obj;
            if (sVar != null) {
                w1 w1Var = sVar.f7115e;
                s0 s0Var = (s0) oVar.f3829c;
                u uVar2 = (u) oVar.f3828b;
                w1 w1Var2 = uVar2.f7115e;
                int i10 = w1Var.f1694a;
                String str = (String) w1Var.f1698e;
                if (i10 == 0 && str == null) {
                    a1.e("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) w1Var2.f1698e;
                if (str2 != null && Intrinsics.a(str, str2)) {
                    kotlin.collections.i0.h("Destination ", sVar, " cannot have the same route as graph ", uVar2);
                    return null;
                }
                if (i10 == w1Var2.f1694a) {
                    kotlin.collections.i0.h("Destination ", sVar, " cannot have the same id as graph ", uVar2);
                    return null;
                }
                s sVar2 = (s) s0Var.c(i10);
                if (sVar2 == sVar) {
                    continue;
                } else {
                    if (sVar.f7116i != null) {
                        kotlin.collections.i0.l("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (sVar2 != null) {
                        sVar2.f7116i = null;
                    }
                    sVar.f7116i = uVar2;
                    s0Var.e(w1Var.f1694a, sVar);
                }
            }
        }
        Object obj2 = this.f7126h;
        if (obj2 == null) {
            if (this.f7118a != null) {
                kotlin.collections.i0.l("You must set a start destination route");
                return null;
            }
            kotlin.collections.i0.l("You must set a start destination id");
            return null;
        }
        pe.a G = cf.c.G(wd.c0.a(obj2.getClass()));
        int b10 = r4.d.b(G);
        s p4 = oVar.p(b10);
        if (p4 == null) {
            kotlin.collections.i0.k(G.d().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
            return null;
        }
        Map c10 = p4.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
        for (Map.Entry entry : c10.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((g) entry.getValue()).f7058a);
        }
        String c11 = r4.d.c(obj2, linkedHashMap);
        u uVar3 = (u) oVar.f3828b;
        if (c11 != null) {
            if (c11.equals((String) uVar3.f7115e.f1698e)) {
                kotlin.collections.i0.h("Start destination ", c11, " cannot use the same route as the graph ", uVar3);
            } else if (StringsKt.r(c11)) {
                a1.e("Cannot have an empty start destination route");
            } else {
                int i11 = s.f7113s;
                hashCode = "android-app://androidx.navigation/".concat(c11).hashCode();
            }
            oVar.f3827a = b10;
            return uVar;
        }
        hashCode = 0;
        oVar.f3827a = hashCode;
        oVar.f3831e = c11;
        oVar.f3827a = b10;
        return uVar;
    }
}
