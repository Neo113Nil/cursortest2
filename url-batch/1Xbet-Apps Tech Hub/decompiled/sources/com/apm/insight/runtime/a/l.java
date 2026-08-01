package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* loaded from: classes.dex */
class l extends c {
    l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
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
        }
        return a;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public int b() {
        return com.apm.insight.nativecrash.b.a();
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected void h(com.apm.insight.entity.a aVar) {
    }
}
