package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.x;

/* loaded from: classes.dex */
public final class h extends ag {

    /* renamed from: a, reason: collision with root package name */
    private final String f15223a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15224b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15225c;

    public h(String str, long j9, com.anythink.core.common.n.c.e eVar) {
        this.f15223a = str;
        this.f15224b = j9;
        this.f15225c = eVar;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final x a() {
        String str = this.f15223a;
        if (str != null) {
            return x.b(str);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final long b() {
        return this.f15224b;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final com.anythink.core.common.n.c.e c() {
        return this.f15225c;
    }
}
