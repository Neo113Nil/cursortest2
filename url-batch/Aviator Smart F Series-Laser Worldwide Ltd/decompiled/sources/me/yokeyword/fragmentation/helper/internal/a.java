package me.yokeyword.fragmentation.helper.internal;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.R$anim;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public final class a {
    private Context context;
    public Animation enterAnim;
    public Animation exitAnim;
    private FragmentAnimator fragmentAnimator;
    private Animation noneAnim;
    private Animation noneAnimFixed;
    public Animation popEnterAnim;
    public Animation popExitAnim;

    /* renamed from: me.yokeyword.fragmentation.helper.internal.a$a, reason: collision with other inner class name */
    class C0374a extends Animation {
        C0374a() {
        }
    }

    class b extends Animation {
        b() {
        }
    }

    public a(Context context, FragmentAnimator fragmentAnimator) {
        this.context = context;
        notifyChanged(fragmentAnimator);
    }

    private Animation initEnterAnim() {
        if (this.fragmentAnimator.getEnter() == 0) {
            this.enterAnim = AnimationUtils.loadAnimation(this.context, R$anim.no_anim);
        } else {
            this.enterAnim = AnimationUtils.loadAnimation(this.context, this.fragmentAnimator.getEnter());
        }
        return this.enterAnim;
    }

    private Animation initExitAnim() {
        if (this.fragmentAnimator.getExit() == 0) {
            this.exitAnim = AnimationUtils.loadAnimation(this.context, R$anim.no_anim);
        } else {
            this.exitAnim = AnimationUtils.loadAnimation(this.context, this.fragmentAnimator.getExit());
        }
        return this.exitAnim;
    }

    private Animation initPopEnterAnim() {
        if (this.fragmentAnimator.getPopEnter() == 0) {
            this.popEnterAnim = AnimationUtils.loadAnimation(this.context, R$anim.no_anim);
        } else {
            this.popEnterAnim = AnimationUtils.loadAnimation(this.context, this.fragmentAnimator.getPopEnter());
        }
        return this.popEnterAnim;
    }

    private Animation initPopExitAnim() {
        if (this.fragmentAnimator.getPopExit() == 0) {
            this.popExitAnim = AnimationUtils.loadAnimation(this.context, R$anim.no_anim);
        } else {
            this.popExitAnim = AnimationUtils.loadAnimation(this.context, this.fragmentAnimator.getPopExit());
        }
        return this.popExitAnim;
    }

    @Nullable
    public Animation compatChildFragmentExitAnim(Fragment fragment) {
        if (!(fragment.getTag() != null && fragment.getTag().startsWith("android:switcher:") && fragment.getUserVisibleHint()) && (fragment.getParentFragment() == null || !fragment.getParentFragment().isRemoving() || fragment.isHidden())) {
            return null;
        }
        b bVar = new b();
        bVar.setDuration(this.exitAnim.getDuration());
        return bVar;
    }

    public Animation getNoneAnim() {
        if (this.noneAnim == null) {
            this.noneAnim = AnimationUtils.loadAnimation(this.context, R$anim.no_anim);
        }
        return this.noneAnim;
    }

    public Animation getNoneAnimFixed() {
        if (this.noneAnimFixed == null) {
            this.noneAnimFixed = new C0374a();
        }
        return this.noneAnimFixed;
    }

    public void notifyChanged(FragmentAnimator fragmentAnimator) {
        this.fragmentAnimator = fragmentAnimator;
        initEnterAnim();
        initExitAnim();
        initPopEnterAnim();
        initPopExitAnim();
    }
}
