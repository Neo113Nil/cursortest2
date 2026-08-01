package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* loaded from: classes.dex */
class k extends c {
    k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(i, aVar);
        if (i == 0) {
            Header a2 = Header.a(this.b);
            a2.c();
            a.a(a2);
            s.a(a, a2, this.a);
        } else if (i == 1) {
            Header i2 = a.i();
            i2.d();
            i2.e();
        } else if (i == 2) {
            Header.a(a.i());
            try {
                a.i().f().put("launch_did", com.apm.insight.i.a.a(this.b));
            } catch (Throwable unused) {
            }
        } else if (i == 5) {
            Header.b(a.i());
        }
        return a;
    }
}
