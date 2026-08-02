package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/common/SyncEntitiesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/person/Alias$Builder;", "Builder", "RefreshAllEntitiesType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SyncEntitiesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncEntitiesResponse> CREATOR;
    public final List all_known_ranges;
    public final Long delay_next_call_ms;
    public final List entities;
    public final Boolean ignore_all_known_ranges;
    public final Boolean refresh_all_entities;
    public final RefreshAllEntitiesType refresh_all_entities_type;
    public final Boolean sync_finished;

    public enum RefreshAllEntitiesType implements WireEnum {
        DO_NOT_USE(0),
        IMMEDIATE(1),
        GRADUAL(2),
        NONE(3);

        public static final SyncEntitiesResponse$RefreshAllEntitiesType$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public final int value;

        /* JADX WARN: Type inference failed for: r2v5, types: [com.squareup.protos.franklin.common.SyncEntitiesResponse$RefreshAllEntitiesType$Companion$ADAPTER$1] */
        static {
            final RefreshAllEntitiesType refreshAllEntitiesType = DO_NOT_USE;
            Companion = new UiControl.Type.Companion();
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshAllEntitiesType.class);
            Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, refreshAllEntitiesType) { // from class: com.squareup.protos.franklin.common.SyncEntitiesResponse$RefreshAllEntitiesType$Companion$ADAPTER$1
                {
                    Syntax syntax2 = Syntax.PROTO_2;
                }

                @Override // com.squareup.wire.EnumAdapter
                public final WireEnum fromValue(int i) {
                    SyncEntitiesResponse.RefreshAllEntitiesType.Companion.getClass();
                    return UiControl.Type.Companion.m3965fromValue(i);
                }
            };
        }

        RefreshAllEntitiesType(int i) {
            this.value = i;
        }

        public static final RefreshAllEntitiesType fromValue(int i) {
            Companion.getClass();
            return UiControl.Type.Companion.m3965fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncEntitiesResponse$Companion$ADAPTER$1 syncEntitiesResponse$Companion$ADAPTER$1 = new SyncEntitiesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncEntitiesResponse.class), "type.googleapis.com/squareup.franklin.common.SyncEntitiesResponse", Syntax.PROTO_2, null, "squareup/franklin/SyncEntitiesResponseProto.proto");
        ADAPTER = syncEntitiesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncEntitiesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntitiesResponse(List list, Boolean bool, Long l, List list2, Boolean bool2, RefreshAllEntitiesType refreshAllEntitiesType, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.refresh_all_entities = bool;
        this.delay_next_call_ms = l;
        this.ignore_all_known_ranges = bool2;
        this.refresh_all_entities_type = refreshAllEntitiesType;
        this.sync_finished = bool3;
        this.entities = TransactorKt.immutableCopyOf("entities", list);
        this.all_known_ranges = TransactorKt.immutableCopyOf("all_known_ranges", list2);
    }

    public static SyncEntitiesResponse copy$default(SyncEntitiesResponse syncEntitiesResponse, List list, ByteString byteString, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            list = syncEntitiesResponse.entities;
        }
        List list2 = list;
        Boolean bool2 = syncEntitiesResponse.refresh_all_entities;
        Long l = syncEntitiesResponse.delay_next_call_ms;
        List list3 = syncEntitiesResponse.all_known_ranges;
        if ((i & 16) != 0) {
            bool = syncEntitiesResponse.ignore_all_known_ranges;
        }
        Boolean bool3 = bool;
        RefreshAllEntitiesType refreshAllEntitiesType = syncEntitiesResponse.refresh_all_entities_type;
        Boolean bool4 = syncEntitiesResponse.sync_finished;
        if ((i & 128) != 0) {
            byteString = syncEntitiesResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        syncEntitiesResponse.getClass();
        list2.getClass();
        list3.getClass();
        byteString2.getClass();
        return new SyncEntitiesResponse(list2, bool2, l, list3, bool3, refreshAllEntitiesType, bool4, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncEntitiesResponse)) {
            return false;
        }
        SyncEntitiesResponse syncEntitiesResponse = (SyncEntitiesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncEntitiesResponse.unknownFields()) && Intrinsics.areEqual(this.entities, syncEntitiesResponse.entities) && Intrinsics.areEqual(this.refresh_all_entities, syncEntitiesResponse.refresh_all_entities) && Intrinsics.areEqual(this.delay_next_call_ms, syncEntitiesResponse.delay_next_call_ms) && Intrinsics.areEqual(this.all_known_ranges, syncEntitiesResponse.all_known_ranges) && Intrinsics.areEqual(this.ignore_all_known_ranges, syncEntitiesResponse.ignore_all_known_ranges) && this.refresh_all_entities_type == syncEntitiesResponse.refresh_all_entities_type && Intrinsics.areEqual(this.sync_finished, syncEntitiesResponse.sync_finished);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.entities);
        Boolean bool = this.refresh_all_entities;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.delay_next_call_ms;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.all_known_ranges);
        Boolean bool2 = this.ignore_all_known_ranges;
        int hashCode2 = (m2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        RefreshAllEntitiesType refreshAllEntitiesType = this.refresh_all_entities_type;
        int hashCode3 = (hashCode2 + (refreshAllEntitiesType != null ? refreshAllEntitiesType.hashCode() : 0)) * 37;
        Boolean bool3 = this.sync_finished;
        int hashCode4 = hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(10);
        builder.f1407type = this.entities;
        builder.scope = this.refresh_all_entities;
        builder.first_verified_at_ms = this.delay_next_call_ms;
        builder.value = this.all_known_ranges;
        builder.last_verified_at_ms = this.ignore_all_known_ranges;
        builder.created_at = this.refresh_all_entities_type;
        builder.updated_at = this.sync_finished;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.entities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entities=", arrayList, list);
        }
        Boolean bool = this.refresh_all_entities;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refresh_all_entities=", bool, arrayList);
        }
        Long l = this.delay_next_call_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("delay_next_call_ms=", l, arrayList);
        }
        List list2 = this.all_known_ranges;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("all_known_ranges=", arrayList, list2);
        }
        Boolean bool2 = this.ignore_all_known_ranges;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ignore_all_known_ranges=", bool2, arrayList);
        }
        RefreshAllEntitiesType refreshAllEntitiesType = this.refresh_all_entities_type;
        if (refreshAllEntitiesType != null) {
            arrayList.add("refresh_all_entities_type=" + refreshAllEntitiesType);
        }
        Boolean bool3 = this.sync_finished;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sync_finished=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncEntitiesResponse{", "}", 0, null, null, 56);
    }
}
