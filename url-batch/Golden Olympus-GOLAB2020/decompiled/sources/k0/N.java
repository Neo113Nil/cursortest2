package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import k0.AbstractC3204l;

/* loaded from: classes.dex */
public abstract class N extends AbstractC3204l {
    private static final String[] sTransitionProperties = {"android:visibility:visibility", "android:visibility:parent"};
    private int mMode = 3;

    class a extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f40879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f40880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f40881c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f40879a = viewGroup;
            this.f40880b = view;
            this.f40881c = view2;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            this.f40881c.setTag(AbstractC3201i.f40944a, null);
            x.a(this.f40879a).d(this.f40880b);
            abstractC3204l.removeListener(this);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionPause(AbstractC3204l abstractC3204l) {
            x.a(this.f40879a).d(this.f40880b);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionResume(AbstractC3204l abstractC3204l) {
            if (this.f40880b.getParent() == null) {
                x.a(this.f40879a).c(this.f40880b);
            } else {
                N.this.cancel();
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f40889a;

        /* renamed from: b, reason: collision with root package name */
        boolean f40890b;

        /* renamed from: c, reason: collision with root package name */
        int f40891c;

        /* renamed from: d, reason: collision with root package name */
        int f40892d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f40893e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f40894f;

        c() {
        }
    }

    private void m(s sVar) {
        sVar.f40979a.put("android:visibility:visibility", Integer.valueOf(sVar.f40980b.getVisibility()));
        sVar.f40979a.put("android:visibility:parent", sVar.f40980b.getParent());
        int[] iArr = new int[2];
        sVar.f40980b.getLocationOnScreen(iArr);
        sVar.f40979a.put("android:visibility:screenLocation", iArr);
    }

    private c n(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f40889a = false;
        cVar.f40890b = false;
        if (sVar == null || !sVar.f40979a.containsKey("android:visibility:visibility")) {
            cVar.f40891c = -1;
            cVar.f40893e = null;
        } else {
            cVar.f40891c = ((Integer) sVar.f40979a.get("android:visibility:visibility")).intValue();
            cVar.f40893e = (ViewGroup) sVar.f40979a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f40979a.containsKey("android:visibility:visibility")) {
            cVar.f40892d = -1;
            cVar.f40894f = null;
        } else {
            cVar.f40892d = ((Integer) sVar2.f40979a.get("android:visibility:visibility")).intValue();
            cVar.f40894f = (ViewGroup) sVar2.f40979a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i4 = cVar.f40891c;
            int i5 = cVar.f40892d;
            if (i4 != i5 || cVar.f40893e != cVar.f40894f) {
                if (i4 != i5) {
                    if (i4 == 0) {
                        cVar.f40890b = false;
                        cVar.f40889a = true;
                        return cVar;
                    }
                    if (i5 == 0) {
                        cVar.f40890b = true;
                        cVar.f40889a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f40894f == null) {
                        cVar.f40890b = false;
                        cVar.f40889a = true;
                        return cVar;
                    }
                    if (cVar.f40893e == null) {
                        cVar.f40890b = true;
                        cVar.f40889a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (sVar == null && cVar.f40892d == 0) {
                cVar.f40890b = true;
                cVar.f40889a = true;
                return cVar;
            }
            if (sVar2 == null && cVar.f40891c == 0) {
                cVar.f40890b = false;
                cVar.f40889a = true;
            }
        }
        return cVar;
    }

    @Override // k0.AbstractC3204l
    public void captureEndValues(s sVar) {
        m(sVar);
    }

    @Override // k0.AbstractC3204l
    public void captureStartValues(s sVar) {
        m(sVar);
    }

    @Override // k0.AbstractC3204l
    public Animator createAnimator(ViewGroup viewGroup, s sVar, s sVar2) {
        c n4 = n(sVar, sVar2);
        if (!n4.f40889a) {
            return null;
        }
        if (n4.f40893e == null && n4.f40894f == null) {
            return null;
        }
        return n4.f40890b ? onAppear(viewGroup, sVar, n4.f40891c, sVar2, n4.f40892d) : onDisappear(viewGroup, sVar, n4.f40891c, sVar2, n4.f40892d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // k0.AbstractC3204l
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // k0.AbstractC3204l
    public boolean isTransitionRequired(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f40979a.containsKey("android:visibility:visibility") != sVar.f40979a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c n4 = n(sVar, sVar2);
        return n4.f40889a && (n4.f40891c == 0 || n4.f40892d == 0);
    }

    public abstract Animator onAppear(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator onAppear(ViewGroup viewGroup, s sVar, int i4, s sVar2, int i5) {
        if ((this.mMode & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f40980b.getParent();
            if (n(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f40889a) {
                return null;
            }
        }
        return onAppear(viewGroup, sVar2.f40980b, sVar, sVar2);
    }

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r9.mCanRemoveViews != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(ViewGroup viewGroup, s sVar, int i4, s sVar2, int i5) {
        View view;
        boolean z4;
        View view2;
        boolean z5;
        if ((this.mMode & 2) != 2 || sVar == null) {
            return null;
        }
        View view3 = sVar.f40980b;
        View view4 = sVar2 != null ? sVar2.f40980b : null;
        View view5 = (View) view3.getTag(AbstractC3201i.f40944a);
        if (view5 != null) {
            view2 = null;
            z5 = true;
        } else if (view4 == null || view4.getParent() == null) {
            if (view4 != null) {
                view = null;
                z4 = false;
                if (z4) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view6 = (View) view3.getParent();
                            if (n(getTransitionValues(view6, true), getMatchedTransitionValues(view6, true)).f40889a) {
                                int id = view6.getId();
                                if (view6.getParent() == null) {
                                    if (id != -1) {
                                        if (viewGroup.findViewById(id) != null) {
                                        }
                                    }
                                }
                            } else {
                                view4 = r.a(viewGroup, view3, view6);
                            }
                        }
                    }
                    view2 = view;
                    z5 = false;
                    view5 = view3;
                }
                View view7 = view;
                view5 = view4;
                view2 = view7;
                z5 = false;
            }
            view4 = null;
            view = null;
            z4 = true;
            if (z4) {
            }
            View view72 = view;
            view5 = view4;
            view2 = view72;
            z5 = false;
        } else {
            if (i5 == 4 || view3 == view4) {
                view = view4;
                z4 = false;
                view4 = null;
                if (z4) {
                }
                View view722 = view;
                view5 = view4;
                view2 = view722;
                z5 = false;
            }
            view4 = null;
            view = null;
            z4 = true;
            if (z4) {
            }
            View view7222 = view;
            view5 = view4;
            view2 = view7222;
            z5 = false;
        }
        if (view5 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            AbstractC3188A.h(view2, 0);
            Animator onDisappear = onDisappear(viewGroup, view2, sVar, sVar2);
            if (onDisappear == null) {
                AbstractC3188A.h(view2, visibility);
                return onDisappear;
            }
            b bVar = new b(view2, i5, true);
            onDisappear.addListener(bVar);
            AbstractC3193a.a(onDisappear, bVar);
            addListener(bVar);
            return onDisappear;
        }
        if (!z5) {
            int[] iArr = (int[]) sVar.f40979a.get("android:visibility:screenLocation");
            int i6 = iArr[0];
            int i7 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i6 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i7 - iArr2[1]) - view5.getTop());
            x.a(viewGroup).c(view5);
        }
        Animator onDisappear2 = onDisappear(viewGroup, view5, sVar, sVar2);
        if (!z5) {
            if (onDisappear2 == null) {
                x.a(viewGroup).d(view5);
                return onDisappear2;
            }
            view3.setTag(AbstractC3201i.f40944a, view5);
            addListener(new a(viewGroup, view5, view3));
        }
        return onDisappear2;
    }

    public void setMode(int i4) {
        if ((i4 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i4;
    }

    private static class b extends AnimatorListenerAdapter implements AbstractC3204l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f40883a;

        /* renamed from: b, reason: collision with root package name */
        private final int f40884b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f40885c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f40886d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f40887e;

        /* renamed from: f, reason: collision with root package name */
        boolean f40888f = false;

        b(View view, int i4, boolean z4) {
            this.f40883a = view;
            this.f40884b = i4;
            this.f40885c = (ViewGroup) view.getParent();
            this.f40886d = z4;
            b(true);
        }

        private void a() {
            if (!this.f40888f) {
                AbstractC3188A.h(this.f40883a, this.f40884b);
                ViewGroup viewGroup = this.f40885c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z4) {
            ViewGroup viewGroup;
            if (!this.f40886d || this.f40887e == z4 || (viewGroup = this.f40885c) == null) {
                return;
            }
            this.f40887e = z4;
            x.c(viewGroup, z4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f40888f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f40888f) {
                return;
            }
            AbstractC3188A.h(this.f40883a, this.f40884b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f40888f) {
                return;
            }
            AbstractC3188A.h(this.f40883a, 0);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            a();
            abstractC3204l.removeListener(this);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionPause(AbstractC3204l abstractC3204l) {
            b(false);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionResume(AbstractC3204l abstractC3204l) {
            b(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionCancel(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionStart(AbstractC3204l abstractC3204l) {
        }
    }
}
