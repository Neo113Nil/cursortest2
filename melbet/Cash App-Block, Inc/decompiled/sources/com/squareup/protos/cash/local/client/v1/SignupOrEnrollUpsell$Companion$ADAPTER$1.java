package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SignupOrEnrollUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SignupOrEnrollUpsell((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SignupOrEnrollUpsell signupOrEnrollUpsell = (SignupOrEnrollUpsell) obj;
        reverseProtoWriter.getClass();
        signupOrEnrollUpsell.getClass();
        reverseProtoWriter.writeBytes(signupOrEnrollUpsell.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, signupOrEnrollUpsell.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, signupOrEnrollUpsell.sub_label_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, signupOrEnrollUpsell.label_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, signupOrEnrollUpsell.title_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, signupOrEnrollUpsell.onboarding_link_payload);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SignupOrEnrollUpsell signupOrEnrollUpsell = (SignupOrEnrollUpsell) obj;
        signupOrEnrollUpsell.getClass();
        int size$okio = signupOrEnrollUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, signupOrEnrollUpsell.button_text) + protoAdapter.encodedSizeWithTag(4, signupOrEnrollUpsell.sub_label_text) + protoAdapter.encodedSizeWithTag(3, signupOrEnrollUpsell.label_text) + protoAdapter.encodedSizeWithTag(2, signupOrEnrollUpsell.title_text) + protoAdapter.encodedSizeWithTag(1, signupOrEnrollUpsell.onboarding_link_payload) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SignupOrEnrollUpsell signupOrEnrollUpsell = (SignupOrEnrollUpsell) obj;
        signupOrEnrollUpsell.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = signupOrEnrollUpsell.onboarding_link_payload;
        String str2 = signupOrEnrollUpsell.title_text;
        String str3 = signupOrEnrollUpsell.label_text;
        String str4 = signupOrEnrollUpsell.sub_label_text;
        String str5 = signupOrEnrollUpsell.button_text;
        byteString.getClass();
        return new SignupOrEnrollUpsell(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SignupOrEnrollUpsell signupOrEnrollUpsell = (SignupOrEnrollUpsell) obj;
        signupOrEnrollUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, signupOrEnrollUpsell.onboarding_link_payload);
        protoAdapter.encodeWithTag(protoWriter, 2, signupOrEnrollUpsell.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, signupOrEnrollUpsell.label_text);
        protoAdapter.encodeWithTag(protoWriter, 4, signupOrEnrollUpsell.sub_label_text);
        protoAdapter.encodeWithTag(protoWriter, 5, signupOrEnrollUpsell.button_text);
        protoWriter.writeBytes(signupOrEnrollUpsell.unknownFields());
    }
}
