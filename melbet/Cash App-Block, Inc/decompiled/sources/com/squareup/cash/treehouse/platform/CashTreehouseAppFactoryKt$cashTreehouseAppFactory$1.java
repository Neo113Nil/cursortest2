package com.squareup.cash.treehouse.platform;

import androidx.emoji2.text.MetadataRepo;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 implements FunctionAdapter {
    public static final CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 INSTANCE = new CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1();

    public final boolean equals(Object obj) {
        if (obj instanceof CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(3, MetadataRepo.class, "<init>", "<init>(Lkotlinx/coroutines/CoroutineScope;Lapp/cash/redwood/treehouse/TreehouseApp;Lcom/squareup/cash/treehouse/platform/PlatformServiceFactory;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
