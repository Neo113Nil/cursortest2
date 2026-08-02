package com.squareup.protos.cash.composer.app;

import app.cash.sqldelight.db.QueryResult;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Asset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        QueryResult.DefaultImpls defaultImpls = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Asset(defaultImpls, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                defaultImpls = new Asset$AssetType$LottieAsset((LottieAsset) LottieAsset.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                defaultImpls = new Asset$AssetType$VideoAsset((VideoAsset) VideoAsset.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Asset asset = (Asset) obj;
        reverseProtoWriter.getClass();
        asset.getClass();
        reverseProtoWriter.writeBytes(asset.unknownFields());
        QueryResult.DefaultImpls defaultImpls = asset.asset_type;
        if (defaultImpls instanceof Asset$AssetType$LottieAsset) {
            LottieAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Asset$AssetType$LottieAsset) defaultImpls).value);
        } else if (defaultImpls instanceof Asset$AssetType$VideoAsset) {
            VideoAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Asset$AssetType$VideoAsset) defaultImpls).value);
        } else {
            if (defaultImpls == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Asset asset = (Asset) obj;
        asset.getClass();
        int size$okio = asset.unknownFields().getSize$okio();
        QueryResult.DefaultImpls defaultImpls = asset.asset_type;
        if (defaultImpls instanceof Asset$AssetType$LottieAsset) {
            encodedSizeWithTag = LottieAsset.ADAPTER.encodedSizeWithTag(1, ((Asset$AssetType$LottieAsset) defaultImpls).value);
        } else {
            if (!(defaultImpls instanceof Asset$AssetType$VideoAsset)) {
                if (defaultImpls == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = VideoAsset.ADAPTER.encodedSizeWithTag(2, ((Asset$AssetType$VideoAsset) defaultImpls).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Asset asset = (Asset) obj;
        asset.getClass();
        ByteString byteString = ByteString.EMPTY;
        QueryResult.DefaultImpls defaultImpls = asset.asset_type;
        byteString.getClass();
        return new Asset(defaultImpls, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Asset asset = (Asset) obj;
        asset.getClass();
        QueryResult.DefaultImpls defaultImpls = asset.asset_type;
        if (defaultImpls instanceof Asset$AssetType$LottieAsset) {
            LottieAsset.ADAPTER.encodeWithTag(protoWriter, 1, ((Asset$AssetType$LottieAsset) defaultImpls).value);
        } else if (defaultImpls instanceof Asset$AssetType$VideoAsset) {
            VideoAsset.ADAPTER.encodeWithTag(protoWriter, 2, ((Asset$AssetType$VideoAsset) defaultImpls).value);
        } else if (defaultImpls != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(asset.unknownFields());
    }
}
