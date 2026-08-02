package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.ui.Color;
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
public final class Action extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Action> CREATOR;
    public final Color background_color;
    public final String text;
    public final Color text_color;
    public final String url_to_open;

    static {
        Action$Companion$ADAPTER$1 action$Companion$ADAPTER$1 = new Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.composer.app.Action", Syntax.PROTO_2, null, "squareup/cash/composer/app/AppService.proto");
        ADAPTER = action$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Action(String str, Color color, String str2, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url_to_open = str;
        this.text = str2;
        this.background_color = color;
        this.text_color = color2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.url_to_open, action.url_to_open) && Intrinsics.areEqual(this.text, action.text) && Intrinsics.areEqual(this.background_color, action.background_color) && Intrinsics.areEqual(this.text_color, action.text_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url_to_open;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.text_color;
        int hashCode5 = hashCode4 + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(24, false);
        builder.title = this.url_to_open;
        builder.icon = this.text;
        builder.enabled = this.background_color;
        builder.id = this.text_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url_to_open;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url_to_open=", arrayList);
        }
        String str2 = this.text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        Color color2 = this.text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Action(String str, String str2, Color color, Color color2) {
        this(str, color, str2, color2, ByteString.EMPTY);
    }
}
