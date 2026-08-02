package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class T2 implements IBinaryDataHelper {

    /* renamed from: a, reason: collision with root package name */
    public final IBinaryDataHelper f10973a;

    public T2(IBinaryDataHelper iBinaryDataHelper) {
        this.f10973a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f10973a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f10973a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f10973a.remove(str);
    }
}
