package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1645a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1646b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final q f1647c = new q(this);
    public final p d = new p(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        g1.f.e(intent, "intent");
        return this.d;
    }
}
