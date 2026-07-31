package u;

import a.AbstractC0157a;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class r implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F2.h f8084b;

    public /* synthetic */ r(F2.h hVar, int i3) {
        this.f8083a = i3;
        this.f8084b = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8083a) {
            case 0:
                Object key = ((z) obj).getKey();
                F2.h hVar = this.f8084b;
                return AbstractC0157a.q(Integer.valueOf(hVar.b(key)), Integer.valueOf(hVar.b(((z) obj2).getKey())));
            default:
                Object key2 = ((z) obj2).getKey();
                F2.h hVar2 = this.f8084b;
                return AbstractC0157a.q(Integer.valueOf(hVar2.b(key2)), Integer.valueOf(hVar2.b(((z) obj).getKey())));
        }
    }
}
