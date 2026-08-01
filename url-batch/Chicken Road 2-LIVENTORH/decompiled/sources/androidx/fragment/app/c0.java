package androidx.fragment.app;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f411a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f412b = false;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f413c = new CopyOnWriteArrayList();
    public final /* synthetic */ k0 d;

    public c0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a(boolean z3) {
        c1.e eVar;
        this.f412b = z3;
        ArrayList arrayList = this.f411a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a.c0 c0Var = (a.c0) obj;
            boolean z4 = c0Var.f10e && z3;
            if (c0Var.f8b != z4) {
                c0Var.f8b = z4;
                a0.j jVar = c0Var.f9c;
                if (jVar != null && (eVar = (c1.e) jVar.f101g) != null) {
                    eVar.b();
                }
            }
        }
    }
}
