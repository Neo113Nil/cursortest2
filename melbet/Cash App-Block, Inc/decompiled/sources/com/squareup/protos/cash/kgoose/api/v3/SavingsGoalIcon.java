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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon$Builder;", "", "icon_id", "Ljava/lang/String;", "", "progress", "Ljava/lang/Float;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsGoalIcon extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsGoalIcon> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String icon_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
    public final Float progress;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "<init>", "()V", "icon_id", "", "progress", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String icon_id;
        public Float progress;

        @Override // com.squareup.wire.Message.Builder
        public SavingsGoalIcon build() {
            return new SavingsGoalIcon(this.icon_id, this.progress, buildUnknownFields());
        }

        public final Builder icon_id(String icon_id) {
            this.icon_id = icon_id;
            return this;
        }

        public final Builder progress(Float progress) {
            this.progress = progress;
            return this;
        }
    }

    static {
        SavingsGoalIcon$Companion$ADAPTER$1 savingsGoalIcon$Companion$ADAPTER$1 = new SavingsGoalIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsGoalIcon.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SavingsGoalIcon", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = savingsGoalIcon$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsGoalIcon$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsGoalIcon(String str, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon_id = str;
        this.progress = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsGoalIcon)) {
            return false;
        }
        SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
        return Intrinsics.areEqual(unknownFields(), savingsGoalIcon.unknownFields()) && Intrinsics.areEqual(this.icon_id, savingsGoalIcon.icon_id) && Intrinsics.areEqual(this.progress, savingsGoalIcon.progress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.icon_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Float f = this.progress;
        int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.icon_id = this.icon_id;
        builder.progress = this.progress;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.icon_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
        }
        Float f = this.progress;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("progress=", f, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsGoalIcon{", "}", 0, null, null, 56);
    }
}
