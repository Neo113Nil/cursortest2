package androidx.fragment.app;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f525a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f526b = false;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f527c = new CopyOnWriteArrayList();
    public final /* synthetic */ k0 d;

    public c0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a(boolean z4) {
        d1.e eVar;
        this.f526b = z4;
        ArrayList arrayList = this.f525a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a.c0 c0Var = (a.c0) obj;
            boolean z5 = c0Var.f9e && z4;
            if (c0Var.f7b != z5) {
                c0Var.f7b = z5;
                a0.k kVar = c0Var.f8c;
                if (kVar != null && (eVar = (d1.e) kVar.f98g) != null) {
                    eVar.b();
                }
            }
        }
    }
}
