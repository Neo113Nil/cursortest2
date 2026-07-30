package com.baidu.ar;

import java.util.List;

/* loaded from: classes.dex */
public final class aa extends d8 {

    /* renamed from: e, reason: collision with root package name */
    public long f1635e;

    public aa(x3 x3Var, int i8, h6 h6Var, boolean z7) {
        super(x3Var, i8, h6Var, z7);
        this.f1635e = 0L;
    }

    @Override // com.baidu.ar.d8
    public List<List<t3>> a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1635e < 1000) {
            return null;
        }
        this.f1635e = currentTimeMillis;
        List<List<t3>> a8 = super.a();
        return a8.size() > 1 ? a8.subList(0, 1) : a8;
    }
}
