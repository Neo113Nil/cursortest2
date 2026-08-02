package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.InputValue;
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
public final class LocalAdditionalBuyerInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalAdditionalBuyerInfo> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1305type;
    public final String value;

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_BUYER_NAME(1),
        TYPE_BUYER_PHONE_NUMBER(2),
        TYPE_BUYER_EMAIL(3);

        public static final LocalAdditionalBuyerInfo$Type$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new LocalAdditionalBuyerInfo$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TYPE_BUYER_NAME;
            }
            if (i == 2) {
                return TYPE_BUYER_PHONE_NUMBER;
            }
            if (i != 3) {
                return null;
            }
            return TYPE_BUYER_EMAIL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalAdditionalBuyerInfo$Companion$ADAPTER$1 localAdditionalBuyerInfo$Companion$ADAPTER$1 = new LocalAdditionalBuyerInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalAdditionalBuyerInfo.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalAdditionalBuyerInfo", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = localAdditionalBuyerInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localAdditionalBuyerInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAdditionalBuyerInfo(Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1305type = type2;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalAdditionalBuyerInfo)) {
            return false;
        }
        LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
        return Intrinsics.areEqual(unknownFields(), localAdditionalBuyerInfo.unknownFields()) && this.f1305type == localAdditionalBuyerInfo.f1305type && Intrinsics.areEqual(this.value, localAdditionalBuyerInfo.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1305type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.value;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(15);
        builder.value = this.f1305type;
        builder.input_id = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1305type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        if (this.value != null) {
            arrayList.add("value=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalAdditionalBuyerInfo{", "}", 0, null, null, 56);
    }

    public /* synthetic */ LocalAdditionalBuyerInfo(Type type2, String str) {
        this(type2, str, ByteString.EMPTY);
    }
}
