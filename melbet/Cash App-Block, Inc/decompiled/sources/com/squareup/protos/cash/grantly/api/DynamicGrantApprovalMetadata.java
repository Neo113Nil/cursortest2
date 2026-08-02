package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class DynamicGrantApprovalMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DynamicGrantApprovalMetadata> CREATOR;
    public final Boolean explicit_approval_shown;

    static {
        DynamicGrantApprovalMetadata$Companion$ADAPTER$1 dynamicGrantApprovalMetadata$Companion$ADAPTER$1 = new DynamicGrantApprovalMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DynamicGrantApprovalMetadata.class), "type.googleapis.com/squareup.cash.grantly.api.DynamicGrantApprovalMetadata", Syntax.PROTO_2, null, "squareup/cash/grantly/api/dynamic_grant_approval_metadata.proto");
        ADAPTER = dynamicGrantApprovalMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dynamicGrantApprovalMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicGrantApprovalMetadata(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.explicit_approval_shown = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicGrantApprovalMetadata)) {
            return false;
        }
        DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata = (DynamicGrantApprovalMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), dynamicGrantApprovalMetadata.unknownFields()) && Intrinsics.areEqual(this.explicit_approval_shown, dynamicGrantApprovalMetadata.explicit_approval_shown);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.explicit_approval_shown;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(12);
        builder.activated = this.explicit_approval_shown;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.explicit_approval_shown;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("explicit_approval_shown=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DynamicGrantApprovalMetadata{", "}", 0, null, null, 56);
    }
}
