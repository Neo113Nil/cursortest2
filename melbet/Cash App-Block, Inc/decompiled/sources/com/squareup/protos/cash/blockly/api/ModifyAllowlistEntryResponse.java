package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/ModifyAllowlistEntryResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "FailureReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModifyAllowlistEntryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ModifyAllowlistEntryResponse> CREATOR;
    public final FailureReason failureReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason implements WireEnum {
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final ModifyAllowlistEntryResponse$FailureReason$Companion$ADAPTER$1 ADAPTER;
        public static final FailureReason ALLOWLIST_LIMIT_REACHED;
        public static final Edge.Companion Companion;

        static {
            FailureReason failureReason = new FailureReason("ALLOWLIST_LIMIT_REACHED", 0);
            ALLOWLIST_LIMIT_REACHED = failureReason;
            $VALUES = new FailureReason[]{failureReason};
            Companion = new Edge.Companion(17);
            ADAPTER = new ModifyAllowlistEntryResponse$FailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FailureReason.class), Syntax.PROTO_2, null);
        }

        public static final FailureReason fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ALLOWLIST_LIMIT_REACHED;
            }
            return null;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    static {
        ModifyAllowlistEntryResponse$Companion$ADAPTER$1 modifyAllowlistEntryResponse$Companion$ADAPTER$1 = new ModifyAllowlistEntryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ModifyAllowlistEntryResponse.class), "type.googleapis.com/squareup.cash.blockly.api.ModifyAllowlistEntryResponse", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyServiceProto.proto");
        ADAPTER = modifyAllowlistEntryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(modifyAllowlistEntryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyAllowlistEntryResponse(FailureReason failureReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.failureReason = failureReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModifyAllowlistEntryResponse)) {
            return false;
        }
        ModifyAllowlistEntryResponse modifyAllowlistEntryResponse = (ModifyAllowlistEntryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), modifyAllowlistEntryResponse.unknownFields()) && this.failureReason == modifyAllowlistEntryResponse.failureReason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FailureReason failureReason = this.failureReason;
        int hashCode2 = hashCode + (failureReason != null ? failureReason.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(29);
        builder.f1245type = this.failureReason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FailureReason failureReason = this.failureReason;
        if (failureReason != null) {
            arrayList.add("failureReason=" + failureReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ModifyAllowlistEntryResponse{", "}", 0, null, null, 56);
    }
}
