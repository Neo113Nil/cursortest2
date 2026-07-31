package dev.hyo.openiap.store;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Ldev/hyo/openiap/store/LoadingStates;", "", "initConnection", "", "fetchProducts", "restorePurchases", "purchasing", "", "", "<init>", "(ZZZLjava/util/Set;)V", "getInitConnection", "()Z", "setInitConnection", "(Z)V", "getFetchProducts", "setFetchProducts", "getRestorePurchases", "setRestorePurchases", "getPurchasing", "()Ljava/util/Set;", "setPurchasing", "(Ljava/util/Set;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LoadingStates {
    public static final int $stable = 8;
    private boolean fetchProducts;
    private boolean initConnection;
    private Set<String> purchasing;
    private boolean restorePurchases;

    public LoadingStates() {
        this(false, false, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingStates copy$default(LoadingStates loadingStates, boolean z, boolean z2, boolean z3, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loadingStates.initConnection;
        }
        if ((i & 2) != 0) {
            z2 = loadingStates.fetchProducts;
        }
        if ((i & 4) != 0) {
            z3 = loadingStates.restorePurchases;
        }
        if ((i & 8) != 0) {
            set = loadingStates.purchasing;
        }
        return loadingStates.copy(z, z2, z3, set);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInitConnection() {
        return this.initConnection;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFetchProducts() {
        return this.fetchProducts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRestorePurchases() {
        return this.restorePurchases;
    }

    public final Set<String> component4() {
        return this.purchasing;
    }

    public final LoadingStates copy(boolean initConnection, boolean fetchProducts, boolean restorePurchases, Set<String> purchasing) {
        Intrinsics.checkNotNullParameter(purchasing, "purchasing");
        return new LoadingStates(initConnection, fetchProducts, restorePurchases, purchasing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingStates)) {
            return false;
        }
        LoadingStates loadingStates = (LoadingStates) other;
        return this.initConnection == loadingStates.initConnection && this.fetchProducts == loadingStates.fetchProducts && this.restorePurchases == loadingStates.restorePurchases && Intrinsics.areEqual(this.purchasing, loadingStates.purchasing);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.initConnection) * 31) + Boolean.hashCode(this.fetchProducts)) * 31) + Boolean.hashCode(this.restorePurchases)) * 31) + this.purchasing.hashCode();
    }

    public String toString() {
        return "LoadingStates(initConnection=" + this.initConnection + ", fetchProducts=" + this.fetchProducts + ", restorePurchases=" + this.restorePurchases + ", purchasing=" + this.purchasing + ")";
    }

    public LoadingStates(boolean z, boolean z2, boolean z3, Set<String> purchasing) {
        Intrinsics.checkNotNullParameter(purchasing, "purchasing");
        this.initConnection = z;
        this.fetchProducts = z2;
        this.restorePurchases = z3;
        this.purchasing = purchasing;
    }

    public final boolean getInitConnection() {
        return this.initConnection;
    }

    public final void setInitConnection(boolean z) {
        this.initConnection = z;
    }

    public final boolean getFetchProducts() {
        return this.fetchProducts;
    }

    public final void setFetchProducts(boolean z) {
        this.fetchProducts = z;
    }

    public final boolean getRestorePurchases() {
        return this.restorePurchases;
    }

    public final void setRestorePurchases(boolean z) {
        this.restorePurchases = z;
    }

    public /* synthetic */ LoadingStates(boolean z, boolean z2, boolean z3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getPurchasing() {
        return this.purchasing;
    }

    public final void setPurchasing(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.purchasing = set;
    }
}
