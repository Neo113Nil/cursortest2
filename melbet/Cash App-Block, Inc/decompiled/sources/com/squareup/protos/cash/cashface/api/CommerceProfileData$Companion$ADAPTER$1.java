package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceProfileData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Avatar avatar;
        Location location;
        SocialAccounts socialAccounts;
        ?? decode;
        Avatar avatar2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Avatar avatar3 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Location location2 = null;
        SocialAccounts socialAccounts2 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        String str2 = null;
        String str3 = null;
        Region region = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CommerceProfileData(avatar3, str, str2, str3, location2, socialAccounts2, (Category) obj4, (TrustsData) obj5, (Activity) obj6, (ProfileAction) obj7, (ProfileAction) obj, (ProfileAction) obj2, m, arrayList, (Image) obj3, (Banner) obj8, region, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    location2 = location2;
                    avatar3 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, avatar3);
                    decode = str;
                    break;
                case 2:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    avatar3 = avatar3;
                    break;
                case 3:
                    avatar2 = avatar3;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    avatar3 = avatar2;
                    decode = str;
                    break;
                case 4:
                    avatar2 = avatar3;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    avatar3 = avatar2;
                    decode = str;
                    break;
                case 5:
                    avatar2 = avatar3;
                    location2 = TransactorKt.decodeMessageOrMerge(Location.ADAPTER, protoReader, location2);
                    avatar3 = avatar2;
                    decode = str;
                    break;
                case 6:
                    socialAccounts2 = TransactorKt.decodeMessageOrMerge(SocialAccounts.ADAPTER, protoReader, socialAccounts2);
                    decode = str;
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(Category.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(TrustsData.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(Activity.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(ProfileAction.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 11:
                    obj = TransactorKt.decodeMessageOrMerge(ProfileAction.ADAPTER, protoReader, obj);
                    decode = str;
                    break;
                case 12:
                    obj2 = TransactorKt.decodeMessageOrMerge(ProfileAction.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 13:
                    avatar = avatar3;
                    location = location2;
                    socialAccounts = socialAccounts2;
                    m.add(CounterAbuseAction.ADAPTER.decode(protoReader));
                    decode = str;
                    avatar3 = avatar;
                    location2 = location;
                    socialAccounts2 = socialAccounts;
                    break;
                case 14:
                    avatar = avatar3;
                    location = location2;
                    socialAccounts = socialAccounts2;
                    arrayList.add(UtilityAction.ADAPTER.decode(protoReader));
                    decode = str;
                    avatar3 = avatar;
                    location2 = location;
                    socialAccounts2 = socialAccounts;
                    break;
                case 15:
                    obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 16:
                    obj8 = TransactorKt.decodeMessageOrMerge(Banner.ADAPTER, protoReader, obj8);
                    decode = str;
                    break;
                case 17:
                    try {
                        region = Region.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        avatar = avatar3;
                        location = location2;
                        socialAccounts = socialAccounts2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    avatar = avatar3;
                    location = location2;
                    socialAccounts = socialAccounts2;
                    decode = str;
                    avatar3 = avatar;
                    location2 = location;
                    socialAccounts2 = socialAccounts;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CommerceProfileData commerceProfileData = (CommerceProfileData) obj;
        reverseProtoWriter.getClass();
        commerceProfileData.getClass();
        reverseProtoWriter.writeBytes(commerceProfileData.unknownFields());
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 17, commerceProfileData.region);
        Banner.ADAPTER.encodeWithTag(reverseProtoWriter, 16, commerceProfileData.banner);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 15, commerceProfileData.profile_identity_icon);
        UtilityAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 14, commerceProfileData.utility_actions);
        CounterAbuseAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 13, commerceProfileData.counter_abuse_actions);
        ProtoAdapter protoAdapter = ProfileAction.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, commerceProfileData.toggle_favorite_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, commerceProfileData.request_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, commerceProfileData.pay_action);
        Activity.ADAPTER.encodeWithTag(reverseProtoWriter, 9, commerceProfileData.activity);
        TrustsData.ADAPTER.encodeWithTag(reverseProtoWriter, 8, commerceProfileData.trusts);
        Category.ADAPTER.encodeWithTag(reverseProtoWriter, 7, commerceProfileData.category);
        SocialAccounts.ADAPTER.encodeWithTag(reverseProtoWriter, 6, commerceProfileData.socials);
        Location.ADAPTER.encodeWithTag(reverseProtoWriter, 5, commerceProfileData.location);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, commerceProfileData.description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, commerceProfileData.cashtag);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, commerceProfileData.name);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, commerceProfileData.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CommerceProfileData commerceProfileData = (CommerceProfileData) obj;
        commerceProfileData.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(1, commerceProfileData.avatar) + commerceProfileData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = Activity.ADAPTER.encodedSizeWithTag(9, commerceProfileData.activity) + TrustsData.ADAPTER.encodedSizeWithTag(8, commerceProfileData.trusts) + Category.ADAPTER.encodedSizeWithTag(7, commerceProfileData.category) + SocialAccounts.ADAPTER.encodedSizeWithTag(6, commerceProfileData.socials) + Location.ADAPTER.encodedSizeWithTag(5, commerceProfileData.location) + protoAdapter.encodedSizeWithTag(4, commerceProfileData.description) + protoAdapter.encodedSizeWithTag(3, commerceProfileData.cashtag) + protoAdapter.encodedSizeWithTag(2, commerceProfileData.name) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProfileAction.ADAPTER;
        return Region.ADAPTER.encodedSizeWithTag(17, commerceProfileData.region) + Banner.ADAPTER.encodedSizeWithTag(16, commerceProfileData.banner) + Image.ADAPTER.encodedSizeWithTag(15, commerceProfileData.profile_identity_icon) + UtilityAction.ADAPTER.asRepeated().encodedSizeWithTag(14, commerceProfileData.utility_actions) + CounterAbuseAction.ADAPTER.asRepeated().encodedSizeWithTag(13, commerceProfileData.counter_abuse_actions) + protoAdapter2.encodedSizeWithTag(12, commerceProfileData.toggle_favorite_action) + protoAdapter2.encodedSizeWithTag(11, commerceProfileData.request_action) + protoAdapter2.encodedSizeWithTag(10, commerceProfileData.pay_action) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CommerceProfileData commerceProfileData = (CommerceProfileData) obj;
        commerceProfileData.getClass();
        Avatar avatar = commerceProfileData.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Location location = commerceProfileData.location;
        Location location2 = location != null ? (Location) Location.ADAPTER.redact(location) : null;
        SocialAccounts socialAccounts = commerceProfileData.socials;
        SocialAccounts socialAccounts2 = socialAccounts != null ? (SocialAccounts) SocialAccounts.ADAPTER.redact(socialAccounts) : null;
        Category category = commerceProfileData.category;
        Category category2 = category != null ? (Category) Category.ADAPTER.redact(category) : null;
        TrustsData trustsData = commerceProfileData.trusts;
        TrustsData trustsData2 = trustsData != null ? (TrustsData) TrustsData.ADAPTER.redact(trustsData) : null;
        Activity activity = commerceProfileData.activity;
        Activity activity2 = activity != null ? (Activity) Activity.ADAPTER.redact(activity) : null;
        ProfileAction profileAction = commerceProfileData.pay_action;
        ProfileAction profileAction2 = profileAction != null ? (ProfileAction) ProfileAction.ADAPTER.redact(profileAction) : null;
        ProfileAction profileAction3 = commerceProfileData.request_action;
        ProfileAction profileAction4 = profileAction3 != null ? (ProfileAction) ProfileAction.ADAPTER.redact(profileAction3) : null;
        ProfileAction profileAction5 = commerceProfileData.toggle_favorite_action;
        ProfileAction profileAction6 = profileAction5 != null ? (ProfileAction) ProfileAction.ADAPTER.redact(profileAction5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(commerceProfileData.counter_abuse_actions, CounterAbuseAction.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(commerceProfileData.utility_actions, UtilityAction.ADAPTER);
        Image image = commerceProfileData.profile_identity_icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Banner banner = commerceProfileData.banner;
        Banner banner2 = banner != null ? (Banner) Banner.ADAPTER.redact(banner) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CommerceProfileData(avatar2, null, null, null, location2, socialAccounts2, category2, trustsData2, activity2, profileAction2, profileAction4, profileAction6, m1169redactElements, m1169redactElements2, image2, banner2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CommerceProfileData commerceProfileData = (CommerceProfileData) obj;
        commerceProfileData.getClass();
        Avatar.ADAPTER.encodeWithTag(protoWriter, 1, commerceProfileData.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, commerceProfileData.name);
        protoAdapter.encodeWithTag(protoWriter, 3, commerceProfileData.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 4, commerceProfileData.description);
        Location.ADAPTER.encodeWithTag(protoWriter, 5, commerceProfileData.location);
        SocialAccounts.ADAPTER.encodeWithTag(protoWriter, 6, commerceProfileData.socials);
        Category.ADAPTER.encodeWithTag(protoWriter, 7, commerceProfileData.category);
        TrustsData.ADAPTER.encodeWithTag(protoWriter, 8, commerceProfileData.trusts);
        Activity.ADAPTER.encodeWithTag(protoWriter, 9, commerceProfileData.activity);
        ProtoAdapter protoAdapter2 = ProfileAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 10, commerceProfileData.pay_action);
        protoAdapter2.encodeWithTag(protoWriter, 11, commerceProfileData.request_action);
        protoAdapter2.encodeWithTag(protoWriter, 12, commerceProfileData.toggle_favorite_action);
        CounterAbuseAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, commerceProfileData.counter_abuse_actions);
        UtilityAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, commerceProfileData.utility_actions);
        Image.ADAPTER.encodeWithTag(protoWriter, 15, commerceProfileData.profile_identity_icon);
        Banner.ADAPTER.encodeWithTag(protoWriter, 16, commerceProfileData.banner);
        Region.ADAPTER.encodeWithTag(protoWriter, 17, commerceProfileData.region);
        protoWriter.writeBytes(commerceProfileData.unknownFields());
    }
}
