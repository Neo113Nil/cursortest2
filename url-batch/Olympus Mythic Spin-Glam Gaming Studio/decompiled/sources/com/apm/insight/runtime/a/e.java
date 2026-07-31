package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* compiled from: BlockAssembly.java */
/* loaded from: classes11.dex */
public final class e extends c {
    @Override // com.apm.insight.runtime.a.c
    protected final boolean b() {
        return true;
    }

    @Override // com.apm.insight.runtime.a.c
    protected final boolean c() {
        return false;
    }

    e(Context context, b bVar, d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(aVar);
        com.apm.insight.a.a(a, (Header) null, this.a);
        return a;
    }
}
