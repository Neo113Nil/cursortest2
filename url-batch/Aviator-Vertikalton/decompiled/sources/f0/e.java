package f0;

import X0.f;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2415a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2415a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        f.e((b) iInterface, "callback");
        f.e(obj, "cookie");
        this.f2415a.f1627b.remove((Integer) obj);
    }
}
