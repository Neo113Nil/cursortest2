package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem$Builder;", "", "action", "Ljava/lang/String;", "", "importance_score", "Ljava/lang/Double;", "reasoning", "category", "hero_message_title", "hero_message_subtitle", "hero_message_cta_text", "hero_message_detail", "customer_kickoff_message", "widget_primary_insight", "graphic_type", "", "transaction_types", "Ljava/util/List;", "", "graphic_params", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeedNextBestActionItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SeedNextBestActionItem> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String customer_kickoff_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final Map<String, String> graphic_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String graphic_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String hero_message_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String hero_message_detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String hero_message_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String hero_message_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 1, tag = 2)
    public final Double importance_score;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String reasoning;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    public final List<String> transaction_types;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String widget_primary_insight;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem;", "<init>", "()V", "action", "", "importance_score", "", "Ljava/lang/Double;", "reasoning", "category", "hero_message_title", "hero_message_subtitle", "hero_message_cta_text", "hero_message_detail", "customer_kickoff_message", "widget_primary_insight", "transaction_types", "", "graphic_type", "graphic_params", "", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionItem$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String action;
        public String category;
        public String customer_kickoff_message;
        public Map<String, String> graphic_params;
        public String graphic_type;
        public String hero_message_cta_text;
        public String hero_message_detail;
        public String hero_message_subtitle;
        public String hero_message_title;
        public Double importance_score;
        public String reasoning;
        public List<String> transaction_types = EmptyList.INSTANCE;
        public String widget_primary_insight;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.graphic_params = emptyMap;
        }

        public final Builder action(String action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SeedNextBestActionItem build() {
            return new SeedNextBestActionItem(this.action, this.importance_score, this.reasoning, this.category, this.hero_message_title, this.hero_message_subtitle, this.hero_message_cta_text, this.hero_message_detail, this.customer_kickoff_message, this.widget_primary_insight, this.transaction_types, this.graphic_type, this.graphic_params, buildUnknownFields());
        }

        public final Builder category(String category) {
            this.category = category;
            return this;
        }

        public final Builder customer_kickoff_message(String customer_kickoff_message) {
            this.customer_kickoff_message = customer_kickoff_message;
            return this;
        }

        public final Builder graphic_params(Map<String, String> graphic_params) {
            graphic_params.getClass();
            this.graphic_params = graphic_params;
            return this;
        }

        public final Builder graphic_type(String graphic_type) {
            this.graphic_type = graphic_type;
            return this;
        }

        public final Builder hero_message_cta_text(String hero_message_cta_text) {
            this.hero_message_cta_text = hero_message_cta_text;
            return this;
        }

        public final Builder hero_message_detail(String hero_message_detail) {
            this.hero_message_detail = hero_message_detail;
            return this;
        }

        public final Builder hero_message_subtitle(String hero_message_subtitle) {
            this.hero_message_subtitle = hero_message_subtitle;
            return this;
        }

        public final Builder hero_message_title(String hero_message_title) {
            this.hero_message_title = hero_message_title;
            return this;
        }

        public final Builder importance_score(Double importance_score) {
            this.importance_score = importance_score;
            return this;
        }

        public final Builder reasoning(String reasoning) {
            this.reasoning = reasoning;
            return this;
        }

        public final Builder transaction_types(List<String> transaction_types) {
            transaction_types.getClass();
            TransactorKt.checkElementsNotNull(transaction_types);
            this.transaction_types = transaction_types;
            return this;
        }

        public final Builder widget_primary_insight(String widget_primary_insight) {
            this.widget_primary_insight = widget_primary_insight;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SeedNextBestActionItem.class);
        Syntax syntax = Syntax.PROTO_2;
        SeedNextBestActionItem$Companion$ADAPTER$1 seedNextBestActionItem$Companion$ADAPTER$1 = new SeedNextBestActionItem$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = seedNextBestActionItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(seedNextBestActionItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedNextBestActionItem(String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        byteString.getClass();
        this.action = str;
        this.importance_score = d;
        this.reasoning = str2;
        this.category = str3;
        this.hero_message_title = str4;
        this.hero_message_subtitle = str5;
        this.hero_message_cta_text = str6;
        this.hero_message_detail = str7;
        this.customer_kickoff_message = str8;
        this.widget_primary_insight = str9;
        this.graphic_type = str10;
        this.transaction_types = TransactorKt.immutableCopyOf("transaction_types", list);
        this.graphic_params = TransactorKt.immutableCopyOf("graphic_params", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeedNextBestActionItem)) {
            return false;
        }
        SeedNextBestActionItem seedNextBestActionItem = (SeedNextBestActionItem) obj;
        return Intrinsics.areEqual(unknownFields(), seedNextBestActionItem.unknownFields()) && Intrinsics.areEqual(this.action, seedNextBestActionItem.action) && Intrinsics.areEqual(this.importance_score, seedNextBestActionItem.importance_score) && Intrinsics.areEqual(this.reasoning, seedNextBestActionItem.reasoning) && Intrinsics.areEqual(this.category, seedNextBestActionItem.category) && Intrinsics.areEqual(this.hero_message_title, seedNextBestActionItem.hero_message_title) && Intrinsics.areEqual(this.hero_message_subtitle, seedNextBestActionItem.hero_message_subtitle) && Intrinsics.areEqual(this.hero_message_cta_text, seedNextBestActionItem.hero_message_cta_text) && Intrinsics.areEqual(this.hero_message_detail, seedNextBestActionItem.hero_message_detail) && Intrinsics.areEqual(this.customer_kickoff_message, seedNextBestActionItem.customer_kickoff_message) && Intrinsics.areEqual(this.widget_primary_insight, seedNextBestActionItem.widget_primary_insight) && Intrinsics.areEqual(this.transaction_types, seedNextBestActionItem.transaction_types) && Intrinsics.areEqual(this.graphic_type, seedNextBestActionItem.graphic_type) && Intrinsics.areEqual(this.graphic_params, seedNextBestActionItem.graphic_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.action;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Double d = this.importance_score;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        String str2 = this.reasoning;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.category;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.hero_message_title;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.hero_message_subtitle;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.hero_message_cta_text;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.hero_message_detail;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.customer_kickoff_message;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.widget_primary_insight;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37, 37, this.transaction_types);
        String str10 = this.graphic_type;
        int hashCode11 = this.graphic_params.hashCode() + ((m + (str10 != null ? str10.hashCode() : 0)) * 37);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action = this.action;
        builder.importance_score = this.importance_score;
        builder.reasoning = this.reasoning;
        builder.category = this.category;
        builder.hero_message_title = this.hero_message_title;
        builder.hero_message_subtitle = this.hero_message_subtitle;
        builder.hero_message_cta_text = this.hero_message_cta_text;
        builder.hero_message_detail = this.hero_message_detail;
        builder.customer_kickoff_message = this.customer_kickoff_message;
        builder.widget_primary_insight = this.widget_primary_insight;
        builder.transaction_types = this.transaction_types;
        builder.graphic_type = this.graphic_type;
        builder.graphic_params = this.graphic_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action=", arrayList);
        }
        Double d = this.importance_score;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("importance_score=", d, arrayList);
        }
        String str2 = this.reasoning;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "reasoning=", arrayList);
        }
        String str3 = this.category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category=", arrayList);
        }
        String str4 = this.hero_message_title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "hero_message_title=", arrayList);
        }
        String str5 = this.hero_message_subtitle;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "hero_message_subtitle=", arrayList);
        }
        String str6 = this.hero_message_cta_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "hero_message_cta_text=", arrayList);
        }
        String str7 = this.hero_message_detail;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "hero_message_detail=", arrayList);
        }
        String str8 = this.customer_kickoff_message;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "customer_kickoff_message=", arrayList);
        }
        String str9 = this.widget_primary_insight;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "widget_primary_insight=", arrayList);
        }
        if (!this.transaction_types.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transaction_types=", arrayList, this.transaction_types);
        }
        String str10 = this.graphic_type;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "graphic_type=", arrayList);
        }
        if (!this.graphic_params.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("graphic_params=", this.graphic_params, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SeedNextBestActionItem{", "}", 0, null, null, 56);
    }
}
