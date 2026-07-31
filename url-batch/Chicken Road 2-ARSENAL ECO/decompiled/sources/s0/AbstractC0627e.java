package s0;

import D0.q;
import android.content.Context;
import java.util.LinkedHashSet;
import l5.AbstractC0506j;
import r0.AbstractC0610b;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0627e {

    /* renamed from: a, reason: collision with root package name */
    public final B0.c f5869a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5870b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5871c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5872d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5873e;

    public AbstractC0627e(Context context, B0.c cVar) {
        this.f5869a = cVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.f5870b = applicationContext;
        this.f5871c = new Object();
        this.f5872d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(AbstractC0610b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        synchronized (this.f5871c) {
            if (this.f5872d.remove(listener) && this.f5872d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f5871c) {
            Object obj2 = this.f5873e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f5873e = obj;
                ((q) this.f5869a.f71g).execute(new G4.c(AbstractC0506j.P(this.f5872d), 11, this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
