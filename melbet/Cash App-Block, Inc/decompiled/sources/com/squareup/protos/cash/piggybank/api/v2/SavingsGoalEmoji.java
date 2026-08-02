package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashidv.flows.IdvEndResultScreenConfig;
import com.squareup.protos.timecards.TimecardEditRequest;
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
public final class SavingsGoalEmoji extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsGoalEmoji> CREATOR;
    public final String accessibility_text;
    public final Boolean active;
    public final String name;
    public final String text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String accessibility_text;
        public Boolean active;
        public String name;
        public String text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SavingsGoalEmoji(this.active, this.name, this.text, this.accessibility_text, buildUnknownFields());
                case 1:
                    return new IdvEndResultScreenConfig(this.active, this.name, this.text, this.accessibility_text, buildUnknownFields());
                default:
                    return new TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition(this.active, this.name, this.text, this.accessibility_text, buildUnknownFields());
            }
        }
    }

    static {
        SavingsGoalEmoji$Companion$ADAPTER$1 savingsGoalEmoji$Companion$ADAPTER$1 = new SavingsGoalEmoji$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsGoalEmoji.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.SavingsGoalEmoji", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = savingsGoalEmoji$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsGoalEmoji$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsGoalEmoji(Boolean bool, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.text = str2;
        this.accessibility_text = str3;
        this.active = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsGoalEmoji)) {
            return false;
        }
        SavingsGoalEmoji savingsGoalEmoji = (SavingsGoalEmoji) obj;
        return Intrinsics.areEqual(unknownFields(), savingsGoalEmoji.unknownFields()) && Intrinsics.areEqual(this.name, savingsGoalEmoji.name) && Intrinsics.areEqual(this.text, savingsGoalEmoji.text) && Intrinsics.areEqual(this.accessibility_text, savingsGoalEmoji.accessibility_text) && Intrinsics.areEqual(this.active, savingsGoalEmoji.active);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.accessibility_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.active;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.text = this.text;
        builder.accessibility_text = this.accessibility_text;
        builder.active = this.active;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
        }
        String str3 = this.accessibility_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessibility_text=", arrayList);
        }
        Boolean bool = this.active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("active=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsGoalEmoji{", "}", 0, null, null, 56);
    }
}
