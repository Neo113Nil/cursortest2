package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.luckyarcade.spinthrow.R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049f extends AbstractC0050g {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1341d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f1342e;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B.j j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        B.j jVar;
        if (this.f1341d) {
            return this.f1342e;
        }
        X x2 = (X) this.f1343a;
        boolean z2 = x2.f1294a == 2;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = x2.f1296c;
        C0059p c0059p = abstractComponentCallbacksC0060q.f1384H;
        int i2 = c0059p == null ? 0 : c0059p.f1373f;
        if (!this.f1340c) {
            if (z2) {
                if (c0059p != null) {
                    i = c0059p.f1369b;
                    abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0060q.f1381D;
                    B.j jVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f1342e = jVar2;
                    this.f1341d = true;
                    return jVar2;
                }
                i = 0;
                abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0060q.f1381D;
                B.j jVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1342e = jVar22;
                this.f1341d = true;
                return jVar22;
            }
            if (c0059p != null) {
                i = c0059p.f1370c;
                abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0060q.f1381D;
                B.j jVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1342e = jVar222;
                this.f1341d = true;
                return jVar222;
            }
            i = 0;
            abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0060q.f1381D;
            B.j jVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1342e = jVar2222;
            this.f1341d = true;
            return jVar2222;
        }
        if (!z2) {
            if (c0059p != null) {
                i = c0059p.f1372e;
                abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0060q.f1381D;
                B.j jVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f1342e = jVar22222;
                this.f1341d = true;
                return jVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0060q.f1381D;
            B.j jVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f1342e = jVar222222;
            this.f1341d = true;
            return jVar222222;
        }
        if (c0059p != null) {
            i = c0059p.f1371d;
            abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0060q.f1381D;
            B.j jVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0060q.f1381D.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? q1.d.Z(context, android.R.attr.activityOpenEnterAnimation) : q1.d.Z(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? q1.d.Z(context, android.R.attr.activityCloseEnterAnimation) : q1.d.Z(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
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
                                jVar = new B.j(loadAnimation);
                                jVar2222222 = jVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            jVar = new B.j(loadAnimator);
                            jVar2222222 = jVar;
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            jVar2222222 = new B.j(loadAnimation2);
                        }
                    }
                }
            }
            this.f1342e = jVar2222222;
            this.f1341d = true;
            return jVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0060q.A(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0060q.f1381D;
        B.j jVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0060q.f1381D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0060q.f1381D;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? q1.d.Z(context, android.R.attr.activityOpenEnterAnimation) : q1.d.Z(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? q1.d.Z(context, android.R.attr.activityCloseEnterAnimation) : q1.d.Z(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f1342e = jVar22222222;
        this.f1341d = true;
        return jVar22222222;
    }
}
