package com.tapjoy.internal;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class aq implements an {
    @Nullable
    protected abstract ao a(Object obj, boolean z);

    @Override // com.tapjoy.internal.an
    public final Object a(Object obj) {
        ao a2 = a(obj, false);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    @Override // com.tapjoy.internal.an
    public void a(Object obj, Object obj2) {
        a(obj, true).a(obj2);
    }
}
