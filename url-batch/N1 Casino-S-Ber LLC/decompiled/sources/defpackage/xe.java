package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xe extends a4 {
    public boolean c;
    public boolean d;
    public q4 e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q4 j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        q4 q4Var;
        if (this.d) {
            return this.e;
        }
        k30 k30Var = (k30) this.a;
        mk mkVar = k30Var.c;
        boolean z = k30Var.a == 2;
        boolean z2 = this.c;
        kk kkVar = mkVar.M;
        int i2 = kkVar == null ? 0 : kkVar.f;
        if (!z2) {
            if (z) {
                if (kkVar != null) {
                    i = kkVar.b;
                    mkVar.G(0, 0, 0, 0);
                    viewGroup = mkVar.I;
                    q4 q4Var2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = mkVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.e = q4Var2;
                    this.d = true;
                    return q4Var2;
                }
                i = 0;
                mkVar.G(0, 0, 0, 0);
                viewGroup = mkVar.I;
                q4 q4Var22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = mkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = q4Var22;
                this.d = true;
                return q4Var22;
            }
            if (kkVar != null) {
                i = kkVar.c;
                mkVar.G(0, 0, 0, 0);
                viewGroup = mkVar.I;
                q4 q4Var222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = mkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = q4Var222;
                this.d = true;
                return q4Var222;
            }
            i = 0;
            mkVar.G(0, 0, 0, 0);
            viewGroup = mkVar.I;
            q4 q4Var2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = mkVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = q4Var2222;
            this.d = true;
            return q4Var2222;
        }
        if (!z) {
            if (kkVar != null) {
                i = kkVar.e;
                mkVar.G(0, 0, 0, 0);
                viewGroup = mkVar.I;
                q4 q4Var22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = mkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = q4Var22222;
                this.d = true;
                return q4Var22222;
            }
            i = 0;
            mkVar.G(0, 0, 0, 0);
            viewGroup = mkVar.I;
            q4 q4Var222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = mkVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = q4Var222222;
            this.d = true;
            return q4Var222222;
        }
        if (kkVar != null) {
            i = kkVar.d;
            mkVar.G(0, 0, 0, 0);
            viewGroup = mkVar.I;
            q4 q4Var2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                mkVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = mkVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? zo.P(context, android.R.attr.activityOpenEnterAnimation) : zo.P(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? zo.P(context, android.R.attr.activityCloseEnterAnimation) : zo.P(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                q4Var = new q4(loadAnimation);
                                q4Var2222222 = q4Var;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            q4Var = new q4(loadAnimator);
                            q4Var2222222 = q4Var;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            q4Var2222222 = new q4(loadAnimation2);
                        }
                    }
                }
            }
            this.e = q4Var2222222;
            this.d = true;
            return q4Var2222222;
        }
        i = 0;
        mkVar.G(0, 0, 0, 0);
        viewGroup = mkVar.I;
        q4 q4Var22222222 = null;
        if (viewGroup != null) {
            mkVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = mkVar.I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? zo.P(context, android.R.attr.activityOpenEnterAnimation) : zo.P(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? zo.P(context, android.R.attr.activityCloseEnterAnimation) : zo.P(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.e = q4Var22222222;
        this.d = true;
        return q4Var22222222;
    }
}
