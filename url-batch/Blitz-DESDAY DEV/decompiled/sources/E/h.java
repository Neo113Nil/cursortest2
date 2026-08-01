package E;

import D.o;
import J.m;
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
    public static final z1.d f171a;

    /* renamed from: b, reason: collision with root package name */
    public static final q.f f172b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f171a = new k();
        } else if (i >= 28) {
            f171a = new j();
        } else {
            f171a = new i();
        }
        f172b = new q.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, D.f fVar, Resources resources, int i, String str, int i2, int i3, D.b bVar, boolean z2) {
        Typeface k2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        int i5 = 0;
        int i6 = -3;
        if (fVar instanceof D.i) {
            D.i iVar = (D.i) fVar;
            String str2 = iVar.d;
            k2 = null;
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
            boolean z3 = !z2 ? bVar != null : iVar.f131c != 0;
            int i7 = z2 ? iVar.f130b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            g gVar = new g(0);
            gVar.f170b = bVar;
            J.d dVar = iVar.f129a;
            D.j jVar = new D.j(gVar, 2, handler);
            if (z3) {
                q.f fVar2 = J.h.f370a;
                String str3 = ((String) dVar.f360e) + "-" + i3;
                typeface2 = (Typeface) J.h.f370a.a(str3);
                if (typeface2 != null) {
                    handler.post(new B.b(gVar, 3, typeface2));
                } else if (i7 == -1) {
                    J.g a2 = J.h.a(str3, context, dVar, i3);
                    jVar.D(a2);
                    k2 = a2.f368a;
                } else {
                    try {
                        try {
                            J.g gVar2 = (J.g) J.h.f371b.submit(new J.e(str3, context, dVar, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                            jVar.D(gVar2);
                            k2 = gVar2.f368a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f134c).post(new J.a((g) jVar.f133b, i6, i5));
                    }
                }
            } else {
                q.f fVar3 = J.h.f370a;
                String str4 = ((String) dVar.f360e) + "-" + i3;
                typeface2 = (Typeface) J.h.f370a.a(str4);
                if (typeface2 != null) {
                    handler.post(new B.b(gVar, 3, typeface2));
                } else {
                    J.f fVar4 = new J.f(i5, jVar);
                    synchronized (J.h.f372c) {
                        try {
                            q.k kVar = J.h.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(fVar4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar4);
                                kVar.put(str4, arrayList2);
                                J.e eVar = new J.e(str4, context, dVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = J.h.f371b;
                                J.f fVar5 = new J.f(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.f381b = eVar;
                                mVar.f382c = fVar5;
                                mVar.d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            k2 = typeface2;
        } else {
            k2 = f171a.k(context, (D.g) fVar, resources, i3);
            if (bVar != null) {
                if (k2 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, k2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (k2 != null) {
            f172b.b(b(resources, i, str, i2, i3), k2);
        }
        return k2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
