package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.lending.OpaqueRoute;
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

/* loaded from: classes8.dex */
public final class GroupActivityRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GroupActivityRenderData> CREATOR;
    public final String action_link;
    public final GroupActivityRenderData$Params$MemberAdded params;

    public final class MemberAdded extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MemberAdded> CREATOR;
        public final String added_by_customer_name;

        static {
            GroupActivityRenderData$MemberAdded$Companion$ADAPTER$1 groupActivityRenderData$MemberAdded$Companion$ADAPTER$1 = new GroupActivityRenderData$MemberAdded$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MemberAdded.class), "type.googleapis.com/squareup.franklin.GroupActivityRenderData.MemberAdded", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = groupActivityRenderData$MemberAdded$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(groupActivityRenderData$MemberAdded$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberAdded(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.added_by_customer_name = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MemberAdded)) {
                return false;
            }
            MemberAdded memberAdded = (MemberAdded) obj;
            return Intrinsics.areEqual(unknownFields(), memberAdded.unknownFields()) && Intrinsics.areEqual(this.added_by_customer_name, memberAdded.added_by_customer_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.added_by_customer_name;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(20);
            builder.client_route = this.added_by_customer_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.added_by_customer_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "added_by_customer_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MemberAdded{", "}", 0, null, null, 56);
        }
    }

    static {
        GroupActivityRenderData$Companion$ADAPTER$1 groupActivityRenderData$Companion$ADAPTER$1 = new GroupActivityRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GroupActivityRenderData.class), "type.googleapis.com/squareup.franklin.GroupActivityRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = groupActivityRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(groupActivityRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupActivityRenderData(GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.params = groupActivityRenderData$Params$MemberAdded;
        this.action_link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupActivityRenderData)) {
            return false;
        }
        GroupActivityRenderData groupActivityRenderData = (GroupActivityRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), groupActivityRenderData.unknownFields()) && Intrinsics.areEqual(this.params, groupActivityRenderData.params) && Intrinsics.areEqual(this.action_link, groupActivityRenderData.action_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = this.params;
        int hashCode2 = (hashCode + (groupActivityRenderData$Params$MemberAdded != null ? groupActivityRenderData$Params$MemberAdded.hashCode() : 0)) * 37;
        String str = this.action_link;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(8);
        builder.f1372android = this.params;
        builder.ios = this.action_link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GroupActivityRenderData$Params$MemberAdded groupActivityRenderData$Params$MemberAdded = this.params;
        if (groupActivityRenderData$Params$MemberAdded != null) {
            arrayList.add("params=" + groupActivityRenderData$Params$MemberAdded);
        }
        String str = this.action_link;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_link=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GroupActivityRenderData{", "}", 0, null, null, 56);
    }
}
