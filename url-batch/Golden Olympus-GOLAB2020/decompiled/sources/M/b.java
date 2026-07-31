package M;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f903a = new ArrayList();

    public final void a() {
        int lastIndex = CollectionsKt.getLastIndex(this.f903a);
        if (-1 >= lastIndex) {
            return;
        }
        android.support.v4.media.session.b.a(this.f903a.get(lastIndex));
        throw null;
    }
}
