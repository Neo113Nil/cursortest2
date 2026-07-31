package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithIapkitResult.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitResult;", "", "isValid", "", "state", "Lcom/margelo/nitro/iap/IapkitPurchaseState;", "store", "Lcom/margelo/nitro/iap/IapStore;", "<init>", "(ZLcom/margelo/nitro/iap/IapkitPurchaseState;Lcom/margelo/nitro/iap/IapStore;)V", "()Z", "getState", "()Lcom/margelo/nitro/iap/IapkitPurchaseState;", "getStore", "()Lcom/margelo/nitro/iap/IapStore;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithIapkitResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isValid;
    private final IapkitPurchaseState state;
    private final IapStore store;

    public static /* synthetic */ NitroVerifyPurchaseWithIapkitResult copy$default(NitroVerifyPurchaseWithIapkitResult nitroVerifyPurchaseWithIapkitResult, boolean z, IapkitPurchaseState iapkitPurchaseState, IapStore iapStore, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nitroVerifyPurchaseWithIapkitResult.isValid;
        }
        if ((i & 2) != 0) {
            iapkitPurchaseState = nitroVerifyPurchaseWithIapkitResult.state;
        }
        if ((i & 4) != 0) {
            iapStore = nitroVerifyPurchaseWithIapkitResult.store;
        }
        return nitroVerifyPurchaseWithIapkitResult.copy(z, iapkitPurchaseState, iapStore);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithIapkitResult fromCpp(boolean z, IapkitPurchaseState iapkitPurchaseState, IapStore iapStore) {
        return INSTANCE.fromCpp(z, iapkitPurchaseState, iapStore);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component2, reason: from getter */
    public final IapkitPurchaseState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    public final NitroVerifyPurchaseWithIapkitResult copy(boolean isValid, IapkitPurchaseState state, IapStore store) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(store, "store");
        return new NitroVerifyPurchaseWithIapkitResult(isValid, state, store);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroVerifyPurchaseWithIapkitResult)) {
            return false;
        }
        NitroVerifyPurchaseWithIapkitResult nitroVerifyPurchaseWithIapkitResult = (NitroVerifyPurchaseWithIapkitResult) other;
        return this.isValid == nitroVerifyPurchaseWithIapkitResult.isValid && this.state == nitroVerifyPurchaseWithIapkitResult.state && this.store == nitroVerifyPurchaseWithIapkitResult.store;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isValid) * 31) + this.state.hashCode()) * 31) + this.store.hashCode();
    }

    public String toString() {
        return "NitroVerifyPurchaseWithIapkitResult(isValid=" + this.isValid + ", state=" + this.state + ", store=" + this.store + ")";
    }

    public NitroVerifyPurchaseWithIapkitResult(boolean z, IapkitPurchaseState state, IapStore store) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(store, "store");
        this.isValid = z;
        this.state = state;
        this.store = store;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final IapkitPurchaseState getState() {
        return this.state;
    }

    public final IapStore getStore() {
        return this.store;
    }

    /* compiled from: NitroVerifyPurchaseWithIapkitResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitResult$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitResult;", "isValid", "", "state", "Lcom/margelo/nitro/iap/IapkitPurchaseState;", "store", "Lcom/margelo/nitro/iap/IapStore;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithIapkitResult fromCpp(boolean isValid, IapkitPurchaseState state, IapStore store) {
            return new NitroVerifyPurchaseWithIapkitResult(isValid, state, store);
        }
    }
}
