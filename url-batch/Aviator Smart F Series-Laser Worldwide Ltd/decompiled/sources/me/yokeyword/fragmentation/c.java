package me.yokeyword.fragmentation;

import android.view.MotionEvent;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public interface c {
    boolean dispatchTouchEvent(MotionEvent motionEvent);

    a extraTransaction();

    FragmentAnimator getFragmentAnimator();

    e getSupportDelegate();

    void onBackPressed();

    void onBackPressedSupport();

    FragmentAnimator onCreateFragmentAnimator();

    void post(Runnable runnable);

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);
}
