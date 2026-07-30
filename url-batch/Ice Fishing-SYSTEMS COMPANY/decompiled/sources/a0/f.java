package a0;

import F3.C;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import h.C4545d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends W.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4292a;

    /* renamed from: b, reason: collision with root package name */
    public W.e f4293b;

    /* renamed from: c, reason: collision with root package name */
    public final C f4294c = new C(12, this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f4295d;

    public f(DrawerLayout drawerLayout, int i) {
        this.f4295d = drawerLayout;
        this.f4292a = i;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        DrawerLayout drawerLayout = this.f4295d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i4) {
        return view.getTop();
    }

    @Override // W.d
    public final int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.o(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // W.d
    public final void onEdgeDragStarted(int i, int i4) {
        int i9 = i & 1;
        DrawerLayout drawerLayout = this.f4295d;
        View e6 = i9 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
        if (e6 == null || drawerLayout.i(e6) != 0) {
            return;
        }
        this.f4293b.b(i4, e6);
    }

    @Override // W.d
    public final boolean onEdgeLock(int i) {
        return false;
    }

    @Override // W.d
    public final void onEdgeTouched(int i, int i4) {
        this.f4295d.postDelayed(this.f4294c, 160L);
    }

    @Override // W.d
    public final void onViewCaptured(View view, int i) {
        ((d) view.getLayoutParams()).f4285c = false;
        int i4 = this.f4292a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f4295d;
        View e6 = drawerLayout.e(i4);
        if (e6 != null) {
            drawerLayout.b(e6);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        int i4;
        View rootView;
        View view = this.f4293b.f3409t;
        DrawerLayout drawerLayout = this.f4295d;
        int i9 = drawerLayout.f4874z.f3391a;
        int i10 = drawerLayout.f4847A.f3391a;
        if (i9 == 1 || i10 == 1) {
            i4 = 1;
        } else {
            i4 = 2;
            if (i9 != 2 && i10 != 2) {
                i4 = 0;
            }
        }
        if (view != null && i == 0) {
            float f6 = ((d) view.getLayoutParams()).f4284b;
            if (f6 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f4286d & 1) == 1) {
                    dVar.f4286d = 0;
                    ArrayList arrayList = drawerLayout.f4858M;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C4545d c4545d = (C4545d) ((c) drawerLayout.f4858M.get(size));
                            c4545d.a(0.0f);
                            c4545d.f38078a.v(c4545d.f38081d);
                        }
                    }
                    drawerLayout.v(view, false);
                    drawerLayout.u(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f6 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f4286d & 1) == 0) {
                    dVar2.f4286d = 1;
                    ArrayList arrayList2 = drawerLayout.f4858M;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C4545d c4545d2 = (C4545d) ((c) drawerLayout.f4858M.get(size2));
                            c4545d2.a(1.0f);
                            c4545d2.f38078a.v(c4545d2.f38082e);
                        }
                    }
                    drawerLayout.v(view, true);
                    drawerLayout.u(view);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != drawerLayout.f4850D) {
            drawerLayout.f4850D = i4;
            ArrayList arrayList3 = drawerLayout.f4858M;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) drawerLayout.f4858M.get(size3)).getClass();
                }
            }
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i9, int i10) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f4295d;
        float width2 = (drawerLayout.a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.t(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final void onViewReleased(View view, float f6, float f9) {
        int i;
        DrawerLayout drawerLayout = this.f4295d;
        int[] iArr = DrawerLayout.f4842W;
        float f10 = ((d) view.getLayoutParams()).f4284b;
        int width = view.getWidth();
        if (drawerLayout.a(3, view)) {
            i = (f6 > 0.0f || (f6 == 0.0f && f10 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f6 < 0.0f || (f6 == 0.0f && f10 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f4293b.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        DrawerLayout drawerLayout = this.f4295d;
        return DrawerLayout.o(view) && drawerLayout.a(this.f4292a, view) && drawerLayout.i(view) == 0;
    }
}
