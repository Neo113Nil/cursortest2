package androidx.room;

import X0.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import f0.d;
import f0.e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1627a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1628b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f1629c = new e(this);

    /* renamed from: d, reason: collision with root package name */
    public final d f1630d = new d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        f.e(intent, "intent");
        return this.f1630d;
    }
}
