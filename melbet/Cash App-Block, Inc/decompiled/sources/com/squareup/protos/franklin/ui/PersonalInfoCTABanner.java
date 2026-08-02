package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PersonalInfoCTABanner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalInfoCTABanner> CREATOR;
    public final String banner_primary_button_cta;
    public final String banner_subtitle;
    public final String banner_title;
    public final LocalizableString localizable_banner_primary_button_cta;
    public final LocalizableString localizable_banner_subtitle;
    public final LocalizableString localizable_banner_title;

    static {
        PersonalInfoCTABanner$Companion$ADAPTER$1 personalInfoCTABanner$Companion$ADAPTER$1 = new PersonalInfoCTABanner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalInfoCTABanner.class), "type.googleapis.com/squareup.franklin.ui.PersonalInfoCTABanner", Syntax.PROTO_2, null, "squareup/franklin/ui/personal_info_cta_banner.proto");
        ADAPTER = personalInfoCTABanner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalInfoCTABanner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoCTABanner(String str, String str2, String str3, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.banner_title = str;
        this.banner_subtitle = str2;
        this.banner_primary_button_cta = str3;
        this.localizable_banner_title = localizableString;
        this.localizable_banner_subtitle = localizableString2;
        this.localizable_banner_primary_button_cta = localizableString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalInfoCTABanner)) {
            return false;
        }
        PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) obj;
        return Intrinsics.areEqual(unknownFields(), personalInfoCTABanner.unknownFields()) && Intrinsics.areEqual(this.banner_title, personalInfoCTABanner.banner_title) && Intrinsics.areEqual(this.banner_subtitle, personalInfoCTABanner.banner_subtitle) && Intrinsics.areEqual(this.banner_primary_button_cta, personalInfoCTABanner.banner_primary_button_cta) && Intrinsics.areEqual(this.localizable_banner_title, personalInfoCTABanner.localizable_banner_title) && Intrinsics.areEqual(this.localizable_banner_subtitle, personalInfoCTABanner.localizable_banner_subtitle) && Intrinsics.areEqual(this.localizable_banner_primary_button_cta, personalInfoCTABanner.localizable_banner_primary_button_cta);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.banner_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.banner_subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.banner_primary_button_cta;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_banner_title;
        int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_banner_subtitle;
        int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_banner_primary_button_cta;
        int hashCode7 = hashCode6 + (localizableString3 != null ? localizableString3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(12, false);
        builder.full_name = this.banner_title;
        builder.photo_url = this.banner_subtitle;
        builder.synopsis = this.banner_primary_button_cta;
        builder.full_cashtag = this.localizable_banner_title;
        builder.cashtag_url_enabled = this.localizable_banner_subtitle;
        builder.is_verified_account = this.localizable_banner_primary_button_cta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.banner_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "banner_title=", arrayList);
        }
        String str2 = this.banner_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "banner_subtitle=", arrayList);
        }
        String str3 = this.banner_primary_button_cta;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "banner_primary_button_cta=", arrayList);
        }
        LocalizableString localizableString = this.localizable_banner_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_banner_title=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localizable_banner_subtitle;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_banner_subtitle=", localizableString2, arrayList);
        }
        LocalizableString localizableString3 = this.localizable_banner_primary_button_cta;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_banner_primary_button_cta=", localizableString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalInfoCTABanner{", "}", 0, null, null, 56);
    }
}
