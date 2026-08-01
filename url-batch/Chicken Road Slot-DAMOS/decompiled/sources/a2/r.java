package a2;

import android.content.Intent;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements w7.a, t8.a, l8.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f143d;

    public /* synthetic */ r(int i3) {
        this.f143d = i3;
    }

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void c(int i3, int i10) {
        StringBuilder sb2 = new StringBuilder(i3);
        sb2.append((Object) "serialized size must be non-negative, was ");
        sb2.append(i10);
        throw new IllegalStateException(sb2.toString());
    }

    public static /* synthetic */ void d(int i3, int i10, Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        sb2.append(i3);
        sb2.append((Object) " parameters found ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void e(int i3, int i10, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i3 + obj + i10);
    }

    public static /* synthetic */ void g(Intent intent) {
        throw new vb.b("unable to resolve intent: " + ((Object) intent.toString()));
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new Exception(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new NullPointerException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i3));
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m() {
        throw new u1();
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void o(String str) {
        throw new v1(str);
    }

    public static /* synthetic */ void p() {
        throw new hd.j();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // l8.e
    public Object b(se seVar) {
        Set e2 = seVar.e(l8.r.a(d9.a.class));
        d9.c cVar = d9.c.f3699i;
        if (cVar == null) {
            synchronized (d9.c.class) {
                try {
                    cVar = d9.c.f3699i;
                    if (cVar == null) {
                        cVar = new d9.c(0);
                        d9.c.f3699i = cVar;
                    }
                } finally {
                }
            }
        }
        return new d9.b(e2, cVar);
    }

    @Override // w7.a
    public Object f(Task task) {
        int i3;
        switch (this.f143d) {
            case 9:
                i3 = 403;
                break;
            default:
                i3 = -1;
                break;
        }
        return Integer.valueOf(i3);
    }
}
