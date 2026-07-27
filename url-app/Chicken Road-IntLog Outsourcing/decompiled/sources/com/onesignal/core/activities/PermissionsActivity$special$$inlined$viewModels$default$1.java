package com.onesignal.core.activities;

import androidx.activity.l;
import androidx.lifecycle.W;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class PermissionsActivity$special$$inlined$viewModels$default$1 extends j implements InterfaceC1430a {
    final /* synthetic */ l $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsActivity$special$$inlined$viewModels$default$1(l lVar) {
        super(0);
        this.$this_viewModels = lVar;
    }

    @Override // t4.InterfaceC1430a
    public final W invoke() {
        W defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        i.d(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
