package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import f2.j;
import java.util.LinkedHashMap;
import w1.w;
import w1.x;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public int f5251d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5252e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final x f5253f = new x(this);

    /* renamed from: g, reason: collision with root package name */
    public final w f5254g = new w(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.f(intent, "intent");
        return this.f5254g;
    }
}
