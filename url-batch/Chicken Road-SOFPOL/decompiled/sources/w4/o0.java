package w4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f7994d;

    /* renamed from: e, reason: collision with root package name */
    public int f7995e;

    /* renamed from: f, reason: collision with root package name */
    public OverScroller f7996f;

    /* renamed from: g, reason: collision with root package name */
    public Interpolator f7997g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7998h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7999j;

    public o0(RecyclerView recyclerView) {
        this.f7999j = recyclerView;
        v vVar = RecyclerView.f907p0;
        this.f7997g = vVar;
        this.f7998h = false;
        this.i = false;
        this.f7996f = new OverScroller(recyclerView.getContext(), vVar);
    }

    public final void a() {
        if (this.f7998h) {
            this.i = true;
            return;
        }
        RecyclerView recyclerView = this.f7999j;
        recyclerView.removeCallbacks(this);
        Field field = q3.k0.f6120a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i8;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f7999j;
        int[] iArr = recyclerView.f925k0;
        if (recyclerView.f928m == null) {
            recyclerView.removeCallbacks(this);
            this.f7996f.abortAnimation();
            return;
        }
        this.i = false;
        this.f7998h = true;
        recyclerView.g();
        OverScroller overScroller = this.f7996f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.f7994d;
            int i10 = currY - this.f7995e;
            this.f7994d = currX;
            this.f7995e = currY;
            int[] iArr2 = recyclerView.f925k0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.j(i9, i10, 1, iArr2, null)) {
                i = i9 - iArr[0];
                i8 = i10 - iArr[1];
            } else {
                i = i9;
                i8 = i10;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.f(i, i8);
            }
            if (!recyclerView.f931o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f925k0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.k(0, 0, i, i8, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i8 - iArr[1];
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            recyclerView.f928m.getClass();
            if (z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.m();
                        if (recyclerView.E.isFinished()) {
                            recyclerView.E.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.n();
                        if (recyclerView.G.isFinished()) {
                            recyclerView.G.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.o();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.l();
                        if (recyclerView.H.isFinished()) {
                            recyclerView.H.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        Field field = q3.k0.f6120a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                r5.m mVar = recyclerView.f909b0;
                mVar.getClass();
                mVar.f6682c = 0;
            } else {
                a();
                l lVar = recyclerView.f908a0;
                if (lVar != null) {
                    lVar.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f928m.getClass();
        this.f7998h = false;
        if (!this.i) {
            recyclerView.setScrollState(0);
            recyclerView.H(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = q3.k0.f6120a;
            recyclerView.postOnAnimation(this);
        }
    }
}
