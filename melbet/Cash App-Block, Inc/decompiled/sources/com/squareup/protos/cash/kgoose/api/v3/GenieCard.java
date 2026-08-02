package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.ViewPlan;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0012\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$Builder;", "Lxyz/block/protos/genie/ViewPlan;", "view_plan", "Lxyz/block/protos/genie/ViewPlan;", "getView_plan$annotations", "()V", "Lcom/squareup/protos/cash/localization/LocalizedString;", "fallback_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "", "scene_slug", "Ljava/lang/String;", "description", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "scene_inputs", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "Companion", "Builder", "SceneInputs", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenieCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenieCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String description;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString fallback_text;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GenieCard$SceneInputs#ADAPTER", schemaIndex = 4, tag = 5)
    public final SceneInputs scene_inputs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String scene_slug;

    @WireField(adapter = "xyz.block.protos.genie.ViewPlan#ADAPTER", schemaIndex = 0, tag = 1)
    public final ViewPlan view_plan;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "<init>", "()V", "view_plan", "Lxyz/block/protos/genie/ViewPlan;", "fallback_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "scene_slug", "", "description", "scene_inputs", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String description;
        public LocalizedString fallback_text;
        public SceneInputs scene_inputs;
        public String scene_slug;
        public ViewPlan view_plan;

        @Override // com.squareup.wire.Message.Builder
        public GenieCard build() {
            return new GenieCard(this.view_plan, this.fallback_text, this.scene_slug, this.description, this.scene_inputs, buildUnknownFields());
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder fallback_text(LocalizedString fallback_text) {
            this.fallback_text = fallback_text;
            return this;
        }

        public final Builder scene_inputs(SceneInputs scene_inputs) {
            this.scene_inputs = scene_inputs;
            return this;
        }

        public final Builder scene_slug(String scene_slug) {
            this.scene_slug = scene_slug;
            return this;
        }

        @Deprecated
        public final Builder view_plan(ViewPlan view_plan) {
            this.view_plan = view_plan;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs$Builder;", "Lxyz/block/protos/genie/KeyValueMap;", "inputs", "Lxyz/block/protos/genie/KeyValueMap;", "getInputs$annotations", "()V", "Lokio/ByteString;", "scene_inputs", "Lokio/ByteString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SceneInputs extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SceneInputs> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "xyz.block.protos.genie.KeyValueMap#ADAPTER", schemaIndex = 0, tag = 1)
        public final KeyValueMap inputs;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 1, tag = 2)
        public final ByteString scene_inputs;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "<init>", "()V", "inputs", "Lxyz/block/protos/genie/KeyValueMap;", "scene_inputs", "Lokio/ByteString;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public KeyValueMap inputs;
            public ByteString scene_inputs;

            @Override // com.squareup.wire.Message.Builder
            public SceneInputs build() {
                return new SceneInputs(this.scene_inputs, buildUnknownFields(), this.inputs);
            }

            @Deprecated
            public final Builder inputs(KeyValueMap inputs) {
                this.inputs = inputs;
                return this;
            }

            public final Builder scene_inputs(ByteString scene_inputs) {
                this.scene_inputs = scene_inputs;
                return this;
            }
        }

        static {
            GenieCard$SceneInputs$Companion$ADAPTER$1 genieCard$SceneInputs$Companion$ADAPTER$1 = new GenieCard$SceneInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SceneInputs.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GenieCard.SceneInputs", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = genieCard$SceneInputs$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genieCard$SceneInputs$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SceneInputs(ByteString byteString, ByteString byteString2, KeyValueMap keyValueMap) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.inputs = keyValueMap;
            this.scene_inputs = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneInputs)) {
                return false;
            }
            SceneInputs sceneInputs = (SceneInputs) obj;
            return Intrinsics.areEqual(unknownFields(), sceneInputs.unknownFields()) && Intrinsics.areEqual(this.inputs, sceneInputs.inputs) && Intrinsics.areEqual(this.scene_inputs, sceneInputs.scene_inputs);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            KeyValueMap keyValueMap = this.inputs;
            int hashCode2 = (hashCode + (keyValueMap != null ? keyValueMap.hashCode() : 0)) * 37;
            ByteString byteString = this.scene_inputs;
            int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.inputs = this.inputs;
            builder.scene_inputs = this.scene_inputs;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            KeyValueMap keyValueMap = this.inputs;
            if (keyValueMap != null) {
                arrayList.add("inputs=" + keyValueMap);
            }
            ByteString byteString = this.scene_inputs;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("scene_inputs=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SceneInputs{", "}", 0, null, null, 56);
        }
    }

    static {
        GenieCard$Companion$ADAPTER$1 genieCard$Companion$ADAPTER$1 = new GenieCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenieCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GenieCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = genieCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(genieCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenieCard(ViewPlan viewPlan, LocalizedString localizedString, String str, String str2, SceneInputs sceneInputs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.view_plan = viewPlan;
        this.fallback_text = localizedString;
        this.scene_slug = str;
        this.description = str2;
        this.scene_inputs = sceneInputs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenieCard)) {
            return false;
        }
        GenieCard genieCard = (GenieCard) obj;
        return Intrinsics.areEqual(unknownFields(), genieCard.unknownFields()) && Intrinsics.areEqual(this.view_plan, genieCard.view_plan) && Intrinsics.areEqual(this.fallback_text, genieCard.fallback_text) && Intrinsics.areEqual(this.scene_slug, genieCard.scene_slug) && Intrinsics.areEqual(this.description, genieCard.description) && Intrinsics.areEqual(this.scene_inputs, genieCard.scene_inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewPlan viewPlan = this.view_plan;
        int hashCode2 = (hashCode + (viewPlan != null ? viewPlan.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.fallback_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str = this.scene_slug;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SceneInputs sceneInputs = this.scene_inputs;
        int hashCode6 = hashCode5 + (sceneInputs != null ? sceneInputs.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.view_plan = this.view_plan;
        builder.fallback_text = this.fallback_text;
        builder.scene_slug = this.scene_slug;
        builder.description = this.description;
        builder.scene_inputs = this.scene_inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewPlan viewPlan = this.view_plan;
        if (viewPlan != null) {
            arrayList.add("view_plan=" + viewPlan);
        }
        LocalizedString localizedString = this.fallback_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("fallback_text=", localizedString, arrayList);
        }
        String str = this.scene_slug;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scene_slug=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        SceneInputs sceneInputs = this.scene_inputs;
        if (sceneInputs != null) {
            arrayList.add("scene_inputs=" + sceneInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenieCard{", "}", 0, null, null, 56);
    }
}
