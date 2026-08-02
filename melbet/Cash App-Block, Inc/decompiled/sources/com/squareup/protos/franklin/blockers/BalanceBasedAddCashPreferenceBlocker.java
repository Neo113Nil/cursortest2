package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0016\u0017\u0015\u0018\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$Builder;", "", "title", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "minimum_balance_config", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "increment_config", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "auto_open", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "cta_button_label", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "balance_below_target_warning_enabled", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "info_message", "info_message_balance_below", "info_message_balance_above", "subtitle", "Companion", "Builder", "AutoOpen", "AmountSelectionConfig", "BalanceBelowTargetWarningEnabled", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BalanceBasedAddCashPreferenceBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceBasedAddCashPreferenceBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 3)
    public final AutoOpen auto_open;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled#ADAPTER", schemaIndex = 5, tag = 7)
    public final BalanceBelowTargetWarningEnabled balance_below_target_warning_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
    public final String cta_button_label;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig#ADAPTER", schemaIndex = 2, tag = 3)
    public final AmountSelectionConfig increment_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 8)
    public final String info_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 10)
    public final String info_message_balance_above;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 9)
    public final String info_message_balance_below;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig#ADAPTER", schemaIndex = 1, tag = 2)
    public final AmountSelectionConfig minimum_balance_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 11)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker;", "<init>", "()V", "title", "", "minimum_balance_config", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "increment_config", "auto_open", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "cta_button_label", "balance_below_target_warning_enabled", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "info_message", "info_message_balance_below", "info_message_balance_above", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public AutoOpen auto_open;
        public BalanceBelowTargetWarningEnabled balance_below_target_warning_enabled;
        public String cta_button_label;
        public AmountSelectionConfig increment_config;
        public String info_message;
        public String info_message_balance_above;
        public String info_message_balance_below;
        public AmountSelectionConfig minimum_balance_config;
        public String subtitle;
        public String title;

        public final Builder auto_open(AutoOpen auto_open) {
            this.auto_open = auto_open;
            return this;
        }

        public final Builder balance_below_target_warning_enabled(BalanceBelowTargetWarningEnabled balance_below_target_warning_enabled) {
            this.balance_below_target_warning_enabled = balance_below_target_warning_enabled;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BalanceBasedAddCashPreferenceBlocker build() {
            return new BalanceBasedAddCashPreferenceBlocker(this.title, this.minimum_balance_config, this.increment_config, this.auto_open, this.cta_button_label, this.balance_below_target_warning_enabled, this.info_message, this.info_message_balance_below, this.info_message_balance_above, this.subtitle, buildUnknownFields());
        }

        public final Builder cta_button_label(String cta_button_label) {
            this.cta_button_label = cta_button_label;
            return this;
        }

        public final Builder increment_config(AmountSelectionConfig increment_config) {
            this.increment_config = increment_config;
            return this;
        }

        public final Builder info_message(String info_message) {
            this.info_message = info_message;
            return this;
        }

        public final Builder info_message_balance_above(String info_message_balance_above) {
            this.info_message_balance_above = info_message_balance_above;
            return this;
        }

        public final Builder info_message_balance_below(String info_message_balance_below) {
            this.info_message_balance_below = info_message_balance_below;
            return this;
        }

        public final Builder minimum_balance_config(AmountSelectionConfig minimum_balance_config) {
            this.minimum_balance_config = minimum_balance_config;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalanceBasedAddCashPreferenceBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BalanceBasedAddCashPreferenceBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BalanceBasedAddCashPreferenceBlocker((String) obj, (BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig) obj2, (BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig) obj3, autoOpen, (String) obj4, (BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            autoOpen = new BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                            break;
                        case 5:
                            autoOpen = new BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                            break;
                        case 6:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj5 = TransactorKt.decodeMessageOrMerge(BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER, reader, obj5);
                            break;
                        case 8:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 11:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BalanceBasedAddCashPreferenceBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                ProtoAdapter protoAdapter3 = BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.minimum_balance_config);
                protoAdapter3.encodeWithTag(writer, 3, value.increment_config);
                protoAdapter2.encodeWithTag(writer, 6, value.cta_button_label);
                BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER.encodeWithTag(writer, 7, value.balance_below_target_warning_enabled);
                protoAdapter2.encodeWithTag(writer, 8, value.info_message);
                protoAdapter2.encodeWithTag(writer, 9, value.info_message_balance_below);
                protoAdapter2.encodeWithTag(writer, 10, value.info_message_balance_above);
                protoAdapter2.encodeWithTag(writer, 11, value.subtitle);
                BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = value.auto_open;
                if (autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) autoOpen).getValue()));
                } else if (autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) autoOpen).getValue()));
                } else if (autoOpen != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BalanceBasedAddCashPreferenceBlocker value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(3, value.increment_config) + protoAdapter3.encodedSizeWithTag(2, value.minimum_balance_config) + encodedSizeWithTag2;
                BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = value.auto_open;
                if (autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) {
                    encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) autoOpen).getValue()));
                } else {
                    if (!(autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig)) {
                        if (autoOpen != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(11, value.subtitle) + protoAdapter2.encodedSizeWithTag(10, value.info_message_balance_above) + protoAdapter2.encodedSizeWithTag(9, value.info_message_balance_below) + protoAdapter2.encodedSizeWithTag(8, value.info_message) + BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER.encodedSizeWithTag(7, value.balance_below_target_warning_enabled) + protoAdapter2.encodedSizeWithTag(6, value.cta_button_label) + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) autoOpen).getValue()));
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(11, value.subtitle) + protoAdapter2.encodedSizeWithTag(10, value.info_message_balance_above) + protoAdapter2.encodedSizeWithTag(9, value.info_message_balance_below) + protoAdapter2.encodedSizeWithTag(8, value.info_message) + BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER.encodedSizeWithTag(7, value.balance_below_target_warning_enabled) + protoAdapter2.encodedSizeWithTag(6, value.cta_button_label) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BalanceBasedAddCashPreferenceBlocker redact(BalanceBasedAddCashPreferenceBlocker value) {
                value.getClass();
                BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig = value.minimum_balance_config;
                BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig2 = amountSelectionConfig != null ? (BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig) BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER.redact(amountSelectionConfig) : null;
                BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig3 = value.increment_config;
                BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig4 = amountSelectionConfig3 != null ? (BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig) BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER.redact(amountSelectionConfig3) : null;
                BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled = value.balance_below_target_warning_enabled;
                BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled2 = balanceBelowTargetWarningEnabled != null ? (BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled) BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER.redact(balanceBelowTargetWarningEnabled) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = value.auto_open;
                String str2 = value.cta_button_label;
                String str3 = value.info_message;
                String str4 = value.info_message_balance_below;
                String str5 = value.info_message_balance_above;
                String str6 = value.subtitle;
                byteString.getClass();
                return new BalanceBasedAddCashPreferenceBlocker(str, amountSelectionConfig2, amountSelectionConfig4, autoOpen, str2, balanceBelowTargetWarningEnabled2, str3, str4, str5, str6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BalanceBasedAddCashPreferenceBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = value.auto_open;
                if (autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) autoOpen).getValue()));
                } else if (autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(((BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) autoOpen).getValue()));
                } else if (autoOpen != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 11, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 10, value.info_message_balance_above);
                protoAdapter2.encodeWithTag(writer, 9, value.info_message_balance_below);
                protoAdapter2.encodeWithTag(writer, 8, value.info_message);
                BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.ADAPTER.encodeWithTag(writer, 7, value.balance_below_target_warning_enabled);
                protoAdapter2.encodeWithTag(writer, 6, value.cta_button_label);
                ProtoAdapter protoAdapter3 = BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.increment_config);
                protoAdapter3.encodeWithTag(writer, 2, value.minimum_balance_config);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceBasedAddCashPreferenceBlocker(String str, AmountSelectionConfig amountSelectionConfig, AmountSelectionConfig amountSelectionConfig2, AutoOpen autoOpen, String str2, BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.minimum_balance_config = amountSelectionConfig;
        this.increment_config = amountSelectionConfig2;
        this.auto_open = autoOpen;
        this.cta_button_label = str2;
        this.balance_below_target_warning_enabled = balanceBelowTargetWarningEnabled;
        this.info_message = str3;
        this.info_message_balance_below = str4;
        this.info_message_balance_above = str5;
        this.subtitle = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashPreferenceBlocker)) {
            return false;
        }
        BalanceBasedAddCashPreferenceBlocker balanceBasedAddCashPreferenceBlocker = (BalanceBasedAddCashPreferenceBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), balanceBasedAddCashPreferenceBlocker.unknownFields()) && Intrinsics.areEqual(this.title, balanceBasedAddCashPreferenceBlocker.title) && Intrinsics.areEqual(this.minimum_balance_config, balanceBasedAddCashPreferenceBlocker.minimum_balance_config) && Intrinsics.areEqual(this.increment_config, balanceBasedAddCashPreferenceBlocker.increment_config) && Intrinsics.areEqual(this.auto_open, balanceBasedAddCashPreferenceBlocker.auto_open) && Intrinsics.areEqual(this.cta_button_label, balanceBasedAddCashPreferenceBlocker.cta_button_label) && Intrinsics.areEqual(this.balance_below_target_warning_enabled, balanceBasedAddCashPreferenceBlocker.balance_below_target_warning_enabled) && Intrinsics.areEqual(this.info_message, balanceBasedAddCashPreferenceBlocker.info_message) && Intrinsics.areEqual(this.info_message_balance_below, balanceBasedAddCashPreferenceBlocker.info_message_balance_below) && Intrinsics.areEqual(this.info_message_balance_above, balanceBasedAddCashPreferenceBlocker.info_message_balance_above) && Intrinsics.areEqual(this.subtitle, balanceBasedAddCashPreferenceBlocker.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AmountSelectionConfig amountSelectionConfig = this.minimum_balance_config;
        int hashCode3 = (hashCode2 + (amountSelectionConfig != null ? amountSelectionConfig.hashCode() : 0)) * 37;
        AmountSelectionConfig amountSelectionConfig2 = this.increment_config;
        int hashCode4 = (hashCode3 + (amountSelectionConfig2 != null ? amountSelectionConfig2.hashCode() : 0)) * 37;
        AutoOpen autoOpen = this.auto_open;
        int hashCode5 = (hashCode4 + (autoOpen != null ? autoOpen.hashCode() : 0)) * 37;
        String str2 = this.cta_button_label;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled = this.balance_below_target_warning_enabled;
        int hashCode7 = (hashCode6 + (balanceBelowTargetWarningEnabled != null ? balanceBelowTargetWarningEnabled.hashCode() : 0)) * 37;
        String str3 = this.info_message;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.info_message_balance_below;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.info_message_balance_above;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.subtitle;
        int hashCode11 = hashCode10 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.minimum_balance_config = this.minimum_balance_config;
        builder.increment_config = this.increment_config;
        builder.auto_open = this.auto_open;
        builder.cta_button_label = this.cta_button_label;
        builder.balance_below_target_warning_enabled = this.balance_below_target_warning_enabled;
        builder.info_message = this.info_message;
        builder.info_message_balance_below = this.info_message_balance_below;
        builder.info_message_balance_above = this.info_message_balance_above;
        builder.subtitle = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        AmountSelectionConfig amountSelectionConfig = this.minimum_balance_config;
        if (amountSelectionConfig != null) {
            arrayList.add("minimum_balance_config=" + amountSelectionConfig);
        }
        AmountSelectionConfig amountSelectionConfig2 = this.increment_config;
        if (amountSelectionConfig2 != null) {
            arrayList.add("increment_config=" + amountSelectionConfig2);
        }
        AutoOpen autoOpen = this.auto_open;
        if (autoOpen != null) {
            arrayList.add("auto_open=" + autoOpen);
        }
        String str2 = this.cta_button_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cta_button_label=", arrayList);
        }
        BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled = this.balance_below_target_warning_enabled;
        if (balanceBelowTargetWarningEnabled != null) {
            arrayList.add("balance_below_target_warning_enabled=" + balanceBelowTargetWarningEnabled);
        }
        String str3 = this.info_message;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "info_message=", arrayList);
        }
        String str4 = this.info_message_balance_below;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "info_message_balance_below=", arrayList);
        }
        String str5 = this.info_message_balance_above;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "info_message_balance_above=", arrayList);
        }
        String str6 = this.subtitle;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "subtitle=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceBasedAddCashPreferenceBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dBu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u0096\u0080\u0004J\b\u0010\u001a\u001a\u00020\u0004H\u0016Jt\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig$Builder;", "title", "", "subtitle", "initial_amount", "Lcom/squareup/protos/common/Money;", "amount_selection_presets", "", "amount_custom_min", "amount_custom_max", "instrument_details", "debit_card", "Lcom/squareup/protos/franklin/api/Instrument;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/common/Money;Ljava/util/List;Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Ljava/lang/String;Lcom/squareup/protos/franklin/api/Instrument;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AmountSelectionConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AmountSelectionConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 5, tag = 6)
        public final Money amount_custom_max;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
        public final Money amount_custom_min;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<Money> amount_selection_presets;

        @WireField(adapter = "com.squareup.protos.franklin.api.Instrument#ADAPTER", schemaIndex = 7, tag = 8)
        public final Instrument debit_card;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
        public final Money initial_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String instrument_details;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "<init>", "()V", "title", "", "subtitle", "initial_amount", "Lcom/squareup/protos/common/Money;", "amount_selection_presets", "", "amount_custom_min", "amount_custom_max", "instrument_details", "debit_card", "Lcom/squareup/protos/franklin/api/Instrument;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Money amount_custom_max;
            public Money amount_custom_min;
            public List<Money> amount_selection_presets = EmptyList.INSTANCE;
            public Instrument debit_card;
            public Money initial_amount;
            public String instrument_details;
            public String subtitle;
            public String title;

            public final Builder amount_custom_max(Money amount_custom_max) {
                this.amount_custom_max = amount_custom_max;
                return this;
            }

            public final Builder amount_custom_min(Money amount_custom_min) {
                this.amount_custom_min = amount_custom_min;
                return this;
            }

            public final Builder amount_selection_presets(List<Money> amount_selection_presets) {
                amount_selection_presets.getClass();
                TransactorKt.checkElementsNotNull(amount_selection_presets);
                this.amount_selection_presets = amount_selection_presets;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AmountSelectionConfig build() {
                return new AmountSelectionConfig(this.title, this.subtitle, this.initial_amount, this.amount_selection_presets, this.amount_custom_min, this.amount_custom_max, this.instrument_details, this.debit_card, buildUnknownFields());
            }

            public final Builder debit_card(Instrument debit_card) {
                this.debit_card = debit_card;
                return this;
            }

            public final Builder initial_amount(Money initial_amount) {
                this.initial_amount = initial_amount;
                return this;
            }

            public final Builder instrument_details(String instrument_details) {
                this.instrument_details = instrument_details;
                return this;
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountSelectionConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig((String) obj, (String) obj2, (Money) obj3, m, (Money) obj4, (Money) obj5, (String) obj6, (Instrument) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                m.add(Money.ADAPTER.decode(reader));
                                break;
                            case 5:
                                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                                break;
                            case 6:
                                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                                break;
                            case 7:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                obj7 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, reader, obj7);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.initial_amount);
                    protoAdapter3.asRepeated().encodeWithTag(writer, 4, value.amount_selection_presets);
                    protoAdapter3.encodeWithTag(writer, 5, value.amount_custom_min);
                    protoAdapter3.encodeWithTag(writer, 6, value.amount_custom_max);
                    protoAdapter2.encodeWithTag(writer, 7, value.instrument_details);
                    Instrument.ADAPTER.encodeWithTag(writer, 8, value.debit_card);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    return Instrument.ADAPTER.encodedSizeWithTag(8, value.debit_card) + protoAdapter2.encodedSizeWithTag(7, value.instrument_details) + protoAdapter3.encodedSizeWithTag(6, value.amount_custom_max) + protoAdapter3.encodedSizeWithTag(5, value.amount_custom_min) + protoAdapter3.asRepeated().encodedSizeWithTag(4, value.amount_selection_presets) + protoAdapter3.encodedSizeWithTag(3, value.initial_amount) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig redact(BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig value) {
                    value.getClass();
                    Money money = value.initial_amount;
                    Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                    List<Money> list = value.amount_selection_presets;
                    ProtoAdapter protoAdapter2 = Money.ADAPTER;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                    Money money3 = value.amount_custom_min;
                    Money money4 = money3 != null ? (Money) protoAdapter2.redact(money3) : null;
                    Money money5 = value.amount_custom_max;
                    Money money6 = money5 != null ? (Money) protoAdapter2.redact(money5) : null;
                    Instrument instrument = value.debit_card;
                    return BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig.copy$default(value, null, null, money2, m1169redactElements, money4, money6, null, instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null, ByteString.EMPTY, 67, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Instrument.ADAPTER.encodeWithTag(writer, 8, value.debit_card);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 7, value.instrument_details);
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 6, value.amount_custom_max);
                    protoAdapter3.encodeWithTag(writer, 5, value.amount_custom_min);
                    protoAdapter3.asRepeated().encodeWithTag(writer, 4, value.amount_selection_presets);
                    protoAdapter3.encodeWithTag(writer, 3, value.initial_amount);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public AmountSelectionConfig(String str, String str2, Money money, List list, Money money2, Money money3, String str3, Instrument instrument, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? null : money3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : instrument, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AmountSelectionConfig copy$default(AmountSelectionConfig amountSelectionConfig, String str, String str2, Money money, List list, Money money2, Money money3, String str3, Instrument instrument, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amountSelectionConfig.title;
            }
            if ((i & 2) != 0) {
                str2 = amountSelectionConfig.subtitle;
            }
            if ((i & 4) != 0) {
                money = amountSelectionConfig.initial_amount;
            }
            if ((i & 8) != 0) {
                list = amountSelectionConfig.amount_selection_presets;
            }
            if ((i & 16) != 0) {
                money2 = amountSelectionConfig.amount_custom_min;
            }
            if ((i & 32) != 0) {
                money3 = amountSelectionConfig.amount_custom_max;
            }
            if ((i & 64) != 0) {
                str3 = amountSelectionConfig.instrument_details;
            }
            if ((i & 128) != 0) {
                instrument = amountSelectionConfig.debit_card;
            }
            if ((i & 256) != 0) {
                byteString = amountSelectionConfig.unknownFields();
            }
            Instrument instrument2 = instrument;
            ByteString byteString2 = byteString;
            Money money4 = money3;
            String str4 = str3;
            Money money5 = money2;
            Money money6 = money;
            return amountSelectionConfig.copy(str, str2, money6, list, money5, money4, str4, instrument2, byteString2);
        }

        public final AmountSelectionConfig copy(String title, String subtitle, Money initial_amount, List<Money> amount_selection_presets, Money amount_custom_min, Money amount_custom_max, String instrument_details, Instrument debit_card, ByteString unknownFields) {
            amount_selection_presets.getClass();
            unknownFields.getClass();
            return new AmountSelectionConfig(title, subtitle, initial_amount, amount_selection_presets, amount_custom_min, amount_custom_max, instrument_details, debit_card, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AmountSelectionConfig)) {
                return false;
            }
            AmountSelectionConfig amountSelectionConfig = (AmountSelectionConfig) other;
            return Intrinsics.areEqual(unknownFields(), amountSelectionConfig.unknownFields()) && Intrinsics.areEqual(this.title, amountSelectionConfig.title) && Intrinsics.areEqual(this.subtitle, amountSelectionConfig.subtitle) && Intrinsics.areEqual(this.initial_amount, amountSelectionConfig.initial_amount) && Intrinsics.areEqual(this.amount_selection_presets, amountSelectionConfig.amount_selection_presets) && Intrinsics.areEqual(this.amount_custom_min, amountSelectionConfig.amount_custom_min) && Intrinsics.areEqual(this.amount_custom_max, amountSelectionConfig.amount_custom_max) && Intrinsics.areEqual(this.instrument_details, amountSelectionConfig.instrument_details) && Intrinsics.areEqual(this.debit_card, amountSelectionConfig.debit_card);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money = this.initial_amount;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (money != null ? money.hashCode() : 0)) * 37, 37, this.amount_selection_presets);
            Money money2 = this.amount_custom_min;
            int hashCode4 = (m + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.amount_custom_max;
            int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
            String str3 = this.instrument_details;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Instrument instrument = this.debit_card;
            int hashCode7 = hashCode6 + (instrument != null ? instrument.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.initial_amount = this.initial_amount;
            builder.amount_selection_presets = this.amount_selection_presets;
            builder.amount_custom_min = this.amount_custom_min;
            builder.amount_custom_max = this.amount_custom_max;
            builder.instrument_details = this.instrument_details;
            builder.debit_card = this.debit_card;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            Money money = this.initial_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("initial_amount=", money, arrayList);
            }
            if (!this.amount_selection_presets.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("amount_selection_presets=", arrayList, this.amount_selection_presets);
            }
            Money money2 = this.amount_custom_min;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount_custom_min=", money2, arrayList);
            }
            Money money3 = this.amount_custom_max;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount_custom_max=", money3, arrayList);
            }
            String str3 = this.instrument_details;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_details=", arrayList);
            }
            Instrument instrument = this.debit_card;
            if (instrument != null) {
                arrayList.add("debit_card=" + instrument);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AmountSelectionConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AmountSelectionConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AmountSelectionConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AmountSelectionConfig() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountSelectionConfig(String str, String str2, Money money, List<Money> list, Money money2, Money money3, String str3, Instrument instrument, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.initial_amount = money;
            this.amount_custom_min = money2;
            this.amount_custom_max = money3;
            this.instrument_details = str3;
            this.debit_card = instrument;
            this.amount_selection_presets = TransactorKt.immutableCopyOf("amount_selection_presets", list);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled$Builder;", "message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class BalanceBelowTargetWarningEnabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BalanceBelowTargetWarningEnabled> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String message;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "<init>", "()V", "message", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String message;

            @Override // com.squareup.wire.Message.Builder
            public BalanceBelowTargetWarningEnabled build() {
                return new BalanceBelowTargetWarningEnabled(this.message, buildUnknownFields());
            }

            public final Builder message(String message) {
                this.message = message;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalanceBelowTargetWarningEnabled.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.message);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.message) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled redact(BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled value) {
                    value.getClass();
                    return BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BalanceBasedAddCashPreferenceBlocker.BalanceBelowTargetWarningEnabled value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.message);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BalanceBelowTargetWarningEnabled(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BalanceBelowTargetWarningEnabled copy$default(BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = balanceBelowTargetWarningEnabled.message;
            }
            if ((i & 2) != 0) {
                byteString = balanceBelowTargetWarningEnabled.unknownFields();
            }
            return balanceBelowTargetWarningEnabled.copy(str, byteString);
        }

        public final BalanceBelowTargetWarningEnabled copy(String message, ByteString unknownFields) {
            unknownFields.getClass();
            return new BalanceBelowTargetWarningEnabled(message, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BalanceBelowTargetWarningEnabled)) {
                return false;
            }
            BalanceBelowTargetWarningEnabled balanceBelowTargetWarningEnabled = (BalanceBelowTargetWarningEnabled) other;
            return Intrinsics.areEqual(unknownFields(), balanceBelowTargetWarningEnabled.unknownFields()) && Intrinsics.areEqual(this.message, balanceBelowTargetWarningEnabled.message);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.message = this.message;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceBelowTargetWarningEnabled{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$BalanceBelowTargetWarningEnabled;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BalanceBelowTargetWarningEnabled build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BalanceBelowTargetWarningEnabled() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceBelowTargetWarningEnabled(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "", "<init>", "()V", "AutoOpenMinimumBalance", "AutoOpenIncrementConfig", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen$AutoOpenIncrementConfig;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen$AutoOpenMinimumBalance;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class AutoOpen {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "auto_open_increment_config", tag = 5)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen$AutoOpenIncrementConfig;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoOpenIncrementConfig extends AutoOpen {
            private final boolean value;

            public AutoOpenIncrementConfig(boolean z) {
                super(null);
                this.value = z;
            }

            public static /* synthetic */ AutoOpenIncrementConfig copy$default(AutoOpenIncrementConfig autoOpenIncrementConfig, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = autoOpenIncrementConfig.value;
                }
                return autoOpenIncrementConfig.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final AutoOpenIncrementConfig copy(boolean value) {
                return new AutoOpenIncrementConfig(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AutoOpenIncrementConfig) && this.value == ((AutoOpenIncrementConfig) other).value;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("AutoOpenIncrementConfig(value=", ")", this.value);
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "auto_open_minimum_balance", tag = 4)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen$AutoOpenMinimumBalance;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$AutoOpen;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoOpenMinimumBalance extends AutoOpen {
            private final boolean value;

            public AutoOpenMinimumBalance(boolean z) {
                super(null);
                this.value = z;
            }

            public static /* synthetic */ AutoOpenMinimumBalance copy$default(AutoOpenMinimumBalance autoOpenMinimumBalance, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = autoOpenMinimumBalance.value;
                }
                return autoOpenMinimumBalance.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final AutoOpenMinimumBalance copy(boolean value) {
                return new AutoOpenMinimumBalance(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AutoOpenMinimumBalance) && this.value == ((AutoOpenMinimumBalance) other).value;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("AutoOpenMinimumBalance(value=", ")", this.value);
            }
        }

        public /* synthetic */ AutoOpen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AutoOpen() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BalanceBasedAddCashPreferenceBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BalanceBasedAddCashPreferenceBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
