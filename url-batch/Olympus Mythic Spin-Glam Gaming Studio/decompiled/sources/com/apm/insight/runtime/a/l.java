package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;

/* compiled from: NativeCrashAssembly.java */
/* loaded from: classes12.dex */
final class l extends c {
    @Override // com.apm.insight.runtime.a.c
    protected final boolean c() {
        return false;
    }

    l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(i, aVar);
        if (i == 0) {
            Header a2 = Header.a(this.b);
            a2.c();
            a.a(a2);
            com.apm.insight.a.a(a, a2, this.a);
        } else if (i == 1) {
            Header d = a.d();
            d.d();
            d.e();
        } else if (i == 2) {
            Header.a(a.d());
        }
        return a;
    }

    @Override // com.apm.insight.runtime.a.c
    public final int a() {
        return NativeCrashCollector.a();
    }
}
