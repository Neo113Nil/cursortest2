package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1118a;

    public r(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1118a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        r6.k.f((k) iInterface, "callback");
        r6.k.f(obj, "cookie");
        this.f1118a.f1061g.remove((Integer) obj);
    }
}
