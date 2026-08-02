package com.squareup.protos.cash.cashidv.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
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
public final class Button extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button> CREATOR;
    public final Action action;
    public final String text;

    public enum Action implements WireEnum {
        ACTION_SUBMIT(0),
        ACTION_SIGN_OUT(1),
        ACTION_END_FLOW(2);

        public static final Button$Action$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            Action action = ACTION_SUBMIT;
            Companion = new Edge.Companion(27);
            ADAPTER = new Button$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, action);
        }

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ACTION_SUBMIT;
            }
            if (i == 1) {
                return ACTION_SIGN_OUT;
            }
            if (i != 2) {
                return null;
            }
            return ACTION_END_FLOW;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$Companion$ADAPTER$1 button$Companion$ADAPTER$1 = new Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.cashidv.common.Button", Syntax.PROTO_2, null, "squareup/cash/cashidv/common/IdvRenderConfig.proto");
        ADAPTER = button$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(String str, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && this.action == button.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(25);
        builder.errors = this.text;
        builder.result = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
    }
}
