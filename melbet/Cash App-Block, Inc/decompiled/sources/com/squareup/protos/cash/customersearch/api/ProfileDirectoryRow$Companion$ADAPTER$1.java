package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import app.cash.zipline.internal.bridge.InternalSerializersKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectoryRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        InternalSerializersKt profileDirectoryRow$Action$Url;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        InternalSerializersKt internalSerializersKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectoryRow((String) obj, (String) obj2, (String) obj3, (Avatar) obj4, (HighlightText) obj5, (HighlightText) obj6, (HighlightText) obj7, (Image) obj8, (String) obj9, (Button) obj10, (Metadata) obj11, internalSerializersKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
                    continue;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj5);
                    continue;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj6);
                    continue;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj10);
                    continue;
                case 8:
                    obj11 = TransactorKt.decodeMessageOrMerge(Metadata.ADAPTER, protoReader, obj11);
                    continue;
                case 9:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj7);
                    continue;
                case 11:
                    profileDirectoryRow$Action$Url = new ProfileDirectoryRow$Action$Url((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 12:
                    profileDirectoryRow$Action$Url = new ProfileDirectoryRow$Action$HalfSheet((ShopInfoHalfSheet) ShopInfoHalfSheet.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            internalSerializersKt = profileDirectoryRow$Action$Url;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) obj;
        reverseProtoWriter.getClass();
        profileDirectoryRow.getClass();
        reverseProtoWriter.writeBytes(profileDirectoryRow.unknownFields());
        InternalSerializersKt internalSerializersKt = profileDirectoryRow.action;
        if (internalSerializersKt instanceof ProfileDirectoryRow$Action$Url) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 11, ((ProfileDirectoryRow$Action$Url) internalSerializersKt).value);
        } else if (internalSerializersKt instanceof ProfileDirectoryRow$Action$HalfSheet) {
            ShopInfoHalfSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ProfileDirectoryRow$Action$HalfSheet) internalSerializersKt).value);
        } else if (internalSerializersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 8, profileDirectoryRow.metadata);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 7, profileDirectoryRow.button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, profileDirectoryRow.action_url);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, profileDirectoryRow.icon);
        ProtoAdapter protoAdapter2 = HighlightText.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, profileDirectoryRow.sub_child_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, profileDirectoryRow.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, profileDirectoryRow.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, profileDirectoryRow.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, profileDirectoryRow.merchantein_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, profileDirectoryRow.account_holder_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, profileDirectoryRow.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) obj;
        profileDirectoryRow.getClass();
        int size$okio = profileDirectoryRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(2, profileDirectoryRow.avatar) + protoAdapter.encodedSizeWithTag(9, profileDirectoryRow.merchantein_token) + protoAdapter.encodedSizeWithTag(13, profileDirectoryRow.account_holder_token) + protoAdapter.encodedSizeWithTag(1, profileDirectoryRow.token) + size$okio;
        ProtoAdapter protoAdapter2 = HighlightText.ADAPTER;
        int encodedSizeWithTag2 = Metadata.ADAPTER.encodedSizeWithTag(8, profileDirectoryRow.metadata) + Button.ADAPTER.encodedSizeWithTag(7, profileDirectoryRow.button) + protoAdapter.encodedSizeWithTag(6, profileDirectoryRow.action_url) + Image.ADAPTER.encodedSizeWithTag(5, profileDirectoryRow.icon) + protoAdapter2.encodedSizeWithTag(10, profileDirectoryRow.sub_child_title) + protoAdapter2.encodedSizeWithTag(4, profileDirectoryRow.subtitle) + protoAdapter2.encodedSizeWithTag(3, profileDirectoryRow.title) + encodedSizeWithTag;
        InternalSerializersKt internalSerializersKt = profileDirectoryRow.action;
        if (internalSerializersKt instanceof ProfileDirectoryRow$Action$Url) {
            return protoAdapter.encodedSizeWithTag(11, ((ProfileDirectoryRow$Action$Url) internalSerializersKt).value) + encodedSizeWithTag2;
        }
        if (internalSerializersKt instanceof ProfileDirectoryRow$Action$HalfSheet) {
            return ShopInfoHalfSheet.ADAPTER.encodedSizeWithTag(12, ((ProfileDirectoryRow$Action$HalfSheet) internalSerializersKt).value) + encodedSizeWithTag2;
        }
        if (internalSerializersKt == null) {
            return encodedSizeWithTag2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) obj;
        profileDirectoryRow.getClass();
        Avatar avatar = profileDirectoryRow.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Button button = profileDirectoryRow.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Metadata metadata = profileDirectoryRow.metadata;
        Metadata metadata2 = metadata != null ? (Metadata) Metadata.ADAPTER.redact(metadata) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = profileDirectoryRow.token;
        String str2 = profileDirectoryRow.account_holder_token;
        String str3 = profileDirectoryRow.merchantein_token;
        InternalSerializersKt internalSerializersKt = profileDirectoryRow.action;
        byteString.getClass();
        return new ProfileDirectoryRow(str, str2, str3, avatar2, null, null, null, null, null, button2, metadata2, internalSerializersKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) obj;
        profileDirectoryRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, profileDirectoryRow.token);
        protoAdapter.encodeWithTag(protoWriter, 13, profileDirectoryRow.account_holder_token);
        protoAdapter.encodeWithTag(protoWriter, 9, profileDirectoryRow.merchantein_token);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, profileDirectoryRow.avatar);
        ProtoAdapter protoAdapter2 = HighlightText.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, profileDirectoryRow.title);
        protoAdapter2.encodeWithTag(protoWriter, 4, profileDirectoryRow.subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 10, profileDirectoryRow.sub_child_title);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, profileDirectoryRow.icon);
        protoAdapter.encodeWithTag(protoWriter, 6, profileDirectoryRow.action_url);
        Button.ADAPTER.encodeWithTag(protoWriter, 7, profileDirectoryRow.button);
        Metadata.ADAPTER.encodeWithTag(protoWriter, 8, profileDirectoryRow.metadata);
        InternalSerializersKt internalSerializersKt = profileDirectoryRow.action;
        if (internalSerializersKt instanceof ProfileDirectoryRow$Action$Url) {
            protoAdapter.encodeWithTag(protoWriter, 11, ((ProfileDirectoryRow$Action$Url) internalSerializersKt).value);
        } else if (internalSerializersKt instanceof ProfileDirectoryRow$Action$HalfSheet) {
            ShopInfoHalfSheet.ADAPTER.encodeWithTag(protoWriter, 12, ((ProfileDirectoryRow$Action$HalfSheet) internalSerializersKt).value);
        } else if (internalSerializersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(profileDirectoryRow.unknownFields());
    }
}
