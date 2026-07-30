package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Collection n;

    public /* synthetic */ v0(int i, Collection collection) {
        this.m = i;
        this.n = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.m;
        Collection<?> collection = this.n;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
