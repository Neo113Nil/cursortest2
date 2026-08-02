package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetCustomLimitsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomLimitsRequest> CREATOR;
    public final List custom_limits;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCustomLimitsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.SetCustomLimitsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetCustomLimitsRequest((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(CustomLimit.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCustomLimitsRequest setCustomLimitsRequest = (SetCustomLimitsRequest) obj;
                reverseProtoWriter.getClass();
                setCustomLimitsRequest.getClass();
                reverseProtoWriter.writeBytes(setCustomLimitsRequest.unknownFields());
                CustomLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, setCustomLimitsRequest.custom_limits);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setCustomLimitsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCustomLimitsRequest setCustomLimitsRequest = (SetCustomLimitsRequest) obj;
                setCustomLimitsRequest.getClass();
                return CustomLimit.ADAPTER.asRepeated().encodedSizeWithTag(2, setCustomLimitsRequest.custom_limits) + ProtoAdapter.STRING.encodedSizeWithTag(1, setCustomLimitsRequest.customer_token) + setCustomLimitsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCustomLimitsRequest setCustomLimitsRequest = (SetCustomLimitsRequest) obj;
                setCustomLimitsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(setCustomLimitsRequest.custom_limits, CustomLimit.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = setCustomLimitsRequest.customer_token;
                byteString.getClass();
                return new SetCustomLimitsRequest(str, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCustomLimitsRequest setCustomLimitsRequest = (SetCustomLimitsRequest) obj;
                setCustomLimitsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCustomLimitsRequest.customer_token);
                CustomLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, setCustomLimitsRequest.custom_limits);
                protoWriter.writeBytes(setCustomLimitsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomLimitsRequest(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.custom_limits = TransactorKt.immutableCopyOf("custom_limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomLimitsRequest)) {
            return false;
        }
        SetCustomLimitsRequest setCustomLimitsRequest = (SetCustomLimitsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomLimitsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, setCustomLimitsRequest.customer_token) && Intrinsics.areEqual(this.custom_limits, setCustomLimitsRequest.custom_limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = this.custom_limits.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(5);
        builder.toggle_title = this.customer_token;
        builder.sections = this.custom_limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.custom_limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomLimitsRequest{", "}", 0, null, null, 56);
    }
}
