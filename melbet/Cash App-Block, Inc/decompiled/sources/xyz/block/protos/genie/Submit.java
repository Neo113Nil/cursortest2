package xyz.block.protos.genie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.supportarticles.app.v1.ListSupportArticlesResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Submit extends Message {
    public static final ProtoAdapter ADAPTER = new Submit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Submit.class), "type.googleapis.com/xyz.block.genie.v1.Submit", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final String action_id;
    public final List on_error_value_mappings;
    public final List on_start_value_mappings;
    public final List request_value_mappings;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String action_id;
        public List on_error_value_mappings;
        public List on_start_value_mappings;
        public List request_value_mappings;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    String str = this.action_id;
                    if (str != null) {
                        return new Submit(str, this.request_value_mappings, this.on_start_value_mappings, this.on_error_value_mappings, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "action_id");
                    throw null;
                default:
                    return new ListSupportArticlesResponse(this.action_id, this.request_value_mappings, this.on_start_value_mappings, this.on_error_value_mappings, buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Submit(String str, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        this.action_id = str;
        this.request_value_mappings = TransactorKt.immutableCopyOf("request_value_mappings", list);
        this.on_start_value_mappings = TransactorKt.immutableCopyOf("on_start_value_mappings", list2);
        this.on_error_value_mappings = TransactorKt.immutableCopyOf("on_error_value_mappings", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Submit)) {
            return false;
        }
        Submit submit = (Submit) obj;
        return Intrinsics.areEqual(unknownFields(), submit.unknownFields()) && Intrinsics.areEqual(this.action_id, submit.action_id) && Intrinsics.areEqual(this.request_value_mappings, submit.request_value_mappings) && Intrinsics.areEqual(this.on_start_value_mappings, submit.on_start_value_mappings) && Intrinsics.areEqual(this.on_error_value_mappings, submit.on_error_value_mappings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.on_error_value_mappings.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.action_id), 37, this.request_value_mappings), 37, this.on_start_value_mappings);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.action_id = this.action_id;
        builder.request_value_mappings = this.request_value_mappings;
        builder.on_start_value_mappings = this.on_start_value_mappings;
        builder.on_error_value_mappings = this.on_error_value_mappings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.action_id, "action_id=", arrayList);
        List list = this.request_value_mappings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("request_value_mappings=", arrayList, list);
        }
        List list2 = this.on_start_value_mappings;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("on_start_value_mappings=", arrayList, list2);
        }
        List list3 = this.on_error_value_mappings;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("on_error_value_mappings=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Submit{", "}", 0, null, null, 56);
    }
}
