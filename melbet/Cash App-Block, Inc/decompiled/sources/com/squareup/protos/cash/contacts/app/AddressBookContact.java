package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class AddressBookContact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddressBookContact> CREATOR;
    public final String birthday;
    public final List canonicalized_email_addresses;
    public final List canonicalized_phone_numbers;
    public final String contact_id;
    public final List dates;
    public final String department_name;
    public final List email_addresses;
    public final String family_name;
    public final String given_name;
    public final Boolean has_image;
    public final Boolean has_note;
    public final ImageExifData image_exif_data;
    public final ImageResolution image_resolution;
    public final Long image_size_bytes;
    public final List instant_message_addresses;
    public final String job_title;
    public final String middle_name;
    public final String name_prefix;
    public final String name_suffix;
    public final String nickname;
    public final String non_gregorian_birthday;
    public final String organization_name;
    public final List phone_numbers;
    public final String phonetic_family_name;
    public final String phonetic_given_name;
    public final String phonetic_middle_name;
    public final String phonetic_organization_name;
    public final List postal_addresses;
    public final String potential_account_source;
    public final String previous_family_name;
    public final List relations;
    public final List social_profiles;
    public final List url_addresses;

    public final class Builder extends Message.Builder {
        public String birthday;
        public List canonicalized_email_addresses;
        public List canonicalized_phone_numbers;
        public String contact_id;
        public List dates;
        public String department_name;
        public List email_addresses;
        public String family_name;
        public String given_name;
        public Boolean has_image;
        public Boolean has_note;
        public ImageExifData image_exif_data;
        public ImageResolution image_resolution;
        public Long image_size_bytes;
        public List instant_message_addresses;
        public String job_title;
        public String middle_name;
        public String name_prefix;
        public String name_suffix;
        public String nickname;
        public String non_gregorian_birthday;
        public String organization_name;
        public List phone_numbers;
        public String phonetic_family_name;
        public String phonetic_given_name;
        public String phonetic_middle_name;
        public String phonetic_organization_name;
        public List postal_addresses;
        public String potential_account_source;
        public String previous_family_name;
        public List relations;
        public List social_profiles;
        public List url_addresses;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new AddressBookContact(this.name_prefix, this.given_name, this.middle_name, this.family_name, this.previous_family_name, this.name_suffix, this.nickname, this.phonetic_given_name, this.phonetic_middle_name, this.phonetic_family_name, this.job_title, this.department_name, this.organization_name, this.phonetic_organization_name, this.postal_addresses, this.email_addresses, this.url_addresses, this.instant_message_addresses, this.phone_numbers, this.social_profiles, this.birthday, this.non_gregorian_birthday, this.dates, this.has_note, this.relations, this.has_image, this.image_resolution, this.image_size_bytes, this.image_exif_data, this.contact_id, this.potential_account_source, this.canonicalized_phone_numbers, this.canonicalized_email_addresses, buildUnknownFields());
        }
    }

    static {
        AddressBookContact$Companion$ADAPTER$1 addressBookContact$Companion$ADAPTER$1 = new AddressBookContact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddressBookContact.class), "type.googleapis.com/squareup.cash.contacts.app.AddressBookContact", Syntax.PROTO_2, null, "squareup/cash/contacts/app/AddressBookContact.proto");
        ADAPTER = addressBookContact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addressBookContact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookContact(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, List list3, List list4, List list5, List list6, String str15, String str16, List list7, Boolean bool, List list8, Boolean bool2, ImageResolution imageResolution, Long l, ImageExifData imageExifData, String str17, String str18, List list9, List list10, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        byteString.getClass();
        this.name_prefix = str;
        this.given_name = str2;
        this.middle_name = str3;
        this.family_name = str4;
        this.previous_family_name = str5;
        this.name_suffix = str6;
        this.nickname = str7;
        this.phonetic_given_name = str8;
        this.phonetic_middle_name = str9;
        this.phonetic_family_name = str10;
        this.job_title = str11;
        this.department_name = str12;
        this.organization_name = str13;
        this.phonetic_organization_name = str14;
        this.birthday = str15;
        this.non_gregorian_birthday = str16;
        this.has_note = bool;
        this.has_image = bool2;
        this.image_resolution = imageResolution;
        this.image_size_bytes = l;
        this.image_exif_data = imageExifData;
        this.contact_id = str17;
        this.potential_account_source = str18;
        this.postal_addresses = TransactorKt.immutableCopyOf("postal_addresses", list);
        this.email_addresses = TransactorKt.immutableCopyOf("email_addresses", list2);
        this.url_addresses = TransactorKt.immutableCopyOf("url_addresses", list3);
        this.instant_message_addresses = TransactorKt.immutableCopyOf("instant_message_addresses", list4);
        this.phone_numbers = TransactorKt.immutableCopyOf("phone_numbers", list5);
        this.social_profiles = TransactorKt.immutableCopyOf("social_profiles", list6);
        this.dates = TransactorKt.immutableCopyOf("dates", list7);
        this.relations = TransactorKt.immutableCopyOf("relations", list8);
        this.canonicalized_phone_numbers = TransactorKt.immutableCopyOf("canonicalized_phone_numbers", list9);
        this.canonicalized_email_addresses = TransactorKt.immutableCopyOf("canonicalized_email_addresses", list10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressBookContact)) {
            return false;
        }
        AddressBookContact addressBookContact = (AddressBookContact) obj;
        return Intrinsics.areEqual(unknownFields(), addressBookContact.unknownFields()) && Intrinsics.areEqual(this.name_prefix, addressBookContact.name_prefix) && Intrinsics.areEqual(this.given_name, addressBookContact.given_name) && Intrinsics.areEqual(this.middle_name, addressBookContact.middle_name) && Intrinsics.areEqual(this.family_name, addressBookContact.family_name) && Intrinsics.areEqual(this.previous_family_name, addressBookContact.previous_family_name) && Intrinsics.areEqual(this.name_suffix, addressBookContact.name_suffix) && Intrinsics.areEqual(this.nickname, addressBookContact.nickname) && Intrinsics.areEqual(this.phonetic_given_name, addressBookContact.phonetic_given_name) && Intrinsics.areEqual(this.phonetic_middle_name, addressBookContact.phonetic_middle_name) && Intrinsics.areEqual(this.phonetic_family_name, addressBookContact.phonetic_family_name) && Intrinsics.areEqual(this.job_title, addressBookContact.job_title) && Intrinsics.areEqual(this.department_name, addressBookContact.department_name) && Intrinsics.areEqual(this.organization_name, addressBookContact.organization_name) && Intrinsics.areEqual(this.phonetic_organization_name, addressBookContact.phonetic_organization_name) && Intrinsics.areEqual(this.postal_addresses, addressBookContact.postal_addresses) && Intrinsics.areEqual(this.email_addresses, addressBookContact.email_addresses) && Intrinsics.areEqual(this.url_addresses, addressBookContact.url_addresses) && Intrinsics.areEqual(this.instant_message_addresses, addressBookContact.instant_message_addresses) && Intrinsics.areEqual(this.phone_numbers, addressBookContact.phone_numbers) && Intrinsics.areEqual(this.social_profiles, addressBookContact.social_profiles) && Intrinsics.areEqual(this.birthday, addressBookContact.birthday) && Intrinsics.areEqual(this.non_gregorian_birthday, addressBookContact.non_gregorian_birthday) && Intrinsics.areEqual(this.dates, addressBookContact.dates) && Intrinsics.areEqual(this.has_note, addressBookContact.has_note) && Intrinsics.areEqual(this.relations, addressBookContact.relations) && Intrinsics.areEqual(this.has_image, addressBookContact.has_image) && Intrinsics.areEqual(this.image_resolution, addressBookContact.image_resolution) && Intrinsics.areEqual(this.image_size_bytes, addressBookContact.image_size_bytes) && Intrinsics.areEqual(this.image_exif_data, addressBookContact.image_exif_data) && Intrinsics.areEqual(this.contact_id, addressBookContact.contact_id) && Intrinsics.areEqual(this.potential_account_source, addressBookContact.potential_account_source) && Intrinsics.areEqual(this.canonicalized_phone_numbers, addressBookContact.canonicalized_phone_numbers) && Intrinsics.areEqual(this.canonicalized_email_addresses, addressBookContact.canonicalized_email_addresses);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name_prefix;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.given_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.middle_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.family_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.previous_family_name;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.name_suffix;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.nickname;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.phonetic_given_name;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.phonetic_middle_name;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.phonetic_family_name;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.job_title;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.department_name;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.organization_name;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.phonetic_organization_name;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 37, 37, this.postal_addresses), 37, this.email_addresses), 37, this.url_addresses), 37, this.instant_message_addresses), 37, this.phone_numbers), 37, this.social_profiles);
        String str15 = this.birthday;
        int hashCode15 = (m + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.non_gregorian_birthday;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 37, 37, this.dates);
        Boolean bool = this.has_note;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.relations);
        Boolean bool2 = this.has_image;
        int hashCode16 = (m3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        ImageResolution imageResolution = this.image_resolution;
        int hashCode17 = (hashCode16 + (imageResolution != null ? imageResolution.hashCode() : 0)) * 37;
        Long l = this.image_size_bytes;
        int hashCode18 = (hashCode17 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        ImageExifData imageExifData = this.image_exif_data;
        int hashCode19 = (hashCode18 + (imageExifData != null ? imageExifData.hashCode() : 0)) * 37;
        String str17 = this.contact_id;
        int hashCode20 = (hashCode19 + (str17 != null ? str17.hashCode() : 0)) * 37;
        String str18 = this.potential_account_source;
        int hashCode21 = this.canonicalized_email_addresses.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode20 + (str18 != null ? str18.hashCode() : 0)) * 37, 37, this.canonicalized_phone_numbers);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name_prefix = this.name_prefix;
        builder.given_name = this.given_name;
        builder.middle_name = this.middle_name;
        builder.family_name = this.family_name;
        builder.previous_family_name = this.previous_family_name;
        builder.name_suffix = this.name_suffix;
        builder.nickname = this.nickname;
        builder.phonetic_given_name = this.phonetic_given_name;
        builder.phonetic_middle_name = this.phonetic_middle_name;
        builder.phonetic_family_name = this.phonetic_family_name;
        builder.job_title = this.job_title;
        builder.department_name = this.department_name;
        builder.organization_name = this.organization_name;
        builder.phonetic_organization_name = this.phonetic_organization_name;
        builder.postal_addresses = this.postal_addresses;
        builder.email_addresses = this.email_addresses;
        builder.url_addresses = this.url_addresses;
        builder.instant_message_addresses = this.instant_message_addresses;
        builder.phone_numbers = this.phone_numbers;
        builder.social_profiles = this.social_profiles;
        builder.birthday = this.birthday;
        builder.non_gregorian_birthday = this.non_gregorian_birthday;
        builder.dates = this.dates;
        builder.has_note = this.has_note;
        builder.relations = this.relations;
        builder.has_image = this.has_image;
        builder.image_resolution = this.image_resolution;
        builder.image_size_bytes = this.image_size_bytes;
        builder.image_exif_data = this.image_exif_data;
        builder.contact_id = this.contact_id;
        builder.potential_account_source = this.potential_account_source;
        builder.canonicalized_phone_numbers = this.canonicalized_phone_numbers;
        builder.canonicalized_email_addresses = this.canonicalized_email_addresses;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name_prefix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name_prefix=", arrayList);
        }
        String str2 = this.given_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "given_name=", arrayList);
        }
        String str3 = this.middle_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "middle_name=", arrayList);
        }
        if (this.family_name != null) {
            arrayList.add("family_name=██");
        }
        String str4 = this.previous_family_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "previous_family_name=", arrayList);
        }
        String str5 = this.name_suffix;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "name_suffix=", arrayList);
        }
        String str6 = this.nickname;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "nickname=", arrayList);
        }
        String str7 = this.phonetic_given_name;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "phonetic_given_name=", arrayList);
        }
        String str8 = this.phonetic_middle_name;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "phonetic_middle_name=", arrayList);
        }
        String str9 = this.phonetic_family_name;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "phonetic_family_name=", arrayList);
        }
        String str10 = this.job_title;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "job_title=", arrayList);
        }
        String str11 = this.department_name;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "department_name=", arrayList);
        }
        String str12 = this.organization_name;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "organization_name=", arrayList);
        }
        String str13 = this.phonetic_organization_name;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "phonetic_organization_name=", arrayList);
        }
        List list = this.postal_addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("postal_addresses=", arrayList, list);
        }
        List list2 = this.email_addresses;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("email_addresses=", arrayList, list2);
        }
        List list3 = this.url_addresses;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("url_addresses=", arrayList, list3);
        }
        List list4 = this.instant_message_addresses;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instant_message_addresses=", arrayList, list4);
        }
        List list5 = this.phone_numbers;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("phone_numbers=", arrayList, list5);
        }
        List list6 = this.social_profiles;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("social_profiles=", arrayList, list6);
        }
        String str14 = this.birthday;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "birthday=", arrayList);
        }
        String str15 = this.non_gregorian_birthday;
        if (str15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str15, "non_gregorian_birthday=", arrayList);
        }
        List list7 = this.dates;
        if (!list7.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("dates=", arrayList, list7);
        }
        Boolean bool = this.has_note;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_note=", bool, arrayList);
        }
        List list8 = this.relations;
        if (!list8.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("relations=", arrayList, list8);
        }
        Boolean bool2 = this.has_image;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_image=", bool2, arrayList);
        }
        ImageResolution imageResolution = this.image_resolution;
        if (imageResolution != null) {
            arrayList.add("image_resolution=" + imageResolution);
        }
        Long l = this.image_size_bytes;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("image_size_bytes=", l, arrayList);
        }
        ImageExifData imageExifData = this.image_exif_data;
        if (imageExifData != null) {
            arrayList.add("image_exif_data=" + imageExifData);
        }
        String str16 = this.contact_id;
        if (str16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str16, "contact_id=", arrayList);
        }
        String str17 = this.potential_account_source;
        if (str17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str17, "potential_account_source=", arrayList);
        }
        List list9 = this.canonicalized_phone_numbers;
        if (!list9.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("canonicalized_phone_numbers=", arrayList, list9);
        }
        List list10 = this.canonicalized_email_addresses;
        if (!list10.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("canonicalized_email_addresses=", arrayList, list10);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddressBookContact{", "}", 0, null, null, 56);
    }
}
