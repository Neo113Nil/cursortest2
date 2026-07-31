package d0;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f15479a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f15480b = 20;

    public static class a extends j {

        /* renamed from: c, reason: collision with root package name */
        private int f15481c;

        public a(int i7) {
            super(i7);
            this.f15481c = i7;
        }

        @Override // d0.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f15481c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // d0.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f15481c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // d0.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f15481c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // d0.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f15481c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // d0.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f15481c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public j(int i7) {
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            if (f15479a == null) {
                f15479a = new a(3);
            }
            jVar = f15479a;
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            f15479a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i7 = f15480b;
        if (length >= i7) {
            str = str.substring(0, i7);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
