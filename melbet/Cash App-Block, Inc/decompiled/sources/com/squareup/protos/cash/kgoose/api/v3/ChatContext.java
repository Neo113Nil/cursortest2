package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002=<R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\f068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/FollowUpChatContext;", "follow_up_chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/FollowUpChatContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/SpaceContext;", "space", "Lcom/squareup/protos/cash/kgoose/api/v3/SpaceContext;", "", "time_zone", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/CreateTileFromTileContext;", "create_tile_from_tile_context", "Lcom/squareup/protos/cash/kgoose/api/v3/CreateTileFromTileContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditTileContext;", "edit_tile_context", "Lcom/squareup/protos/cash/kgoose/api/v3/EditTileContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "customer_context", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "", "bot_prompts_you", "Ljava/lang/Boolean;", "insight_id", "suggestions_id", "Lcom/squareup/protos/cash/kgoose/api/v3/ScriptConversionContext;", "script_conversion_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ScriptConversionContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "moneybot_context", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "managerbot_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderContext;", "render_context", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderContext;", "auto_terminate", "Lcom/squareup/protos/cash/kgoose/api/v3/SlackContext;", "slack_context", "Lcom/squareup/protos/cash/kgoose/api/v3/SlackContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditWidgetContext;", "edit_widget_context", "Lcom/squareup/protos/cash/kgoose/api/v3/EditWidgetContext;", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext;", "relay_context", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext;", "", "skip_permission_lease_tools", "Ljava/util/List;", "", "preamble_params", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChatContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ChatContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 15, tag = 16)
    public final Boolean auto_terminate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    public final Boolean bot_prompts_you;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CreateTileFromTileContext#ADAPTER", schemaIndex = 4, tag = 5)
    public final CreateTileFromTileContext create_tile_from_tile_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CustomerContext#ADAPTER", schemaIndex = 6, tag = 7)
    public final CustomerContext customer_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.EditTileContext#ADAPTER", schemaIndex = 5, tag = 6)
    public final EditTileContext edit_tile_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.EditWidgetContext#ADAPTER", schemaIndex = 17, tag = 18)
    public final EditWidgetContext edit_widget_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.FollowUpChatContext#ADAPTER", schemaIndex = 1, tag = 2)
    public final FollowUpChatContext follow_up_chat_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String insight_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotContext#ADAPTER", schemaIndex = 13, tag = 14)
    public final ManagerbotContext managerbot_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MoneybotContext#ADAPTER", schemaIndex = 12, tag = 13)
    public final MoneybotContext moneybot_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 21)
    public final Map<String, String> preamble_params;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RelayContext#ADAPTER", schemaIndex = 18, tag = 19)
    public final RelayContext relay_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RenderContext#ADAPTER", schemaIndex = 14, tag = 15)
    public final RenderContext render_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ScriptConversionContext#ADAPTER", schemaIndex = 11, tag = 12)
    public final ScriptConversionContext script_conversion_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 20)
    public final List<String> skip_permission_lease_tools;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SlackContext#ADAPTER", schemaIndex = 16, tag = 17)
    public final SlackContext slack_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Source#ADAPTER", schemaIndex = 0, tag = 1)
    public final Source source;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SpaceContext#ADAPTER", schemaIndex = 2, tag = 3)
    public final SpaceContext space;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String suggestions_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", schemaIndex = 7, tag = 8)
    public final Tenancy tenancy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String time_zone;

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010-J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0015\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010-J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\u0014\u0010)\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0*J\u001a\u0010+\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0,J\b\u0010.\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "<init>", "()V", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "follow_up_chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/FollowUpChatContext;", "space", "Lcom/squareup/protos/cash/kgoose/api/v3/SpaceContext;", "time_zone", "", "create_tile_from_tile_context", "Lcom/squareup/protos/cash/kgoose/api/v3/CreateTileFromTileContext;", "edit_tile_context", "Lcom/squareup/protos/cash/kgoose/api/v3/EditTileContext;", "customer_context", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "bot_prompts_you", "", "Ljava/lang/Boolean;", "insight_id", "suggestions_id", "script_conversion_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ScriptConversionContext;", "moneybot_context", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "managerbot_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "render_context", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderContext;", "auto_terminate", "slack_context", "Lcom/squareup/protos/cash/kgoose/api/v3/SlackContext;", "edit_widget_context", "Lcom/squareup/protos/cash/kgoose/api/v3/EditWidgetContext;", "relay_context", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext;", "skip_permission_lease_tools", "", "preamble_params", "", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean auto_terminate;
        public Boolean bot_prompts_you;
        public CreateTileFromTileContext create_tile_from_tile_context;
        public CustomerContext customer_context;
        public EditTileContext edit_tile_context;
        public EditWidgetContext edit_widget_context;
        public FollowUpChatContext follow_up_chat_context;
        public String insight_id;
        public ManagerbotContext managerbot_context;
        public MoneybotContext moneybot_context;
        public Map<String, String> preamble_params;
        public RelayContext relay_context;
        public RenderContext render_context;
        public ScriptConversionContext script_conversion_context;
        public List<String> skip_permission_lease_tools = EmptyList.INSTANCE;
        public SlackContext slack_context;
        public Source source;
        public SpaceContext space;
        public String suggestions_id;
        public Tenancy tenancy;
        public String time_zone;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.preamble_params = emptyMap;
        }

        public final Builder auto_terminate(Boolean auto_terminate) {
            this.auto_terminate = auto_terminate;
            return this;
        }

        public final Builder bot_prompts_you(Boolean bot_prompts_you) {
            this.bot_prompts_you = bot_prompts_you;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ChatContext build() {
            return new ChatContext(this.source, this.follow_up_chat_context, this.space, this.time_zone, this.create_tile_from_tile_context, this.edit_tile_context, this.customer_context, this.tenancy, this.bot_prompts_you, this.insight_id, this.suggestions_id, this.script_conversion_context, this.moneybot_context, this.managerbot_context, this.render_context, this.auto_terminate, this.slack_context, this.edit_widget_context, this.relay_context, this.skip_permission_lease_tools, this.preamble_params, buildUnknownFields());
        }

        public final Builder create_tile_from_tile_context(CreateTileFromTileContext create_tile_from_tile_context) {
            this.create_tile_from_tile_context = create_tile_from_tile_context;
            return this;
        }

        public final Builder customer_context(CustomerContext customer_context) {
            this.customer_context = customer_context;
            return this;
        }

        public final Builder edit_tile_context(EditTileContext edit_tile_context) {
            this.edit_tile_context = edit_tile_context;
            return this;
        }

        public final Builder edit_widget_context(EditWidgetContext edit_widget_context) {
            this.edit_widget_context = edit_widget_context;
            return this;
        }

        public final Builder follow_up_chat_context(FollowUpChatContext follow_up_chat_context) {
            this.follow_up_chat_context = follow_up_chat_context;
            return this;
        }

        public final Builder insight_id(String insight_id) {
            this.insight_id = insight_id;
            return this;
        }

        public final Builder managerbot_context(ManagerbotContext managerbot_context) {
            this.managerbot_context = managerbot_context;
            return this;
        }

        public final Builder moneybot_context(MoneybotContext moneybot_context) {
            this.moneybot_context = moneybot_context;
            return this;
        }

        public final Builder preamble_params(Map<String, String> preamble_params) {
            preamble_params.getClass();
            this.preamble_params = preamble_params;
            return this;
        }

        public final Builder relay_context(RelayContext relay_context) {
            this.relay_context = relay_context;
            return this;
        }

        public final Builder render_context(RenderContext render_context) {
            this.render_context = render_context;
            return this;
        }

        public final Builder script_conversion_context(ScriptConversionContext script_conversion_context) {
            this.script_conversion_context = script_conversion_context;
            return this;
        }

        public final Builder skip_permission_lease_tools(List<String> skip_permission_lease_tools) {
            skip_permission_lease_tools.getClass();
            TransactorKt.checkElementsNotNull(skip_permission_lease_tools);
            this.skip_permission_lease_tools = skip_permission_lease_tools;
            return this;
        }

        public final Builder slack_context(SlackContext slack_context) {
            this.slack_context = slack_context;
            return this;
        }

        public final Builder source(Source source) {
            this.source = source;
            return this;
        }

        public final Builder space(SpaceContext space) {
            this.space = space;
            return this;
        }

        public final Builder suggestions_id(String suggestions_id) {
            this.suggestions_id = suggestions_id;
            return this;
        }

        public final Builder tenancy(Tenancy tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        public final Builder time_zone(String time_zone) {
            this.time_zone = time_zone;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ChatContext.class);
        Syntax syntax = Syntax.PROTO_2;
        ChatContext$Companion$ADAPTER$1 chatContext$Companion$ADAPTER$1 = new ChatContext$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = chatContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(chatContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatContext(Source source, FollowUpChatContext followUpChatContext, SpaceContext spaceContext, String str, CreateTileFromTileContext createTileFromTileContext, EditTileContext editTileContext, CustomerContext customerContext, Tenancy tenancy, Boolean bool, String str2, String str3, ScriptConversionContext scriptConversionContext, MoneybotContext moneybotContext, ManagerbotContext managerbotContext, RenderContext renderContext, Boolean bool2, SlackContext slackContext, EditWidgetContext editWidgetContext, RelayContext relayContext, List list, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        byteString.getClass();
        this.source = source;
        this.follow_up_chat_context = followUpChatContext;
        this.space = spaceContext;
        this.time_zone = str;
        this.create_tile_from_tile_context = createTileFromTileContext;
        this.edit_tile_context = editTileContext;
        this.customer_context = customerContext;
        this.tenancy = tenancy;
        this.bot_prompts_you = bool;
        this.insight_id = str2;
        this.suggestions_id = str3;
        this.script_conversion_context = scriptConversionContext;
        this.moneybot_context = moneybotContext;
        this.managerbot_context = managerbotContext;
        this.render_context = renderContext;
        this.auto_terminate = bool2;
        this.slack_context = slackContext;
        this.edit_widget_context = editWidgetContext;
        this.relay_context = relayContext;
        this.skip_permission_lease_tools = TransactorKt.immutableCopyOf("skip_permission_lease_tools", list);
        this.preamble_params = TransactorKt.immutableCopyOf("preamble_params", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatContext)) {
            return false;
        }
        ChatContext chatContext = (ChatContext) obj;
        return Intrinsics.areEqual(unknownFields(), chatContext.unknownFields()) && this.source == chatContext.source && Intrinsics.areEqual(this.follow_up_chat_context, chatContext.follow_up_chat_context) && Intrinsics.areEqual(this.space, chatContext.space) && Intrinsics.areEqual(this.time_zone, chatContext.time_zone) && Intrinsics.areEqual(this.create_tile_from_tile_context, chatContext.create_tile_from_tile_context) && Intrinsics.areEqual(this.edit_tile_context, chatContext.edit_tile_context) && Intrinsics.areEqual(this.customer_context, chatContext.customer_context) && this.tenancy == chatContext.tenancy && Intrinsics.areEqual(this.bot_prompts_you, chatContext.bot_prompts_you) && Intrinsics.areEqual(this.insight_id, chatContext.insight_id) && Intrinsics.areEqual(this.suggestions_id, chatContext.suggestions_id) && Intrinsics.areEqual(this.script_conversion_context, chatContext.script_conversion_context) && Intrinsics.areEqual(this.moneybot_context, chatContext.moneybot_context) && Intrinsics.areEqual(this.managerbot_context, chatContext.managerbot_context) && Intrinsics.areEqual(this.render_context, chatContext.render_context) && Intrinsics.areEqual(this.auto_terminate, chatContext.auto_terminate) && Intrinsics.areEqual(this.slack_context, chatContext.slack_context) && Intrinsics.areEqual(this.edit_widget_context, chatContext.edit_widget_context) && Intrinsics.areEqual(this.relay_context, chatContext.relay_context) && Intrinsics.areEqual(this.skip_permission_lease_tools, chatContext.skip_permission_lease_tools) && Intrinsics.areEqual(this.preamble_params, chatContext.preamble_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Source source = this.source;
        int hashCode2 = (hashCode + (source != null ? source.hashCode() : 0)) * 37;
        FollowUpChatContext followUpChatContext = this.follow_up_chat_context;
        int hashCode3 = (hashCode2 + (followUpChatContext != null ? followUpChatContext.hashCode() : 0)) * 37;
        SpaceContext spaceContext = this.space;
        int hashCode4 = (hashCode3 + (spaceContext != null ? spaceContext.hashCode() : 0)) * 37;
        String str = this.time_zone;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        CreateTileFromTileContext createTileFromTileContext = this.create_tile_from_tile_context;
        int hashCode6 = (hashCode5 + (createTileFromTileContext != null ? createTileFromTileContext.hashCode() : 0)) * 37;
        EditTileContext editTileContext = this.edit_tile_context;
        int hashCode7 = (hashCode6 + (editTileContext != null ? editTileContext.hashCode() : 0)) * 37;
        CustomerContext customerContext = this.customer_context;
        int hashCode8 = (hashCode7 + (customerContext != null ? customerContext.hashCode() : 0)) * 37;
        Tenancy tenancy = this.tenancy;
        int hashCode9 = (hashCode8 + (tenancy != null ? tenancy.hashCode() : 0)) * 37;
        Boolean bool = this.bot_prompts_you;
        int hashCode10 = (hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.insight_id;
        int hashCode11 = (hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.suggestions_id;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ScriptConversionContext scriptConversionContext = this.script_conversion_context;
        int hashCode13 = (hashCode12 + (scriptConversionContext != null ? scriptConversionContext.hashCode() : 0)) * 37;
        MoneybotContext moneybotContext = this.moneybot_context;
        int hashCode14 = (hashCode13 + (moneybotContext != null ? moneybotContext.hashCode() : 0)) * 37;
        ManagerbotContext managerbotContext = this.managerbot_context;
        int hashCode15 = (hashCode14 + (managerbotContext != null ? managerbotContext.hashCode() : 0)) * 37;
        RenderContext renderContext = this.render_context;
        int hashCode16 = (hashCode15 + (renderContext != null ? renderContext.hashCode() : 0)) * 37;
        Boolean bool2 = this.auto_terminate;
        int hashCode17 = (hashCode16 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        SlackContext slackContext = this.slack_context;
        int hashCode18 = (hashCode17 + (slackContext != null ? slackContext.hashCode() : 0)) * 37;
        EditWidgetContext editWidgetContext = this.edit_widget_context;
        int hashCode19 = (hashCode18 + (editWidgetContext != null ? editWidgetContext.hashCode() : 0)) * 37;
        RelayContext relayContext = this.relay_context;
        int hashCode20 = this.preamble_params.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode19 + (relayContext != null ? relayContext.hashCode() : 0)) * 37, 37, this.skip_permission_lease_tools);
        this.hashCode = hashCode20;
        return hashCode20;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.source = this.source;
        builder.follow_up_chat_context = this.follow_up_chat_context;
        builder.space = this.space;
        builder.time_zone = this.time_zone;
        builder.create_tile_from_tile_context = this.create_tile_from_tile_context;
        builder.edit_tile_context = this.edit_tile_context;
        builder.customer_context = this.customer_context;
        builder.tenancy = this.tenancy;
        builder.bot_prompts_you = this.bot_prompts_you;
        builder.insight_id = this.insight_id;
        builder.suggestions_id = this.suggestions_id;
        builder.script_conversion_context = this.script_conversion_context;
        builder.moneybot_context = this.moneybot_context;
        builder.managerbot_context = this.managerbot_context;
        builder.render_context = this.render_context;
        builder.auto_terminate = this.auto_terminate;
        builder.slack_context = this.slack_context;
        builder.edit_widget_context = this.edit_widget_context;
        builder.relay_context = this.relay_context;
        builder.skip_permission_lease_tools = this.skip_permission_lease_tools;
        builder.preamble_params = this.preamble_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        FollowUpChatContext followUpChatContext = this.follow_up_chat_context;
        if (followUpChatContext != null) {
            arrayList.add("follow_up_chat_context=" + followUpChatContext);
        }
        SpaceContext spaceContext = this.space;
        if (spaceContext != null) {
            arrayList.add("space=" + spaceContext);
        }
        String str = this.time_zone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "time_zone=", arrayList);
        }
        CreateTileFromTileContext createTileFromTileContext = this.create_tile_from_tile_context;
        if (createTileFromTileContext != null) {
            arrayList.add("create_tile_from_tile_context=" + createTileFromTileContext);
        }
        EditTileContext editTileContext = this.edit_tile_context;
        if (editTileContext != null) {
            arrayList.add("edit_tile_context=" + editTileContext);
        }
        CustomerContext customerContext = this.customer_context;
        if (customerContext != null) {
            arrayList.add("customer_context=" + customerContext);
        }
        Tenancy tenancy = this.tenancy;
        if (tenancy != null) {
            arrayList.add("tenancy=" + tenancy);
        }
        Boolean bool = this.bot_prompts_you;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bot_prompts_you=", bool, arrayList);
        }
        String str2 = this.insight_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "insight_id=", arrayList);
        }
        String str3 = this.suggestions_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "suggestions_id=", arrayList);
        }
        ScriptConversionContext scriptConversionContext = this.script_conversion_context;
        if (scriptConversionContext != null) {
            arrayList.add("script_conversion_context=" + scriptConversionContext);
        }
        MoneybotContext moneybotContext = this.moneybot_context;
        if (moneybotContext != null) {
            arrayList.add("moneybot_context=" + moneybotContext);
        }
        ManagerbotContext managerbotContext = this.managerbot_context;
        if (managerbotContext != null) {
            arrayList.add("managerbot_context=" + managerbotContext);
        }
        RenderContext renderContext = this.render_context;
        if (renderContext != null) {
            arrayList.add("render_context=" + renderContext);
        }
        Boolean bool2 = this.auto_terminate;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_terminate=", bool2, arrayList);
        }
        SlackContext slackContext = this.slack_context;
        if (slackContext != null) {
            arrayList.add("slack_context=" + slackContext);
        }
        EditWidgetContext editWidgetContext = this.edit_widget_context;
        if (editWidgetContext != null) {
            arrayList.add("edit_widget_context=" + editWidgetContext);
        }
        RelayContext relayContext = this.relay_context;
        if (relayContext != null) {
            arrayList.add("relay_context=" + relayContext);
        }
        if (!this.skip_permission_lease_tools.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_permission_lease_tools=", arrayList, this.skip_permission_lease_tools);
        }
        if (!this.preamble_params.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("preamble_params=", this.preamble_params, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChatContext{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChatContext(Source source, Tenancy tenancy, String str, RenderContext renderContext, int i) {
        this(source, null, null, null, null, null, null, r12, r13, null, r15, null, null, null, renderContext, null, null, null, null, r24, r25, ByteString.EMPTY);
        Boolean bool = Boolean.FALSE;
        Tenancy tenancy2 = (i & 128) != 0 ? null : tenancy;
        Boolean bool2 = (i & 256) != 0 ? null : bool;
        String str2 = (i & 1024) != 0 ? null : str;
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }
}
