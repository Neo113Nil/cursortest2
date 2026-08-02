package com.squareup.protos.franklin.ui;

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
public final class InputtedLegalName extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InputtedLegalName> CREATOR;
    public final String inputted_legal_name;
    public final String support_article_url_to_change;

    static {
        InputtedLegalName$Companion$ADAPTER$1 inputtedLegalName$Companion$ADAPTER$1 = new InputtedLegalName$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputtedLegalName.class), "type.googleapis.com/squareup.franklin.ui.InputtedLegalName", Syntax.PROTO_2, null, "squareup/franklin/ui/inputted_legal_name.proto");
        ADAPTER = inputtedLegalName$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inputtedLegalName$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputtedLegalName(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.inputted_legal_name = str;
        this.support_article_url_to_change = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputtedLegalName)) {
            return false;
        }
        InputtedLegalName inputtedLegalName = (InputtedLegalName) obj;
        return Intrinsics.areEqual(unknownFields(), inputtedLegalName.unknownFields()) && Intrinsics.areEqual(this.inputted_legal_name, inputtedLegalName.inputted_legal_name) && Intrinsics.areEqual(this.support_article_url_to_change, inputtedLegalName.support_article_url_to_change);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.inputted_legal_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.support_article_url_to_change;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(13);
        builder.server = this.inputted_legal_name;
        builder.local = this.support_article_url_to_change;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.inputted_legal_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "inputted_legal_name=", arrayList);
        }
        String str2 = this.support_article_url_to_change;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_article_url_to_change=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InputtedLegalName{", "}", 0, null, null, 56);
    }
}
