package m1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0649g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6942d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6943e;

    public RunnableC0649g(List list, int i3, Throwable th) {
        l0.c.m(list, "initCallbacks cannot be null");
        this.f6942d = new ArrayList(list);
        this.f6943e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f6942d;
        int size = arrayList.size();
        int i3 = 0;
        if (this.f6943e != 1) {
            while (i3 < size) {
                ((K0.f) arrayList.get(i3)).f3251b.f334d = K0.i.f3254a;
                i3++;
            }
            return;
        }
        while (i3 < size) {
            K0.f fVar = (K0.f) arrayList.get(i3);
            fVar.f3250a.setValue(Boolean.TRUE);
            fVar.f3251b.f334d = new K0.j(true);
            i3++;
        }
    }
}
