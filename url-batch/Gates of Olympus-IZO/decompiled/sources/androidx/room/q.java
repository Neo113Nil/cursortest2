package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* loaded from: classes.dex */
public final class q extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4103a;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4103a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        Z1.i.f((l) iInterface, "callback");
        Z1.i.f(obj, "cookie");
        this.f4103a.f4051e.remove((Integer) obj);
    }
}
