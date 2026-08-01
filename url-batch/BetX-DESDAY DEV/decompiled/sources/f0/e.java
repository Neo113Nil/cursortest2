package f0;

import X0.f;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2419a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2419a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        f.e((b) iInterface, "callback");
        f.e(obj, "cookie");
        this.f2419a.f1628b.remove((Integer) obj);
    }
}
