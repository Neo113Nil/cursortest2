package a6;

import a1.n;
import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f302a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f304c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f305d;

    /* renamed from: e, reason: collision with root package name */
    public Object f306e;

    public g(Context context, n nVar) {
        this.f302a = nVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f303b = applicationContext;
        this.f304c = new Object();
        this.f305d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(z5.b bVar) {
        bVar.getClass();
        synchronized (this.f304c) {
            if (this.f305d.remove(bVar) && this.f305d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f304c) {
            Object obj2 = this.f306e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f306e = obj;
                ((f6.b) this.f302a.f42r).execute(new f(0, CollectionsKt.Q(this.f305d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
