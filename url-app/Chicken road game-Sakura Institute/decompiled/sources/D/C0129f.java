package D;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;
import p0.InterfaceC0968d;
import p0.InterfaceC0982r;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.C1023b;
import w.C1259H;
import z2.C1441y;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129f extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1781e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1782i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1783j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1784k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129f(G.F f4, O.b bVar, i.v vVar, int i2) {
        super(1);
        this.f1780d = 1;
        this.f1782i = f4;
        this.f1783j = bVar;
        this.f1784k = vVar;
        this.f1781e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1780d) {
            case 0:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                ArrayList arrayList = (ArrayList) this.f1782i;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List list = (List) arrayList.get(i2);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (true) {
                        InterfaceC0947H interfaceC0947H = (InterfaceC0947H) this.f1784k;
                        if (i4 < size2) {
                            iArr[i4] = ((AbstractC0954O) list.get(i4)).f9005d + (i4 < C1441y.d(list) ? interfaceC0947H.l(AbstractC0150m.f1890c) : 0);
                            i4++;
                        } else {
                            C1023b c1023b = AbstractC1031j.f9266b;
                            int[] iArr2 = new int[size2];
                            for (int i5 = 0; i5 < size2; i5++) {
                                iArr2[i5] = 0;
                            }
                            c1023b.b(interfaceC0947H, this.f1781e, iArr, interfaceC0947H.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                AbstractC0953N.d(abstractC0953N, (AbstractC0954O) list.get(i6), iArr2[i6], ((Number) ((ArrayList) this.f1783j).get(i2)).intValue());
                            }
                        }
                    }
                }
                return Unit.f7487a;
            case 1:
                if (obj == ((G.F) this.f1782i)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof Q.D) {
                    int i7 = ((O.b) this.f1783j).f3624a - this.f1781e;
                    i.v vVar = (i.v) this.f1784k;
                    int c4 = vVar.c(obj);
                    vVar.f(Math.min(i7, c4 >= 0 ? vVar.f6970c[c4] : Integer.MAX_VALUE), obj);
                }
                return Unit.f7487a;
            case 2:
                InterfaceC0968d interfaceC0968d = (InterfaceC0968d) obj;
                boolean I3 = X.d.I((X.t) this.f1782i, (X.t) this.f1783j, this.f1781e, (P.h) this.f1784k);
                Boolean valueOf = Boolean.valueOf(I3);
                if (I3 || !interfaceC0968d.a()) {
                    return valueOf;
                }
                return null;
            case 3:
                InterfaceC0968d interfaceC0968d2 = (InterfaceC0968d) obj;
                boolean H3 = X.d.H(this.f1781e, (P.h) this.f1784k, (X.t) this.f1782i, (Y.d) this.f1783j);
                Boolean valueOf2 = Boolean.valueOf(H3);
                if (H3 || !interfaceC0968d2.a()) {
                    return valueOf2;
                }
                return null;
            case 4:
                AbstractC0953N abstractC0953N2 = (AbstractC0953N) obj;
                AbstractC0954O[] abstractC0954OArr = (AbstractC0954O[]) this.f1782i;
                int length = abstractC0954OArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    AbstractC0954O abstractC0954O = abstractC0954OArr[i8];
                    int i10 = i9 + 1;
                    Intrinsics.c(abstractC0954O);
                    Object r2 = abstractC0954O.r();
                    q.d0 d0Var = r2 instanceof q.d0 ? (q.d0) r2 : null;
                    q.f0 f0Var = (q.f0) this.f1783j;
                    f0Var.getClass();
                    AbstractC1024c abstractC1024c = d0Var != null ? d0Var.f9250c : null;
                    int i11 = this.f1781e;
                    AbstractC0953N.d(abstractC0953N2, abstractC0954O, ((int[]) this.f1784k)[i9], abstractC1024c != null ? abstractC1024c.b(i11 - abstractC0954O.f9006e, M0.k.f3555d) : f0Var.f9255b.a(0, i11 - abstractC0954O.f9006e));
                    i8++;
                    i9 = i10;
                }
                return Unit.f7487a;
            case 5:
                AbstractC0953N abstractC0953N3 = (AbstractC0953N) obj;
                C1259H c1259h = (C1259H) this.f1782i;
                int i12 = c1259h.f11031b;
                w.o0 o0Var = (w.o0) c1259h.f11033d.invoke();
                A0.I i13 = o0Var != null ? o0Var.f11290a : null;
                InterfaceC0947H interfaceC0947H2 = (InterfaceC0947H) this.f1784k;
                boolean z4 = interfaceC0947H2.getLayoutDirection() == M0.k.f3556e;
                AbstractC0954O abstractC0954O2 = (AbstractC0954O) this.f1783j;
                Y.d h4 = w.M.h(interfaceC0947H2, i12, c1259h.f11032c, i13, z4, abstractC0954O2.f9005d);
                o.N n2 = o.N.f8666e;
                int i14 = abstractC0954O2.f9005d;
                w.m0 m0Var = c1259h.f11030a;
                m0Var.a(n2, h4, this.f1781e, i14);
                AbstractC0953N.f(abstractC0953N3, abstractC0954O2, Math.round(-m0Var.f11252a.d()), 0);
                return Unit.f7487a;
            default:
                AbstractC0953N abstractC0953N4 = (AbstractC0953N) obj;
                w.q0 q0Var = (w.q0) this.f1782i;
                int i15 = q0Var.f11321b;
                w.o0 o0Var2 = (w.o0) q0Var.f11323d.invoke();
                A0.I i16 = o0Var2 != null ? o0Var2.f11290a : null;
                AbstractC0954O abstractC0954O3 = (AbstractC0954O) this.f1783j;
                Y.d h5 = w.M.h((InterfaceC0947H) this.f1784k, i15, q0Var.f11322c, i16, false, abstractC0954O3.f9005d);
                o.N n4 = o.N.f8665d;
                int i17 = abstractC0954O3.f9006e;
                w.m0 m0Var2 = q0Var.f11320a;
                m0Var2.a(n4, h5, this.f1781e, i17);
                AbstractC0953N.f(abstractC0953N4, abstractC0954O3, 0, Math.round(-m0Var2.f11252a.d()));
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129f(Object obj, Object obj2, int i2, Serializable serializable, int i4) {
        super(1);
        this.f1780d = i4;
        this.f1782i = obj;
        this.f1783j = obj2;
        this.f1781e = i2;
        this.f1784k = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129f(ArrayList arrayList, InterfaceC0947H interfaceC0947H, int i2, ArrayList arrayList2) {
        super(1);
        this.f1780d = 0;
        float f4 = AbstractC0150m.f1888a;
        this.f1782i = arrayList;
        this.f1784k = interfaceC0947H;
        this.f1781e = i2;
        this.f1783j = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129f(InterfaceC0947H interfaceC0947H, InterfaceC0982r interfaceC0982r, AbstractC0954O abstractC0954O, int i2, int i4) {
        super(1);
        this.f1780d = i4;
        this.f1784k = interfaceC0947H;
        this.f1782i = interfaceC0982r;
        this.f1783j = abstractC0954O;
        this.f1781e = i2;
    }
}
