package z;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f46827a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f46828b;

        public a(int i4, b[] bVarArr) {
            this.f46827a = i4;
            this.f46828b = bVarArr;
        }

        static a a(int i4, b[] bVarArr) {
            return new a(i4, bVarArr);
        }

        public b[] b() {
            return this.f46828b;
        }

        public int c() {
            return this.f46827a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f46829a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46830b;

        /* renamed from: c, reason: collision with root package name */
        private final int f46831c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f46832d;

        /* renamed from: e, reason: collision with root package name */
        private final int f46833e;

        public b(Uri uri, int i4, int i5, boolean z4, int i6) {
            this.f46829a = (Uri) A.h.f(uri);
            this.f46830b = i4;
            this.f46831c = i5;
            this.f46832d = z4;
            this.f46833e = i6;
        }

        static b a(Uri uri, int i4, int i5, boolean z4, int i6) {
            return new b(uri, i4, i5, z4, i6);
        }

        public int b() {
            return this.f46833e;
        }

        public int c() {
            return this.f46830b;
        }

        public Uri d() {
            return this.f46829a;
        }

        public int e() {
            return this.f46831c;
        }

        public boolean f() {
            return this.f46832d;
        }
    }

    public static class c {
        public abstract void a(int i4);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.c.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i4, boolean z4, int i5, Handler handler, c cVar) {
        C3539a c3539a = new C3539a(cVar, handler);
        return z4 ? f.e(context, eVar, c3539a, i4, i5) : f.d(context, eVar, i4, null, c3539a);
    }
}
