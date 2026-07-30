package com.chicken.road.kedbags.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FrostCatchSnapshot.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0007J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006'"}, d2 = {"Lcom/chicken/road/kedbags/data/model/FrostCatchSnapshot;", "", "catchCount", "", "iceDepth", "", "biteActive", "", "lureStyle", "", "windLevel", "lakeMood", "endpointUrl", "<init>", "(IDZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCatchCount", "()I", "getIceDepth", "()D", "getBiteActive", "()Z", "getLureStyle", "()Ljava/lang/String;", "getWindLevel", "getLakeMood", "getEndpointUrl", "opensOfferTab", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FrostCatchSnapshot {
    public static final int $stable = 0;
    private final boolean biteActive;
    private final int catchCount;
    private final String endpointUrl;
    private final double iceDepth;
    private final String lakeMood;
    private final String lureStyle;
    private final int windLevel;

    public static /* synthetic */ FrostCatchSnapshot copy$default(FrostCatchSnapshot frostCatchSnapshot, int i, double d, boolean z, String str, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frostCatchSnapshot.catchCount;
        }
        if ((i3 & 2) != 0) {
            d = frostCatchSnapshot.iceDepth;
        }
        if ((i3 & 4) != 0) {
            z = frostCatchSnapshot.biteActive;
        }
        if ((i3 & 8) != 0) {
            str = frostCatchSnapshot.lureStyle;
        }
        if ((i3 & 16) != 0) {
            i2 = frostCatchSnapshot.windLevel;
        }
        if ((i3 & 32) != 0) {
            str2 = frostCatchSnapshot.lakeMood;
        }
        if ((i3 & 64) != 0) {
            str3 = frostCatchSnapshot.endpointUrl;
        }
        String str4 = str3;
        int i4 = i2;
        boolean z2 = z;
        return frostCatchSnapshot.copy(i, d, z2, str, i4, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCatchCount() {
        return this.catchCount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getIceDepth() {
        return this.iceDepth;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBiteActive() {
        return this.biteActive;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLureStyle() {
        return this.lureStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWindLevel() {
        return this.windLevel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLakeMood() {
        return this.lakeMood;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEndpointUrl() {
        return this.endpointUrl;
    }

    public final FrostCatchSnapshot copy(int catchCount, double iceDepth, boolean biteActive, String lureStyle, int windLevel, String lakeMood, String endpointUrl) {
        Intrinsics.checkNotNullParameter(lureStyle, "lureStyle");
        Intrinsics.checkNotNullParameter(lakeMood, "lakeMood");
        Intrinsics.checkNotNullParameter(endpointUrl, "endpointUrl");
        return new FrostCatchSnapshot(catchCount, iceDepth, biteActive, lureStyle, windLevel, lakeMood, endpointUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrostCatchSnapshot)) {
            return false;
        }
        FrostCatchSnapshot frostCatchSnapshot = (FrostCatchSnapshot) other;
        return this.catchCount == frostCatchSnapshot.catchCount && Double.compare(this.iceDepth, frostCatchSnapshot.iceDepth) == 0 && this.biteActive == frostCatchSnapshot.biteActive && Intrinsics.areEqual(this.lureStyle, frostCatchSnapshot.lureStyle) && this.windLevel == frostCatchSnapshot.windLevel && Intrinsics.areEqual(this.lakeMood, frostCatchSnapshot.lakeMood) && Intrinsics.areEqual(this.endpointUrl, frostCatchSnapshot.endpointUrl);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.catchCount) * 31) + Double.hashCode(this.iceDepth)) * 31) + Boolean.hashCode(this.biteActive)) * 31) + this.lureStyle.hashCode()) * 31) + Integer.hashCode(this.windLevel)) * 31) + this.lakeMood.hashCode()) * 31) + this.endpointUrl.hashCode();
    }

    public String toString() {
        return "FrostCatchSnapshot(catchCount=" + this.catchCount + ", iceDepth=" + this.iceDepth + ", biteActive=" + this.biteActive + ", lureStyle=" + this.lureStyle + ", windLevel=" + this.windLevel + ", lakeMood=" + this.lakeMood + ", endpointUrl=" + this.endpointUrl + ")";
    }

    public FrostCatchSnapshot(int i, double d, boolean z, String lureStyle, int i2, String lakeMood, String endpointUrl) {
        Intrinsics.checkNotNullParameter(lureStyle, "lureStyle");
        Intrinsics.checkNotNullParameter(lakeMood, "lakeMood");
        Intrinsics.checkNotNullParameter(endpointUrl, "endpointUrl");
        this.catchCount = i;
        this.iceDepth = d;
        this.biteActive = z;
        this.lureStyle = lureStyle;
        this.windLevel = i2;
        this.lakeMood = lakeMood;
        this.endpointUrl = endpointUrl;
    }

    public final int getCatchCount() {
        return this.catchCount;
    }

    public final double getIceDepth() {
        return this.iceDepth;
    }

    public final boolean getBiteActive() {
        return this.biteActive;
    }

    public final String getLureStyle() {
        return this.lureStyle;
    }

    public final int getWindLevel() {
        return this.windLevel;
    }

    public final String getLakeMood() {
        return this.lakeMood;
    }

    public final String getEndpointUrl() {
        return this.endpointUrl;
    }

    public final boolean opensOfferTab() {
        return (this.biteActive || StringsKt.isBlank(this.lureStyle)) ? false : true;
    }
}
