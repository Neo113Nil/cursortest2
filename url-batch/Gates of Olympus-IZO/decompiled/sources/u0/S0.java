package u0;

import I.C0106l0;
import android.view.View;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import java.util.ArrayList;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.EnumC0551x;
import k2.InterfaceC0534f;

/* loaded from: classes.dex */
public final class S0 implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.c f8245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0106l0 f8246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.A0 f8247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z1.t f8248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f8249h;

    public S0(p2.c cVar, C0106l0 c0106l0, I.A0 a02, Z1.t tVar, View view) {
        this.f8245d = cVar;
        this.f8246e = c0106l0;
        this.f8247f = a02;
        this.f8248g = tVar;
        this.f8249h = view;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        boolean z3;
        int i3 = P0.f8222a[enumC0229n.ordinal()];
        InterfaceC0534f interfaceC0534f = null;
        if (i3 == 1) {
            AbstractC0552y.q(this.f8245d, null, EnumC0551x.f5398g, new R0(this.f8248g, this.f8247f, interfaceC0236v, this, this.f8249h, null), 1);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    return;
                }
                this.f8247f.s();
                return;
            } else {
                I.A0 a02 = this.f8247f;
                synchronized (a02.f2061b) {
                    a02.f2075q = true;
                }
                return;
            }
        }
        C0106l0 c0106l0 = this.f8246e;
        if (c0106l0 != null) {
            I.T t3 = (I.T) c0106l0.f2275f;
            synchronized (t3.f2198b) {
                try {
                    synchronized (t3.f2198b) {
                        z3 = t3.f2197a;
                    }
                    if (!z3) {
                        ArrayList arrayList = (ArrayList) t3.f2199c;
                        t3.f2199c = (ArrayList) t3.f2200d;
                        t3.f2200d = arrayList;
                        t3.f2197a = true;
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((P1.d) arrayList.get(i4)).resumeWith(L1.z.f2729a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        I.A0 a03 = this.f8247f;
        synchronized (a03.f2061b) {
            if (a03.f2075q) {
                a03.f2075q = false;
                interfaceC0534f = a03.t();
            }
        }
        if (interfaceC0534f != null) {
            ((C0536h) interfaceC0534f).resumeWith(L1.z.f2729a);
        }
    }
}
