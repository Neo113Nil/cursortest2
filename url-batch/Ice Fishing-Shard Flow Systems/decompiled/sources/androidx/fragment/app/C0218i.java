package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import d.C0351b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218i extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0216g f3737b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f3738c;

    public C0218i(C0216g animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f3737b = animatorInfo;
    }

    @Override // androidx.fragment.app.c0
    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f3738c;
        animatorSet.getClass();
        animatorSet.start();
        if (Q.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.c0
    public final void b(C0351b backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f3738c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.c0
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        C0216g c0216g = this.f3737b;
        if (c0216g.p()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        P0.s I7 = c0216g.I(context);
        this.f3738c = I7 != null ? (AnimatorSet) I7.f2252e : null;
        throw null;
    }
}
