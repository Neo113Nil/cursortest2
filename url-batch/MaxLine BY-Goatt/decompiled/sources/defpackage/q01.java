package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q01 {
    public final Context a;
    public r80 b;
    public Object c;
    public at2 d;
    public s32 e;
    public final List f;
    public final lx0 g;
    public final LinkedHashMap h;
    public final boolean i;
    public final boolean j;
    public final zg1 k;
    public sl2 l;
    public me2 m;
    public ad1 n;
    public sl2 o;
    public me2 p;

    public q01(r01 r01Var, Context context) {
        this.a = context;
        this.b = r01Var.z;
        this.c = r01Var.b;
        this.d = r01Var.c;
        l90 l90Var = r01Var.y;
        this.e = l90Var.c;
        this.f = r01Var.f;
        this.g = r01Var.h.c();
        Map map = r01Var.i.a;
        map.getClass();
        this.h = new LinkedHashMap(map);
        this.i = r01Var.j;
        this.j = r01Var.m;
        gz1 gz1Var = r01Var.x;
        gz1Var.getClass();
        this.k = new zg1(gz1Var);
        this.l = l90Var.a;
        this.m = l90Var.b;
        if (r01Var.a == context) {
            this.n = r01Var.u;
            this.o = r01Var.v;
            this.p = r01Var.w;
        } else {
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    public final r01 a() {
        sl2 sl2Var;
        Object obj = this.c;
        if (obj == null) {
            obj = qb2.d0;
        }
        Object obj2 = obj;
        at2 at2Var = this.d;
        r80 r80Var = this.b;
        Bitmap.Config config = r80Var.g;
        s32 s32Var = this.e;
        if (s32Var == null) {
            s32Var = r80Var.f;
        }
        s32 s32Var2 = s32Var;
        ts1 ts1Var = r80Var.e;
        lx0 lx0Var = this.g;
        mx0 c = lx0Var != null ? lx0Var.c() : null;
        if (c == null) {
            c = l.c;
        } else {
            Bitmap.Config[] configArr = l.a;
        }
        mx0 mx0Var = c;
        LinkedHashMap linkedHashMap = this.h;
        ns2 ns2Var = linkedHashMap != null ? new ns2(ll3.a0(linkedHashMap)) : null;
        if (ns2Var == null) {
            ns2Var = ns2.b;
        }
        ns2 ns2Var2 = ns2Var;
        r80 r80Var2 = this.b;
        boolean z = r80Var2.h;
        r80Var2.getClass();
        r80 r80Var3 = this.b;
        kr krVar = r80Var3.i;
        kr krVar2 = r80Var3.j;
        kr krVar3 = r80Var3.k;
        t40 t40Var = r80Var3.a;
        t40 t40Var2 = r80Var3.b;
        t40 t40Var3 = r80Var3.c;
        t40 t40Var4 = r80Var3.d;
        ad1 ad1Var = this.n;
        Context context = this.a;
        if (ad1Var == null) {
            Object obj3 = context;
            while (true) {
                if (obj3 instanceof id1) {
                    ad1Var = ((id1) obj3).getLifecycle();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    ad1Var = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (ad1Var == null) {
                ad1Var = gv0.a;
            }
        }
        ad1 ad1Var2 = ad1Var;
        sl2 sl2Var2 = this.l;
        if (sl2Var2 == null) {
            sl2 sl2Var3 = this.o;
            if (sl2Var3 == null) {
                sl2Var3 = new zb0(context);
            }
            sl2Var = sl2Var3;
        } else {
            sl2Var = sl2Var2;
        }
        me2 me2Var = this.m;
        if (me2Var == null && (me2Var = this.p) == null) {
            if ((sl2Var2 instanceof z53 ? (z53) sl2Var2 : null) != null) {
                throw null;
            }
            me2Var = me2.n;
        }
        me2 me2Var2 = me2Var;
        zg1 zg1Var = this.k;
        gz1 gz1Var = zg1Var != null ? new gz1(ll3.a0(zg1Var.a)) : null;
        if (gz1Var == null) {
            gz1Var = gz1.n;
        }
        return new r01(context, obj2, at2Var, config, s32Var2, this.f, ts1Var, mx0Var, ns2Var2, this.i, z, false, this.j, krVar, krVar2, krVar3, t40Var, t40Var2, t40Var3, t40Var4, ad1Var2, sl2Var, me2Var2, gz1Var, new l90(this.l, this.m, this.e), this.b);
    }

    public q01(Context context) {
        this.a = context;
        this.b = k.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = ah0.m;
        this.g = null;
        this.h = null;
        this.i = true;
        this.j = true;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
