package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.q;
import okio.B;

/* loaded from: classes2.dex */
public abstract class v {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final q.e f21855a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f21856b;

        /* renamed from: c, reason: collision with root package name */
        private final B f21857c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21858d;

        public a(Bitmap bitmap, q.e eVar) {
            this((Bitmap) y.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.f21856b;
        }

        int b() {
            return this.f21858d;
        }

        public q.e c() {
            return this.f21855a;
        }

        public B d() {
            return this.f21857c;
        }

        public a(B b4, q.e eVar) {
            this(null, (B) y.d(b4, "source == null"), eVar, 0);
        }

        a(Bitmap bitmap, B b4, q.e eVar, int i4) {
            if ((bitmap != null) != (b4 != null)) {
                this.f21856b = bitmap;
                this.f21857c = b4;
                this.f21855a = (q.e) y.d(eVar, "loadedFrom == null");
                this.f21858d = i4;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i4, int i5, int i6, int i7, BitmapFactory.Options options, t tVar) {
        int max;
        double floor;
        if (i7 > i5 || i6 > i4) {
            if (i5 == 0) {
                floor = Math.floor(i6 / i4);
            } else if (i4 == 0) {
                floor = Math.floor(i7 / i5);
            } else {
                int floor2 = (int) Math.floor(i7 / i5);
                int floor3 = (int) Math.floor(i6 / i4);
                max = tVar.f21816l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    static void b(int i4, int i5, BitmapFactory.Options options, t tVar) {
        a(i4, i5, options.outWidth, options.outHeight, options, tVar);
    }

    static BitmapFactory.Options d(t tVar) {
        boolean c4 = tVar.c();
        boolean z4 = tVar.f21823s != null;
        if (!c4 && !z4 && !tVar.f21822r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c4;
        boolean z5 = tVar.f21822r;
        options.inInputShareable = z5;
        options.inPurgeable = z5;
        if (z4) {
            options.inPreferredConfig = tVar.f21823s;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(t tVar);

    int e() {
        return 0;
    }

    public abstract a f(t tVar, int i4);

    boolean h(boolean z4, NetworkInfo networkInfo) {
        return false;
    }

    boolean i() {
        return false;
    }
}
