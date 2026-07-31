package io.flutter.plugins.googlemobileads;

import android.content.Context;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    final r2.h f17541a;

    /* renamed from: b, reason: collision with root package name */
    final int f17542b;

    /* renamed from: c, reason: collision with root package name */
    final int f17543c;

    static class a {
        a() {
        }

        r2.h a(Context context, int i7) {
            return r2.h.a(context, i7);
        }

        r2.h b(Context context, int i7) {
            return r2.h.b(context, i7);
        }

        r2.h c(int i7, int i8) {
            return r2.h.e(i7, i8);
        }

        r2.h d(Context context, int i7) {
            return r2.h.f(context, i7);
        }

        r2.h e(Context context, int i7) {
            return r2.h.g(context, i7);
        }

        r2.h f(Context context, int i7) {
            return r2.h.h(context, i7);
        }

        r2.h g(Context context, int i7) {
            return r2.h.i(context, i7);
        }
    }

    static class b extends m {

        /* renamed from: d, reason: collision with root package name */
        final String f17544d;

        b(Context context, a aVar, String str, int i7) {
            super(b(context, aVar, str, i7));
            this.f17544d = str;
        }

        private static r2.h b(Context context, a aVar, String str, int i7) {
            if (str == null) {
                return aVar.a(context, i7);
            }
            if (str.equals("portrait")) {
                return aVar.f(context, i7);
            }
            if (str.equals("landscape")) {
                return aVar.d(context, i7);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    static class c extends m {
        c() {
            super(r2.h.f21149p);
        }
    }

    static class d extends m {

        /* renamed from: d, reason: collision with root package name */
        final Integer f17545d;

        /* renamed from: e, reason: collision with root package name */
        final Integer f17546e;

        d(a aVar, Context context, int i7, Integer num, Integer num2) {
            super(b(aVar, context, i7, num, num2));
            this.f17545d = num;
            this.f17546e = num2;
        }

        private static r2.h b(a aVar, Context context, int i7, Integer num, Integer num2) {
            return num != null ? num.intValue() == 0 ? aVar.g(context, i7) : aVar.e(context, i7) : num2 != null ? aVar.c(i7, num2.intValue()) : aVar.b(context, i7);
        }
    }

    static class e extends m {
        e() {
            super(r2.h.f21148o);
        }
    }

    m(int i7, int i8) {
        this(new r2.h(i7, i8));
    }

    m(r2.h hVar) {
        this.f17541a = hVar;
        this.f17542b = hVar.j();
        this.f17543c = hVar.c();
    }

    public r2.h a() {
        return this.f17541a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f17542b == mVar.f17542b && this.f17543c == mVar.f17543c;
    }

    public int hashCode() {
        return (this.f17542b * 31) + this.f17543c;
    }
}
