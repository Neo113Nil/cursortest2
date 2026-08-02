package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KybEligibilityWarning$BannerDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KybEligibilityWarning.BannerDetail((KybEligibilityWarning.RestrictedFeature) obj, (String) obj2, (String) obj3, (KybEligibilityWarning.Action) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = KybEligibilityWarning.RestrictedFeature.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(KybEligibilityWarning.Action.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) obj;
        reverseProtoWriter.getClass();
        bannerDetail.getClass();
        reverseProtoWriter.writeBytes(bannerDetail.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, bannerDetail.subtitle_with_markdown);
        KybEligibilityWarning.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bannerDetail.action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bannerDetail.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bannerDetail.title);
        KybEligibilityWarning.RestrictedFeature.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bannerDetail.restricted_feature);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) obj;
        bannerDetail.getClass();
        int encodedSizeWithTag = KybEligibilityWarning.RestrictedFeature.ADAPTER.encodedSizeWithTag(1, bannerDetail.restricted_feature) + bannerDetail.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, bannerDetail.subtitle_with_markdown) + KybEligibilityWarning.Action.ADAPTER.encodedSizeWithTag(4, bannerDetail.action) + protoAdapter.encodedSizeWithTag(3, bannerDetail.subtitle) + protoAdapter.encodedSizeWithTag(2, bannerDetail.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) obj;
        bannerDetail.getClass();
        KybEligibilityWarning.Action action = bannerDetail.action;
        KybEligibilityWarning.Action action2 = action != null ? (KybEligibilityWarning.Action) KybEligibilityWarning.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        KybEligibilityWarning.RestrictedFeature restrictedFeature = bannerDetail.restricted_feature;
        byteString.getClass();
        return new KybEligibilityWarning.BannerDetail(restrictedFeature, null, null, action2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) obj;
        bannerDetail.getClass();
        KybEligibilityWarning.RestrictedFeature.ADAPTER.encodeWithTag(protoWriter, 1, bannerDetail.restricted_feature);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, bannerDetail.title);
        protoAdapter.encodeWithTag(protoWriter, 3, bannerDetail.subtitle);
        KybEligibilityWarning.Action.ADAPTER.encodeWithTag(protoWriter, 4, bannerDetail.action);
        protoAdapter.encodeWithTag(protoWriter, 5, bannerDetail.subtitle_with_markdown);
        protoWriter.writeBytes(bannerDetail.unknownFields());
    }
}
