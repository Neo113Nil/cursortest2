package com.chicken.road.kedbags.data.device;

import com.chicken.road.kedbags.data.remote.FrostCatchConfig;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrostSignals.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/chicken/road/kedbags/data/device/FrostSignals;", "", FrostCatchConfig.KEY_AD_ID, "", FrostCatchConfig.KEY_INSTALL_REFERRER, FrostCatchConfig.KEY_ANDROID_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHookRune", "()Ljava/lang/String;", "getIceLantern", "getPerchWhisper", "toFrame", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FrostSignals {
    public static final int $stable = 0;
    private final String hookRune;
    private final String iceLantern;
    private final String perchWhisper;

    public static /* synthetic */ FrostSignals copy$default(FrostSignals frostSignals, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frostSignals.hookRune;
        }
        if ((i & 2) != 0) {
            str2 = frostSignals.iceLantern;
        }
        if ((i & 4) != 0) {
            str3 = frostSignals.perchWhisper;
        }
        return frostSignals.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHookRune() {
        return this.hookRune;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIceLantern() {
        return this.iceLantern;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPerchWhisper() {
        return this.perchWhisper;
    }

    public final FrostSignals copy(String hookRune, String iceLantern, String perchWhisper) {
        Intrinsics.checkNotNullParameter(hookRune, "hookRune");
        Intrinsics.checkNotNullParameter(iceLantern, "iceLantern");
        Intrinsics.checkNotNullParameter(perchWhisper, "perchWhisper");
        return new FrostSignals(hookRune, iceLantern, perchWhisper);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrostSignals)) {
            return false;
        }
        FrostSignals frostSignals = (FrostSignals) other;
        return Intrinsics.areEqual(this.hookRune, frostSignals.hookRune) && Intrinsics.areEqual(this.iceLantern, frostSignals.iceLantern) && Intrinsics.areEqual(this.perchWhisper, frostSignals.perchWhisper);
    }

    public int hashCode() {
        return (((this.hookRune.hashCode() * 31) + this.iceLantern.hashCode()) * 31) + this.perchWhisper.hashCode();
    }

    public String toString() {
        return "FrostSignals(hookRune=" + this.hookRune + ", iceLantern=" + this.iceLantern + ", perchWhisper=" + this.perchWhisper + ")";
    }

    public FrostSignals(String hookRune, String iceLantern, String perchWhisper) {
        Intrinsics.checkNotNullParameter(hookRune, "hookRune");
        Intrinsics.checkNotNullParameter(iceLantern, "iceLantern");
        Intrinsics.checkNotNullParameter(perchWhisper, "perchWhisper");
        this.hookRune = hookRune;
        this.iceLantern = iceLantern;
        this.perchWhisper = perchWhisper;
    }

    public final String getHookRune() {
        return this.hookRune;
    }

    public final String getIceLantern() {
        return this.iceLantern;
    }

    public final String getPerchWhisper() {
        return this.perchWhisper;
    }

    public final LinkedHashMap<String, String> toFrame() {
        return MapsKt.linkedMapOf(TuplesKt.to(FrostCatchConfig.KEY_AD_ID, this.hookRune), TuplesKt.to(FrostCatchConfig.KEY_INSTALL_REFERRER, this.iceLantern), TuplesKt.to(FrostCatchConfig.KEY_ANDROID_ID, this.perchWhisper));
    }
}
