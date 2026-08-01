package x8;

import android.text.TextUtils;
import android.util.Log;
import c6.l;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f10545e;

    public /* synthetic */ b(c cVar, int i3) {
        this.f10544d = i3;
        this.f10545e = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        y8.b n10;
        y8.b g;
        boolean z10;
        switch (this.f10544d) {
            case 0:
                this.f10545e.a();
                return;
            case 1:
                c cVar = this.f10545e;
                Object obj = c.f10546m;
                synchronized (obj) {
                    try {
                        g8.g gVar = cVar.f10547a;
                        gVar.a();
                        l a9 = l.a(gVar.f4300a);
                        try {
                            n10 = cVar.f10549c.n();
                            if (a9 != null) {
                                a9.j();
                            }
                        } catch (Throwable th) {
                            if (a9 != null) {
                                a9.j();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i3 = n10.f10676b;
                    if (!(i3 == 5)) {
                        if (!(i3 == 3)) {
                            if (cVar.f10550d.a(n10)) {
                                g = cVar.b(n10);
                                synchronized (obj) {
                                    try {
                                        g8.g gVar2 = cVar.f10547a;
                                        gVar2.a();
                                        l a10 = l.a(gVar2.f4300a);
                                        try {
                                            cVar.f10549c.k(g);
                                            if (a10 != null) {
                                                a10.j();
                                            }
                                        } catch (Throwable th2) {
                                            if (a10 != null) {
                                                a10.j();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    boolean z11 = g.f10676b == 4;
                                    String str = g.f10675a;
                                    if (!z11 || TextUtils.isEmpty(str)) {
                                        z10 = false;
                                    } else if (TextUtils.equals(n10.f10675a, str)) {
                                        z10 = !(n10.f10676b == 4);
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        Iterator it = cVar.f10555k.iterator();
                                        while (it.hasNext()) {
                                            FirebaseMessaging firebaseMessaging = ((com.google.firebase.messaging.l) it.next()).f3154a;
                                            if (firebaseMessaging.d() != null) {
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                                                }
                                                synchronized (firebaseMessaging) {
                                                    if (!firebaseMessaging.f3086k) {
                                                        firebaseMessaging.g(0L);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (g.f10676b == 4) {
                                    String str2 = g.f10675a;
                                    synchronized (cVar) {
                                        cVar.j = str2;
                                    }
                                }
                                int i10 = g.f10676b;
                                if (i10 == 5) {
                                    cVar.h(new e());
                                    return;
                                }
                                if (i10 == 2 || i10 == 1) {
                                    cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = cVar.g(n10);
                    synchronized (obj) {
                    }
                } catch (e e2) {
                    cVar.h(e2);
                    return;
                }
                break;
            default:
                this.f10545e.a();
                return;
        }
    }
}
