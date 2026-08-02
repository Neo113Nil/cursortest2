package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class AttachmentIdentifier extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AttachmentIdentifier> CREATOR;
    public final String file_token;

    static {
        AttachmentIdentifier$Companion$ADAPTER$1 attachmentIdentifier$Companion$ADAPTER$1 = new AttachmentIdentifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AttachmentIdentifier.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.AttachmentIdentifier", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = attachmentIdentifier$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(attachmentIdentifier$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentIdentifier(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.file_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttachmentIdentifier)) {
            return false;
        }
        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) obj;
        return Intrinsics.areEqual(unknownFields(), attachmentIdentifier.unknownFields()) && Intrinsics.areEqual(this.file_token, attachmentIdentifier.file_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.file_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(28);
        builder.display_name = this.file_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.file_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AttachmentIdentifier{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AttachmentIdentifier(String str) {
        this(str, ByteString.EMPTY);
    }
}
