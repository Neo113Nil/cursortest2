package P0;

import A.a0;
import G.H;
import androidx.lifecycle.M;
import b.InterfaceC0488c;
import c.C0529i;
import java.util.Iterator;
import s.C1112p;
import s0.C1150j0;
import s0.l1;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259a implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3705b;

    public /* synthetic */ C0259a(int i2, Object obj) {
        this.f3704a = i2;
        this.f3705b = obj;
    }

    @Override // G.H
    public final void a() {
        switch (this.f3704a) {
            case 0:
                y yVar = (y) this.f3705b;
                yVar.dismiss();
                v vVar = yVar.f3778m;
                l1 l1Var = vVar.f10163i;
                if (l1Var != null) {
                    l1Var.c();
                }
                vVar.f10163i = null;
                vVar.requestLayout();
                break;
            case 1:
                B b4 = (B) this.f3705b;
                l1 l1Var2 = b4.f10163i;
                if (l1Var2 != null) {
                    l1Var2.c();
                }
                b4.f10163i = null;
                b4.requestLayout();
                M.i(b4, null);
                b4.f3692t.removeViewImmediate(b4);
                break;
            case 2:
                Iterator it = ((C0529i) this.f3705b).f5587b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0488c) it.next()).cancel();
                }
                break;
            case 3:
                ((C1112p) this.f3705b).f9952d = null;
                break;
            case 4:
                ((s.z) this.f3705b).f9980c = null;
                break;
            case 5:
                s.v vVar2 = (s.v) this.f3705b;
                int d4 = vVar2.f9972d.d();
                for (int i2 = 0; i2 < d4; i2++) {
                    vVar2.b();
                }
                break;
            case 6:
                ((C1150j0) this.f3705b).f10241a.invoke();
                break;
            default:
                ((a0) this.f3705b).k();
                break;
        }
    }
}
