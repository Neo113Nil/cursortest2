package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lq extends wv {
    final lr a;
    public final Map b = new WeakHashMap();

    public lq(lr lrVar) {
        this.a = lrVar;
    }

    @Override // defpackage.wv
    public final aak a(View view) {
        wv wvVar = (wv) this.b.get(view);
        return wvVar != null ? wvVar.a(view) : super.a(view);
    }

    @Override // defpackage.wv
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        wv wvVar = (wv) this.b.get(view);
        if (wvVar != null) {
            wvVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        ky kyVar;
        lr lrVar = this.a;
        if (lrVar.k() || (kyVar = lrVar.a.m) == null) {
            super.c(view, aahVar);
            return;
        }
        kyVar.aN(view, aahVar);
        wv wvVar = (wv) this.b.get(view);
        if (wvVar != null) {
            wvVar.c(view, aahVar);
        } else {
            super.c(view, aahVar);
        }
    }

    @Override // defpackage.wv
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        wv wvVar = (wv) this.b.get(view);
        if (wvVar != null) {
            wvVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.wv
    public final void e(View view, int i) {
        wv wvVar = (wv) this.b.get(view);
        if (wvVar != null) {
            wvVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.wv
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        wv wvVar = (wv) this.b.get(view);
        if (wvVar != null) {
            wvVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.wv
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        wv wvVar = (wv) this.b.get(view);
        return wvVar != null ? wvVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.wv
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        wv wvVar = (wv) this.b.get(viewGroup);
        return wvVar != null ? wvVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        lr lrVar = this.a;
        if (!lrVar.k()) {
            RecyclerView recyclerView = lrVar.a;
            if (recyclerView.m != null) {
                wv wvVar = (wv) this.b.get(view);
                if (wvVar != null) {
                    if (wvVar.i(view, i, bundle)) {
                        return true;
                    }
                } else if (super.i(view, i, bundle)) {
                    return true;
                }
                RecyclerView recyclerView2 = recyclerView.m.s;
                le leVar = recyclerView2.e;
                lm lmVar = recyclerView2.M;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
