package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import l.C0484a;
import m.C0516d;
import m.C0518f;

/* loaded from: classes.dex */
public class A {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f3446i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3447a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C0518f f3448b = new C0518f();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f3449c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f3450d;

    /* renamed from: e, reason: collision with root package name */
    public int f3451e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3452f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3453g;

    /* renamed from: h, reason: collision with root package name */
    public final A.b f3454h;

    public A() {
        Object obj = f3446i;
        this.f3450d = obj;
        this.f3454h = new A.b(12, this);
        this.f3449c = obj;
        this.f3451e = -1;
    }

    public final void a(z zVar) {
        zVar.getClass();
    }

    public final void b(Object obj) {
        C0484a.o0().f5237b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(W4.o.e("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.f3451e++;
        this.f3449c = obj;
        if (this.f3452f) {
            this.f3453g = true;
            return;
        }
        this.f3452f = true;
        do {
            this.f3453g = false;
            C0518f c0518f = this.f3448b;
            c0518f.getClass();
            C0516d c0516d = new C0516d(c0518f);
            c0518f.f5324h.put(c0516d, Boolean.FALSE);
            while (c0516d.hasNext()) {
                a((z) ((Map.Entry) c0516d.next()).getValue());
                if (this.f3453g) {
                    break;
                }
            }
        } while (this.f3453g);
        this.f3452f = false;
    }
}
