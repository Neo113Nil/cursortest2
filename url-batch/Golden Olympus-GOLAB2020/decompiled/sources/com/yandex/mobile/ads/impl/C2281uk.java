package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2281uk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<mb2> f33156a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rs f33157b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<ViewGroup> f33158c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bl0 f33159d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private j70 f33160e;

    public C2281uk(@NotNull ViewGroup adViewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull rs binder, @NotNull WeakReference<ViewGroup> adViewGroupReference, @NotNull bl0 binderPrivate, @Nullable j70 j70Var) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(adViewGroupReference, "adViewGroupReference");
        Intrinsics.checkNotNullParameter(binderPrivate, "binderPrivate");
        this.f33156a = friendlyOverlays;
        this.f33157b = binder;
        this.f33158c = adViewGroupReference;
        this.f33159d = binderPrivate;
        this.f33160e = j70Var;
    }

    public final void a() {
        ViewGroup viewGroup = this.f33158c.get();
        if (viewGroup != null) {
            if (this.f33160e == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f33160e = new j70(context);
                viewGroup.addView(this.f33160e, new ViewGroup.LayoutParams(-1, -1));
            }
            j70 j70Var = this.f33160e;
            if (j70Var != null) {
                this.f33159d.a(j70Var, this.f33156a);
            }
        }
    }

    public final void b() {
        j70 j70Var;
        ViewGroup viewGroup = this.f33158c.get();
        if (viewGroup != null && (j70Var = this.f33160e) != null) {
            viewGroup.removeView(j70Var);
        }
        this.f33160e = null;
        rs rsVar = this.f33157b;
        rsVar.a((vl2) null);
        rsVar.e();
        rsVar.invalidateAdPlayer();
        rsVar.a();
    }

    public final void c() {
        this.f33159d.a();
    }

    public final void d() {
        this.f33159d.b();
    }

    public final void a(@Nullable cb2 cb2Var) {
        this.f33157b.a(cb2Var);
    }
}
