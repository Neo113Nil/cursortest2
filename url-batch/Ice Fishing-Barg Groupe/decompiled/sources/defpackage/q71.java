package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q71 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService PxuCJdSBwIXG;

    public q71(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.PxuCJdSBwIXG = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((um0) iInterface).getClass();
        obj.getClass();
        this.PxuCJdSBwIXG.OPXfSBeufaJ8.remove((Integer) obj);
    }
}
