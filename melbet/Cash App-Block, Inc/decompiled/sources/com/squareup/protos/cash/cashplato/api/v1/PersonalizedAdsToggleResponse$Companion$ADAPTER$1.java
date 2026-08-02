package com.squareup.protos.cash.cashplato.api.v1;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzuj zzujVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PersonalizedAdsToggleResponse(zzujVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzujVar = new PersonalizedAdsToggleResponse$Response$Success(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzujVar = new PersonalizedAdsToggleResponse$Response$Error((PersonalizedAdsError) PersonalizedAdsError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalizedAdsToggleResponse personalizedAdsToggleResponse = (PersonalizedAdsToggleResponse) obj;
        reverseProtoWriter.getClass();
        personalizedAdsToggleResponse.getClass();
        reverseProtoWriter.writeBytes(personalizedAdsToggleResponse.unknownFields());
        zzuj zzujVar = personalizedAdsToggleResponse.response;
        if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Success) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(((PersonalizedAdsToggleResponse$Response$Success) zzujVar).value));
        } else if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Error) {
            PersonalizedAdsError.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PersonalizedAdsToggleResponse$Response$Error) zzujVar).value);
        } else {
            if (zzujVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalizedAdsToggleResponse personalizedAdsToggleResponse = (PersonalizedAdsToggleResponse) obj;
        personalizedAdsToggleResponse.getClass();
        int size$okio = personalizedAdsToggleResponse.unknownFields().getSize$okio();
        zzuj zzujVar = personalizedAdsToggleResponse.response;
        if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Success) {
            return SizeMode$EnumUnboxingLocalUtility.m(((PersonalizedAdsToggleResponse$Response$Success) zzujVar).value, ProtoAdapter.BOOL, 1, size$okio);
        }
        if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Error) {
            return PersonalizedAdsError.ADAPTER.encodedSizeWithTag(2, ((PersonalizedAdsToggleResponse$Response$Error) zzujVar).value) + size$okio;
        }
        if (zzujVar == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalizedAdsToggleResponse personalizedAdsToggleResponse = (PersonalizedAdsToggleResponse) obj;
        personalizedAdsToggleResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzuj zzujVar = personalizedAdsToggleResponse.response;
        byteString.getClass();
        return new PersonalizedAdsToggleResponse(zzujVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalizedAdsToggleResponse personalizedAdsToggleResponse = (PersonalizedAdsToggleResponse) obj;
        personalizedAdsToggleResponse.getClass();
        zzuj zzujVar = personalizedAdsToggleResponse.response;
        if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Success) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, Boolean.valueOf(((PersonalizedAdsToggleResponse$Response$Success) zzujVar).value));
        } else if (zzujVar instanceof PersonalizedAdsToggleResponse$Response$Error) {
            PersonalizedAdsError.ADAPTER.encodeWithTag(protoWriter, 2, ((PersonalizedAdsToggleResponse$Response$Error) zzujVar).value);
        } else if (zzujVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(personalizedAdsToggleResponse.unknownFields());
    }
}
