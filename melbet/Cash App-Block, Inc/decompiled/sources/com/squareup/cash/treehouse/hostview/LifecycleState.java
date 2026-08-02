package com.squareup.cash.treehouse.hostview;

import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes7.dex */
public final class LifecycleState {
    public static final /* synthetic */ LifecycleState[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final LifecycleState APPEARED;
    public static final LifecycleState CREATED;
    public static final Companion Companion;
    public static final LifecycleState DESTROYED;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/hostview/LifecycleState$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/hostview/LifecycleState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) LifecycleState.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        LifecycleState lifecycleState = new LifecycleState("CREATED", 0);
        CREATED = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("APPEARED", 1);
        APPEARED = lifecycleState2;
        LifecycleState lifecycleState3 = new LifecycleState("DISAPPEARED", 2);
        LifecycleState lifecycleState4 = new LifecycleState("DESTROYED", 3);
        DESTROYED = lifecycleState4;
        $VALUES = new LifecycleState[]{lifecycleState, lifecycleState2, lifecycleState3, lifecycleState4};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(3));
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}
