package com.stripe.android.financialconnections.features.generic;

import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GenericScreenState {
    public final boolean inModal;
    public final FinancialConnectionsGenericInfoScreen screen;

    public GenericScreenState(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, boolean z) {
        financialConnectionsGenericInfoScreen.getClass();
        this.screen = financialConnectionsGenericInfoScreen;
        this.inModal = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericScreenState)) {
            return false;
        }
        GenericScreenState genericScreenState = (GenericScreenState) obj;
        return Intrinsics.areEqual(this.screen, genericScreenState.screen) && this.inModal == genericScreenState.inModal;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.inModal) + (this.screen.hashCode() * 31);
    }

    public final String toString() {
        return "GenericScreenState(screen=" + this.screen + ", inModal=" + this.inModal + ")";
    }
}
