package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.ui.DensityKt;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        DensityKt inAppBrowserMetadata$Metadata$CashAppPayMetadata;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        DensityKt densityKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserMetadata((String) obj, (ExternalAppLink) obj2, (String) obj3, (InAppBrowserMetadata.EntityInformation) obj4, (InAppBrowserMetadata.PresentingSource) obj5, densityKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(InAppBrowserMetadata.EntityInformation.ADAPTER, protoReader, obj4);
                    continue;
                case 4:
                    inAppBrowserMetadata$Metadata$CashAppPayMetadata = new InAppBrowserMetadata$Metadata$CashAppPayMetadata((InAppBrowserMetadata.IABMetadataCAP) InAppBrowserMetadata.IABMetadataCAP.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    inAppBrowserMetadata$Metadata$CashAppPayMetadata = new InAppBrowserMetadata$Metadata$AffiliateBoostMetadata((InAppBrowserMetadata.IABMetadataAffiliateBoost) InAppBrowserMetadata.IABMetadataAffiliateBoost.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    inAppBrowserMetadata$Metadata$CashAppPayMetadata = new InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata((InAppBrowserMetadata.IABMetadataAfterpay) InAppBrowserMetadata.IABMetadataAfterpay.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    inAppBrowserMetadata$Metadata$CashAppPayMetadata = new InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata((InAppBrowserMetadata.IABMetadataSUP) InAppBrowserMetadata.IABMetadataSUP.ADAPTER.decode(protoReader));
                    break;
                case 8:
                case 9:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 10:
                    obj2 = TransactorKt.decodeMessageOrMerge(ExternalAppLink.ADAPTER, protoReader, obj2);
                    continue;
                case 11:
                    try {
                        obj5 = InAppBrowserMetadata.PresentingSource.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
            }
            densityKt = inAppBrowserMetadata$Metadata$CashAppPayMetadata;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata inAppBrowserMetadata = (InAppBrowserMetadata) obj;
        reverseProtoWriter.getClass();
        inAppBrowserMetadata.getClass();
        reverseProtoWriter.writeBytes(inAppBrowserMetadata.unknownFields());
        DensityKt densityKt = inAppBrowserMetadata.metadata;
        if (densityKt instanceof InAppBrowserMetadata$Metadata$CashAppPayMetadata) {
            InAppBrowserMetadata.IABMetadataCAP.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((InAppBrowserMetadata$Metadata$CashAppPayMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) {
            InAppBrowserMetadata.IABMetadataAffiliateBoost.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) {
            InAppBrowserMetadata.IABMetadataAfterpay.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) {
            InAppBrowserMetadata.IABMetadataSUP.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) densityKt).value);
        } else if (densityKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        InAppBrowserMetadata.PresentingSource.ADAPTER.encodeWithTag(reverseProtoWriter, 11, inAppBrowserMetadata.presenting_source);
        InAppBrowserMetadata.EntityInformation.ADAPTER.encodeWithTag(reverseProtoWriter, 3, inAppBrowserMetadata.entity_info);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inAppBrowserMetadata.user_agent);
        ExternalAppLink.ADAPTER.encodeWithTag(reverseProtoWriter, 10, inAppBrowserMetadata.app_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, inAppBrowserMetadata.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata inAppBrowserMetadata = (InAppBrowserMetadata) obj;
        inAppBrowserMetadata.getClass();
        int size$okio = inAppBrowserMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = InAppBrowserMetadata.PresentingSource.ADAPTER.encodedSizeWithTag(11, inAppBrowserMetadata.presenting_source) + InAppBrowserMetadata.EntityInformation.ADAPTER.encodedSizeWithTag(3, inAppBrowserMetadata.entity_info) + protoAdapter.encodedSizeWithTag(2, inAppBrowserMetadata.user_agent) + ExternalAppLink.ADAPTER.encodedSizeWithTag(10, inAppBrowserMetadata.app_link) + protoAdapter.encodedSizeWithTag(1, inAppBrowserMetadata.url) + size$okio;
        DensityKt densityKt = inAppBrowserMetadata.metadata;
        if (densityKt instanceof InAppBrowserMetadata$Metadata$CashAppPayMetadata) {
            return InAppBrowserMetadata.IABMetadataCAP.ADAPTER.encodedSizeWithTag(4, ((InAppBrowserMetadata$Metadata$CashAppPayMetadata) densityKt).value) + encodedSizeWithTag;
        }
        if (densityKt instanceof InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) {
            return InAppBrowserMetadata.IABMetadataAffiliateBoost.ADAPTER.encodedSizeWithTag(5, ((InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) densityKt).value) + encodedSizeWithTag;
        }
        if (densityKt instanceof InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) {
            return InAppBrowserMetadata.IABMetadataAfterpay.ADAPTER.encodedSizeWithTag(6, ((InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) densityKt).value) + encodedSizeWithTag;
        }
        if (densityKt instanceof InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) {
            return InAppBrowserMetadata.IABMetadataSUP.ADAPTER.encodedSizeWithTag(7, ((InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) densityKt).value) + encodedSizeWithTag;
        }
        if (densityKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata inAppBrowserMetadata = (InAppBrowserMetadata) obj;
        inAppBrowserMetadata.getClass();
        ExternalAppLink externalAppLink = inAppBrowserMetadata.app_link;
        ExternalAppLink externalAppLink2 = externalAppLink != null ? (ExternalAppLink) ExternalAppLink.ADAPTER.redact(externalAppLink) : null;
        InAppBrowserMetadata.EntityInformation entityInformation = inAppBrowserMetadata.entity_info;
        InAppBrowserMetadata.EntityInformation entityInformation2 = entityInformation != null ? (InAppBrowserMetadata.EntityInformation) InAppBrowserMetadata.EntityInformation.ADAPTER.redact(entityInformation) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inAppBrowserMetadata.url;
        String str2 = inAppBrowserMetadata.user_agent;
        InAppBrowserMetadata.PresentingSource presentingSource = inAppBrowserMetadata.presenting_source;
        DensityKt densityKt = inAppBrowserMetadata.metadata;
        byteString.getClass();
        return new InAppBrowserMetadata(str, externalAppLink2, str2, entityInformation2, presentingSource, densityKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata inAppBrowserMetadata = (InAppBrowserMetadata) obj;
        inAppBrowserMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, inAppBrowserMetadata.url);
        ExternalAppLink.ADAPTER.encodeWithTag(protoWriter, 10, inAppBrowserMetadata.app_link);
        protoAdapter.encodeWithTag(protoWriter, 2, inAppBrowserMetadata.user_agent);
        InAppBrowserMetadata.EntityInformation.ADAPTER.encodeWithTag(protoWriter, 3, inAppBrowserMetadata.entity_info);
        InAppBrowserMetadata.PresentingSource.ADAPTER.encodeWithTag(protoWriter, 11, inAppBrowserMetadata.presenting_source);
        DensityKt densityKt = inAppBrowserMetadata.metadata;
        if (densityKt instanceof InAppBrowserMetadata$Metadata$CashAppPayMetadata) {
            InAppBrowserMetadata.IABMetadataCAP.ADAPTER.encodeWithTag(protoWriter, 4, ((InAppBrowserMetadata$Metadata$CashAppPayMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) {
            InAppBrowserMetadata.IABMetadataAffiliateBoost.ADAPTER.encodeWithTag(protoWriter, 5, ((InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) {
            InAppBrowserMetadata.IABMetadataAfterpay.ADAPTER.encodeWithTag(protoWriter, 6, ((InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) densityKt).value);
        } else if (densityKt instanceof InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) {
            InAppBrowserMetadata.IABMetadataSUP.ADAPTER.encodeWithTag(protoWriter, 7, ((InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) densityKt).value);
        } else if (densityKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inAppBrowserMetadata.unknownFields());
    }
}
