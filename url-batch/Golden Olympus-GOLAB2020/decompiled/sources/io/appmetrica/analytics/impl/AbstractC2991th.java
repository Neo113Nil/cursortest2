package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2991th implements InterfaceC3017uh {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final DataSendingRestrictionController f39863a;

    public AbstractC2991th(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f39863a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3017uh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
