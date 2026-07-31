package com.chartboost.sdk.impl;

import android.os.SystemClock;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.o7;
import com.ironsource.C4701ic;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class j4 {
    public final wf a;
    public final a0 b;
    public final rh c;
    public final Mediation d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public Long h;

    public j4(wf renderableConfig, a0 adMarkupConfig, rh telemetryManager, Mediation mediation) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        this.a = renderableConfig;
        this.b = adMarkupConfig;
        this.c = telemetryManager;
        this.d = mediation;
        this.g = renderableConfig.e();
    }

    public final List a(List list, String str, o7.b bVar) {
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((o7) obj).d(), bVar.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (o7 o7Var : arrayList) {
            ei eiVar = null;
            try {
                new URL(o7Var.e());
                String e = o7Var.e();
                String upperCase = o7Var.c().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String a = o7Var.a();
                if (a == null || StringsKt.isBlank(a)) {
                    a = null;
                }
                eiVar = new ei(e, upperCase, a, o7Var.b());
            } catch (Exception e2) {
                xb.e("Error processing tracker from " + str + ": URL='" + o7Var.e() + "', Method='" + o7Var.c() + "'. Error: " + e2.getMessage(), e2);
            }
            if (eiVar != null) {
                arrayList2.add(eiVar);
            }
        }
        return arrayList2;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ei((String) it.next(), C4701ic.a, null, null));
        }
        return arrayList;
    }

    public final boolean a(i4 clickContext, boolean z) {
        s4 s4Var;
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        boolean z2 = false;
        if (!z) {
            xb.a("Click ignored due to lack of user gesture. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            a(clickContext, "Clickthrough has failed.", "CB_509", "CB_RENDER_CLICK_IGNORED_NO_GESTURE", "Click ignored due to no matching user gesture recognized. Click already tracked for this ad: " + (this.h != null) + ".");
            return false;
        }
        boolean z3 = clickContext instanceof i4.c;
        boolean z4 = z3 ? this.f : this.e;
        boolean z5 = this.g;
        if (z5 && z4) {
            z2 = true;
        }
        if (z2) {
            xb.a("Click deduplicated. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            a(clickContext, "Clickthrough has failed.", "CB_510", "CB_RENDER_CLICK_IGNORED_BUSY", "Click ignored due to SDK being busy. Click already tracked for this ad: " + z4 + ".");
        } else {
            xb.a("Handling click tracking. Event: " + clickContext + ", Dedupe: " + z5 + ", FirstTracked: " + z4, (Throwable) null, 2, (Object) null);
            List a = a(clickContext.b());
            List f = this.a.f();
            o7.b bVar = o7.b.c;
            List distinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) a, (Iterable) a(f, "RenderableConfig", bVar)), (Iterable) a(this.b.e(), "AdMarkupConfig", bVar)));
            if (!distinct.isEmpty()) {
                if (clickContext instanceof i4.a) {
                    s4Var = s4.c;
                } else if (clickContext instanceof i4.c) {
                    s4Var = s4.e;
                } else {
                    if (!(clickContext instanceof i4.d) && !(clickContext instanceof i4.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s4Var = s4.d;
                }
                s4 s4Var2 = s4Var;
                rh.a(this.c, new k4(this.b.c(), CollectionsKt.emptyList(), s4Var2, clickContext.a(), null, null, null, null, null, this.d, 496, null), distinct, (o7.b) null, 4, (Object) null);
                xb.a("Submitted " + distinct.size() + " unique click trackers for clickType: " + s4Var2.b() + ".", (Throwable) null, 2, (Object) null);
                if (this.h == null) {
                    this.h = Long.valueOf(SystemClock.uptimeMillis());
                }
            }
            if (this.g) {
                if (z3) {
                    this.f = true;
                } else {
                    this.e = true;
                }
                xb.a("First " + (z3 ? "companion" : "video") + " click tracked. Subsequent clicks of the same type will be deduplicated.", (Throwable) null, 2, (Object) null);
            }
        }
        return !z2;
    }

    public final void a(i4 clickContext, String str, String str2, String str3, String str4) {
        long j;
        s4 s4Var;
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        List a = a();
        if (a.isEmpty()) {
            xb.a("No click_error trackers configured. Skipping click_error event.", (Throwable) null, 2, (Object) null);
            return;
        }
        Long l = this.h;
        if (l != null) {
            j = SystemClock.uptimeMillis() - l.longValue();
        } else {
            j = -1;
        }
        if (clickContext instanceof i4.a) {
            s4Var = s4.c;
        } else if (clickContext instanceof i4.c) {
            s4Var = s4.e;
        } else {
            if (!(clickContext instanceof i4.d) && !(clickContext instanceof i4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            s4Var = s4.d;
        }
        k4 k4Var = new k4(this.b.c(), CollectionsKt.emptyList(), s4Var, clickContext.a(), str, str2, str3, str4, Long.valueOf(j), this.d);
        List distinct = CollectionsKt.distinct(a);
        rh.a(this.c, k4Var, distinct, (o7.b) null, 4, (Object) null);
        xb.a("Submitted " + distinct.size() + " unique click_error trackers. Latency: " + j + " ms.", (Throwable) null, 2, (Object) null);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        List f = this.a.f();
        o7.b bVar = o7.b.d;
        arrayList.addAll(a(f, "RenderableConfig", bVar));
        arrayList.addAll(a(this.b.e(), "AdMarkupConfig", bVar));
        return arrayList;
    }
}
