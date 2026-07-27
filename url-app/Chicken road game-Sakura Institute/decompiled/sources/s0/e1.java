package s0;

import G.C0209l0;
import G.C0236z0;
import W2.C0286h;
import W2.EnumC0303z;
import W2.InterfaceC0284f;
import android.view.View;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import java.util.ArrayList;
import kotlin.Unit;
import y2.AbstractC1341p;

/* loaded from: classes.dex */
public final class e1 implements InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3.c f10198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0209l0 f10199e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f10200i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M2.E f10201j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f10202k;

    public e1(b3.c cVar, C0209l0 c0209l0, C0236z0 c0236z0, M2.E e4, View view) {
        this.f10198d = cVar;
        this.f10199e = c0209l0;
        this.f10200i = c0236z0;
        this.f10201j = e4;
        this.f10202k = view;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n enumC0474n) {
        boolean z4;
        int i2 = b1.f10175a[enumC0474n.ordinal()];
        InterfaceC0284f interfaceC0284f = null;
        if (i2 == 1) {
            W2.B.m(this.f10198d, null, EnumC0303z.f4307j, new d1(this.f10201j, this.f10200i, interfaceC0481v, this, this.f10202k, null), 1);
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                this.f10200i.s();
                return;
            } else {
                C0236z0 c0236z0 = this.f10200i;
                synchronized (c0236z0.f2983b) {
                    c0236z0.f2998q = true;
                    Unit unit = Unit.f7487a;
                }
                return;
            }
        }
        C0209l0 c0209l0 = this.f10199e;
        if (c0209l0 != null) {
            G.S s4 = c0209l0.f2828e;
            synchronized (s4.f2749a) {
                try {
                    synchronized (s4.f2749a) {
                        z4 = s4.f2752d;
                    }
                    if (!z4) {
                        ArrayList arrayList = s4.f2750b;
                        s4.f2750b = s4.f2751c;
                        s4.f2751c = arrayList;
                        s4.f2752d = true;
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C2.a aVar = (C2.a) arrayList.get(i4);
                            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                            aVar.u(Unit.f7487a);
                        }
                        arrayList.clear();
                        Unit unit2 = Unit.f7487a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0236z0 c0236z02 = this.f10200i;
        synchronized (c0236z02.f2983b) {
            if (c0236z02.f2998q) {
                c0236z02.f2998q = false;
                interfaceC0284f = c0236z02.t();
            }
        }
        if (interfaceC0284f != null) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            ((C0286h) interfaceC0284f).u(Unit.f7487a);
        }
    }
}
