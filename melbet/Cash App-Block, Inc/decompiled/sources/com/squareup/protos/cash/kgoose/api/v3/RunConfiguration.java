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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration$Builder;", "", "run_after", "Ljava/lang/Long;", "run_times", "result_expiration", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RunConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RunConfiguration> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long result_expiration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long run_after;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long run_times;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration;", "<init>", "()V", "run_after", "", "Ljava/lang/Long;", "run_times", "result_expiration", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long result_expiration;
        public Long run_after;
        public Long run_times;

        @Override // com.squareup.wire.Message.Builder
        public RunConfiguration build() {
            return new RunConfiguration(this.run_after, this.run_times, this.result_expiration, buildUnknownFields());
        }

        public final Builder result_expiration(Long result_expiration) {
            this.result_expiration = result_expiration;
            return this;
        }

        public final Builder run_after(Long run_after) {
            this.run_after = run_after;
            return this;
        }

        public final Builder run_times(Long run_times) {
            this.run_times = run_times;
            return this;
        }
    }

    static {
        RunConfiguration$Companion$ADAPTER$1 runConfiguration$Companion$ADAPTER$1 = new RunConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RunConfiguration.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.RunConfiguration", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = runConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(runConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunConfiguration(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.run_after = l;
        this.run_times = l2;
        this.result_expiration = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RunConfiguration)) {
            return false;
        }
        RunConfiguration runConfiguration = (RunConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), runConfiguration.unknownFields()) && Intrinsics.areEqual(this.run_after, runConfiguration.run_after) && Intrinsics.areEqual(this.run_times, runConfiguration.run_times) && Intrinsics.areEqual(this.result_expiration, runConfiguration.result_expiration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.run_after;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.run_times;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.result_expiration;
        int hashCode4 = hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.run_after = this.run_after;
        builder.run_times = this.run_times;
        builder.result_expiration = this.result_expiration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.run_after;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("run_after=", l, arrayList);
        }
        Long l2 = this.run_times;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("run_times=", l2, arrayList);
        }
        Long l3 = this.result_expiration;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("result_expiration=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RunConfiguration{", "}", 0, null, null, 56);
    }
}
