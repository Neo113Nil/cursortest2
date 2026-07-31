package q0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection f5934e;

    public /* synthetic */ b(int i, Collection collection) {
        this.f5933d = i;
        this.f5934e = collection;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        boolean contains;
        switch (this.f5933d) {
            case 0:
                contains = this.f5934e.contains(obj);
                break;
            case 1:
                contains = this.f5934e.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f5934e);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
