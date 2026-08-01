package b7;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f1287a;

    public g(int i3) {
        switch (i3) {
            case 1:
                this.f1287a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            default:
                this.f1287a = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }
}
