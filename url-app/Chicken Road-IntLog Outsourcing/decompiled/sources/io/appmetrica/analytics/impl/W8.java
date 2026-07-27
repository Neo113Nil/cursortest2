package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class W8 {

    /* renamed from: a, reason: collision with root package name */
    public final U8 f7664a;

    /* renamed from: b, reason: collision with root package name */
    public final V8 f7665b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f7666c;

    public W8(Context context, X4 x42) {
        this(new V8(), new U8(), C0662g7.a(context).a(x42));
    }

    public W8(V8 v8, U8 u8, IBinaryDataHelper iBinaryDataHelper) {
        this.f7665b = v8;
        this.f7664a = u8;
        this.f7666c = iBinaryDataHelper;
    }
}
