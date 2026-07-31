package w1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class x extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9918a;

    public x(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9918a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        f2.j.f((l) iInterface, "callback");
        f2.j.f(obj, "cookie");
        this.f9918a.f5252e.remove((Integer) obj);
    }
}
