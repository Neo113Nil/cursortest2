package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4963c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f4965e;

    public s0(u0 u0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f4965e = u0Var;
        this.f4961a = obj;
        this.f4962b = arrayList;
        this.f4963c = obj2;
        this.f4964d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        u0 u0Var = this.f4965e;
        Object obj = this.f4961a;
        if (obj != null) {
            u0Var.u(obj, this.f4962b, null);
        }
        Object obj2 = this.f4963c;
        if (obj2 != null) {
            u0Var.u(obj2, this.f4964d, null);
        }
    }
}
