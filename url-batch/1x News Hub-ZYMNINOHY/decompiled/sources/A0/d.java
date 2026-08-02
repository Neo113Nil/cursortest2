package A0;

import P1.k;
import Y1.C0107d;
import Y1.C0109f;
import Y1.C0111h;
import Y1.C0122t;
import a2.InterfaceC0133a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public final class d implements InterfaceC1239b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20e;

    public d(P1.f binaryMessenger, Context context, C0122t c0122t) {
        j.e(binaryMessenger, "binaryMessenger");
        this.f16a = binaryMessenger;
        this.f17b = new C0107d(new C0.e(27, new C0109f(binaryMessenger)));
        this.f19d = context;
        this.f20e = c0122t;
    }

    public static void b(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public k a() {
        if (((C0111h) this.f18c) == null) {
            this.f18c = new C0111h(this);
        }
        C0111h c0111h = (C0111h) this.f18c;
        j.b(c0111h);
        return c0111h;
    }

    public void c(Runnable runnable) {
        Context context = (Context) this.f19d;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return new c((Executor) ((InterfaceC0133a) this.f16a).get(), (w0.f) ((InterfaceC0133a) this.f17b).get(), (B0.d) ((f) this.f20e).get(), (C0.d) ((InterfaceC0133a) this.f18c).get(), (D0.c) ((InterfaceC0133a) this.f19d).get());
    }

    public d(InterfaceC0133a interfaceC0133a, InterfaceC0133a interfaceC0133a2, f fVar, InterfaceC0133a interfaceC0133a3, InterfaceC0133a interfaceC0133a4) {
        this.f16a = interfaceC0133a;
        this.f17b = interfaceC0133a2;
        this.f20e = fVar;
        this.f18c = interfaceC0133a3;
        this.f19d = interfaceC0133a4;
    }
}
