package com.squareup.protos.cash.contacts.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddressBookContact$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        String str = null;
        Object obj2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            long j = beginMessage;
            if (nextTag == -1) {
                return new AddressBookContact(str, str15, str18, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, m, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str13, str14, arrayList6, bool, arrayList7, bool2, (ImageResolution) obj, l, (ImageExifData) obj2, str16, str17, arrayList8, arrayList9, protoReader.endMessageAndGetUnknownFields(j));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str15 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str18 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 13:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 14:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 15:
                    m.add(PostalAddress.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    arrayList.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    arrayList2.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    arrayList3.add(InstantMessageAddress.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    arrayList4.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    arrayList5.add(SocialProfile.ADAPTER.decode(protoReader));
                    break;
                case 21:
                    str13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 22:
                    str14 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 23:
                    arrayList6.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 24:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 25:
                    arrayList7.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 26:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 27:
                    obj = TransactorKt.decodeMessageOrMerge(ImageResolution.ADAPTER, protoReader, obj);
                    break;
                case 28:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 29:
                    obj2 = TransactorKt.decodeMessageOrMerge(ImageExifData.ADAPTER, protoReader, obj2);
                    break;
                case 30:
                    str16 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 31:
                    str17 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 32:
                    arrayList8.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                case 33:
                    arrayList9.add(LabeledString.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            decode = str;
            str = decode;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddressBookContact addressBookContact = (AddressBookContact) obj;
        reverseProtoWriter.getClass();
        addressBookContact.getClass();
        reverseProtoWriter.writeBytes(addressBookContact.unknownFields());
        ProtoAdapter protoAdapter = LabeledString.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 33, addressBookContact.canonicalized_email_addresses);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 32, addressBookContact.canonicalized_phone_numbers);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 31, addressBookContact.potential_account_source);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 30, addressBookContact.contact_id);
        ImageExifData.ADAPTER.encodeWithTag(reverseProtoWriter, 29, addressBookContact.image_exif_data);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 28, addressBookContact.image_size_bytes);
        ImageResolution.ADAPTER.encodeWithTag(reverseProtoWriter, 27, addressBookContact.image_resolution);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 26, addressBookContact.has_image);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 25, addressBookContact.relations);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 24, addressBookContact.has_note);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 23, addressBookContact.dates);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 22, addressBookContact.non_gregorian_birthday);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 21, addressBookContact.birthday);
        SocialProfile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 20, addressBookContact.social_profiles);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 19, addressBookContact.phone_numbers);
        InstantMessageAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 18, addressBookContact.instant_message_addresses);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 17, addressBookContact.url_addresses);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 16, addressBookContact.email_addresses);
        PostalAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 15, addressBookContact.postal_addresses);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, addressBookContact.phonetic_organization_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, addressBookContact.organization_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, addressBookContact.department_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, addressBookContact.job_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, addressBookContact.phonetic_family_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, addressBookContact.phonetic_middle_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, addressBookContact.phonetic_given_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, addressBookContact.nickname);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, addressBookContact.name_suffix);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, addressBookContact.previous_family_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, addressBookContact.family_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, addressBookContact.middle_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, addressBookContact.given_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addressBookContact.name_prefix);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddressBookContact addressBookContact = (AddressBookContact) obj;
        addressBookContact.getClass();
        int size$okio = addressBookContact.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = PostalAddress.ADAPTER.asRepeated().encodedSizeWithTag(15, addressBookContact.postal_addresses) + protoAdapter.encodedSizeWithTag(14, addressBookContact.phonetic_organization_name) + protoAdapter.encodedSizeWithTag(13, addressBookContact.organization_name) + protoAdapter.encodedSizeWithTag(12, addressBookContact.department_name) + protoAdapter.encodedSizeWithTag(11, addressBookContact.job_title) + protoAdapter.encodedSizeWithTag(10, addressBookContact.phonetic_family_name) + protoAdapter.encodedSizeWithTag(9, addressBookContact.phonetic_middle_name) + protoAdapter.encodedSizeWithTag(8, addressBookContact.phonetic_given_name) + protoAdapter.encodedSizeWithTag(7, addressBookContact.nickname) + protoAdapter.encodedSizeWithTag(6, addressBookContact.name_suffix) + protoAdapter.encodedSizeWithTag(5, addressBookContact.previous_family_name) + protoAdapter.encodedSizeWithTag(4, addressBookContact.family_name) + protoAdapter.encodedSizeWithTag(3, addressBookContact.middle_name) + protoAdapter.encodedSizeWithTag(2, addressBookContact.given_name) + protoAdapter.encodedSizeWithTag(1, addressBookContact.name_prefix) + size$okio;
        ProtoAdapter protoAdapter2 = LabeledString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.asRepeated().encodedSizeWithTag(23, addressBookContact.dates) + protoAdapter.encodedSizeWithTag(22, addressBookContact.non_gregorian_birthday) + protoAdapter.encodedSizeWithTag(21, addressBookContact.birthday) + SocialProfile.ADAPTER.asRepeated().encodedSizeWithTag(20, addressBookContact.social_profiles) + protoAdapter2.asRepeated().encodedSizeWithTag(19, addressBookContact.phone_numbers) + InstantMessageAddress.ADAPTER.asRepeated().encodedSizeWithTag(18, addressBookContact.instant_message_addresses) + protoAdapter2.asRepeated().encodedSizeWithTag(17, addressBookContact.url_addresses) + protoAdapter2.asRepeated().encodedSizeWithTag(16, addressBookContact.email_addresses) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter2.asRepeated().encodedSizeWithTag(33, addressBookContact.canonicalized_email_addresses) + protoAdapter2.asRepeated().encodedSizeWithTag(32, addressBookContact.canonicalized_phone_numbers) + protoAdapter.encodedSizeWithTag(31, addressBookContact.potential_account_source) + protoAdapter.encodedSizeWithTag(30, addressBookContact.contact_id) + ImageExifData.ADAPTER.encodedSizeWithTag(29, addressBookContact.image_exif_data) + ProtoAdapter.INT64.encodedSizeWithTag(28, addressBookContact.image_size_bytes) + ImageResolution.ADAPTER.encodedSizeWithTag(27, addressBookContact.image_resolution) + protoAdapter3.encodedSizeWithTag(26, addressBookContact.has_image) + protoAdapter2.asRepeated().encodedSizeWithTag(25, addressBookContact.relations) + protoAdapter3.encodedSizeWithTag(24, addressBookContact.has_note) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddressBookContact addressBookContact = (AddressBookContact) obj;
        addressBookContact.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(addressBookContact.postal_addresses, PostalAddress.ADAPTER);
        List list = addressBookContact.email_addresses;
        ProtoAdapter protoAdapter = LabeledString.ADAPTER;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(addressBookContact.url_addresses, protoAdapter);
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(addressBookContact.instant_message_addresses, InstantMessageAddress.ADAPTER);
        ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(addressBookContact.phone_numbers, protoAdapter);
        ArrayList m1169redactElements6 = TransactorKt.m1169redactElements(addressBookContact.social_profiles, SocialProfile.ADAPTER);
        ArrayList m1169redactElements7 = TransactorKt.m1169redactElements(addressBookContact.dates, protoAdapter);
        ArrayList m1169redactElements8 = TransactorKt.m1169redactElements(addressBookContact.relations, protoAdapter);
        ImageResolution imageResolution = addressBookContact.image_resolution;
        ImageResolution imageResolution2 = imageResolution != null ? (ImageResolution) ImageResolution.ADAPTER.redact(imageResolution) : null;
        ImageExifData imageExifData = addressBookContact.image_exif_data;
        ImageExifData imageExifData2 = imageExifData != null ? (ImageExifData) ImageExifData.ADAPTER.redact(imageExifData) : null;
        ArrayList m1169redactElements9 = TransactorKt.m1169redactElements(addressBookContact.canonicalized_phone_numbers, protoAdapter);
        ArrayList m1169redactElements10 = TransactorKt.m1169redactElements(addressBookContact.canonicalized_email_addresses, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        String str = addressBookContact.name_prefix;
        String str2 = addressBookContact.given_name;
        String str3 = addressBookContact.middle_name;
        String str4 = addressBookContact.previous_family_name;
        String str5 = addressBookContact.name_suffix;
        String str6 = addressBookContact.nickname;
        String str7 = addressBookContact.phonetic_given_name;
        String str8 = addressBookContact.phonetic_middle_name;
        String str9 = addressBookContact.phonetic_family_name;
        String str10 = addressBookContact.job_title;
        String str11 = addressBookContact.department_name;
        String str12 = addressBookContact.organization_name;
        String str13 = addressBookContact.phonetic_organization_name;
        String str14 = addressBookContact.birthday;
        String str15 = addressBookContact.non_gregorian_birthday;
        Boolean bool = addressBookContact.has_note;
        Boolean bool2 = addressBookContact.has_image;
        Long l = addressBookContact.image_size_bytes;
        String str16 = addressBookContact.contact_id;
        String str17 = addressBookContact.potential_account_source;
        byteString.getClass();
        return new AddressBookContact(str, str2, str3, null, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, m1169redactElements, m1169redactElements2, m1169redactElements3, m1169redactElements4, m1169redactElements5, m1169redactElements6, str14, str15, m1169redactElements7, bool, m1169redactElements8, bool2, imageResolution2, l, imageExifData2, str16, str17, m1169redactElements9, m1169redactElements10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddressBookContact addressBookContact = (AddressBookContact) obj;
        addressBookContact.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, addressBookContact.name_prefix);
        protoAdapter.encodeWithTag(protoWriter, 2, addressBookContact.given_name);
        protoAdapter.encodeWithTag(protoWriter, 3, addressBookContact.middle_name);
        protoAdapter.encodeWithTag(protoWriter, 4, addressBookContact.family_name);
        protoAdapter.encodeWithTag(protoWriter, 5, addressBookContact.previous_family_name);
        protoAdapter.encodeWithTag(protoWriter, 6, addressBookContact.name_suffix);
        protoAdapter.encodeWithTag(protoWriter, 7, addressBookContact.nickname);
        protoAdapter.encodeWithTag(protoWriter, 8, addressBookContact.phonetic_given_name);
        protoAdapter.encodeWithTag(protoWriter, 9, addressBookContact.phonetic_middle_name);
        protoAdapter.encodeWithTag(protoWriter, 10, addressBookContact.phonetic_family_name);
        protoAdapter.encodeWithTag(protoWriter, 11, addressBookContact.job_title);
        protoAdapter.encodeWithTag(protoWriter, 12, addressBookContact.department_name);
        protoAdapter.encodeWithTag(protoWriter, 13, addressBookContact.organization_name);
        protoAdapter.encodeWithTag(protoWriter, 14, addressBookContact.phonetic_organization_name);
        PostalAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, addressBookContact.postal_addresses);
        ProtoAdapter protoAdapter2 = LabeledString.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 16, addressBookContact.email_addresses);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 17, addressBookContact.url_addresses);
        InstantMessageAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, addressBookContact.instant_message_addresses);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 19, addressBookContact.phone_numbers);
        SocialProfile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, addressBookContact.social_profiles);
        protoAdapter.encodeWithTag(protoWriter, 21, addressBookContact.birthday);
        protoAdapter.encodeWithTag(protoWriter, 22, addressBookContact.non_gregorian_birthday);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 23, addressBookContact.dates);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 24, addressBookContact.has_note);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 25, addressBookContact.relations);
        protoAdapter3.encodeWithTag(protoWriter, 26, addressBookContact.has_image);
        ImageResolution.ADAPTER.encodeWithTag(protoWriter, 27, addressBookContact.image_resolution);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 28, addressBookContact.image_size_bytes);
        ImageExifData.ADAPTER.encodeWithTag(protoWriter, 29, addressBookContact.image_exif_data);
        protoAdapter.encodeWithTag(protoWriter, 30, addressBookContact.contact_id);
        protoAdapter.encodeWithTag(protoWriter, 31, addressBookContact.potential_account_source);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 32, addressBookContact.canonicalized_phone_numbers);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 33, addressBookContact.canonicalized_email_addresses);
        protoWriter.writeBytes(addressBookContact.unknownFields());
    }
}
