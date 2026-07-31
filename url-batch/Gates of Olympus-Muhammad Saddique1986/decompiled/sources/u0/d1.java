package u0;

import I.C0160l0;
import I.C0187z0;
import android.view.View;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import java.util.ArrayList;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.EnumC0836x;
import q2.InterfaceC0819f;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v2.c f9331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0160l0 f9332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f9333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f2.u f9334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f9335h;

    public d1(v2.c cVar, C0160l0 c0160l0, C0187z0 c0187z0, f2.u uVar, View view) {
        this.f9331d = cVar;
        this.f9332e = c0160l0;
        this.f9333f = c0187z0;
        this.f9334g = uVar;
        this.f9335h = view;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        boolean z3;
        int i3 = a1.f9308a[enumC0285n.ordinal()];
        InterfaceC0819f interfaceC0819f = null;
        if (i3 == 1) {
            AbstractC0837y.r(this.f9331d, null, EnumC0836x.f7937g, new c1(this.f9334g, this.f9333f, interfaceC0292v, this, this.f9335h, null), 1);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    return;
                }
                this.f9333f.s();
                return;
            } else {
                C0187z0 c0187z0 = this.f9333f;
                synchronized (c0187z0.f2985b) {
                    c0187z0.f3000q = true;
                }
                return;
            }
        }
        C0160l0 c0160l0 = this.f9332e;
        if (c0160l0 != null) {
            I.S s3 = (I.S) c0160l0.f2832f;
            synchronized (s3.f2753b) {
                try {
                    synchronized (s3.f2753b) {
                        z3 = s3.f2752a;
                    }
                    if (!z3) {
                        ArrayList arrayList = (ArrayList) s3.f2754c;
                        s3.f2754c = (ArrayList) s3.f2755d;
                        s3.f2755d = arrayList;
                        s3.f2752a = true;
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((V1.d) arrayList.get(i4)).u(R1.y.f4171a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0187z0 c0187z02 = this.f9333f;
        synchronized (c0187z02.f2985b) {
            if (c0187z02.f3000q) {
                c0187z02.f3000q = false;
                interfaceC0819f = c0187z02.t();
            }
        }
        if (interfaceC0819f != null) {
            ((C0821h) interfaceC0819f).u(R1.y.f4171a);
        }
    }
}
