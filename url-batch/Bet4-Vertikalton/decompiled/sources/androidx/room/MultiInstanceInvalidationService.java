package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import h0.d;
import h0.e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1625a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1626b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f1627c = new e(this);
    public final d d = new d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d1.d.e(intent, "intent");
        return this.d;
    }
}
