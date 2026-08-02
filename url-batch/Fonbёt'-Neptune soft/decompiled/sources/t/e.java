package t;

import D0.O;
import D0.RunnableC0061v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import h0.n;
import j.C0243t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.C0271d;
import n.C0276i;
import s.C0295f;
import s.C0297h;
import s.InterfaceC0294e;
import x.AbstractC0328g;
import x.C0326e;
import x.C0327f;
import x.CallableC0325d;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final i1.a f3443a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0271d f3444b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3443a = new j();
        } else if (i2 >= 28) {
            f3443a = new i();
        } else if (i2 >= 26) {
            f3443a = new h();
        } else {
            if (i2 >= 24) {
                Method method = g.f3452k;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f3443a = new g();
                }
            }
            f3443a = new f();
        }
        f3444b = new C0271d(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC0294e interfaceC0294e, Resources resources, int i2, String str, int i3, int i4, C0243t c0243t) {
        Typeface c2;
        Typeface typeface;
        Typeface typeface2;
        int i5 = 3;
        int i6 = 1;
        int i7 = 4;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC0294e instanceof C0297h) {
            C0297h c0297h = (C0297h) interfaceC0294e;
            String str2 = c0297h.f3415d;
            c2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0061v(i7, c0243t, typeface));
                return typeface;
            }
            boolean z3 = c0297h.f3414c == 0;
            int i8 = c0297h.f3413b;
            Handler handler = new Handler(Looper.getMainLooper());
            n0.d dVar = new n0.d(i7);
            dVar.f3284f = c0243t;
            O o2 = c0297h.f3412a;
            P.O o3 = new P.O(25, dVar, handler);
            if (z3) {
                C0271d c0271d = AbstractC0328g.f3579a;
                String str3 = ((String) o2.f264f) + "-" + i4;
                typeface2 = (Typeface) AbstractC0328g.f3579a.a(str3);
                if (typeface2 != null) {
                    handler.post(new d1.i(dVar, typeface2, i5, z2));
                } else if (i8 == -1) {
                    C0327f a2 = AbstractC0328g.a(str3, context, o2, i4);
                    o3.n(a2);
                    c2 = a2.f3577a;
                } else {
                    try {
                        try {
                            C0327f c0327f = (C0327f) AbstractC0328g.f3580b.submit(new CallableC0325d(str3, context, o2, i4, 0)).get(i8, TimeUnit.MILLISECONDS);
                            o3.n(c0327f);
                            c2 = c0327f.f3577a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) o3.f876g).post(new F.b((n0.d) o3.f875f, -3));
                    }
                }
            } else {
                C0271d c0271d2 = AbstractC0328g.f3579a;
                String str4 = ((String) o2.f264f) + "-" + i4;
                typeface2 = (Typeface) AbstractC0328g.f3579a.a(str4);
                if (typeface2 != null) {
                    handler.post(new d1.i(dVar, typeface2, i5, objArr2 == true ? 1 : 0));
                } else {
                    C0326e c0326e = new C0326e(objArr == true ? 1 : 0, o3);
                    synchronized (AbstractC0328g.f3581c) {
                        try {
                            C0276i c0276i = AbstractC0328g.f3582d;
                            ArrayList arrayList = (ArrayList) c0276i.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(c0326e);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c0326e);
                                c0276i.put(str4, arrayList2);
                                CallableC0325d callableC0325d = new CallableC0325d(str4, context, o2, i4, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0328g.f3580b;
                                C0326e c0326e2 = new C0326e(i6, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f2337f = callableC0325d;
                                nVar.f2338g = c0326e2;
                                nVar.f2339h = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            c2 = typeface2;
        } else {
            c2 = f3443a.c(context, (C0295f) interfaceC0294e, resources, i4);
            if (c2 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0061v(i7, c0243t, c2));
            } else {
                c0243t.a();
            }
        }
        if (c2 != null) {
            f3444b.b(b(resources, i2, str, i3, i4), c2);
        }
        return c2;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
