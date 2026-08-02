package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import defpackage.ajh;
import defpackage.ajl;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new ajl(this);
    private final ajh d = new ajh(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
