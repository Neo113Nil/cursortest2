package com.ironsource;

import com.ironsource.AbstractC1466g0;
import com.ironsource.iw;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class zv implements InterfaceC1459f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f20594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f20595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gw f20596c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bw f20597d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1466g0 f20598e;

    /* renamed from: f, reason: collision with root package name */
    private iw f20599f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<AbstractC1424a0> f20600g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private AbstractC1424a0 f20601h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20602i;

    @Metadata
    public static final class a implements cw {
        a() {
        }

        @Override // com.ironsource.cw
        public void a(int i4, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (zv.this.f20602i) {
                return;
            }
            zv.this.f20596c.a(i4, errorReason);
        }

        @Override // com.ironsource.cw
        public void a(@NotNull dw waterfallInstances) {
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (zv.this.f20602i) {
                return;
            }
            zv.this.a(waterfallInstances);
        }
    }

    public zv(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData, @NotNull gw listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20594a = adTools;
        this.f20595b = adUnitData;
        this.f20596c = listener;
        this.f20597d = bw.f15652d.a(adTools, adUnitData);
        this.f20600g = new ArrayList();
    }

    private final void c(AbstractC1424a0 abstractC1424a0) {
        d(abstractC1424a0);
        b();
    }

    private final void d(AbstractC1424a0 abstractC1424a0) {
        this.f20601h = abstractC1424a0;
        this.f20600g.remove(abstractC1424a0);
    }

    private final void e() {
        AbstractC1466g0 abstractC1466g0 = this.f20598e;
        iw iwVar = null;
        if (abstractC1466g0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adInstanceLoadStrategy");
            abstractC1466g0 = null;
        }
        AbstractC1466g0.b d4 = abstractC1466g0.d();
        if (d4.e()) {
            this.f20596c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (!d4.f()) {
            Iterator<AbstractC1424a0> it = d4.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            iw iwVar2 = this.f20599f;
            if (iwVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waterfallReporter");
            } else {
                iwVar = iwVar2;
            }
            iwVar.a();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f20594a, "dispose", (String) null, 2, (Object) null));
        Iterator<T> it = this.f20600g.iterator();
        while (it.hasNext()) {
            ((AbstractC1424a0) it.next()).c();
        }
        this.f20600g.clear();
        this.f20594a.e().h().a();
    }

    private final boolean d() {
        return this.f20601h != null;
    }

    public final void a() {
        this.f20602i = true;
        AbstractC1424a0 abstractC1424a0 = this.f20601h;
        if (abstractC1424a0 != null) {
            abstractC1424a0.b();
        }
    }

    public final void b(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        iw iwVar = this.f20599f;
        if (iwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waterfallReporter");
            iwVar = null;
        }
        iwVar.a(instance, this.f20595b.l(), this.f20595b.o());
    }

    public final boolean c() {
        Iterator<AbstractC1424a0> it = this.f20600g.iterator();
        while (it.hasNext()) {
            if (it.next().y()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC1459f0
    public void a(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f20602i || d()) {
            instance.c();
            return;
        }
        iw iwVar = this.f20599f;
        AbstractC1466g0 abstractC1466g0 = null;
        iw iwVar2 = null;
        if (iwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waterfallReporter");
            iwVar = null;
        }
        iwVar.a(instance);
        this.f20600g.add(instance);
        if (this.f20600g.size() == 1) {
            iw iwVar3 = this.f20599f;
            if (iwVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waterfallReporter");
            } else {
                iwVar2 = iwVar3;
            }
            iwVar2.b(instance);
            this.f20596c.b(instance);
            return;
        }
        AbstractC1466g0 abstractC1466g02 = this.f20598e;
        if (abstractC1466g02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adInstanceLoadStrategy");
        } else {
            abstractC1466g0 = abstractC1466g02;
        }
        if (abstractC1466g0.a(instance)) {
            this.f20596c.a(instance);
        }
    }

    public final void a(@NotNull InterfaceC1445d0 adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.f20597d.a(adInstanceFactory, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(dw dwVar) {
        this.f20598e = AbstractC1466g0.f16317c.a(this.f20595b, dwVar);
        iw.a aVar = iw.f16774c;
        C1585w2 c1585w2 = this.f20594a;
        AbstractC1584w1 abstractC1584w1 = this.f20595b;
        yo a4 = this.f20597d.a();
        AbstractC1466g0 abstractC1466g0 = this.f20598e;
        if (abstractC1466g0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adInstanceLoadStrategy");
            abstractC1466g0 = null;
        }
        this.f20599f = aVar.a(c1585w2, abstractC1584w1, a4, dwVar, abstractC1466g0);
        e();
    }

    public final void a(@NotNull InterfaceC1487j0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        AbstractC1466g0 abstractC1466g0 = this.f20598e;
        iw iwVar = null;
        if (abstractC1466g0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adInstanceLoadStrategy");
            abstractC1466g0 = null;
        }
        AbstractC1466g0.c c4 = abstractC1466g0.c();
        AbstractC1424a0 c5 = c4.c();
        if (c5 != null) {
            c(c5);
            iw iwVar2 = this.f20599f;
            if (iwVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waterfallReporter");
            } else {
                iwVar = iwVar2;
            }
            iwVar.a(c4.c(), c4.d());
            c4.c().a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.InterfaceC1459f0
    public void a(@NotNull IronSourceError error, @NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f20602i) {
            return;
        }
        e();
    }
}
