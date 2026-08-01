package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sg extends k4 {
    public boolean c;
    public boolean d;
    public a5 e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a5 j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        a5 a5Var;
        if (this.d) {
            return this.e;
        }
        m60 m60Var = (m60) this.a;
        pm pmVar = m60Var.c;
        boolean z = m60Var.a == 2;
        boolean z2 = this.c;
        om omVar = pmVar.M;
        int i2 = omVar == null ? 0 : omVar.f;
        if (!z2) {
            if (z) {
                if (omVar != null) {
                    i = omVar.b;
                    pmVar.G(0, 0, 0, 0);
                    viewGroup = pmVar.I;
                    a5 a5Var2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = pmVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.e = a5Var2;
                    this.d = true;
                    return a5Var2;
                }
                i = 0;
                pmVar.G(0, 0, 0, 0);
                viewGroup = pmVar.I;
                a5 a5Var22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = pmVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = a5Var22;
                this.d = true;
                return a5Var22;
            }
            if (omVar != null) {
                i = omVar.c;
                pmVar.G(0, 0, 0, 0);
                viewGroup = pmVar.I;
                a5 a5Var222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = pmVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = a5Var222;
                this.d = true;
                return a5Var222;
            }
            i = 0;
            pmVar.G(0, 0, 0, 0);
            viewGroup = pmVar.I;
            a5 a5Var2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = pmVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = a5Var2222;
            this.d = true;
            return a5Var2222;
        }
        if (!z) {
            if (omVar != null) {
                i = omVar.e;
                pmVar.G(0, 0, 0, 0);
                viewGroup = pmVar.I;
                a5 a5Var22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = pmVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = a5Var22222;
                this.d = true;
                return a5Var22222;
            }
            i = 0;
            pmVar.G(0, 0, 0, 0);
            viewGroup = pmVar.I;
            a5 a5Var222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = pmVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = a5Var222222;
            this.d = true;
            return a5Var222222;
        }
        if (omVar != null) {
            i = omVar.d;
            pmVar.G(0, 0, 0, 0);
            viewGroup = pmVar.I;
            a5 a5Var2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                pmVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = pmVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? mz.P(context, android.R.attr.activityOpenEnterAnimation) : mz.P(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? mz.P(context, android.R.attr.activityCloseEnterAnimation) : mz.P(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                a5Var = new a5(loadAnimation);
                                a5Var2222222 = a5Var;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            a5Var = new a5(loadAnimator);
                            a5Var2222222 = a5Var;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            a5Var2222222 = new a5(loadAnimation2);
                        }
                    }
                }
            }
            this.e = a5Var2222222;
            this.d = true;
            return a5Var2222222;
        }
        i = 0;
        pmVar.G(0, 0, 0, 0);
        viewGroup = pmVar.I;
        a5 a5Var22222222 = null;
        if (viewGroup != null) {
            pmVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = pmVar.I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? mz.P(context, android.R.attr.activityOpenEnterAnimation) : mz.P(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? mz.P(context, android.R.attr.activityCloseEnterAnimation) : mz.P(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.e = a5Var22222222;
        this.d = true;
        return a5Var22222222;
    }
}
