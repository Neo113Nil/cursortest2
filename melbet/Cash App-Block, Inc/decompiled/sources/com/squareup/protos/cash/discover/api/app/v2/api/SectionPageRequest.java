package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class SectionPageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionPageRequest> CREATOR;
    public final String cursor;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SectionPageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.discover.api.app.v2.api.SectionPageRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SectionPageRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SectionPageRequest sectionPageRequest = (SectionPageRequest) obj;
                reverseProtoWriter.getClass();
                sectionPageRequest.getClass();
                reverseProtoWriter.writeBytes(sectionPageRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sectionPageRequest.cursor);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SectionPageRequest sectionPageRequest = (SectionPageRequest) obj;
                sectionPageRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, sectionPageRequest.cursor) + sectionPageRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SectionPageRequest sectionPageRequest = (SectionPageRequest) obj;
                sectionPageRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = sectionPageRequest.cursor;
                byteString.getClass();
                return new SectionPageRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SectionPageRequest sectionPageRequest = (SectionPageRequest) obj;
                sectionPageRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionPageRequest.cursor);
                protoWriter.writeBytes(sectionPageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionPageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cursor = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionPageRequest)) {
            return false;
        }
        SectionPageRequest sectionPageRequest = (SectionPageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), sectionPageRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, sectionPageRequest.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(3);
        builder.favorite_customer_token = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionPageRequest{", "}", 0, null, null, 56);
    }
}
