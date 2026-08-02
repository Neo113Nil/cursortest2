package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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
public final class Button extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button> CREATOR;
    public final String action_url;
    public final Text title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String action_url;
        public Text title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Button(this.title, this.action_url, buildUnknownFields());
                default:
                    return new OverflowAction(this.title, this.action_url, buildUnknownFields());
            }
        }
    }

    static {
        Button$Companion$ADAPTER$1 button$Companion$ADAPTER$1 = new Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.Button", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/common_ui_elements.proto");
        ADAPTER = button$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(Text text, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.action_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.title, button.title) && Intrinsics.areEqual(this.action_url, button.action_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        String str = this.action_url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.action_url = this.action_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        if (this.action_url != null) {
            arrayList.add("action_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
    }
}
