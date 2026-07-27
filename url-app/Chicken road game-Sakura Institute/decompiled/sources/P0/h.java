package P0;

import A0.K;
import Z.AbstractC0319p;
import Z.C0311h;
import Z.C0316m;
import a.AbstractC0345a;
import android.graphics.Paint;
import android.os.Bundle;
import b0.C0494b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.G;
import s0.AbstractC1144g0;
import s0.P0;
import s1.C1183B;
import s1.C1193i;
import w.C1277q;
import w.P;
import w.a0;
import w.o0;
import y.C1316f;
import z2.C1405I;

/* loaded from: classes.dex */
public final class h extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3730e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3731i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3732j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3733k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3734l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        super(1);
        this.f3729d = i2;
        this.f3730e = obj;
        this.f3731i = obj2;
        this.f3732j = obj3;
        this.f3733k = obj4;
        this.f3734l = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        Object obj2 = this.f3734l;
        Object obj3 = this.f3733k;
        Object obj4 = this.f3732j;
        Object obj5 = this.f3730e;
        Object obj6 = this.f3731i;
        switch (this.f3729d) {
            case 0:
                B b4 = (B) obj5;
                b4.f3692t.addView(b4, b4.f3693u);
                b4.i((Function0) obj6, (F) obj4, (String) obj3, (M0.k) obj2);
                break;
            case 1:
                C1193i entry = (C1193i) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((M2.A) obj5).f3576d = true;
                ArrayList arrayList = (ArrayList) obj6;
                int indexOf = arrayList.indexOf(entry);
                if (indexOf != -1) {
                    M2.C c4 = (M2.C) obj4;
                    int i2 = indexOf + 1;
                    list = arrayList.subList(c4.f3578d, i2);
                    c4.f3578d = i2;
                } else {
                    list = C1405I.f11931d;
                }
                ((C1183B) obj3).a(entry.f10510e, (Bundle) obj2, entry, list);
                break;
            case 2:
                G g4 = (G) obj;
                g4.a();
                float d4 = ((y.n) obj5).f11489b.d();
                if (d4 != 0.0f) {
                    int i4 = K.f300c;
                    int b5 = ((G0.s) obj6).b((int) (((G0.y) obj4).f3094b >> 32));
                    o0 d5 = ((P) obj3).d();
                    Y.d c5 = d5 != null ? d5.f11290a.c(b5) : new Y.d(0.0f, 0.0f, 0.0f, 0.0f);
                    float L3 = g4.L(a0.f11134a);
                    float f4 = L3 / 2;
                    float f5 = c5.f4374a + f4;
                    C0494b c0494b = g4.f9624d;
                    float a4 = kotlin.ranges.b.a(kotlin.ranges.b.b(f5, Y.f.d(c0494b.h()) - f4), f4);
                    long c6 = AbstractC0345a.c(a4, c5.f4375b);
                    long c7 = AbstractC0345a.c(a4, c5.f4377d);
                    Z.r rVar = c0494b.f5602d.f5600c;
                    C0311h c0311h = c0494b.f5605j;
                    if (c0311h == null) {
                        c0311h = Z.K.g();
                        c0311h.l(1);
                        c0494b.f5605j = c0311h;
                    }
                    C0311h c0311h2 = c0311h;
                    AbstractC0319p abstractC0319p = (AbstractC0319p) obj2;
                    if (abstractC0319p != null) {
                        abstractC0319p.a(d4, c0494b.h(), c0311h2);
                    } else if (((Paint) c0311h2.f4525b).getAlpha() / 255.0f != d4) {
                        c0311h2.c(d4);
                    }
                    if (!Intrinsics.a((C0316m) c0311h2.f4527d, null)) {
                        c0311h2.f(null);
                    }
                    if (!Z.K.o(c0311h2.f4524a, 3)) {
                        c0311h2.d(3);
                    }
                    Paint paint = (Paint) c0311h2.f4525b;
                    if (paint.getStrokeWidth() != L3) {
                        c0311h2.k(L3);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        ((Paint) c0311h2.f4525b).setStrokeMiter(4.0f);
                    }
                    if (!Z.K.r(c0311h2.a(), 0)) {
                        c0311h2.i(0);
                    }
                    if (!Z.K.s(c0311h2.b(), 0)) {
                        c0311h2.j(0);
                    }
                    if (!Intrinsics.a(null, null)) {
                        ((Paint) c0311h2.f4525b).setPathEffect(null);
                    }
                    if (!Z.K.q(paint.isFilterBitmap() ? 1 : 0, 1)) {
                        c0311h2.g(1);
                    }
                    rVar.h(c6, c7, c0311h2);
                }
                break;
            default:
                y.z zVar = (y.z) obj;
                y.v vVar = ((C1316f) obj6).f11475a;
                zVar.f11529h = (G0.y) obj5;
                zVar.f11530i = (G0.m) obj4;
                zVar.f11524c = (P.h) obj3;
                zVar.f11525d = (C1277q) obj2;
                zVar.f11526e = vVar != null ? vVar.f11500u : null;
                zVar.f11527f = vVar != null ? vVar.f11501v : null;
                zVar.f11528g = vVar != null ? (P0) AbstractC1065f.i(vVar, AbstractC1144g0.f10229q) : null;
                break;
        }
        return Unit.f7487a;
    }
}
