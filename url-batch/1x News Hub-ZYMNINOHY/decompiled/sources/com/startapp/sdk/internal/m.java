package com.startapp.sdk.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4121a;

    public m(p pVar) {
        this.f4121a = pVar;
    }

    public final void a(w2 w2Var) {
        synchronized (this.f4121a.f4276a) {
            try {
                Iterator it = this.f4121a.f4276a.values().iterator();
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
