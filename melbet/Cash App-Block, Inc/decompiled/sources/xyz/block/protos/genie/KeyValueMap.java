package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.savings.GoalFolder;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes10.dex */
public final class KeyValueMap extends Message {
    public static final ProtoAdapter ADAPTER = new KeyValueMap$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KeyValueMap.class), "type.googleapis.com/xyz.block.genie.v1.KeyValueMap", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
    public final List entries;

    public final class Entry extends Message {
        public static final ProtoAdapter ADAPTER = new KeyValueMap$Entry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Entry.class), "type.googleapis.com/xyz.block.genie.v1.KeyValueMap.Entry", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
        public final ByteString blob_value;
        public final Boolean bool_value;
        public final Collection collection;
        public final Double float_value;
        public final KeyValueMap group;
        public final Long int_value;
        public final String key;
        public final String string_value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Entry(String str, String str2, Long l, Double d, Boolean bool, ByteString byteString, KeyValueMap keyValueMap, Collection collection, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.key = str;
            this.string_value = str2;
            this.int_value = l;
            this.float_value = d;
            this.bool_value = bool;
            this.blob_value = byteString;
            this.group = keyValueMap;
            this.collection = collection;
            if (TransactorKt.countNonNull(str2, l, d, bool, byteString, keyValueMap, collection) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of string_value, int_value, float_value, bool_value, blob_value, group, collection may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(unknownFields(), entry.unknownFields()) && Intrinsics.areEqual(this.key, entry.key) && Intrinsics.areEqual(this.string_value, entry.string_value) && Intrinsics.areEqual(this.int_value, entry.int_value) && Intrinsics.areEqual(this.float_value, entry.float_value) && Intrinsics.areEqual(this.bool_value, entry.bool_value) && Intrinsics.areEqual(this.blob_value, entry.blob_value) && Intrinsics.areEqual(this.group, entry.group) && Intrinsics.areEqual(this.collection, entry.collection);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.key;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.string_value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Long l = this.int_value;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Double d = this.float_value;
            int hashCode5 = (hashCode4 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            Boolean bool = this.bool_value;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            ByteString byteString = this.blob_value;
            int hashCode7 = (hashCode6 + (byteString != null ? byteString.hashCode() : 0)) * 37;
            KeyValueMap keyValueMap = this.group;
            int hashCode8 = (hashCode7 + (keyValueMap != null ? keyValueMap.hashCode() : 0)) * 37;
            Collection collection = this.collection;
            int hashCode9 = hashCode8 + (collection != null ? collection.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GoalFolder.Builder builder = new GoalFolder.Builder(13);
            builder.token = this.key;
            builder.icon_unicode = this.string_value;
            builder.completion_token = this.int_value;
            builder.label = this.float_value;
            builder.met_goal = this.bool_value;
            builder.goal_flow_parameters = this.blob_value;
            builder.goal_amount = this.group;
            builder.goal_progress_percentage = this.collection;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
            }
            String str2 = this.string_value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "string_value=", arrayList);
            }
            Long l = this.int_value;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("int_value=", l, arrayList);
            }
            Double d = this.float_value;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("float_value=", d, arrayList);
            }
            Boolean bool = this.bool_value;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("bool_value=", bool, arrayList);
            }
            ByteString byteString = this.blob_value;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("blob_value=", byteString, arrayList);
            }
            KeyValueMap keyValueMap = this.group;
            if (keyValueMap != null) {
                arrayList.add("group=" + keyValueMap);
            }
            Collection collection = this.collection;
            if (collection != null) {
                arrayList.add("collection=" + collection);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Entry{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyValueMap(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.entries = TransactorKt.immutableCopyOf("entries", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValueMap)) {
            return false;
        }
        KeyValueMap keyValueMap = (KeyValueMap) obj;
        return Intrinsics.areEqual(unknownFields(), keyValueMap.unknownFields()) && Intrinsics.areEqual(this.entries, keyValueMap.entries);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.entries.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        KeyPath.Builder builder = new KeyPath.Builder();
        builder.segments = this.entries;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.entries;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entries=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeyValueMap{", "}", 0, null, null, 56);
    }
}
