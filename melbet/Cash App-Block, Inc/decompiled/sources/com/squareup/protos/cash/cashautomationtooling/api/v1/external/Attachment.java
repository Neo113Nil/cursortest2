package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Attachment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Attachment> CREATOR;
    public final AttachmentIdentifier attachment_identifier;
    public final ByteString file_data;
    public final String file_name;

    static {
        Attachment$Companion$ADAPTER$1 attachment$Companion$ADAPTER$1 = new Attachment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Attachment.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.Attachment", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = attachment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(attachment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Attachment(AttachmentIdentifier attachmentIdentifier, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.attachment_identifier = attachmentIdentifier;
        this.file_name = str;
        this.file_data = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        return Intrinsics.areEqual(unknownFields(), attachment.unknownFields()) && Intrinsics.areEqual(this.attachment_identifier, attachment.attachment_identifier) && Intrinsics.areEqual(this.file_name, attachment.file_name) && Intrinsics.areEqual(this.file_data, attachment.file_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AttachmentIdentifier attachmentIdentifier = this.attachment_identifier;
        int hashCode2 = (hashCode + (attachmentIdentifier != null ? attachmentIdentifier.hashCode() : 0)) * 37;
        String str = this.file_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.file_data;
        int hashCode4 = hashCode3 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(21);
        builder.header_button = this.attachment_identifier;
        builder.header_text = this.file_name;
        builder.groups = this.file_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AttachmentIdentifier attachmentIdentifier = this.attachment_identifier;
        if (attachmentIdentifier != null) {
            arrayList.add("attachment_identifier=" + attachmentIdentifier);
        }
        String str = this.file_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_name=", arrayList);
        }
        if (this.file_data != null) {
            arrayList.add("file_data=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Attachment{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Attachment(AttachmentIdentifier attachmentIdentifier, String str, ByteString byteString) {
        this(attachmentIdentifier, str, byteString, ByteString.EMPTY);
    }
}
