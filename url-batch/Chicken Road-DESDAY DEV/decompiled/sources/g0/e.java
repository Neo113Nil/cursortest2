package g0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2438a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2438a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        b1.d.e((b) iInterface, "callback");
        b1.d.e(obj, "cookie");
        this.f2438a.f1556b.remove((Integer) obj);
    }
}
