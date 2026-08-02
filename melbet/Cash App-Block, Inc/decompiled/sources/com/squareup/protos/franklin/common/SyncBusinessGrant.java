package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
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
import okio.Path;

/* loaded from: classes8.dex */
public final class SyncBusinessGrant extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncBusinessGrant> CREATOR;
    public final String account_reference_id;
    public final ActionType action_type;
    public final String client_id;
    public final Long created_at;
    public final Long expires_at;
    public final String id;
    public final String merchant_id;
    public final RenderingBehavior rendering_behavior;
    public final Long updated_at;

    /* loaded from: classes.dex */
    public enum ActionType implements WireEnum {
        DO_NOT_USE_ACTION_TYPE(0),
        ONE_TIME_PAYMENT(1),
        ON_FILE_PAYMENT(2),
        UNLINKED_REFUND(3),
        LINK_ACCOUNT(4),
        RECURRING_DEPOSITS(5),
        ON_FILE_DEPOSIT(6),
        LINK_ACCOUNT_TIDAL(7),
        ON_FILE_PAYOUT(8);

        public static final SyncBusinessGrant$ActionType$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            ActionType actionType = DO_NOT_USE_ACTION_TYPE;
            Companion = new ByteString.Companion();
            ADAPTER = new SyncBusinessGrant$ActionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActionType.class), Syntax.PROTO_2, actionType);
        }

        ActionType(int i) {
            this.value = i;
        }

        public static final ActionType fromValue(int i) {
            Companion.getClass();
            return ByteString.Companion.m4341fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum RenderingBehavior implements WireEnum {
        DEFAULT(0),
        AFTERPAY(1);

        public static final SyncBusinessGrant$RenderingBehavior$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            RenderingBehavior renderingBehavior = DEFAULT;
            Companion = new Path.Companion();
            ADAPTER = new SyncBusinessGrant$RenderingBehavior$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RenderingBehavior.class), Syntax.PROTO_2, renderingBehavior);
        }

        RenderingBehavior(int i) {
            this.value = i;
        }

        public static final RenderingBehavior fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return AFTERPAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncBusinessGrant$Companion$ADAPTER$1 syncBusinessGrant$Companion$ADAPTER$1 = new SyncBusinessGrant$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncBusinessGrant.class), "type.googleapis.com/squareup.franklin.SyncBusinessGrant", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncBusinessGrant$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncBusinessGrant$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncBusinessGrant(String str, String str2, Long l, Long l2, Long l3, String str3, ActionType actionType, String str4, RenderingBehavior renderingBehavior, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.merchant_id = str2;
        this.updated_at = l;
        this.created_at = l2;
        this.expires_at = l3;
        this.client_id = str3;
        this.action_type = actionType;
        this.account_reference_id = str4;
        this.rendering_behavior = renderingBehavior;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncBusinessGrant)) {
            return false;
        }
        SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
        return Intrinsics.areEqual(unknownFields(), syncBusinessGrant.unknownFields()) && Intrinsics.areEqual(this.id, syncBusinessGrant.id) && Intrinsics.areEqual(this.merchant_id, syncBusinessGrant.merchant_id) && Intrinsics.areEqual(this.updated_at, syncBusinessGrant.updated_at) && Intrinsics.areEqual(this.created_at, syncBusinessGrant.created_at) && Intrinsics.areEqual(this.expires_at, syncBusinessGrant.expires_at) && Intrinsics.areEqual(this.client_id, syncBusinessGrant.client_id) && this.action_type == syncBusinessGrant.action_type && Intrinsics.areEqual(this.account_reference_id, syncBusinessGrant.account_reference_id) && this.rendering_behavior == syncBusinessGrant.rendering_behavior;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.updated_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.created_at;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.expires_at;
        int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str3 = this.client_id;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ActionType actionType = this.action_type;
        int hashCode8 = (hashCode7 + (actionType != null ? actionType.hashCode() : 0)) * 37;
        String str4 = this.account_reference_id;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        RenderingBehavior renderingBehavior = this.rendering_behavior;
        int hashCode10 = hashCode9 + (renderingBehavior != null ? renderingBehavior.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(12, false);
        builder.token = this.id;
        builder.source = this.merchant_id;
        builder.created_at = this.updated_at;
        builder.completed_at = this.created_at;
        builder.failed_at = this.expires_at;
        builder.target = this.client_id;
        builder.state = this.action_type;
        builder.amount = this.account_reference_id;
        builder.push_amount = this.rendering_behavior;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.merchant_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_id=", arrayList);
        }
        Long l = this.updated_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l, arrayList);
        }
        Long l2 = this.created_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l2, arrayList);
        }
        Long l3 = this.expires_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l3, arrayList);
        }
        String str3 = this.client_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_id=", arrayList);
        }
        ActionType actionType = this.action_type;
        if (actionType != null) {
            arrayList.add("action_type=" + actionType);
        }
        String str4 = this.account_reference_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "account_reference_id=", arrayList);
        }
        RenderingBehavior renderingBehavior = this.rendering_behavior;
        if (renderingBehavior != null) {
            arrayList.add("rendering_behavior=" + renderingBehavior);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncBusinessGrant{", "}", 0, null, null, 56);
    }
}
