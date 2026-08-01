package cf;

import com.google.firebase.messaging.v;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2041b;

    @Override // cf.b
    public final Object a(v vVar) {
        if (this.f2041b == null) {
            return super.a(vVar);
        }
        Object obj = this.f2041b;
        if (obj != null) {
            return obj;
        }
        i0.l("Single instance created couldn't return value");
        return null;
    }

    @Override // cf.b
    public final Object b(v vVar) {
        if (this.f2041b == null) {
            synchronized (this) {
                if (!(this.f2041b != null)) {
                    this.f2041b = a(vVar);
                }
            }
        }
        Object obj = this.f2041b;
        if (obj != null) {
            return obj;
        }
        i0.l("Single instance created couldn't return value");
        return null;
    }
}
