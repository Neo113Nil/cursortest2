package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity$Builder;", "", "origin_message_id", "Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryUpdateActivity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MemoryUpdateActivity> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String origin_message_id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MemoryUpdateActivity;", "<init>", "()V", "origin_message_id", "", AnnotatedPrivateKey.LABEL, "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String label;
        public String origin_message_id;

        @Override // com.squareup.wire.Message.Builder
        public MemoryUpdateActivity build() {
            return new MemoryUpdateActivity(this.origin_message_id, this.label, buildUnknownFields());
        }

        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        public final Builder origin_message_id(String origin_message_id) {
            this.origin_message_id = origin_message_id;
            return this;
        }
    }

    static {
        MemoryUpdateActivity$Companion$ADAPTER$1 memoryUpdateActivity$Companion$ADAPTER$1 = new MemoryUpdateActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MemoryUpdateActivity.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.MemoryUpdateActivity", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/activity_messages.proto");
        ADAPTER = memoryUpdateActivity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(memoryUpdateActivity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryUpdateActivity(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.origin_message_id = str;
        this.label = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryUpdateActivity)) {
            return false;
        }
        MemoryUpdateActivity memoryUpdateActivity = (MemoryUpdateActivity) obj;
        return Intrinsics.areEqual(unknownFields(), memoryUpdateActivity.unknownFields()) && Intrinsics.areEqual(this.origin_message_id, memoryUpdateActivity.origin_message_id) && Intrinsics.areEqual(this.label, memoryUpdateActivity.label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.origin_message_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.label;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.origin_message_id = this.origin_message_id;
        builder.label = this.label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.origin_message_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "origin_message_id=", arrayList);
        }
        String str2 = this.label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MemoryUpdateActivity{", "}", 0, null, null, 56);
    }
}
