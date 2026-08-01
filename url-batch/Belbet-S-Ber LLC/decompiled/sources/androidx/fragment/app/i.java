package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public boolean f548c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.emoji2.text.q f549e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.emoji2.text.q j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        androidx.emoji2.text.q qVar;
        if (this.d) {
            return this.f549e;
        }
        v0 v0Var = (v0) this.f550a;
        u uVar = v0Var.f669c;
        boolean z4 = v0Var.f667a == 2;
        boolean z5 = this.f548c;
        s sVar = uVar.M;
        int i4 = sVar == null ? 0 : sVar.f636f;
        if (!z5) {
            if (z4) {
                if (sVar != null) {
                    i = sVar.f633b;
                    uVar.E(0, 0, 0, 0);
                    viewGroup = uVar.I;
                    androidx.emoji2.text.q qVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = uVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f549e = qVar2;
                    this.d = true;
                    return qVar2;
                }
                i = 0;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                androidx.emoji2.text.q qVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f549e = qVar22;
                this.d = true;
                return qVar22;
            }
            if (sVar != null) {
                i = sVar.f634c;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                androidx.emoji2.text.q qVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f549e = qVar222;
                this.d = true;
                return qVar222;
            }
            i = 0;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            androidx.emoji2.text.q qVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f549e = qVar2222;
            this.d = true;
            return qVar2222;
        }
        if (!z4) {
            if (sVar != null) {
                i = sVar.f635e;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                androidx.emoji2.text.q qVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f549e = qVar22222;
                this.d = true;
                return qVar22222;
            }
            i = 0;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            androidx.emoji2.text.q qVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f549e = qVar222222;
            this.d = true;
            return qVar222222;
        }
        if (sVar != null) {
            i = sVar.d;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            androidx.emoji2.text.q qVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                uVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i4 != 0) {
                    i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z4 ? b4.l.i0(context, android.R.attr.activityOpenEnterAnimation) : b4.l.i0(context, android.R.attr.activityOpenExitAnimation) : z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z4 ? b4.l.i0(context, android.R.attr.activityCloseEnterAnimation) : b4.l.i0(context, android.R.attr.activityCloseExitAnimation) : z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e4) {
                                throw e4;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                qVar = new androidx.emoji2.text.q(loadAnimation);
                                qVar2222222 = qVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            qVar = new androidx.emoji2.text.q(loadAnimator);
                            qVar2222222 = qVar;
                        }
                    } catch (RuntimeException e5) {
                        if (equals) {
                            throw e5;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            qVar2222222 = new androidx.emoji2.text.q(loadAnimation2);
                        }
                    }
                }
            }
            this.f549e = qVar2222222;
            this.d = true;
            return qVar2222222;
        }
        i = 0;
        uVar.E(0, 0, 0, 0);
        viewGroup = uVar.I;
        androidx.emoji2.text.q qVar22222222 = null;
        if (viewGroup != null) {
            uVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = uVar.I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z4 ? b4.l.i0(context, android.R.attr.activityOpenEnterAnimation) : b4.l.i0(context, android.R.attr.activityOpenExitAnimation) : z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z4 ? b4.l.i0(context, android.R.attr.activityCloseEnterAnimation) : b4.l.i0(context, android.R.attr.activityCloseExitAnimation) : z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f549e = qVar22222222;
        this.d = true;
        return qVar22222222;
    }
}
