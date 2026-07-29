package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1486a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final h f1487b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1488c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f1489d;

    e(h hVar, g gVar, ComponentName componentName) {
        this.f1487b = hVar;
        this.f1488c = gVar;
        this.f1489d = componentName;
    }

    public boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1487b.a(this.f1488c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    IBinder a() {
        return this.f1488c.asBinder();
    }

    ComponentName b() {
        return this.f1489d;
    }
}
