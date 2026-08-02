package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashface.api.Activity;
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
public final class UtilityAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UtilityAction> CREATOR;
    public final Action click;

    public enum Action implements WireEnum {
        ACTION_UNKNOWN(0),
        ACTION_SHARE(1);

        public static final UtilityAction$Action$Companion$ADAPTER$1 ADAPTER;
        public static final Error.Code.Companion Companion;
        public final int value;

        static {
            Action action = ACTION_UNKNOWN;
            Companion = new Error.Code.Companion(26);
            ADAPTER = new UtilityAction$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, action);
        }

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ACTION_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return ACTION_SHARE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UtilityAction$Companion$ADAPTER$1 utilityAction$Companion$ADAPTER$1 = new UtilityAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UtilityAction.class), "type.googleapis.com/squareup.cash.cashface.api.UtilityAction", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = utilityAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(utilityAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilityAction(Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.click = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UtilityAction)) {
            return false;
        }
        UtilityAction utilityAction = (UtilityAction) obj;
        return Intrinsics.areEqual(unknownFields(), utilityAction.unknownFields()) && this.click == utilityAction.click;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Action action = this.click;
        int hashCode2 = hashCode + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(10);
        builder.activity = this.click;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.click;
        if (action != null) {
            arrayList.add("click=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UtilityAction{", "}", 0, null, null, 56);
    }
}
