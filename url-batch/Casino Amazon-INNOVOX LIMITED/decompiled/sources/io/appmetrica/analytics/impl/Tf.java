package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Tf implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        Integer num = (Integer) obj;
        return (num == null || num.intValue() > 0) ? new ro(this, true, "") : new ro(this, false, "Invalid quantity value " + num);
    }
}
