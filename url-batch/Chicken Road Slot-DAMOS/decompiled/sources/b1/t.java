package b1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection f1038e;

    public /* synthetic */ t(int i3, Collection collection) {
        this.f1037d = i3;
        this.f1038e = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean retainAll;
        switch (this.f1037d) {
            case 0:
                retainAll = ((List) obj).retainAll(this.f1038e);
                break;
            case 1:
                retainAll = this.f1038e.contains(obj);
                break;
            default:
                retainAll = this.f1038e.contains(obj);
                break;
        }
        return Boolean.valueOf(retainAll);
    }
}
