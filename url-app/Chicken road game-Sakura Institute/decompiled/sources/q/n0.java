package q;

import G.InterfaceC0191c0;
import G.X0;
import a1.AbstractC0397l;
import a1.AbstractC0404s;
import android.content.Context;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.InterfaceC0481v;
import com.appsflyer.attribution.RequestError;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import n.AbstractC0864b;
import p.C0935k;
import s.C1092H;
import s.C1093I;
import s0.C1146h0;
import s0.C1153l;
import s0.C1167s0;
import s0.ComponentCallbacks2C1127M;
import s0.ComponentCallbacks2C1128N;
import s0.L0;
import s0.k1;
import s0.l1;
import s1.C1183B;
import s1.C1186b;
import s1.C1188d;
import s1.C1193i;
import w.EnumC1257F;
import y.InputConnectionC1308B;

/* loaded from: classes.dex */
public final class n0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9289e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9290i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, int i2, Object obj2) {
        super(1);
        this.f9288d = i2;
        this.f9289e = obj;
        this.f9290i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputConnectionC1308B inputConnectionC1308B;
        C0483x e4;
        int i2 = 3;
        int i4 = 6;
        int i5 = 5;
        int i6 = 4;
        int i7 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z4 = false;
        r6 = false;
        r6 = false;
        boolean z5 = false;
        int i8 = 1;
        switch (this.f9288d) {
            case 0:
                o0 o0Var = (o0) this.f9289e;
                int i9 = o0Var.f9316s;
                View view = (View) this.f9290i;
                if (i9 == 0) {
                    int i10 = AbstractC0404s.f4892a;
                    RunnableC1012P runnableC1012P = o0Var.f9317t;
                    AbstractC0397l.u(view, runnableC1012P);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC1012P);
                    AbstractC0404s.a(view, runnableC1012P);
                }
                o0Var.f9316s++;
                return new l.o0(o0Var, i2, view);
            case 1:
                C1092H c1092h = (C1092H) this.f9289e;
                LinkedHashSet linkedHashSet = c1092h.f9896c;
                Object obj2 = this.f9290i;
                linkedHashSet.remove(obj2);
                return new l.o0(c1092h, i6, obj2);
            case 2:
                Context context = (Context) this.f9289e;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C1127M componentCallbacks2C1127M = (ComponentCallbacks2C1127M) this.f9290i;
                applicationContext.registerComponentCallbacks(componentCallbacks2C1127M);
                return new l.o0(context, i5, componentCallbacks2C1127M);
            case 3:
                Context context2 = (Context) this.f9289e;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C1128N componentCallbacks2C1128N = (ComponentCallbacks2C1128N) this.f9290i;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C1128N);
                return new l.o0(context2, i4, componentCallbacks2C1128N);
            case 4:
                return new C1167s0((y.z) this.f9289e, new C1093I(1, (s0.Q) this.f9290i));
            case 5:
                C1167s0 c1167s0 = (C1167s0) this.f9289e;
                synchronized (c1167s0.f10387c) {
                    try {
                        c1167s0.f10389e = true;
                        I.d dVar = c1167s0.f10388d;
                        int i11 = dVar.f3332i;
                        if (i11 > 0) {
                            Object[] objArr = dVar.f3330d;
                            do {
                                G0.p pVar = (G0.p) ((WeakReference) objArr[i7]).get();
                                if (pVar != null && (inputConnectionC1308B = pVar.f3077b) != null) {
                                    pVar.a(inputConnectionC1308B);
                                    pVar.f3077b = null;
                                }
                                i7++;
                            } while (i7 < i11);
                        }
                        c1167s0.f10388d.g();
                        Unit unit = Unit.f7487a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((s0.Q) this.f9290i).f10109e.f3096a.d();
                return Unit.f7487a;
            case 6:
                s0.V v4 = (s0.V) this.f9289e;
                G.C c4 = (G.C) this.f9290i;
                synchronized (v4.f10143k) {
                    v4.f10145m.remove(c4);
                }
                return Unit.f7487a;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((s0.W) this.f9289e).f10151d.removeFrameCallback((G.C) this.f9290i);
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                C1153l c1153l = (C1153l) obj;
                l1 l1Var = (l1) this.f9289e;
                if (!l1Var.f10260i) {
                    C0483x e5 = c1153l.f10253a.e();
                    O.a aVar = (O.a) this.f9290i;
                    l1Var.f10262k = aVar;
                    if (l1Var.f10261j == null) {
                        l1Var.f10261j = e5;
                        e5.a(l1Var);
                    } else if (e5.f5496d.a(EnumC0475o.f5482i)) {
                        l1Var.f10259e.j(new O.a(-2000640158, true, new k1(l1Var, aVar, i8)));
                    }
                }
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                s1.F navOptions = (s1.F) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                C1186b animBuilder = C1186b.f10494m;
                navOptions.getClass();
                Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
                C1188d c1188d = new C1188d();
                c1188d.f10502a = -1;
                c1188d.f10503b = -1;
                animBuilder.invoke(c1188d);
                int i12 = c1188d.f10502a;
                s1.D d4 = navOptions.f10478a;
                d4.f10468g = i12;
                d4.f10469h = c1188d.f10503b;
                s1.v vVar = (s1.v) this.f9289e;
                if (vVar instanceof s1.y) {
                    int i13 = s1.v.f10569n;
                    Iterator it = AbstractC0864b.t(vVar).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C1183B c1183b = (C1183B) this.f9290i;
                        if (hasNext) {
                            s1.v vVar2 = (s1.v) it.next();
                            C1193i c1193i = (C1193i) c1183b.f10442g.C();
                            s1.v vVar3 = c1193i != null ? c1193i.f10510e : null;
                            if (Intrinsics.a(vVar2, vVar3 != null ? vVar3.f10571e : null)) {
                            }
                        } else {
                            int i14 = s1.y.f10585s;
                            s1.y g4 = c1183b.g();
                            Intrinsics.checkNotNullParameter(g4, "<this>");
                            Intrinsics.checkNotNullParameter(g4, "<this>");
                            Sequence f4 = T2.n.f(g4, C1186b.f10498q);
                            Intrinsics.checkNotNullParameter(f4, "<this>");
                            Iterator it2 = f4.iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Sequence is empty.");
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            int i15 = ((s1.v) next).f10575l;
                            C1186b popUpToBuilder = C1186b.f10495n;
                            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                            navOptions.f10481d = i15;
                            s1.J j4 = new s1.J();
                            popUpToBuilder.invoke(j4);
                            navOptions.f10483f = j4.f10488a;
                        }
                    }
                }
                return Unit.f7487a;
            case 10:
                C1183B c1183b2 = (C1183B) this.f9289e;
                c1183b2.getClass();
                InterfaceC0481v owner = (InterfaceC0481v) this.f9290i;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (!Intrinsics.a(owner, c1183b2.f10450o)) {
                    InterfaceC0481v interfaceC0481v = c1183b2.f10450o;
                    s1.k kVar = c1183b2.f10454s;
                    if (interfaceC0481v != null && (e4 = interfaceC0481v.e()) != null) {
                        e4.f(kVar);
                    }
                    c1183b2.f10450o = owner;
                    owner.e().a(kVar);
                }
                return new l.l0(1);
            case RequestError.STOP_TRACKING /* 11 */:
                return new l.o0((X0) this.f9289e, 8, (t1.i) this.f9290i);
            case 12:
                KeyEvent keyEvent = ((j0.b) obj).f7136a;
                if (((w.P) this.f9289e).a() == EnumC1257F.f11024e && keyEvent.getKeyCode() == 4 && j0.c.w(j0.c.C(keyEvent), 1)) {
                    ((A.a0) this.f9290i).e(null);
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 13:
                KeyEvent keyEvent2 = ((j0.b) obj).f7136a;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && j0.c.w(j0.c.C(keyEvent2), 2) && keyEvent2.getSource() != 257) {
                    boolean i16 = w.M.i(keyEvent2, 19);
                    X.h hVar = (X.h) this.f9289e;
                    if (i16) {
                        z4 = ((androidx.compose.ui.focus.b) hVar).d(5);
                    } else if (w.M.i(keyEvent2, 20)) {
                        z4 = ((androidx.compose.ui.focus.b) hVar).d(6);
                    } else if (w.M.i(keyEvent2, 21)) {
                        z4 = ((androidx.compose.ui.focus.b) hVar).d(3);
                    } else if (w.M.i(keyEvent2, 22)) {
                        z4 = ((androidx.compose.ui.focus.b) hVar).d(4);
                    } else if (w.M.i(keyEvent2, 23)) {
                        L0 l02 = ((w.P) this.f9290i).f11056c;
                        if (l02 != null) {
                            ((C1146h0) l02).b();
                        }
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 14:
                return new l.o0((InterfaceC0191c0) this.f9289e, 9, (C0935k) this.f9290i);
            default:
                MatchResult matchResult = (MatchResult) obj;
                M2.C c5 = (M2.C) this.f9289e;
                if (c5.f3578d == -1) {
                    c5.f3578d = matchResult.a().f7505d;
                }
                ((M2.C) this.f9290i).f3578d = matchResult.a().f7506e + 1;
                return "";
        }
    }
}
