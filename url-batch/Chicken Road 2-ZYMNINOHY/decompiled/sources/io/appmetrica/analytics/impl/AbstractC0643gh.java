package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0643gh implements InterfaceC0669hh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f11934a;

    public AbstractC0643gh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f11934a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0669hh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
