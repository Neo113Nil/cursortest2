package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.d;
import androidx.core.content.res.f;
import z.g;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final i f11771a;

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.collection.e f11772b;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private f.e f11773a;

        public a(f.e eVar) {
            this.f11773a = eVar;
        }

        @Override // z.g.c
        public void a(int i4) {
            f.e eVar = this.f11773a;
            if (eVar != null) {
                eVar.onFontRetrievalFailed(i4);
            }
        }

        @Override // z.g.c
        public void b(Typeface typeface) {
            f.e eVar = this.f11773a;
            if (eVar != null) {
                eVar.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f11771a = new h();
        } else if (i4 >= 28) {
            f11771a = new g();
        } else if (i4 >= 26) {
            f11771a = new f();
        } else if (e.j()) {
            f11771a = new e();
        } else {
            f11771a = new d();
        }
        f11772b = new androidx.collection.e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        return f11771a.b(context, cancellationSignal, bVarArr, i4);
    }

    public static Typeface c(Context context, d.b bVar, Resources resources, int i4, String str, int i5, int i6, f.e eVar, Handler handler, boolean z4) {
        Typeface a4;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            Typeface g4 = g(eVar2.c());
            if (g4 != null) {
                if (eVar != null) {
                    eVar.callbackSuccessAsync(g4, handler);
                }
                return g4;
            }
            a4 = z.g.c(context, eVar2.b(), i6, !z4 ? eVar != null : eVar2.a() != 0, z4 ? eVar2.d() : -1, f.e.getHandler(handler), new a(eVar));
        } else {
            a4 = f11771a.a(context, (d.c) bVar, resources, i6);
            if (eVar != null) {
                if (a4 != null) {
                    eVar.callbackSuccessAsync(a4, handler);
                } else {
                    eVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (a4 != null) {
            f11772b.put(e(resources, i4, str, i5, i6), a4);
        }
        return a4;
    }

    public static Typeface d(Context context, Resources resources, int i4, String str, int i5, int i6) {
        Typeface d4 = f11771a.d(context, resources, i4, str, i6);
        if (d4 != null) {
            f11772b.put(e(resources, i4, str, i5, i6), d4);
        }
        return d4;
    }

    private static String e(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface f(Resources resources, int i4, String str, int i5, int i6) {
        return (Typeface) f11772b.get(e(resources, i4, str, i5, i6));
    }

    private static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
