package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCheckoutBrandSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCheckoutBrandSummary((String) obj, (Boolean) obj2, (LocalImage) obj3, (String) obj4, (LocalColor) obj5, (FeatureSet) obj6, (String) obj7, (LocalColor) obj8, (String) obj9, (LocalCheckoutBrandSummary.AfterPayConfiguration) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(FeatureSet.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalCheckoutBrandSummary.AfterPayConfiguration.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCheckoutBrandSummary localCheckoutBrandSummary = (LocalCheckoutBrandSummary) obj;
        reverseProtoWriter.getClass();
        localCheckoutBrandSummary.getClass();
        reverseProtoWriter.writeBytes(localCheckoutBrandSummary.unknownFields());
        LocalCheckoutBrandSummary.AfterPayConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 10, localCheckoutBrandSummary.after_pay_configuration);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, localCheckoutBrandSummary.policies);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, localCheckoutBrandSummary.brand_card_outline_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, localCheckoutBrandSummary.name);
        FeatureSet.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localCheckoutBrandSummary.feature_set);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, localCheckoutBrandSummary.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localCheckoutBrandSummary.cashtag);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localCheckoutBrandSummary.artwork_image);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, localCheckoutBrandSummary.allow_checkout_notes);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localCheckoutBrandSummary.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCheckoutBrandSummary localCheckoutBrandSummary = (LocalCheckoutBrandSummary) obj;
        localCheckoutBrandSummary.getClass();
        int size$okio = localCheckoutBrandSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, localCheckoutBrandSummary.cashtag) + LocalImage.ADAPTER.encodedSizeWithTag(3, localCheckoutBrandSummary.artwork_image) + ProtoAdapter.BOOL.encodedSizeWithTag(2, localCheckoutBrandSummary.allow_checkout_notes) + protoAdapter.encodedSizeWithTag(1, localCheckoutBrandSummary.token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        return LocalCheckoutBrandSummary.AfterPayConfiguration.ADAPTER.encodedSizeWithTag(10, localCheckoutBrandSummary.after_pay_configuration) + protoAdapter.encodedSizeWithTag(9, localCheckoutBrandSummary.policies) + protoAdapter2.encodedSizeWithTag(8, localCheckoutBrandSummary.brand_card_outline_color) + protoAdapter.encodedSizeWithTag(7, localCheckoutBrandSummary.name) + FeatureSet.ADAPTER.encodedSizeWithTag(6, localCheckoutBrandSummary.feature_set) + protoAdapter2.encodedSizeWithTag(5, localCheckoutBrandSummary.background_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCheckoutBrandSummary localCheckoutBrandSummary = (LocalCheckoutBrandSummary) obj;
        localCheckoutBrandSummary.getClass();
        LocalImage localImage = localCheckoutBrandSummary.artwork_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalColor localColor = localCheckoutBrandSummary.background_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        FeatureSet featureSet = localCheckoutBrandSummary.feature_set;
        FeatureSet featureSet2 = featureSet != null ? (FeatureSet) FeatureSet.ADAPTER.redact(featureSet) : null;
        LocalColor localColor3 = localCheckoutBrandSummary.brand_card_outline_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration = localCheckoutBrandSummary.after_pay_configuration;
        LocalCheckoutBrandSummary.AfterPayConfiguration afterPayConfiguration2 = afterPayConfiguration != null ? (LocalCheckoutBrandSummary.AfterPayConfiguration) LocalCheckoutBrandSummary.AfterPayConfiguration.ADAPTER.redact(afterPayConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCheckoutBrandSummary.token;
        Boolean bool = localCheckoutBrandSummary.allow_checkout_notes;
        String str2 = localCheckoutBrandSummary.name;
        String str3 = localCheckoutBrandSummary.policies;
        byteString.getClass();
        return new LocalCheckoutBrandSummary(str, bool, localImage2, null, localColor2, featureSet2, str2, localColor4, str3, afterPayConfiguration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCheckoutBrandSummary localCheckoutBrandSummary = (LocalCheckoutBrandSummary) obj;
        localCheckoutBrandSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localCheckoutBrandSummary.token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, localCheckoutBrandSummary.allow_checkout_notes);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 3, localCheckoutBrandSummary.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 4, localCheckoutBrandSummary.cashtag);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, localCheckoutBrandSummary.background_color);
        FeatureSet.ADAPTER.encodeWithTag(protoWriter, 6, localCheckoutBrandSummary.feature_set);
        protoAdapter.encodeWithTag(protoWriter, 7, localCheckoutBrandSummary.name);
        protoAdapter2.encodeWithTag(protoWriter, 8, localCheckoutBrandSummary.brand_card_outline_color);
        protoAdapter.encodeWithTag(protoWriter, 9, localCheckoutBrandSummary.policies);
        LocalCheckoutBrandSummary.AfterPayConfiguration.ADAPTER.encodeWithTag(protoWriter, 10, localCheckoutBrandSummary.after_pay_configuration);
        protoWriter.writeBytes(localCheckoutBrandSummary.unknownFields());
    }
}
