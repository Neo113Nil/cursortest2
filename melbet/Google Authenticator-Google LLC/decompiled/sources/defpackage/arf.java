package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arf extends kt {
    public int a;
    public int b;
    public final are c;
    public int d;
    public boolean e;
    public yn f;
    private final ViewPager2 g;
    private final RecyclerView h;
    private final LinearLayoutManager i;
    private int j;
    private boolean k;
    private boolean l;

    public arf(ViewPager2 viewPager2) {
        this.g = viewPager2;
        RecyclerView recyclerView = viewPager2.e;
        this.h = recyclerView;
        this.i = (LinearLayoutManager) recyclerView.m;
        this.c = new are();
        i();
    }

    private final void h(int i, float f, int i2) {
        yn ynVar = this.f;
        if (ynVar != null) {
            ynVar.k(i, f, i2);
        }
    }

    private final void i() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.j = -1;
        this.d = -1;
        this.k = false;
        this.l = false;
        this.e = false;
    }

    private final boolean k() {
        return this.a == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r6 < 0) == r4.g.f()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.kt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.l = true;
        f();
        if (this.k) {
            this.k = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = this.c.a;
                this.d = i3;
                if (this.j != i3) {
                    d(i3);
                }
            }
            are areVar = this.c;
            if (areVar.c != 0) {
                i3 = areVar.a + 1;
                this.d = i3;
                if (this.j != i3) {
                }
            }
            i3 = this.c.a;
            this.d = i3;
            if (this.j != i3) {
            }
        } else if (this.a == 0) {
            int i4 = this.c.a;
            if (i4 == -1) {
                i4 = 0;
            }
            d(i4);
        }
        are areVar2 = this.c;
        int i5 = areVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        h(i5, areVar2.b, areVar2.c);
        int i6 = areVar2.a;
        int i7 = this.d;
        if ((i6 == i7 || i7 == -1) && areVar2.c == 0 && this.b != 1) {
            e(0);
            i();
        }
    }

    public final void d(int i) {
        yn ynVar = this.f;
        if (ynVar != null) {
            ynVar.l(i);
        }
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        yn ynVar = this.f;
        if (ynVar != null) {
            ynVar.j(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        r13 = r1.at();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        if (r3 >= r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (defpackage.arb.a(r1.aF(r3)) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012d, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(r0.c)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        if (r6[r13 - 1][1] >= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0110, code lost:
    
        if (r1.at() <= 1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        int top;
        int top2;
        int i2;
        int bottom;
        int i3;
        are areVar = this.c;
        LinearLayoutManager linearLayoutManager = this.i;
        int K = linearLayoutManager.K();
        areVar.a = K;
        if (K == -1) {
            areVar.a();
            return;
        }
        View R = linearLayoutManager.R(K);
        if (R == null) {
            areVar.a();
            return;
        }
        int bk = LinearLayoutManager.bk(R);
        int bm = LinearLayoutManager.bm(R);
        int bn = LinearLayoutManager.bn(R);
        int bh = LinearLayoutManager.bh(R);
        ViewGroup.LayoutParams layoutParams = R.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            bk += marginLayoutParams.leftMargin;
            bm += marginLayoutParams.rightMargin;
            bn += marginLayoutParams.topMargin;
            bh += marginLayoutParams.bottomMargin;
        }
        int height = R.getHeight() + bn;
        int width = R.getWidth() + bk;
        if (linearLayoutManager.k == 0) {
            i = width + bm;
            top = (R.getLeft() - bk) - this.h.getPaddingLeft();
            if (this.g.f()) {
                top = -top;
            }
        } else {
            i = height + bh;
            top = (R.getTop() - bn) - this.h.getPaddingTop();
        }
        int i4 = -top;
        areVar.c = i4;
        if (i4 >= 0) {
            areVar.b = i == 0 ? 0.0f : i4 / i;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = arb.a;
        int at = linearLayoutManager.at();
        if (at != 0) {
            int i5 = linearLayoutManager.k ^ 1;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, at, 2);
            for (int i6 = 0; i6 < at; i6++) {
                View aF = linearLayoutManager.aF(i6);
                if (aF == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = aF.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : arb.a;
                int[] iArr2 = iArr[i6];
                if (i5 != 0) {
                    top2 = aF.getLeft();
                    i2 = marginLayoutParams3.leftMargin;
                } else {
                    top2 = aF.getTop();
                    i2 = marginLayoutParams3.topMargin;
                }
                iArr2[0] = top2 - i2;
                int[] iArr3 = iArr[i6];
                if (i5 != 0) {
                    bottom = aF.getRight();
                    i3 = marginLayoutParams3.rightMargin;
                } else {
                    bottom = aF.getBottom();
                    i3 = marginLayoutParams3.bottomMargin;
                }
                iArr3[1] = bottom + i3;
            }
            Arrays.sort(iArr, new ju(4));
            int i7 = 1;
            while (true) {
                if (i7 >= at) {
                    int[] iArr4 = iArr[0];
                    int i8 = iArr4[1];
                    int i9 = iArr4[0];
                    int i10 = i8 - i9;
                    if (i9 <= 0) {
                    }
                } else if (iArr[i7 - 1][1] != iArr[i7][0]) {
                    break;
                } else {
                    i7++;
                }
            }
        }
    }

    public final boolean g() {
        return this.b == 0;
    }

    @Override // defpackage.kt
    public final void z(int i) {
        if (!(this.a == 1 && this.b == 1) && i == 1) {
            this.a = 1;
            int i2 = this.d;
            if (i2 != -1) {
                this.j = i2;
                this.d = -1;
            } else if (this.j == -1) {
                this.j = this.i.K();
            }
            e(1);
            return;
        }
        if (k() && i == 2) {
            if (this.l) {
                e(2);
                this.k = true;
                return;
            }
            return;
        }
        if (k() && i == 0) {
            f();
            boolean z = this.l;
            are areVar = this.c;
            if (!z) {
                int i3 = areVar.a;
                if (i3 != -1) {
                    h(i3, 0.0f, 0);
                }
            } else if (areVar.c == 0) {
                int i4 = this.j;
                int i5 = areVar.a;
                if (i4 != i5) {
                    d(i5);
                }
            }
            e(0);
            i();
        }
        if (this.a == 2 && i == 0 && this.e) {
            f();
            are areVar2 = this.c;
            if (areVar2.c == 0) {
                int i6 = this.d;
                int i7 = areVar2.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    d(i7);
                }
                e(0);
                i();
            }
        }
    }
}
