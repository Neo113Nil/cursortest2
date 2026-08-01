package D;

import A1.m;
import C.o;
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
    public static final m f123a;

    /* renamed from: b, reason: collision with root package name */
    public static final p.f f124b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f123a = new k();
        } else if (i >= 28) {
            f123a = new j();
        } else {
            f123a = new i();
        }
        f124b = new p.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, C.f fVar, Resources resources, int i, String str, int i2, int i3, C.b bVar, boolean z2) {
        Typeface n2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        int i5 = 0;
        int i6 = -3;
        if (fVar instanceof C.i) {
            C.i iVar = (C.i) fVar;
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
            boolean z3 = !z2 ? bVar != null : iVar.f84c != 0;
            int i7 = z2 ? iVar.f83b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            g gVar = new g(0);
            gVar.f122b = bVar;
            I.d dVar = iVar.f82a;
            C.j jVar = new C.j(gVar, 2, handler);
            if (z3) {
                p.f fVar2 = I.h.f332a;
                String str3 = ((String) dVar.f322e) + "-" + i3;
                typeface2 = (Typeface) I.h.f332a.a(str3);
                if (typeface2 != null) {
                    handler.post(new A.b(gVar, 3, typeface2));
                } else if (i7 == -1) {
                    I.g a2 = I.h.a(str3, context, dVar, i3);
                    jVar.D(a2);
                    n2 = a2.f330a;
                } else {
                    try {
                        try {
                            I.g gVar2 = (I.g) I.h.f333b.submit(new I.e(str3, context, dVar, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                            jVar.D(gVar2);
                            n2 = gVar2.f330a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f87c).post(new I.a((g) jVar.f86b, i6, i5));
                    }
                }
            } else {
                p.f fVar3 = I.h.f332a;
                String str4 = ((String) dVar.f322e) + "-" + i3;
                typeface2 = (Typeface) I.h.f332a.a(str4);
                if (typeface2 != null) {
                    handler.post(new A.b(gVar, 3, typeface2));
                } else {
                    I.f fVar4 = new I.f(i5, jVar);
                    synchronized (I.h.f334c) {
                        try {
                            p.k kVar = I.h.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(fVar4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar4);
                                kVar.put(str4, arrayList2);
                                I.e eVar = new I.e(str4, context, dVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = I.h.f333b;
                                I.f fVar5 = new I.f(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                I.m mVar = new I.m();
                                mVar.f343b = eVar;
                                mVar.f344c = fVar5;
                                mVar.d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            n2 = typeface2;
        } else {
            n2 = f123a.n(context, (C.g) fVar, resources, i3);
            if (bVar != null) {
                if (n2 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, n2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (n2 != null) {
            f124b.b(b(resources, i, str, i2, i3), n2);
        }
        return n2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
