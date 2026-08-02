package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.ui.network.JsonObjectAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes9.dex */
public final class UiModule_ProvideViewBindingsFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                Set of = SetsKt__SetsJVMKt.setOf(UiScreenRunner.Companion);
                Preconditions.checkNotNullFromProvides(of);
                return of;
            default:
                Set of2 = SetsKt__SetsJVMKt.setOf(JsonObjectAdapter.INSTANCE);
                Preconditions.checkNotNullFromProvides(of2);
                return of2;
        }
    }
}
