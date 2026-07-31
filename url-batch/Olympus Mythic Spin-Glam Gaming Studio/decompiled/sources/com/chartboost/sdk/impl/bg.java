package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bg implements ag, q7 {
    public final y9 a;
    public final /* synthetic */ q7 b;
    public WeakReference c;
    public WeakReference d;
    public boolean e;

    public bg(y9 impressionActivityIntentWrapper, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(impressionActivityIntentWrapper, "impressionActivityIntentWrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = impressionActivityIntentWrapper;
        this.b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.b.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.b.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.b.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.b.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3222track(event);
    }

    @Override // com.chartboost.sdk.impl.ag
    public void onStart() {
        Unit unit;
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            unit = null;
        } else {
            p0Var.p();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("Bridge onStart missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ag
    public void onResume() {
        Unit unit;
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            unit = null;
        } else {
            p0Var.r();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("Bridge onResume missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ag
    public void b() {
        Unit unit;
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            unit = null;
        } else {
            p0Var.y();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("Bridge onPause missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ag
    public void c() {
        Unit unit;
        p0 p0Var;
        d();
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            unit = null;
        } else {
            p0Var.x();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("Bridge onDestroy missing callback to renderer", (Throwable) null, 2, (Object) null);
        }
        WeakReference weakReference2 = this.c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference weakReference3 = this.d;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
    }

    @Override // com.chartboost.sdk.impl.ag
    public void e() {
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.e();
    }

    @Override // com.chartboost.sdk.impl.ag
    public void finishActivity() {
        b bVar;
        this.e = true;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a(int i, boolean z) {
        b bVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i, z);
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a(cl viewBase) {
        Unit unit;
        b bVar;
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            unit = null;
        } else {
            bVar.a(viewBase);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("activityInterface is null", (Throwable) null, 2, (Object) null);
        }
    }

    public final void d() {
        if (this.e) {
            return;
        }
        track((pi) new l7(si.i.o, "dismiss_missing happened due to sdk closure outside expected flow", null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a(CBError.Impression error) {
        p0 p0Var;
        Intrinsics.checkNotNullParameter(error, "error");
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.a(error);
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a() {
        b bVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a(b activityInterface, CBImpressionActivity activity) {
        p0 p0Var;
        Intrinsics.checkNotNullParameter(activityInterface, "activityInterface");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c = new WeakReference(activityInterface);
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.a(activity);
    }

    @Override // com.chartboost.sdk.impl.ag
    public void a(p0 adUnitRendererActivityInterface) {
        Intrinsics.checkNotNullParameter(adUnitRendererActivityInterface, "adUnitRendererActivityInterface");
        this.d = new WeakReference(adUnitRendererActivityInterface);
        try {
            y9 y9Var = this.a;
            y9Var.a(y9Var.a());
        } catch (Exception e) {
            xb.b("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions", e);
            a(CBError.Impression.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }
}
