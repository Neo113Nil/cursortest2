package com.squareup.cash.work.tinygraph.models;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u0012\u0004\b#\u0010\u0017\u001a\u0004\b\"\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u0012\u0004\b%\u0010\u0017\u001a\u0004\b$\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u0012\u0004\b'\u0010\u0017\u001a\u0004\b&\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u0012\u0004\b)\u0010\u0017\u001a\u0004\b(\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u0012\u0004\b+\u0010\u0017\u001a\u0004\b*\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u0012\u0004\b-\u0010\u0017\u001a\u0004\b,\u0010 ¨\u0006."}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "", "", "shiftCalendarTipLastShown", "shiftManagerTipLastShown", "", "addWageTipShown", "", "automaticallyDownload", "showDatesInLocalTimeZone", "hasDismissedFilesIntro", "hasSeenConnectionsTabEducation", "hasSeenConnectionsEducation", "hasDismissedAvailabilityUpsell", "purchases", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "Ljava/lang/Long;", "getShiftCalendarTipLastShown", "()Ljava/lang/Long;", "getShiftCalendarTipLastShown$annotations", "()V", "getShiftManagerTipLastShown", "getShiftManagerTipLastShown$annotations", "Ljava/lang/Boolean;", "getAddWageTipShown", "()Ljava/lang/Boolean;", "getAddWageTipShown$annotations", "Ljava/lang/String;", "getAutomaticallyDownload", "()Ljava/lang/String;", "getAutomaticallyDownload$annotations", "getShowDatesInLocalTimeZone", "getShowDatesInLocalTimeZone$annotations", "getHasDismissedFilesIntro", "getHasDismissedFilesIntro$annotations", "getHasSeenConnectionsTabEducation", "getHasSeenConnectionsTabEducation$annotations", "getHasSeenConnectionsEducation", "getHasSeenConnectionsEducation$annotations", "getHasDismissedAvailabilityUpsell", "getHasDismissedAvailabilityUpsell$annotations", "getPurchases", "getPurchases$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExtendedAttributes {
    public final Boolean addWageTipShown;
    public final String automaticallyDownload;
    public final Boolean hasDismissedAvailabilityUpsell;
    public final Boolean hasDismissedFilesIntro;
    public final Boolean hasSeenConnectionsEducation;
    public final Boolean hasSeenConnectionsTabEducation;
    public final String purchases;
    public final Long shiftCalendarTipLastShown;
    public final Long shiftManagerTipLastShown;
    public final Boolean showDatesInLocalTimeZone;

    public /* synthetic */ ExtendedAttributes(Long l, Long l2, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : str2);
    }

    @Json(name = "addWageTipShown")
    public static /* synthetic */ void getAddWageTipShown$annotations() {
    }

    @Json(name = "automaticallyDownload")
    public static /* synthetic */ void getAutomaticallyDownload$annotations() {
    }

    @Json(name = "hasDismissedAvailabilityUpsell")
    public static /* synthetic */ void getHasDismissedAvailabilityUpsell$annotations() {
    }

    @Json(name = "hasDismissedFilesIntro")
    public static /* synthetic */ void getHasDismissedFilesIntro$annotations() {
    }

    @Json(name = "hasSeenConnectionsEducation")
    public static /* synthetic */ void getHasSeenConnectionsEducation$annotations() {
    }

    @Json(name = "hasSeenConnectionsTabEducation")
    public static /* synthetic */ void getHasSeenConnectionsTabEducation$annotations() {
    }

    @Json(name = "purchases")
    public static /* synthetic */ void getPurchases$annotations() {
    }

    @Json(name = "shiftCalendarTipLastShown")
    public static /* synthetic */ void getShiftCalendarTipLastShown$annotations() {
    }

    @Json(name = "shiftManagerTipLastShown")
    public static /* synthetic */ void getShiftManagerTipLastShown$annotations() {
    }

    @Json(name = "showDatesInLocalTimeZone")
    public static /* synthetic */ void getShowDatesInLocalTimeZone$annotations() {
    }

    public final ExtendedAttributes copy(@Json(name = "shiftCalendarTipLastShown") Long shiftCalendarTipLastShown, @Json(name = "shiftManagerTipLastShown") Long shiftManagerTipLastShown, @Json(name = "addWageTipShown") Boolean addWageTipShown, @Json(name = "automaticallyDownload") String automaticallyDownload, @Json(name = "showDatesInLocalTimeZone") Boolean showDatesInLocalTimeZone, @Json(name = "hasDismissedFilesIntro") Boolean hasDismissedFilesIntro, @Json(name = "hasSeenConnectionsTabEducation") Boolean hasSeenConnectionsTabEducation, @Json(name = "hasSeenConnectionsEducation") Boolean hasSeenConnectionsEducation, @Json(name = "hasDismissedAvailabilityUpsell") Boolean hasDismissedAvailabilityUpsell, @Json(name = "purchases") String purchases) {
        return new ExtendedAttributes(shiftCalendarTipLastShown, shiftManagerTipLastShown, addWageTipShown, automaticallyDownload, showDatesInLocalTimeZone, hasDismissedFilesIntro, hasSeenConnectionsTabEducation, hasSeenConnectionsEducation, hasDismissedAvailabilityUpsell, purchases);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedAttributes)) {
            return false;
        }
        ExtendedAttributes extendedAttributes = (ExtendedAttributes) obj;
        return Intrinsics.areEqual(this.shiftCalendarTipLastShown, extendedAttributes.shiftCalendarTipLastShown) && Intrinsics.areEqual(this.shiftManagerTipLastShown, extendedAttributes.shiftManagerTipLastShown) && Intrinsics.areEqual(this.addWageTipShown, extendedAttributes.addWageTipShown) && Intrinsics.areEqual(this.automaticallyDownload, extendedAttributes.automaticallyDownload) && Intrinsics.areEqual(this.showDatesInLocalTimeZone, extendedAttributes.showDatesInLocalTimeZone) && Intrinsics.areEqual(this.hasDismissedFilesIntro, extendedAttributes.hasDismissedFilesIntro) && Intrinsics.areEqual(this.hasSeenConnectionsTabEducation, extendedAttributes.hasSeenConnectionsTabEducation) && Intrinsics.areEqual(this.hasSeenConnectionsEducation, extendedAttributes.hasSeenConnectionsEducation) && Intrinsics.areEqual(this.hasDismissedAvailabilityUpsell, extendedAttributes.hasDismissedAvailabilityUpsell) && Intrinsics.areEqual(this.purchases, extendedAttributes.purchases);
    }

    public final int hashCode() {
        Long l = this.shiftCalendarTipLastShown;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.shiftManagerTipLastShown;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.addWageTipShown;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.automaticallyDownload;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.showDatesInLocalTimeZone;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasDismissedFilesIntro;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasSeenConnectionsTabEducation;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasSeenConnectionsEducation;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasDismissedAvailabilityUpsell;
        int hashCode9 = (hashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str2 = this.purchases;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributes(shiftCalendarTipLastShown=");
        sb.append(this.shiftCalendarTipLastShown);
        sb.append(", shiftManagerTipLastShown=");
        sb.append(this.shiftManagerTipLastShown);
        sb.append(", addWageTipShown=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.addWageTipShown, ", automaticallyDownload=", this.automaticallyDownload, ", showDatesInLocalTimeZone=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.showDatesInLocalTimeZone, ", hasDismissedFilesIntro=", this.hasDismissedFilesIntro, ", hasSeenConnectionsTabEducation=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.hasSeenConnectionsTabEducation, ", hasSeenConnectionsEducation=", this.hasSeenConnectionsEducation, ", hasDismissedAvailabilityUpsell=");
        sb.append(this.hasDismissedAvailabilityUpsell);
        sb.append(", purchases=");
        sb.append(this.purchases);
        sb.append(")");
        return sb.toString();
    }

    public ExtendedAttributes(@Json(name = "shiftCalendarTipLastShown") Long l, @Json(name = "shiftManagerTipLastShown") Long l2, @Json(name = "addWageTipShown") Boolean bool, @Json(name = "automaticallyDownload") String str, @Json(name = "showDatesInLocalTimeZone") Boolean bool2, @Json(name = "hasDismissedFilesIntro") Boolean bool3, @Json(name = "hasSeenConnectionsTabEducation") Boolean bool4, @Json(name = "hasSeenConnectionsEducation") Boolean bool5, @Json(name = "hasDismissedAvailabilityUpsell") Boolean bool6, @Json(name = "purchases") String str2) {
        this.shiftCalendarTipLastShown = l;
        this.shiftManagerTipLastShown = l2;
        this.addWageTipShown = bool;
        this.automaticallyDownload = str;
        this.showDatesInLocalTimeZone = bool2;
        this.hasDismissedFilesIntro = bool3;
        this.hasSeenConnectionsTabEducation = bool4;
        this.hasSeenConnectionsEducation = bool5;
        this.hasDismissedAvailabilityUpsell = bool6;
        this.purchases = str2;
    }
}
