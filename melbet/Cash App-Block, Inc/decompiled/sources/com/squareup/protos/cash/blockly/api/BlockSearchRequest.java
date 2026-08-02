package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BlockSearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockSearchRequest> CREATOR;
    public final BlockingContext blocking_context;
    public final String from_customer_token;
    public final String search_text;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BlockSearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockly.api.BlockSearchRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BlockSearchRequest((String) obj, (String) obj2, (BlockingContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = BlockingContext.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BlockSearchRequest blockSearchRequest = (BlockSearchRequest) obj;
                reverseProtoWriter.getClass();
                blockSearchRequest.getClass();
                reverseProtoWriter.writeBytes(blockSearchRequest.unknownFields());
                BlockingContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, blockSearchRequest.blocking_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, blockSearchRequest.from_customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, blockSearchRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BlockSearchRequest blockSearchRequest = (BlockSearchRequest) obj;
                blockSearchRequest.getClass();
                int size$okio = blockSearchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockingContext.ADAPTER.encodedSizeWithTag(3, blockSearchRequest.blocking_context) + protoAdapter2.encodedSizeWithTag(2, blockSearchRequest.from_customer_token) + protoAdapter2.encodedSizeWithTag(1, blockSearchRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BlockSearchRequest blockSearchRequest = (BlockSearchRequest) obj;
                blockSearchRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = blockSearchRequest.from_customer_token;
                BlockingContext blockingContext = blockSearchRequest.blocking_context;
                byteString.getClass();
                return new BlockSearchRequest(null, str, blockingContext, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BlockSearchRequest blockSearchRequest = (BlockSearchRequest) obj;
                blockSearchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, blockSearchRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, blockSearchRequest.from_customer_token);
                BlockingContext.ADAPTER.encodeWithTag(protoWriter, 3, blockSearchRequest.blocking_context);
                protoWriter.writeBytes(blockSearchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockSearchRequest(String str, String str2, BlockingContext blockingContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_text = str;
        this.from_customer_token = str2;
        this.blocking_context = blockingContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockSearchRequest)) {
            return false;
        }
        BlockSearchRequest blockSearchRequest = (BlockSearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), blockSearchRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, blockSearchRequest.search_text) && Intrinsics.areEqual(this.from_customer_token, blockSearchRequest.from_customer_token) && this.blocking_context == blockSearchRequest.blocking_context;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.from_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BlockingContext blockingContext = this.blocking_context;
        int hashCode4 = hashCode3 + (blockingContext != null ? blockingContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(14);
        builder.header_text = this.search_text;
        builder.header_button = this.from_customer_token;
        builder.groups = this.blocking_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        String str = this.from_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "from_customer_token=", arrayList);
        }
        BlockingContext blockingContext = this.blocking_context;
        if (blockingContext != null) {
            arrayList.add("blocking_context=" + blockingContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockSearchRequest{", "}", 0, null, null, 56);
    }
}
