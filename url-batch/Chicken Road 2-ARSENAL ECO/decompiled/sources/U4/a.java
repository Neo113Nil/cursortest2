package U4;

import c4.u;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f2601a;

    public /* synthetic */ a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f2601a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2601a.size();
        V3.c.c(c.f2618i, c.f2620k);
        ((u) obj).a();
    }
}
