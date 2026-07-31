package b7;

import a7.h;
import a7.q;
import a7.x;
import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f7.g;
import g6.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.a2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1530d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1532f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f1530d = i;
        this.f1531e = obj;
        this.f1532f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1.b bVar;
        a2 a2Var;
        l.f fVar;
        switch (this.f1530d) {
            case 0:
                ((h) this.f1531e).E((e) this.f1532f);
                return;
            case 1:
                g gVar = (g) this.f1532f;
                q qVar = gVar.f2778g;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1531e).run();
                    } catch (Throwable th) {
                        x.j(i.f3046d, th);
                    }
                    Runnable m7 = gVar.m();
                    if (m7 == null) {
                        return;
                    }
                    this.f1531e = m7;
                    i++;
                    if (i >= 16 && qVar.i(gVar)) {
                        qVar.h(gVar, this);
                        return;
                    }
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                x3.c cVar = ((SwipeDismissBehavior) this.f1532f).f1833a;
                if (cVar == null || !cVar.f()) {
                    return;
                }
                ((View) this.f1531e).postOnAnimation(this);
                return;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                l.f fVar2 = (l.f) this.f1531e;
                l.i iVar = (l.i) this.f1532f;
                k.i iVar2 = iVar.f4257f;
                if (iVar2 != null && (bVar = iVar2.f4074e) != null && (a2Var = ((ActionMenuView) bVar.f1050e).f403w) != null) {
                    Toolbar toolbar = a2Var.f4201a;
                    l.i iVar3 = toolbar.f419d.f402v;
                    if (iVar3 == null || (fVar = iVar3.f4271u) == null || !fVar.b()) {
                        Iterator it = ((CopyOnWriteArrayList) toolbar.J.f6119e).iterator();
                        if (it.hasNext()) {
                            ((h4.h) it.next()).getClass();
                            throw null;
                        }
                    }
                }
                ActionMenuView actionMenuView = iVar.f4260j;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!fVar2.b()) {
                        if (fVar2.f4120e != null) {
                            fVar2.d(0, 0, false, false);
                        }
                    }
                    iVar.f4271u = fVar2;
                }
                iVar.f4273w = null;
                return;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                b1.b bVar2 = (b1.b) this.f1531e;
                Typeface typeface = (Typeface) this.f1532f;
                h3.b bVar3 = (h3.b) bVar2.f1050e;
                if (bVar3 != null) {
                    bVar3.e(typeface);
                    return;
                }
                return;
            default:
                ((n3.e) this.f1531e).accept(this.f1532f);
                return;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2, boolean z3) {
        this.f1530d = i;
        this.f1532f = obj;
        this.f1531e = obj2;
    }

    public d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f1530d = 2;
        this.f1532f = swipeDismissBehavior;
        this.f1531e = view;
    }
}
