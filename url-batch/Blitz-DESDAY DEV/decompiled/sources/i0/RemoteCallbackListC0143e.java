package i0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0143e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2616a;

    public RemoteCallbackListC0143e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2616a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        g1.d.e((InterfaceC0140b) iInterface, "callback");
        g1.d.e(obj, "cookie");
        this.f2616a.f1703b.remove((Integer) obj);
    }
}
