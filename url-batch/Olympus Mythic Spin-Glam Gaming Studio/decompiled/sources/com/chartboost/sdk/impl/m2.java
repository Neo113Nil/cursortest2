package com.chartboost.sdk.impl;

import android.net.Uri;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.o7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public abstract class m2 extends vf {
    public final wf d;
    public final a0 e;
    public final rh f;
    public final u g;
    public final Mediation h;
    public final Lazy i;
    public final ij j;
    public final long k;
    public final long l;
    public final int m;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h7.values().length];
            try {
                iArr[h7.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h7.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j4 mo4828invoke() {
            return new j4(m2.this.w(), m2.this.q(), m2.this.x(), m2.this.v());
        }
    }

    public m2(wf renderableConfig, a0 adMarkupConfig, di trackerComponent, rh telemetryManager, u adFormat, Mediation mediation) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.d = renderableConfig;
        this.e = adMarkupConfig;
        this.f = telemetryManager;
        this.g = adFormat;
        this.h = mediation;
        this.i = LazyKt.lazy(new b());
        this.j = new ij(new hj(null, null, 3, null), null, null, 6, null);
        n5 d = renderableConfig.d();
        this.k = d != null ? d.b() : 0L;
        n5 d2 = renderableConfig.d();
        this.l = d2 != null ? d2.a() : 0L;
        this.m = renderableConfig.k();
    }

    public final wf w() {
        return this.d;
    }

    public final a0 q() {
        return this.e;
    }

    public final rh x() {
        return this.f;
    }

    public final u p() {
        return this.g;
    }

    public final Mediation v() {
        return this.h;
    }

    public final j4 r() {
        return (j4) this.i.getValue();
    }

    public void b(String str, boolean z) {
        zf j;
        a(str, z);
        if (!r().a(new i4.b(CollectionsKt.emptyList(), str), z) || (j = j()) == null) {
            return;
        }
        j.f();
    }

    public void y() {
        rh rhVar = this.f;
        ma maVar = new ma(this.e.c(), CollectionsKt.emptyList(), null, null, null, null, this.h, 60, null);
        List f = this.d.f();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : f) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.j.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, maVar, arrayList2, (o7.b) null, 4, (Object) null);
        a(this, (ChartboostError.Render) null, 1, (Object) null);
    }

    public long t() {
        return this.k;
    }

    public long s() {
        return this.l;
    }

    public int u() {
        return this.m;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null && scheme.length() != 0) {
                this.j.a(str, m4.d, (q4) null, z);
                return;
            }
            a(new ChartboostError.Render.InvalidClickthroughUrl(str, "Invalid clickthrough URL format", new IllegalArgumentException("Missing URI scheme: " + str)));
        }
    }

    public void b(boolean z) {
        rh rhVar = this.f;
        jh jhVar = new jh(this.e.c(), CollectionsKt.emptyList(), z, null, null, null, null, this.h, 120, null);
        List plus = CollectionsKt.plus((Collection) this.d.f(), (Iterable) this.e.e());
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : plus) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.n.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, jhVar, arrayList2, (o7.b) null, 4, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(h7 type, v5 v5Var) {
        v5 v5Var2;
        g7 g7Var;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == h7.c) {
            if (v5Var == null) {
                nj o = this.d.o();
                v5Var = u5.a(o != null ? o.a() : null);
            }
            v5Var2 = v5Var;
        } else {
            v5Var2 = null;
        }
        int i = a.a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g7Var = g7.c;
        } else {
            g7Var = g7.d;
        }
        g7 g7Var2 = g7Var;
        rh rhVar = this.f;
        f7 f7Var = new f7(this.e.c(), CollectionsKt.emptyList(), g7Var2, v5Var2, null, null, null, null, this.h, 240, null);
        List f = this.d.f();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : f) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.f.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, f7Var, arrayList2, (o7.b) null, 4, (Object) null);
    }

    public static /* synthetic */ void a(m2 m2Var, ChartboostError.Render render, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRender");
        }
        if ((i & 1) != 0) {
            render = null;
        }
        m2Var.a(render);
    }

    public final void a(ChartboostError.Render render) {
        if (!Chartboost.isSdkStarted()) {
            xb.b("SDK not initialized. Cannot track render event for auction " + this.e.c() + (render != null ? " (triggered by error handler): " + render : ""), (Throwable) null, 2, (Object) null);
            return;
        }
        String a2 = render != null ? wb.a(wb.a, 0, 1, null) : null;
        if (render != null) {
            xb.a("Tracking render error: auctionId=" + this.e.c() + ", errorCode=" + render.getCode() + ", errorConstant=" + render.getConstant() + ", logContextSize=" + (a2 != null ? a2.length() : 0), (Throwable) null, 2, (Object) null);
        }
        try {
            rh rhVar = this.f;
            tf tfVar = new tf(this.e.c(), CollectionsKt.emptyList(), render != null ? render.getMessage() : null, render != null ? render.getCode() : null, render != null ? render.getConstant() : null, render != null ? render.getCauseDescription() : null, this.h, a2);
            List f = this.d.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f) {
                if (Intrinsics.areEqual(((o7) obj).d(), o7.b.g.b())) {
                    arrayList.add(obj);
                }
            }
            List e = this.e.e();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : e) {
                if (Intrinsics.areEqual(((o7) obj2).d(), o7.b.g.b())) {
                    arrayList2.add(obj2);
                }
            }
            List<o7> plus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
            for (o7 o7Var : plus) {
                arrayList3.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
            }
            rh.a(rhVar, tfVar, arrayList3, (o7.b) null, 4, (Object) null);
        } catch (Exception e2) {
            xb.b("Failed to track " + (render != null ? "render error" : "render") + " event for auction " + this.e.c(), e2);
        }
    }
}
