package g0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2364a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2364a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        X0.e.e((b) iInterface, "callback");
        X0.e.e(obj, "cookie");
        this.f2364a.f1492b.remove((Integer) obj);
    }
}
