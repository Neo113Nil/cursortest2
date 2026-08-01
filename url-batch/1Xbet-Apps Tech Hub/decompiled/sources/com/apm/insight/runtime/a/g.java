package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

@Deprecated
/* loaded from: classes.dex */
class g extends c {
    g(Context context, b bVar, d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(aVar);
        Header a2 = Header.a(this.b);
        Header.a(a2);
        Header.b(a2);
        a2.c();
        a2.d();
        a2.e();
        a.a(a2);
        return a;
    }
}
