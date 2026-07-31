package B1;

import android.text.TextUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.IOException;
import java.util.Iterator;
import u0.C0675e;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f89f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f90g;

    public /* synthetic */ c(d dVar, int i7) {
        this.f89f = i7;
        this.f90g = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1.a m4;
        C1.a g7;
        switch (this.f89f) {
            case 0:
                this.f90g.a();
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f90g.a();
                return;
            default:
                d dVar = this.f90g;
                Object obj = d.f91m;
                synchronized (obj) {
                    try {
                        m1.g gVar = dVar.f92a;
                        gVar.a();
                        C0675e a7 = C0675e.a(gVar.f5425a);
                        try {
                            m4 = dVar.f94c.m();
                            if (a7 != null) {
                                a7.h();
                            }
                        } catch (Throwable th) {
                            if (a7 != null) {
                                a7.h();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i7 = m4.f190b;
                    if (!(i7 == 5)) {
                        if (!(i7 == 3)) {
                            if (dVar.f95d.a(m4)) {
                                g7 = dVar.b(m4);
                                synchronized (obj) {
                                    try {
                                        m1.g gVar2 = dVar.f92a;
                                        gVar2.a();
                                        C0675e a8 = C0675e.a(gVar2.f5425a);
                                        try {
                                            dVar.f94c.l(g7);
                                            if (a8 != null) {
                                                a8.h();
                                            }
                                        } catch (Throwable th2) {
                                            if (a8 != null) {
                                                a8.h();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (dVar) {
                                    try {
                                        if (dVar.f102k.size() != 0 && !TextUtils.equals(m4.f189a, g7.f189a)) {
                                            Iterator it = dVar.f102k.iterator();
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
                                if (g7.f190b == 4) {
                                    String str = g7.f189a;
                                    synchronized (dVar) {
                                        dVar.f101j = str;
                                    }
                                }
                                int i8 = g7.f190b;
                                if (i8 == 5) {
                                    dVar.h(new f());
                                    return;
                                } else if (i8 == 2 || i8 == 1) {
                                    dVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    dVar.i(g7);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g7 = dVar.g(m4);
                    synchronized (obj) {
                    }
                } catch (f e4) {
                    dVar.h(e4);
                    return;
                }
                break;
        }
    }
}
