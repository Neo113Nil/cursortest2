package C;

import B.o;
import H.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final u1.l f151a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.f f152b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f151a = new l();
        } else if (i >= 28) {
            f151a = new k();
        } else {
            f151a = new j();
        }
        f152b = new o.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, B.f fVar, Resources resources, int i, String str, int i2, int i3, B.b bVar, boolean z2) {
        Typeface n2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        int i5 = 0;
        int i6 = -3;
        if (fVar instanceof B.i) {
            B.i iVar = (B.i) fVar;
            String str2 = iVar.d;
            n2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? bVar != null : iVar.f51c != 0;
            int i7 = z2 ? iVar.f50b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            h hVar = new h(0);
            hVar.f150b = bVar;
            H.e eVar = iVar.f49a;
            B.j jVar = new B.j(hVar, 2, handler);
            if (z3) {
                o.f fVar2 = H.i.f286a;
                String str3 = ((String) eVar.f276e) + "-" + i3;
                typeface2 = (Typeface) H.i.f286a.a(str3);
                if (typeface2 != null) {
                    handler.post(new H.a(hVar, 0, typeface2));
                } else if (i7 == -1) {
                    H.h a2 = H.i.a(str3, context, eVar, i3);
                    jVar.E(a2);
                    n2 = a2.f284a;
                } else {
                    try {
                        try {
                            try {
                                H.h hVar2 = (H.h) H.i.f287b.submit(new H.f(str3, context, eVar, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                jVar.E(hVar2);
                                n2 = hVar2.f284a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f54c).post(new H.b((h) jVar.f53b, i6, i5));
                    }
                }
            } else {
                o.f fVar3 = H.i.f286a;
                String str4 = ((String) eVar.f276e) + "-" + i3;
                typeface2 = (Typeface) H.i.f286a.a(str4);
                if (typeface2 != null) {
                    handler.post(new H.a(hVar, 0, typeface2));
                } else {
                    H.g gVar = new H.g(i5, jVar);
                    synchronized (H.i.f288c) {
                        try {
                            o.k kVar = H.i.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                kVar.put(str4, arrayList2);
                                H.f fVar4 = new H.f(str4, context, eVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = H.i.f287b;
                                H.g gVar2 = new H.g(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f297b = fVar4;
                                nVar.f298c = gVar2;
                                nVar.d = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            n2 = typeface2;
        } else {
            n2 = f151a.n(context, (B.g) fVar, resources, i3);
            if (bVar != null) {
                if (n2 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, n2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (n2 != null) {
            f152b.b(b(resources, i, str, i2, i3), n2);
        }
        return n2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
