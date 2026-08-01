package Z;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.winfour.winrandom.R;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039f extends AbstractC0040g {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1125c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public C.j f1126e;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C.j j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        C.j jVar;
        if (this.d) {
            return this.f1126e;
        }
        U u2 = (U) this.f1127a;
        boolean z2 = u2.f1081a == 2;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = u2.f1083c;
        C0049p c0049p = abstractComponentCallbacksC0050q.f1168H;
        int i2 = c0049p == null ? 0 : c0049p.f1156f;
        if (!this.f1125c) {
            if (z2) {
                if (c0049p != null) {
                    i = c0049p.f1153b;
                    abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0050q.f1165D;
                    C.j jVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f1126e = jVar2;
                    this.d = true;
                    return jVar2;
                }
                i = 0;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1165D;
                C.j jVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1126e = jVar22;
                this.d = true;
                return jVar22;
            }
            if (c0049p != null) {
                i = c0049p.f1154c;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1165D;
                C.j jVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1126e = jVar222;
                this.d = true;
                return jVar222;
            }
            i = 0;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1165D;
            C.j jVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1126e = jVar2222;
            this.d = true;
            return jVar2222;
        }
        if (!z2) {
            if (c0049p != null) {
                i = c0049p.f1155e;
                abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0050q.f1165D;
                C.j jVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1126e = jVar22222;
                this.d = true;
                return jVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1165D;
            C.j jVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1126e = jVar222222;
            this.d = true;
            return jVar222222;
        }
        if (c0049p != null) {
            i = c0049p.d;
            abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0050q.f1165D;
            C.j jVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0050q.f1165D.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? A1.m.l0(context, android.R.attr.activityOpenEnterAnimation) : A1.m.l0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? A1.m.l0(context, android.R.attr.activityCloseEnterAnimation) : A1.m.l0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                jVar = new C.j(loadAnimation);
                                jVar2222222 = jVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            jVar = new C.j(loadAnimator);
                            jVar2222222 = jVar;
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            jVar2222222 = new C.j(loadAnimation2);
                        }
                    }
                }
            }
            this.f1126e = jVar2222222;
            this.d = true;
            return jVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0050q.E(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0050q.f1165D;
        C.j jVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0050q.f1165D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0050q.f1165D;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? A1.m.l0(context, android.R.attr.activityOpenEnterAnimation) : A1.m.l0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? A1.m.l0(context, android.R.attr.activityCloseEnterAnimation) : A1.m.l0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f1126e = jVar22222222;
        this.d = true;
        return jVar22222222;
    }
}
