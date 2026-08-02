package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajl extends RemoteCallbackList {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public ajl(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((ajg) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
