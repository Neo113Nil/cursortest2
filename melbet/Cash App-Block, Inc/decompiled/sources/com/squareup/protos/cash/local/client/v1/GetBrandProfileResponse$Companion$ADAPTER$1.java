package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBrandProfileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzhx zzhxVar = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBrandProfileResponse((Long) obj, zzhxVar, (Boolean) obj2, (LocalBuyer) obj3, (LocalUserIntent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    zzhxVar = new GetBrandProfileResponse$Response$Brand((LocalBrand) LocalBrand.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzhxVar = new GetBrandProfileResponse$Response$RedirectToWeb((RedirectToWeb) RedirectToWeb.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    zzhxVar = new GetBrandProfileResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalBuyer.ADAPTER, protoReader, obj3);
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalUserIntent.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBrandProfileResponse getBrandProfileResponse = (GetBrandProfileResponse) obj;
        reverseProtoWriter.getClass();
        getBrandProfileResponse.getClass();
        reverseProtoWriter.writeBytes(getBrandProfileResponse.unknownFields());
        zzhx zzhxVar = getBrandProfileResponse.response;
        if (zzhxVar instanceof GetBrandProfileResponse$Response$Brand) {
            LocalBrand.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBrandProfileResponse$Response$Brand) zzhxVar).value);
        } else if (zzhxVar instanceof GetBrandProfileResponse$Response$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetBrandProfileResponse$Response$RedirectToWeb) zzhxVar).value);
        } else if (zzhxVar instanceof GetBrandProfileResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GetBrandProfileResponse$Response$ErrorResponse) zzhxVar).value);
        } else if (zzhxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalUserIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getBrandProfileResponse.user_intent);
        LocalBuyer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getBrandProfileResponse.local_buyer);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, getBrandProfileResponse.is_enrolled);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, getBrandProfileResponse.expires_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetBrandProfileResponse getBrandProfileResponse = (GetBrandProfileResponse) obj;
        getBrandProfileResponse.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(1, getBrandProfileResponse.expires_at) + getBrandProfileResponse.unknownFields().getSize$okio();
        zzhx zzhxVar = getBrandProfileResponse.response;
        if (zzhxVar instanceof GetBrandProfileResponse$Response$Brand) {
            encodedSizeWithTag = LocalBrand.ADAPTER.encodedSizeWithTag(2, ((GetBrandProfileResponse$Response$Brand) zzhxVar).value);
        } else if (zzhxVar instanceof GetBrandProfileResponse$Response$RedirectToWeb) {
            encodedSizeWithTag = RedirectToWeb.ADAPTER.encodedSizeWithTag(3, ((GetBrandProfileResponse$Response$RedirectToWeb) zzhxVar).value);
        } else {
            if (!(zzhxVar instanceof GetBrandProfileResponse$Response$ErrorResponse)) {
                if (zzhxVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return LocalUserIntent.ADAPTER.encodedSizeWithTag(7, getBrandProfileResponse.user_intent) + LocalBuyer.ADAPTER.encodedSizeWithTag(6, getBrandProfileResponse.local_buyer) + ProtoAdapter.BOOL.encodedSizeWithTag(4, getBrandProfileResponse.is_enrolled) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(5, ((GetBrandProfileResponse$Response$ErrorResponse) zzhxVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return LocalUserIntent.ADAPTER.encodedSizeWithTag(7, getBrandProfileResponse.user_intent) + LocalBuyer.ADAPTER.encodedSizeWithTag(6, getBrandProfileResponse.local_buyer) + ProtoAdapter.BOOL.encodedSizeWithTag(4, getBrandProfileResponse.is_enrolled) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBrandProfileResponse getBrandProfileResponse = (GetBrandProfileResponse) obj;
        getBrandProfileResponse.getClass();
        LocalBuyer localBuyer = getBrandProfileResponse.local_buyer;
        LocalBuyer localBuyer2 = localBuyer != null ? (LocalBuyer) LocalBuyer.ADAPTER.redact(localBuyer) : null;
        LocalUserIntent localUserIntent = getBrandProfileResponse.user_intent;
        LocalUserIntent localUserIntent2 = localUserIntent != null ? (LocalUserIntent) LocalUserIntent.ADAPTER.redact(localUserIntent) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getBrandProfileResponse.expires_at;
        zzhx zzhxVar = getBrandProfileResponse.response;
        Boolean bool = getBrandProfileResponse.is_enrolled;
        byteString.getClass();
        return new GetBrandProfileResponse(l, zzhxVar, bool, localBuyer2, localUserIntent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBrandProfileResponse getBrandProfileResponse = (GetBrandProfileResponse) obj;
        getBrandProfileResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getBrandProfileResponse.expires_at);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getBrandProfileResponse.is_enrolled);
        LocalBuyer.ADAPTER.encodeWithTag(protoWriter, 6, getBrandProfileResponse.local_buyer);
        LocalUserIntent.ADAPTER.encodeWithTag(protoWriter, 7, getBrandProfileResponse.user_intent);
        zzhx zzhxVar = getBrandProfileResponse.response;
        if (zzhxVar instanceof GetBrandProfileResponse$Response$Brand) {
            LocalBrand.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBrandProfileResponse$Response$Brand) zzhxVar).value);
        } else if (zzhxVar instanceof GetBrandProfileResponse$Response$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(protoWriter, 3, ((GetBrandProfileResponse$Response$RedirectToWeb) zzhxVar).value);
        } else if (zzhxVar instanceof GetBrandProfileResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 5, ((GetBrandProfileResponse$Response$ErrorResponse) zzhxVar).value);
        } else if (zzhxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getBrandProfileResponse.unknownFields());
    }
}
