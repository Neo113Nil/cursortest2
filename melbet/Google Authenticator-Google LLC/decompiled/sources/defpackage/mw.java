package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mw extends kt implements la {
    private List C;
    private List D;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final ms l;
    int m;
    public int o;
    public RecyclerView p;
    VelocityTracker t;
    public GestureDetector v;
    public mt w;
    public Rect y;
    public long z;
    final List a = new ArrayList();
    private final float[] A = new float[2];
    public lp b = null;
    int k = -1;
    private int B = 0;
    public final List n = new ArrayList();
    public final Runnable q = new nc(this, 1, null);
    public View u = null;
    public final lc x = new mp(this);

    public mw(ms msVar) {
        this.l = msVar;
    }

    private final void H(float[] fArr) {
        if ((this.m & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.m & 3) != 0) {
            fArr[1] = (this.j + this.h) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private static boolean I(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int J(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.g > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.t.getXVelocity(this.k);
            float yVelocity = this.t.getYVelocity(this.k);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.e && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.p.getWidth();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.g) > width * 0.5f) {
            return i2;
        }
        return 0;
    }

    private final int K(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.t.getXVelocity(this.k);
            float yVelocity = this.t.getYVelocity(this.k);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.e && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.p.getHeight();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.h) > height * 0.5f) {
            return i2;
        }
        return 0;
    }

    final void G(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.g = f;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.g = f;
        }
        if ((i & 8) == 0) {
            this.g = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
    }

    @Override // defpackage.kt
    public final void b(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // defpackage.kt
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            float[] fArr = this.A;
            H(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        ms msVar = this.l;
        lp lpVar = this.b;
        List list = this.n;
        int i = this.B;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            mv mvVar = (mv) list.get(i2);
            float f4 = mvVar.d;
            float f5 = mvVar.f;
            if (f4 == f5) {
                mvVar.l = mvVar.h.a.getTranslationX();
            } else {
                mvVar.l = f4 + (mvVar.p * (f5 - f4));
            }
            float f6 = mvVar.e;
            float f7 = mvVar.g;
            if (f6 == f7) {
                mvVar.m = mvVar.h.a.getTranslationY();
            } else {
                mvVar.m = f6 + (mvVar.p * (f7 - f6));
            }
            int save = canvas.save();
            lp lpVar2 = mvVar.h;
            float f8 = mvVar.l;
            float f9 = mvVar.m;
            int i3 = mvVar.i;
            ms msVar2 = msVar;
            msVar2.b(canvas, recyclerView, lpVar2, f8, f9, i3, false);
            canvas.restoreToCount(save);
            i2++;
            msVar = msVar2;
        }
        ms msVar3 = msVar;
        if (lpVar != null) {
            int save2 = canvas.save();
            msVar3.b(canvas, recyclerView, lpVar, f2, f, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.la
    public final void d(View view) {
        k(view);
        lp g = this.p.g(view);
        if (g == null) {
            return;
        }
        lp lpVar = this.b;
        if (lpVar != null && g == lpVar) {
            l(null, 0);
            return;
        }
        g(g, false);
        if (this.a.remove(g.a)) {
            ms.d(g);
        }
    }

    final View e(MotionEvent motionEvent) {
        mv mvVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        lp lpVar = this.b;
        if (lpVar != null) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            View view2 = lpVar.a;
            if (I(view2, x, y, f, f2)) {
                return view2;
            }
        }
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                mvVar = (mv) list.get(size);
                view = mvVar.h.a;
            } else {
                RecyclerView recyclerView = this.p;
                int a = recyclerView.h.a();
                while (true) {
                    a--;
                    if (a < 0) {
                        return null;
                    }
                    View e = recyclerView.h.e(a);
                    float translationX = e.getTranslationX();
                    float translationY = e.getTranslationY();
                    if (x >= e.getLeft() + translationX && x <= e.getRight() + translationX && y >= e.getTop() + translationY && y <= e.getBottom() + translationY) {
                        return e;
                    }
                }
            }
        } while (!I(view, x, y, mvVar.l, mvVar.m));
        return view;
    }

    final void f(int i, MotionEvent motionEvent, int i2) {
        View e;
        if (this.b == null && i == 2 && this.B != 2) {
            RecyclerView recyclerView = this.p;
            if (recyclerView.D == 1) {
                return;
            }
            ky kyVar = recyclerView.m;
            int i3 = this.k;
            lp lpVar = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.c;
                float y = motionEvent.getY(findPointerIndex) - this.d;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.o;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !kyVar.ad()) && ((abs2 <= abs || !kyVar.ae()) && (e = e(motionEvent)) != null))) {
                    lpVar = this.p.g(e);
                }
            }
            if (lpVar != null) {
                int h = this.l.h(this.p) >> 8;
                if ((h & 255) != 0) {
                    float x2 = motionEvent.getX(i2);
                    float y2 = motionEvent.getY(i2);
                    float f2 = x2 - this.c;
                    float f3 = y2 - this.d;
                    float abs3 = Math.abs(f2);
                    float abs4 = Math.abs(f3);
                    float f4 = this.o;
                    if (abs3 >= f4 || abs4 >= f4) {
                        if (abs3 > abs4) {
                            if (f2 < 0.0f && (h & 4) == 0) {
                                return;
                            }
                            if (f2 > 0.0f && (h & 8) == 0) {
                                return;
                            }
                        } else {
                            if (f3 < 0.0f && (h & 1) == 0) {
                                return;
                            }
                            if (f3 > 0.0f && (h & 2) == 0) {
                                return;
                            }
                        }
                        this.h = 0.0f;
                        this.g = 0.0f;
                        this.k = motionEvent.getPointerId(0);
                        l(lpVar, 1);
                    }
                }
            }
        }
    }

    final void g(lp lpVar, boolean z) {
        mv mvVar;
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                mvVar = (mv) list.get(size);
            }
        } while (mvVar.h != lpVar);
        mvVar.n |= z;
        if (!mvVar.o) {
            mvVar.a();
        }
        list.remove(size);
    }

    public final void h(lp lpVar) {
        int abs;
        int abs2;
        int abs3;
        int abs4;
        int i;
        int i2;
        int i3;
        View view;
        int i4;
        if (this.p.isLayoutRequested()) {
            return;
        }
        int i5 = 2;
        if (this.B != 2) {
            return;
        }
        float f = this.i + this.g;
        float f2 = this.j + this.h;
        View view2 = lpVar.a;
        int i6 = (int) f2;
        int i7 = (int) f;
        if (Math.abs(i6 - view2.getTop()) < view2.getHeight() * 0.5f && Math.abs(i7 - view2.getLeft()) < view2.getWidth() * 0.5f) {
            return;
        }
        List list = this.C;
        if (list == null) {
            this.C = new ArrayList();
            this.D = new ArrayList();
        } else {
            list.clear();
            this.D.clear();
        }
        int round = Math.round(this.i + this.g);
        int round2 = Math.round(this.j + this.h);
        int width = view2.getWidth() + round;
        int height = view2.getHeight() + round2;
        int i8 = (round + width) / 2;
        int i9 = (round2 + height) / 2;
        ky kyVar = this.p.m;
        int at = kyVar.at();
        int i10 = 0;
        while (i10 < at) {
            View aF = kyVar.aF(i10);
            if (aF == view2) {
                i2 = i7;
                i = i5;
            } else {
                i = i5;
                if (aF.getBottom() < round2 || aF.getTop() > height || aF.getRight() < round || aF.getLeft() > width) {
                    i2 = i7;
                } else {
                    lp g = this.p.g(aF);
                    int abs5 = Math.abs(i8 - ((aF.getLeft() + aF.getRight()) / 2));
                    int i11 = abs5 * abs5;
                    int abs6 = Math.abs(i9 - ((aF.getTop() + aF.getBottom()) / 2));
                    int i12 = abs6 * abs6;
                    i2 = i7;
                    int size = this.C.size();
                    i3 = i6;
                    view = view2;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        i4 = i11 + i12;
                        if (i13 >= size) {
                            break;
                        }
                        int i15 = size;
                        if (i4 <= ((Integer) this.D.get(i13)).intValue()) {
                            break;
                        }
                        i14++;
                        i13++;
                        size = i15;
                    }
                    this.C.add(i14, g);
                    this.D.add(i14, Integer.valueOf(i4));
                    i10++;
                    i5 = i;
                    i7 = i2;
                    i6 = i3;
                    view2 = view;
                }
            }
            i3 = i6;
            view = view2;
            i10++;
            i5 = i;
            i7 = i2;
            i6 = i3;
            view2 = view;
        }
        int i16 = i7;
        int i17 = i5;
        int i18 = i6;
        View view3 = view2;
        List list2 = this.C;
        if (list2.size() == 0) {
            return;
        }
        int width2 = i16 + view3.getWidth();
        int height2 = i18 + view3.getHeight();
        int left = i16 - view3.getLeft();
        int top = i18 - view3.getTop();
        int size2 = list2.size();
        int i19 = -1;
        lp lpVar2 = null;
        for (int i20 = 0; i20 < size2; i20++) {
            lp lpVar3 = (lp) list2.get(i20);
            if (left > 0) {
                View view4 = lpVar3.a;
                int right = view4.getRight() - width2;
                if (right < 0 && view4.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i19) {
                    lpVar2 = lpVar3;
                    i19 = abs4;
                }
            }
            if (left < 0) {
                View view5 = lpVar3.a;
                int left2 = view5.getLeft() - i16;
                if (left2 > 0 && view5.getLeft() < view3.getLeft() && (abs3 = Math.abs(left2)) > i19) {
                    lpVar2 = lpVar3;
                    i19 = abs3;
                }
            }
            if (top < 0) {
                View view6 = lpVar3.a;
                int top2 = view6.getTop() - i18;
                if (top2 > 0 && view6.getTop() < view3.getTop() && (abs2 = Math.abs(top2)) > i19) {
                    lpVar2 = lpVar3;
                    i19 = abs2;
                }
            }
            if (top > 0) {
                View view7 = lpVar3.a;
                int bottom = view7.getBottom() - height2;
                if (bottom < 0 && view7.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i19) {
                    lpVar2 = lpVar3;
                    i19 = abs;
                }
            }
        }
        if (lpVar2 == null) {
            this.C.clear();
            this.D.clear();
            return;
        }
        lpVar2.a();
        lpVar.a();
        ms msVar = this.l;
        int a = lpVar.a();
        int a2 = lpVar2.a();
        bvc bvcVar = (bvc) msVar;
        bvm bvmVar = bvcVar.b;
        String str = ((btw) bvmVar.H.get(a)).d;
        String str2 = ((btw) bvmVar.H.get(a2)).d;
        gtt f3 = bvmVar.k.f("swappingIds", 28);
        try {
            ((bvc) msVar).a = hoq.au(((bvc) msVar).a, new bpp((Object) msVar, (Object) str, (Object) str2, i17), bvmVar.B);
            bvmVar.i.i(cbp.k(((bvc) msVar).a), bvmVar.x);
            f3.close();
            bvm bvmVar2 = bvcVar.b;
            bvmVar2.f.g(a, a2);
            Collections.swap(bvmVar2.H, a, a2);
            Collections.swap(bvmVar2.F, a, a2);
        } finally {
        }
    }

    public final void i() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    @Override // defpackage.kt
    public final void j(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            H(this.A);
        }
        lp lpVar = this.b;
        List list = this.n;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            mv mvVar = (mv) list.get(i);
            int save = canvas.save();
            lp lpVar2 = mvVar.h;
            float f = mvVar.l;
            float f2 = mvVar.m;
            int i2 = mvVar.i;
            canvas.restoreToCount(save);
        }
        if (lpVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mv mvVar2 = (mv) list.get(size);
            if (!mvVar2.o) {
                z = true;
            } else if (!mvVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    final void k(View view) {
        if (view == this.u) {
            this.u = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (r6 <= 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void l(lp lpVar, int i) {
        boolean z;
        int K;
        int i2;
        float signum;
        float f;
        if (lpVar == this.b && i == this.B) {
            return;
        }
        this.z = Long.MIN_VALUE;
        int i3 = this.B;
        g(lpVar, true);
        this.B = i;
        if (i == 2) {
            if (lpVar == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.u = lpVar.a;
        }
        int i4 = 1 << ((i * 8) + 8);
        lp lpVar2 = this.b;
        boolean z2 = false;
        if (lpVar2 != null) {
            View view = lpVar2.a;
            if (view.getParent() != null) {
                if (i3 != 2 && this.B != 2) {
                    int f2 = this.l.f();
                    int i5 = (f2 << 8) | f2 | 3 | 196608;
                    int e = (ms.e(i5, this.p.getLayoutDirection()) >> 8) & 255;
                    if (e != 0) {
                        int i6 = (i5 >> 8) & 255;
                        if (Math.abs(this.g) > Math.abs(this.h)) {
                            K = J(e);
                            if (K <= 0) {
                                K = K(e);
                            } else if ((i6 & K) == 0) {
                                K = ms.a(K, this.p.getLayoutDirection());
                            }
                            i2 = K;
                        } else {
                            K = K(e);
                            if (K <= 0) {
                                K = J(e);
                                if (K > 0) {
                                    if ((i6 & K) == 0) {
                                        K = ms.a(K, this.p.getLayoutDirection());
                                    }
                                }
                            }
                            i2 = K;
                        }
                        i();
                        char c = 4;
                        if (i2 != 1 || i2 == 2) {
                            signum = Math.signum(this.h) * this.p.getHeight();
                            f = 0.0f;
                        } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                            f = Math.signum(this.g) * this.p.getWidth();
                            signum = 0.0f;
                        } else {
                            f = 0.0f;
                            signum = 0.0f;
                        }
                        if (i3 != 2) {
                            c = '\b';
                        } else if (i2 > 0) {
                            c = 2;
                        }
                        float[] fArr = this.A;
                        H(fArr);
                        char c2 = c;
                        z = false;
                        mq mqVar = new mq(this, lpVar2, i3, fArr[0], fArr[1], f, signum, i2, lpVar2);
                        long j = 250;
                        if (this.p.C != null) {
                            if (c2 == '\b') {
                                j = 200;
                            }
                        } else if (c2 != '\b') {
                            j = 120;
                        }
                        ValueAnimator valueAnimator = mqVar.j;
                        valueAnimator.setDuration(j);
                        this.n.add(mqVar);
                        mqVar.h.m(false);
                        valueAnimator.start();
                        z2 = true;
                    }
                }
                i2 = 0;
                i();
                char c3 = 4;
                if (i2 != 1) {
                }
                signum = Math.signum(this.h) * this.p.getHeight();
                f = 0.0f;
                if (i3 != 2) {
                }
                float[] fArr2 = this.A;
                H(fArr2);
                char c22 = c3;
                z = false;
                mq mqVar2 = new mq(this, lpVar2, i3, fArr2[0], fArr2[1], f, signum, i2, lpVar2);
                long j2 = 250;
                if (this.p.C != null) {
                }
                ValueAnimator valueAnimator2 = mqVar2.j;
                valueAnimator2.setDuration(j2);
                this.n.add(mqVar2);
                mqVar2.h.m(false);
                valueAnimator2.start();
                z2 = true;
            } else {
                z = false;
                k(view);
                ms.d(lpVar2);
            }
            this.b = null;
        } else {
            z = false;
        }
        if (lpVar != null) {
            this.m = (this.l.h(this.p) & (i4 - 1)) >> (this.B * 8);
            View view2 = lpVar.a;
            this.i = view2.getLeft();
            this.j = view2.getTop();
            this.b = lpVar;
            if (i == 2) {
                lpVar.a.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.p.getParent();
        if (parent != null) {
            if (this.b != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.p.m.aV();
        }
        this.p.invalidate();
    }

    @Override // defpackage.la
    public final void a(View view) {
    }
}
