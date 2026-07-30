package d;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4595c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4596d;

    public q(j executor, n reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f4593a = executor;
        this.f4594b = new Object();
        this.f4596d = new ArrayList();
    }
}
