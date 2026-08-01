package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f665i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f666a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o.f f667b = new o.f();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f668c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f669d;

    /* renamed from: e, reason: collision with root package name */
    public int f670e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f671f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final z f672h;

    public b0() {
        Object obj = f665i;
        this.f669d = obj;
        this.f672h = new z(this);
        this.f668c = obj;
        this.f670e = -1;
    }

    public final void a(a0 a0Var) {
        a0Var.getClass();
    }

    public final void b(Object obj) {
        n.b.Q().f6634a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            kotlin.collections.i0.l(n0.l.g("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.f670e++;
        this.f668c = obj;
        if (this.f671f) {
            this.g = true;
            return;
        }
        this.f671f = true;
        do {
            this.g = false;
            o.f fVar = this.f667b;
            fVar.getClass();
            o.d dVar = new o.d(fVar);
            fVar.f7308i.put(dVar, Boolean.FALSE);
            while (dVar.hasNext()) {
                a((a0) ((Map.Entry) dVar.next()).getValue());
                if (this.g) {
                    break;
                }
            }
        } while (this.g);
        this.f671f = false;
    }
}
