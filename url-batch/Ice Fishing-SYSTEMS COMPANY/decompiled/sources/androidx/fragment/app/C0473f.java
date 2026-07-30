package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473f extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5091w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5092x;

    /* renamed from: y, reason: collision with root package name */
    public S0.s f5093y;

    public C0473f(a0 a0Var, K.f fVar, boolean z8) {
        super(2, a0Var, fVar);
        this.f5091w = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final S0.s s(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        S0.s sVar;
        if (this.f5092x) {
            return this.f5093y;
        }
        a0 a0Var = (a0) this.f683u;
        boolean z8 = a0Var.f5058a == 2;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = a0Var.f5060c;
        r rVar = abstractComponentCallbacksC0485s.f5165n0;
        int i4 = rVar == null ? 0 : rVar.f5134f;
        if (!this.f5091w) {
            if (z8) {
                if (rVar != null) {
                    i = rVar.f5130b;
                    abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0485s.f5161W;
                    S0.s sVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f5093y = sVar2;
                    this.f5092x = true;
                    return sVar2;
                }
                i = 0;
                abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0485s.f5161W;
                S0.s sVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f5093y = sVar22;
                this.f5092x = true;
                return sVar22;
            }
            if (rVar != null) {
                i = rVar.f5131c;
                abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0485s.f5161W;
                S0.s sVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f5093y = sVar222;
                this.f5092x = true;
                return sVar222;
            }
            i = 0;
            abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0485s.f5161W;
            S0.s sVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f5093y = sVar2222;
            this.f5092x = true;
            return sVar2222;
        }
        if (!z8) {
            if (rVar != null) {
                i = rVar.f5133e;
                abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0485s.f5161W;
                S0.s sVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f5093y = sVar22222;
                this.f5092x = true;
                return sVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0485s.f5161W;
            S0.s sVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f5093y = sVar222222;
            this.f5092x = true;
            return sVar222222;
        }
        if (rVar != null) {
            i = rVar.f5132d;
            abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0485s.f5161W;
            S0.s sVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(C5284R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0485s.f5161W.setTag(C5284R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i4 != 0) {
                    i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z8 ? Z5.c.p(context, R.attr.activityOpenEnterAnimation) : Z5.c.p(context, R.attr.activityOpenExitAnimation) : z8 ? C5284R.animator.fragment_fade_enter : C5284R.animator.fragment_fade_exit : z8 ? Z5.c.p(context, R.attr.activityCloseEnterAnimation) : Z5.c.p(context, R.attr.activityCloseExitAnimation) : z8 ? C5284R.animator.fragment_close_enter : C5284R.animator.fragment_close_exit : z8 ? C5284R.animator.fragment_open_enter : C5284R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = com.anythink.expressad.foundation.h.k.f19793f.equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e6) {
                                throw e6;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                sVar = new S0.s(8, loadAnimation);
                                sVar2222222 = sVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            sVar = new S0.s(loadAnimator);
                            sVar2222222 = sVar;
                        }
                    } catch (RuntimeException e9) {
                        if (equals) {
                            throw e9;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            sVar2222222 = new S0.s(8, loadAnimation2);
                        }
                    }
                }
            }
            this.f5093y = sVar2222222;
            this.f5092x = true;
            return sVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0485s.A(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0485s.f5161W;
        S0.s sVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0485s.f5161W.setTag(C5284R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z8 ? Z5.c.p(context, R.attr.activityOpenEnterAnimation) : Z5.c.p(context, R.attr.activityOpenExitAnimation) : z8 ? C5284R.animator.fragment_fade_enter : C5284R.animator.fragment_fade_exit : z8 ? Z5.c.p(context, R.attr.activityCloseEnterAnimation) : Z5.c.p(context, R.attr.activityCloseExitAnimation) : z8 ? C5284R.animator.fragment_close_enter : C5284R.animator.fragment_close_exit : z8 ? C5284R.animator.fragment_open_enter : C5284R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f5093y = sVar22222222;
        this.f5092x = true;
        return sVar22222222;
    }
}
