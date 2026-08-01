package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.a;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xi extends s4 {
    public boolean c;
    public boolean d;
    public i5 e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i5 j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        i5 i5Var;
        if (this.d) {
            return this.e;
        }
        qe0 qe0Var = (qe0) this.a;
        a aVar = qe0Var.c;
        boolean z = qe0Var.a == se0.VISIBLE;
        boolean z2 = this.c;
        vp vpVar = aVar.M;
        int i2 = vpVar == null ? 0 : vpVar.f;
        if (!z2) {
            if (z) {
                if (vpVar != null) {
                    i = vpVar.b;
                    aVar.G(0, 0, 0, 0);
                    viewGroup = aVar.I;
                    i5 i5Var2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = aVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.e = i5Var2;
                    this.d = true;
                    return i5Var2;
                }
                i = 0;
                aVar.G(0, 0, 0, 0);
                viewGroup = aVar.I;
                i5 i5Var22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = aVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = i5Var22;
                this.d = true;
                return i5Var22;
            }
            if (vpVar != null) {
                i = vpVar.c;
                aVar.G(0, 0, 0, 0);
                viewGroup = aVar.I;
                i5 i5Var222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = aVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = i5Var222;
                this.d = true;
                return i5Var222;
            }
            i = 0;
            aVar.G(0, 0, 0, 0);
            viewGroup = aVar.I;
            i5 i5Var2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = aVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = i5Var2222;
            this.d = true;
            return i5Var2222;
        }
        if (!z) {
            if (vpVar != null) {
                i = vpVar.e;
                aVar.G(0, 0, 0, 0);
                viewGroup = aVar.I;
                i5 i5Var22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = aVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = i5Var22222;
                this.d = true;
                return i5Var22222;
            }
            i = 0;
            aVar.G(0, 0, 0, 0);
            viewGroup = aVar.I;
            i5 i5Var222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = aVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = i5Var222222;
            this.d = true;
            return i5Var222222;
        }
        if (vpVar != null) {
            i = vpVar.d;
            aVar.G(0, 0, 0, 0);
            viewGroup = aVar.I;
            i5 i5Var2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                aVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = aVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? n9.S(context, android.R.attr.activityOpenEnterAnimation) : n9.S(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? n9.S(context, android.R.attr.activityCloseEnterAnimation) : n9.S(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                i5Var = new i5(loadAnimation);
                                i5Var2222222 = i5Var;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            i5Var = new i5(loadAnimator);
                            i5Var2222222 = i5Var;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            i5Var2222222 = new i5(loadAnimation2);
                        }
                    }
                }
            }
            this.e = i5Var2222222;
            this.d = true;
            return i5Var2222222;
        }
        i = 0;
        aVar.G(0, 0, 0, 0);
        viewGroup = aVar.I;
        i5 i5Var22222222 = null;
        if (viewGroup != null) {
            aVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = aVar.I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? n9.S(context, android.R.attr.activityOpenEnterAnimation) : n9.S(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? n9.S(context, android.R.attr.activityCloseEnterAnimation) : n9.S(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.e = i5Var22222222;
        this.d = true;
        return i5Var22222222;
    }
}
