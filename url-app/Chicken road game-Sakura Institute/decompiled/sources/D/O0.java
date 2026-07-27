package D;

import A.C0022s;
import G.C0216p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.chicken.road.kedro.laqer.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import w.AbstractC1267g;

/* loaded from: classes.dex */
public final class O0 extends M2.p implements Function2 {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Function2 f1535A;
    public final /* synthetic */ Function2 B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Function2 f1536C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Z.P f1537D;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f1538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1539e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M0.b f1540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K1 f1542k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f1543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f1544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1546o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A0.L f1547p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w.O f1548q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w.N f1549r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f1550s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1551t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1552u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0022s f1553v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0935k f1554w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function2 f1555x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function2 f1556y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function2 f1557z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(S.o oVar, Function2 function2, M0.b bVar, boolean z4, K1 k12, String str, Function1 function1, boolean z5, boolean z6, A0.L l4, w.O o4, w.N n2, boolean z7, int i2, int i4, C0022s c0022s, C0935k c0935k, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Z.P p4) {
        super(2);
        this.f1538d = oVar;
        this.f1539e = function2;
        this.f1540i = bVar;
        this.f1541j = z4;
        this.f1542k = k12;
        this.f1543l = str;
        this.f1544m = function1;
        this.f1545n = z5;
        this.f1546o = z6;
        this.f1547p = l4;
        this.f1548q = o4;
        this.f1549r = n2;
        this.f1550s = z7;
        this.f1551t = i2;
        this.f1552u = i4;
        this.f1553v = c0022s;
        this.f1554w = c0935k;
        this.f1555x = function22;
        this.f1556y = function23;
        this.f1557z = function24;
        this.f1535A = function25;
        this.B = function26;
        this.f1536C = function27;
        this.f1537D = p4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        S.o oVar;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            if (this.f1539e != null) {
                C0173u c0173u = C0173u.f2036l;
                AtomicInteger atomicInteger = y0.k.f11579a;
                oVar = androidx.compose.foundation.layout.b.k(new AppendedSemanticsElement(c0173u, true), 0.0f, this.f1540i.j0(S0.f1618b), 0.0f, 13);
            } else {
                oVar = S.l.f3977a;
            }
            S.o h4 = this.f1538d.h(oVar);
            c0216p.k(AndroidCompositionLocals_androidKt.f5212a);
            String string = ((Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b)).getResources().getString(R.string.default_error_message);
            float f4 = E.v.f2252b;
            if (this.f1541j) {
                h4 = y0.k.a(h4, new C0144k(string, 1));
            }
            S.o a4 = androidx.compose.foundation.layout.c.a(h4, L0.f1477c, L0.f1476b);
            K1 k12 = this.f1542k;
            boolean z4 = this.f1541j;
            Z.S s4 = new Z.S(z4 ? k12.f1445j : k12.f1444i);
            Function2 function2 = this.f1536C;
            Z.P p4 = this.f1537D;
            String str = this.f1543l;
            boolean z5 = this.f1545n;
            boolean z6 = this.f1550s;
            C0022s c0022s = this.f1553v;
            C0935k c0935k = this.f1554w;
            AbstractC1267g.a(str, this.f1544m, a4, z5, this.f1546o, this.f1547p, this.f1548q, this.f1549r, z6, this.f1551t, this.f1552u, c0022s, null, c0935k, s4, O.f.b(1474611661, new N0(str, z5, z6, c0022s, c0935k, z4, this.f1539e, this.f1555x, this.f1556y, this.f1557z, this.f1535A, this.B, function2, k12, p4), c0216p), c0216p, 0, 196608);
        }
        return Unit.f7487a;
    }
}
