package b;

import e.C0411c;
import java.util.function.IntConsumer;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0315k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5296d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5298f;

    public /* synthetic */ RunnableC0315k(C0317m c0317m, int i3, A1.i iVar) {
        this.f5298f = c0317m;
        this.f5297e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5296d) {
            case 0:
                C0317m c0317m = (C0317m) this.f5298f;
                f2.j.f(c0317m, "this$0");
                Boolean bool = Boolean.TRUE;
                String str = (String) c0317m.f5303a.get(Integer.valueOf(this.f5297e));
                if (str != null) {
                    C0411c c0411c = (C0411c) c0317m.f5307e.get(str);
                    if ((c0411c != null ? c0411c.f5682a : null) != null) {
                        L1.g gVar = c0411c.f5682a;
                        if (c0317m.f5306d.remove(str)) {
                            gVar.b(bool);
                            break;
                        }
                    } else {
                        c0317m.f5309g.remove(str);
                        c0317m.f5308f.put(str, bool);
                        break;
                    }
                }
                break;
            default:
                ((IntConsumer) this.f5298f).accept(this.f5297e);
                break;
        }
    }

    public /* synthetic */ RunnableC0315k(IntConsumer intConsumer, int i3) {
        this.f5298f = intConsumer;
        this.f5297e = i3;
    }
}
