package B0;

import a.AbstractC0157a;
import java.util.Comparator;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250a;

    public /* synthetic */ C0006c(int i3) {
        this.f250a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f250a) {
            case 0:
                return AbstractC0157a.q(Integer.valueOf(((C0005b) obj).f247b), Integer.valueOf(((C0005b) obj2).f247b));
            default:
                return AbstractC0157a.q(((O2.f) obj).f3003a, ((O2.f) obj2).f3003a);
        }
    }
}
