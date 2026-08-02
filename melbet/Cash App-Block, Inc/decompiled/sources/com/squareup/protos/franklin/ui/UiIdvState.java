package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.access.sync_values.PasswordInfo;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.franklin.common.BadgingInfo;
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

/* loaded from: classes8.dex */
public final class UiIdvState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiIdvState> CREATOR;
    public final Long can_attempt_electronic_idv_at;
    public final Boolean has_verified_identity;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long can_attempt_electronic_idv_at;
        public Boolean has_verified_identity;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiIdvState(this.has_verified_identity, this.can_attempt_electronic_idv_at, buildUnknownFields());
                case 1:
                    return new PasswordInfo(this.has_verified_identity, this.can_attempt_electronic_idv_at, buildUnknownFields());
                case 2:
                    return new GetEditorialResponse.EditorialContent.Spacer(this.has_verified_identity, this.can_attempt_electronic_idv_at, buildUnknownFields());
                default:
                    return new BadgingInfo(this.has_verified_identity, this.can_attempt_electronic_idv_at, buildUnknownFields());
            }
        }
    }

    static {
        UiIdvState$Companion$ADAPTER$1 uiIdvState$Companion$ADAPTER$1 = new UiIdvState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiIdvState.class), "type.googleapis.com/squareup.franklin.ui.UiIdvState", Syntax.PROTO_2, null, "squareup/franklin/ui/idv_state.proto");
        ADAPTER = uiIdvState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiIdvState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiIdvState(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_verified_identity = bool;
        this.can_attempt_electronic_idv_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiIdvState)) {
            return false;
        }
        UiIdvState uiIdvState = (UiIdvState) obj;
        return Intrinsics.areEqual(unknownFields(), uiIdvState.unknownFields()) && Intrinsics.areEqual(this.has_verified_identity, uiIdvState.has_verified_identity) && Intrinsics.areEqual(this.can_attempt_electronic_idv_at, uiIdvState.can_attempt_electronic_idv_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_verified_identity;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.can_attempt_electronic_idv_at;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.has_verified_identity = this.has_verified_identity;
        builder.can_attempt_electronic_idv_at = this.can_attempt_electronic_idv_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.has_verified_identity;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_verified_identity=", bool, arrayList);
        }
        Long l = this.can_attempt_electronic_idv_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_attempt_electronic_idv_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiIdvState{", "}", 0, null, null, 56);
    }
}
