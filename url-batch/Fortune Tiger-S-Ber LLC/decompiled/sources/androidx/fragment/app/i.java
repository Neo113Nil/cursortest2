package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends j {
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f429d;

    /* renamed from: e, reason: collision with root package name */
    public a2.s f430e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a2.s j(Context context) {
        int i4;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        a2.s sVar;
        if (this.f429d) {
            return this.f430e;
        }
        v0 v0Var = (v0) this.f431a;
        u uVar = v0Var.c;
        boolean z3 = v0Var.f542a == 2;
        boolean z4 = this.c;
        s sVar2 = uVar.M;
        int i5 = sVar2 == null ? 0 : sVar2.f513f;
        if (!z4) {
            if (z3) {
                if (sVar2 != null) {
                    i4 = sVar2.f510b;
                    uVar.E(0, 0, 0, 0);
                    viewGroup = uVar.I;
                    a2.s sVar3 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = uVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i4 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    this.f430e = sVar3;
                    this.f429d = true;
                    return sVar3;
                }
                i4 = 0;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                a2.s sVar32 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i4 == 0) {
                }
                if (i4 != 0) {
                }
                this.f430e = sVar32;
                this.f429d = true;
                return sVar32;
            }
            if (sVar2 != null) {
                i4 = sVar2.c;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                a2.s sVar322 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i4 == 0) {
                }
                if (i4 != 0) {
                }
                this.f430e = sVar322;
                this.f429d = true;
                return sVar322;
            }
            i4 = 0;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            a2.s sVar3222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null) {
            }
            if (i4 == 0) {
            }
            if (i4 != 0) {
            }
            this.f430e = sVar3222;
            this.f429d = true;
            return sVar3222;
        }
        if (!z3) {
            if (sVar2 != null) {
                i4 = sVar2.f512e;
                uVar.E(0, 0, 0, 0);
                viewGroup = uVar.I;
                a2.s sVar32222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = uVar.I;
                if (viewGroup2 != null) {
                }
                if (i4 == 0) {
                }
                if (i4 != 0) {
                }
                this.f430e = sVar32222;
                this.f429d = true;
                return sVar32222;
            }
            i4 = 0;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            a2.s sVar322222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null) {
            }
            if (i4 == 0) {
            }
            if (i4 != 0) {
            }
            this.f430e = sVar322222;
            this.f429d = true;
            return sVar322222;
        }
        if (sVar2 != null) {
            i4 = sVar2.f511d;
            uVar.E(0, 0, 0, 0);
            viewGroup = uVar.I;
            a2.s sVar3222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                uVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = uVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i4 == 0 && i5 != 0) {
                    i4 = i5 == 4097 ? i5 != 8194 ? i5 != 8197 ? i5 != 4099 ? i5 != 4100 ? -1 : z3 ? k3.d.h0(context, android.R.attr.activityOpenEnterAnimation) : k3.d.h0(context, android.R.attr.activityOpenExitAnimation) : z3 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z3 ? k3.d.h0(context, android.R.attr.activityCloseEnterAnimation) : k3.d.h0(context, android.R.attr.activityCloseExitAnimation) : z3 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z3 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i4 != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i4));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i4);
                            } catch (Resources.NotFoundException e4) {
                                throw e4;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                sVar = new a2.s(loadAnimation);
                                sVar3222222 = sVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
                        if (loadAnimator != null) {
                            sVar = new a2.s(loadAnimator);
                            sVar3222222 = sVar;
                        }
                    } catch (RuntimeException e5) {
                        if (equals) {
                            throw e5;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i4);
                        if (loadAnimation2 != null) {
                            sVar3222222 = new a2.s(loadAnimation2);
                        }
                    }
                }
            }
            this.f430e = sVar3222222;
            this.f429d = true;
            return sVar3222222;
        }
        i4 = 0;
        uVar.E(0, 0, 0, 0);
        viewGroup = uVar.I;
        a2.s sVar32222222 = null;
        if (viewGroup != null) {
            uVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = uVar.I;
        if (viewGroup2 != null) {
        }
        if (i4 == 0) {
            i4 = i5 == 4097 ? i5 != 8194 ? i5 != 8197 ? i5 != 4099 ? i5 != 4100 ? -1 : z3 ? k3.d.h0(context, android.R.attr.activityOpenEnterAnimation) : k3.d.h0(context, android.R.attr.activityOpenExitAnimation) : z3 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z3 ? k3.d.h0(context, android.R.attr.activityCloseEnterAnimation) : k3.d.h0(context, android.R.attr.activityCloseExitAnimation) : z3 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z3 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i4 != 0) {
        }
        this.f430e = sVar32222222;
        this.f429d = true;
        return sVar32222222;
    }
}
