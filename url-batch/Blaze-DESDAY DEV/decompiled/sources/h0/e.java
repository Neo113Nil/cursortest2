package h0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2557a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2557a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        g1.d.e((b) iInterface, "callback");
        g1.d.e(obj, "cookie");
        this.f2557a.f1655b.remove((Integer) obj);
    }
}
