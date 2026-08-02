package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ValidateEmailRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateEmailRequest> CREATOR;
    public final String email_address;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ValidateEmailRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.supportal.app.ValidateEmailRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ValidateEmailRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ValidateEmailRequest validateEmailRequest = (ValidateEmailRequest) obj;
                reverseProtoWriter.getClass();
                validateEmailRequest.getClass();
                reverseProtoWriter.writeBytes(validateEmailRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, validateEmailRequest.email_address);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ValidateEmailRequest validateEmailRequest = (ValidateEmailRequest) obj;
                validateEmailRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, validateEmailRequest.email_address) + validateEmailRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((ValidateEmailRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ValidateEmailRequest(null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ValidateEmailRequest validateEmailRequest = (ValidateEmailRequest) obj;
                validateEmailRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, validateEmailRequest.email_address);
                protoWriter.writeBytes(validateEmailRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateEmailRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.email_address = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateEmailRequest)) {
            return false;
        }
        ValidateEmailRequest validateEmailRequest = (ValidateEmailRequest) obj;
        return Intrinsics.areEqual(unknownFields(), validateEmailRequest.unknownFields()) && Intrinsics.areEqual(this.email_address, validateEmailRequest.email_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.email_address;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(25);
        builder.bio = this.email_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateEmailRequest{", "}", 0, null, null, 56);
    }
}
