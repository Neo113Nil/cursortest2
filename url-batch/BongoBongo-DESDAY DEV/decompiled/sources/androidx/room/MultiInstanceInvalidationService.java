package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import i0.d;
import i0.e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1718b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f1719c = new e(this);
    public final d d = new d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h1.d.e(intent, "intent");
        return this.d;
    }
}
