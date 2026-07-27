package P3;

import X2.u;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f2290a;

    public /* synthetic */ a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f2290a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2290a.size();
        Q2.c.d(c.f2307d, c.f2309f);
        ((u) obj).a();
    }
}
