package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class GetPoolsAppletRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPoolsAppletRequest> CREATOR;
    public final HighlightedPoolsSelectionMode highlighted_pools_selection_mode;
    public final Integer max_highlighted_pools;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetPoolsAppletRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pools.GetPoolsAppletRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetPoolsAppletRequest((HighlightedPoolsSelectionMode) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = HighlightedPoolsSelectionMode.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetPoolsAppletRequest getPoolsAppletRequest = (GetPoolsAppletRequest) obj;
                reverseProtoWriter.getClass();
                getPoolsAppletRequest.getClass();
                reverseProtoWriter.writeBytes(getPoolsAppletRequest.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, getPoolsAppletRequest.max_highlighted_pools);
                HighlightedPoolsSelectionMode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPoolsAppletRequest.highlighted_pools_selection_mode);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetPoolsAppletRequest getPoolsAppletRequest = (GetPoolsAppletRequest) obj;
                getPoolsAppletRequest.getClass();
                return ProtoAdapter.INT32.encodedSizeWithTag(2, getPoolsAppletRequest.max_highlighted_pools) + HighlightedPoolsSelectionMode.ADAPTER.encodedSizeWithTag(1, getPoolsAppletRequest.highlighted_pools_selection_mode) + getPoolsAppletRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetPoolsAppletRequest getPoolsAppletRequest = (GetPoolsAppletRequest) obj;
                getPoolsAppletRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                HighlightedPoolsSelectionMode highlightedPoolsSelectionMode = getPoolsAppletRequest.highlighted_pools_selection_mode;
                Integer num = getPoolsAppletRequest.max_highlighted_pools;
                byteString.getClass();
                return new GetPoolsAppletRequest(highlightedPoolsSelectionMode, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetPoolsAppletRequest getPoolsAppletRequest = (GetPoolsAppletRequest) obj;
                getPoolsAppletRequest.getClass();
                HighlightedPoolsSelectionMode.ADAPTER.encodeWithTag(protoWriter, 1, getPoolsAppletRequest.highlighted_pools_selection_mode);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getPoolsAppletRequest.max_highlighted_pools);
                protoWriter.writeBytes(getPoolsAppletRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPoolsAppletRequest(HighlightedPoolsSelectionMode highlightedPoolsSelectionMode, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.highlighted_pools_selection_mode = highlightedPoolsSelectionMode;
        this.max_highlighted_pools = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPoolsAppletRequest)) {
            return false;
        }
        GetPoolsAppletRequest getPoolsAppletRequest = (GetPoolsAppletRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPoolsAppletRequest.unknownFields()) && this.highlighted_pools_selection_mode == getPoolsAppletRequest.highlighted_pools_selection_mode && Intrinsics.areEqual(this.max_highlighted_pools, getPoolsAppletRequest.max_highlighted_pools);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HighlightedPoolsSelectionMode highlightedPoolsSelectionMode = this.highlighted_pools_selection_mode;
        int hashCode2 = (hashCode + (highlightedPoolsSelectionMode != null ? highlightedPoolsSelectionMode.hashCode() : 0)) * 37;
        Integer num = this.max_highlighted_pools;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(19);
        builder.f1329type = this.highlighted_pools_selection_mode;
        builder.use_case = this.max_highlighted_pools;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HighlightedPoolsSelectionMode highlightedPoolsSelectionMode = this.highlighted_pools_selection_mode;
        if (highlightedPoolsSelectionMode != null) {
            arrayList.add("highlighted_pools_selection_mode=" + highlightedPoolsSelectionMode);
        }
        Integer num = this.max_highlighted_pools;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_highlighted_pools=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPoolsAppletRequest{", "}", 0, null, null, 56);
    }
}
