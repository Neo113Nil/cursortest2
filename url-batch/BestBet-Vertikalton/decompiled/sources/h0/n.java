package h0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class n extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2981a;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2981a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        k1.e.e((h) iInterface, "callback");
        k1.e.e(obj, "cookie");
        this.f2981a.f2034b.remove((Integer) obj);
    }
}
