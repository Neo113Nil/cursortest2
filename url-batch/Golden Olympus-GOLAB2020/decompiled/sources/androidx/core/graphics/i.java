package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import z.g;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f11814a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.i.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.i.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    i() {
    }

    private static Object e(Object[] objArr, int i4, b bVar) {
        return f(objArr, (i4 & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, (i4 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i4, boolean z4, b bVar) {
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i4) * 2) + (bVar.b(obj2) == z4 ? 0 : 1);
            if (obj == null || i5 > abs) {
                obj = obj2;
                i5 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, d.c cVar, Resources resources, int i4);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4);

    protected Typeface c(Context context, InputStream inputStream) {
        File e4 = j.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (j.d(e4, inputStream)) {
                return Typeface.createFromFile(e4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i4, String str, int i5) {
        File e4 = j.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (j.c(e4, resources, i4)) {
                return Typeface.createFromFile(e4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i4) {
        return (g.b) e(bVarArr, i4, new a());
    }
}
