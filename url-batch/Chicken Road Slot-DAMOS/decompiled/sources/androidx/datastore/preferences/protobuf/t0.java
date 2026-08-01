package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f636c = new t0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f638b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f637a = new f0();

    public final w0 a(Class cls) {
        o oVar;
        w0 w6;
        Class cls2;
        x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f638b;
        w0 w0Var = (w0) concurrentHashMap.get(cls);
        if (w0Var != null) {
            return w0Var;
        }
        f0 f0Var = this.f637a;
        f0Var.getClass();
        Class cls3 = x0.f649a;
        if (!v.class.isAssignableFrom(cls) && (cls2 = x0.f649a) != null && !cls2.isAssignableFrom(cls)) {
            te.a1.e("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        v0 a9 = ((e0) f0Var.f538a).a(cls);
        int i3 = a9.f646d;
        a aVar = a9.f643a;
        if ((i3 & 2) == 2) {
            if (v.class.isAssignableFrom(cls)) {
                w6 = new o0(x0.f651c, p.f604a, aVar);
            } else {
                e1 e1Var = x0.f650b;
                o oVar2 = p.f605b;
                if (oVar2 == null) {
                    kotlin.collections.i0.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w6 = new o0(e1Var, oVar2, aVar);
            }
        } else if (v.class.isAssignableFrom(cls)) {
            p0 p0Var = q0.f610b;
            c0 c0Var = d0.f523b;
            e1 e1Var2 = x0.f651c;
            o oVar3 = a4.i.b(a9.a()) != 1 ? p.f604a : null;
            j0 j0Var = k0.f575b;
            if (!(a9 instanceof v0)) {
                int[] iArr = n0.f588n;
                a9.getClass();
                kotlin.collections.i0.j();
                return null;
            }
            w6 = n0.w(a9, p0Var, c0Var, e1Var2, oVar3, j0Var);
        } else {
            p0 p0Var2 = q0.f609a;
            c0 c0Var2 = d0.f522a;
            e1 e1Var3 = x0.f650b;
            if (a4.i.b(a9.a()) != 1) {
                o oVar4 = p.f605b;
                if (oVar4 == null) {
                    kotlin.collections.i0.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                oVar = oVar4;
            } else {
                oVar = null;
            }
            j0 j0Var2 = k0.f574a;
            if (!(a9 instanceof v0)) {
                int[] iArr2 = n0.f588n;
                a9.getClass();
                kotlin.collections.i0.j();
                return null;
            }
            w6 = n0.w(a9, p0Var2, c0Var2, e1Var3, oVar, j0Var2);
        }
        w0 w0Var2 = (w0) concurrentHashMap.putIfAbsent(cls, w6);
        return w0Var2 != null ? w0Var2 : w6;
    }
}
