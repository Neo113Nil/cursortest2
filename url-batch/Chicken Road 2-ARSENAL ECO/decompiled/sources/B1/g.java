package B1;

import U0.t;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.onesignal.debug.internal.crash.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import k1.n;
import p1.o;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements p1.c, k1.a, K0.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104f;

    public /* synthetic */ g(int i7) {
        this.f104f = i7;
    }

    @Override // k1.a
    public Object a(n nVar) {
        int i7;
        Object obj;
        switch (this.f104f) {
            case 5:
                i7 = 403;
                break;
            case 6:
                i7 = -1;
                break;
            default:
                synchronized (nVar.f5169a) {
                    t.h("Task is not yet complete", nVar.f5171c);
                    if (nVar.f5172d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(nVar.f5174f)) {
                        throw ((Throwable) IOException.class.cast(nVar.f5174f));
                    }
                    Exception exc = nVar.f5174f;
                    if (exc != null) {
                        throw new k1.f(exc);
                    }
                    obj = nVar.f5173e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i7);
    }

    @Override // K0.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                B0.c a7 = D0.j.a();
                a7.A(rawQuery.getString(1));
                a7.f73i = N0.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a7.f72h = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a7.e());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // p1.c
    public Object b(A.e eVar) {
        e lambda$getComponents$0;
        switch (this.f104f) {
            case 0:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            case 11:
                Set b7 = eVar.b(o.a(J1.a.class));
                J1.c cVar = J1.c.f1286h;
                if (cVar == null) {
                    synchronized (J1.c.class) {
                        try {
                            cVar = J1.c.f1286h;
                            if (cVar == null) {
                                cVar = new J1.c(0);
                                J1.c.f1286h = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new J1.b(b7, cVar);
            case r.MIN_SDK_VERSION /* 26 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3891a.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3893c.get();
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3892b.get();
            default:
                p1.k kVar = ExecutorsRegistrar.f3891a;
                return q1.i.f5781f;
        }
    }

    public /* synthetic */ g(int i7, Object obj) {
        this.f104f = i7;
    }
}
