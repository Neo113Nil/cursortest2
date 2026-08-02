package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.MenuHoursKt;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.RedirectToWeb;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        MenuHoursKt menuHoursKt = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBrand((Long) obj, menuHoursKt, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                menuHoursKt = new LocalBrand$Response$LocalBrandEntity((LocalBrandEntity) LocalBrandEntity.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                menuHoursKt = new LocalBrand$Response$RedirectToWeb((RedirectToWeb) RedirectToWeb.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                menuHoursKt = new LocalBrand$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        reverseProtoWriter.getClass();
        localBrand.getClass();
        reverseProtoWriter.writeBytes(localBrand.unknownFields());
        MenuHoursKt menuHoursKt = localBrand.response;
        if (menuHoursKt instanceof LocalBrand$Response$LocalBrandEntity) {
            LocalBrandEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((LocalBrand$Response$LocalBrandEntity) menuHoursKt).value);
        } else if (menuHoursKt instanceof LocalBrand$Response$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LocalBrand$Response$RedirectToWeb) menuHoursKt).value);
        } else if (menuHoursKt instanceof LocalBrand$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((LocalBrand$Response$ErrorResponse) menuHoursKt).value);
        } else if (menuHoursKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, localBrand.is_enrolled);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, localBrand.expires_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(1, localBrand.expires_at) + localBrand.unknownFields().getSize$okio();
        MenuHoursKt menuHoursKt = localBrand.response;
        if (menuHoursKt instanceof LocalBrand$Response$LocalBrandEntity) {
            encodedSizeWithTag = LocalBrandEntity.ADAPTER.encodedSizeWithTag(2, ((LocalBrand$Response$LocalBrandEntity) menuHoursKt).value);
        } else if (menuHoursKt instanceof LocalBrand$Response$RedirectToWeb) {
            encodedSizeWithTag = RedirectToWeb.ADAPTER.encodedSizeWithTag(3, ((LocalBrand$Response$RedirectToWeb) menuHoursKt).value);
        } else {
            if (!(menuHoursKt instanceof LocalBrand$Response$ErrorResponse)) {
                if (menuHoursKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, localBrand.is_enrolled) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(5, ((LocalBrand$Response$ErrorResponse) menuHoursKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, localBrand.is_enrolled) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = localBrand.expires_at;
        MenuHoursKt menuHoursKt = localBrand.response;
        Boolean bool = localBrand.is_enrolled;
        byteString.getClass();
        return new LocalBrand(l, menuHoursKt, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, localBrand.expires_at);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, localBrand.is_enrolled);
        MenuHoursKt menuHoursKt = localBrand.response;
        if (menuHoursKt instanceof LocalBrand$Response$LocalBrandEntity) {
            LocalBrandEntity.ADAPTER.encodeWithTag(protoWriter, 2, ((LocalBrand$Response$LocalBrandEntity) menuHoursKt).value);
        } else if (menuHoursKt instanceof LocalBrand$Response$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(protoWriter, 3, ((LocalBrand$Response$RedirectToWeb) menuHoursKt).value);
        } else if (menuHoursKt instanceof LocalBrand$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 5, ((LocalBrand$Response$ErrorResponse) menuHoursKt).value);
        } else if (menuHoursKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localBrand.unknownFields());
    }
}
