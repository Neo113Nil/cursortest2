package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.api.ResponseMetadata;
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

/* loaded from: classes7.dex */
public final class CounterAbuseAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CounterAbuseAction> CREATOR;
    public final Action click;
    public final String display_text;

    public enum Action implements WireEnum {
        ACTION_UNKNOWN(0),
        ACTION_BLOCK(1),
        ACTION_UNBLOCK(2),
        ACTION_REPORT(3);

        public static final CounterAbuseAction$Action$Companion$ADAPTER$1 ADAPTER;
        public static final Error.Code.Companion Companion;
        public final int value;

        static {
            Action action = ACTION_UNKNOWN;
            Companion = new Error.Code.Companion(25);
            ADAPTER = new CounterAbuseAction$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, action);
        }

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ACTION_UNKNOWN;
            }
            if (i == 1) {
                return ACTION_BLOCK;
            }
            if (i == 2) {
                return ACTION_UNBLOCK;
            }
            if (i != 3) {
                return null;
            }
            return ACTION_REPORT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CounterAbuseAction$Companion$ADAPTER$1 counterAbuseAction$Companion$ADAPTER$1 = new CounterAbuseAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CounterAbuseAction.class), "type.googleapis.com/squareup.cash.cashface.api.CounterAbuseAction", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = counterAbuseAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(counterAbuseAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterAbuseAction(String str, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_text = str;
        this.click = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterAbuseAction)) {
            return false;
        }
        CounterAbuseAction counterAbuseAction = (CounterAbuseAction) obj;
        return Intrinsics.areEqual(unknownFields(), counterAbuseAction.unknownFields()) && Intrinsics.areEqual(this.display_text, counterAbuseAction.display_text) && this.click == counterAbuseAction.click;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.click;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(19);
        builder.errors = this.display_text;
        builder.result = this.click;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.display_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_text=", arrayList);
        }
        Action action = this.click;
        if (action != null) {
            arrayList.add("click=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CounterAbuseAction{", "}", 0, null, null, 56);
    }
}
