package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ts0 implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;

    public ts0(vs0 vs0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            vs0.d(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            vs0.d(obj2, this.d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
