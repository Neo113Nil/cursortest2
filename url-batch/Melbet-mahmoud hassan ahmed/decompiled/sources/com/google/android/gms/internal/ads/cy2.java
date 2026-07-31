package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cy2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3998a;

    /* renamed from: b, reason: collision with root package name */
    private final oo0 f3999b;

    public cy2(Executor executor, oo0 oo0Var) {
        this.f3998a = executor;
        this.f3999b = oo0Var;
    }

    final /* synthetic */ void a(String str) {
        this.f3999b.b(str);
    }

    public final void b(final String str) {
        this.f3998a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.by2
            @Override // java.lang.Runnable
            public final void run() {
                cy2.this.a(str);
            }
        });
    }

    public final void c(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
