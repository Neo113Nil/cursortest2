package u;

import a.AbstractC0157a;
import java.util.Comparator;

/* renamed from: u.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949q implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f8082b;

    public /* synthetic */ C0949q(x xVar, int i3) {
        this.f8081a = i3;
        this.f8082b = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8081a) {
            case 0:
                Object key = ((z) obj).getKey();
                x xVar = this.f8082b;
                return AbstractC0157a.q(Integer.valueOf(xVar.b(key)), Integer.valueOf(xVar.b(((z) obj2).getKey())));
            default:
                Object key2 = ((z) obj2).getKey();
                x xVar2 = this.f8082b;
                return AbstractC0157a.q(Integer.valueOf(xVar2.b(key2)), Integer.valueOf(xVar2.b(((z) obj).getKey())));
        }
    }
}
