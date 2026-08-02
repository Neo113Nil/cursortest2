package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum ScheduledReloadStatus implements WireEnum {
    SCHEDULED_RELOAD_STATUS_UNSPECIFIED(0),
    SCHEDULED_RELOAD_STATUS_PENDING(1),
    SCHEDULED_RELOAD_STATUS_CANCELED(2),
    SCHEDULED_RELOAD_STATUS_COMPLETED(3),
    SCHEDULED_RELOAD_STATUS_FAILED(4),
    SCHEDULED_RELOAD_STATUS_FUNDING(5),
    SCHEDULED_RELOAD_STATUS_EARMARKED(6),
    SCHEDULED_RELOAD_STATUS_DISPATCHED(7),
    SCHEDULED_RELOAD_STATUS_PENDING_SKIP(8),
    SCHEDULED_RELOAD_STATUS_SKIPPED(9);

    public static final ScheduledReloadStatus$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        ScheduledReloadStatus scheduledReloadStatus = SCHEDULED_RELOAD_STATUS_UNSPECIFIED;
        Companion = new TextSize.Companion();
        ADAPTER = new ScheduledReloadStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ScheduledReloadStatus.class), Syntax.PROTO_2, scheduledReloadStatus);
    }

    ScheduledReloadStatus(int i) {
        this.value = i;
    }

    public static final ScheduledReloadStatus fromValue(int i) {
        Companion.getClass();
        return TextSize.Companion.m3920fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
