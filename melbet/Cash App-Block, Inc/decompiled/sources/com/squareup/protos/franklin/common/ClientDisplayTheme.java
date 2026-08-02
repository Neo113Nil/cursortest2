package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class ClientDisplayTheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientDisplayTheme> CREATOR;
    public final String accent_color;
    public final String base_color;

    static {
        ClientDisplayTheme$Companion$ADAPTER$1 clientDisplayTheme$Companion$ADAPTER$1 = new ClientDisplayTheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientDisplayTheme.class), "type.googleapis.com/squareup.franklin.common.ClientDisplayTheme", Syntax.PROTO_2, null, "squareup/franklin/common/card_theme.proto");
        ADAPTER = clientDisplayTheme$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientDisplayTheme$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientDisplayTheme(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.base_color = str;
        this.accent_color = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientDisplayTheme)) {
            return false;
        }
        ClientDisplayTheme clientDisplayTheme = (ClientDisplayTheme) obj;
        return Intrinsics.areEqual(unknownFields(), clientDisplayTheme.unknownFields()) && Intrinsics.areEqual(this.base_color, clientDisplayTheme.base_color) && Intrinsics.areEqual(this.accent_color, clientDisplayTheme.accent_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.base_color;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accent_color;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(3);
        builder.server = this.base_color;
        builder.local = this.accent_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.base_color;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_color=", arrayList);
        }
        String str2 = this.accent_color;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accent_color=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientDisplayTheme{", "}", 0, null, null, 56);
    }
}
