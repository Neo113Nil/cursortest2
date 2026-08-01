package d;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3219a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3220b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f3221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3223e;

    public d0(boolean z10) {
        this.f3219a = new ArrayList();
        this.f3220b = z10;
        this.f3221c = new CopyOnWriteArrayList();
    }

    public final void d(boolean z10) {
        this.f3220b = z10;
        ArrayList arrayList = this.f3219a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            x xVar = (x) obj;
            xVar.f(xVar.g && z10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i3, Object obj) {
        this(false);
        this.f3222d = i3;
        this.f3223e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(b3.b bVar) {
        this(true);
        this.f3222d = 0;
        this.f3223e = bVar;
    }

    public final void a() {
    }

    public final void b(a aVar) {
    }

    public final void c(a aVar) {
    }
}
