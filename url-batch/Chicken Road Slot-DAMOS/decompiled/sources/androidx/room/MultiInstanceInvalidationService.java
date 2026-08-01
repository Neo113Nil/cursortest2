package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import z4.g;
import z4.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public int f751d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f752e = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final h f753i = new h(this);

    /* renamed from: r, reason: collision with root package name */
    public final g f754r = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f754r;
    }
}
