package com.squareup.protos.timecards;

import com.datadog.android.rum.model.ViewEvent;
import com.squareup.protos.timecards.GetShiftsOverviewRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ViewEvent.Companion getShiftsOverviewRequest$DateTime$WorkweekStart;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        ViewEvent.Companion companion = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetShiftsOverviewRequest(companion, (String) obj, (String) obj2, (GetShiftsOverviewRequest.APIVersion) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                getShiftsOverviewRequest$DateTime$WorkweekStart = new GetShiftsOverviewRequest$DateTime$WorkweekStart((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                getShiftsOverviewRequest$DateTime$WorkweekStart = new GetShiftsOverviewRequest$DateTime$IncludedDateTime((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = GetShiftsOverviewRequest.APIVersion.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
            companion = getShiftsOverviewRequest$DateTime$WorkweekStart;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetShiftsOverviewRequest getShiftsOverviewRequest = (GetShiftsOverviewRequest) obj;
        reverseProtoWriter.getClass();
        getShiftsOverviewRequest.getClass();
        reverseProtoWriter.writeBytes(getShiftsOverviewRequest.unknownFields());
        ViewEvent.Companion companion = getShiftsOverviewRequest.date_time;
        if (companion instanceof GetShiftsOverviewRequest$DateTime$WorkweekStart) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((GetShiftsOverviewRequest$DateTime$WorkweekStart) companion).value);
        } else if (companion instanceof GetShiftsOverviewRequest$DateTime$IncludedDateTime) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((GetShiftsOverviewRequest$DateTime$IncludedDateTime) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        GetShiftsOverviewRequest.APIVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getShiftsOverviewRequest.api_version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getShiftsOverviewRequest._accept_language);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getShiftsOverviewRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetShiftsOverviewRequest getShiftsOverviewRequest = (GetShiftsOverviewRequest) obj;
        getShiftsOverviewRequest.getClass();
        int size$okio = getShiftsOverviewRequest.unknownFields().getSize$okio();
        ViewEvent.Companion companion = getShiftsOverviewRequest.date_time;
        if (companion instanceof GetShiftsOverviewRequest$DateTime$WorkweekStart) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((GetShiftsOverviewRequest$DateTime$WorkweekStart) companion).value);
        } else {
            if (!(companion instanceof GetShiftsOverviewRequest$DateTime$IncludedDateTime)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                return GetShiftsOverviewRequest.APIVersion.ADAPTER.encodedSizeWithTag(5, getShiftsOverviewRequest.api_version) + protoAdapter.encodedSizeWithTag(3, getShiftsOverviewRequest._accept_language) + protoAdapter.encodedSizeWithTag(2, getShiftsOverviewRequest.merchant_token) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, ((GetShiftsOverviewRequest$DateTime$IncludedDateTime) companion).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return GetShiftsOverviewRequest.APIVersion.ADAPTER.encodedSizeWithTag(5, getShiftsOverviewRequest.api_version) + protoAdapter2.encodedSizeWithTag(3, getShiftsOverviewRequest._accept_language) + protoAdapter2.encodedSizeWithTag(2, getShiftsOverviewRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetShiftsOverviewRequest getShiftsOverviewRequest = (GetShiftsOverviewRequest) obj;
        getShiftsOverviewRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        ViewEvent.Companion companion = getShiftsOverviewRequest.date_time;
        String str = getShiftsOverviewRequest.merchant_token;
        String str2 = getShiftsOverviewRequest._accept_language;
        GetShiftsOverviewRequest.APIVersion aPIVersion = getShiftsOverviewRequest.api_version;
        byteString.getClass();
        return new GetShiftsOverviewRequest(companion, str, str2, aPIVersion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetShiftsOverviewRequest getShiftsOverviewRequest = (GetShiftsOverviewRequest) obj;
        getShiftsOverviewRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getShiftsOverviewRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 3, getShiftsOverviewRequest._accept_language);
        GetShiftsOverviewRequest.APIVersion.ADAPTER.encodeWithTag(protoWriter, 5, getShiftsOverviewRequest.api_version);
        ViewEvent.Companion companion = getShiftsOverviewRequest.date_time;
        if (companion instanceof GetShiftsOverviewRequest$DateTime$WorkweekStart) {
            protoAdapter.encodeWithTag(protoWriter, 1, ((GetShiftsOverviewRequest$DateTime$WorkweekStart) companion).value);
        } else if (companion instanceof GetShiftsOverviewRequest$DateTime$IncludedDateTime) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((GetShiftsOverviewRequest$DateTime$IncludedDateTime) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getShiftsOverviewRequest.unknownFields());
    }
}
