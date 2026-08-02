package androidx.fragment.app;

import android.animation.AnimatorSet;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0206j f4892a = new C0206j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j4) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j4);
    }
}
