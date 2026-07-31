package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.C2030k0;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.y22;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1959h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2030k0 f26402b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1839c0 f26403c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y22 f26404d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f26405e;

    public C1959h0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull InterfaceC2006j0 interactionEventListener, @NotNull Context applicationContext, @NotNull C2030k0 activityInteractionTracker, @NotNull InterfaceC1839c0 activityBackgroundListener, @NotNull y22 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(interactionEventListener, "interactionEventListener");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityInteractionTracker, "activityInteractionTracker");
        Intrinsics.checkNotNullParameter(activityBackgroundListener, "activityBackgroundListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f26401a = applicationContext;
        this.f26402b = activityInteractionTracker;
        this.f26403c = activityBackgroundListener;
        this.f26404d = strongReferenceKeepingManager;
        this.f26405e = new a(this);
    }

    public final void a() {
        this.f26403c.b(this.f26401a, (InterfaceC2101n0) this.f26405e);
        this.f26403c.b(this.f26401a, this.f26405e);
    }

    public final void b() {
        this.f26402b.a(C2030k0.a.f27958e);
    }

    public final void c() {
        this.f26402b.b(C2030k0.a.f27958e);
    }

    public final void d() {
        this.f26402b.a(C2030k0.a.f27956c);
        this.f26403c.a(this.f26401a, (InterfaceC2101n0) this.f26405e);
        this.f26403c.a(this.f26401a, this.f26405e);
        this.f26404d.a(fq0.f25898d, this);
    }

    public final void e() {
        this.f26404d.b(fq0.f25898d, this);
        this.f26403c.b(this.f26401a, (InterfaceC2101n0) this.f26405e);
        this.f26403c.b(this.f26401a, this.f26405e);
        this.f26402b.b(C2030k0.a.f27956c);
    }

    public final void f() {
        this.f26402b.a(C2030k0.a.f27957d);
    }

    public final void g() {
        this.f26402b.b(C2030k0.a.f27957d);
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f26402b.a(reportParameterManager);
    }

    /* renamed from: com.yandex.mobile.ads.impl.h0$a */
    public static final class a implements InterfaceC2101n0, er1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1959h0 f26406a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private WeakReference<Activity> f26407b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f26408c;

        public a(@NotNull C1959h0 activityInteractionController) {
            Intrinsics.checkNotNullParameter(activityInteractionController, "activityInteractionController");
            this.f26406a = activityInteractionController;
        }

        @Override // com.yandex.mobile.ads.impl.er1
        public final void a(@NotNull Activity activity, @Nullable Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            ap0.a(new Object[0]);
            if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !Intrinsics.areEqual(string, this.f26408c)) {
                return;
            }
            this.f26406a.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2101n0
        public final void b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            boolean z4 = false;
            ap0.a(new Object[0]);
            int i4 = ew1.f25476l;
            du1 a4 = ew1.a.a().a(activity);
            boolean z5 = a4 != null && a4.s0();
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
                z4 = true;
            }
            WeakReference<Activity> weakReference = this.f26407b;
            if ((weakReference == null || !Intrinsics.areEqual(activity, weakReference.get()) || z5) && (!z5 || z4)) {
                return;
            }
            this.f26406a.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2101n0
        public final void a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            ap0.a(new Object[0]);
            if (this.f26407b == null) {
                this.f26407b = new WeakReference<>(activity);
            }
        }

        @Override // com.yandex.mobile.ads.impl.er1
        public final void b(@NotNull Activity activity, @Nullable Bundle bundle) {
            WeakReference<Activity> weakReference;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            ap0.a(new Object[0]);
            if (bundle == null || (weakReference = this.f26407b) == null || !Intrinsics.areEqual(activity, weakReference.get())) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.f26408c = uuid;
            bundle.putString("monetization_ads_activity_id", uuid);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1959h0(Context context, C2286v2 c2286v2, C2360y7 c2360y7, InterfaceC2006j0 interfaceC2006j0, c80 c80Var) {
        this(context, c2286v2, interfaceC2006j0, r4, r5, r6, y22.a.a());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        C2030k0 c2030k0 = new C2030k0(context, c2286v2, c2360y7, interfaceC2006j0, c80Var);
        C1887e0 a4 = C1863d0.a();
        int i4 = y22.f34782d;
    }
}
