package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CountryText;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
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
import kotlin.Deprecated;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004.-/0R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0005R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0005\u0012\u0004\b\"\u0010\u0007R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0005R\u0016\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0005R\u0016\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0005R\u0016\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0005R\u0016\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0005R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0005R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$Builder;", "", "message", "Ljava/lang/String;", "getMessage$annotations", "()V", "Lcom/squareup/protos/common/Money;", "bounty_amount", "Lcom/squareup/protos/common/Money;", "", "enabled", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment;", "invitation_treatment", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment;", "welcome_bonus_amount", "getWelcome_bonus_amount$annotations", "header_text", "preview_message", "message_template", "invite_all_enabled", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior;", "invitation_behavior", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior;", "getInvitation_behavior$annotations", "reward_code", "reward_code_url", "Lcom/squareup/protos/franklin/api/SharingContent;", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "header_link_display_text", "profile_button_text", "getProfile_button_text$annotations", "activity_button_text", "profile_button_template", "profile_row_title", "profile_row_subtitle", "standalone_invite_friends_cta", "short_invite_friends_cta", "", "Lcom/squareup/protos/franklin/api/CountryText;", "preview_message_by_country", "Ljava/util/List;", "Companion", "Builder", "InvitationTreatment", "InvitationBehavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvitationConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvitationConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 16)
    public final String activity_button_text;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    public final Money bounty_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 14)
    public final String header_link_display_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String header_text;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.InvitationConfig$InvitationBehavior#ADAPTER", schemaIndex = 10, tag = 10)
    public final InvitationBehavior invitation_behavior;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.InvitationConfig$InvitationTreatment#ADAPTER", schemaIndex = 3, tag = 4)
    public final InvitationTreatment invitation_treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 9)
    public final Boolean invite_all_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 8)
    public final String message_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String preview_message;

    @WireField(adapter = "com.squareup.protos.franklin.api.CountryText#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 17)
    public final List<CountryText> preview_message_by_country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 17, tag = 18)
    public final String profile_button_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 15)
    public final String profile_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 20)
    public final String profile_row_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 19)
    public final String profile_row_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 11)
    public final String reward_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 12)
    public final String reward_code_url;

    @WireField(adapter = "com.squareup.protos.franklin.api.SharingContent#ADAPTER", schemaIndex = 13, tag = 13)
    public final SharingContent sharing_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 22)
    public final String short_invite_friends_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 21)
    public final String standalone_invite_friends_cta;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money welcome_bonus_amount;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010$J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010$J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0006J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0006J\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig;", "<init>", "()V", "message", "", "bounty_amount", "Lcom/squareup/protos/common/Money;", "enabled", "", "Ljava/lang/Boolean;", "invitation_treatment", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment;", "welcome_bonus_amount", "header_text", "preview_message", "preview_message_by_country", "", "Lcom/squareup/protos/franklin/api/CountryText;", "message_template", "invite_all_enabled", "invitation_behavior", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior;", "reward_code", "reward_code_url", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "header_link_display_text", "profile_button_text", "activity_button_text", "profile_button_template", "profile_row_title", "profile_row_subtitle", "standalone_invite_friends_cta", "short_invite_friends_cta", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String activity_button_text;
        public Money bounty_amount;
        public Boolean enabled;
        public String header_link_display_text;
        public String header_text;
        public InvitationBehavior invitation_behavior;
        public InvitationTreatment invitation_treatment;
        public Boolean invite_all_enabled;
        public String message;
        public String message_template;
        public String preview_message;
        public List<CountryText> preview_message_by_country = EmptyList.INSTANCE;
        public String profile_button_template;
        public String profile_button_text;
        public String profile_row_subtitle;
        public String profile_row_title;
        public String reward_code;
        public String reward_code_url;
        public SharingContent sharing_content;
        public String short_invite_friends_cta;
        public String standalone_invite_friends_cta;
        public Money welcome_bonus_amount;

        public final Builder activity_button_text(String activity_button_text) {
            this.activity_button_text = activity_button_text;
            return this;
        }

        public final Builder bounty_amount(Money bounty_amount) {
            this.bounty_amount = bounty_amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public InvitationConfig build() {
            return new InvitationConfig(this.message, this.bounty_amount, this.enabled, this.invitation_treatment, this.welcome_bonus_amount, this.header_text, this.preview_message, this.preview_message_by_country, this.message_template, this.invite_all_enabled, this.invitation_behavior, this.reward_code, this.reward_code_url, this.sharing_content, this.header_link_display_text, this.profile_button_text, this.activity_button_text, this.profile_button_template, this.profile_row_title, this.profile_row_subtitle, this.standalone_invite_friends_cta, this.short_invite_friends_cta, buildUnknownFields());
        }

        public final Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder header_link_display_text(String header_link_display_text) {
            this.header_link_display_text = header_link_display_text;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        @Deprecated
        public final Builder invitation_behavior(InvitationBehavior invitation_behavior) {
            this.invitation_behavior = invitation_behavior;
            return this;
        }

        public final Builder invitation_treatment(InvitationTreatment invitation_treatment) {
            this.invitation_treatment = invitation_treatment;
            return this;
        }

        public final Builder invite_all_enabled(Boolean invite_all_enabled) {
            this.invite_all_enabled = invite_all_enabled;
            return this;
        }

        @Deprecated
        public final Builder message(String message) {
            this.message = message;
            return this;
        }

        public final Builder message_template(String message_template) {
            this.message_template = message_template;
            return this;
        }

        public final Builder preview_message(String preview_message) {
            this.preview_message = preview_message;
            return this;
        }

        public final Builder preview_message_by_country(List<CountryText> preview_message_by_country) {
            preview_message_by_country.getClass();
            TransactorKt.checkElementsNotNull(preview_message_by_country);
            this.preview_message_by_country = preview_message_by_country;
            return this;
        }

        public final Builder profile_button_template(String profile_button_template) {
            this.profile_button_template = profile_button_template;
            return this;
        }

        @Deprecated
        public final Builder profile_button_text(String profile_button_text) {
            this.profile_button_text = profile_button_text;
            return this;
        }

        public final Builder profile_row_subtitle(String profile_row_subtitle) {
            this.profile_row_subtitle = profile_row_subtitle;
            return this;
        }

        public final Builder profile_row_title(String profile_row_title) {
            this.profile_row_title = profile_row_title;
            return this;
        }

        public final Builder reward_code(String reward_code) {
            this.reward_code = reward_code;
            return this;
        }

        public final Builder reward_code_url(String reward_code_url) {
            this.reward_code_url = reward_code_url;
            return this;
        }

        public final Builder sharing_content(SharingContent sharing_content) {
            this.sharing_content = sharing_content;
            return this;
        }

        public final Builder short_invite_friends_cta(String short_invite_friends_cta) {
            this.short_invite_friends_cta = short_invite_friends_cta;
            return this;
        }

        public final Builder standalone_invite_friends_cta(String standalone_invite_friends_cta) {
            this.standalone_invite_friends_cta = standalone_invite_friends_cta;
            return this;
        }

        @Deprecated
        public final Builder welcome_bonus_amount(Money welcome_bonus_amount) {
            this.welcome_bonus_amount = welcome_bonus_amount;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvitationConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.InvitationConfig$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v52 */
            /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v55 */
            /* JADX WARN: Type inference failed for: r0v56 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public InvitationConfig decode(ProtoReader reader) {
                Object obj;
                InvitationConfig.InvitationTreatment invitationTreatment;
                ArrayList arrayList;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                InvitationConfig.InvitationTreatment invitationTreatment2 = null;
                Object obj4 = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Boolean bool = null;
                InvitationConfig.InvitationBehavior invitationBehavior = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                Boolean bool2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        Object obj5 = obj2;
                        return new InvitationConfig(str, (Money) obj3, bool2, invitationTreatment2, (Money) obj4, str2, str3, m, str4, bool, invitationBehavior, str5, str6, (SharingContent) obj5, str7, str8, str9, str10, str11, str12, str13, str14, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = m;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = m;
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                        case 3:
                            arrayList = m;
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 4:
                            obj = obj2;
                            invitationTreatment = invitationTreatment2;
                            arrayList = m;
                            try {
                                invitationTreatment2 = InvitationConfig.InvitationTreatment.ADAPTER.decode(reader);
                                obj2 = obj;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            arrayList = m;
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        case 6:
                            arrayList = m;
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 7:
                            arrayList = m;
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 8:
                            arrayList = m;
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            arrayList = m;
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 10:
                            try {
                                invitationBehavior = InvitationConfig.InvitationBehavior.ADAPTER.decode(reader);
                                arrayList = m;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj2;
                                invitationTreatment = invitationTreatment2;
                                arrayList = m;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 11:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 12:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 13:
                            obj2 = TransactorKt.decodeMessageOrMerge(SharingContent.ADAPTER, reader, obj2);
                            arrayList = m;
                            decode = str;
                            break;
                        case 14:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 15:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 16:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 17:
                            m.add(CountryText.ADAPTER.decode(reader));
                            obj = obj2;
                            invitationTreatment = invitationTreatment2;
                            arrayList = m;
                            decode = str;
                            obj2 = obj;
                            invitationTreatment2 = invitationTreatment;
                            break;
                        case 18:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 19:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 20:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 21:
                            str13 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 22:
                            str14 = ProtoAdapter.STRING.decode(reader);
                            arrayList = m;
                            decode = str;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj2;
                            invitationTreatment = invitationTreatment2;
                            arrayList = m;
                            decode = str;
                            obj2 = obj;
                            invitationTreatment2 = invitationTreatment;
                            break;
                    }
                    str = decode;
                    m = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvitationConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.message);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.bounty_amount);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 3, value.enabled);
                InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(writer, 4, value.invitation_treatment);
                protoAdapter3.encodeWithTag(writer, 5, value.welcome_bonus_amount);
                protoAdapter2.encodeWithTag(writer, 6, value.header_text);
                protoAdapter2.encodeWithTag(writer, 7, value.preview_message);
                CountryText.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.preview_message_by_country);
                protoAdapter2.encodeWithTag(writer, 8, value.message_template);
                protoAdapter4.encodeWithTag(writer, 9, value.invite_all_enabled);
                InvitationConfig.InvitationBehavior.ADAPTER.encodeWithTag(writer, 10, value.invitation_behavior);
                protoAdapter2.encodeWithTag(writer, 11, value.reward_code);
                protoAdapter2.encodeWithTag(writer, 12, value.reward_code_url);
                SharingContent.ADAPTER.encodeWithTag(writer, 13, value.sharing_content);
                protoAdapter2.encodeWithTag(writer, 14, value.header_link_display_text);
                protoAdapter2.encodeWithTag(writer, 15, value.profile_button_text);
                protoAdapter2.encodeWithTag(writer, 16, value.activity_button_text);
                protoAdapter2.encodeWithTag(writer, 18, value.profile_button_template);
                protoAdapter2.encodeWithTag(writer, 19, value.profile_row_title);
                protoAdapter2.encodeWithTag(writer, 20, value.profile_row_subtitle);
                protoAdapter2.encodeWithTag(writer, 21, value.standalone_invite_friends_cta);
                protoAdapter2.encodeWithTag(writer, 22, value.short_invite_friends_cta);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvitationConfig value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.message) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter3.encodedSizeWithTag(2, value.bounty_amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(22, value.short_invite_friends_cta) + protoAdapter2.encodedSizeWithTag(21, value.standalone_invite_friends_cta) + protoAdapter2.encodedSizeWithTag(20, value.profile_row_subtitle) + protoAdapter2.encodedSizeWithTag(19, value.profile_row_title) + protoAdapter2.encodedSizeWithTag(18, value.profile_button_template) + protoAdapter2.encodedSizeWithTag(16, value.activity_button_text) + protoAdapter2.encodedSizeWithTag(15, value.profile_button_text) + protoAdapter2.encodedSizeWithTag(14, value.header_link_display_text) + SharingContent.ADAPTER.encodedSizeWithTag(13, value.sharing_content) + protoAdapter2.encodedSizeWithTag(12, value.reward_code_url) + protoAdapter2.encodedSizeWithTag(11, value.reward_code) + InvitationConfig.InvitationBehavior.ADAPTER.encodedSizeWithTag(10, value.invitation_behavior) + protoAdapter4.encodedSizeWithTag(9, value.invite_all_enabled) + protoAdapter2.encodedSizeWithTag(8, value.message_template) + CountryText.ADAPTER.asRepeated().encodedSizeWithTag(17, value.preview_message_by_country) + protoAdapter2.encodedSizeWithTag(7, value.preview_message) + protoAdapter2.encodedSizeWithTag(6, value.header_text) + protoAdapter3.encodedSizeWithTag(5, value.welcome_bonus_amount) + InvitationConfig.InvitationTreatment.ADAPTER.encodedSizeWithTag(4, value.invitation_treatment) + protoAdapter4.encodedSizeWithTag(3, value.enabled) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvitationConfig redact(InvitationConfig value) {
                value.getClass();
                Money money = value.bounty_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.welcome_bonus_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.preview_message_by_country, CountryText.ADAPTER);
                SharingContent sharingContent = value.sharing_content;
                SharingContent sharingContent2 = sharingContent != null ? (SharingContent) SharingContent.ADAPTER.redact(sharingContent) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.message;
                Boolean bool = value.enabled;
                InvitationConfig.InvitationTreatment invitationTreatment = value.invitation_treatment;
                String str2 = value.header_text;
                String str3 = value.preview_message;
                String str4 = value.message_template;
                Boolean bool2 = value.invite_all_enabled;
                InvitationConfig.InvitationBehavior invitationBehavior = value.invitation_behavior;
                String str5 = value.reward_code;
                String str6 = value.reward_code_url;
                String str7 = value.header_link_display_text;
                String str8 = value.profile_button_text;
                String str9 = value.activity_button_text;
                String str10 = value.profile_button_template;
                String str11 = value.profile_row_title;
                String str12 = value.profile_row_subtitle;
                String str13 = value.standalone_invite_friends_cta;
                String str14 = value.short_invite_friends_cta;
                byteString.getClass();
                return new InvitationConfig(str, money2, bool, invitationTreatment, money4, str2, str3, m1169redactElements, str4, bool2, invitationBehavior, str5, str6, sharingContent2, str7, str8, str9, str10, str11, str12, str13, str14, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvitationConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 22, value.short_invite_friends_cta);
                protoAdapter2.encodeWithTag(writer, 21, value.standalone_invite_friends_cta);
                protoAdapter2.encodeWithTag(writer, 20, value.profile_row_subtitle);
                protoAdapter2.encodeWithTag(writer, 19, value.profile_row_title);
                protoAdapter2.encodeWithTag(writer, 18, value.profile_button_template);
                protoAdapter2.encodeWithTag(writer, 16, value.activity_button_text);
                protoAdapter2.encodeWithTag(writer, 15, value.profile_button_text);
                protoAdapter2.encodeWithTag(writer, 14, value.header_link_display_text);
                SharingContent.ADAPTER.encodeWithTag(writer, 13, value.sharing_content);
                protoAdapter2.encodeWithTag(writer, 12, value.reward_code_url);
                protoAdapter2.encodeWithTag(writer, 11, value.reward_code);
                InvitationConfig.InvitationBehavior.ADAPTER.encodeWithTag(writer, 10, value.invitation_behavior);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 9, value.invite_all_enabled);
                protoAdapter2.encodeWithTag(writer, 8, value.message_template);
                CountryText.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.preview_message_by_country);
                protoAdapter2.encodeWithTag(writer, 7, value.preview_message);
                protoAdapter2.encodeWithTag(writer, 6, value.header_text);
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 5, value.welcome_bonus_amount);
                InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(writer, 4, value.invitation_treatment);
                protoAdapter3.encodeWithTag(writer, 3, value.enabled);
                protoAdapter4.encodeWithTag(writer, 2, value.bounty_amount);
                protoAdapter2.encodeWithTag(writer, 1, value.message);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitationConfig(String str, Money money, Boolean bool, InvitationTreatment invitationTreatment, Money money2, String str2, String str3, List list, String str4, Boolean bool2, InvitationBehavior invitationBehavior, String str5, String str6, SharingContent sharingContent, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.message = str;
        this.bounty_amount = money;
        this.enabled = bool;
        this.invitation_treatment = invitationTreatment;
        this.welcome_bonus_amount = money2;
        this.header_text = str2;
        this.preview_message = str3;
        this.message_template = str4;
        this.invite_all_enabled = bool2;
        this.invitation_behavior = invitationBehavior;
        this.reward_code = str5;
        this.reward_code_url = str6;
        this.sharing_content = sharingContent;
        this.header_link_display_text = str7;
        this.profile_button_text = str8;
        this.activity_button_text = str9;
        this.profile_button_template = str10;
        this.profile_row_title = str11;
        this.profile_row_subtitle = str12;
        this.standalone_invite_friends_cta = str13;
        this.short_invite_friends_cta = str14;
        this.preview_message_by_country = TransactorKt.immutableCopyOf("preview_message_by_country", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvitationConfig)) {
            return false;
        }
        InvitationConfig invitationConfig = (InvitationConfig) obj;
        return Intrinsics.areEqual(unknownFields(), invitationConfig.unknownFields()) && Intrinsics.areEqual(this.message, invitationConfig.message) && Intrinsics.areEqual(this.bounty_amount, invitationConfig.bounty_amount) && Intrinsics.areEqual(this.enabled, invitationConfig.enabled) && this.invitation_treatment == invitationConfig.invitation_treatment && Intrinsics.areEqual(this.welcome_bonus_amount, invitationConfig.welcome_bonus_amount) && Intrinsics.areEqual(this.header_text, invitationConfig.header_text) && Intrinsics.areEqual(this.preview_message, invitationConfig.preview_message) && Intrinsics.areEqual(this.preview_message_by_country, invitationConfig.preview_message_by_country) && Intrinsics.areEqual(this.message_template, invitationConfig.message_template) && Intrinsics.areEqual(this.invite_all_enabled, invitationConfig.invite_all_enabled) && this.invitation_behavior == invitationConfig.invitation_behavior && Intrinsics.areEqual(this.reward_code, invitationConfig.reward_code) && Intrinsics.areEqual(this.reward_code_url, invitationConfig.reward_code_url) && Intrinsics.areEqual(this.sharing_content, invitationConfig.sharing_content) && Intrinsics.areEqual(this.header_link_display_text, invitationConfig.header_link_display_text) && Intrinsics.areEqual(this.profile_button_text, invitationConfig.profile_button_text) && Intrinsics.areEqual(this.activity_button_text, invitationConfig.activity_button_text) && Intrinsics.areEqual(this.profile_button_template, invitationConfig.profile_button_template) && Intrinsics.areEqual(this.profile_row_title, invitationConfig.profile_row_title) && Intrinsics.areEqual(this.profile_row_subtitle, invitationConfig.profile_row_subtitle) && Intrinsics.areEqual(this.standalone_invite_friends_cta, invitationConfig.standalone_invite_friends_cta) && Intrinsics.areEqual(this.short_invite_friends_cta, invitationConfig.short_invite_friends_cta);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.bounty_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        InvitationTreatment invitationTreatment = this.invitation_treatment;
        int hashCode5 = (hashCode4 + (invitationTreatment != null ? invitationTreatment.hashCode() : 0)) * 37;
        Money money2 = this.welcome_bonus_amount;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str2 = this.header_text;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.preview_message;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.preview_message_by_country);
        String str4 = this.message_template;
        int hashCode8 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool2 = this.invite_all_enabled;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        InvitationBehavior invitationBehavior = this.invitation_behavior;
        int hashCode10 = (hashCode9 + (invitationBehavior != null ? invitationBehavior.hashCode() : 0)) * 37;
        String str5 = this.reward_code;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.reward_code_url;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        SharingContent sharingContent = this.sharing_content;
        int hashCode13 = (hashCode12 + (sharingContent != null ? sharingContent.hashCode() : 0)) * 37;
        String str7 = this.header_link_display_text;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.profile_button_text;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.activity_button_text;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.profile_button_template;
        int hashCode17 = (hashCode16 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.profile_row_title;
        int hashCode18 = (hashCode17 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.profile_row_subtitle;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.standalone_invite_friends_cta;
        int hashCode20 = (hashCode19 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.short_invite_friends_cta;
        int hashCode21 = hashCode20 + (str14 != null ? str14.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.message = this.message;
        builder.bounty_amount = this.bounty_amount;
        builder.enabled = this.enabled;
        builder.invitation_treatment = this.invitation_treatment;
        builder.welcome_bonus_amount = this.welcome_bonus_amount;
        builder.header_text = this.header_text;
        builder.preview_message = this.preview_message;
        builder.preview_message_by_country = this.preview_message_by_country;
        builder.message_template = this.message_template;
        builder.invite_all_enabled = this.invite_all_enabled;
        builder.invitation_behavior = this.invitation_behavior;
        builder.reward_code = this.reward_code;
        builder.reward_code_url = this.reward_code_url;
        builder.sharing_content = this.sharing_content;
        builder.header_link_display_text = this.header_link_display_text;
        builder.profile_button_text = this.profile_button_text;
        builder.activity_button_text = this.activity_button_text;
        builder.profile_button_template = this.profile_button_template;
        builder.profile_row_title = this.profile_row_title;
        builder.profile_row_subtitle = this.profile_row_subtitle;
        builder.standalone_invite_friends_cta = this.standalone_invite_friends_cta;
        builder.short_invite_friends_cta = this.short_invite_friends_cta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        Money money = this.bounty_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("bounty_amount=", money, arrayList);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        InvitationTreatment invitationTreatment = this.invitation_treatment;
        if (invitationTreatment != null) {
            arrayList.add("invitation_treatment=" + invitationTreatment);
        }
        Money money2 = this.welcome_bonus_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("welcome_bonus_amount=", money2, arrayList);
        }
        String str2 = this.header_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_text=", arrayList);
        }
        String str3 = this.preview_message;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preview_message=", arrayList);
        }
        if (!this.preview_message_by_country.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("preview_message_by_country=", arrayList, this.preview_message_by_country);
        }
        String str4 = this.message_template;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "message_template=", arrayList);
        }
        Boolean bool2 = this.invite_all_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invite_all_enabled=", bool2, arrayList);
        }
        InvitationBehavior invitationBehavior = this.invitation_behavior;
        if (invitationBehavior != null) {
            arrayList.add("invitation_behavior=" + invitationBehavior);
        }
        String str5 = this.reward_code;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "reward_code=", arrayList);
        }
        String str6 = this.reward_code_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "reward_code_url=", arrayList);
        }
        SharingContent sharingContent = this.sharing_content;
        if (sharingContent != null) {
            arrayList.add("sharing_content=" + sharingContent);
        }
        String str7 = this.header_link_display_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "header_link_display_text=", arrayList);
        }
        String str8 = this.profile_button_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "profile_button_text=", arrayList);
        }
        String str9 = this.activity_button_text;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "activity_button_text=", arrayList);
        }
        String str10 = this.profile_button_template;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "profile_button_template=", arrayList);
        }
        String str11 = this.profile_row_title;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "profile_row_title=", arrayList);
        }
        String str12 = this.profile_row_subtitle;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "profile_row_subtitle=", arrayList);
        }
        String str13 = this.standalone_invite_friends_cta;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "standalone_invite_friends_cta=", arrayList);
        }
        String str14 = this.short_invite_friends_cta;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "short_invite_friends_cta=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvitationConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "V2_5_BEHAVIOR", "V2_6_NO_EMAIL", "V2_6_NO_INTERSTITIAL", "V2_6_NO_EMAIL_NO_INTERSTITIAL_SELECT_ALL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvitationBehavior implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InvitationBehavior[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final InvitationBehavior V2_5_BEHAVIOR = new InvitationBehavior("V2_5_BEHAVIOR", 0, 1);
        public static final InvitationBehavior V2_6_NO_EMAIL = new InvitationBehavior("V2_6_NO_EMAIL", 1, 2);
        public static final InvitationBehavior V2_6_NO_INTERSTITIAL = new InvitationBehavior("V2_6_NO_INTERSTITIAL", 2, 3);
        public static final InvitationBehavior V2_6_NO_EMAIL_NO_INTERSTITIAL_SELECT_ALL = new InvitationBehavior("V2_6_NO_EMAIL_NO_INTERSTITIAL_SELECT_ALL", 3, 4);

        private static final /* synthetic */ InvitationBehavior[] $values() {
            return new InvitationBehavior[]{V2_5_BEHAVIOR, V2_6_NO_EMAIL, V2_6_NO_INTERSTITIAL, V2_6_NO_EMAIL_NO_INTERSTITIAL_SELECT_ALL};
        }

        static {
            InvitationBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvitationBehavior.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.InvitationConfig$InvitationBehavior$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public InvitationConfig.InvitationBehavior fromValue(int value) {
                    return InvitationConfig.InvitationBehavior.INSTANCE.fromValue(value);
                }
            };
        }

        private InvitationBehavior(String str, int i, int i2) {
            this.value = i2;
        }

        public static final InvitationBehavior fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static InvitationBehavior valueOf(String str) {
            return (InvitationBehavior) Enum.valueOf(InvitationBehavior.class, str);
        }

        public static InvitationBehavior[] values() {
            return (InvitationBehavior[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InvitationBehavior fromValue(int value) {
                if (value == 1) {
                    return InvitationBehavior.V2_5_BEHAVIOR;
                }
                if (value == 2) {
                    return InvitationBehavior.V2_6_NO_EMAIL;
                }
                if (value == 3) {
                    return InvitationBehavior.V2_6_NO_INTERSTITIAL;
                }
                if (value != 4) {
                    return null;
                }
                return InvitationBehavior.V2_6_NO_EMAIL_NO_INTERSTITIAL_SELECT_ALL;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BATCH_TEN", "BATCH_ONE", "COMPOSE_IMMEDIATELY", "ADDITIONAL_ALIAS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvitationTreatment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InvitationTreatment[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final InvitationTreatment BATCH_TEN = new InvitationTreatment("BATCH_TEN", 0, 1);
        public static final InvitationTreatment BATCH_ONE = new InvitationTreatment("BATCH_ONE", 1, 2);
        public static final InvitationTreatment COMPOSE_IMMEDIATELY = new InvitationTreatment("COMPOSE_IMMEDIATELY", 2, 3);
        public static final InvitationTreatment ADDITIONAL_ALIAS = new InvitationTreatment("ADDITIONAL_ALIAS", 3, 4);

        private static final /* synthetic */ InvitationTreatment[] $values() {
            return new InvitationTreatment[]{BATCH_TEN, BATCH_ONE, COMPOSE_IMMEDIATELY, ADDITIONAL_ALIAS};
        }

        static {
            InvitationTreatment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvitationTreatment.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.InvitationConfig$InvitationTreatment$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public InvitationConfig.InvitationTreatment fromValue(int value) {
                    return InvitationConfig.InvitationTreatment.INSTANCE.fromValue(value);
                }
            };
        }

        private InvitationTreatment(String str, int i, int i2) {
            this.value = i2;
        }

        public static final InvitationTreatment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static InvitationTreatment valueOf(String str) {
            return (InvitationTreatment) Enum.valueOf(InvitationTreatment.class, str);
        }

        public static InvitationTreatment[] values() {
            return (InvitationTreatment[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$InvitationTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InvitationTreatment fromValue(int value) {
                if (value == 1) {
                    return InvitationTreatment.BATCH_TEN;
                }
                if (value == 2) {
                    return InvitationTreatment.BATCH_ONE;
                }
                if (value == 3) {
                    return InvitationTreatment.COMPOSE_IMMEDIATELY;
                }
                if (value != 4) {
                    return null;
                }
                return InvitationTreatment.ADDITIONAL_ALIAS;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/InvitationConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InvitationConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
