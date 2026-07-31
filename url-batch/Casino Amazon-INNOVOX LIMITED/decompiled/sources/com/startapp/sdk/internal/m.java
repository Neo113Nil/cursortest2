package com.startapp.sdk.internal;

import java.util.Iterator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f326a;

    public m(p pVar) {
        this.f326a = pVar;
    }

    public final void a(q2 q2Var) {
        synchronized (this.f326a.f371a) {
            Iterator it = this.f326a.f371a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next() == q2Var) {
                    it.remove();
                    break;
                }
            }
        }
    }
}
