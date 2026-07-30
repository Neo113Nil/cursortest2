package f2;

import P0.s;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import g2.C0448b;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0395b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0396c f4777e;

    public /* synthetic */ RunnableC0395b(C0396c c0396c, int i2) {
        this.f4776d = i2;
        this.f4777e = c0396c;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0448b u7;
        C0448b g7;
        boolean z7;
        switch (this.f4776d) {
            case 0:
                this.f4777e.a();
                return;
            case 1:
                C0396c c0396c = this.f4777e;
                Object obj = C0396c.f4778m;
                synchronized (obj) {
                    try {
                        P1.g gVar = c0396c.f4779a;
                        gVar.a();
                        s v7 = s.v(gVar.f2270a);
                        try {
                            u7 = c0396c.f4781c.u();
                            if (v7 != null) {
                                v7.y();
                            }
                        } catch (Throwable th) {
                            if (v7 != null) {
                                v7.y();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = u7.f5021b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (c0396c.f4782d.a(u7)) {
                                g7 = c0396c.b(u7);
                                synchronized (obj) {
                                    try {
                                        P1.g gVar2 = c0396c.f4779a;
                                        gVar2.a();
                                        s v8 = s.v(gVar2.f2270a);
                                        try {
                                            c0396c.f4781c.s(g7);
                                            if (v8 != null) {
                                                v8.y();
                                            }
                                        } catch (Throwable th2) {
                                            if (v8 != null) {
                                                v8.y();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (c0396c) {
                                    boolean z8 = g7.f5021b == 4;
                                    String str = g7.f5020a;
                                    if (!z8 || TextUtils.isEmpty(str)) {
                                        z7 = false;
                                    } else if (TextUtils.equals(u7.f5020a, str)) {
                                        z7 = !(u7.f5021b == 4);
                                    } else {
                                        z7 = true;
                                    }
                                    if (z7) {
                                        Iterator it = c0396c.f4788k.iterator();
                                        while (it.hasNext()) {
                                            FirebaseMessaging firebaseMessaging = ((n) it.next()).f4514a;
                                            B.f fVar = FirebaseMessaging.f4435m;
                                            if (firebaseMessaging.d() != null) {
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                                                }
                                                synchronized (firebaseMessaging) {
                                                    if (!firebaseMessaging.f4447k) {
                                                        firebaseMessaging.g(0L);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (g7.f5021b == 4) {
                                    String str2 = g7.f5020a;
                                    synchronized (c0396c) {
                                        c0396c.j = str2;
                                    }
                                }
                                int i5 = g7.f5021b;
                                if (i5 == 5) {
                                    c0396c.h(new C0398e());
                                    return;
                                }
                                if (i5 == 2 || i5 == 1) {
                                    c0396c.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    c0396c.i(g7);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g7 = c0396c.g(u7);
                    synchronized (obj) {
                    }
                } catch (C0398e e7) {
                    c0396c.h(e7);
                    return;
                }
                break;
            default:
                this.f4777e.a();
                return;
        }
    }
}
