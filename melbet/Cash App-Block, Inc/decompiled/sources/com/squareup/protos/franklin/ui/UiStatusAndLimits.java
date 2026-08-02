package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiStatusAndLimits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiStatusAndLimits> CREATOR;
    public final Boolean adding_cash_enabled;
    public final List balance_limit_groups;
    public final Boolean has_passed_idv;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean adding_cash_enabled;
        public List balance_limit_groups;
        public Boolean has_passed_idv;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiStatusAndLimits(this.has_passed_idv, this.adding_cash_enabled, this.balance_limit_groups, buildUnknownFields());
                default:
                    return new CashAppTag(this.has_passed_idv, this.adding_cash_enabled, this.balance_limit_groups, buildUnknownFields());
            }
        }
    }

    static {
        UiStatusAndLimits$Companion$ADAPTER$1 uiStatusAndLimits$Companion$ADAPTER$1 = new UiStatusAndLimits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiStatusAndLimits.class), "type.googleapis.com/squareup.franklin.ui.UiStatusAndLimits", Syntax.PROTO_2, null, "squareup/franklin/ui/status_and_limits.proto");
        ADAPTER = uiStatusAndLimits$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiStatusAndLimits$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStatusAndLimits(Boolean bool, Boolean bool2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.has_passed_idv = bool;
        this.adding_cash_enabled = bool2;
        this.balance_limit_groups = TransactorKt.immutableCopyOf("balance_limit_groups", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiStatusAndLimits)) {
            return false;
        }
        UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
        return Intrinsics.areEqual(unknownFields(), uiStatusAndLimits.unknownFields()) && Intrinsics.areEqual(this.has_passed_idv, uiStatusAndLimits.has_passed_idv) && Intrinsics.areEqual(this.adding_cash_enabled, uiStatusAndLimits.adding_cash_enabled) && Intrinsics.areEqual(this.balance_limit_groups, uiStatusAndLimits.balance_limit_groups);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_passed_idv;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.adding_cash_enabled;
        int hashCode3 = this.balance_limit_groups.hashCode() + ((hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.has_passed_idv = this.has_passed_idv;
        builder.adding_cash_enabled = this.adding_cash_enabled;
        builder.balance_limit_groups = this.balance_limit_groups;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.has_passed_idv;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_passed_idv=", bool, arrayList);
        }
        Boolean bool2 = this.adding_cash_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("adding_cash_enabled=", bool2, arrayList);
        }
        List list = this.balance_limit_groups;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_limit_groups=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiStatusAndLimits{", "}", 0, null, null, 56);
    }
}
