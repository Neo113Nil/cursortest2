package A3;

import java.util.Comparator;
import o2.C0924c;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f864a;

    public /* synthetic */ i(int i2) {
        this.f864a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f864a) {
            case 0:
                return B2.b.a(((h) obj).f858a, ((h) obj2).f858a);
            default:
                return ((C0924c) obj).compareTo((C0924c) obj2);
        }
    }
}
