package w;

import A.n;
import a.AbstractC0219a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C0459s;
import q.C0586f;
import q.C0591k;
import u0.C0673c;
import v.C0698c;
import v.C0700e;
import v.InterfaceC0697b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0219a f6131a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0586f f6132b;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f6131a = new i();
        } else if (i7 >= 28) {
            f6131a = new h();
        } else if (i7 >= 26) {
            f6131a = new g();
        } else {
            Method method = f.f6140g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f6131a = new f();
            } else {
                f6131a = new e();
            }
        }
        f6132b = new C0586f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r3) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC0697b interfaceC0697b, Resources resources, int i7, String str, int i8, int i9, C0459s c0459s) {
        Typeface g7;
        Typeface typeface;
        Typeface typeface2;
        int i10 = 12;
        if (interfaceC0697b instanceof C0700e) {
            C0700e c0700e = (C0700e) interfaceC0697b;
            String str2 = c0700e.f6051d;
            g7 = null;
            int i11 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new G4.c(c0459s, i10, typeface));
                return typeface;
            }
            int i12 = 1;
            boolean z5 = c0700e.f6050c == 0;
            int i13 = c0700e.f6049b;
            Handler handler = new Handler(Looper.getMainLooper());
            a6.d dVar = new a6.d();
            dVar.f3172f = c0459s;
            A.e eVar = c0700e.f6048a;
            C0673c c0673c = new C0673c(dVar, handler);
            if (z5) {
                C0586f c0586f = A.i.f21a;
                String str3 = ((String) eVar.f10j) + "-" + i9;
                typeface2 = (Typeface) A.i.f21a.a(str3);
                if (typeface2 != null) {
                    handler.post(new A.a(dVar, i11, typeface2));
                } else if (i13 == -1) {
                    A.h a7 = A.i.a(str3, context, eVar, i9);
                    c0673c.i(a7);
                    g7 = a7.f19a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    A.h hVar = (A.h) A.i.f22b.submit(new A.f(str3, context, eVar, i9, 0)).get(i13, TimeUnit.MILLISECONDS);
                                    c0673c.i(hVar);
                                    g7 = hVar.f19a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e7) {
                            throw new RuntimeException(e7);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0673c.f5969g).post(new A.b((a6.d) c0673c.f5968f, -3));
                    }
                }
            } else {
                C0586f c0586f2 = A.i.f21a;
                String str4 = ((String) eVar.f10j) + "-" + i9;
                typeface2 = (Typeface) A.i.f21a.a(str4);
                if (typeface2 != null) {
                    handler.post(new A.a(dVar, i11, typeface2));
                } else {
                    A.g gVar = new A.g(i11, c0673c);
                    synchronized (A.i.f23c) {
                        try {
                            C0591k c0591k = A.i.f24d;
                            ArrayList arrayList = (ArrayList) c0591k.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                c0591k.put(str4, arrayList2);
                                A.f fVar = new A.f(str4, context, eVar, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = A.i.f22b;
                                A.g gVar2 = new A.g(i12, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n(i11);
                                nVar.f36g = fVar;
                                nVar.f37h = gVar2;
                                nVar.f38i = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            g7 = typeface2;
        } else {
            g7 = f6131a.g(context, (C0698c) interfaceC0697b, resources, i9);
            if (g7 != null) {
                new Handler(Looper.getMainLooper()).post(new G4.c(c0459s, i10, g7));
            } else {
                c0459s.a();
            }
        }
        if (g7 != null) {
            f6132b.b(b(resources, i7, str, i8, i9), g7);
        }
        return g7;
    }

    public static String b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
