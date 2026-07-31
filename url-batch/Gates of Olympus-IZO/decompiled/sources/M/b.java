package M;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Collection f2733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Collection collection) {
        super(1);
        this.f2732e = i3;
        this.f2733f = collection;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f2732e) {
            case 0:
                return Boolean.valueOf(this.f2733f.contains(obj));
            case 1:
                return Boolean.valueOf(this.f2733f.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f2733f));
        }
    }
}
