package u0;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import a2.InterfaceC0184a;
import a2.InterfaceC0188e;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.gates.olympus.miruv.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class Y0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0 f8270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f8271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(Z0 z02, Q.a aVar, int i3) {
        super(2);
        this.f8269e = i3;
        this.f8270f = z02;
        this.f8271g = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8269e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f8270f.f8273d, this.f8271g, c0113p, 0);
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    Z0 z02 = this.f8270f;
                    Object tag = z02.f8273d.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC0184a) || (tag instanceof InterfaceC0188e)) ? (Set) tag : null;
                    C0997t c0997t = z02.f8273d;
                    if (set == null) {
                        Object parent = c0997t.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC0184a) && !(tag2 instanceof InterfaceC0188e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0113p2.f2309c);
                        c0113p2.p = true;
                        c0113p2.B = true;
                        c0113p2.f2309c.c();
                        c0113p2.f2297G.c();
                        I.I0 i02 = c0113p2.f2298H;
                        I.G0 g02 = i02.f2133a;
                        i02.f2137e = g02.f2126l;
                        i02.f2138f = g02.f2127m;
                    }
                    boolean h3 = c0113p2.h(z02);
                    Object G3 = c0113p2.G();
                    I.X x3 = C0105l.f2272a;
                    if (h3 || G3 == x3) {
                        G3 = new W0(z02, null);
                        c0113p2.a0(G3);
                    }
                    C0089d.e(c0113p2, (Y1.e) G3, c0997t);
                    boolean h4 = c0113p2.h(z02);
                    Object G4 = c0113p2.G();
                    if (h4 || G4 == x3) {
                        G4 = new X0(z02, null);
                        c0113p2.a0(G4);
                    }
                    C0089d.e(c0113p2, (Y1.e) G4, c0997t);
                    C0089d.a(T.b.f3278a.a(set), Q.f.b(-1193460702, new Y0(z02, this.f8271g, 0), c0113p2), c0113p2, 56);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
