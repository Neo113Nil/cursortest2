package t;

import I.C;
import I.C0106l0;
import I.InterfaceC0088c0;
import android.content.Context;
import android.view.Choreographer;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import h1.C0438i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m.C0584I;
import r0.G;
import r0.H;
import u.P;
import u0.C0982l;
import u0.N;
import u0.O;
import u0.S;
import u0.Y0;
import u0.Z0;

/* loaded from: classes.dex */
public final class o extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, int i3, Object obj2) {
        super(1);
        this.f7626e = i3;
        this.f7627f = obj;
        this.f7628g = obj2;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f7626e) {
            case 0:
                G g3 = (G) obj;
                ArrayList arrayList = (ArrayList) this.f7627f;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    q qVar = (q) arrayList.get(i3);
                    if (qVar.f7656n == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first");
                    }
                    List list = qVar.f7648f;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        H h3 = (H) list.get(i4);
                        int i5 = h3.f7115e;
                        long j3 = qVar.p;
                        qVar.f7651i.a(i4, qVar.f7644b);
                        if (qVar.f7646d) {
                            j3 = I2.d.c((int) (j3 >> 32), (qVar.f7656n - ((int) (j3 & 4294967295L))) - h3.f7115e);
                        }
                        G.i(g3, h3, M0.g.c(j3, qVar.f7649g));
                    }
                }
                ((InterfaceC0088c0) this.f7628g).getValue();
                return L1.z.f2729a;
            case 1:
                P p = (P) this.f7627f;
                LinkedHashSet linkedHashSet = p.f8033c;
                Object obj2 = this.f7628g;
                linkedHashSet.remove(obj2);
                return new C0584I(p, 6, obj2);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Context context = (Context) this.f7627f;
                Context applicationContext = context.getApplicationContext();
                N n3 = (N) this.f7628g;
                applicationContext.registerComponentCallbacks(n3);
                return new C0584I(context, 7, n3);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                Context context2 = (Context) this.f7627f;
                Context applicationContext2 = context2.getApplicationContext();
                O o3 = (O) this.f7628g;
                applicationContext2.registerComponentCallbacks(o3);
                return new C0584I(context2, 8, o3);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                S s3 = (S) this.f7627f;
                C c3 = (C) this.f7628g;
                synchronized (s3.f8237h) {
                    s3.f8239j.remove(c3);
                }
                return L1.z.f2729a;
            case 5:
                ((Choreographer) ((C0106l0) this.f7627f).f2274e).removeFrameCallback((C) this.f7628g);
                return L1.z.f2729a;
            default:
                C0982l c0982l = (C0982l) obj;
                Z0 z02 = (Z0) this.f7627f;
                if (!z02.f8275f) {
                    C0238x e3 = c0982l.f8360a.e();
                    Q.a aVar = (Q.a) this.f7628g;
                    z02.f8277h = aVar;
                    if (z02.f8276g == null) {
                        z02.f8276g = e3;
                        e3.a(z02);
                    } else if (e3.f4041d.compareTo(EnumC0230o.f4027f) >= 0) {
                        z02.f8274e.j(new Q.a(-2000640158, new Y0(z02, aVar, 1), true));
                    }
                }
                return L1.z.f2729a;
        }
    }
}
