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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ep extends uy {
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
    public final or m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public k0 x;
    public dp y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public nz c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final z6 s = new z6(7, this);
    public View w = null;
    public final ap z = new ap(this);

    public ep(or orVar) {
        this.m = orVar;
    }

    public static boolean m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.uy
    public final void d(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // defpackage.uy
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
        nz nzVar = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bp bpVar = (bp) arrayList.get(i);
            nz nzVar2 = bpVar.e;
            float f3 = bpVar.a;
            float f4 = bpVar.c;
            if (f3 == f4) {
                bpVar.i = nzVar2.a.getTranslationX();
            } else {
                bpVar.i = ((f4 - f3) * bpVar.m) + f3;
            }
            float f5 = bpVar.b;
            float f6 = bpVar.d;
            if (f5 == f6) {
                bpVar.j = nzVar2.a.getTranslationY();
            } else {
                bpVar.j = ((f6 - f5) * bpVar.m) + f5;
            }
            int save = canvas.save();
            or.j(recyclerView, bpVar.e, bpVar.i, bpVar.j, false);
            canvas.restoreToCount(save);
        }
        if (nzVar != null) {
            int save2 = canvas.save();
            or.j(recyclerView, nzVar, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.uy
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        nz nzVar = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bp bpVar = (bp) arrayList.get(i);
            int save = canvas.save();
            View view = bpVar.e.a;
            canvas.restoreToCount(save);
        }
        if (nzVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            bp bpVar2 = (bp) arrayList.get(i2);
            boolean z2 = bpVar2.l;
            if (z2 && !bpVar2.h) {
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
        or orVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            orVar.getClass();
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
        orVar.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void h(int i, int i2, MotionEvent motionEvent) {
        View k;
        if (this.c == null && i == 2 && this.n != 2) {
            or orVar = this.m;
            orVar.getClass();
            if (this.r.getScrollState() == 1) {
                return;
            }
            xy layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            nz nzVar = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.d;
                float y = motionEvent.getY(findPointerIndex) - this.e;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.q;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k = k(motionEvent)) != null))) {
                    nzVar = this.r.I(k);
                }
            }
            if (nzVar == null) {
                return;
            }
            RecyclerView recyclerView = this.r;
            int g = orVar.g(recyclerView, nzVar);
            WeakHashMap weakHashMap = x80.a;
            int c = (or.c(g, recyclerView.getLayoutDirection()) & 65280) >> 8;
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
                o(nzVar, 1);
            }
        }
    }

    public final int i(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        or orVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            orVar.getClass();
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
        orVar.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void j(nz nzVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bp bpVar = (bp) arrayList.get(size);
            if (bpVar.e == nzVar) {
                bpVar.k |= z;
                if (!bpVar.l) {
                    bpVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        nz nzVar = this.c;
        if (nzVar != null) {
            View view = nzVar.a;
            if (m(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bp bpVar = (bp) arrayList.get(size);
            View view2 = bpVar.e.a;
            if (m(view2, x, y, bpVar.i, bpVar.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int i = recyclerView.j.i() - 1; i >= 0; i--) {
            View h = recyclerView.j.h(i);
            float translationX = h.getTranslationX();
            float translationY = h.getTranslationY();
            if (x >= h.getLeft() + translationX && x <= h.getRight() + translationX && y >= h.getTop() + translationY && y <= h.getBottom() + translationY) {
                return h;
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

    public final void n(nz nzVar) {
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
        View view = nzVar.a;
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
            xy layoutManager = this.r.getLayoutManager();
            int v = layoutManager.v();
            int i7 = 0;
            while (i7 < v) {
                char c2 = c;
                View u = layoutManager.u(i7);
                if (u != view && u.getBottom() >= round2 && u.getTop() <= height && u.getRight() >= round && u.getLeft() <= width) {
                    nz I = this.r.I(u);
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
            nz nzVar2 = null;
            int i14 = -1;
            for (int i15 = 0; i15 < size2; i15++) {
                nz nzVar3 = (nz) arrayList2.get(i15);
                if (left2 > 0 && (right = nzVar3.a.getRight() - width2) < 0 && nzVar3.a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i14) {
                    nzVar2 = nzVar3;
                    i14 = abs4;
                }
                if (left2 < 0 && (left = nzVar3.a.getLeft() - i12) > 0 && nzVar3.a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i14) {
                    nzVar2 = nzVar3;
                    i14 = abs3;
                }
                if (top2 < 0 && (top = nzVar3.a.getTop() - i13) > 0 && nzVar3.a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i14) {
                    nzVar2 = nzVar3;
                    i14 = abs2;
                }
                if (top2 > 0 && (bottom = nzVar3.a.getBottom() - height2) < 0 && nzVar3.a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i14) {
                    nzVar2 = nzVar3;
                    i14 = abs;
                }
            }
            if (nzVar2 == null) {
                this.u.clear();
                this.v.clear();
            } else {
                nzVar2.b();
                nzVar.b();
                this.r.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0090, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(nz nzVar, int i) {
        or orVar;
        boolean z;
        boolean z2;
        or orVar2;
        nz nzVar2;
        boolean z3;
        int i2;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        ?? r4;
        if (nzVar == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i3 = this.n;
        j(nzVar, true);
        this.n = i;
        if (i == 2) {
            if (nzVar == null) {
                t8.k("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = nzVar.a;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        nz nzVar3 = this.c;
        or orVar3 = this.m;
        if (nzVar3 != null) {
            View view = nzVar3.a;
            if (view.getParent() != null) {
                if (i3 != 2 && this.n != 2) {
                    int g = orVar3.g(this.r, nzVar3);
                    RecyclerView recyclerView = this.r;
                    WeakHashMap weakHashMap = x80.a;
                    int c = (or.c(g, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (c != 0) {
                        int i5 = (g & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            i2 = g(c);
                            if (i2 <= 0) {
                                i2 = i(c);
                            } else if ((i5 & i2) == 0) {
                                i2 = or.d(i2, this.r.getLayoutDirection());
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
                                signum = Math.signum(this.i) * this.r.getHeight();
                                r4 = null;
                            } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                                r16 = 0;
                                r4 = null;
                                signum = 0.0f;
                                f = Math.signum(this.h) * this.r.getWidth();
                            } else {
                                r4 = null;
                                r16 = 0;
                                signum = 0.0f;
                            }
                            if (i3 == 2) {
                                c2 = '\b';
                            } else if (i2 > 0) {
                                c2 = 2;
                            }
                            float[] fArr = this.b;
                            l(fArr);
                            orVar = orVar3;
                            char c3 = c2;
                            z = r16;
                            bp bpVar = new bp(this, nzVar3, i3, fArr[r16], fArr[1], f, signum, i2, nzVar3);
                            RecyclerView recyclerView2 = this.r;
                            orVar.getClass();
                            ty itemAnimator = recyclerView2.getItemAnimator();
                            long j = itemAnimator == null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.e : itemAnimator.d;
                            ValueAnimator valueAnimator = bpVar.g;
                            valueAnimator.setDuration(j);
                            this.p.add(bpVar);
                            nzVar3.o(z);
                            valueAnimator.start();
                            z3 = true;
                            nzVar2 = null;
                        } else {
                            i2 = i(c);
                            if (i2 <= 0) {
                                i2 = g(c);
                                if (i2 > 0) {
                                    if ((i5 & i2) == 0) {
                                        i2 = or.d(i2, this.r.getLayoutDirection());
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
                            signum = Math.signum(this.i) * this.r.getHeight();
                            r4 = null;
                            if (i3 == 2) {
                            }
                            float[] fArr2 = this.b;
                            l(fArr2);
                            orVar = orVar3;
                            char c32 = c22;
                            z = r16;
                            bp bpVar2 = new bp(this, nzVar3, i3, fArr2[r16], fArr2[1], f2, signum, i2, nzVar3);
                            RecyclerView recyclerView22 = this.r;
                            orVar.getClass();
                            ty itemAnimator2 = recyclerView22.getItemAnimator();
                            if (itemAnimator2 == null) {
                            }
                            ValueAnimator valueAnimator2 = bpVar2.g;
                            valueAnimator2.setDuration(j);
                            this.p.add(bpVar2);
                            nzVar3.o(z);
                            valueAnimator2.start();
                            z3 = true;
                            nzVar2 = null;
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
                signum = Math.signum(this.i) * this.r.getHeight();
                r4 = null;
                if (i3 == 2) {
                }
                float[] fArr22 = this.b;
                l(fArr22);
                orVar = orVar3;
                char c322 = c222;
                z = r16;
                bp bpVar22 = new bp(this, nzVar3, i3, fArr22[r16], fArr22[1], f22, signum, i2, nzVar3);
                RecyclerView recyclerView222 = this.r;
                orVar.getClass();
                ty itemAnimator22 = recyclerView222.getItemAnimator();
                if (itemAnimator22 == null) {
                }
                ValueAnimator valueAnimator22 = bpVar22.g;
                valueAnimator22.setDuration(j);
                this.p.add(bpVar22);
                nzVar3.o(z);
                valueAnimator22.start();
                z3 = true;
                nzVar2 = null;
            } else {
                orVar = orVar3;
                z = false;
                if (view == this.w) {
                    nzVar2 = null;
                    this.w = null;
                } else {
                    nzVar2 = null;
                }
                orVar.getClass();
                or.b(nzVar3);
                z3 = false;
            }
            this.c = nzVar2;
            z2 = z3;
        } else {
            orVar = orVar3;
            z = false;
            z2 = false;
        }
        if (nzVar != null) {
            View view2 = nzVar.a;
            RecyclerView recyclerView3 = this.r;
            orVar2 = orVar;
            int g2 = orVar2.g(recyclerView3, nzVar);
            WeakHashMap weakHashMap2 = x80.a;
            this.o = (or.c(g2, recyclerView3.getLayoutDirection()) & i4) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = nzVar;
            if (i == 2) {
                view2.performHapticFeedback(z ? 1 : 0);
            }
        } else {
            orVar2 = orVar;
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
        orVar2.getClass();
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
