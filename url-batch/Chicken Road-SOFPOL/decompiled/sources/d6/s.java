package d6;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2324b;

    public /* synthetic */ s(int i, Object obj) {
        this.f2323a = i;
        this.f2324b = obj;
    }

    @Override // x6.e
    public final Iterator iterator() {
        switch (this.f2323a) {
            case 0:
                return ((Iterable) this.f2324b).iterator();
            default:
                return (Iterator) this.f2324b;
        }
    }
}
