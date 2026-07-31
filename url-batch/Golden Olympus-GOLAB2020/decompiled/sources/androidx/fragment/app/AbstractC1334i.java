package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.M;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1334i {
    private static int a(Fragment fragment, boolean z4, boolean z5) {
        return z5 ? z4 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z4 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static a b(Context context, Fragment fragment, boolean z4, boolean z5) {
        int nextTransition = fragment.getNextTransition();
        int a4 = a(fragment, z4, z5);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(W.b.f9593c) != null) {
            fragment.mContainer.setTag(W.b.f9593c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z4, a4);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z4, a4);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a4 == 0 && nextTransition != 0) {
            a4 = d(context, nextTransition, z4);
        }
        if (a4 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a4));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a4);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a4);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e5) {
                if (equals) {
                    throw e5;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a4);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i4, boolean z4) {
        if (i4 == 4097) {
            return z4 ? W.a.f9589e : W.a.f9590f;
        }
        if (i4 == 8194) {
            return z4 ? W.a.f9585a : W.a.f9586b;
        }
        if (i4 == 8197) {
            return z4 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i4 == 4099) {
            return z4 ? W.a.f9587c : W.a.f9588d;
        }
        if (i4 != 4100) {
            return -1;
        }
        return z4 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.i$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f12487a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f12488b;

        a(Animation animation) {
            this.f12487a = animation;
            this.f12488b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f12487a = null;
            this.f12488b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ViewGroup f12489b;

        /* renamed from: c, reason: collision with root package name */
        private final View f12490c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12491d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12492e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f12493f;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f12493f = true;
            this.f12489b = viewGroup;
            this.f12490c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation) {
            this.f12493f = true;
            if (this.f12491d) {
                return !this.f12492e;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f12491d = true;
                M.a(this.f12489b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12491d || !this.f12493f) {
                this.f12489b.endViewTransition(this.f12490c);
                this.f12492e = true;
            } else {
                this.f12493f = false;
                this.f12489b.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation, float f4) {
            this.f12493f = true;
            if (this.f12491d) {
                return !this.f12492e;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f12491d = true;
                M.a(this.f12489b, this);
            }
            return true;
        }
    }
}
