package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u0011\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "", "version", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "Companion", "Builder", "Component", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientRenderable extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientRenderable> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Component component;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TapAction#ADAPTER", schemaIndex = 3, tag = 15)
    public final TapAction tap_action;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderType#ADAPTER", schemaIndex = 0, tag = 1)
    public final ClientRenderType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 10)
    public final Integer version;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "version", "", "Ljava/lang/Integer;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Component component;
        public TapAction tap_action;
        public ClientRenderType type;
        public Integer version;

        @Override // com.squareup.wire.Message.Builder
        public ClientRenderable build() {
            return new ClientRenderable(this.type, this.component, this.version, this.tap_action, buildUnknownFields());
        }

        public final Builder component(Component component) {
            this.component = component;
            return this;
        }

        public final Builder tap_action(TapAction tap_action) {
            this.tap_action = tap_action;
            return this;
        }

        public final Builder type(ClientRenderType type2) {
            this.type = type2;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "", "ActionCard", "ActivityList", "InsightChart", "CellList", "GenericData", "NavigationCard", "LayoutElement", "GenericComponent", "TextCard", "Brief", "CellActionCard", "TemplateCard", "McpViewHtml", "GenieCard", "SuggestionList", "SlottedCard", "PromptButtonList", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$ActionCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$ActivityList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$Brief;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$CellActionCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$CellList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenericComponent;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenericData;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenieCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$InsightChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$LayoutElement;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$McpViewHtml;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$NavigationCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$PromptButtonList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$SlottedCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$SuggestionList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$TemplateCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$TextCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Component {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard#ADAPTER", declaredName = "action_card", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$ActionCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActionCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.ActionCard value;

            public ActionCard(com.squareup.protos.cash.kgoose.api.v3.ActionCard actionCard) {
                actionCard.getClass();
                this.value = actionCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionCard) && Intrinsics.areEqual(this.value, ((ActionCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ActionCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ActionCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActivityList#ADAPTER", declaredName = "activity_list", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$ActivityList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActivityList extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.ActivityList value;

            public ActivityList(com.squareup.protos.cash.kgoose.api.v3.ActivityList activityList) {
                activityList.getClass();
                this.value = activityList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActivityList) && Intrinsics.areEqual(this.value, ((ActivityList) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ActivityList getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ActivityList(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Brief#ADAPTER", declaredName = "brief", tag = 12)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$Brief;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/Brief;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/Brief;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/Brief;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Brief extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.Brief value;

            public Brief(com.squareup.protos.cash.kgoose.api.v3.Brief brief) {
                brief.getClass();
                this.value = brief;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Brief) && Intrinsics.areEqual(this.value, ((Brief) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.Brief getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Brief(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CellActionCard#ADAPTER", declaredName = "cell_action_card", tag = 13)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$CellActionCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CellActionCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.CellActionCard value;

            public CellActionCard(com.squareup.protos.cash.kgoose.api.v3.CellActionCard cellActionCard) {
                cellActionCard.getClass();
                this.value = cellActionCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CellActionCard) && Intrinsics.areEqual(this.value, ((CellActionCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.CellActionCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CellActionCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CellList#ADAPTER", declaredName = "cell_list", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$CellList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CellList extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.CellList value;

            public CellList(com.squareup.protos.cash.kgoose.api.v3.CellList cellList) {
                cellList.getClass();
                this.value = cellList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CellList) && Intrinsics.areEqual(this.value, ((CellList) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.CellList getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CellList(value=" + this.value + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenericComponent;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/GenericComponent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GenericComponent#ADAPTER", declaredName = "generic_component", tag = 9)
        @Deprecated
        public static final /* data */ class GenericComponent extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.GenericComponent value;

            public GenericComponent(com.squareup.protos.cash.kgoose.api.v3.GenericComponent genericComponent) {
                genericComponent.getClass();
                this.value = genericComponent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GenericComponent) && Intrinsics.areEqual(this.value, ((GenericComponent) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.GenericComponent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GenericComponent(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", declaredName = "generic_data", tag = 6)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenericData;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "", "", "value", "Ljava/util/Map;", "getValue", "()Ljava/util/Map;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GenericData extends Component {
            private final Map<String, ?> value;

            public GenericData(Map map) {
                this.value = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GenericData) && Intrinsics.areEqual(this.value, ((GenericData) obj).value);
            }

            public final Map getValue() {
                return this.value;
            }

            public final int hashCode() {
                Map<String, ?> map = this.value;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("GenericData(value=", ")", this.value);
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.GenieCard#ADAPTER", declaredName = "genie_card", tag = 17)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$GenieCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GenieCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.GenieCard value;

            public GenieCard(com.squareup.protos.cash.kgoose.api.v3.GenieCard genieCard) {
                genieCard.getClass();
                this.value = genieCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GenieCard) && Intrinsics.areEqual(this.value, ((GenieCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.GenieCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GenieCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InsightChart#ADAPTER", declaredName = "insight_chart", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$InsightChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InsightChart extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.InsightChart value;

            public InsightChart(com.squareup.protos.cash.kgoose.api.v3.InsightChart insightChart) {
                insightChart.getClass();
                this.value = insightChart;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InsightChart) && Intrinsics.areEqual(this.value, ((InsightChart) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.InsightChart getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InsightChart(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement#ADAPTER", declaredName = "layout_element", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$LayoutElement;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LayoutElement extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.LayoutElement value;

            public LayoutElement(com.squareup.protos.cash.kgoose.api.v3.LayoutElement layoutElement) {
                layoutElement.getClass();
                this.value = layoutElement;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LayoutElement) && Intrinsics.areEqual(this.value, ((LayoutElement) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.LayoutElement getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LayoutElement(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.McpViewHtml#ADAPTER", declaredName = "mcp_view_html", tag = 16)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$McpViewHtml;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpViewHtml;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/McpViewHtml;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/McpViewHtml;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class McpViewHtml extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.McpViewHtml value;

            public McpViewHtml(com.squareup.protos.cash.kgoose.api.v3.McpViewHtml mcpViewHtml) {
                mcpViewHtml.getClass();
                this.value = mcpViewHtml;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof McpViewHtml) && Intrinsics.areEqual(this.value, ((McpViewHtml) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.McpViewHtml getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "McpViewHtml(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NavigationCard#ADAPTER", declaredName = "navigation_card", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$NavigationCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/NavigationCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigationCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.NavigationCard value;

            public NavigationCard(com.squareup.protos.cash.kgoose.api.v3.NavigationCard navigationCard) {
                navigationCard.getClass();
                this.value = navigationCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigationCard) && Intrinsics.areEqual(this.value, ((NavigationCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.NavigationCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "NavigationCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PromptButtonList#ADAPTER", declaredName = "prompt_button_list", tag = 20)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$PromptButtonList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptButtonList;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptButtonList;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/PromptButtonList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PromptButtonList extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.PromptButtonList value;

            public PromptButtonList(com.squareup.protos.cash.kgoose.api.v3.PromptButtonList promptButtonList) {
                promptButtonList.getClass();
                this.value = promptButtonList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PromptButtonList) && Intrinsics.areEqual(this.value, ((PromptButtonList) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.PromptButtonList getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PromptButtonList(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SlottedCard#ADAPTER", declaredName = "slotted_card", tag = 19)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$SlottedCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SlottedCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.SlottedCard value;

            public SlottedCard(com.squareup.protos.cash.kgoose.api.v3.SlottedCard slottedCard) {
                slottedCard.getClass();
                this.value = slottedCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SlottedCard) && Intrinsics.areEqual(this.value, ((SlottedCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.SlottedCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SlottedCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SuggestionList#ADAPTER", declaredName = "suggestion_list", tag = 18)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$SuggestionList;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/SuggestionList;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SuggestionList;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SuggestionList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SuggestionList extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.SuggestionList value;

            public SuggestionList(com.squareup.protos.cash.kgoose.api.v3.SuggestionList suggestionList) {
                suggestionList.getClass();
                this.value = suggestionList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuggestionList) && Intrinsics.areEqual(this.value, ((SuggestionList) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.SuggestionList getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SuggestionList(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCard#ADAPTER", declaredName = "template_card", tag = 14)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$TemplateCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TemplateCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.TemplateCard value;

            public TemplateCard(com.squareup.protos.cash.kgoose.api.v3.TemplateCard templateCard) {
                templateCard.getClass();
                this.value = templateCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TemplateCard) && Intrinsics.areEqual(this.value, ((TemplateCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.TemplateCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TemplateCard(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TextCard#ADAPTER", declaredName = "text_card", tag = 11)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component$TextCard;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextCard;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TextCard;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TextCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TextCard extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.TextCard value;

            public TextCard(com.squareup.protos.cash.kgoose.api.v3.TextCard textCard) {
                textCard.getClass();
                this.value = textCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextCard) && Intrinsics.areEqual(this.value, ((TextCard) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.TextCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TextCard(value=" + this.value + ")";
            }
        }
    }

    static {
        ClientRenderable$Companion$ADAPTER$1 clientRenderable$Companion$ADAPTER$1 = new ClientRenderable$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRenderable.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ClientRenderable", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = clientRenderable$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientRenderable$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRenderable(ClientRenderType clientRenderType, Component component, Integer num, TapAction tapAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = clientRenderType;
        this.component = component;
        this.version = num;
        this.tap_action = tapAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientRenderable)) {
            return false;
        }
        ClientRenderable clientRenderable = (ClientRenderable) obj;
        return Intrinsics.areEqual(unknownFields(), clientRenderable.unknownFields()) && this.type == clientRenderable.type && Intrinsics.areEqual(this.component, clientRenderable.component) && Intrinsics.areEqual(this.version, clientRenderable.version) && Intrinsics.areEqual(this.tap_action, clientRenderable.tap_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientRenderType clientRenderType = this.type;
        int hashCode2 = (hashCode + (clientRenderType != null ? clientRenderType.hashCode() : 0)) * 37;
        Component component = this.component;
        int hashCode3 = (hashCode2 + (component != null ? component.hashCode() : 0)) * 37;
        Integer num = this.version;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode5 = hashCode4 + (tapAction != null ? tapAction.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.component = this.component;
        builder.version = this.version;
        builder.tap_action = this.tap_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientRenderType clientRenderType = this.type;
        if (clientRenderType != null) {
            arrayList.add("type=" + clientRenderType);
        }
        Component component = this.component;
        if (component != null) {
            arrayList.add("component=" + component);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRenderable{", "}", 0, null, null, 56);
    }
}
