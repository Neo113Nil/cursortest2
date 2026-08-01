package Z;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.winfour.neondrop.R;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036f extends AbstractC0037g {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1136c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public D.j f1137e;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D.j j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        D.j jVar;
        if (this.d) {
            return this.f1137e;
        }
        U u2 = (U) this.f1138a;
        boolean z2 = u2.f1095a == 2;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = u2.f1097c;
        C0046p c0046p = abstractComponentCallbacksC0047q.H;
        int i2 = c0046p == null ? 0 : c0046p.f1167f;
        if (!this.f1136c) {
            if (z2) {
                if (c0046p != null) {
                    i = c0046p.f1164b;
                    abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0047q.f1175D;
                    D.j jVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f1137e = jVar2;
                    this.d = true;
                    return jVar2;
                }
                i = 0;
                abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0047q.f1175D;
                D.j jVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1137e = jVar22;
                this.d = true;
                return jVar22;
            }
            if (c0046p != null) {
                i = c0046p.f1165c;
                abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0047q.f1175D;
                D.j jVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1137e = jVar222;
                this.d = true;
                return jVar222;
            }
            i = 0;
            abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0047q.f1175D;
            D.j jVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1137e = jVar2222;
            this.d = true;
            return jVar2222;
        }
        if (!z2) {
            if (c0046p != null) {
                i = c0046p.f1166e;
                abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0047q.f1175D;
                D.j jVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1137e = jVar22222;
                this.d = true;
                return jVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0047q.f1175D;
            D.j jVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1137e = jVar222222;
            this.d = true;
            return jVar222222;
        }
        if (c0046p != null) {
            i = c0046p.d;
            abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0047q.f1175D;
            D.j jVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0047q.f1175D.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? z1.d.f0(context, android.R.attr.activityOpenEnterAnimation) : z1.d.f0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? z1.d.f0(context, android.R.attr.activityCloseEnterAnimation) : z1.d.f0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                jVar = new D.j(loadAnimation);
                                jVar2222222 = jVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            jVar = new D.j(loadAnimator);
                            jVar2222222 = jVar;
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            jVar2222222 = new D.j(loadAnimation2);
                        }
                    }
                }
            }
            this.f1137e = jVar2222222;
            this.d = true;
            return jVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0047q.E(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0047q.f1175D;
        D.j jVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0047q.f1175D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0047q.f1175D;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? z1.d.f0(context, android.R.attr.activityOpenEnterAnimation) : z1.d.f0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? z1.d.f0(context, android.R.attr.activityCloseEnterAnimation) : z1.d.f0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f1137e = jVar22222222;
        this.d = true;
        return jVar22222222;
    }
}
