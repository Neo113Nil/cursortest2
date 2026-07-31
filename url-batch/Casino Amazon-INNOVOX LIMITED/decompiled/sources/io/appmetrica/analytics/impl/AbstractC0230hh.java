package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0230hh implements InterfaceC0255ih {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f1291a;

    public AbstractC0230hh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f1291a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0255ih
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
