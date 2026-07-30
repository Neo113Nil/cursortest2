package com.baidu.ar;

import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;

/* loaded from: classes.dex */
public abstract class e0<InT, OutT> implements s5<InT, OutT> {

    /* renamed from: a, reason: collision with root package name */
    public e0<OutT, ?> f2111a;

    /* renamed from: b, reason: collision with root package name */
    public OutT f2112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2113c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2114d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2115e;

    /* renamed from: f, reason: collision with root package name */
    public int f2116f;

    /* renamed from: g, reason: collision with root package name */
    public String f2117g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2118h;

    public class a implements ICallbackWith<OutT> {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        public void run(OutT outt) {
            e0.this.f2113c = true;
            e0.this.f2112b = outt;
            if (e0.this.f2118h || e0.this.f2111a == null) {
                return;
            }
            e0.this.f2111a.a(outt);
        }
    }

    public class b implements IError {
        public b() {
        }

        @Override // com.baidu.ar.callback.IError
        public void onError(int i8, String str, Exception exc) {
            e0.this.a(i8, str);
        }
    }

    public class c implements IError {
        public c() {
        }

        @Override // com.baidu.ar.callback.IError
        public void onError(int i8, String str, Exception exc) {
            e0.this.b(i8, str);
            if (e0.this.f2118h || e0.this.f2111a == null) {
                return;
            }
            e0.this.f2111a.a(i8, str);
        }
    }

    public abstract void a(InT r12, ICallbackWith<OutT> iCallbackWith, IError iError);

    public abstract void b();

    public final void b(int i8, String str) {
        this.f2115e = true;
        this.f2116f = i8;
        this.f2117g = str;
    }

    @Override // com.baidu.ar.callback.ICancellable
    public void cancel() {
        this.f2118h = true;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> s5<OutT, T> d(e0<OutT, T> e0Var) {
        this.f2111a = e0Var;
        a();
        return e0Var;
    }

    public final void a() {
        e0<OutT, ?> e0Var;
        if (this.f2118h || !this.f2113c || (e0Var = this.f2111a) == null) {
            return;
        }
        if (this.f2115e) {
            e0Var.a(this.f2116f, this.f2117g);
        } else {
            if (this.f2114d) {
                return;
            }
            e0Var.a(this.f2112b);
        }
    }

    public final void a(int i8, String str) {
        this.f2113c = true;
        this.f2114d = true;
        a(i8, str, new c());
    }

    public void a(int i8, String str, IError iError) {
        if (iError != null) {
            iError.onError(i8, str, null);
        }
    }

    public final void a(InT r32) {
        if (this.f2118h) {
            return;
        }
        a((e0<InT, OutT>) r32, new a(), new b());
    }
}
