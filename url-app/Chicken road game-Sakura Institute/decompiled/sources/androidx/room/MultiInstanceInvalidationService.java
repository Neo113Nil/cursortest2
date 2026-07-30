package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: f, reason: collision with root package name */
    public int f1060f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f1061g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final r f1062h = new r(this);

    /* renamed from: i, reason: collision with root package name */
    public final q f1063i = new q(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        r6.k.f(intent, "intent");
        return this.f1063i;
    }
}
