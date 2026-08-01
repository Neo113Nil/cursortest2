package g0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2366a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2366a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        X0.d.e((b) iInterface, "callback");
        X0.d.e(obj, "cookie");
        this.f2366a.f1495b.remove((Integer) obj);
    }
}
