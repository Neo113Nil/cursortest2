package t1;

import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import kotlin.jvm.functions.Function1;
import l.o0;
import s1.C1193i;

/* loaded from: classes.dex */
public final class n extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1193i f10674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10675e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q.v f10676i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Q.v vVar, C1193i c1193i, boolean z4) {
        super(1);
        this.f10674d = c1193i;
        this.f10675e = z4;
        this.f10676i = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final C1193i c1193i = this.f10674d;
        final boolean z4 = this.f10675e;
        final Q.v vVar = this.f10676i;
        InterfaceC0479t interfaceC0479t = new InterfaceC0479t() { // from class: t1.m
            @Override // androidx.lifecycle.InterfaceC0479t
            public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n enumC0474n) {
                C1193i c1193i2 = c1193i;
                boolean z5 = z4;
                Q.v vVar2 = vVar;
                if (z5 && !vVar2.contains(c1193i2)) {
                    vVar2.add(c1193i2);
                }
                if (enumC0474n == EnumC0474n.ON_START && !vVar2.contains(c1193i2)) {
                    vVar2.add(c1193i2);
                }
                if (enumC0474n == EnumC0474n.ON_STOP) {
                    vVar2.remove(c1193i2);
                }
            }
        };
        c1193i.f10516n.a(interfaceC0479t);
        return new o0(c1193i, 7, interfaceC0479t);
    }
}
