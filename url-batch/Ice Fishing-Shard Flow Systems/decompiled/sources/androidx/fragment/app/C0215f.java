package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215f extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0216g f3726b;

    public C0215f(C0216g animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f3726b = animationInfo;
    }

    @Override // androidx.fragment.app.c0
    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f3726b.p()) {
            throw null;
        }
        container.getContext();
        throw null;
    }
}
