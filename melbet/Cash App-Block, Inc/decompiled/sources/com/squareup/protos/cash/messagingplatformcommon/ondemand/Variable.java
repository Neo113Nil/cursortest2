package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjy;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class Variable extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Variable> CREATOR;
    public final zzjy message;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1319type;
    public final String variable_name;

    public enum Type implements WireEnum {
        STRING(1),
        LOCALIZABLE_STRING(2),
        MONEY(3);

        public final int value;
        public static final RetailerType.Companion Companion = new RetailerType.Companion();
        public static final Variable$Type$Companion$ADAPTER$1 ADAPTER = new Variable$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return STRING;
            }
            if (i == 2) {
                return LOCALIZABLE_STRING;
            }
            if (i != 3) {
                return null;
            }
            return MONEY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Variable$Companion$ADAPTER$1 variable$Companion$ADAPTER$1 = new Variable$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Variable.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.ondemand.Variable", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/ondemand/Variable.proto");
        ADAPTER = variable$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(variable$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Variable(String str, Type type2, zzjy zzjyVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.variable_name = str;
        this.f1319type = type2;
        this.message = zzjyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Variable)) {
            return false;
        }
        Variable variable = (Variable) obj;
        return Intrinsics.areEqual(unknownFields(), variable.unknownFields()) && Intrinsics.areEqual(this.variable_name, variable.variable_name) && this.f1319type == variable.f1319type && Intrinsics.areEqual(this.message, variable.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.variable_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Type type2 = this.f1319type;
        int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
        zzjy zzjyVar = this.message;
        int hashCode4 = hashCode3 + (zzjyVar != null ? zzjyVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(16, false);
        builder.advertisement_data = this.variable_name;
        builder.transmission_level = this.f1319type;
        builder.frequency = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.variable_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "variable_name=", arrayList);
        }
        Type type2 = this.f1319type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        if (this.message != null) {
            arrayList.add("message=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Variable{", "}", 0, null, null, 56);
    }
}
