package com.tapjoy.internal;

import java.lang.ref.WeakReference;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes2.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f7876a;

    public final Object a() {
        WeakReference weakReference = this.f7876a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void a(Object obj) {
        this.f7876a = new WeakReference(obj);
    }
}
