package w4;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f7886f;

    public /* synthetic */ b(g gVar, ArrayList arrayList, int i) {
        this.f7884d = i;
        this.f7886f = gVar;
        this.f7885e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7884d) {
            case 0:
                ArrayList arrayList = this.f7885e;
                int size = arrayList.size();
                g gVar = this.f7886f;
                if (size <= 0) {
                    arrayList.clear();
                    gVar.f7916m.remove(arrayList);
                    return;
                } else {
                    ((f) arrayList.get(0)).getClass();
                    gVar.getClass();
                    throw null;
                }
            case 1:
                ArrayList arrayList2 = this.f7885e;
                int size2 = arrayList2.size();
                int i = 0;
                while (true) {
                    g gVar2 = this.f7886f;
                    if (i >= size2) {
                        arrayList2.clear();
                        gVar2.f7917n.remove(arrayList2);
                        return;
                    } else {
                        Object obj = arrayList2.get(i);
                        i++;
                        ArrayList arrayList3 = gVar2.f7921r;
                        ((e) obj).getClass();
                    }
                }
            default:
                ArrayList arrayList4 = this.f7885e;
                int size3 = arrayList4.size();
                g gVar3 = this.f7886f;
                if (size3 <= 0) {
                    arrayList4.clear();
                    gVar3.f7915l.remove(arrayList4);
                    return;
                } else {
                    p0 p0Var = (p0) arrayList4.get(0);
                    gVar3.getClass();
                    p0Var.getClass();
                    throw null;
                }
        }
    }
}
