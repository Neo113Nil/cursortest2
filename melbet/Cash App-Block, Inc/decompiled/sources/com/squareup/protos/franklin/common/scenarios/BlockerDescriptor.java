package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b.-/01234R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Builder;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/Blockers;", "blocker", "Lcom/squareup/protos/franklin/api/Blockers;", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "supplement", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "", "skippable", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "theme", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "dismiss_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior;", "dismiss_action_display_behavior", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior;", "remote_skip", "group_id", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "retreat_action", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "Lcom/squareup/protos/cash/ui/Color;", "full_bleed_background_color", "Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode;", "presentation_mode", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode;", "agent_friendly", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "title_bar_accessory_text", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "polling", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "", "on_appear_actions", "Ljava/util/List;", "Companion", "Builder", "Theme", "DismissActionDisplayBehavior", "HideableBlockerAction", "PresentationMode", "TitleBarAccessoryText", "PollingConfig", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockerDescriptor extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockerDescriptor> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 15)
    public final Boolean agent_friendly;

    @WireField(adapter = "com.squareup.protos.franklin.api.Blockers#ADAPTER", schemaIndex = 1, tag = 2)
    public final Blockers blocker;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 5, tag = 7)
    public final BlockerAction dismiss_action;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$DismissActionDisplayBehavior#ADAPTER", schemaIndex = 6, tag = 10)
    public final DismissActionDisplayBehavior dismiss_action_display_behavior;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 10, tag = 12)
    public final Color full_bleed_background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 13)
    public final List<BlockerAction> on_appear_actions;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$PollingConfig#ADAPTER", schemaIndex = 15, tag = 17)
    public final PollingConfig polling;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$PresentationMode#ADAPTER", schemaIndex = 12, tag = 14)
    public final PresentationMode presentation_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean remote_skip;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$HideableBlockerAction#ADAPTER", schemaIndex = 9, tag = 11)
    public final HideableBlockerAction retreat_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean skippable;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockersSupplement#ADAPTER", schemaIndex = 2, tag = 3)
    public final BlockersSupplement supplement;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$Theme#ADAPTER", schemaIndex = 4, tag = 6)
    public final Theme theme;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$TitleBarAccessoryText#ADAPTER", schemaIndex = 14, tag = 16)
    public final TitleBarAccessoryText title_bar_accessory_text;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010#J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010#J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010#J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010$\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "<init>", "()V", "id", "", "blocker", "Lcom/squareup/protos/franklin/api/Blockers;", "supplement", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "skippable", "", "Ljava/lang/Boolean;", "theme", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "dismiss_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "dismiss_action_display_behavior", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior;", "remote_skip", "group_id", "retreat_action", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "full_bleed_background_color", "Lcom/squareup/protos/cash/ui/Color;", "on_appear_actions", "", "presentation_mode", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode;", "agent_friendly", "title_bar_accessory_text", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "polling", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean agent_friendly;
        public Blockers blocker;
        public BlockerAction dismiss_action;
        public DismissActionDisplayBehavior dismiss_action_display_behavior;
        public Color full_bleed_background_color;
        public String group_id;
        public String id;
        public List<BlockerAction> on_appear_actions = EmptyList.INSTANCE;
        public PollingConfig polling;
        public PresentationMode presentation_mode;
        public Boolean remote_skip;
        public HideableBlockerAction retreat_action;
        public Boolean skippable;
        public BlockersSupplement supplement;
        public Theme theme;
        public TitleBarAccessoryText title_bar_accessory_text;

        public final Builder agent_friendly(Boolean agent_friendly) {
            this.agent_friendly = agent_friendly;
            return this;
        }

        public final Builder blocker(Blockers blocker) {
            this.blocker = blocker;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BlockerDescriptor build() {
            return new BlockerDescriptor(this.id, this.blocker, this.supplement, this.skippable, this.theme, this.dismiss_action, this.dismiss_action_display_behavior, this.remote_skip, this.group_id, this.retreat_action, this.full_bleed_background_color, this.on_appear_actions, this.presentation_mode, this.agent_friendly, this.title_bar_accessory_text, this.polling, buildUnknownFields());
        }

        public final Builder dismiss_action(BlockerAction dismiss_action) {
            this.dismiss_action = dismiss_action;
            return this;
        }

        public final Builder dismiss_action_display_behavior(DismissActionDisplayBehavior dismiss_action_display_behavior) {
            this.dismiss_action_display_behavior = dismiss_action_display_behavior;
            return this;
        }

        public final Builder full_bleed_background_color(Color full_bleed_background_color) {
            this.full_bleed_background_color = full_bleed_background_color;
            return this;
        }

        public final Builder group_id(String group_id) {
            this.group_id = group_id;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder on_appear_actions(List<BlockerAction> on_appear_actions) {
            on_appear_actions.getClass();
            TransactorKt.checkElementsNotNull(on_appear_actions);
            this.on_appear_actions = on_appear_actions;
            return this;
        }

        public final Builder polling(PollingConfig polling) {
            this.polling = polling;
            return this;
        }

        public final Builder presentation_mode(PresentationMode presentation_mode) {
            this.presentation_mode = presentation_mode;
            return this;
        }

        public final Builder remote_skip(Boolean remote_skip) {
            this.remote_skip = remote_skip;
            return this;
        }

        public final Builder retreat_action(HideableBlockerAction retreat_action) {
            this.retreat_action = retreat_action;
            return this;
        }

        public final Builder skippable(Boolean skippable) {
            this.skippable = skippable;
            return this;
        }

        public final Builder supplement(BlockersSupplement supplement) {
            this.supplement = supplement;
            return this;
        }

        public final Builder theme(Theme theme) {
            this.theme = theme;
            return this;
        }

        public final Builder title_bar_accessory_text(TitleBarAccessoryText title_bar_accessory_text) {
            this.title_bar_accessory_text = title_bar_accessory_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BlockerDescriptor.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v43 */
            /* JADX WARN: Type inference failed for: r0v44 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public BlockerDescriptor decode(ProtoReader reader) {
                Object obj;
                long j;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Boolean bool = null;
                String str2 = null;
                Object obj8 = null;
                Object obj9 = null;
                BlockerDescriptor.PresentationMode presentationMode = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                BlockerDescriptor.DismissActionDisplayBehavior dismissActionDisplayBehavior = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BlockerDescriptor(str, (Blockers) obj3, (BlockersSupplement) obj4, bool3, (BlockerDescriptor.Theme) obj6, (BlockerAction) obj7, dismissActionDisplayBehavior, bool, str2, (BlockerDescriptor.HideableBlockerAction) obj8, (Color) obj9, m, presentationMode, bool2, (BlockerDescriptor.TitleBarAccessoryText) obj2, (BlockerDescriptor.PollingConfig) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            j = beginMessage;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            j = beginMessage;
                            obj3 = TransactorKt.decodeMessageOrMerge(Blockers.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                        case 3:
                            j = beginMessage;
                            obj4 = TransactorKt.decodeMessageOrMerge(BlockersSupplement.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        case 4:
                            j = beginMessage;
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 5:
                        default:
                            reader.readUnknownField(nextTag);
                            j = beginMessage;
                            obj = obj2;
                            decode = str;
                            obj2 = obj;
                            break;
                        case 6:
                            j = beginMessage;
                            obj6 = TransactorKt.decodeMessageOrMerge(BlockerDescriptor.Theme.ADAPTER, reader, obj6);
                            decode = str;
                            break;
                        case 7:
                            j = beginMessage;
                            obj7 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj7);
                            decode = str;
                            break;
                        case 8:
                            j = beginMessage;
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            j = beginMessage;
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 10:
                            j = beginMessage;
                            obj = obj2;
                            try {
                                dismissActionDisplayBehavior = BlockerDescriptor.DismissActionDisplayBehavior.ADAPTER.decode(reader);
                                obj2 = obj;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            j = beginMessage;
                            obj8 = TransactorKt.decodeMessageOrMerge(BlockerDescriptor.HideableBlockerAction.ADAPTER, reader, obj8);
                            decode = str;
                            break;
                        case 12:
                            j = beginMessage;
                            obj9 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj9);
                            decode = str;
                            break;
                        case 13:
                            j = beginMessage;
                            obj = obj2;
                            m.add(BlockerAction.ADAPTER.decode(reader));
                            decode = str;
                            obj2 = obj;
                            break;
                        case 14:
                            try {
                                presentationMode = BlockerDescriptor.PresentationMode.ADAPTER.decode(reader);
                                j = beginMessage;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj2;
                                j = beginMessage;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 15:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 16:
                            obj2 = TransactorKt.decodeMessageOrMerge(BlockerDescriptor.TitleBarAccessoryText.ADAPTER, reader, obj2);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 17:
                            obj5 = TransactorKt.decodeMessageOrMerge(BlockerDescriptor.PollingConfig.ADAPTER, reader, obj5);
                            j = beginMessage;
                            decode = str;
                            break;
                    }
                    str = decode;
                    beginMessage = j;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BlockerDescriptor value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.id);
                Blockers.ADAPTER.encodeWithTag(writer, 2, value.blocker);
                BlockersSupplement.ADAPTER.encodeWithTag(writer, 3, value.supplement);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 4, value.skippable);
                BlockerDescriptor.Theme.ADAPTER.encodeWithTag(writer, 6, value.theme);
                ProtoAdapter protoAdapter4 = BlockerAction.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 7, value.dismiss_action);
                BlockerDescriptor.DismissActionDisplayBehavior.ADAPTER.encodeWithTag(writer, 10, value.dismiss_action_display_behavior);
                protoAdapter3.encodeWithTag(writer, 8, value.remote_skip);
                protoAdapter2.encodeWithTag(writer, 9, value.group_id);
                BlockerDescriptor.HideableBlockerAction.ADAPTER.encodeWithTag(writer, 11, value.retreat_action);
                Color.ADAPTER.encodeWithTag(writer, 12, value.full_bleed_background_color);
                protoAdapter4.asRepeated().encodeWithTag(writer, 13, value.on_appear_actions);
                BlockerDescriptor.PresentationMode.ADAPTER.encodeWithTag(writer, 14, value.presentation_mode);
                protoAdapter3.encodeWithTag(writer, 15, value.agent_friendly);
                BlockerDescriptor.TitleBarAccessoryText.ADAPTER.encodeWithTag(writer, 16, value.title_bar_accessory_text);
                BlockerDescriptor.PollingConfig.ADAPTER.encodeWithTag(writer, 17, value.polling);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BlockerDescriptor value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = BlockersSupplement.ADAPTER.encodedSizeWithTag(3, value.supplement) + Blockers.ADAPTER.encodedSizeWithTag(2, value.blocker) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                int encodedSizeWithTag2 = BlockerDescriptor.Theme.ADAPTER.encodedSizeWithTag(6, value.theme) + protoAdapter3.encodedSizeWithTag(4, value.skippable) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = BlockerAction.ADAPTER;
                return BlockerDescriptor.PollingConfig.ADAPTER.encodedSizeWithTag(17, value.polling) + BlockerDescriptor.TitleBarAccessoryText.ADAPTER.encodedSizeWithTag(16, value.title_bar_accessory_text) + protoAdapter3.encodedSizeWithTag(15, value.agent_friendly) + BlockerDescriptor.PresentationMode.ADAPTER.encodedSizeWithTag(14, value.presentation_mode) + protoAdapter4.asRepeated().encodedSizeWithTag(13, value.on_appear_actions) + Color.ADAPTER.encodedSizeWithTag(12, value.full_bleed_background_color) + BlockerDescriptor.HideableBlockerAction.ADAPTER.encodedSizeWithTag(11, value.retreat_action) + protoAdapter2.encodedSizeWithTag(9, value.group_id) + protoAdapter3.encodedSizeWithTag(8, value.remote_skip) + BlockerDescriptor.DismissActionDisplayBehavior.ADAPTER.encodedSizeWithTag(10, value.dismiss_action_display_behavior) + protoAdapter4.encodedSizeWithTag(7, value.dismiss_action) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BlockerDescriptor redact(BlockerDescriptor value) {
                value.getClass();
                Blockers blockers = value.blocker;
                Blockers blockers2 = blockers != null ? (Blockers) Blockers.ADAPTER.redact(blockers) : null;
                BlockersSupplement blockersSupplement = value.supplement;
                BlockersSupplement blockersSupplement2 = blockersSupplement != null ? (BlockersSupplement) BlockersSupplement.ADAPTER.redact(blockersSupplement) : null;
                BlockerDescriptor.Theme theme = value.theme;
                BlockerDescriptor.Theme theme2 = theme != null ? (BlockerDescriptor.Theme) BlockerDescriptor.Theme.ADAPTER.redact(theme) : null;
                BlockerAction blockerAction = value.dismiss_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                BlockerDescriptor.HideableBlockerAction hideableBlockerAction = value.retreat_action;
                BlockerDescriptor.HideableBlockerAction hideableBlockerAction2 = hideableBlockerAction != null ? (BlockerDescriptor.HideableBlockerAction) BlockerDescriptor.HideableBlockerAction.ADAPTER.redact(hideableBlockerAction) : null;
                Color color = value.full_bleed_background_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.on_appear_actions, BlockerAction.ADAPTER);
                BlockerDescriptor.TitleBarAccessoryText titleBarAccessoryText = value.title_bar_accessory_text;
                BlockerDescriptor.TitleBarAccessoryText titleBarAccessoryText2 = titleBarAccessoryText != null ? (BlockerDescriptor.TitleBarAccessoryText) BlockerDescriptor.TitleBarAccessoryText.ADAPTER.redact(titleBarAccessoryText) : null;
                BlockerDescriptor.PollingConfig pollingConfig = value.polling;
                BlockerDescriptor.PollingConfig pollingConfig2 = pollingConfig != null ? (BlockerDescriptor.PollingConfig) BlockerDescriptor.PollingConfig.ADAPTER.redact(pollingConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.id;
                Boolean bool = value.skippable;
                BlockerDescriptor.DismissActionDisplayBehavior dismissActionDisplayBehavior = value.dismiss_action_display_behavior;
                Boolean bool2 = value.remote_skip;
                String str2 = value.group_id;
                BlockerDescriptor.PresentationMode presentationMode = value.presentation_mode;
                Boolean bool3 = value.agent_friendly;
                byteString.getClass();
                return new BlockerDescriptor(str, blockers2, blockersSupplement2, bool, theme2, blockerAction2, dismissActionDisplayBehavior, bool2, str2, hideableBlockerAction2, color2, m1169redactElements, presentationMode, bool3, titleBarAccessoryText2, pollingConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BlockerDescriptor value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerDescriptor.PollingConfig.ADAPTER.encodeWithTag(writer, 17, value.polling);
                BlockerDescriptor.TitleBarAccessoryText.ADAPTER.encodeWithTag(writer, 16, value.title_bar_accessory_text);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 15, value.agent_friendly);
                BlockerDescriptor.PresentationMode.ADAPTER.encodeWithTag(writer, 14, value.presentation_mode);
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 13, value.on_appear_actions);
                Color.ADAPTER.encodeWithTag(writer, 12, value.full_bleed_background_color);
                BlockerDescriptor.HideableBlockerAction.ADAPTER.encodeWithTag(writer, 11, value.retreat_action);
                ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                protoAdapter4.encodeWithTag(writer, 9, value.group_id);
                protoAdapter2.encodeWithTag(writer, 8, value.remote_skip);
                BlockerDescriptor.DismissActionDisplayBehavior.ADAPTER.encodeWithTag(writer, 10, value.dismiss_action_display_behavior);
                protoAdapter3.encodeWithTag(writer, 7, value.dismiss_action);
                BlockerDescriptor.Theme.ADAPTER.encodeWithTag(writer, 6, value.theme);
                protoAdapter2.encodeWithTag(writer, 4, value.skippable);
                BlockersSupplement.ADAPTER.encodeWithTag(writer, 3, value.supplement);
                Blockers.ADAPTER.encodeWithTag(writer, 2, value.blocker);
                protoAdapter4.encodeWithTag(writer, 1, value.id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerDescriptor(String str, Blockers blockers, BlockersSupplement blockersSupplement, Boolean bool, Theme theme, BlockerAction blockerAction, DismissActionDisplayBehavior dismissActionDisplayBehavior, Boolean bool2, String str2, HideableBlockerAction hideableBlockerAction, Color color, List list, PresentationMode presentationMode, Boolean bool3, TitleBarAccessoryText titleBarAccessoryText, PollingConfig pollingConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.blocker = blockers;
        this.supplement = blockersSupplement;
        this.skippable = bool;
        this.theme = theme;
        this.dismiss_action = blockerAction;
        this.dismiss_action_display_behavior = dismissActionDisplayBehavior;
        this.remote_skip = bool2;
        this.group_id = str2;
        this.retreat_action = hideableBlockerAction;
        this.full_bleed_background_color = color;
        this.presentation_mode = presentationMode;
        this.agent_friendly = bool3;
        this.title_bar_accessory_text = titleBarAccessoryText;
        this.polling = pollingConfig;
        this.on_appear_actions = TransactorKt.immutableCopyOf("on_appear_actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockerDescriptor)) {
            return false;
        }
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) obj;
        return Intrinsics.areEqual(unknownFields(), blockerDescriptor.unknownFields()) && Intrinsics.areEqual(this.id, blockerDescriptor.id) && Intrinsics.areEqual(this.blocker, blockerDescriptor.blocker) && Intrinsics.areEqual(this.supplement, blockerDescriptor.supplement) && Intrinsics.areEqual(this.skippable, blockerDescriptor.skippable) && Intrinsics.areEqual(this.theme, blockerDescriptor.theme) && Intrinsics.areEqual(this.dismiss_action, blockerDescriptor.dismiss_action) && this.dismiss_action_display_behavior == blockerDescriptor.dismiss_action_display_behavior && Intrinsics.areEqual(this.remote_skip, blockerDescriptor.remote_skip) && Intrinsics.areEqual(this.group_id, blockerDescriptor.group_id) && Intrinsics.areEqual(this.retreat_action, blockerDescriptor.retreat_action) && Intrinsics.areEqual(this.full_bleed_background_color, blockerDescriptor.full_bleed_background_color) && Intrinsics.areEqual(this.on_appear_actions, blockerDescriptor.on_appear_actions) && this.presentation_mode == blockerDescriptor.presentation_mode && Intrinsics.areEqual(this.agent_friendly, blockerDescriptor.agent_friendly) && Intrinsics.areEqual(this.title_bar_accessory_text, blockerDescriptor.title_bar_accessory_text) && Intrinsics.areEqual(this.polling, blockerDescriptor.polling);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Blockers blockers = this.blocker;
        int hashCode3 = (hashCode2 + (blockers != null ? blockers.hashCode() : 0)) * 37;
        BlockersSupplement blockersSupplement = this.supplement;
        int hashCode4 = (hashCode3 + (blockersSupplement != null ? blockersSupplement.hashCode() : 0)) * 37;
        Boolean bool = this.skippable;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Theme theme = this.theme;
        int hashCode6 = (hashCode5 + (theme != null ? theme.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.dismiss_action;
        int hashCode7 = (hashCode6 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        DismissActionDisplayBehavior dismissActionDisplayBehavior = this.dismiss_action_display_behavior;
        int hashCode8 = (hashCode7 + (dismissActionDisplayBehavior != null ? dismissActionDisplayBehavior.hashCode() : 0)) * 37;
        Boolean bool2 = this.remote_skip;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str2 = this.group_id;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        HideableBlockerAction hideableBlockerAction = this.retreat_action;
        int hashCode11 = (hashCode10 + (hideableBlockerAction != null ? hideableBlockerAction.hashCode() : 0)) * 37;
        Color color = this.full_bleed_background_color;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode11 + (color != null ? color.hashCode() : 0)) * 37, 37, this.on_appear_actions);
        PresentationMode presentationMode = this.presentation_mode;
        int hashCode12 = (m + (presentationMode != null ? presentationMode.hashCode() : 0)) * 37;
        Boolean bool3 = this.agent_friendly;
        int hashCode13 = (hashCode12 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        TitleBarAccessoryText titleBarAccessoryText = this.title_bar_accessory_text;
        int hashCode14 = (hashCode13 + (titleBarAccessoryText != null ? titleBarAccessoryText.hashCode() : 0)) * 37;
        PollingConfig pollingConfig = this.polling;
        int hashCode15 = hashCode14 + (pollingConfig != null ? pollingConfig.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.blocker = this.blocker;
        builder.supplement = this.supplement;
        builder.skippable = this.skippable;
        builder.theme = this.theme;
        builder.dismiss_action = this.dismiss_action;
        builder.dismiss_action_display_behavior = this.dismiss_action_display_behavior;
        builder.remote_skip = this.remote_skip;
        builder.group_id = this.group_id;
        builder.retreat_action = this.retreat_action;
        builder.full_bleed_background_color = this.full_bleed_background_color;
        builder.on_appear_actions = this.on_appear_actions;
        builder.presentation_mode = this.presentation_mode;
        builder.agent_friendly = this.agent_friendly;
        builder.title_bar_accessory_text = this.title_bar_accessory_text;
        builder.polling = this.polling;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Blockers blockers = this.blocker;
        if (blockers != null) {
            arrayList.add("blocker=" + blockers);
        }
        BlockersSupplement blockersSupplement = this.supplement;
        if (blockersSupplement != null) {
            arrayList.add("supplement=" + blockersSupplement);
        }
        Boolean bool = this.skippable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skippable=", bool, arrayList);
        }
        Theme theme = this.theme;
        if (theme != null) {
            arrayList.add("theme=" + theme);
        }
        BlockerAction blockerAction = this.dismiss_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dismiss_action=", blockerAction, arrayList);
        }
        DismissActionDisplayBehavior dismissActionDisplayBehavior = this.dismiss_action_display_behavior;
        if (dismissActionDisplayBehavior != null) {
            arrayList.add("dismiss_action_display_behavior=" + dismissActionDisplayBehavior);
        }
        Boolean bool2 = this.remote_skip;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("remote_skip=", bool2, arrayList);
        }
        String str2 = this.group_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "group_id=", arrayList);
        }
        HideableBlockerAction hideableBlockerAction = this.retreat_action;
        if (hideableBlockerAction != null) {
            arrayList.add("retreat_action=" + hideableBlockerAction);
        }
        Color color = this.full_bleed_background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("full_bleed_background_color=", color, arrayList);
        }
        if (!this.on_appear_actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("on_appear_actions=", arrayList, this.on_appear_actions);
        }
        PresentationMode presentationMode = this.presentation_mode;
        if (presentationMode != null) {
            arrayList.add("presentation_mode=" + presentationMode);
        }
        Boolean bool3 = this.agent_friendly;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("agent_friendly=", bool3, arrayList);
        }
        TitleBarAccessoryText titleBarAccessoryText = this.title_bar_accessory_text;
        if (titleBarAccessoryText != null) {
            arrayList.add("title_bar_accessory_text=" + titleBarAccessoryText);
        }
        PollingConfig pollingConfig = this.polling;
        if (pollingConfig != null) {
            arrayList.add("polling=" + pollingConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockerDescriptor{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_CONTROLLED", "SERVER_CONTROLLED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DismissActionDisplayBehavior implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissActionDisplayBehavior[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final DismissActionDisplayBehavior CLIENT_CONTROLLED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DismissActionDisplayBehavior SERVER_CONTROLLED;
        private final int value;

        private static final /* synthetic */ DismissActionDisplayBehavior[] $values() {
            return new DismissActionDisplayBehavior[]{CLIENT_CONTROLLED, SERVER_CONTROLLED};
        }

        static {
            final DismissActionDisplayBehavior dismissActionDisplayBehavior = new DismissActionDisplayBehavior("CLIENT_CONTROLLED", 0, 0);
            CLIENT_CONTROLLED = dismissActionDisplayBehavior;
            SERVER_CONTROLLED = new DismissActionDisplayBehavior("SERVER_CONTROLLED", 1, 1);
            DismissActionDisplayBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissActionDisplayBehavior.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, dismissActionDisplayBehavior) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$DismissActionDisplayBehavior$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public BlockerDescriptor.DismissActionDisplayBehavior fromValue(int value) {
                    return BlockerDescriptor.DismissActionDisplayBehavior.INSTANCE.fromValue(value);
                }
            };
        }

        private DismissActionDisplayBehavior(String str, int i, int i2) {
            this.value = i2;
        }

        public static final DismissActionDisplayBehavior fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static DismissActionDisplayBehavior valueOf(String str) {
            return (DismissActionDisplayBehavior) Enum.valueOf(DismissActionDisplayBehavior.class, str);
        }

        public static DismissActionDisplayBehavior[] values() {
            return (DismissActionDisplayBehavior[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$DismissActionDisplayBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DismissActionDisplayBehavior fromValue(int value) {
                if (value == 0) {
                    return DismissActionDisplayBehavior.CLIENT_CONTROLLED;
                }
                if (value != 1) {
                    return null;
                }
                return DismissActionDisplayBehavior.SERVER_CONTROLLED;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction$Builder;", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HideableBlockerAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HideableBlockerAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 0, tag = 1)
        public final BlockerAction action;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "<init>", "()V", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public BlockerAction action;

            public final Builder action(BlockerAction action) {
                this.action = action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public HideableBlockerAction build() {
                return new HideableBlockerAction(this.action, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HideableBlockerAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$HideableBlockerAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.HideableBlockerAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerDescriptor.HideableBlockerAction((BlockerAction) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerDescriptor.HideableBlockerAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerDescriptor.HideableBlockerAction value) {
                    value.getClass();
                    return BlockerAction.ADAPTER.encodedSizeWithTag(1, value.action) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.HideableBlockerAction redact(BlockerDescriptor.HideableBlockerAction value) {
                    value.getClass();
                    BlockerAction blockerAction = value.action;
                    return value.copy(blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerDescriptor.HideableBlockerAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HideableBlockerAction(BlockerAction blockerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : blockerAction, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HideableBlockerAction copy$default(HideableBlockerAction hideableBlockerAction, BlockerAction blockerAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                blockerAction = hideableBlockerAction.action;
            }
            if ((i & 2) != 0) {
                byteString = hideableBlockerAction.unknownFields();
            }
            return hideableBlockerAction.copy(blockerAction, byteString);
        }

        public final HideableBlockerAction copy(BlockerAction action, ByteString unknownFields) {
            unknownFields.getClass();
            return new HideableBlockerAction(action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HideableBlockerAction)) {
                return false;
            }
            HideableBlockerAction hideableBlockerAction = (HideableBlockerAction) other;
            return Intrinsics.areEqual(unknownFields(), hideableBlockerAction.unknownFields()) && Intrinsics.areEqual(this.action, hideableBlockerAction.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BlockerAction blockerAction = this.action;
            int hashCode2 = hashCode + (blockerAction != null ? blockerAction.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.action = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BlockerAction blockerAction = this.action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("action=", blockerAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HideableBlockerAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$HideableBlockerAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HideableBlockerAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HideableBlockerAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HideableBlockerAction(BlockerAction blockerAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = blockerAction;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig$Builder;", "initial_poll_interval_seconds", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Lokio/ByteString;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PollingConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PollingConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
        public final Integer initial_poll_interval_seconds;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "<init>", "()V", "initial_poll_interval_seconds", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public Integer initial_poll_interval_seconds;

            @Override // com.squareup.wire.Message.Builder
            public PollingConfig build() {
                return new PollingConfig(this.initial_poll_interval_seconds, buildUnknownFields());
            }

            public final Builder initial_poll_interval_seconds(Integer initial_poll_interval_seconds) {
                this.initial_poll_interval_seconds = initial_poll_interval_seconds;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PollingConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$PollingConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.PollingConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerDescriptor.PollingConfig((Integer) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerDescriptor.PollingConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.initial_poll_interval_seconds);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerDescriptor.PollingConfig value) {
                    value.getClass();
                    return ProtoAdapter.INT32.encodedSizeWithTag(1, value.initial_poll_interval_seconds) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.PollingConfig redact(BlockerDescriptor.PollingConfig value) {
                    value.getClass();
                    return BlockerDescriptor.PollingConfig.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerDescriptor.PollingConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.initial_poll_interval_seconds);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PollingConfig(Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PollingConfig copy$default(PollingConfig pollingConfig, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = pollingConfig.initial_poll_interval_seconds;
            }
            if ((i & 2) != 0) {
                byteString = pollingConfig.unknownFields();
            }
            return pollingConfig.copy(num, byteString);
        }

        public final PollingConfig copy(Integer initial_poll_interval_seconds, ByteString unknownFields) {
            unknownFields.getClass();
            return new PollingConfig(initial_poll_interval_seconds, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PollingConfig)) {
                return false;
            }
            PollingConfig pollingConfig = (PollingConfig) other;
            return Intrinsics.areEqual(unknownFields(), pollingConfig.unknownFields()) && Intrinsics.areEqual(this.initial_poll_interval_seconds, pollingConfig.initial_poll_interval_seconds);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.initial_poll_interval_seconds;
            int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.initial_poll_interval_seconds = this.initial_poll_interval_seconds;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.initial_poll_interval_seconds;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("initial_poll_interval_seconds=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PollingConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PollingConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PollingConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PollingConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollingConfig(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.initial_poll_interval_seconds = num;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNRECOGNIZED_DO_NOT_USE", "REQUIRES_FULLSCREEN", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentationMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PresentationMode[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PresentationMode REQUIRES_FULLSCREEN;
        public static final PresentationMode UNRECOGNIZED_DO_NOT_USE;
        private final int value;

        private static final /* synthetic */ PresentationMode[] $values() {
            return new PresentationMode[]{UNRECOGNIZED_DO_NOT_USE, REQUIRES_FULLSCREEN};
        }

        static {
            final PresentationMode presentationMode = new PresentationMode("UNRECOGNIZED_DO_NOT_USE", 0, 0);
            UNRECOGNIZED_DO_NOT_USE = presentationMode;
            REQUIRES_FULLSCREEN = new PresentationMode("REQUIRES_FULLSCREEN", 1, 1);
            PresentationMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PresentationMode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, presentationMode) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$PresentationMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public BlockerDescriptor.PresentationMode fromValue(int value) {
                    return BlockerDescriptor.PresentationMode.INSTANCE.fromValue(value);
                }
            };
        }

        private PresentationMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PresentationMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PresentationMode valueOf(String str) {
            return (PresentationMode) Enum.valueOf(PresentationMode.class, str);
        }

        public static PresentationMode[] values() {
            return (PresentationMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$PresentationMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PresentationMode fromValue(int value) {
                if (value == 0) {
                    return PresentationMode.UNRECOGNIZED_DO_NOT_USE;
                }
                if (value != 1) {
                    return null;
                }
                return PresentationMode.REQUIRES_FULLSCREEN;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme$Builder;", "accent_color", "Lcom/squareup/protos/cash/ui/Color;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Theme extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Theme> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
        public final Color accent_color;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "<init>", "()V", "accent_color", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public Color accent_color;

            public final Builder accent_color(Color accent_color) {
                this.accent_color = accent_color;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Theme build() {
                return new Theme(this.accent_color, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Theme.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$Theme$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.Theme decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerDescriptor.Theme((Color) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerDescriptor.Theme value) {
                    writer.getClass();
                    value.getClass();
                    Color.ADAPTER.encodeWithTag(writer, 1, value.accent_color);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerDescriptor.Theme value) {
                    value.getClass();
                    return Color.ADAPTER.encodedSizeWithTag(1, value.accent_color) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.Theme redact(BlockerDescriptor.Theme value) {
                    value.getClass();
                    Color color = value.accent_color;
                    return value.copy(color != null ? (Color) Color.ADAPTER.redact(color) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerDescriptor.Theme value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Color.ADAPTER.encodeWithTag(writer, 1, value.accent_color);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Theme(Color color, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : color, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Theme copy$default(Theme theme, Color color, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                color = theme.accent_color;
            }
            if ((i & 2) != 0) {
                byteString = theme.unknownFields();
            }
            return theme.copy(color, byteString);
        }

        public final Theme copy(Color accent_color, ByteString unknownFields) {
            unknownFields.getClass();
            return new Theme(accent_color, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) other;
            return Intrinsics.areEqual(unknownFields(), theme.unknownFields()) && Intrinsics.areEqual(this.accent_color, theme.accent_color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.accent_color;
            int hashCode2 = hashCode + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.accent_color = this.accent_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.accent_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("accent_color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Theme{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Theme;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Theme build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Theme() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Theme(Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.accent_color = color;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TitleBarAccessoryText extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TitleBarAccessoryText> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public TitleBarAccessoryText build() {
                return new TitleBarAccessoryText(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TitleBarAccessoryText.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockerDescriptor$TitleBarAccessoryText$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.TitleBarAccessoryText decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerDescriptor.TitleBarAccessoryText((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerDescriptor.TitleBarAccessoryText value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerDescriptor.TitleBarAccessoryText value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerDescriptor.TitleBarAccessoryText redact(BlockerDescriptor.TitleBarAccessoryText value) {
                    value.getClass();
                    return BlockerDescriptor.TitleBarAccessoryText.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerDescriptor.TitleBarAccessoryText value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TitleBarAccessoryText(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TitleBarAccessoryText copy$default(TitleBarAccessoryText titleBarAccessoryText, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleBarAccessoryText.text;
            }
            if ((i & 2) != 0) {
                byteString = titleBarAccessoryText.unknownFields();
            }
            return titleBarAccessoryText.copy(str, byteString);
        }

        public final TitleBarAccessoryText copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new TitleBarAccessoryText(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TitleBarAccessoryText)) {
                return false;
            }
            TitleBarAccessoryText titleBarAccessoryText = (TitleBarAccessoryText) other;
            return Intrinsics.areEqual(unknownFields(), titleBarAccessoryText.unknownFields()) && Intrinsics.areEqual(this.text, titleBarAccessoryText.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TitleBarAccessoryText{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$TitleBarAccessoryText;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TitleBarAccessoryText build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TitleBarAccessoryText() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleBarAccessoryText(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockerDescriptor;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BlockerDescriptor build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
