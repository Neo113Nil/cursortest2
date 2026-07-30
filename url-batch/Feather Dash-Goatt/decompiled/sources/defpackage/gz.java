package defpackage;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gz implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ hz e;

    public /* synthetic */ gz(hz hzVar, int i) {
        this.d = i;
        this.e = hzVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        wb q;
        wb g;
        int i = this.d;
        hz hzVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hzVar.a();
                return;
            case 1:
                Object obj = hz.m;
                synchronized (obj) {
                    try {
                        ez ezVar = hzVar.a;
                        ezVar.a();
                        yw e = yw.e(ezVar.a);
                        try {
                            q = hzVar.c.q();
                            if (e != null) {
                                e.r();
                            }
                        } catch (Throwable th) {
                            if (e != null) {
                                e.r();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = q.b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (hzVar.d.a(q)) {
                                g = hzVar.b(q);
                                synchronized (obj) {
                                    try {
                                        ez ezVar2 = hzVar.a;
                                        ezVar2.a();
                                        yw e2 = yw.e(ezVar2.a);
                                        try {
                                            hzVar.c.m(g);
                                            if (e2 != null) {
                                                e2.r();
                                            }
                                        } catch (Throwable th2) {
                                            if (e2 != null) {
                                                e2.r();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (hzVar) {
                                    try {
                                        if (hzVar.k.size() != 0 && !TextUtils.equals(q.a, g.a)) {
                                            Iterator it = hzVar.k.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (g.b == 4) {
                                    String str = g.a;
                                    synchronized (hzVar) {
                                        hzVar.j = str;
                                    }
                                }
                                int i3 = g.b;
                                if (i3 == 5) {
                                    hzVar.h(new jz());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    hzVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    hzVar.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = hzVar.g(q);
                    synchronized (obj) {
                    }
                } catch (jz e3) {
                    hzVar.h(e3);
                    return;
                }
                break;
            default:
                hzVar.a();
                return;
        }
    }
}
