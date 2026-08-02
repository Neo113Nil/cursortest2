package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class SyncInvestmentEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentEntity> CREATOR;
    public final List about_detail_rows;
    public final String about_text;
    public final String color;
    public final Boolean delisted;
    public final String display_name;
    public final Color entity_color;
    public final Image icon;
    public final String icon_url;
    public final Long outstanding_shares;
    public final ReleaseStage release_stage;
    public final InvestmentEntityStatus status;
    public final String symbol;
    public final Color themed_color;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentEntityType f1391type;

    /* loaded from: classes.dex */
    public final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;
        public final String detail_text;
        public final String title;

        static {
            SyncInvestmentEntity$DetailRow$Companion$ADAPTER$1 syncInvestmentEntity$DetailRow$Companion$ADAPTER$1 = new SyncInvestmentEntity$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.franklin.SyncInvestmentEntity.DetailRow", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
            ADAPTER = syncInvestmentEntity$DetailRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentEntity$DetailRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.detail_text = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.detail_text, detailRow.detail_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            IdValue.Builder builder = new IdValue.Builder(8);
            builder.server = this.title;
            builder.local = this.detail_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public enum ReleaseStage implements WireEnum {
        DO_NOT_USE_RELEASE_STAGE(0),
        PREVIEW_FOR_IPO(1),
        RELEASED(2);

        public static final SyncInvestmentEntity$ReleaseStage$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            ReleaseStage releaseStage = DO_NOT_USE_RELEASE_STAGE;
            Companion = new ByteString.Companion();
            ADAPTER = new SyncInvestmentEntity$ReleaseStage$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ReleaseStage.class), Syntax.PROTO_2, releaseStage);
        }

        ReleaseStage(int i) {
            this.value = i;
        }

        public static final ReleaseStage fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_RELEASE_STAGE;
            }
            if (i == 1) {
                return PREVIEW_FOR_IPO;
            }
            if (i != 2) {
                return null;
            }
            return RELEASED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncInvestmentEntity$Companion$ADAPTER$1 syncInvestmentEntity$Companion$ADAPTER$1 = new SyncInvestmentEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentEntity.class), "type.googleapis.com/squareup.franklin.SyncInvestmentEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentEntity(String str, String str2, String str3, InvestmentEntityType investmentEntityType, String str4, Long l, InvestmentEntityStatus investmentEntityStatus, String str5, String str6, List list, Boolean bool, Color color, Image image, Color color2, ReleaseStage releaseStage, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.symbol = str2;
        this.display_name = str3;
        this.f1391type = investmentEntityType;
        this.icon_url = str4;
        this.outstanding_shares = l;
        this.status = investmentEntityStatus;
        this.color = str5;
        this.about_text = str6;
        this.delisted = bool;
        this.entity_color = color;
        this.icon = image;
        this.themed_color = color2;
        this.release_stage = releaseStage;
        this.about_detail_rows = TransactorKt.immutableCopyOf("about_detail_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentEntity)) {
            return false;
        }
        SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentEntity.unknownFields()) && Intrinsics.areEqual(this.token, syncInvestmentEntity.token) && Intrinsics.areEqual(this.symbol, syncInvestmentEntity.symbol) && Intrinsics.areEqual(this.display_name, syncInvestmentEntity.display_name) && this.f1391type == syncInvestmentEntity.f1391type && Intrinsics.areEqual(this.icon_url, syncInvestmentEntity.icon_url) && Intrinsics.areEqual(this.outstanding_shares, syncInvestmentEntity.outstanding_shares) && this.status == syncInvestmentEntity.status && Intrinsics.areEqual(this.color, syncInvestmentEntity.color) && Intrinsics.areEqual(this.about_text, syncInvestmentEntity.about_text) && Intrinsics.areEqual(this.about_detail_rows, syncInvestmentEntity.about_detail_rows) && Intrinsics.areEqual(this.delisted, syncInvestmentEntity.delisted) && Intrinsics.areEqual(this.entity_color, syncInvestmentEntity.entity_color) && Intrinsics.areEqual(this.icon, syncInvestmentEntity.icon) && Intrinsics.areEqual(this.themed_color, syncInvestmentEntity.themed_color) && this.release_stage == syncInvestmentEntity.release_stage;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.symbol;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        InvestmentEntityType investmentEntityType = this.f1391type;
        int hashCode5 = (hashCode4 + (investmentEntityType != null ? investmentEntityType.hashCode() : 0)) * 37;
        String str4 = this.icon_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.outstanding_shares;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        InvestmentEntityStatus investmentEntityStatus = this.status;
        int hashCode8 = (hashCode7 + (investmentEntityStatus != null ? investmentEntityStatus.hashCode() : 0)) * 37;
        String str5 = this.color;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.about_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37, 37, this.about_detail_rows);
        Boolean bool = this.delisted;
        int hashCode10 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Color color = this.entity_color;
        int hashCode11 = (hashCode10 + (color != null ? color.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode12 = (hashCode11 + (image != null ? image.hashCode() : 0)) * 37;
        Color color2 = this.themed_color;
        int hashCode13 = (hashCode12 + (color2 != null ? color2.hashCode() : 0)) * 37;
        ReleaseStage releaseStage = this.release_stage;
        int hashCode14 = hashCode13 + (releaseStage != null ? releaseStage.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(7);
        builder.user_agent = this.token;
        builder.device_uuid = this.symbol;
        builder.date_format = this.display_name;
        builder.accept_language = this.f1391type;
        builder.time_format = this.icon_url;
        builder.device_installation_id = this.outstanding_shares;
        builder.drm_id = this.status;
        builder.ip_address = this.color;
        builder.device_name = this.about_text;
        builder.device_vendor_id = this.about_detail_rows;
        builder.device_id = this.delisted;
        builder.threatmetrix_smart_id = this.entity_color;
        builder.timestamp = this.icon;
        builder.navigation_paradigm = this.themed_color;
        builder.client_scenario = this.release_stage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.symbol;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "symbol=", arrayList);
        }
        String str3 = this.display_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_name=", arrayList);
        }
        InvestmentEntityType investmentEntityType = this.f1391type;
        if (investmentEntityType != null) {
            arrayList.add("type=" + investmentEntityType);
        }
        String str4 = this.icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "icon_url=", arrayList);
        }
        Long l = this.outstanding_shares;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("outstanding_shares=", l, arrayList);
        }
        InvestmentEntityStatus investmentEntityStatus = this.status;
        if (investmentEntityStatus != null) {
            arrayList.add("status=" + investmentEntityStatus);
        }
        String str5 = this.color;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "color=", arrayList);
        }
        String str6 = this.about_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "about_text=", arrayList);
        }
        List list = this.about_detail_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("about_detail_rows=", arrayList, list);
        }
        Boolean bool = this.delisted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("delisted=", bool, arrayList);
        }
        Color color = this.entity_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("entity_color=", color, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        Color color2 = this.themed_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_color=", color2, arrayList);
        }
        ReleaseStage releaseStage = this.release_stage;
        if (releaseStage != null) {
            arrayList.add("release_stage=" + releaseStage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentEntity{", "}", 0, null, null, 56);
    }
}
