package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TagDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TagDefinition> CREATOR;
    public final zzjf filter_type;
    public final String label;

    public final class Membership extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Membership> CREATOR;
        public final String id;

        static {
            TagDefinition$Membership$Companion$ADAPTER$1 tagDefinition$Membership$Companion$ADAPTER$1 = new TagDefinition$Membership$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Membership.class), "type.googleapis.com/squareup.cash.local.client.v1.TagDefinition.Membership", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
            ADAPTER = tagDefinition$Membership$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(tagDefinition$Membership$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Membership(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Membership)) {
                return false;
            }
            Membership membership = (Membership) obj;
            return Intrinsics.areEqual(unknownFields(), membership.unknownFields()) && Intrinsics.areEqual(this.id, membership.id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Instrument.Builder builder = new Instrument.Builder(15);
            builder.token = this.id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Membership{", "}", 0, null, null, 56);
        }
    }

    public final class OpenNow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenNow> CREATOR;

        static {
            TagDefinition$OpenNow$Companion$ADAPTER$1 tagDefinition$OpenNow$Companion$ADAPTER$1 = new TagDefinition$OpenNow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenNow.class), "type.googleapis.com/squareup.cash.local.client.v1.TagDefinition.OpenNow", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
            ADAPTER = tagDefinition$OpenNow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(tagDefinition$OpenNow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNow(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof OpenNow) && Intrinsics.areEqual(unknownFields(), ((OpenNow) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CopyCardNumber.Builder builder = new CopyCardNumber.Builder(4);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "OpenNow{}";
        }
    }

    static {
        TagDefinition$Companion$ADAPTER$1 tagDefinition$Companion$ADAPTER$1 = new TagDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TagDefinition.class), "type.googleapis.com/squareup.cash.local.client.v1.TagDefinition", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
        ADAPTER = tagDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tagDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagDefinition(String str, zzjf zzjfVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = str;
        this.filter_type = zzjfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagDefinition)) {
            return false;
        }
        TagDefinition tagDefinition = (TagDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), tagDefinition.unknownFields()) && Intrinsics.areEqual(this.label, tagDefinition.label) && Intrinsics.areEqual(this.filter_type, tagDefinition.filter_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        zzjf zzjfVar = this.filter_type;
        int hashCode3 = hashCode2 + (zzjfVar != null ? zzjfVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(20);
        builder.input_id = this.label;
        builder.value = this.filter_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        zzjf zzjfVar = this.filter_type;
        if (zzjfVar != null) {
            arrayList.add("filter_type=" + zzjfVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TagDefinition{", "}", 0, null, null, 56);
    }
}
