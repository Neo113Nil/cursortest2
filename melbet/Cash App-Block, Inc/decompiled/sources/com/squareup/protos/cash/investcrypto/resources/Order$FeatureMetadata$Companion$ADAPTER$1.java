package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        MediaStoreUtil mediaStoreUtil = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.FeatureMetadata(mediaStoreUtil, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                mediaStoreUtil = new Order$FeatureMetadata$Metadata$PaycheckConversionMetadata((Order.FeatureMetadata.PaycheckConversionMetadata) Order.FeatureMetadata.PaycheckConversionMetadata.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                mediaStoreUtil = new Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata((Order.FeatureMetadata.CanceledSponsorshipMetadata) Order.FeatureMetadata.CanceledSponsorshipMetadata.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                mediaStoreUtil = new Order$FeatureMetadata$Metadata$ReversalMetadata((Order.FeatureMetadata.ReversalMetadata) Order.FeatureMetadata.ReversalMetadata.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                mediaStoreUtil = new Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata((Order.FeatureMetadata.UsdOnLnPaymentMetadata) Order.FeatureMetadata.UsdOnLnPaymentMetadata.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                mediaStoreUtil = new Order$FeatureMetadata$Metadata$P2pReceiveMetadata((Order.FeatureMetadata.P2pReceiveMetadata) Order.FeatureMetadata.P2pReceiveMetadata.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata featureMetadata = (Order.FeatureMetadata) obj;
        reverseProtoWriter.getClass();
        featureMetadata.getClass();
        reverseProtoWriter.writeBytes(featureMetadata.unknownFields());
        MediaStoreUtil mediaStoreUtil = featureMetadata.metadata;
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) {
            Order.FeatureMetadata.PaycheckConversionMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) mediaStoreUtil).value);
            return;
        }
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) {
            Order.FeatureMetadata.CanceledSponsorshipMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) mediaStoreUtil).value);
            return;
        }
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$ReversalMetadata) {
            Order.FeatureMetadata.ReversalMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Order$FeatureMetadata$Metadata$ReversalMetadata) mediaStoreUtil).value);
            return;
        }
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) {
            Order.FeatureMetadata.UsdOnLnPaymentMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$P2pReceiveMetadata) {
            Order.FeatureMetadata.P2pReceiveMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Order$FeatureMetadata$Metadata$P2pReceiveMetadata) mediaStoreUtil).value);
        } else {
            if (mediaStoreUtil == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Order.FeatureMetadata featureMetadata = (Order.FeatureMetadata) obj;
        featureMetadata.getClass();
        int size$okio = featureMetadata.unknownFields().getSize$okio();
        MediaStoreUtil mediaStoreUtil = featureMetadata.metadata;
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) {
            encodedSizeWithTag = Order.FeatureMetadata.PaycheckConversionMetadata.ADAPTER.encodedSizeWithTag(1, ((Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) {
            encodedSizeWithTag = Order.FeatureMetadata.CanceledSponsorshipMetadata.ADAPTER.encodedSizeWithTag(2, ((Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$ReversalMetadata) {
            encodedSizeWithTag = Order.FeatureMetadata.ReversalMetadata.ADAPTER.encodedSizeWithTag(3, ((Order$FeatureMetadata$Metadata$ReversalMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) {
            encodedSizeWithTag = Order.FeatureMetadata.UsdOnLnPaymentMetadata.ADAPTER.encodedSizeWithTag(4, ((Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) mediaStoreUtil).value);
        } else {
            if (!(mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$P2pReceiveMetadata)) {
                if (mediaStoreUtil == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Order.FeatureMetadata.P2pReceiveMetadata.ADAPTER.encodedSizeWithTag(5, ((Order$FeatureMetadata$Metadata$P2pReceiveMetadata) mediaStoreUtil).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata featureMetadata = (Order.FeatureMetadata) obj;
        featureMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        MediaStoreUtil mediaStoreUtil = featureMetadata.metadata;
        byteString.getClass();
        return new Order.FeatureMetadata(mediaStoreUtil, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata featureMetadata = (Order.FeatureMetadata) obj;
        featureMetadata.getClass();
        MediaStoreUtil mediaStoreUtil = featureMetadata.metadata;
        if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) {
            Order.FeatureMetadata.PaycheckConversionMetadata.ADAPTER.encodeWithTag(protoWriter, 1, ((Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) {
            Order.FeatureMetadata.CanceledSponsorshipMetadata.ADAPTER.encodeWithTag(protoWriter, 2, ((Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$ReversalMetadata) {
            Order.FeatureMetadata.ReversalMetadata.ADAPTER.encodeWithTag(protoWriter, 3, ((Order$FeatureMetadata$Metadata$ReversalMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) {
            Order.FeatureMetadata.UsdOnLnPaymentMetadata.ADAPTER.encodeWithTag(protoWriter, 4, ((Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil instanceof Order$FeatureMetadata$Metadata$P2pReceiveMetadata) {
            Order.FeatureMetadata.P2pReceiveMetadata.ADAPTER.encodeWithTag(protoWriter, 5, ((Order$FeatureMetadata$Metadata$P2pReceiveMetadata) mediaStoreUtil).value);
        } else if (mediaStoreUtil != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(featureMetadata.unknownFields());
    }
}
