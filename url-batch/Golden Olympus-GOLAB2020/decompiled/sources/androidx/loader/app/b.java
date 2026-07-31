package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f12711c = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1354u f12712a;

    /* renamed from: b, reason: collision with root package name */
    private final c f12713b;

    public static class a extends B implements b.InterfaceC0117b {

        /* renamed from: l, reason: collision with root package name */
        private final int f12714l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f12715m;

        /* renamed from: n, reason: collision with root package name */
        private final androidx.loader.content.b f12716n;

        /* renamed from: o, reason: collision with root package name */
        private InterfaceC1354u f12717o;

        /* renamed from: p, reason: collision with root package name */
        private C0115b f12718p;

        /* renamed from: q, reason: collision with root package name */
        private androidx.loader.content.b f12719q;

        a(int i4, Bundle bundle, androidx.loader.content.b bVar, androidx.loader.content.b bVar2) {
            this.f12714l = i4;
            this.f12715m = bundle;
            this.f12716n = bVar;
            this.f12719q = bVar2;
            bVar.registerListener(i4, this);
        }

        @Override // androidx.loader.content.b.InterfaceC0117b
        public void a(androidx.loader.content.b bVar, Object obj) {
            if (b.f12711c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(obj);
                return;
            }
            if (b.f12711c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(obj);
        }

        @Override // androidx.lifecycle.AbstractC1358y
        protected void k() {
            if (b.f12711c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f12716n.startLoading();
        }

        @Override // androidx.lifecycle.AbstractC1358y
        protected void l() {
            if (b.f12711c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f12716n.stopLoading();
        }

        @Override // androidx.lifecycle.AbstractC1358y
        public void n(C c4) {
            super.n(c4);
            this.f12717o = null;
            this.f12718p = null;
        }

        @Override // androidx.lifecycle.B, androidx.lifecycle.AbstractC1358y
        public void o(Object obj) {
            super.o(obj);
            androidx.loader.content.b bVar = this.f12719q;
            if (bVar != null) {
                bVar.reset();
                this.f12719q = null;
            }
        }

        androidx.loader.content.b p(boolean z4) {
            if (b.f12711c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f12716n.cancelLoad();
            this.f12716n.abandon();
            C0115b c0115b = this.f12718p;
            if (c0115b != null) {
                n(c0115b);
                if (z4) {
                    c0115b.c();
                }
            }
            this.f12716n.unregisterListener(this);
            if ((c0115b == null || c0115b.b()) && !z4) {
                return this.f12716n;
            }
            this.f12716n.reset();
            return this.f12719q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f12714l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f12715m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f12716n);
            this.f12716n.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f12718p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f12718p);
                this.f12718p.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        androidx.loader.content.b r() {
            return this.f12716n;
        }

        void s() {
            InterfaceC1354u interfaceC1354u = this.f12717o;
            C0115b c0115b = this.f12718p;
            if (interfaceC1354u == null || c0115b == null) {
                return;
            }
            super.n(c0115b);
            i(interfaceC1354u, c0115b);
        }

        androidx.loader.content.b t(InterfaceC1354u interfaceC1354u, a.InterfaceC0114a interfaceC0114a) {
            C0115b c0115b = new C0115b(this.f12716n, interfaceC0114a);
            i(interfaceC1354u, c0115b);
            C c4 = this.f12718p;
            if (c4 != null) {
                n(c4);
            }
            this.f12717o = interfaceC1354u;
            this.f12718p = c0115b;
            return this.f12716n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f12714l);
            sb.append(" : ");
            A.b.a(this.f12716n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0115b implements C {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.loader.content.b f12720a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0114a f12721b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12722c = false;

        C0115b(androidx.loader.content.b bVar, a.InterfaceC0114a interfaceC0114a) {
            this.f12720a = bVar;
            this.f12721b = interfaceC0114a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f12722c);
        }

        boolean b() {
            return this.f12722c;
        }

        void c() {
            if (this.f12722c) {
                if (b.f12711c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f12720a);
                }
                this.f12721b.onLoaderReset(this.f12720a);
            }
        }

        @Override // androidx.lifecycle.C
        public void d(Object obj) {
            if (b.f12711c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f12720a + ": " + this.f12720a.dataToString(obj));
            }
            this.f12721b.onLoadFinished(this.f12720a, obj);
            this.f12722c = true;
        }

        public String toString() {
            return this.f12721b.toString();
        }
    }

    static class c extends V {

        /* renamed from: r, reason: collision with root package name */
        private static final Y.b f12723r = new a();

        /* renamed from: p, reason: collision with root package name */
        private h f12724p = new h();

        /* renamed from: q, reason: collision with root package name */
        private boolean f12725q = false;

        static class a implements Y.b {
            a() {
            }

            @Override // androidx.lifecycle.Y.b
            public V create(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c e(b0 b0Var) {
            return (c) new Y(b0Var, f12723r).a(c.class);
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f12724p.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i4 = 0; i4 < this.f12724p.o(); i4++) {
                    a aVar = (a) this.f12724p.p(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f12724p.m(i4));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void d() {
            this.f12725q = false;
        }

        a f(int i4) {
            return (a) this.f12724p.j(i4);
        }

        boolean g() {
            return this.f12725q;
        }

        void h() {
            int o4 = this.f12724p.o();
            for (int i4 = 0; i4 < o4; i4++) {
                ((a) this.f12724p.p(i4)).s();
            }
        }

        void i(int i4, a aVar) {
            this.f12724p.n(i4, aVar);
        }

        void j() {
            this.f12725q = true;
        }

        @Override // androidx.lifecycle.V
        protected void onCleared() {
            super.onCleared();
            int o4 = this.f12724p.o();
            for (int i4 = 0; i4 < o4; i4++) {
                ((a) this.f12724p.p(i4)).p(true);
            }
            this.f12724p.e();
        }
    }

    b(InterfaceC1354u interfaceC1354u, b0 b0Var) {
        this.f12712a = interfaceC1354u;
        this.f12713b = c.e(b0Var);
    }

    private androidx.loader.content.b e(int i4, Bundle bundle, a.InterfaceC0114a interfaceC0114a, androidx.loader.content.b bVar) {
        try {
            this.f12713b.j();
            androidx.loader.content.b onCreateLoader = interfaceC0114a.onCreateLoader(i4, bundle);
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
            }
            a aVar = new a(i4, bundle, onCreateLoader, bVar);
            if (f12711c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f12713b.i(i4, aVar);
            this.f12713b.d();
            return aVar.t(this.f12712a, interfaceC0114a);
        } catch (Throwable th) {
            this.f12713b.d();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f12713b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public androidx.loader.content.b c(int i4, Bundle bundle, a.InterfaceC0114a interfaceC0114a) {
        if (this.f12713b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a f4 = this.f12713b.f(i4);
        if (f12711c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (f4 == null) {
            return e(i4, bundle, interfaceC0114a, null);
        }
        if (f12711c) {
            Log.v("LoaderManager", "  Re-using existing loader " + f4);
        }
        return f4.t(this.f12712a, interfaceC0114a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f12713b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        A.b.a(this.f12712a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
