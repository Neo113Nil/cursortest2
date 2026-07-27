package Z1;

import B0.l;
import a2.C0180a;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3752b;

    public /* synthetic */ b(c cVar, int i2) {
        this.f3751a = i2;
        this.f3752b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0180a l2;
        C0180a g6;
        switch (this.f3751a) {
            case 0:
                this.f3752b.a();
                return;
            case 1:
                this.f3752b.a();
                return;
            default:
                c cVar = this.f3752b;
                cVar.getClass();
                Object obj = c.f3753m;
                synchronized (obj) {
                    try {
                        K1.g gVar = cVar.f3754a;
                        gVar.a();
                        l b6 = l.b(gVar.f1387a);
                        try {
                            l2 = cVar.f3756c.l();
                            if (b6 != null) {
                                b6.g();
                            }
                        } catch (Throwable th) {
                            if (b6 != null) {
                                b6.g();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = l2.f3849b;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (cVar.f3757d.a(l2)) {
                                g6 = cVar.b(l2);
                                synchronized (obj) {
                                    try {
                                        K1.g gVar2 = cVar.f3754a;
                                        gVar2.a();
                                        l b7 = l.b(gVar2.f1387a);
                                        try {
                                            cVar.f3756c.j(g6);
                                            if (b7 != null) {
                                                b7.g();
                                            }
                                        } catch (Throwable th2) {
                                            if (b7 != null) {
                                                b7.g();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    try {
                                        if (cVar.f3764k.size() != 0 && !TextUtils.equals(l2.f3848a, g6.f3848a)) {
                                            Iterator it = cVar.f3764k.iterator();
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
                                if (g6.f3849b == 4) {
                                    String str = g6.f3848a;
                                    synchronized (cVar) {
                                        cVar.f3763j = str;
                                    }
                                }
                                int i3 = g6.f3849b;
                                if (i3 == 5) {
                                    cVar.h(new e());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.i(g6);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g6 = cVar.g(l2);
                    synchronized (obj) {
                    }
                } catch (e e3) {
                    cVar.h(e3);
                    return;
                }
                break;
        }
    }
}
