package com.squareup.protos.cash.semaphore.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.postcard.CardScheme;
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

/* loaded from: classes7.dex */
public final class VendedFlagNode extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VendedFlagNode> CREATOR;
    public final String flag_name_prefix;
    public final List next;
    public final VendedValue vended_value;

    public final class VendedValue extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<VendedValue> CREATOR;
        public final String flag_label;
        public final String label;
        public final List read_actions;
        public final String value;

        static {
            VendedFlagNode$VendedValue$Companion$ADAPTER$1 vendedFlagNode$VendedValue$Companion$ADAPTER$1 = new VendedFlagNode$VendedValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VendedValue.class), "type.googleapis.com/squareup.cash.semaphore.api.VendedFlagNode.VendedValue", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/VendedFlagNode.proto");
            ADAPTER = vendedFlagNode$VendedValue$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(vendedFlagNode$VendedValue$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendedValue(String str, String str2, String str3, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.flag_label = str;
            this.value = str2;
            this.label = str3;
            this.read_actions = TransactorKt.immutableCopyOf("read_actions", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VendedValue)) {
                return false;
            }
            VendedValue vendedValue = (VendedValue) obj;
            return Intrinsics.areEqual(unknownFields(), vendedValue.unknownFields()) && Intrinsics.areEqual(this.flag_label, vendedValue.flag_label) && Intrinsics.areEqual(this.value, vendedValue.value) && Intrinsics.areEqual(this.label, vendedValue.label) && Intrinsics.areEqual(this.read_actions, vendedValue.read_actions);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.flag_label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.label;
            int hashCode4 = this.read_actions.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.SessionAuthentication.Builder builder = new Action.SessionAuthentication.Builder(2);
            builder.associated_request_id = this.flag_label;
            builder.associated_redirect_url = this.value;
            builder.associated_client_id = this.label;
            builder.scopes = this.read_actions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.flag_label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flag_label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            String str3 = this.label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label=", arrayList);
            }
            List list = this.read_actions;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("read_actions=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "VendedValue{", "}", 0, null, null, 56);
        }
    }

    static {
        VendedFlagNode$Companion$ADAPTER$1 vendedFlagNode$Companion$ADAPTER$1 = new VendedFlagNode$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VendedFlagNode.class), "type.googleapis.com/squareup.cash.semaphore.api.VendedFlagNode", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/VendedFlagNode.proto");
        ADAPTER = vendedFlagNode$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(vendedFlagNode$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendedFlagNode(String str, VendedValue vendedValue, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.flag_name_prefix = str;
        this.vended_value = vendedValue;
        this.next = TransactorKt.immutableCopyOf("next", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VendedFlagNode)) {
            return false;
        }
        VendedFlagNode vendedFlagNode = (VendedFlagNode) obj;
        return Intrinsics.areEqual(unknownFields(), vendedFlagNode.unknownFields()) && Intrinsics.areEqual(this.flag_name_prefix, vendedFlagNode.flag_name_prefix) && Intrinsics.areEqual(this.vended_value, vendedFlagNode.vended_value) && Intrinsics.areEqual(this.next, vendedFlagNode.next);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.flag_name_prefix;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        VendedValue vendedValue = this.vended_value;
        int hashCode3 = this.next.hashCode() + ((hashCode2 + (vendedValue != null ? vendedValue.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(16);
        builder.overflow_modules = this.flag_name_prefix;
        builder.card_home_actions = this.vended_value;
        builder.modules = this.next;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.flag_name_prefix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flag_name_prefix=", arrayList);
        }
        VendedValue vendedValue = this.vended_value;
        if (vendedValue != null) {
            arrayList.add("vended_value=" + vendedValue);
        }
        List list = this.next;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("next=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VendedFlagNode{", "}", 0, null, null, 56);
    }
}
