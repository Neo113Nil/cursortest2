package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class AddCustomersToPoolRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddCustomersToPoolRequest> CREATOR;
    public final List customer_tokens;
    public final String pool_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddCustomersToPoolRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pools.AddCustomersToPoolRequest$Companion$ADAPTER$1
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
                        return new AddCustomersToPoolRequest((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddCustomersToPoolRequest addCustomersToPoolRequest = (AddCustomersToPoolRequest) obj;
                reverseProtoWriter.getClass();
                addCustomersToPoolRequest.getClass();
                reverseProtoWriter.writeBytes(addCustomersToPoolRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, addCustomersToPoolRequest.customer_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addCustomersToPoolRequest.pool_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddCustomersToPoolRequest addCustomersToPoolRequest = (AddCustomersToPoolRequest) obj;
                addCustomersToPoolRequest.getClass();
                int size$okio = addCustomersToPoolRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(2, addCustomersToPoolRequest.customer_tokens) + protoAdapter2.encodedSizeWithTag(1, addCustomersToPoolRequest.pool_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddCustomersToPoolRequest addCustomersToPoolRequest = (AddCustomersToPoolRequest) obj;
                addCustomersToPoolRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = addCustomersToPoolRequest.pool_token;
                List list = addCustomersToPoolRequest.customer_tokens;
                list.getClass();
                byteString.getClass();
                return new AddCustomersToPoolRequest(str, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddCustomersToPoolRequest addCustomersToPoolRequest = (AddCustomersToPoolRequest) obj;
                addCustomersToPoolRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, addCustomersToPoolRequest.pool_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, addCustomersToPoolRequest.customer_tokens);
                protoWriter.writeBytes(addCustomersToPoolRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCustomersToPoolRequest(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pool_token = str;
        this.customer_tokens = TransactorKt.immutableCopyOf("customer_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddCustomersToPoolRequest)) {
            return false;
        }
        AddCustomersToPoolRequest addCustomersToPoolRequest = (AddCustomersToPoolRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addCustomersToPoolRequest.unknownFields()) && Intrinsics.areEqual(this.pool_token, addCustomersToPoolRequest.pool_token) && Intrinsics.areEqual(this.customer_tokens, addCustomersToPoolRequest.customer_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = this.customer_tokens.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(29);
        builder.toggle_title = this.pool_token;
        builder.sections = this.customer_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        List list = this.customer_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddCustomersToPoolRequest{", "}", 0, null, null, 56);
    }
}
