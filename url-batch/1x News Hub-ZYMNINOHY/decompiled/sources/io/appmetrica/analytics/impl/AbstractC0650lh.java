package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0650lh implements InterfaceC0676mh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f7830a;

    public AbstractC0650lh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f7830a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0676mh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
