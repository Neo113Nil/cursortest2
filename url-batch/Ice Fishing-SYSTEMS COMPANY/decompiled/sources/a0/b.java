package a0;

import O.C0336b;
import O.X;
import P.k;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;
import g1.C4524d;
import java.util.WeakHashMap;
import t0.C5033Q;

/* loaded from: classes.dex */
public final class b extends C0336b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4280d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4281e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4282f;

    public b(C5033Q c5033q) {
        this.f4280d = 1;
        this.f4282f = new WeakHashMap();
        this.f4281e = c5033q;
    }

    @Override // O.C0336b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        Object obj = this.f4282f;
        switch (this.f4280d) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) obj;
                    View g9 = drawerLayout.g();
                    if (g9 != null) {
                        int j9 = drawerLayout.j(g9);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = X.f2240a;
                        Gravity.getAbsoluteGravity(j9, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
            default:
                C0336b c0336b = (C0336b) ((WeakHashMap) obj).get(view);
                if (c0336b == null) {
                    break;
                } else {
                    break;
                }
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // O.C0336b
    public C4524d b(View view) {
        switch (this.f4280d) {
            case 1:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                if (c0336b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // O.C0336b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4280d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                if (c0336b == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    c0336b.c(view, accessibilityEvent);
                    break;
                }
        }
    }

    @Override // O.C0336b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        Object obj = this.f4281e;
        switch (this.f4280d) {
            case 0:
                boolean z8 = DrawerLayout.f4844o0;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
                if (z8) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                    kVar.f2676b = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = X.f2240a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj;
                    obtain.getBoundsInScreen(rect);
                    accessibilityNodeInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                    kVar.i(obtain.getClassName());
                    accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                    accessibilityNodeInfo.setFocused(obtain.isFocused());
                    accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                    accessibilityNodeInfo.setSelected(obtain.isSelected());
                    kVar.a(obtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (DrawerLayout.l(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                kVar.i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2660e.f2669a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2661f.f2669a);
                break;
            default:
                C5033Q c5033q = (C5033Q) obj;
                boolean K8 = c5033q.f40632d.K();
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2675a;
                if (!K8) {
                    RecyclerView recyclerView = c5033q.f40632d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().U(view, kVar);
                        C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                        if (c0336b != null) {
                            c0336b.d(view, kVar);
                            break;
                        } else {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                            break;
                        }
                    }
                }
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                break;
        }
    }

    @Override // O.C0336b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4280d) {
            case 1:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                if (c0336b == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    c0336b.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0336b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4280d) {
            case 0:
                if (DrawerLayout.f4844o0 || DrawerLayout.l(view)) {
                    break;
                }
                break;
            default:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(viewGroup);
                if (c0336b == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f2248a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // O.C0336b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f4280d) {
            case 1:
                C5033Q c5033q = (C5033Q) this.f4281e;
                if (!c5033q.f40632d.K()) {
                    RecyclerView recyclerView = c5033q.f40632d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                        if (c0336b == null ? !super.g(view, i, bundle) : !c0336b.g(view, i, bundle)) {
                            BP bp = recyclerView.getLayoutManager().f40563b.f5376u;
                            break;
                        }
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // O.C0336b
    public void h(View view, int i) {
        switch (this.f4280d) {
            case 1:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                if (c0336b == null) {
                    super.h(view, i);
                    break;
                } else {
                    c0336b.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // O.C0336b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4280d) {
            case 1:
                C0336b c0336b = (C0336b) ((WeakHashMap) this.f4282f).get(view);
                if (c0336b == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    c0336b.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public b(DrawerLayout drawerLayout) {
        this.f4280d = 0;
        this.f4282f = drawerLayout;
        this.f4281e = new Rect();
    }
}
