package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class AddBugReportAttachmentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddBugReportAttachmentRequest> CREATOR;
    public final Attachment attachment;
    public final String bug_report_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddBugReportAttachmentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashautomationtooling.api.v1.external.AddBugReportAttachmentRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AddBugReportAttachmentRequest((String) obj, (Attachment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Attachment.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddBugReportAttachmentRequest addBugReportAttachmentRequest = (AddBugReportAttachmentRequest) obj;
                reverseProtoWriter.getClass();
                addBugReportAttachmentRequest.getClass();
                reverseProtoWriter.writeBytes(addBugReportAttachmentRequest.unknownFields());
                Attachment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addBugReportAttachmentRequest.attachment);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, addBugReportAttachmentRequest.bug_report_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddBugReportAttachmentRequest addBugReportAttachmentRequest = (AddBugReportAttachmentRequest) obj;
                addBugReportAttachmentRequest.getClass();
                return Attachment.ADAPTER.encodedSizeWithTag(2, addBugReportAttachmentRequest.attachment) + ProtoAdapter.STRING.encodedSizeWithTag(1, addBugReportAttachmentRequest.bug_report_id) + addBugReportAttachmentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddBugReportAttachmentRequest addBugReportAttachmentRequest = (AddBugReportAttachmentRequest) obj;
                addBugReportAttachmentRequest.getClass();
                Attachment attachment = addBugReportAttachmentRequest.attachment;
                Attachment attachment2 = attachment != null ? (Attachment) Attachment.ADAPTER.redact(attachment) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = addBugReportAttachmentRequest.bug_report_id;
                byteString.getClass();
                return new AddBugReportAttachmentRequest(str, attachment2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddBugReportAttachmentRequest addBugReportAttachmentRequest = (AddBugReportAttachmentRequest) obj;
                addBugReportAttachmentRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addBugReportAttachmentRequest.bug_report_id);
                Attachment.ADAPTER.encodeWithTag(protoWriter, 2, addBugReportAttachmentRequest.attachment);
                protoWriter.writeBytes(addBugReportAttachmentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddBugReportAttachmentRequest(String str, Attachment attachment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bug_report_id = str;
        this.attachment = attachment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddBugReportAttachmentRequest)) {
            return false;
        }
        AddBugReportAttachmentRequest addBugReportAttachmentRequest = (AddBugReportAttachmentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addBugReportAttachmentRequest.unknownFields()) && Intrinsics.areEqual(this.bug_report_id, addBugReportAttachmentRequest.bug_report_id) && Intrinsics.areEqual(this.attachment, addBugReportAttachmentRequest.attachment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.bug_report_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Attachment attachment = this.attachment;
        int hashCode3 = hashCode2 + (attachment != null ? attachment.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(13);
        builder.errors = this.bug_report_id;
        builder.result = this.attachment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.bug_report_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "bug_report_id=", arrayList);
        }
        Attachment attachment = this.attachment;
        if (attachment != null) {
            arrayList.add("attachment=" + attachment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddBugReportAttachmentRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AddBugReportAttachmentRequest(String str, Attachment attachment) {
        this(str, attachment, ByteString.EMPTY);
    }
}
