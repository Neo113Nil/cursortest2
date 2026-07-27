package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0801lh implements InterfaceC0827mh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f8738a;

    public AbstractC0801lh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f8738a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0827mh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
