package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\t\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$Builder;", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "stock_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "multi_selection_parameters", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "Companion", "Builder", "MultiSelectionParameters", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvestmentEntitySelectionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntitySelectionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker$MultiSelectionParameters#ADAPTER", schemaIndex = 1, tag = 2)
    public final MultiSelectionParameters multi_selection_parameters;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.RoundUp$Screens$StockSelector#ADAPTER", schemaIndex = 0, tag = 1)
    public final RoundUp$Screens$StockSelector stock_selector_screen;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker;", "<init>", "()V", "stock_selector_screen", "Lcom/squareup/protos/franklin/blockers/RoundUp$Screens$StockSelector;", "multi_selection_parameters", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public MultiSelectionParameters multi_selection_parameters;
        public RoundUp$Screens$StockSelector stock_selector_screen;

        @Override // com.squareup.wire.Message.Builder
        public InvestmentEntitySelectionBlocker build() {
            return new InvestmentEntitySelectionBlocker(this.stock_selector_screen, this.multi_selection_parameters, buildUnknownFields());
        }

        public final Builder multi_selection_parameters(MultiSelectionParameters multi_selection_parameters) {
            this.multi_selection_parameters = multi_selection_parameters;
            return this;
        }

        public final Builder stock_selector_screen(RoundUp$Screens$StockSelector stock_selector_screen) {
            this.stock_selector_screen = stock_selector_screen;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0007H\u0016Ja\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$Builder;", "max_selections", "", "selected_investment_entity_tokens", "", "", "localized_confirm_cta_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "localized_cancel_cta_text", "localized_info_text", "zero_selection_behavior", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;Lokio/ByteString;)Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "Builder", "Companion", "ZeroSelectionBehavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MultiSelectionParameters extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MultiSelectionParameters> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString localized_cancel_cta_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString localized_confirm_cta_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalizedString localized_info_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 0, tag = 1)
        public final Integer max_selections;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<String> selected_investment_entity_tokens;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior#ADAPTER", schemaIndex = 5, tag = 6)
        public final ZeroSelectionBehavior zero_selection_behavior;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "<init>", "()V", "max_selections", "", "Ljava/lang/Integer;", "selected_investment_entity_tokens", "", "", "localized_confirm_cta_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "localized_cancel_cta_text", "localized_info_text", "zero_selection_behavior", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString localized_cancel_cta_text;
            public LocalizedString localized_confirm_cta_text;
            public LocalizedString localized_info_text;
            public Integer max_selections;
            public List<String> selected_investment_entity_tokens = EmptyList.INSTANCE;
            public ZeroSelectionBehavior zero_selection_behavior;

            @Override // com.squareup.wire.Message.Builder
            public MultiSelectionParameters build() {
                return new MultiSelectionParameters(this.max_selections, this.selected_investment_entity_tokens, this.localized_confirm_cta_text, this.localized_cancel_cta_text, this.localized_info_text, this.zero_selection_behavior, buildUnknownFields());
            }

            public final Builder localized_cancel_cta_text(LocalizedString localized_cancel_cta_text) {
                this.localized_cancel_cta_text = localized_cancel_cta_text;
                return this;
            }

            public final Builder localized_confirm_cta_text(LocalizedString localized_confirm_cta_text) {
                this.localized_confirm_cta_text = localized_confirm_cta_text;
                return this;
            }

            public final Builder localized_info_text(LocalizedString localized_info_text) {
                this.localized_info_text = localized_info_text;
                return this;
            }

            public final Builder max_selections(Integer max_selections) {
                this.max_selections = max_selections;
                return this;
            }

            public final Builder selected_investment_entity_tokens(List<String> selected_investment_entity_tokens) {
                selected_investment_entity_tokens.getClass();
                TransactorKt.checkElementsNotNull(selected_investment_entity_tokens);
                this.selected_investment_entity_tokens = selected_investment_entity_tokens;
                return this;
            }

            public final Builder zero_selection_behavior(ZeroSelectionBehavior zero_selection_behavior) {
                this.zero_selection_behavior = zero_selection_behavior;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MultiSelectionParameters.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker$MultiSelectionParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InvestmentEntitySelectionBlocker.MultiSelectionParameters decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InvestmentEntitySelectionBlocker.MultiSelectionParameters((Integer) obj, m, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 2:
                                m.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 3:
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                break;
                            case 4:
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                                break;
                            case 5:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                                break;
                            case 6:
                                try {
                                    obj5 = InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InvestmentEntitySelectionBlocker.MultiSelectionParameters value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.max_selections);
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.selected_investment_entity_tokens);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.localized_confirm_cta_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.localized_cancel_cta_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.localized_info_text);
                    InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.ADAPTER.encodeWithTag(writer, 6, value.zero_selection_behavior);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InvestmentEntitySelectionBlocker.MultiSelectionParameters value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.selected_investment_entity_tokens) + ProtoAdapter.UINT32.encodedSizeWithTag(1, value.max_selections) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.ADAPTER.encodedSizeWithTag(6, value.zero_selection_behavior) + protoAdapter2.encodedSizeWithTag(5, value.localized_info_text) + protoAdapter2.encodedSizeWithTag(4, value.localized_cancel_cta_text) + protoAdapter2.encodedSizeWithTag(3, value.localized_confirm_cta_text) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InvestmentEntitySelectionBlocker.MultiSelectionParameters redact(InvestmentEntitySelectionBlocker.MultiSelectionParameters value) {
                    value.getClass();
                    LocalizedString localizedString = value.localized_confirm_cta_text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.localized_cancel_cta_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    LocalizedString localizedString5 = value.localized_info_text;
                    return InvestmentEntitySelectionBlocker.MultiSelectionParameters.copy$default(value, null, null, localizedString2, localizedString4, localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null, null, ByteString.EMPTY, 35, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InvestmentEntitySelectionBlocker.MultiSelectionParameters value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.ADAPTER.encodeWithTag(writer, 6, value.zero_selection_behavior);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.localized_info_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.localized_cancel_cta_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.localized_confirm_cta_text);
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.selected_investment_entity_tokens);
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.max_selections);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public MultiSelectionParameters(Integer num, List list, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ZeroSelectionBehavior zeroSelectionBehavior, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : localizedString, (i & 8) != 0 ? null : localizedString2, (i & 16) != 0 ? null : localizedString3, (i & 32) != 0 ? null : zeroSelectionBehavior, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MultiSelectionParameters copy$default(MultiSelectionParameters multiSelectionParameters, Integer num, List list, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ZeroSelectionBehavior zeroSelectionBehavior, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = multiSelectionParameters.max_selections;
            }
            if ((i & 2) != 0) {
                list = multiSelectionParameters.selected_investment_entity_tokens;
            }
            if ((i & 4) != 0) {
                localizedString = multiSelectionParameters.localized_confirm_cta_text;
            }
            if ((i & 8) != 0) {
                localizedString2 = multiSelectionParameters.localized_cancel_cta_text;
            }
            if ((i & 16) != 0) {
                localizedString3 = multiSelectionParameters.localized_info_text;
            }
            if ((i & 32) != 0) {
                zeroSelectionBehavior = multiSelectionParameters.zero_selection_behavior;
            }
            if ((i & 64) != 0) {
                byteString = multiSelectionParameters.unknownFields();
            }
            ZeroSelectionBehavior zeroSelectionBehavior2 = zeroSelectionBehavior;
            ByteString byteString2 = byteString;
            LocalizedString localizedString4 = localizedString3;
            LocalizedString localizedString5 = localizedString;
            return multiSelectionParameters.copy(num, list, localizedString5, localizedString2, localizedString4, zeroSelectionBehavior2, byteString2);
        }

        public final MultiSelectionParameters copy(Integer max_selections, List<String> selected_investment_entity_tokens, LocalizedString localized_confirm_cta_text, LocalizedString localized_cancel_cta_text, LocalizedString localized_info_text, ZeroSelectionBehavior zero_selection_behavior, ByteString unknownFields) {
            selected_investment_entity_tokens.getClass();
            unknownFields.getClass();
            return new MultiSelectionParameters(max_selections, selected_investment_entity_tokens, localized_confirm_cta_text, localized_cancel_cta_text, localized_info_text, zero_selection_behavior, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MultiSelectionParameters)) {
                return false;
            }
            MultiSelectionParameters multiSelectionParameters = (MultiSelectionParameters) other;
            return Intrinsics.areEqual(unknownFields(), multiSelectionParameters.unknownFields()) && Intrinsics.areEqual(this.max_selections, multiSelectionParameters.max_selections) && Intrinsics.areEqual(this.selected_investment_entity_tokens, multiSelectionParameters.selected_investment_entity_tokens) && Intrinsics.areEqual(this.localized_confirm_cta_text, multiSelectionParameters.localized_confirm_cta_text) && Intrinsics.areEqual(this.localized_cancel_cta_text, multiSelectionParameters.localized_cancel_cta_text) && Intrinsics.areEqual(this.localized_info_text, multiSelectionParameters.localized_info_text) && this.zero_selection_behavior == multiSelectionParameters.zero_selection_behavior;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.max_selections;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.selected_investment_entity_tokens);
            LocalizedString localizedString = this.localized_confirm_cta_text;
            int hashCode2 = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_cancel_cta_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.localized_info_text;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            ZeroSelectionBehavior zeroSelectionBehavior = this.zero_selection_behavior;
            int hashCode5 = hashCode4 + (zeroSelectionBehavior != null ? zeroSelectionBehavior.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.max_selections = this.max_selections;
            builder.selected_investment_entity_tokens = this.selected_investment_entity_tokens;
            builder.localized_confirm_cta_text = this.localized_confirm_cta_text;
            builder.localized_cancel_cta_text = this.localized_cancel_cta_text;
            builder.localized_info_text = this.localized_info_text;
            builder.zero_selection_behavior = this.zero_selection_behavior;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.max_selections;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("max_selections=", num, arrayList);
            }
            if (!this.selected_investment_entity_tokens.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_investment_entity_tokens=", arrayList, this.selected_investment_entity_tokens);
            }
            LocalizedString localizedString = this.localized_confirm_cta_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_confirm_cta_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.localized_cancel_cta_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_cancel_cta_text=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.localized_info_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_info_text=", localizedString3, arrayList);
            }
            ZeroSelectionBehavior zeroSelectionBehavior = this.zero_selection_behavior;
            if (zeroSelectionBehavior != null) {
                arrayList.add("zero_selection_behavior=" + zeroSelectionBehavior);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MultiSelectionParameters{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ZERO_SELECTION_BEHAVIOR_DO_NOT_USE", "SHOW_CONFIRM_CTA_DISABLED", "SHOW_CANCEL_CTA", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ZeroSelectionBehavior implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ZeroSelectionBehavior[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final ZeroSelectionBehavior SHOW_CANCEL_CTA;
            public static final ZeroSelectionBehavior SHOW_CONFIRM_CTA_DISABLED;
            public static final ZeroSelectionBehavior ZERO_SELECTION_BEHAVIOR_DO_NOT_USE;
            private final int value;

            private static final /* synthetic */ ZeroSelectionBehavior[] $values() {
                return new ZeroSelectionBehavior[]{ZERO_SELECTION_BEHAVIOR_DO_NOT_USE, SHOW_CONFIRM_CTA_DISABLED, SHOW_CANCEL_CTA};
            }

            static {
                final ZeroSelectionBehavior zeroSelectionBehavior = new ZeroSelectionBehavior("ZERO_SELECTION_BEHAVIOR_DO_NOT_USE", 0, 0);
                ZERO_SELECTION_BEHAVIOR_DO_NOT_USE = zeroSelectionBehavior;
                SHOW_CONFIRM_CTA_DISABLED = new ZeroSelectionBehavior("SHOW_CONFIRM_CTA_DISABLED", 1, 1);
                SHOW_CANCEL_CTA = new ZeroSelectionBehavior("SHOW_CANCEL_CTA", 2, 2);
                ZeroSelectionBehavior[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ZeroSelectionBehavior.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, zeroSelectionBehavior) { // from class: com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior fromValue(int value) {
                        return InvestmentEntitySelectionBlocker.MultiSelectionParameters.ZeroSelectionBehavior.INSTANCE.fromValue(value);
                    }
                };
            }

            private ZeroSelectionBehavior(String str, int i, int i2) {
                this.value = i2;
            }

            public static final ZeroSelectionBehavior fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static ZeroSelectionBehavior valueOf(String str) {
                return (ZeroSelectionBehavior) Enum.valueOf(ZeroSelectionBehavior.class, str);
            }

            public static ZeroSelectionBehavior[] values() {
                return (ZeroSelectionBehavior[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$ZeroSelectionBehavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ZeroSelectionBehavior fromValue(int value) {
                    if (value == 0) {
                        return ZeroSelectionBehavior.ZERO_SELECTION_BEHAVIOR_DO_NOT_USE;
                    }
                    if (value == 1) {
                        return ZeroSelectionBehavior.SHOW_CONFIRM_CTA_DISABLED;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return ZeroSelectionBehavior.SHOW_CANCEL_CTA;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$MultiSelectionParameters;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MultiSelectionParameters build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public MultiSelectionParameters() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiSelectionParameters(Integer num, List<String> list, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ZeroSelectionBehavior zeroSelectionBehavior, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.max_selections = num;
            this.localized_confirm_cta_text = localizedString;
            this.localized_cancel_cta_text = localizedString2;
            this.localized_info_text = localizedString3;
            this.zero_selection_behavior = zeroSelectionBehavior;
            this.selected_investment_entity_tokens = TransactorKt.immutableCopyOf("selected_investment_entity_tokens", list);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvestmentEntitySelectionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentEntitySelectionBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InvestmentEntitySelectionBlocker((RoundUp$Screens$StockSelector) obj, (InvestmentEntitySelectionBlocker.MultiSelectionParameters) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RoundUp$Screens$StockSelector.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(InvestmentEntitySelectionBlocker.MultiSelectionParameters.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentEntitySelectionBlocker value) {
                writer.getClass();
                value.getClass();
                RoundUp$Screens$StockSelector.ADAPTER.encodeWithTag(writer, 1, value.stock_selector_screen);
                InvestmentEntitySelectionBlocker.MultiSelectionParameters.ADAPTER.encodeWithTag(writer, 2, value.multi_selection_parameters);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentEntitySelectionBlocker value) {
                value.getClass();
                return InvestmentEntitySelectionBlocker.MultiSelectionParameters.ADAPTER.encodedSizeWithTag(2, value.multi_selection_parameters) + RoundUp$Screens$StockSelector.ADAPTER.encodedSizeWithTag(1, value.stock_selector_screen) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentEntitySelectionBlocker redact(InvestmentEntitySelectionBlocker value) {
                value.getClass();
                RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = value.stock_selector_screen;
                RoundUp$Screens$StockSelector roundUp$Screens$StockSelector2 = roundUp$Screens$StockSelector != null ? (RoundUp$Screens$StockSelector) RoundUp$Screens$StockSelector.ADAPTER.redact(roundUp$Screens$StockSelector) : null;
                InvestmentEntitySelectionBlocker.MultiSelectionParameters multiSelectionParameters = value.multi_selection_parameters;
                InvestmentEntitySelectionBlocker.MultiSelectionParameters multiSelectionParameters2 = multiSelectionParameters != null ? (InvestmentEntitySelectionBlocker.MultiSelectionParameters) InvestmentEntitySelectionBlocker.MultiSelectionParameters.ADAPTER.redact(multiSelectionParameters) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new InvestmentEntitySelectionBlocker(roundUp$Screens$StockSelector2, multiSelectionParameters2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentEntitySelectionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InvestmentEntitySelectionBlocker.MultiSelectionParameters.ADAPTER.encodeWithTag(writer, 2, value.multi_selection_parameters);
                RoundUp$Screens$StockSelector.ADAPTER.encodeWithTag(writer, 1, value.stock_selector_screen);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntitySelectionBlocker(RoundUp$Screens$StockSelector roundUp$Screens$StockSelector, MultiSelectionParameters multiSelectionParameters, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.stock_selector_screen = roundUp$Screens$StockSelector;
        this.multi_selection_parameters = multiSelectionParameters;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntitySelectionBlocker)) {
            return false;
        }
        InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker = (InvestmentEntitySelectionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntitySelectionBlocker.unknownFields()) && Intrinsics.areEqual(this.stock_selector_screen, investmentEntitySelectionBlocker.stock_selector_screen) && Intrinsics.areEqual(this.multi_selection_parameters, investmentEntitySelectionBlocker.multi_selection_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = this.stock_selector_screen;
        int hashCode2 = (hashCode + (roundUp$Screens$StockSelector != null ? roundUp$Screens$StockSelector.hashCode() : 0)) * 37;
        MultiSelectionParameters multiSelectionParameters = this.multi_selection_parameters;
        int hashCode3 = hashCode2 + (multiSelectionParameters != null ? multiSelectionParameters.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.stock_selector_screen = this.stock_selector_screen;
        builder.multi_selection_parameters = this.multi_selection_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = this.stock_selector_screen;
        if (roundUp$Screens$StockSelector != null) {
            arrayList.add("stock_selector_screen=" + roundUp$Screens$StockSelector);
        }
        MultiSelectionParameters multiSelectionParameters = this.multi_selection_parameters;
        if (multiSelectionParameters != null) {
            arrayList.add("multi_selection_parameters=" + multiSelectionParameters);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntitySelectionBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InvestmentEntitySelectionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InvestmentEntitySelectionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
