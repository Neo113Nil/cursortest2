package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceProfileData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CommerceProfileData> CREATOR;
    public final Activity activity;
    public final Avatar avatar;
    public final Banner banner;
    public final String cashtag;
    public final Category category;
    public final List counter_abuse_actions;
    public final String description;
    public final Location location;
    public final String name;
    public final ProfileAction pay_action;
    public final Image profile_identity_icon;
    public final Region region;
    public final ProfileAction request_action;
    public final SocialAccounts socials;
    public final ProfileAction toggle_favorite_action;
    public final TrustsData trusts;
    public final List utility_actions;

    static {
        CommerceProfileData$Companion$ADAPTER$1 commerceProfileData$Companion$ADAPTER$1 = new CommerceProfileData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CommerceProfileData.class), "type.googleapis.com/squareup.cash.cashface.api.CommerceProfileData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = commerceProfileData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(commerceProfileData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceProfileData(Avatar avatar, String str, String str2, String str3, Location location, SocialAccounts socialAccounts, Category category, TrustsData trustsData, Activity activity, ProfileAction profileAction, ProfileAction profileAction2, ProfileAction profileAction3, List list, List list2, Image image, Banner banner, Region region, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.avatar = avatar;
        this.name = str;
        this.cashtag = str2;
        this.description = str3;
        this.location = location;
        this.socials = socialAccounts;
        this.category = category;
        this.trusts = trustsData;
        this.activity = activity;
        this.pay_action = profileAction;
        this.request_action = profileAction2;
        this.toggle_favorite_action = profileAction3;
        this.profile_identity_icon = image;
        this.banner = banner;
        this.region = region;
        this.counter_abuse_actions = TransactorKt.immutableCopyOf("counter_abuse_actions", list);
        this.utility_actions = TransactorKt.immutableCopyOf("utility_actions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceProfileData)) {
            return false;
        }
        CommerceProfileData commerceProfileData = (CommerceProfileData) obj;
        return Intrinsics.areEqual(unknownFields(), commerceProfileData.unknownFields()) && Intrinsics.areEqual(this.avatar, commerceProfileData.avatar) && Intrinsics.areEqual(this.name, commerceProfileData.name) && Intrinsics.areEqual(this.cashtag, commerceProfileData.cashtag) && Intrinsics.areEqual(this.description, commerceProfileData.description) && Intrinsics.areEqual(this.location, commerceProfileData.location) && Intrinsics.areEqual(this.socials, commerceProfileData.socials) && Intrinsics.areEqual(this.category, commerceProfileData.category) && Intrinsics.areEqual(this.trusts, commerceProfileData.trusts) && Intrinsics.areEqual(this.activity, commerceProfileData.activity) && Intrinsics.areEqual(this.pay_action, commerceProfileData.pay_action) && Intrinsics.areEqual(this.request_action, commerceProfileData.request_action) && Intrinsics.areEqual(this.toggle_favorite_action, commerceProfileData.toggle_favorite_action) && Intrinsics.areEqual(this.counter_abuse_actions, commerceProfileData.counter_abuse_actions) && Intrinsics.areEqual(this.utility_actions, commerceProfileData.utility_actions) && Intrinsics.areEqual(this.profile_identity_icon, commerceProfileData.profile_identity_icon) && Intrinsics.areEqual(this.banner, commerceProfileData.banner) && this.region == commerceProfileData.region;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Avatar avatar = this.avatar;
        int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Location location = this.location;
        int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 37;
        SocialAccounts socialAccounts = this.socials;
        int hashCode7 = (hashCode6 + (socialAccounts != null ? socialAccounts.hashCode() : 0)) * 37;
        Category category = this.category;
        int hashCode8 = (hashCode7 + (category != null ? category.hashCode() : 0)) * 37;
        TrustsData trustsData = this.trusts;
        int hashCode9 = (hashCode8 + (trustsData != null ? trustsData.hashCode() : 0)) * 37;
        Activity activity = this.activity;
        int hashCode10 = (hashCode9 + (activity != null ? activity.hashCode() : 0)) * 37;
        ProfileAction profileAction = this.pay_action;
        int hashCode11 = (hashCode10 + (profileAction != null ? profileAction.hashCode() : 0)) * 37;
        ProfileAction profileAction2 = this.request_action;
        int hashCode12 = (hashCode11 + (profileAction2 != null ? profileAction2.hashCode() : 0)) * 37;
        ProfileAction profileAction3 = this.toggle_favorite_action;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (profileAction3 != null ? profileAction3.hashCode() : 0)) * 37, 37, this.counter_abuse_actions), 37, this.utility_actions);
        Image image = this.profile_identity_icon;
        int hashCode13 = (m + (image != null ? image.hashCode() : 0)) * 37;
        Banner banner = this.banner;
        int hashCode14 = (hashCode13 + (banner != null ? banner.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode15 = hashCode14 + (region != null ? region.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(3);
        builder.employee_token = this.avatar;
        builder.token = this.name;
        builder.shift_id = this.cashtag;
        builder.merchant_token = this.description;
        builder.clockin_unit_token = this.location;
        builder.clockout_unit_token = this.socials;
        builder.note = this.category;
        builder.employee = this.trusts;
        builder.deleted = this.activity;
        builder.was_automatically_clocked_out = this.pay_action;
        builder.clockin_timestamp_ms = this.request_action;
        builder.clockout_timestamp_ms = this.toggle_favorite_action;
        builder.created_at_timestamp_ms = this.counter_abuse_actions;
        builder.updated_at_timestamp_ms = this.utility_actions;
        builder.hourly_wage = this.profile_identity_icon;
        builder.declared_tip = this.banner;
        builder.employee_job_info = this.region;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.description != null) {
            arrayList.add("description=██");
        }
        Location location = this.location;
        if (location != null) {
            arrayList.add("location=" + location);
        }
        SocialAccounts socialAccounts = this.socials;
        if (socialAccounts != null) {
            arrayList.add("socials=" + socialAccounts);
        }
        Category category = this.category;
        if (category != null) {
            arrayList.add("category=" + category);
        }
        TrustsData trustsData = this.trusts;
        if (trustsData != null) {
            arrayList.add("trusts=" + trustsData);
        }
        Activity activity = this.activity;
        if (activity != null) {
            arrayList.add("activity=" + activity);
        }
        ProfileAction profileAction = this.pay_action;
        if (profileAction != null) {
            arrayList.add("pay_action=" + profileAction);
        }
        ProfileAction profileAction2 = this.request_action;
        if (profileAction2 != null) {
            arrayList.add("request_action=" + profileAction2);
        }
        ProfileAction profileAction3 = this.toggle_favorite_action;
        if (profileAction3 != null) {
            arrayList.add("toggle_favorite_action=" + profileAction3);
        }
        List list = this.counter_abuse_actions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("counter_abuse_actions=", arrayList, list);
        }
        List list2 = this.utility_actions;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("utility_actions=", arrayList, list2);
        }
        Image image = this.profile_identity_icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("profile_identity_icon=", image, arrayList);
        }
        Banner banner = this.banner;
        if (banner != null) {
            arrayList.add("banner=" + banner);
        }
        if (this.region != null) {
            arrayList.add("region=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CommerceProfileData{", "}", 0, null, null, 56);
    }
}
