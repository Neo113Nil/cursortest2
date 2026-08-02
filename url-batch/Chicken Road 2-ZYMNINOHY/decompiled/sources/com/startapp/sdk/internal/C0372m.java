package com.startapp.sdk.internal;

import java.util.Iterator;

/* renamed from: com.startapp.sdk.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7249a;

    public C0372m(p pVar) {
        this.f7249a = pVar;
    }

    public final void a(w2 w2Var) {
        synchronized (this.f7249a.f7411a) {
            try {
                Iterator it = this.f7249a.f7411a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() == w2Var) {
                        it.remove();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
