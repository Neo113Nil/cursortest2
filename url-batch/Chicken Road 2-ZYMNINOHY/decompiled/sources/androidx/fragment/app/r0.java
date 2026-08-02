package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4958b;

    public r0(View view, ArrayList arrayList) {
        this.f4957a = view;
        this.f4958b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f4957a.setVisibility(8);
        ArrayList arrayList = this.f4958b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
