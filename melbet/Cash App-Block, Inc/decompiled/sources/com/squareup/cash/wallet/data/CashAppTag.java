package com.squareup.cash.wallet.data;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppTag {
    public final Image background;
    public final String deviceId;
    public final String displayName;
    public final TagFormFactor formFactor;
    public final boolean isExpired;
    public final Boolean isLocked;
    public final boolean isSponsorLocked;
    public final TagLifecycleState lifecycleState;
    public final PhysicalTagOrderState tagOrderState;
    public final String tagThemeToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PhysicalTagOrderState {
        public static final /* synthetic */ PhysicalTagOrderState[] $VALUES;
        public static final PhysicalTagOrderState COMPLETE;
        public static final PhysicalTagOrderState PENDING_ACTIVATION;
        public static final PhysicalTagOrderState PREPARING;
        public static final PhysicalTagOrderState SHIPPED;

        static {
            PhysicalTagOrderState physicalTagOrderState = new PhysicalTagOrderState("PREPARING", 0);
            PREPARING = physicalTagOrderState;
            PhysicalTagOrderState physicalTagOrderState2 = new PhysicalTagOrderState("SHIPPED", 1);
            SHIPPED = physicalTagOrderState2;
            PhysicalTagOrderState physicalTagOrderState3 = new PhysicalTagOrderState("PENDING_ACTIVATION", 2);
            PENDING_ACTIVATION = physicalTagOrderState3;
            PhysicalTagOrderState physicalTagOrderState4 = new PhysicalTagOrderState("COMPLETE", 3);
            COMPLETE = physicalTagOrderState4;
            $VALUES = new PhysicalTagOrderState[]{physicalTagOrderState, physicalTagOrderState2, physicalTagOrderState3, physicalTagOrderState4};
        }

        public static PhysicalTagOrderState valueOf(String str) {
            return (PhysicalTagOrderState) Enum.valueOf(PhysicalTagOrderState.class, str);
        }

        public static PhysicalTagOrderState[] values() {
            return (PhysicalTagOrderState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class TagLifecycleState {
        public static final /* synthetic */ TagLifecycleState[] $VALUES;
        public static final TagLifecycleState ACTIVE;
        public static final TagLifecycleState INACTIVE;
        public static final TagLifecycleState PENDING_FIRST_ACTIVATION;

        static {
            TagLifecycleState tagLifecycleState = new TagLifecycleState("ACTIVE", 0);
            ACTIVE = tagLifecycleState;
            TagLifecycleState tagLifecycleState2 = new TagLifecycleState("INACTIVE", 1);
            INACTIVE = tagLifecycleState2;
            TagLifecycleState tagLifecycleState3 = new TagLifecycleState("PENDING_FIRST_ACTIVATION", 2);
            PENDING_FIRST_ACTIVATION = tagLifecycleState3;
            $VALUES = new TagLifecycleState[]{tagLifecycleState, tagLifecycleState2, tagLifecycleState3};
        }

        public static TagLifecycleState valueOf(String str) {
            return (TagLifecycleState) Enum.valueOf(TagLifecycleState.class, str);
        }

        public static TagLifecycleState[] values() {
            return (TagLifecycleState[]) $VALUES.clone();
        }
    }

    public CashAppTag(String str, String str2, Image image, String str3, TagLifecycleState tagLifecycleState, PhysicalTagOrderState physicalTagOrderState, TagFormFactor tagFormFactor, Boolean bool, boolean z, boolean z2) {
        this.deviceId = str;
        this.tagThemeToken = str2;
        this.background = image;
        this.displayName = str3;
        this.lifecycleState = tagLifecycleState;
        this.tagOrderState = physicalTagOrderState;
        this.formFactor = tagFormFactor;
        this.isLocked = bool;
        this.isSponsorLocked = z;
        this.isExpired = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppTag)) {
            return false;
        }
        CashAppTag cashAppTag = (CashAppTag) obj;
        return Intrinsics.areEqual(this.deviceId, cashAppTag.deviceId) && Intrinsics.areEqual(this.tagThemeToken, cashAppTag.tagThemeToken) && Intrinsics.areEqual(this.background, cashAppTag.background) && Intrinsics.areEqual(this.displayName, cashAppTag.displayName) && this.lifecycleState == cashAppTag.lifecycleState && this.tagOrderState == cashAppTag.tagOrderState && this.formFactor == cashAppTag.formFactor && Intrinsics.areEqual(this.isLocked, cashAppTag.isLocked) && this.isSponsorLocked == cashAppTag.isSponsorLocked && this.isExpired == cashAppTag.isExpired;
    }

    public final int hashCode() {
        String str = this.deviceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagThemeToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.background;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.displayName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TagLifecycleState tagLifecycleState = this.lifecycleState;
        int hashCode5 = (hashCode4 + (tagLifecycleState == null ? 0 : tagLifecycleState.hashCode())) * 31;
        PhysicalTagOrderState physicalTagOrderState = this.tagOrderState;
        int hashCode6 = (hashCode5 + (physicalTagOrderState == null ? 0 : physicalTagOrderState.hashCode())) * 31;
        TagFormFactor tagFormFactor = this.formFactor;
        int hashCode7 = (hashCode6 + (tagFormFactor == null ? 0 : tagFormFactor.hashCode())) * 31;
        Boolean bool = this.isLocked;
        return Boolean.hashCode(this.isExpired) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.isSponsorLocked);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashAppTag(deviceId=", this.deviceId, ", tagThemeToken=", this.tagThemeToken, ", background=");
        m.append(this.background);
        m.append(", displayName=");
        m.append(this.displayName);
        m.append(", lifecycleState=");
        m.append(this.lifecycleState);
        m.append(", tagOrderState=");
        m.append(this.tagOrderState);
        m.append(", formFactor=");
        m.append(this.formFactor);
        m.append(", isLocked=");
        m.append(this.isLocked);
        m.append(", isSponsorLocked=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isSponsorLocked, ", isExpired=", this.isExpired, ")");
    }
}
