package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;
import com.ironsource.b9;
import java.util.Map;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3195c extends AbstractC3204l {
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> TOP_LEFT_PROPERTY = new C0222c(PointF.class, "topLeft");
    private static final Property<k, PointF> BOTTOM_RIGHT_PROPERTY = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> POSITION_PROPERTY = new g(PointF.class, b9.h.f15451L);
    private static C3202j sRectEvaluator = new C3202j();
    private int[] mTempLocation = new int[2];
    private boolean mResizeClip = false;
    private boolean mReparent = false;

    /* renamed from: k0.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f40896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f40897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f40898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f40899d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f40896a = viewGroup;
            this.f40897b = bitmapDrawable;
            this.f40898c = view;
            this.f40899d = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3188A.b(this.f40896a).b(this.f40897b);
            AbstractC3188A.g(this.f40898c, this.f40899d);
        }
    }

    /* renamed from: k0.c$b */
    class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        private Rect f40901a;

        b(Class cls, String str) {
            super(cls, str);
            this.f40901a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f40901a);
            Rect rect = this.f40901a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f40901a);
            this.f40901a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f40901a);
        }
    }

    /* renamed from: k0.c$c, reason: collision with other inner class name */
    class C0222c extends Property {
        C0222c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: k0.c$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: k0.c$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC3188A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: k0.c$f */
    class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC3188A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: k0.c$g */
    class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC3188A.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: k0.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f40902a;
        private k mViewBounds;

        h(k kVar) {
            this.f40902a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: k0.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f40904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f40905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f40906c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40907d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40908e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f40909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f40910g;

        i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f40905b = view;
            this.f40906c = rect;
            this.f40907d = i4;
            this.f40908e = i5;
            this.f40909f = i6;
            this.f40910g = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f40904a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f40904a) {
                return;
            }
            AbstractC1281a0.v0(this.f40905b, this.f40906c);
            AbstractC3188A.f(this.f40905b, this.f40907d, this.f40908e, this.f40909f, this.f40910g);
        }
    }

    /* renamed from: k0.c$j */
    class j extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        boolean f40912a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f40913b;

        j(ViewGroup viewGroup) {
            this.f40913b = viewGroup;
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionCancel(AbstractC3204l abstractC3204l) {
            x.c(this.f40913b, false);
            this.f40912a = true;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            if (!this.f40912a) {
                x.c(this.f40913b, false);
            }
            abstractC3204l.removeListener(this);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionPause(AbstractC3204l abstractC3204l) {
            x.c(this.f40913b, false);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionResume(AbstractC3204l abstractC3204l) {
            x.c(this.f40913b, true);
        }
    }

    /* renamed from: k0.c$k */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f40915a;

        /* renamed from: b, reason: collision with root package name */
        private int f40916b;

        /* renamed from: c, reason: collision with root package name */
        private int f40917c;

        /* renamed from: d, reason: collision with root package name */
        private int f40918d;

        /* renamed from: e, reason: collision with root package name */
        private View f40919e;

        /* renamed from: f, reason: collision with root package name */
        private int f40920f;

        /* renamed from: g, reason: collision with root package name */
        private int f40921g;

        k(View view) {
            this.f40919e = view;
        }

        private void b() {
            AbstractC3188A.f(this.f40919e, this.f40915a, this.f40916b, this.f40917c, this.f40918d);
            this.f40920f = 0;
            this.f40921g = 0;
        }

        void a(PointF pointF) {
            this.f40917c = Math.round(pointF.x);
            this.f40918d = Math.round(pointF.y);
            int i4 = this.f40921g + 1;
            this.f40921g = i4;
            if (this.f40920f == i4) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f40915a = Math.round(pointF.x);
            this.f40916b = Math.round(pointF.y);
            int i4 = this.f40920f + 1;
            this.f40920f = i4;
            if (i4 == this.f40921g) {
                b();
            }
        }
    }

    private void m(s sVar) {
        View view = sVar.f40980b;
        if (!AbstractC1281a0.T(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f40979a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f40979a.put("android:changeBounds:parent", sVar.f40980b.getParent());
        if (this.mReparent) {
            sVar.f40980b.getLocationInWindow(this.mTempLocation);
            sVar.f40979a.put("android:changeBounds:windowX", Integer.valueOf(this.mTempLocation[0]));
            sVar.f40979a.put("android:changeBounds:windowY", Integer.valueOf(this.mTempLocation[1]));
        }
        if (this.mResizeClip) {
            sVar.f40979a.put("android:changeBounds:clip", AbstractC1281a0.v(view));
        }
    }

    private boolean n(View view, View view2) {
        if (!this.mReparent) {
            return true;
        }
        s matchedTransitionValues = getMatchedTransitionValues(view, true);
        return matchedTransitionValues == null ? view == view2 : view2 == matchedTransitionValues.f40980b;
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
        Animator animator;
        int i4;
        int i5;
        Rect rect;
        View view;
        ObjectAnimator objectAnimator;
        Animator c4;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f40979a;
        Map map2 = sVar2.f40979a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f40980b;
        if (n(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f40979a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f40979a.get("android:changeBounds:bounds");
            int i6 = rect2.left;
            int i7 = rect3.left;
            int i8 = rect2.top;
            int i9 = rect3.top;
            int i10 = rect2.right;
            int i11 = rect3.right;
            int i12 = rect2.bottom;
            int i13 = rect3.bottom;
            animator = null;
            int i14 = i10 - i6;
            int i15 = i12 - i8;
            int i16 = i11 - i7;
            int i17 = i13 - i9;
            Rect rect4 = (Rect) sVar.f40979a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f40979a.get("android:changeBounds:clip");
            if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                i4 = 0;
            } else {
                i4 = (i6 == i7 && i8 == i9) ? 0 : 1;
                if (i10 != i11 || i12 != i13) {
                    i4++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i4++;
            }
            if (i4 > 0) {
                if (this.mResizeClip) {
                    AbstractC3188A.f(view2, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                    ObjectAnimator a4 = (i6 == i7 && i8 == i9) ? null : AbstractC3198f.a(view2, POSITION_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                    if (rect4 == null) {
                        i5 = 0;
                        rect = new Rect(0, 0, i14, i15);
                    } else {
                        i5 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i5, i5, i16, i17) : rect5;
                    if (rect.equals(rect6)) {
                        view = view2;
                        objectAnimator = null;
                    } else {
                        AbstractC1281a0.v0(view2, rect);
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", sRectEvaluator, rect, rect6);
                        view = view2;
                        ofObject.addListener(new i(view2, rect5, i7, i9, i11, i13));
                        objectAnimator = ofObject;
                    }
                    c4 = r.c(a4, objectAnimator);
                } else {
                    AbstractC3188A.f(view2, i6, i8, i10, i12);
                    if (i4 != 2) {
                        c4 = (i6 == i7 && i8 == i9) ? AbstractC3198f.a(view2, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().a(i10, i12, i11, i13)) : AbstractC3198f.a(view2, TOP_LEFT_ONLY_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                    } else if (i14 == i16 && i15 == i17) {
                        c4 = AbstractC3198f.a(view2, POSITION_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                    } else {
                        k kVar = new k(view2);
                        ObjectAnimator a5 = AbstractC3198f.a(kVar, TOP_LEFT_PROPERTY, getPathMotion().a(i6, i8, i7, i9));
                        ObjectAnimator a6 = AbstractC3198f.a(kVar, BOTTOM_RIGHT_PROPERTY, getPathMotion().a(i10, i12, i11, i13));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a5, a6);
                        animatorSet.addListener(new h(kVar));
                        c4 = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    addListener(new j(viewGroup4));
                }
                return c4;
            }
        } else {
            animator = null;
            int intValue = ((Integer) sVar.f40979a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f40979a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f40979a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f40979a.get("android:changeBounds:windowY")).intValue();
            if (intValue != intValue3 || intValue2 != intValue4) {
                viewGroup.getLocationInWindow(this.mTempLocation);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c5 = AbstractC3188A.c(view2);
                AbstractC3188A.g(view2, 0.0f);
                AbstractC3188A.b(viewGroup).a(bitmapDrawable);
                AbstractC3199g pathMotion = getPathMotion();
                int[] iArr = this.mTempLocation;
                int i18 = iArr[0];
                int i19 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC3200h.a(DRAWABLE_ORIGIN_PROPERTY, pathMotion.a(intValue - i18, intValue2 - i19, intValue3 - i18, intValue4 - i19)));
                ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c5));
                return ofPropertyValuesHolder;
            }
        }
        return animator;
    }

    @Override // k0.AbstractC3204l
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }
}
