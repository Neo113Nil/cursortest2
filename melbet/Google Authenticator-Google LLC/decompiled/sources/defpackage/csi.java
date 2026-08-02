package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csi {
    public static final Object a = new Object();
    public static volatile csi b;

    public csi() {
        new ConcurrentHashMap();
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }
}
