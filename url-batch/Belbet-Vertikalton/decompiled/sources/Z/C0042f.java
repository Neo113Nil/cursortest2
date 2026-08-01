package Z;

import a.AbstractC0058a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.winpower.neonfit.R;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042f extends AbstractC0043g {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1556d;
    public B1.c e;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.c j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        B1.c cVar;
        if (this.f1556d) {
            return this.e;
        }
        U u2 = (U) this.f1557a;
        boolean z2 = u2.f1512a == 2;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = u2.f1514c;
        C0052p c0052p = abstractComponentCallbacksC0053q.H;
        int i2 = c0052p == null ? 0 : c0052p.f1586f;
        if (!this.f1555c) {
            if (z2) {
                if (c0052p != null) {
                    i = c0052p.f1583b;
                    abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0053q.f1594D;
                    B1.c cVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.e = cVar2;
                    this.f1556d = true;
                    return cVar2;
                }
                i = 0;
                abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0053q.f1594D;
                B1.c cVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = cVar22;
                this.f1556d = true;
                return cVar22;
            }
            if (c0052p != null) {
                i = c0052p.f1584c;
                abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0053q.f1594D;
                B1.c cVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = cVar222;
                this.f1556d = true;
                return cVar222;
            }
            i = 0;
            abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0053q.f1594D;
            B1.c cVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = cVar2222;
            this.f1556d = true;
            return cVar2222;
        }
        if (!z2) {
            if (c0052p != null) {
                i = c0052p.e;
                abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0053q.f1594D;
                B1.c cVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = cVar22222;
                this.f1556d = true;
                return cVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0053q.f1594D;
            B1.c cVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = cVar222222;
            this.f1556d = true;
            return cVar222222;
        }
        if (c0052p != null) {
            i = c0052p.f1585d;
            abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0053q.f1594D;
            B1.c cVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0053q.f1594D.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? AbstractC0058a.d0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0058a.d0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? AbstractC0058a.d0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0058a.d0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                cVar = new B1.c(loadAnimation);
                                cVar2222222 = cVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            cVar = new B1.c(loadAnimator);
                            cVar2222222 = cVar;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            cVar2222222 = new B1.c(loadAnimation2);
                        }
                    }
                }
            }
            this.e = cVar2222222;
            this.f1556d = true;
            return cVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0053q.E(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0053q.f1594D;
        B1.c cVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0053q.f1594D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0053q.f1594D;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? AbstractC0058a.d0(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0058a.d0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? AbstractC0058a.d0(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0058a.d0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.e = cVar22222222;
        this.f1556d = true;
        return cVar22222222;
    }
}
