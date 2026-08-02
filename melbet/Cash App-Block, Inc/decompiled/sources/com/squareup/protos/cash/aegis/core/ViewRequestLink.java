package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class ViewRequestLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ViewRequestLink> CREATOR;
    public final String text;
    public final String url;

    static {
        ViewRequestLink$Companion$ADAPTER$1 viewRequestLink$Companion$ADAPTER$1 = new ViewRequestLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewRequestLink.class), "type.googleapis.com/squareup.cash.aegis.core.ViewRequestLink", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = viewRequestLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(viewRequestLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewRequestLink(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewRequestLink)) {
            return false;
        }
        ViewRequestLink viewRequestLink = (ViewRequestLink) obj;
        return Intrinsics.areEqual(unknownFields(), viewRequestLink.unknownFields()) && Intrinsics.areEqual(this.text, viewRequestLink.text) && Intrinsics.areEqual(this.url, viewRequestLink.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(7);
        builder.prefix = this.text;
        builder.name = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewRequestLink{", "}", 0, null, null, 56);
    }
}
