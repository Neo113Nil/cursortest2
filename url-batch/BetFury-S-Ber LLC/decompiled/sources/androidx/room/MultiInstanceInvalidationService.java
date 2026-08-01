package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.x20;
import defpackage.y20;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final y20 h = new y20(this);
    public final x20 i = new x20(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.i;
    }
}
