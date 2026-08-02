package com.squareup.protos.cash.badging.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BadgeCounts extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BadgeCounts> CREATOR;
    public final String customer_token;
    public final Integer global_count;
    public final Map group_counts;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BadgeCounts.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.badging.api.BadgeCounts$Companion$ADAPTER$1
            public final Lazy group_countsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.group_countsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(1));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BadgeCounts((String) obj, (Integer) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.putAll((Map) ((ProtoAdapter) this.group_countsAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BadgeCounts badgeCounts = (BadgeCounts) obj;
                reverseProtoWriter.getClass();
                badgeCounts.getClass();
                reverseProtoWriter.writeBytes(badgeCounts.unknownFields());
                ((ProtoAdapter) this.group_countsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, badgeCounts.group_counts);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, badgeCounts.global_count);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, badgeCounts.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BadgeCounts badgeCounts = (BadgeCounts) obj;
                badgeCounts.getClass();
                return ((ProtoAdapter) this.group_countsAdapter$delegate.getValue()).encodedSizeWithTag(3, badgeCounts.group_counts) + ProtoAdapter.INT32.encodedSizeWithTag(2, badgeCounts.global_count) + ProtoAdapter.STRING.encodedSizeWithTag(1, badgeCounts.customer_token) + badgeCounts.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BadgeCounts badgeCounts = (BadgeCounts) obj;
                badgeCounts.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = badgeCounts.customer_token;
                Integer num = badgeCounts.global_count;
                Map map = badgeCounts.group_counts;
                map.getClass();
                byteString.getClass();
                return new BadgeCounts(str, num, map, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BadgeCounts badgeCounts = (BadgeCounts) obj;
                badgeCounts.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, badgeCounts.customer_token);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, badgeCounts.global_count);
                ((ProtoAdapter) this.group_countsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, badgeCounts.group_counts);
                protoWriter.writeBytes(badgeCounts.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeCounts(String str, Integer num, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.global_count = num;
        this.group_counts = TransactorKt.immutableCopyOf("group_counts", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BadgeCounts)) {
            return false;
        }
        BadgeCounts badgeCounts = (BadgeCounts) obj;
        return Intrinsics.areEqual(unknownFields(), badgeCounts.unknownFields()) && Intrinsics.areEqual(this.customer_token, badgeCounts.customer_token) && Intrinsics.areEqual(this.global_count, badgeCounts.global_count) && Intrinsics.areEqual(this.group_counts, badgeCounts.group_counts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.global_count;
        int hashCode3 = this.group_counts.hashCode() + ((hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(10);
        EmptyMap.INSTANCE.getClass();
        builder.header_text = this.customer_token;
        builder.header_button = this.global_count;
        builder.groups = this.group_counts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Integer num = this.global_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("global_count=", num, arrayList);
        }
        Map map = this.group_counts;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("group_counts=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BadgeCounts{", "}", 0, null, null, 56);
    }
}
