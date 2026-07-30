package B5;

import J4.u;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f180a;

    public /* synthetic */ a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f180a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f180a.size();
        C4.f.b(d.f201l, d.f203n);
        ((u) obj).a();
    }
}
