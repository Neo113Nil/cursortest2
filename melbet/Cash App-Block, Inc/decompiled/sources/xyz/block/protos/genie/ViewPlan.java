package xyz.block.protos.genie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.AdminGetCustomerInvolvedContributionHistoryResponse;
import com.squareup.protos.cash.pools.AdminGetPoolContributionHistoryResponse;
import com.squareup.protos.cash.pools.AdminListCustomerMoneyPoolsResponse;
import com.squareup.protos.cash.pools.AdminListJoinedMoneyPoolsResponse;
import com.squareup.protos.cash.pools.AdminListPoolParticipantsResponse;
import com.squareup.protos.cash.pools.ListCustomerOwnedMoneyPoolsResponse;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolRequest;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.protos.invest.ui.Section;
import com.squareup.stafftasks.endpoints.ListTasksResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.lynx.api.app.v1_0.GetEnrichedInstrumentLinksAppResponse;
import squareup.cash.savings.VersionedSavingsFolders;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class ViewPlan extends Message {
    public static final ProtoAdapter ADAPTER = new ViewPlan$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewPlan.class), "type.googleapis.com/xyz.block.genie.v1.ViewPlan", Syntax.PROTO_2, null, "xyz/block/genie/v1/view.proto");
    public final String initial_view_slug;
    public final List view_entries;

    public final class ViewEntry extends Message {
        public static final ProtoAdapter ADAPTER = new ViewPlan$ViewEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewEntry.class), "type.googleapis.com/xyz.block.genie.v1.ViewPlan.ViewEntry", Syntax.PROTO_2, null, "xyz/block/genie/v1/view.proto");
        public final ViewSpec view;
        public final String view_slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewEntry(String str, ViewSpec viewSpec, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            viewSpec.getClass();
            byteString.getClass();
            this.view_slug = str;
            this.view = viewSpec;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ViewEntry)) {
                return false;
            }
            ViewEntry viewEntry = (ViewEntry) obj;
            return Intrinsics.areEqual(unknownFields(), viewEntry.unknownFields()) && Intrinsics.areEqual(this.view_slug, viewEntry.view_slug) && Intrinsics.areEqual(this.view, viewEntry.view);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.view.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.view_slug);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UnaryOp.Builder builder = new UnaryOp.Builder(7);
            builder.operator_ = this.view_slug;
            builder.operand = this.view;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.view_slug, "view_slug=", arrayList);
            arrayList.add("view=" + this.view);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ViewEntry{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPlan(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        str.getClass();
        byteString.getClass();
        this.initial_view_slug = str;
        this.view_entries = TransactorKt.immutableCopyOf("view_entries", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewPlan)) {
            return false;
        }
        ViewPlan viewPlan = (ViewPlan) obj;
        return Intrinsics.areEqual(unknownFields(), viewPlan.unknownFields()) && Intrinsics.areEqual(this.view_entries, viewPlan.view_entries) && Intrinsics.areEqual(this.initial_view_slug, viewPlan.initial_view_slug);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.initial_view_slug.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.view_entries);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.view_entries = this.view_entries;
        builder.initial_view_slug = this.initial_view_slug;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.view_entries;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("view_entries=", arrayList, list);
        }
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.initial_view_slug, "initial_view_slug=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewPlan{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String initial_view_slug;
        public List view_entries;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 10:
                    this.view_entries = EmptyList.INSTANCE;
                    break;
                default:
                    this.view_entries = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    List list = this.view_entries;
                    String str = this.initial_view_slug;
                    if (str != null) {
                        return new ViewPlan(list, str, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "initial_view_slug");
                    throw null;
                case 1:
                    return new AdminGetCustomerInvolvedContributionHistoryResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 2:
                    return new AdminGetPoolContributionHistoryResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 3:
                    return new AdminListCustomerMoneyPoolsResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 4:
                    return new AdminListJoinedMoneyPoolsResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 5:
                    return new AdminListPoolParticipantsResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 6:
                    return new ListCustomerOwnedMoneyPoolsResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 7:
                    return new RemoveCustomersFromPoolRequest(this.initial_view_slug, this.view_entries, buildUnknownFields());
                case 8:
                    return new InstantPayRenderData.PaybackActivity(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 9:
                    return new InstantPayRenderData.PayoutActivity(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 10:
                    return new Section(this.initial_view_slug, this.view_entries, buildUnknownFields());
                case 11:
                    return new ListTasksResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                case 12:
                    return new GetEnrichedInstrumentLinksAppResponse(this.view_entries, this.initial_view_slug, buildUnknownFields());
                default:
                    return new VersionedSavingsFolders(this.view_entries, this.initial_view_slug, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
