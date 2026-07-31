package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.qh;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class j2 implements qh {
    public final String a;

    public j2() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.a = uuid;
    }

    @Override // com.chartboost.sdk.impl.qh
    public String a() {
        return qh.a.a(this);
    }

    @Override // com.chartboost.sdk.impl.qh
    public final String b() {
        return this.a;
    }
}
