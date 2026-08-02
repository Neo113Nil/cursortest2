package com.squareup.cash.wallet.data;

import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.taply.syncvalues.PhysicalTagOrderState;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealCashAppTagManager {
    public final SyncValueReader syncValueReader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CashAppTag.TagLifecycleState.values().length];
            try {
                TextSize.Companion companion = CashAppTag.TagLifecycleState.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextSize.Companion companion2 = CashAppTag.TagLifecycleState.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextSize.Companion companion3 = CashAppTag.TagLifecycleState.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextSize.Companion companion4 = CashAppTag.TagLifecycleState.Companion;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PhysicalTagOrderState.values().length];
            try {
                TransactionType.Companion companion5 = PhysicalTagOrderState.Companion;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TransactionType.Companion companion6 = PhysicalTagOrderState.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TransactionType.Companion companion7 = PhysicalTagOrderState.Companion;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TransactionType.Companion companion8 = PhysicalTagOrderState.Companion;
                iArr2[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TransactionType.Companion companion9 = PhysicalTagOrderState.Companion;
                iArr2[0] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealCashAppTagManager(SyncValueReader syncValueReader) {
        this.syncValueReader = syncValueReader;
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 getAllCashAppTags() {
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$1 = AndroidSyncValueSpecs.CashAppTag;
        SyncValueReader syncValueReader = this.syncValueReader;
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new SquareAccountStore$userFlow$$inlined$map$1(syncValueReader.getAllValues(androidSyncValueSpecs$Access$1), 1), new SquareAccountStore$userFlow$$inlined$map$1(syncValueReader.getAllValues(AndroidSyncValueSpecs.TagThemeDefinitions), 2), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 21), 0);
    }
}
