package com.squareup.cash.supportarticles.app.v1;

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
public final class ListSupportArticlesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListSupportArticlesRequest> CREATOR;
    public final String entity_token;
    public final List support_link_tokens;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListSupportArticlesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.supportarticles.app.v1.ListSupportArticlesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListSupportArticlesRequest((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                ListSupportArticlesRequest listSupportArticlesRequest = (ListSupportArticlesRequest) obj;
                reverseProtoWriter.getClass();
                listSupportArticlesRequest.getClass();
                reverseProtoWriter.writeBytes(listSupportArticlesRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, listSupportArticlesRequest.support_link_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, listSupportArticlesRequest.entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListSupportArticlesRequest listSupportArticlesRequest = (ListSupportArticlesRequest) obj;
                listSupportArticlesRequest.getClass();
                int size$okio = listSupportArticlesRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(2, listSupportArticlesRequest.support_link_tokens) + protoAdapter2.encodedSizeWithTag(1, listSupportArticlesRequest.entity_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListSupportArticlesRequest listSupportArticlesRequest = (ListSupportArticlesRequest) obj;
                listSupportArticlesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = listSupportArticlesRequest.entity_token;
                List list = listSupportArticlesRequest.support_link_tokens;
                list.getClass();
                byteString.getClass();
                return new ListSupportArticlesRequest(str, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListSupportArticlesRequest listSupportArticlesRequest = (ListSupportArticlesRequest) obj;
                listSupportArticlesRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, listSupportArticlesRequest.entity_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, listSupportArticlesRequest.support_link_tokens);
                protoWriter.writeBytes(listSupportArticlesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSupportArticlesRequest(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.entity_token = str;
        this.support_link_tokens = TransactorKt.immutableCopyOf("support_link_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListSupportArticlesRequest)) {
            return false;
        }
        ListSupportArticlesRequest listSupportArticlesRequest = (ListSupportArticlesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listSupportArticlesRequest.unknownFields()) && Intrinsics.areEqual(this.entity_token, listSupportArticlesRequest.entity_token) && Intrinsics.areEqual(this.support_link_tokens, listSupportArticlesRequest.support_link_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_token;
        int hashCode2 = this.support_link_tokens.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(4);
        builder.toggle_title = this.entity_token;
        builder.sections = this.support_link_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_token=", arrayList);
        }
        List list = this.support_link_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("support_link_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListSupportArticlesRequest{", "}", 0, null, null, 56);
    }
}
