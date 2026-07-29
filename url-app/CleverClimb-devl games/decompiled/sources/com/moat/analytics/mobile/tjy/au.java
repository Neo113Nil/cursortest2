package com.moat.analytics.mobile.tjy;

import android.util.Log;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes2.dex */
class au implements ax {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f7239a;

    au(as asVar) {
        this.f7239a = asVar;
    }

    @Override // com.moat.analytics.mobile.tjy.ax
    public void a(ar arVar) {
        ar arVar2;
        Queue queue;
        Queue queue2;
        boolean z;
        arVar2 = as.f7236c;
        if (arVar2 != arVar) {
            queue = as.f7235b;
            synchronized (queue) {
                if (arVar == ar.ON) {
                    z = as.f7237d;
                    if (z) {
                        Log.d("MoatOnOff", "Moat enabled - Version 1.7.10");
                    }
                }
                ar unused = as.f7236c = arVar;
                queue2 = as.f7235b;
                Iterator it = queue2.iterator();
                while (it.hasNext()) {
                    aq aqVar = (aq) it.next();
                    if (arVar == ar.ON) {
                        aqVar.a();
                    } else {
                        aqVar.b();
                    }
                    it.remove();
                }
            }
        }
        this.f7239a.g();
    }
}
