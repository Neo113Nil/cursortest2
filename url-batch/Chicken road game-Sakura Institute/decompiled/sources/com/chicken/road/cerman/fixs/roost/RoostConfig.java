package com.chicken.road.cerman.fixs.roost;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoostConfig.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostConfig;", "", "active", "", "checkUrl", "", "title", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "getCheckUrl", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoostConfig {
    public static final int $stable = 0;
    private final boolean active;
    private final String checkUrl;
    private final String title;

    public RoostConfig() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ RoostConfig copy$default(RoostConfig roostConfig, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = roostConfig.active;
        }
        if ((i & 2) != 0) {
            str = roostConfig.checkUrl;
        }
        if ((i & 4) != 0) {
            str2 = roostConfig.title;
        }
        return roostConfig.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCheckUrl() {
        return this.checkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final RoostConfig copy(boolean active, String checkUrl, String title) {
        Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        return new RoostConfig(active, checkUrl, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoostConfig)) {
            return false;
        }
        RoostConfig roostConfig = (RoostConfig) other;
        return this.active == roostConfig.active && Intrinsics.areEqual(this.checkUrl, roostConfig.checkUrl) && Intrinsics.areEqual(this.title, roostConfig.title);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.active) * 31) + this.checkUrl.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "RoostConfig(active=" + this.active + ", checkUrl=" + this.checkUrl + ", title=" + this.title + ")";
    }

    public RoostConfig(boolean z, String checkUrl, String title) {
        Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.active = z;
        this.checkUrl = checkUrl;
        this.title = title;
    }

    public /* synthetic */ RoostConfig(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getCheckUrl() {
        return this.checkUrl;
    }

    public final String getTitle() {
        return this.title;
    }
}
