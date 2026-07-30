package t0;

import O.C0336b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5033Q extends C0336b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f40632d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.b f40633e;

    public C5033Q(RecyclerView recyclerView) {
        this.f40632d = recyclerView;
        a0.b bVar = this.f40633e;
        if (bVar != null) {
            this.f40633e = bVar;
        } else {
            this.f40633e = new a0.b(this);
        }
    }

    @Override // O.C0336b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f40632d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // O.C0336b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f40632d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC5019C layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f40563b;
        BP bp = recyclerView2.f5376u;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f40563b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f40563b.canScrollVertically(1) || layoutManager.f40563b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C5029M c5029m = recyclerView2.f5339I0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(bp, c5029m), layoutManager.x(bp, c5029m), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // O.C0336b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i, Bundle bundle) {
        int G7;
        int E8;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f40632d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            AbstractC5019C layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f40563b;
            BP bp = recyclerView2.f5376u;
            if (i == 4096) {
                G7 = recyclerView2.canScrollVertically(1) ? (layoutManager.f40575o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f40563b.canScrollHorizontally(1)) {
                    E8 = (layoutManager.f40574n - layoutManager.E()) - layoutManager.F();
                    if (G7 == 0) {
                    }
                    layoutManager.f40563b.Z(E8, G7, true);
                    return true;
                }
                E8 = 0;
                if (G7 == 0) {
                }
                layoutManager.f40563b.Z(E8, G7, true);
                return true;
            }
            if (i != 8192) {
                E8 = 0;
                G7 = 0;
            } else {
                G7 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f40575o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f40563b.canScrollHorizontally(-1)) {
                    E8 = -((layoutManager.f40574n - layoutManager.E()) - layoutManager.F());
                }
                E8 = 0;
            }
            if (G7 == 0 || E8 != 0) {
                layoutManager.f40563b.Z(E8, G7, true);
                return true;
            }
        }
        return false;
    }
}
