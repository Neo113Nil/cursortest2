package K;

import M2.p;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection f3421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Collection collection) {
        super(1);
        this.f3420d = i2;
        this.f3421e = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3420d) {
            case 0:
                return Boolean.valueOf(this.f3421e.contains(obj));
            case 1:
                return Boolean.valueOf(this.f3421e.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f3421e));
        }
    }
}
