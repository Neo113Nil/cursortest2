package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2304vk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<mb2> f33661a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rs f33662b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<ViewGroup> f33663c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bl0 f33664d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private j70 f33665e;

    public C2304vk(@NotNull ViewGroup adViewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull rs binder, @NotNull WeakReference<ViewGroup> adViewGroupReference, @NotNull bl0 binderPrivate, @Nullable j70 j70Var) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(adViewGroupReference, "adViewGroupReference");
        Intrinsics.checkNotNullParameter(binderPrivate, "binderPrivate");
        this.f33661a = friendlyOverlays;
        this.f33662b = binder;
        this.f33663c = adViewGroupReference;
        this.f33664d = binderPrivate;
        this.f33665e = j70Var;
    }

    public final void a() {
        ViewGroup viewGroup = this.f33663c.get();
        if (viewGroup != null) {
            if (this.f33665e == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j70 j70Var = new j70(context);
                j70Var.setTag("instream_ad_view");
                this.f33665e = j70Var;
                viewGroup.addView(this.f33665e, new ViewGroup.LayoutParams(-1, -1));
            }
            j70 j70Var2 = this.f33665e;
            if (j70Var2 != null) {
                this.f33664d.a(j70Var2, this.f33661a);
            }
        }
    }

    public final void b() {
        j70 j70Var;
        ViewGroup viewGroup = this.f33663c.get();
        if (viewGroup != null && (j70Var = this.f33665e) != null) {
            viewGroup.removeView(j70Var);
        }
        this.f33665e = null;
        rs rsVar = this.f33662b;
        rsVar.a((vl2) null);
        rsVar.e();
        rsVar.invalidateAdPlayer();
        rsVar.a();
    }

    public final void c() {
        this.f33664d.a();
    }

    public final void d() {
        this.f33664d.b();
    }

    public final void a(@Nullable cb2 cb2Var) {
        this.f33662b.a(cb2Var);
    }
}
