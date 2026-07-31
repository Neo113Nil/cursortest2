package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import h.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f934c = false;

    /* renamed from: a, reason: collision with root package name */
    private final i f935a;

    /* renamed from: b, reason: collision with root package name */
    private final C0016b f936b;

    public static class a<D> extends o<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f937k;

        /* renamed from: l, reason: collision with root package name */
        private final Bundle f938l;

        /* renamed from: m, reason: collision with root package name */
        private final r.a<D> f939m;

        /* renamed from: n, reason: collision with root package name */
        private i f940n;

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f934c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f934c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(p<? super D> pVar) {
            super.g(pVar);
            this.f940n = null;
        }

        @Override // androidx.lifecycle.o, androidx.lifecycle.LiveData
        public void h(D d7) {
            super.h(d7);
        }

        r.a<D> i(boolean z6) {
            if (b.f934c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f937k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f938l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f939m);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void k() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f937k);
            sb.append(" : ");
            q.b.a(this.f939m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0016b extends u {

        /* renamed from: e, reason: collision with root package name */
        private static final v.a f941e = new a();

        /* renamed from: c, reason: collision with root package name */
        private f<a> f942c = new f<>();

        /* renamed from: d, reason: collision with root package name */
        private boolean f943d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements v.a {
            a() {
            }

            @Override // androidx.lifecycle.v.a
            public <T extends u> T a(Class<T> cls) {
                return new C0016b();
            }
        }

        C0016b() {
        }

        static C0016b e(w wVar) {
            return (C0016b) new v(wVar, f941e).a(C0016b.class);
        }

        @Override // androidx.lifecycle.u
        protected void c() {
            super.c();
            int k7 = this.f942c.k();
            for (int i7 = 0; i7 < k7; i7++) {
                this.f942c.l(i7).i(true);
            }
            this.f942c.a();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f942c.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f942c.k(); i7++) {
                    a l7 = this.f942c.l(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f942c.h(i7));
                    printWriter.print(": ");
                    printWriter.println(l7.toString());
                    l7.j(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            int k7 = this.f942c.k();
            for (int i7 = 0; i7 < k7; i7++) {
                this.f942c.l(i7).k();
            }
        }
    }

    b(i iVar, w wVar) {
        this.f935a = iVar;
        this.f936b = C0016b.e(wVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f936b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f936b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        q.b.a(this.f935a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
