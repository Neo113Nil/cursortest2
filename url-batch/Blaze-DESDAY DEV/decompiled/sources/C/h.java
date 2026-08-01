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
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final z1.d f81a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.f f82b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f81a = new k();
        } else if (i >= 28) {
            f81a = new j();
        } else {
            f81a = new i();
        }
        f82b = new o.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, B.f fVar, Resources resources, int i, String str, int i2, int i3, B.b bVar, boolean z2) {
        Typeface y2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        int i5 = 0;
        int i6 = -3;
        if (fVar instanceof B.i) {
            B.i iVar = (B.i) fVar;
            String str2 = iVar.d;
            y2 = null;
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
            boolean z3 = !z2 ? bVar != null : iVar.f43c != 0;
            int i7 = z2 ? iVar.f42b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            g gVar = new g(0);
            gVar.f80b = bVar;
            H.e eVar = iVar.f41a;
            B.j jVar = new B.j(gVar, 2, handler);
            if (z3) {
                o.f fVar2 = H.i.f289a;
                String str3 = ((String) eVar.f279e) + "-" + i3;
                typeface2 = (Typeface) H.i.f289a.a(str3);
                if (typeface2 != null) {
                    handler.post(new H.a(gVar, 0, typeface2));
                } else if (i7 == -1) {
                    H.h a2 = H.i.a(str3, context, eVar, i3);
                    jVar.F(a2);
                    y2 = a2.f287a;
                } else {
                    try {
                        try {
                            try {
                                H.h hVar = (H.h) H.i.f290b.submit(new H.f(str3, context, eVar, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                jVar.F(hVar);
                                y2 = hVar.f287a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f46c).post(new H.b((g) jVar.f45b, i6, i5));
                    }
                }
            } else {
                o.f fVar3 = H.i.f289a;
                String str4 = ((String) eVar.f279e) + "-" + i3;
                typeface2 = (Typeface) H.i.f289a.a(str4);
                if (typeface2 != null) {
                    handler.post(new H.a(gVar, 0, typeface2));
                } else {
                    H.g gVar2 = new H.g(i5, jVar);
                    synchronized (H.i.f291c) {
                        try {
                            o.k kVar = H.i.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar2);
                                kVar.put(str4, arrayList2);
                                H.f fVar4 = new H.f(str4, context, eVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = H.i.f290b;
                                H.g gVar3 = new H.g(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f300b = fVar4;
                                nVar.f301c = gVar3;
                                nVar.d = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            y2 = typeface2;
        } else {
            y2 = f81a.y(context, (B.g) fVar, resources, i3);
            if (bVar != null) {
                if (y2 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, y2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (y2 != null) {
            f82b.b(b(resources, i, str, i2, i3), y2);
        }
        return y2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
