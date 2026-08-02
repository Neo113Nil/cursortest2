package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/franklin/app/SubmitBlockerResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/bankbook/Institution$Builder;", "Builder", "AppResponseContext", "BlockerResponseContext", "FlowResponseContext", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SubmitBlockerResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitBlockerResponse> CREATOR;
    public final AppResponseContext app_response_context;
    public final BlockerResponseContext blocker_response_context;
    public final FlowResponseContext flow_response_context;

    public final class AppResponseContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppResponseContext> CREATOR;
        public final Profile profile;
        public final SyncEntitiesResponse sync_entities_data;

        static {
            SubmitBlockerResponse$AppResponseContext$Companion$ADAPTER$1 submitBlockerResponse$AppResponseContext$Companion$ADAPTER$1 = new SubmitBlockerResponse$AppResponseContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppResponseContext.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerResponse.AppResponseContext", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
            ADAPTER = submitBlockerResponse$AppResponseContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerResponse$AppResponseContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppResponseContext(Profile profile, SyncEntitiesResponse syncEntitiesResponse, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.profile = profile;
            this.sync_entities_data = syncEntitiesResponse;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppResponseContext)) {
                return false;
            }
            AppResponseContext appResponseContext = (AppResponseContext) obj;
            return Intrinsics.areEqual(unknownFields(), appResponseContext.unknownFields()) && Intrinsics.areEqual(this.profile, appResponseContext.profile) && Intrinsics.areEqual(this.sync_entities_data, appResponseContext.sync_entities_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Profile profile = this.profile;
            int hashCode2 = (hashCode + (profile != null ? profile.hashCode() : 0)) * 37;
            SyncEntitiesResponse syncEntitiesResponse = this.sync_entities_data;
            int hashCode3 = hashCode2 + (syncEntitiesResponse != null ? syncEntitiesResponse.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SetAmountRequest.Builder builder = new SetAmountRequest.Builder(20);
            builder.request_context = this.profile;
            builder.result = this.sync_entities_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Profile profile = this.profile;
            if (profile != null) {
                arrayList.add("profile=" + profile);
            }
            SyncEntitiesResponse syncEntitiesResponse = this.sync_entities_data;
            if (syncEntitiesResponse != null) {
                arrayList.add("sync_entities_data=" + syncEntitiesResponse);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppResponseContext{", "}", 0, null, null, 56);
        }
    }

    public final class BlockerResponseContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BlockerResponseContext> CREATOR;
        public final Dialog dialog;

        public final class Dialog extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Dialog> CREATOR;
            public final String message;
            public final String title;

            static {
                SubmitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1 submitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1 = new SubmitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dialog.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerResponse.BlockerResponseContext.Dialog", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
                ADAPTER = submitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.message = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) obj;
                return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.message, dialog.message);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.message;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Header.Builder builder = new Header.Builder(27);
                builder.name = this.title;
                builder.value = this.message;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.message;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
            }
        }

        static {
            SubmitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1 submitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1 = new SubmitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockerResponseContext.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerResponse.BlockerResponseContext", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
            ADAPTER = submitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockerResponseContext(Dialog dialog, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.dialog = dialog;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlockerResponseContext)) {
                return false;
            }
            BlockerResponseContext blockerResponseContext = (BlockerResponseContext) obj;
            return Intrinsics.areEqual(unknownFields(), blockerResponseContext.unknownFields()) && Intrinsics.areEqual(this.dialog, blockerResponseContext.dialog);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Dialog dialog = this.dialog;
            int hashCode2 = hashCode + (dialog != null ? dialog.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(20);
            builder.claimable_payment = this.dialog;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Dialog dialog = this.dialog;
            if (dialog != null) {
                arrayList.add("dialog=" + dialog);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BlockerResponseContext{", "}", 0, null, null, 56);
        }
    }

    public final class FlowResponseContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FlowResponseContext> CREATOR;
        public final ScenarioPlan scenario_plan;
        public final StatusResult status_result;

        static {
            SubmitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1 submitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1 = new SubmitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FlowResponseContext.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerResponse.FlowResponseContext", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
            ADAPTER = submitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlowResponseContext(ScenarioPlan scenarioPlan, StatusResult statusResult, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.scenario_plan = scenarioPlan;
            this.status_result = statusResult;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlowResponseContext)) {
                return false;
            }
            FlowResponseContext flowResponseContext = (FlowResponseContext) obj;
            return Intrinsics.areEqual(unknownFields(), flowResponseContext.unknownFields()) && Intrinsics.areEqual(this.scenario_plan, flowResponseContext.scenario_plan) && Intrinsics.areEqual(this.status_result, flowResponseContext.status_result);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ScenarioPlan scenarioPlan = this.scenario_plan;
            int hashCode2 = (hashCode + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
            StatusResult statusResult = this.status_result;
            int hashCode3 = hashCode2 + (statusResult != null ? statusResult.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SetAmountRequest.Builder builder = new SetAmountRequest.Builder(21);
            builder.request_context = this.scenario_plan;
            builder.result = this.status_result;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ScenarioPlan scenarioPlan = this.scenario_plan;
            if (scenarioPlan != null) {
                arrayList.add("scenario_plan=" + scenarioPlan);
            }
            StatusResult statusResult = this.status_result;
            if (statusResult != null) {
                arrayList.add("status_result=" + statusResult);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FlowResponseContext{", "}", 0, null, null, 56);
        }
    }

    static {
        SubmitBlockerResponse$Companion$ADAPTER$1 submitBlockerResponse$Companion$ADAPTER$1 = new SubmitBlockerResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitBlockerResponse.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerResponse", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
        ADAPTER = submitBlockerResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitBlockerResponse(AppResponseContext appResponseContext, BlockerResponseContext blockerResponseContext, FlowResponseContext flowResponseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_response_context = appResponseContext;
        this.blocker_response_context = blockerResponseContext;
        this.flow_response_context = flowResponseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitBlockerResponse)) {
            return false;
        }
        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) obj;
        return Intrinsics.areEqual(unknownFields(), submitBlockerResponse.unknownFields()) && Intrinsics.areEqual(this.app_response_context, submitBlockerResponse.app_response_context) && Intrinsics.areEqual(this.blocker_response_context, submitBlockerResponse.blocker_response_context) && Intrinsics.areEqual(this.flow_response_context, submitBlockerResponse.flow_response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppResponseContext appResponseContext = this.app_response_context;
        int hashCode2 = (hashCode + (appResponseContext != null ? appResponseContext.hashCode() : 0)) * 37;
        BlockerResponseContext blockerResponseContext = this.blocker_response_context;
        int hashCode3 = (hashCode2 + (blockerResponseContext != null ? blockerResponseContext.hashCode() : 0)) * 37;
        FlowResponseContext flowResponseContext = this.flow_response_context;
        int hashCode4 = hashCode3 + (flowResponseContext != null ? flowResponseContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(6, false);
        builder.institution_token = this.app_response_context;
        builder.display_info = this.blocker_response_context;
        builder.help_menu_items = this.flow_response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppResponseContext appResponseContext = this.app_response_context;
        if (appResponseContext != null) {
            arrayList.add("app_response_context=" + appResponseContext);
        }
        BlockerResponseContext blockerResponseContext = this.blocker_response_context;
        if (blockerResponseContext != null) {
            arrayList.add("blocker_response_context=" + blockerResponseContext);
        }
        FlowResponseContext flowResponseContext = this.flow_response_context;
        if (flowResponseContext != null) {
            arrayList.add("flow_response_context=" + flowResponseContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitBlockerResponse{", "}", 0, null, null, 56);
    }
}
