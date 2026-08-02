package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class IdentityHubState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdentityHubState> CREATOR;
    public final EntrypointStatus entrypoint_status;
    public final Boolean should_show_badge;
    public final Long version;

    public enum EntrypointStatus implements WireEnum {
        VERIFY(1),
        CONTINUE(2),
        PENDING(3),
        NOT_VERIFIED(4),
        VERIFIED(5);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final IdentityHubState$EntrypointStatus$Companion$ADAPTER$1 ADAPTER = new IdentityHubState$EntrypointStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntrypointStatus.class), Syntax.PROTO_2, null);

        EntrypointStatus(int i) {
            this.value = i;
        }

        public static final EntrypointStatus fromValue(int i) {
            Companion.getClass();
            return ClientDriven.Companion.m3978fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        IdentityHubState$Companion$ADAPTER$1 identityHubState$Companion$ADAPTER$1 = new IdentityHubState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdentityHubState.class), "type.googleapis.com/squareup.franklin.ui.IdentityHubState", Syntax.PROTO_2, null, "squareup/franklin/ui/identity_hub_state.proto");
        ADAPTER = identityHubState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(identityHubState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityHubState(EntrypointStatus entrypointStatus, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entrypoint_status = entrypointStatus;
        this.should_show_badge = bool;
        this.version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentityHubState)) {
            return false;
        }
        IdentityHubState identityHubState = (IdentityHubState) obj;
        return Intrinsics.areEqual(unknownFields(), identityHubState.unknownFields()) && this.entrypoint_status == identityHubState.entrypoint_status && Intrinsics.areEqual(this.should_show_badge, identityHubState.should_show_badge) && Intrinsics.areEqual(this.version, identityHubState.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntrypointStatus entrypointStatus = this.entrypoint_status;
        int hashCode2 = (hashCode + (entrypointStatus != null ? entrypointStatus.hashCode() : 0)) * 37;
        Boolean bool = this.should_show_badge;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.version;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(8);
        builder.label = this.entrypoint_status;
        builder.localizable_label = this.should_show_badge;
        builder.client_scenario = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntrypointStatus entrypointStatus = this.entrypoint_status;
        if (entrypointStatus != null) {
            arrayList.add("entrypoint_status=" + entrypointStatus);
        }
        Boolean bool = this.should_show_badge;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_show_badge=", bool, arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdentityHubState{", "}", 0, null, null, 56);
    }
}
