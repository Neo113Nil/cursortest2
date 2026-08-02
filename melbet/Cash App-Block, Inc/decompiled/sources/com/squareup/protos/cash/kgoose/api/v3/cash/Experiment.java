package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.Profile;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/Experiment;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/Experiment$Builder;", "", "experiment_id", "Ljava/lang/String;", "experiment_name", "Lcom/squareup/protos/cash/kgoose/api/v3/Profile;", "variant_a_profile", "Lcom/squareup/protos/cash/kgoose/api/v3/Profile;", "variant_b_profile", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Experiment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Experiment> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String experiment_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String experiment_name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Profile#ADAPTER", schemaIndex = 2, tag = 3)
    public final Profile variant_a_profile;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Profile#ADAPTER", schemaIndex = 3, tag = 4)
    public final Profile variant_b_profile;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/Experiment$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/Experiment;", "<init>", "()V", "experiment_id", "", "experiment_name", "variant_a_profile", "Lcom/squareup/protos/cash/kgoose/api/v3/Profile;", "variant_b_profile", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String experiment_id;
        public String experiment_name;
        public Profile variant_a_profile;
        public Profile variant_b_profile;

        @Override // com.squareup.wire.Message.Builder
        public Experiment build() {
            return new Experiment(this.experiment_id, this.experiment_name, this.variant_a_profile, this.variant_b_profile, buildUnknownFields());
        }

        public final Builder experiment_id(String experiment_id) {
            this.experiment_id = experiment_id;
            return this;
        }

        public final Builder experiment_name(String experiment_name) {
            this.experiment_name = experiment_name;
            return this;
        }

        public final Builder variant_a_profile(Profile variant_a_profile) {
            this.variant_a_profile = variant_a_profile;
            return this;
        }

        public final Builder variant_b_profile(Profile variant_b_profile) {
            this.variant_b_profile = variant_b_profile;
            return this;
        }
    }

    static {
        Experiment$Companion$ADAPTER$1 experiment$Companion$ADAPTER$1 = new Experiment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Experiment.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.cash.Experiment", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_experiments_messages.proto");
        ADAPTER = experiment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(experiment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Experiment(String str, String str2, Profile profile, Profile profile2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.experiment_id = str;
        this.experiment_name = str2;
        this.variant_a_profile = profile;
        this.variant_b_profile = profile2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Experiment)) {
            return false;
        }
        Experiment experiment = (Experiment) obj;
        return Intrinsics.areEqual(unknownFields(), experiment.unknownFields()) && Intrinsics.areEqual(this.experiment_id, experiment.experiment_id) && Intrinsics.areEqual(this.experiment_name, experiment.experiment_name) && Intrinsics.areEqual(this.variant_a_profile, experiment.variant_a_profile) && Intrinsics.areEqual(this.variant_b_profile, experiment.variant_b_profile);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.experiment_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.experiment_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Profile profile = this.variant_a_profile;
        int hashCode4 = (hashCode3 + (profile != null ? profile.hashCode() : 0)) * 37;
        Profile profile2 = this.variant_b_profile;
        int hashCode5 = hashCode4 + (profile2 != null ? profile2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.experiment_id = this.experiment_id;
        builder.experiment_name = this.experiment_name;
        builder.variant_a_profile = this.variant_a_profile;
        builder.variant_b_profile = this.variant_b_profile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.experiment_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "experiment_id=", arrayList);
        }
        String str2 = this.experiment_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "experiment_name=", arrayList);
        }
        Profile profile = this.variant_a_profile;
        if (profile != null) {
            arrayList.add("variant_a_profile=" + profile);
        }
        Profile profile2 = this.variant_b_profile;
        if (profile2 != null) {
            arrayList.add("variant_b_profile=" + profile2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Experiment{", "}", 0, null, null, 56);
    }
}
