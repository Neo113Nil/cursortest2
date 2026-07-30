package com.chicken.road.kedbags.ui.splash;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SplashController.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/chicken/road/kedbags/ui/splash/SplashUiState;", "", "loading", "", "error", "<init>", "(ZZ)V", "getLoading", "()Z", "getError", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SplashUiState {
    public static final int $stable = 0;
    private final boolean error;
    private final boolean loading;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplashUiState() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    public static /* synthetic */ SplashUiState copy$default(SplashUiState splashUiState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = splashUiState.loading;
        }
        if ((i & 2) != 0) {
            z2 = splashUiState.error;
        }
        return splashUiState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    public final SplashUiState copy(boolean loading, boolean error) {
        return new SplashUiState(loading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashUiState)) {
            return false;
        }
        SplashUiState splashUiState = (SplashUiState) other;
        return this.loading == splashUiState.loading && this.error == splashUiState.error;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.loading) * 31) + Boolean.hashCode(this.error);
    }

    public String toString() {
        return "SplashUiState(loading=" + this.loading + ", error=" + this.error + ")";
    }

    public SplashUiState(boolean z, boolean z2) {
        this.loading = z;
        this.error = z2;
    }

    public /* synthetic */ SplashUiState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getError() {
        return this.error;
    }
}
