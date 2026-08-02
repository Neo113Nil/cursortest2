package com.squareup.protos.franklin.onboarding;

import com.squareup.protos.franklin.onboarding.CashLocalOnboardingDeepLinkPayload;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashLocalOnboardingDeepLinkPayload((String) obj, (String) obj2, (CashLocalOnboardingDeepLinkPayload.Source) obj3, (String) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = CashLocalOnboardingDeepLinkPayload.Source.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = (CashLocalOnboardingDeepLinkPayload) obj;
        reverseProtoWriter.getClass();
        cashLocalOnboardingDeepLinkPayload.getClass();
        reverseProtoWriter.writeBytes(cashLocalOnboardingDeepLinkPayload.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, cashLocalOnboardingDeepLinkPayload.expires_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashLocalOnboardingDeepLinkPayload.tender_token);
        CashLocalOnboardingDeepLinkPayload.Source.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashLocalOnboardingDeepLinkPayload.source);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashLocalOnboardingDeepLinkPayload.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashLocalOnboardingDeepLinkPayload.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = (CashLocalOnboardingDeepLinkPayload) obj;
        cashLocalOnboardingDeepLinkPayload.getClass();
        int size$okio = cashLocalOnboardingDeepLinkPayload.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(5, cashLocalOnboardingDeepLinkPayload.expires_at) + protoAdapter.encodedSizeWithTag(4, cashLocalOnboardingDeepLinkPayload.tender_token) + CashLocalOnboardingDeepLinkPayload.Source.ADAPTER.encodedSizeWithTag(3, cashLocalOnboardingDeepLinkPayload.source) + protoAdapter.encodedSizeWithTag(2, cashLocalOnboardingDeepLinkPayload.location_token) + protoAdapter.encodedSizeWithTag(1, cashLocalOnboardingDeepLinkPayload.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = (CashLocalOnboardingDeepLinkPayload) obj;
        cashLocalOnboardingDeepLinkPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashLocalOnboardingDeepLinkPayload.brand_token;
        String str2 = cashLocalOnboardingDeepLinkPayload.location_token;
        CashLocalOnboardingDeepLinkPayload.Source source = cashLocalOnboardingDeepLinkPayload.source;
        String str3 = cashLocalOnboardingDeepLinkPayload.tender_token;
        Long l = cashLocalOnboardingDeepLinkPayload.expires_at;
        byteString.getClass();
        return new CashLocalOnboardingDeepLinkPayload(str, str2, source, str3, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = (CashLocalOnboardingDeepLinkPayload) obj;
        cashLocalOnboardingDeepLinkPayload.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashLocalOnboardingDeepLinkPayload.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cashLocalOnboardingDeepLinkPayload.location_token);
        CashLocalOnboardingDeepLinkPayload.Source.ADAPTER.encodeWithTag(protoWriter, 3, cashLocalOnboardingDeepLinkPayload.source);
        protoAdapter.encodeWithTag(protoWriter, 4, cashLocalOnboardingDeepLinkPayload.tender_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, cashLocalOnboardingDeepLinkPayload.expires_at);
        protoWriter.writeBytes(cashLocalOnboardingDeepLinkPayload.unknownFields());
    }
}
