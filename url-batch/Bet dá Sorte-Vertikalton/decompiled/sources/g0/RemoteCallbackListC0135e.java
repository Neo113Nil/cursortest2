package g0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0135e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2477a;

    public RemoteCallbackListC0135e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2477a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        b1.d.e((InterfaceC0132b) iInterface, "callback");
        b1.d.e(obj, "cookie");
        this.f2477a.f1572b.remove((Integer) obj);
    }
}
