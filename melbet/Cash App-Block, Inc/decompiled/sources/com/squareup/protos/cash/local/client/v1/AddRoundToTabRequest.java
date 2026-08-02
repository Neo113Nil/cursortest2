package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AddRoundToTabRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddRoundToTabRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final List cart_line_selections;
    public final String cart_token;
    public final String cart_version;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public String anonymous_user_app_token;
        public List cart_line_selections = EmptyList.INSTANCE;
        public String cart_token;
        public String cart_version;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new AddRoundToTabRequest(this.cart_token, this.cart_version, this.anonymous_user_app_token, this.cart_line_selections, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddRoundToTabRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.AddRoundToTabRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AddRoundToTabRequest((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        m.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddRoundToTabRequest addRoundToTabRequest = (AddRoundToTabRequest) obj;
                reverseProtoWriter.getClass();
                addRoundToTabRequest.getClass();
                reverseProtoWriter.writeBytes(addRoundToTabRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, addRoundToTabRequest.anonymous_user_app_token);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, addRoundToTabRequest.cart_line_selections);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, addRoundToTabRequest.cart_version);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addRoundToTabRequest.cart_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddRoundToTabRequest addRoundToTabRequest = (AddRoundToTabRequest) obj;
                addRoundToTabRequest.getClass();
                int size$okio = addRoundToTabRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, addRoundToTabRequest.anonymous_user_app_token) + LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(3, addRoundToTabRequest.cart_line_selections) + protoAdapter2.encodedSizeWithTag(2, addRoundToTabRequest.cart_version) + protoAdapter2.encodedSizeWithTag(1, addRoundToTabRequest.cart_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddRoundToTabRequest addRoundToTabRequest = (AddRoundToTabRequest) obj;
                addRoundToTabRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(addRoundToTabRequest.cart_line_selections, LocalCart.Line.Selection.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = addRoundToTabRequest.cart_token;
                String str2 = addRoundToTabRequest.cart_version;
                String str3 = addRoundToTabRequest.anonymous_user_app_token;
                byteString.getClass();
                return new AddRoundToTabRequest(str, str2, str3, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddRoundToTabRequest addRoundToTabRequest = (AddRoundToTabRequest) obj;
                addRoundToTabRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, addRoundToTabRequest.cart_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, addRoundToTabRequest.cart_version);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, addRoundToTabRequest.cart_line_selections);
                protoAdapter2.encodeWithTag(protoWriter, 4, addRoundToTabRequest.anonymous_user_app_token);
                protoWriter.writeBytes(addRoundToTabRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddRoundToTabRequest(String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.cart_token = str;
        this.cart_version = str2;
        this.anonymous_user_app_token = str3;
        this.cart_line_selections = TransactorKt.immutableCopyOf("cart_line_selections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddRoundToTabRequest)) {
            return false;
        }
        AddRoundToTabRequest addRoundToTabRequest = (AddRoundToTabRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addRoundToTabRequest.unknownFields()) && Intrinsics.areEqual(this.cart_token, addRoundToTabRequest.cart_token) && Intrinsics.areEqual(this.cart_version, addRoundToTabRequest.cart_version) && Intrinsics.areEqual(this.cart_line_selections, addRoundToTabRequest.cart_line_selections) && Intrinsics.areEqual(this.anonymous_user_app_token, addRoundToTabRequest.anonymous_user_app_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cart_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cart_version;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.cart_line_selections);
        String str3 = this.anonymous_user_app_token;
        int hashCode3 = m + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cart_token = this.cart_token;
        builder.cart_version = this.cart_version;
        builder.cart_line_selections = this.cart_line_selections;
        builder.anonymous_user_app_token = this.anonymous_user_app_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cart_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cart_token=", arrayList);
        }
        String str2 = this.cart_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cart_version=", arrayList);
        }
        List list = this.cart_line_selections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cart_line_selections=", arrayList, list);
        }
        String str3 = this.anonymous_user_app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "anonymous_user_app_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddRoundToTabRequest{", "}", 0, null, null, 56);
    }
}
