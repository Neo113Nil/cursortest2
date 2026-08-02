package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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
public final class Identifier extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Identifier> CREATOR;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final IdentifierType f1257type;

    static {
        Identifier$Companion$ADAPTER$1 identifier$Companion$ADAPTER$1 = new Identifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Identifier.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.Identifier", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/Identifier.proto");
        ADAPTER = identifier$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(identifier$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Identifier(IdentifierType identifierType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1257type = identifierType;
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Identifier)) {
            return false;
        }
        Identifier identifier = (Identifier) obj;
        return Intrinsics.areEqual(unknownFields(), identifier.unknownFields()) && this.f1257type == identifier.f1257type && Intrinsics.areEqual(this.token, identifier.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        IdentifierType identifierType = this.f1257type;
        int hashCode2 = (hashCode + (identifierType != null ? identifierType.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(10);
        builder.asset = this.f1257type;
        builder.image_url = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        IdentifierType identifierType = this.f1257type;
        if (identifierType != null) {
            arrayList.add("type=" + identifierType);
        }
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Identifier{", "}", 0, null, null, 56);
    }
}
