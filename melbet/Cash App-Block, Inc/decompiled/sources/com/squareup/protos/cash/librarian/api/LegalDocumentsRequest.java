package com.squareup.protos.cash.librarian.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.franklin.api.Region;
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
public final class LegalDocumentsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LegalDocumentsRequest> CREATOR;
    public final Region region;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LegalDocumentsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.librarian.api.LegalDocumentsRequest$Companion$ADAPTER$1
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
                        break;
                    }
                    if (nextTag == 1) {
                        try {
                            obj = Region.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Region region = (Region) obj;
                if (region != null) {
                    return new LegalDocumentsRequest(region, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "region");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LegalDocumentsRequest legalDocumentsRequest = (LegalDocumentsRequest) obj;
                reverseProtoWriter.getClass();
                legalDocumentsRequest.getClass();
                reverseProtoWriter.writeBytes(legalDocumentsRequest.unknownFields());
                Region.ADAPTER.encodeWithTag(reverseProtoWriter, 1, legalDocumentsRequest.region);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LegalDocumentsRequest legalDocumentsRequest = (LegalDocumentsRequest) obj;
                legalDocumentsRequest.getClass();
                return Region.ADAPTER.encodedSizeWithTag(1, legalDocumentsRequest.region) + legalDocumentsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LegalDocumentsRequest legalDocumentsRequest = (LegalDocumentsRequest) obj;
                legalDocumentsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                Region region = legalDocumentsRequest.region;
                region.getClass();
                byteString.getClass();
                return new LegalDocumentsRequest(region, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LegalDocumentsRequest legalDocumentsRequest = (LegalDocumentsRequest) obj;
                legalDocumentsRequest.getClass();
                Region.ADAPTER.encodeWithTag(protoWriter, 1, legalDocumentsRequest.region);
                protoWriter.writeBytes(legalDocumentsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegalDocumentsRequest(Region region, ByteString byteString) {
        super(ADAPTER, byteString);
        region.getClass();
        byteString.getClass();
        this.region = region;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegalDocumentsRequest)) {
            return false;
        }
        LegalDocumentsRequest legalDocumentsRequest = (LegalDocumentsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), legalDocumentsRequest.unknownFields()) && this.region == legalDocumentsRequest.region;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.region.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(11);
        builder.f1276type = this.region;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("region=" + this.region);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LegalDocumentsRequest{", "}", 0, null, null, 56);
    }
}
