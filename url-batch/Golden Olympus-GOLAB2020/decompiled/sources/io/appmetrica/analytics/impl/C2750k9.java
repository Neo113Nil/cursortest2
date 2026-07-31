package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2750k9 {

    /* renamed from: a, reason: collision with root package name */
    public final C2699i9 f39330a;

    /* renamed from: b, reason: collision with root package name */
    public final C2724j9 f39331b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f39332c;

    public C2750k9(Context context, C2772l5 c2772l5) {
        this(new C2724j9(), new C2699i9(), C3007u7.a(context).a(c2772l5));
    }

    public C2750k9(C2724j9 c2724j9, C2699i9 c2699i9, IBinaryDataHelper iBinaryDataHelper) {
        this.f39331b = c2724j9;
        this.f39330a = c2699i9;
        this.f39332c = iBinaryDataHelper;
    }
}
