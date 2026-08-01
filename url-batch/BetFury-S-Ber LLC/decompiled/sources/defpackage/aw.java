package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class aw extends e80 {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final nz m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public o0 x;
    public zv y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public x80 c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final v7 s = new v7(7, this);
    public View w = null;
    public final wv z = new wv(this);

    public aw(nz nzVar) {
        this.m = nzVar;
    }

    public static boolean m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.e80
    public final void d(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // defpackage.e80
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        x80 x80Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xv xvVar = (xv) arrayList.get(i);
            x80 x80Var2 = xvVar.e;
            float f3 = xvVar.a;
            float f4 = xvVar.c;
            if (f3 == f4) {
                xvVar.i = x80Var2.a.getTranslationX();
            } else {
                xvVar.i = ((f4 - f3) * xvVar.m) + f3;
            }
            float f5 = xvVar.b;
            float f6 = xvVar.d;
            if (f5 == f6) {
                xvVar.j = x80Var2.a.getTranslationY();
            } else {
                xvVar.j = ((f6 - f5) * xvVar.m) + f5;
            }
            int save = canvas.save();
            nz.i(recyclerView, xvVar.e, xvVar.i, xvVar.j, false);
            canvas.restoreToCount(save);
        }
        if (x80Var != null) {
            int save2 = canvas.save();
            nz.i(recyclerView, x80Var, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.e80
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        x80 x80Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xv xvVar = (xv) arrayList.get(i);
            int save = canvas.save();
            View view = xvVar.e.a;
            canvas.restoreToCount(save);
        }
        if (x80Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            xv xvVar2 = (xv) arrayList.get(i2);
            boolean z2 = xvVar2.l;
            if (z2 && !xvVar2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int g(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        nz nzVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            nzVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth();
        nzVar.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void h(int i, int i2, MotionEvent motionEvent) {
        View k;
        if (this.c == null && i == 2 && this.n != 2) {
            this.m.getClass();
            if (this.r.getScrollState() == 1) {
                return;
            }
            h80 layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            x80 x80Var = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.d;
                float y = motionEvent.getY(findPointerIndex) - this.e;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.q;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k = k(motionEvent)) != null))) {
                    x80Var = this.r.I(k);
                }
            }
            if (x80Var == null) {
                return;
            }
            RecyclerView recyclerView = this.r;
            WeakHashMap weakHashMap = hm0.a;
            int c = (nz.c(3084, recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (c == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.d;
            float f3 = y2 - this.e;
            float abs3 = Math.abs(f2);
            float abs4 = Math.abs(f3);
            float f4 = this.q;
            if (abs3 >= f4 || abs4 >= f4) {
                if (abs3 > abs4) {
                    if (f2 < 0.0f && (c & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (c & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (c & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (c & 2) == 0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                o(x80Var, 1);
            }
        }
    }

    public final int i(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        nz nzVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            nzVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight();
        nzVar.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void j(x80 x80Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xv xvVar = (xv) arrayList.get(size);
            if (xvVar.e == x80Var) {
                xvVar.k |= z;
                if (!xvVar.l) {
                    xvVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        x80 x80Var = this.c;
        if (x80Var != null) {
            View view = x80Var.a;
            if (m(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xv xvVar = (xv) arrayList.get(size);
            View view2 = xvVar.e.a;
            if (m(view2, x, y, xvVar.i, xvVar.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int h = recyclerView.j.h() - 1; h >= 0; h--) {
            View g = recyclerView.j.g(h);
            float translationX = g.getTranslationX();
            float translationY = g.getTranslationY();
            if (x >= g.getLeft() + translationX && x <= g.getRight() + translationX && y >= g.getTop() + translationY && y <= g.getBottom() + translationY) {
                return g;
            }
        }
        return null;
    }

    public final void l(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void n(x80 x80Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.n != 2) {
            return;
        }
        this.m.getClass();
        int i3 = (int) (this.j + this.h);
        int i4 = (int) (this.k + this.i);
        View view = x80Var.a;
        if (Math.abs(i4 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i3 - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int round = Math.round(this.j + this.h);
            int round2 = Math.round(this.k + this.i);
            int width = view.getWidth() + round;
            int height = view.getHeight() + round2;
            int i5 = (round + width) / 2;
            int i6 = (round2 + height) / 2;
            h80 layoutManager = this.r.getLayoutManager();
            int v = layoutManager.v();
            int i7 = 0;
            while (i7 < v) {
                char c2 = c;
                View u = layoutManager.u(i7);
                if (u != view && u.getBottom() >= round2 && u.getTop() <= height && u.getRight() >= round && u.getLeft() <= width) {
                    x80 I = this.r.I(u);
                    int abs5 = Math.abs(i5 - ((u.getRight() + u.getLeft()) / 2));
                    int abs6 = Math.abs(i6 - ((u.getBottom() + u.getTop()) / 2));
                    int i8 = (abs6 * abs6) + (abs5 * abs5);
                    i = i3;
                    int size = this.u.size();
                    i2 = i4;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        int i11 = size;
                        if (i8 <= ((Integer) this.v.get(i9)).intValue()) {
                            break;
                        }
                        i10++;
                        i9++;
                        size = i11;
                    }
                    this.u.add(i10, I);
                    this.v.add(i10, Integer.valueOf(i8));
                } else {
                    i = i3;
                    i2 = i4;
                }
                i7++;
                c = c2;
                i3 = i;
                i4 = i2;
            }
            int i12 = i3;
            int i13 = i4;
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i12;
            int height2 = view.getHeight() + i13;
            int left2 = i12 - view.getLeft();
            int top2 = i13 - view.getTop();
            int size2 = arrayList2.size();
            x80 x80Var2 = null;
            int i14 = -1;
            for (int i15 = 0; i15 < size2; i15++) {
                x80 x80Var3 = (x80) arrayList2.get(i15);
                if (left2 > 0 && (right = x80Var3.a.getRight() - width2) < 0 && x80Var3.a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i14) {
                    x80Var2 = x80Var3;
                    i14 = abs4;
                }
                if (left2 < 0 && (left = x80Var3.a.getLeft() - i12) > 0 && x80Var3.a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i14) {
                    x80Var2 = x80Var3;
                    i14 = abs3;
                }
                if (top2 < 0 && (top = x80Var3.a.getTop() - i13) > 0 && x80Var3.a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i14) {
                    x80Var2 = x80Var3;
                    i14 = abs2;
                }
                if (top2 > 0 && (bottom = x80Var3.a.getBottom() - height2) < 0 && x80Var3.a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i14) {
                    x80Var2 = x80Var3;
                    i14 = abs;
                }
            }
            if (x80Var2 == null) {
                this.u.clear();
                this.v.clear();
            } else {
                x80Var2.b();
                x80Var.b();
                this.r.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0090, code lost:
    
        if (r7 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(x80 x80Var, int i) {
        nz nzVar;
        boolean z;
        boolean z2;
        x80 x80Var2;
        int i2;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        ?? r0;
        int i3;
        if (x80Var == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i4 = this.n;
        j(x80Var, true);
        this.n = i;
        if (i == 2) {
            if (x80Var == null) {
                s9.k("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = x80Var.a;
        }
        int i5 = (1 << ((i * 8) + 8)) - 1;
        x80 x80Var3 = this.c;
        nz nzVar2 = this.m;
        if (x80Var3 != null) {
            View view = x80Var3.a;
            if (view.getParent() != null) {
                if (i4 != 2 && this.n != 2) {
                    nzVar2.getClass();
                    RecyclerView recyclerView = this.r;
                    WeakHashMap weakHashMap = hm0.a;
                    int c = (nz.c(3084, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (c != 0) {
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            i2 = g(c);
                            if (i2 <= 0) {
                                i2 = i(c);
                            } else if ((12 & i2) == 0) {
                                i2 = nz.d(i2, this.r.getLayoutDirection());
                            }
                            velocityTracker = this.t;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.t = null;
                            }
                            char c2 = 4;
                            float f = 0.0f;
                            if (i2 != 1 || i2 == 2) {
                                r16 = 0;
                                int i6 = i2;
                                signum = Math.signum(this.i) * this.r.getHeight();
                                r0 = null;
                                i3 = i6;
                            } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                                r16 = 0;
                                f = Math.signum(this.h) * this.r.getWidth();
                                r0 = null;
                                i3 = i2;
                                signum = 0.0f;
                            } else {
                                r0 = null;
                                r16 = 0;
                                i3 = i2;
                                signum = 0.0f;
                            }
                            if (i4 == 2) {
                                c2 = '\b';
                            } else if (i3 > 0) {
                                c2 = 2;
                            }
                            float[] fArr = this.b;
                            l(fArr);
                            nzVar = nzVar2;
                            char c3 = c2;
                            z = r16;
                            xv xvVar = new xv(this, x80Var3, i4, fArr[r16], fArr[1], f, signum, i3, x80Var3);
                            RecyclerView recyclerView2 = this.r;
                            nzVar.getClass();
                            d80 itemAnimator = recyclerView2.getItemAnimator();
                            long j = itemAnimator == null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.e : itemAnimator.d;
                            ValueAnimator valueAnimator = xvVar.g;
                            valueAnimator.setDuration(j);
                            this.p.add(xvVar);
                            x80Var3.o(z);
                            valueAnimator.start();
                            x80Var2 = null;
                            z2 = true;
                        } else {
                            i2 = i(c);
                            if (i2 <= 0) {
                                i2 = g(c);
                                if (i2 > 0) {
                                    if ((12 & i2) == 0) {
                                        i2 = nz.d(i2, this.r.getLayoutDirection());
                                    }
                                }
                            }
                            velocityTracker = this.t;
                            if (velocityTracker != null) {
                            }
                            char c22 = 4;
                            float f2 = 0.0f;
                            if (i2 != 1) {
                            }
                            r16 = 0;
                            int i62 = i2;
                            signum = Math.signum(this.i) * this.r.getHeight();
                            r0 = null;
                            i3 = i62;
                            if (i4 == 2) {
                            }
                            float[] fArr2 = this.b;
                            l(fArr2);
                            nzVar = nzVar2;
                            char c32 = c22;
                            z = r16;
                            xv xvVar2 = new xv(this, x80Var3, i4, fArr2[r16], fArr2[1], f2, signum, i3, x80Var3);
                            RecyclerView recyclerView22 = this.r;
                            nzVar.getClass();
                            d80 itemAnimator2 = recyclerView22.getItemAnimator();
                            if (itemAnimator2 == null) {
                            }
                            ValueAnimator valueAnimator2 = xvVar2.g;
                            valueAnimator2.setDuration(j);
                            this.p.add(xvVar2);
                            x80Var3.o(z);
                            valueAnimator2.start();
                            x80Var2 = null;
                            z2 = true;
                        }
                    }
                }
                i2 = 0;
                velocityTracker = this.t;
                if (velocityTracker != null) {
                }
                char c222 = 4;
                float f22 = 0.0f;
                if (i2 != 1) {
                }
                r16 = 0;
                int i622 = i2;
                signum = Math.signum(this.i) * this.r.getHeight();
                r0 = null;
                i3 = i622;
                if (i4 == 2) {
                }
                float[] fArr22 = this.b;
                l(fArr22);
                nzVar = nzVar2;
                char c322 = c222;
                z = r16;
                xv xvVar22 = new xv(this, x80Var3, i4, fArr22[r16], fArr22[1], f22, signum, i3, x80Var3);
                RecyclerView recyclerView222 = this.r;
                nzVar.getClass();
                d80 itemAnimator22 = recyclerView222.getItemAnimator();
                if (itemAnimator22 == null) {
                }
                ValueAnimator valueAnimator22 = xvVar22.g;
                valueAnimator22.setDuration(j);
                this.p.add(xvVar22);
                x80Var3.o(z);
                valueAnimator22.start();
                x80Var2 = null;
                z2 = true;
            } else {
                nzVar = nzVar2;
                z = false;
                if (view == this.w) {
                    x80Var2 = null;
                    this.w = null;
                } else {
                    x80Var2 = null;
                }
                nzVar.getClass();
                nz.b(x80Var3);
                z2 = false;
            }
            this.c = x80Var2;
        } else {
            nzVar = nzVar2;
            z = false;
            z2 = false;
        }
        if (x80Var != null) {
            View view2 = x80Var.a;
            RecyclerView recyclerView3 = this.r;
            nzVar.getClass();
            WeakHashMap weakHashMap2 = hm0.a;
            this.o = (nz.c(3084, recyclerView3.getLayoutDirection()) & i5) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = x80Var;
            if (i == 2) {
                view2.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().f = true;
        }
        nzVar.getClass();
        this.r.invalidate();
    }

    public final void p(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
