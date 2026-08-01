package E;

import D.n;
import J.l;
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
import q.k;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final H1.d f286a;

    /* renamed from: b, reason: collision with root package name */
    public static final q.f f287b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f286a = new j();
        } else if (i >= 28) {
            f286a = new i();
        } else {
            f286a = new h();
        }
        f287b = new q.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, D.f fVar, Resources resources, int i, String str, int i2, int i3, D.b bVar, boolean z2) {
        Typeface s2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        int i5 = 3;
        int i6 = 0;
        int i7 = -3;
        if (fVar instanceof D.i) {
            D.i iVar = (D.i) fVar;
            String str2 = iVar.f180d;
            s2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, 0, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? bVar != null : iVar.f179c != 0;
            int i8 = z2 ? iVar.f178b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1.d dVar = new C1.d(2);
            dVar.f145b = bVar;
            J.d dVar2 = iVar.f177a;
            B1.c cVar = new B1.c(dVar, i5, handler);
            if (z3) {
                q.f fVar2 = J.h.f637a;
                String str3 = ((String) dVar2.e) + "-" + i3;
                typeface2 = (Typeface) J.h.f637a.a(str3);
                if (typeface2 != null) {
                    handler.post(new B.a(dVar, 3, typeface2));
                } else if (i8 == -1) {
                    J.g a2 = J.h.a(str3, context, dVar2, i3);
                    cVar.G(a2);
                    s2 = a2.f635a;
                } else {
                    try {
                        try {
                            J.g gVar = (J.g) J.h.f638b.submit(new J.e(str3, context, dVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                            cVar.G(gVar);
                            s2 = gVar.f635a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) cVar.f69c).post(new J.a((C1.d) cVar.f68b, i7, i6));
                    }
                }
            } else {
                q.f fVar3 = J.h.f637a;
                String str4 = ((String) dVar2.e) + "-" + i3;
                typeface2 = (Typeface) J.h.f637a.a(str4);
                if (typeface2 != null) {
                    handler.post(new B.a(dVar, 3, typeface2));
                } else {
                    J.f fVar4 = new J.f(i6, cVar);
                    synchronized (J.h.f639c) {
                        try {
                            k kVar = J.h.f640d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(fVar4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar4);
                                kVar.put(str4, arrayList2);
                                J.e eVar = new J.e(str4, context, dVar2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = J.h.f638b;
                                J.f fVar5 = new J.f(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                l lVar = new l();
                                lVar.f647b = eVar;
                                lVar.f648c = fVar5;
                                lVar.f649d = handler2;
                                threadPoolExecutor.execute(lVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            s2 = typeface2;
        } else {
            s2 = f286a.s(context, (D.g) fVar, resources, i3);
            if (bVar != null) {
                if (s2 != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, 0, s2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (s2 != null) {
            f287b.b(b(resources, i, str, i2, i3), s2);
        }
        return s2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
