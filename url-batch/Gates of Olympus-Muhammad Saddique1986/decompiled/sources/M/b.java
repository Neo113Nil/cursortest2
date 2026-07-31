package M;

import e2.InterfaceC0424c;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Collection f3424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Collection collection) {
        super(1);
        this.f3423e = i3;
        this.f3424f = collection;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f3423e) {
            case 0:
                return Boolean.valueOf(this.f3424f.contains(obj));
            case 1:
                return Boolean.valueOf(this.f3424f.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f3424f));
        }
    }
}
