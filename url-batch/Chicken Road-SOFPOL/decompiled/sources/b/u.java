package b;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1021a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1022b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1025e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj) {
        this(false);
        this.f1024d = i;
        this.f1025e = obj;
    }

    public final void d(boolean z3) {
        this.f1022b = z3;
        ArrayList arrayList = this.f1021a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).c(z3);
        }
    }

    public u(boolean z3) {
        this.f1021a = new ArrayList();
        this.f1022b = z3;
        this.f1023c = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(u2.a aVar) {
        this(true);
        this.f1024d = 0;
        this.f1025e = aVar;
    }

    public final void a() {
    }

    public final void b(a aVar) {
    }

    public final void c(a aVar) {
    }
}
