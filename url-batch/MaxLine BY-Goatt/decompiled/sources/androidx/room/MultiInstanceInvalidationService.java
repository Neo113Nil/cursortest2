package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.om1;
import defpackage.pm1;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int m;
    public final LinkedHashMap n = new LinkedHashMap();
    public final pm1 o = new pm1(this);
    public final om1 p = new om1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.p;
    }
}
