package com.squareup.protos.franklin.common.appmessaging;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0018\u0017\u0019\u001a\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Builder;", "", "action_identifier", "Ljava/lang/String;", "title", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action;", "action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action;", "action_argument", "Lcom/squareup/protos/franklin/api/SharingContent;", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "dialog_content", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "theme_colors", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "Companion", "Builder", "Action", "DialogContent", "ActionThemeColors", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppMessageAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessageAction> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction$Action#ADAPTER", schemaIndex = 2, tag = 3)
    public final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String action_argument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String action_identifier;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction$DialogContent#ADAPTER", schemaIndex = 5, tag = 6)
    public final DialogContent dialog_content;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ScenarioPlan#ADAPTER", schemaIndex = 6, tag = 7)
    public final ScenarioPlan scenario_plan;

    @WireField(adapter = "com.squareup.protos.franklin.api.SharingContent#ADAPTER", schemaIndex = 4, tag = 5)
    public final SharingContent sharing_content;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction$ActionThemeColors#ADAPTER", schemaIndex = 7, tag = 8)
    public final ActionThemeColors theme_colors;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "<init>", "()V", "action_identifier", "", "title", "action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action;", "action_argument", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "dialog_content", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "scenario_plan", "Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;", "theme_colors", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Action action;
        public String action_argument;
        public String action_identifier;
        public DialogContent dialog_content;
        public ScenarioPlan scenario_plan;
        public SharingContent sharing_content;
        public ActionThemeColors theme_colors;
        public String title;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        public final Builder action_argument(String action_argument) {
            this.action_argument = action_argument;
            return this;
        }

        public final Builder action_identifier(String action_identifier) {
            this.action_identifier = action_identifier;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AppMessageAction build() {
            return new AppMessageAction(this.action_identifier, this.title, this.action, this.action_argument, this.sharing_content, this.dialog_content, this.scenario_plan, this.theme_colors, buildUnknownFields());
        }

        public final Builder dialog_content(DialogContent dialog_content) {
            this.dialog_content = dialog_content;
            return this;
        }

        public final Builder scenario_plan(ScenarioPlan scenario_plan) {
            this.scenario_plan = scenario_plan;
            return this;
        }

        public final Builder sharing_content(SharingContent sharing_content) {
            this.sharing_content = sharing_content;
            return this;
        }

        public final Builder theme_colors(ActionThemeColors theme_colors) {
            this.theme_colors = theme_colors;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppMessageAction.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageAction decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AppMessageAction((String) obj, (String) obj2, (AppMessageAction.Action) obj3, (String) obj4, (SharingContent) obj5, (AppMessageAction.DialogContent) obj6, (ScenarioPlan) obj7, (AppMessageAction.ActionThemeColors) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            try {
                                obj3 = AppMessageAction.Action.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(SharingContent.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(AppMessageAction.DialogContent.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, reader, obj7);
                            break;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ActionThemeColors.ADAPTER, reader, obj8);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppMessageAction value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.action_identifier);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                AppMessageAction.Action.ADAPTER.encodeWithTag(writer, 3, value.action);
                protoAdapter2.encodeWithTag(writer, 4, value.action_argument);
                SharingContent.ADAPTER.encodeWithTag(writer, 5, value.sharing_content);
                AppMessageAction.DialogContent.ADAPTER.encodeWithTag(writer, 6, value.dialog_content);
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 7, value.scenario_plan);
                AppMessageAction.ActionThemeColors.ADAPTER.encodeWithTag(writer, 8, value.theme_colors);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppMessageAction value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return AppMessageAction.ActionThemeColors.ADAPTER.encodedSizeWithTag(8, value.theme_colors) + ScenarioPlan.ADAPTER.encodedSizeWithTag(7, value.scenario_plan) + AppMessageAction.DialogContent.ADAPTER.encodedSizeWithTag(6, value.dialog_content) + SharingContent.ADAPTER.encodedSizeWithTag(5, value.sharing_content) + protoAdapter2.encodedSizeWithTag(4, value.action_argument) + AppMessageAction.Action.ADAPTER.encodedSizeWithTag(3, value.action) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.action_identifier) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageAction redact(AppMessageAction value) {
                value.getClass();
                SharingContent sharingContent = value.sharing_content;
                SharingContent sharingContent2 = sharingContent != null ? (SharingContent) SharingContent.ADAPTER.redact(sharingContent) : null;
                AppMessageAction.DialogContent dialogContent = value.dialog_content;
                AppMessageAction.DialogContent dialogContent2 = dialogContent != null ? (AppMessageAction.DialogContent) AppMessageAction.DialogContent.ADAPTER.redact(dialogContent) : null;
                ScenarioPlan scenarioPlan = value.scenario_plan;
                ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
                AppMessageAction.ActionThemeColors actionThemeColors = value.theme_colors;
                AppMessageAction.ActionThemeColors actionThemeColors2 = actionThemeColors != null ? (AppMessageAction.ActionThemeColors) AppMessageAction.ActionThemeColors.ADAPTER.redact(actionThemeColors) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.action_identifier;
                String str2 = value.title;
                AppMessageAction.Action action = value.action;
                String str3 = value.action_argument;
                byteString.getClass();
                return new AppMessageAction(str, str2, action, str3, sharingContent2, dialogContent2, scenarioPlan2, actionThemeColors2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppMessageAction value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AppMessageAction.ActionThemeColors.ADAPTER.encodeWithTag(writer, 8, value.theme_colors);
                ScenarioPlan.ADAPTER.encodeWithTag(writer, 7, value.scenario_plan);
                AppMessageAction.DialogContent.ADAPTER.encodeWithTag(writer, 6, value.dialog_content);
                SharingContent.ADAPTER.encodeWithTag(writer, 5, value.sharing_content);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.action_argument);
                AppMessageAction.Action.ADAPTER.encodeWithTag(writer, 3, value.action);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 1, value.action_identifier);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageAction(String str, String str2, Action action, String str3, SharingContent sharingContent, DialogContent dialogContent, ScenarioPlan scenarioPlan, ActionThemeColors actionThemeColors, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_identifier = str;
        this.title = str2;
        this.action = action;
        this.action_argument = str3;
        this.sharing_content = sharingContent;
        this.dialog_content = dialogContent;
        this.scenario_plan = scenarioPlan;
        this.theme_colors = actionThemeColors;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessageAction)) {
            return false;
        }
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        return Intrinsics.areEqual(unknownFields(), appMessageAction.unknownFields()) && Intrinsics.areEqual(this.action_identifier, appMessageAction.action_identifier) && Intrinsics.areEqual(this.title, appMessageAction.title) && this.action == appMessageAction.action && Intrinsics.areEqual(this.action_argument, appMessageAction.action_argument) && Intrinsics.areEqual(this.sharing_content, appMessageAction.sharing_content) && Intrinsics.areEqual(this.dialog_content, appMessageAction.dialog_content) && Intrinsics.areEqual(this.scenario_plan, appMessageAction.scenario_plan) && Intrinsics.areEqual(this.theme_colors, appMessageAction.theme_colors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.action_identifier;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
        String str3 = this.action_argument;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        SharingContent sharingContent = this.sharing_content;
        int hashCode6 = (hashCode5 + (sharingContent != null ? sharingContent.hashCode() : 0)) * 37;
        DialogContent dialogContent = this.dialog_content;
        int hashCode7 = (hashCode6 + (dialogContent != null ? dialogContent.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode8 = (hashCode7 + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        ActionThemeColors actionThemeColors = this.theme_colors;
        int hashCode9 = hashCode8 + (actionThemeColors != null ? actionThemeColors.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action_identifier = this.action_identifier;
        builder.title = this.title;
        builder.action = this.action;
        builder.action_argument = this.action_argument;
        builder.sharing_content = this.sharing_content;
        builder.dialog_content = this.dialog_content;
        builder.scenario_plan = this.scenario_plan;
        builder.theme_colors = this.theme_colors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_identifier=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        String str3 = this.action_argument;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "action_argument=", arrayList);
        }
        SharingContent sharingContent = this.sharing_content;
        if (sharingContent != null) {
            arrayList.add("sharing_content=" + sharingContent);
        }
        DialogContent dialogContent = this.dialog_content;
        if (dialogContent != null) {
            arrayList.add("dialog_content=" + dialogContent);
        }
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        ActionThemeColors actionThemeColors = this.theme_colors;
        if (actionThemeColors != null) {
            arrayList.add("theme_colors=" + actionThemeColors);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessageAction{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "DISMISS", "OPEN_URL", "OPEN_URL_AND_DISMISS", "DRAFT_PAYMENT", "SHOW_ACCOUNT_PROFILE", "SHOW_ACTIVITY", "SHOW_THREADED_CUSTOMER_ACTIVITY", "SHOW_PAYMENT_DETAILS", "SHOW_BUSINESS_UPSELL", "SHARE", "SHOW_INVITATION_SCREEN", "SET_BUSINESS_RATE_PLAN", "SHOW_LINK_CARD_SCREEN", "SHOW_DIALOG", "INITIATE_CLIENT_SCENARIO", "REGISTER_ALIAS", "UNREGISTER_ALIAS", "INITIATE_TRANSFER_TO_STORED_BALANCE", "SHOW_BITCOIN_DRAWER", "SHOW_CASH_DRAWER", "SHOW_BOOST_PICKER_SCREEN", "START_SUPPORT_FLOW", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Action implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Action DISMISS;
        public static final Action DRAFT_PAYMENT;
        public static final Action INITIATE_CLIENT_SCENARIO;
        public static final Action INITIATE_TRANSFER_TO_STORED_BALANCE;
        public static final Action NONE;
        public static final Action OPEN_URL;
        public static final Action OPEN_URL_AND_DISMISS;
        public static final Action REGISTER_ALIAS;
        public static final Action SET_BUSINESS_RATE_PLAN;
        public static final Action SHARE;
        public static final Action SHOW_ACCOUNT_PROFILE;
        public static final Action SHOW_ACTIVITY;
        public static final Action SHOW_BITCOIN_DRAWER;
        public static final Action SHOW_BOOST_PICKER_SCREEN;
        public static final Action SHOW_BUSINESS_UPSELL;
        public static final Action SHOW_CASH_DRAWER;
        public static final Action SHOW_DIALOG;
        public static final Action SHOW_INVITATION_SCREEN;
        public static final Action SHOW_LINK_CARD_SCREEN;
        public static final Action SHOW_PAYMENT_DETAILS;
        public static final Action SHOW_THREADED_CUSTOMER_ACTIVITY;
        public static final Action START_SUPPORT_FLOW;
        public static final Action UNREGISTER_ALIAS;
        private final int value;

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{NONE, DISMISS, OPEN_URL, OPEN_URL_AND_DISMISS, DRAFT_PAYMENT, SHOW_ACCOUNT_PROFILE, SHOW_ACTIVITY, SHOW_THREADED_CUSTOMER_ACTIVITY, SHOW_PAYMENT_DETAILS, SHOW_BUSINESS_UPSELL, SHARE, SHOW_INVITATION_SCREEN, SET_BUSINESS_RATE_PLAN, SHOW_LINK_CARD_SCREEN, SHOW_DIALOG, INITIATE_CLIENT_SCENARIO, REGISTER_ALIAS, UNREGISTER_ALIAS, INITIATE_TRANSFER_TO_STORED_BALANCE, SHOW_BITCOIN_DRAWER, SHOW_CASH_DRAWER, SHOW_BOOST_PICKER_SCREEN, START_SUPPORT_FLOW};
        }

        static {
            final Action action = new Action("NONE", 0, 0);
            NONE = action;
            DISMISS = new Action("DISMISS", 1, 1);
            OPEN_URL = new Action("OPEN_URL", 2, 2);
            OPEN_URL_AND_DISMISS = new Action("OPEN_URL_AND_DISMISS", 3, 3);
            DRAFT_PAYMENT = new Action("DRAFT_PAYMENT", 4, 4);
            SHOW_ACCOUNT_PROFILE = new Action("SHOW_ACCOUNT_PROFILE", 5, 5);
            SHOW_ACTIVITY = new Action("SHOW_ACTIVITY", 6, 6);
            SHOW_THREADED_CUSTOMER_ACTIVITY = new Action("SHOW_THREADED_CUSTOMER_ACTIVITY", 7, 7);
            SHOW_PAYMENT_DETAILS = new Action("SHOW_PAYMENT_DETAILS", 8, 8);
            SHOW_BUSINESS_UPSELL = new Action("SHOW_BUSINESS_UPSELL", 9, 9);
            SHARE = new Action("SHARE", 10, 10);
            SHOW_INVITATION_SCREEN = new Action("SHOW_INVITATION_SCREEN", 11, 11);
            SET_BUSINESS_RATE_PLAN = new Action("SET_BUSINESS_RATE_PLAN", 12, 12);
            SHOW_LINK_CARD_SCREEN = new Action("SHOW_LINK_CARD_SCREEN", 13, 13);
            SHOW_DIALOG = new Action("SHOW_DIALOG", 14, 14);
            INITIATE_CLIENT_SCENARIO = new Action("INITIATE_CLIENT_SCENARIO", 15, 15);
            REGISTER_ALIAS = new Action("REGISTER_ALIAS", 16, 16);
            UNREGISTER_ALIAS = new Action("UNREGISTER_ALIAS", 17, 17);
            INITIATE_TRANSFER_TO_STORED_BALANCE = new Action("INITIATE_TRANSFER_TO_STORED_BALANCE", 18, 18);
            SHOW_BITCOIN_DRAWER = new Action("SHOW_BITCOIN_DRAWER", 19, 19);
            SHOW_CASH_DRAWER = new Action("SHOW_CASH_DRAWER", 20, 20);
            SHOW_BOOST_PICKER_SCREEN = new Action("SHOW_BOOST_PICKER_SCREEN", 21, 21);
            START_SUPPORT_FLOW = new Action("START_SUPPORT_FLOW", 22, 22);
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, action) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageAction$Action$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public AppMessageAction.Action fromValue(int value) {
                    return AppMessageAction.Action.INSTANCE.fromValue(value);
                }
            };
        }

        private Action(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Action fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Action;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Action fromValue(int value) {
                switch (value) {
                    case 0:
                        return Action.NONE;
                    case 1:
                        return Action.DISMISS;
                    case 2:
                        return Action.OPEN_URL;
                    case 3:
                        return Action.OPEN_URL_AND_DISMISS;
                    case 4:
                        return Action.DRAFT_PAYMENT;
                    case 5:
                        return Action.SHOW_ACCOUNT_PROFILE;
                    case 6:
                        return Action.SHOW_ACTIVITY;
                    case 7:
                        return Action.SHOW_THREADED_CUSTOMER_ACTIVITY;
                    case 8:
                        return Action.SHOW_PAYMENT_DETAILS;
                    case 9:
                        return Action.SHOW_BUSINESS_UPSELL;
                    case 10:
                        return Action.SHARE;
                    case 11:
                        return Action.SHOW_INVITATION_SCREEN;
                    case 12:
                        return Action.SET_BUSINESS_RATE_PLAN;
                    case 13:
                        return Action.SHOW_LINK_CARD_SCREEN;
                    case 14:
                        return Action.SHOW_DIALOG;
                    case 15:
                        return Action.INITIATE_CLIENT_SCENARIO;
                    case 16:
                        return Action.REGISTER_ALIAS;
                    case 17:
                        return Action.UNREGISTER_ALIAS;
                    case 18:
                        return Action.INITIATE_TRANSFER_TO_STORED_BALANCE;
                    case 19:
                        return Action.SHOW_BITCOIN_DRAWER;
                    case 20:
                        return Action.SHOW_CASH_DRAWER;
                    case 21:
                        return Action.SHOW_BOOST_PICKER_SCREEN;
                    case 22:
                        return Action.START_SUPPORT_FLOW;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors$Builder;", "navigation_button_background_color", "", "navigation_button_highlight_background_color", "navigation_button_text_color", "navigation_button_highlight_text_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionThemeColors extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActionThemeColors> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String navigation_button_background_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String navigation_button_highlight_background_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String navigation_button_highlight_text_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String navigation_button_text_color;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "<init>", "()V", "navigation_button_background_color", "", "navigation_button_highlight_background_color", "navigation_button_text_color", "navigation_button_highlight_text_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String navigation_button_background_color;
            public String navigation_button_highlight_background_color;
            public String navigation_button_highlight_text_color;
            public String navigation_button_text_color;

            @Override // com.squareup.wire.Message.Builder
            public ActionThemeColors build() {
                return new ActionThemeColors(this.navigation_button_background_color, this.navigation_button_highlight_background_color, this.navigation_button_text_color, this.navigation_button_highlight_text_color, buildUnknownFields());
            }

            public final Builder navigation_button_background_color(String navigation_button_background_color) {
                this.navigation_button_background_color = navigation_button_background_color;
                return this;
            }

            public final Builder navigation_button_highlight_background_color(String navigation_button_highlight_background_color) {
                this.navigation_button_highlight_background_color = navigation_button_highlight_background_color;
                return this;
            }

            public final Builder navigation_button_highlight_text_color(String navigation_button_highlight_text_color) {
                this.navigation_button_highlight_text_color = navigation_button_highlight_text_color;
                return this;
            }

            public final Builder navigation_button_text_color(String navigation_button_text_color) {
                this.navigation_button_text_color = navigation_button_text_color;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActionThemeColors.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageAction$ActionThemeColors$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AppMessageAction.ActionThemeColors decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AppMessageAction.ActionThemeColors((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AppMessageAction.ActionThemeColors value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.navigation_button_background_color);
                    protoAdapter2.encodeWithTag(writer, 2, value.navigation_button_highlight_background_color);
                    protoAdapter2.encodeWithTag(writer, 3, value.navigation_button_text_color);
                    protoAdapter2.encodeWithTag(writer, 4, value.navigation_button_highlight_text_color);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AppMessageAction.ActionThemeColors value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.navigation_button_highlight_text_color) + protoAdapter2.encodedSizeWithTag(3, value.navigation_button_text_color) + protoAdapter2.encodedSizeWithTag(2, value.navigation_button_highlight_background_color) + protoAdapter2.encodedSizeWithTag(1, value.navigation_button_background_color) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AppMessageAction.ActionThemeColors redact(AppMessageAction.ActionThemeColors value) {
                    value.getClass();
                    return AppMessageAction.ActionThemeColors.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AppMessageAction.ActionThemeColors value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.navigation_button_highlight_text_color);
                    protoAdapter2.encodeWithTag(writer, 3, value.navigation_button_text_color);
                    protoAdapter2.encodeWithTag(writer, 2, value.navigation_button_highlight_background_color);
                    protoAdapter2.encodeWithTag(writer, 1, value.navigation_button_background_color);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ActionThemeColors(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ActionThemeColors copy$default(ActionThemeColors actionThemeColors, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionThemeColors.navigation_button_background_color;
            }
            if ((i & 2) != 0) {
                str2 = actionThemeColors.navigation_button_highlight_background_color;
            }
            if ((i & 4) != 0) {
                str3 = actionThemeColors.navigation_button_text_color;
            }
            if ((i & 8) != 0) {
                str4 = actionThemeColors.navigation_button_highlight_text_color;
            }
            if ((i & 16) != 0) {
                byteString = actionThemeColors.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return actionThemeColors.copy(str, str2, str5, str4, byteString2);
        }

        public final ActionThemeColors copy(String navigation_button_background_color, String navigation_button_highlight_background_color, String navigation_button_text_color, String navigation_button_highlight_text_color, ByteString unknownFields) {
            unknownFields.getClass();
            return new ActionThemeColors(navigation_button_background_color, navigation_button_highlight_background_color, navigation_button_text_color, navigation_button_highlight_text_color, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ActionThemeColors)) {
                return false;
            }
            ActionThemeColors actionThemeColors = (ActionThemeColors) other;
            return Intrinsics.areEqual(unknownFields(), actionThemeColors.unknownFields()) && Intrinsics.areEqual(this.navigation_button_background_color, actionThemeColors.navigation_button_background_color) && Intrinsics.areEqual(this.navigation_button_highlight_background_color, actionThemeColors.navigation_button_highlight_background_color) && Intrinsics.areEqual(this.navigation_button_text_color, actionThemeColors.navigation_button_text_color) && Intrinsics.areEqual(this.navigation_button_highlight_text_color, actionThemeColors.navigation_button_highlight_text_color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.navigation_button_background_color;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.navigation_button_highlight_background_color;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.navigation_button_text_color;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.navigation_button_highlight_text_color;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.navigation_button_background_color = this.navigation_button_background_color;
            builder.navigation_button_highlight_background_color = this.navigation_button_highlight_background_color;
            builder.navigation_button_text_color = this.navigation_button_text_color;
            builder.navigation_button_highlight_text_color = this.navigation_button_highlight_text_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.navigation_button_background_color;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "navigation_button_background_color=", arrayList);
            }
            String str2 = this.navigation_button_highlight_background_color;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "navigation_button_highlight_background_color=", arrayList);
            }
            String str3 = this.navigation_button_text_color;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "navigation_button_text_color=", arrayList);
            }
            String str4 = this.navigation_button_highlight_text_color;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "navigation_button_highlight_text_color=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionThemeColors{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$ActionThemeColors;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ActionThemeColors build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ActionThemeColors() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionThemeColors(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.navigation_button_background_color = str;
            this.navigation_button_highlight_background_color = str2;
            this.navigation_button_text_color = str3;
            this.navigation_button_highlight_text_color = str4;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent$Builder;", "text", "", "primary_navigation_action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "secondary_navigation_action", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DialogContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DialogContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction#ADAPTER", schemaIndex = 1, tag = 2)
        public final AppMessageAction primary_navigation_action;

        @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction#ADAPTER", schemaIndex = 2, tag = 3)
        public final AppMessageAction secondary_navigation_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "<init>", "()V", "text", "", "primary_navigation_action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "secondary_navigation_action", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AppMessageAction primary_navigation_action;
            public AppMessageAction secondary_navigation_action;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public DialogContent build() {
                return new DialogContent(this.text, this.primary_navigation_action, this.secondary_navigation_action, buildUnknownFields());
            }

            public final Builder primary_navigation_action(AppMessageAction primary_navigation_action) {
                this.primary_navigation_action = primary_navigation_action;
                return this;
            }

            public final Builder secondary_navigation_action(AppMessageAction secondary_navigation_action) {
                this.secondary_navigation_action = secondary_navigation_action;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DialogContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageAction$DialogContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AppMessageAction.DialogContent decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AppMessageAction.DialogContent((String) obj, (AppMessageAction) obj2, (AppMessageAction) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AppMessageAction.DialogContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.primary_navigation_action);
                    protoAdapter2.encodeWithTag(writer, 3, value.secondary_navigation_action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AppMessageAction.DialogContent value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(3, value.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(2, value.primary_navigation_action) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AppMessageAction.DialogContent redact(AppMessageAction.DialogContent value) {
                    value.getClass();
                    AppMessageAction appMessageAction = value.primary_navigation_action;
                    AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
                    AppMessageAction appMessageAction3 = value.secondary_navigation_action;
                    return AppMessageAction.DialogContent.copy$default(value, null, appMessageAction2, appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AppMessageAction.DialogContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.secondary_navigation_action);
                    protoAdapter2.encodeWithTag(writer, 2, value.primary_navigation_action);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DialogContent(String str, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : appMessageAction, (i & 4) != 0 ? null : appMessageAction2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, String str, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialogContent.text;
            }
            if ((i & 2) != 0) {
                appMessageAction = dialogContent.primary_navigation_action;
            }
            if ((i & 4) != 0) {
                appMessageAction2 = dialogContent.secondary_navigation_action;
            }
            if ((i & 8) != 0) {
                byteString = dialogContent.unknownFields();
            }
            return dialogContent.copy(str, appMessageAction, appMessageAction2, byteString);
        }

        public final DialogContent copy(String text, AppMessageAction primary_navigation_action, AppMessageAction secondary_navigation_action, ByteString unknownFields) {
            unknownFields.getClass();
            return new DialogContent(text, primary_navigation_action, secondary_navigation_action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DialogContent)) {
                return false;
            }
            DialogContent dialogContent = (DialogContent) other;
            return Intrinsics.areEqual(unknownFields(), dialogContent.unknownFields()) && Intrinsics.areEqual(this.text, dialogContent.text) && Intrinsics.areEqual(this.primary_navigation_action, dialogContent.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, dialogContent.secondary_navigation_action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            AppMessageAction appMessageAction = this.primary_navigation_action;
            int hashCode3 = (hashCode2 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
            AppMessageAction appMessageAction2 = this.secondary_navigation_action;
            int hashCode4 = hashCode3 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.primary_navigation_action = this.primary_navigation_action;
            builder.secondary_navigation_action = this.secondary_navigation_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            AppMessageAction appMessageAction = this.primary_navigation_action;
            if (appMessageAction != null) {
                arrayList.add("primary_navigation_action=" + appMessageAction);
            }
            AppMessageAction appMessageAction2 = this.secondary_navigation_action;
            if (appMessageAction2 != null) {
                arrayList.add("secondary_navigation_action=" + appMessageAction2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DialogContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$DialogContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DialogContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DialogContent() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogContent(String str, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.primary_navigation_action = appMessageAction;
            this.secondary_navigation_action = appMessageAction2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AppMessageAction build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppMessageAction(Action action) {
        this(null, null, action, null, null, null, null, null, ByteString.EMPTY);
    }
}
