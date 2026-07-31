package j1;

import a.AbstractC0157a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0516g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5252d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5253e;

    public RunnableC0516g(List list, int i3, Throwable th) {
        AbstractC0157a.p(list, "initCallbacks cannot be null");
        this.f5252d = new ArrayList(list);
        this.f5253e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5252d;
        int size = arrayList.size();
        int i3 = 0;
        if (this.f5253e != 1) {
            while (i3 < size) {
                ((I0.g) arrayList.get(i3)).f2450b.f83b = I0.j.f2453a;
                i3++;
            }
            return;
        }
        while (i3 < size) {
            I0.g gVar = (I0.g) arrayList.get(i3);
            gVar.f2449a.setValue(Boolean.TRUE);
            gVar.f2450b.f83b = new I0.k(true);
            i3++;
        }
    }
}
