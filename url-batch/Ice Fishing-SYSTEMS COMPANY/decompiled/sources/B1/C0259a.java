package B1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.InputStream;
import java.util.ArrayDeque;
import v1.InterfaceC5117a;

/* renamed from: B1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259a implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f83b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f84c;

    public /* synthetic */ C0259a(int i, Object obj, Object obj2) {
        this.f82a = i;
        this.f83b = obj;
        this.f84c = obj2;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i4, s1.h hVar) {
        boolean z8;
        z zVar;
        N1.e eVar;
        switch (this.f82a) {
            case 0:
                u1.x a9 = ((s1.j) this.f83b).a(obj, i, i4, hVar);
                if (a9 == null) {
                    return null;
                }
                return new C0262d((Resources) this.f84c, a9);
            case 1:
                u1.x c4 = ((D1.c) this.f83b).c((Uri) obj, hVar);
                if (c4 == null) {
                    return null;
                }
                return q.b((InterfaceC5117a) this.f84c, (Drawable) ((D1.b) c4).get(), i, i4);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof z) {
                    zVar = (z) inputStream;
                    z8 = false;
                } else {
                    z8 = true;
                    zVar = new z(inputStream, (C3112dq) this.f84c);
                }
                ArrayDeque arrayDeque = N1.e.f1956v;
                synchronized (arrayDeque) {
                    eVar = (N1.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new N1.e();
                }
                N1.e eVar2 = eVar;
                eVar2.f1957n = zVar;
                N1.m mVar = new N1.m(eVar2);
                S0.e eVar3 = new S0.e(1, zVar, eVar2);
                try {
                    o oVar = (o) this.f83b;
                    C0262d a10 = oVar.a(new Y2.e(mVar, oVar.f118d, oVar.f117c), i, i4, hVar, eVar3);
                    eVar2.f1958u = null;
                    eVar2.f1957n = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                    }
                    if (z8) {
                        zVar.b();
                    }
                    return a10;
                } catch (Throwable th) {
                    eVar2.f1958u = null;
                    eVar2.f1957n = null;
                    ArrayDeque arrayDeque2 = N1.e.f1956v;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (!z8) {
                            throw th;
                        }
                        zVar.b();
                        throw th;
                    }
                }
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        switch (this.f82a) {
            case 0:
                return ((s1.j) this.f83b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f83b).getClass();
                return true;
        }
    }

    public C0259a(Resources resources, s1.j jVar) {
        this.f82a = 0;
        this.f84c = resources;
        this.f83b = jVar;
    }
}
