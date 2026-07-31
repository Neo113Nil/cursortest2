package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13967c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f13968d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13969a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final List f13970b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f13968d) {
            try {
                for (Activity activity2 : this.f13970b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f13970b.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f13968d) {
            this.f13970b.remove(activity);
        }
    }

    public void a(boolean z4) {
        this.f13969a.set(z4);
    }

    public AtomicBoolean a() {
        return this.f13969a;
    }
}
