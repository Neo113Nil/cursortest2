package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* loaded from: classes.dex */
public final class t extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2132a;

    public t(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2132a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        j1.h.e((n) iInterface, "callback");
        j1.h.e(obj, "cookie");
        this.f2132a.f2079b.remove((Integer) obj);
    }
}
