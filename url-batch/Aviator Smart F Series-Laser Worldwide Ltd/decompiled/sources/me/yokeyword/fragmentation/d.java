package me.yokeyword.fragmentation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public interface d {
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_OK = -1;
    public static final int SINGLETASK = 2;
    public static final int SINGLETOP = 1;
    public static final int STANDARD = 0;

    void enqueueAction(Runnable runnable);

    a extraTransaction();

    FragmentAnimator getFragmentAnimator();

    f getSupportDelegate();

    boolean isSupportVisible();

    boolean onBackPressedSupport();

    FragmentAnimator onCreateFragmentAnimator();

    void onEnterAnimationEnd(@Nullable Bundle bundle);

    void onFragmentResult(int i8, int i9, Bundle bundle);

    void onLazyInitView(@Nullable Bundle bundle);

    void onNewBundle(Bundle bundle);

    void onSupportInvisible();

    void onSupportVisible();

    void post(Runnable runnable);

    void putNewBundle(Bundle bundle);

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);

    void setFragmentResult(int i8, Bundle bundle);
}
