package b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5583b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5584c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5585d;

    public u(Executor executor, n reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f5582a = executor;
        this.f5583b = new Object();
        this.f5585d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f5583b) {
            try {
                this.f5584c = true;
                Iterator it = this.f5585d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f5585d.clear();
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
