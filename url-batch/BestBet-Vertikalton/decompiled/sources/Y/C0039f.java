package Y;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.fortunequest.neontrack.R;
import u0.C0365d;

/* renamed from: Y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039f extends AbstractC0040g {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1406c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public C0365d f1407e;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0365d j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        C0365d c0365d;
        if (this.d) {
            return this.f1407e;
        }
        U u2 = (U) this.f1408a;
        boolean z2 = u2.f1365a == 2;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = u2.f1367c;
        C0049p c0049p = abstractComponentCallbacksC0050q.f1448H;
        int i2 = c0049p == null ? 0 : c0049p.f1437f;
        if (!this.f1406c) {
            if (z2) {
                if (c0049p != null) {
                    i = c0049p.f1434b;
                    abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0050q.f1445D;
                    C0365d c0365d2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f1407e = c0365d2;
                    this.d = true;
                    return c0365d2;
                }
                i = 0;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1445D;
                C0365d c0365d22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1407e = c0365d22;
                this.d = true;
                return c0365d22;
            }
            if (c0049p != null) {
                i = c0049p.f1435c;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1445D;
                C0365d c0365d222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1407e = c0365d222;
                this.d = true;
                return c0365d222;
            }
            i = 0;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1445D;
            C0365d c0365d2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1407e = c0365d2222;
            this.d = true;
            return c0365d2222;
        }
        if (!z2) {
            if (c0049p != null) {
                i = c0049p.f1436e;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1445D;
                C0365d c0365d22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1407e = c0365d22222;
                this.d = true;
                return c0365d22222;
            }
            i = 0;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1445D;
            C0365d c0365d222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1407e = c0365d222222;
            this.d = true;
            return c0365d222222;
        }
        if (c0049p != null) {
            i = c0049p.d;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1445D;
            C0365d c0365d2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0050q.f1445D.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? H1.d.t0(context, android.R.attr.activityOpenEnterAnimation) : H1.d.t0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? H1.d.t0(context, android.R.attr.activityCloseEnterAnimation) : H1.d.t0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e2) {
                                throw e2;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                c0365d = new C0365d(loadAnimation);
                                c0365d2222222 = c0365d;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            c0365d = new C0365d(loadAnimator);
                            c0365d2222222 = c0365d;
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            c0365d2222222 = new C0365d(loadAnimation2);
                        }
                    }
                }
            }
            this.f1407e = c0365d2222222;
            this.d = true;
            return c0365d2222222;
        }
        i = 0;
        abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0050q.f1445D;
        C0365d c0365d22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0050q.f1445D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0050q.f1445D;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? H1.d.t0(context, android.R.attr.activityOpenEnterAnimation) : H1.d.t0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? H1.d.t0(context, android.R.attr.activityCloseEnterAnimation) : H1.d.t0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f1407e = c0365d22222222;
        this.d = true;
        return c0365d22222222;
    }
}
