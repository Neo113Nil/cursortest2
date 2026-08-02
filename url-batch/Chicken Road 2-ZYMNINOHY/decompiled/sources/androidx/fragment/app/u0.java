package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u0 extends w0 {
    public static boolean t(Transition transition) {
        return (w0.h(transition.getTargetIds()) && w0.h(transition.getTargetNames()) && w0.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.w0
    public final void a(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.w0
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                b(transitionSet.getTransitionAt(i4), arrayList);
                i4++;
            }
            return;
        }
        if (t(transition) || !w0.h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            transition.addTarget((View) arrayList.get(i4));
            i4++;
        }
    }

    @Override // androidx.fragment.app.w0
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.w0
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.w0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w0
    public final void i() {
        if (f0.J(4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    @Override // androidx.fragment.app.w0
    public final Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.w0
    public final Object k(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.w0
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new r0(view, arrayList));
    }

    @Override // androidx.fragment.app.w0
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new s0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.w0
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new q0(1, rect));
    }

    @Override // androidx.fragment.app.w0
    public final void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            w0.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new q0(0, rect));
        }
    }

    @Override // androidx.fragment.app.w0
    public final void p(Object obj, A.b bVar, RunnableC0208l runnableC0208l) {
        ((Transition) obj).addListener(new t0(runnableC0208l));
    }

    @Override // androidx.fragment.app.w0
    public final void q(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            w0.d((View) arrayList.get(i4), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.w0
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w0
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                u(transitionSet.getTransitionAt(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (t(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i4 < size) {
            transition.addTarget((View) arrayList2.get(i4));
            i4++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
