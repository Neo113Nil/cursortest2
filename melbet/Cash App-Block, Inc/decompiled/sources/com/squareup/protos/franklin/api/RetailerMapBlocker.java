package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0015\u0014\u0016\u0017\u0018\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "explainer_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "getExplainer_screen$annotations", "()V", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "map_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "search_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "benefit_explainer_screen", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "benefit_reinforcement_message", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "Companion", "Builder", "ExplainerScreen", "MapScreen", "SearchScreen", "BenefitReinforcementMessage", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetailerMapBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetailerMapBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.bankingbenefits.ui.BenefitExplainerScreen#ADAPTER", schemaIndex = 3, tag = 4)
    public final BenefitExplainerScreen benefit_explainer_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$BenefitReinforcementMessage#ADAPTER", schemaIndex = 4, tag = 5)
    public final BenefitReinforcementMessage benefit_reinforcement_message;

    @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen#ADAPTER", schemaIndex = 0, tag = 1)
    public final ExplainerScreen explainer_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$MapScreen#ADAPTER", schemaIndex = 1, tag = 2)
    public final MapScreen map_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$SearchScreen#ADAPTER", schemaIndex = 2, tag = 3)
    public final SearchScreen search_screen;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker;", "<init>", "()V", "explainer_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "map_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "search_screen", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "benefit_explainer_screen", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen;", "benefit_reinforcement_message", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public BenefitExplainerScreen benefit_explainer_screen;
        public BenefitReinforcementMessage benefit_reinforcement_message;
        public ExplainerScreen explainer_screen;
        public MapScreen map_screen;
        public SearchScreen search_screen;

        public final Builder benefit_explainer_screen(BenefitExplainerScreen benefit_explainer_screen) {
            this.benefit_explainer_screen = benefit_explainer_screen;
            return this;
        }

        public final Builder benefit_reinforcement_message(BenefitReinforcementMessage benefit_reinforcement_message) {
            this.benefit_reinforcement_message = benefit_reinforcement_message;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public RetailerMapBlocker build() {
            return new RetailerMapBlocker(this.explainer_screen, this.map_screen, this.search_screen, this.benefit_explainer_screen, this.benefit_reinforcement_message, buildUnknownFields());
        }

        @Deprecated
        public final Builder explainer_screen(ExplainerScreen explainer_screen) {
            this.explainer_screen = explainer_screen;
            return this;
        }

        public final Builder map_screen(MapScreen map_screen) {
            this.map_screen = map_screen;
            return this;
        }

        public final Builder search_screen(SearchScreen search_screen) {
            this.search_screen = search_screen;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fBa\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\tH\u0016J`\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Builder;", "benefits", "", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "limits", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "header_title", "", "help_button_text", "help_button_action", "header_image", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "HeaderImage", "Benefit", "Limit", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ExplainerScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ExplainerScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$Benefit#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Benefit> benefits;

        @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$HeaderImage#ADAPTER", schemaIndex = 5, tag = 6)
        public final HeaderImage header_image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String header_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String help_button_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String help_button_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$Limit#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<Limit> limits;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "<init>", "()V", "benefits", "", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "limits", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "header_title", "", "help_button_text", "help_button_action", "header_image", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Benefit> benefits;
            public HeaderImage header_image;
            public String header_title;
            public String help_button_action;
            public String help_button_text;
            public List<Limit> limits;

            public Builder() {
                EmptyList emptyList = EmptyList.INSTANCE;
                this.benefits = emptyList;
                this.limits = emptyList;
            }

            public final Builder benefits(List<Benefit> benefits) {
                benefits.getClass();
                TransactorKt.checkElementsNotNull(benefits);
                this.benefits = benefits;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ExplainerScreen build() {
                return new ExplainerScreen(this.benefits, this.limits, this.header_title, this.help_button_text, this.help_button_action, this.header_image, buildUnknownFields());
            }

            public final Builder header_image(HeaderImage header_image) {
                this.header_image = header_image;
                return this;
            }

            public final Builder header_title(String header_title) {
                this.header_title = header_title;
                return this;
            }

            public final Builder help_button_action(String help_button_action) {
                this.help_button_action = help_button_action;
                return this;
            }

            public final Builder help_button_text(String help_button_text) {
                this.help_button_text = help_button_text;
                return this;
            }

            public final Builder limits(List<Limit> limits) {
                limits.getClass();
                TransactorKt.checkElementsNotNull(limits);
                this.limits = limits;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExplainerScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.ExplainerScreen decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RetailerMapBlocker.ExplainerScreen(m, arrayList, (String) obj, (String) obj2, (String) obj3, (RetailerMapBlocker.ExplainerScreen.HeaderImage) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                m.add(RetailerMapBlocker.ExplainerScreen.Benefit.ADAPTER.decode(reader));
                                break;
                            case 2:
                                arrayList.add(RetailerMapBlocker.ExplainerScreen.Limit.ADAPTER.decode(reader));
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    obj4 = RetailerMapBlocker.ExplainerScreen.HeaderImage.ADAPTER.decode(reader);
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
                public void encode(ProtoWriter writer, RetailerMapBlocker.ExplainerScreen value) {
                    writer.getClass();
                    value.getClass();
                    RetailerMapBlocker.ExplainerScreen.Benefit.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.benefits);
                    RetailerMapBlocker.ExplainerScreen.Limit.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.limits);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.header_title);
                    protoAdapter2.encodeWithTag(writer, 4, value.help_button_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.help_button_action);
                    RetailerMapBlocker.ExplainerScreen.HeaderImage.ADAPTER.encodeWithTag(writer, 6, value.header_image);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RetailerMapBlocker.ExplainerScreen value) {
                    value.getClass();
                    int encodedSizeWithTag = RetailerMapBlocker.ExplainerScreen.Limit.ADAPTER.asRepeated().encodedSizeWithTag(2, value.limits) + RetailerMapBlocker.ExplainerScreen.Benefit.ADAPTER.asRepeated().encodedSizeWithTag(1, value.benefits) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return RetailerMapBlocker.ExplainerScreen.HeaderImage.ADAPTER.encodedSizeWithTag(6, value.header_image) + protoAdapter2.encodedSizeWithTag(5, value.help_button_action) + protoAdapter2.encodedSizeWithTag(4, value.help_button_text) + protoAdapter2.encodedSizeWithTag(3, value.header_title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.ExplainerScreen redact(RetailerMapBlocker.ExplainerScreen value) {
                    value.getClass();
                    return RetailerMapBlocker.ExplainerScreen.copy$default(value, TransactorKt.m1169redactElements(value.benefits, RetailerMapBlocker.ExplainerScreen.Benefit.ADAPTER), TransactorKt.m1169redactElements(value.limits, RetailerMapBlocker.ExplainerScreen.Limit.ADAPTER), null, null, null, null, ByteString.EMPTY, 60, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RetailerMapBlocker.ExplainerScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    RetailerMapBlocker.ExplainerScreen.HeaderImage.ADAPTER.encodeWithTag(writer, 6, value.header_image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.help_button_action);
                    protoAdapter2.encodeWithTag(writer, 4, value.help_button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.header_title);
                    RetailerMapBlocker.ExplainerScreen.Limit.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.limits);
                    RetailerMapBlocker.ExplainerScreen.Benefit.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.benefits);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public ExplainerScreen(List list, List list2, String str, String str2, String str3, HeaderImage headerImage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? EmptyList.INSTANCE : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : headerImage, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ExplainerScreen copy$default(ExplainerScreen explainerScreen, List list, List list2, String str, String str2, String str3, HeaderImage headerImage, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = explainerScreen.benefits;
            }
            if ((i & 2) != 0) {
                list2 = explainerScreen.limits;
            }
            if ((i & 4) != 0) {
                str = explainerScreen.header_title;
            }
            if ((i & 8) != 0) {
                str2 = explainerScreen.help_button_text;
            }
            if ((i & 16) != 0) {
                str3 = explainerScreen.help_button_action;
            }
            if ((i & 32) != 0) {
                headerImage = explainerScreen.header_image;
            }
            if ((i & 64) != 0) {
                byteString = explainerScreen.unknownFields();
            }
            HeaderImage headerImage2 = headerImage;
            ByteString byteString2 = byteString;
            String str4 = str3;
            String str5 = str;
            return explainerScreen.copy(list, list2, str5, str2, str4, headerImage2, byteString2);
        }

        public final ExplainerScreen copy(List<Benefit> benefits, List<Limit> limits, String header_title, String help_button_text, String help_button_action, HeaderImage header_image, ByteString unknownFields) {
            benefits.getClass();
            limits.getClass();
            unknownFields.getClass();
            return new ExplainerScreen(benefits, limits, header_title, help_button_text, help_button_action, header_image, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ExplainerScreen)) {
                return false;
            }
            ExplainerScreen explainerScreen = (ExplainerScreen) other;
            return Intrinsics.areEqual(unknownFields(), explainerScreen.unknownFields()) && Intrinsics.areEqual(this.benefits, explainerScreen.benefits) && Intrinsics.areEqual(this.limits, explainerScreen.limits) && Intrinsics.areEqual(this.header_title, explainerScreen.header_title) && Intrinsics.areEqual(this.help_button_text, explainerScreen.help_button_text) && Intrinsics.areEqual(this.help_button_action, explainerScreen.help_button_action) && this.header_image == explainerScreen.header_image;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.benefits), 37, this.limits);
            String str = this.header_title;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.help_button_text;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.help_button_action;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
            HeaderImage headerImage = this.header_image;
            int hashCode4 = hashCode3 + (headerImage != null ? headerImage.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.benefits = this.benefits;
            builder.limits = this.limits;
            builder.header_title = this.header_title;
            builder.help_button_text = this.help_button_text;
            builder.help_button_action = this.help_button_action;
            builder.header_image = this.header_image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.benefits.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("benefits=", arrayList, this.benefits);
            }
            if (!this.limits.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("limits=", arrayList, this.limits);
            }
            String str = this.header_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_title=", arrayList);
            }
            String str2 = this.help_button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "help_button_text=", arrayList);
            }
            String str3 = this.help_button_action;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "help_button_action=", arrayList);
            }
            HeaderImage headerImage = this.header_image;
            if (headerImage != null) {
                arrayList.add("header_image=" + headerImage);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ExplainerScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0014\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0085\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0015¨\u0006\""}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit$Builder;", "button_name", "", "button_client_route", "description", "description_items", "", "enabled", "", "name", "remaining_benefit_text", "highlighted_info_text", "image_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "getRemaining_benefit_text$annotations", "()V", "getDescription_items$annotations", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Benefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Benefit> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String button_client_route;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String button_name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String description;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
            public final List<String> description_items;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
            public final Boolean enabled;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
            public final String highlighted_info_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
            public final String image_url;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
            public final String name;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
            public final Boolean remaining_benefit_text;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "<init>", "()V", "button_name", "", "button_client_route", "description", "description_items", "", "enabled", "", "Ljava/lang/Boolean;", "name", "remaining_benefit_text", "highlighted_info_text", "image_url", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String button_client_route;
                public String button_name;
                public String description;
                public List<String> description_items = EmptyList.INSTANCE;
                public Boolean enabled;
                public String highlighted_info_text;
                public String image_url;
                public String name;
                public Boolean remaining_benefit_text;

                @Override // com.squareup.wire.Message.Builder
                public Benefit build() {
                    return new Benefit(this.button_name, this.button_client_route, this.description, this.description_items, this.enabled, this.name, this.remaining_benefit_text, this.highlighted_info_text, this.image_url, buildUnknownFields());
                }

                public final Builder button_client_route(String button_client_route) {
                    this.button_client_route = button_client_route;
                    return this;
                }

                public final Builder button_name(String button_name) {
                    this.button_name = button_name;
                    return this;
                }

                public final Builder description(String description) {
                    this.description = description;
                    return this;
                }

                @Deprecated
                public final Builder description_items(List<String> description_items) {
                    description_items.getClass();
                    TransactorKt.checkElementsNotNull(description_items);
                    this.description_items = description_items;
                    return this;
                }

                public final Builder enabled(Boolean enabled) {
                    this.enabled = enabled;
                    return this;
                }

                public final Builder highlighted_info_text(String highlighted_info_text) {
                    this.highlighted_info_text = highlighted_info_text;
                    return this;
                }

                public final Builder image_url(String image_url) {
                    this.image_url = image_url;
                    return this;
                }

                public final Builder name(String name) {
                    this.name = name;
                    return this;
                }

                @Deprecated
                public final Builder remaining_benefit_text(Boolean remaining_benefit_text) {
                    this.remaining_benefit_text = remaining_benefit_text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Benefit.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$Benefit$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public RetailerMapBlocker.ExplainerScreen.Benefit decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                                return new RetailerMapBlocker.ExplainerScreen.Benefit((String) obj, (String) obj2, (String) obj3, m, (Boolean) obj4, (String) obj5, (Boolean) obj6, (String) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    obj = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    obj2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    obj3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    m.add(ProtoAdapter.STRING.decode(reader));
                                    break;
                                case 5:
                                    obj4 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 6:
                                    obj5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    obj6 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 8:
                                    obj7 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    obj8 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RetailerMapBlocker.ExplainerScreen.Benefit value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.button_name);
                        protoAdapter2.encodeWithTag(writer, 2, value.button_client_route);
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        protoAdapter2.asRepeated().encodeWithTag(writer, 4, value.description_items);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                        protoAdapter3.encodeWithTag(writer, 5, value.enabled);
                        protoAdapter2.encodeWithTag(writer, 6, value.name);
                        protoAdapter3.encodeWithTag(writer, 7, value.remaining_benefit_text);
                        protoAdapter2.encodeWithTag(writer, 8, value.highlighted_info_text);
                        protoAdapter2.encodeWithTag(writer, 9, value.image_url);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RetailerMapBlocker.ExplainerScreen.Benefit value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter2.asRepeated().encodedSizeWithTag(4, value.description_items) + protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.button_client_route) + protoAdapter2.encodedSizeWithTag(1, value.button_name) + size$okio;
                        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                        return protoAdapter2.encodedSizeWithTag(9, value.image_url) + protoAdapter2.encodedSizeWithTag(8, value.highlighted_info_text) + protoAdapter3.encodedSizeWithTag(7, value.remaining_benefit_text) + protoAdapter2.encodedSizeWithTag(6, value.name) + protoAdapter3.encodedSizeWithTag(5, value.enabled) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RetailerMapBlocker.ExplainerScreen.Benefit redact(RetailerMapBlocker.ExplainerScreen.Benefit value) {
                        value.getClass();
                        return RetailerMapBlocker.ExplainerScreen.Benefit.copy$default(value, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RetailerMapBlocker.ExplainerScreen.Benefit value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 9, value.image_url);
                        protoAdapter2.encodeWithTag(writer, 8, value.highlighted_info_text);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                        protoAdapter3.encodeWithTag(writer, 7, value.remaining_benefit_text);
                        protoAdapter2.encodeWithTag(writer, 6, value.name);
                        protoAdapter3.encodeWithTag(writer, 5, value.enabled);
                        protoAdapter2.asRepeated().encodeWithTag(writer, 4, value.description_items);
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        protoAdapter2.encodeWithTag(writer, 2, value.button_client_route);
                        protoAdapter2.encodeWithTag(writer, 1, value.button_name);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public Benefit(String str, String str2, String str3, List list, Boolean bool, String str4, Boolean bool2, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, String str3, List list, Boolean bool, String str4, Boolean bool2, String str5, String str6, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = benefit.button_name;
                }
                if ((i & 2) != 0) {
                    str2 = benefit.button_client_route;
                }
                if ((i & 4) != 0) {
                    str3 = benefit.description;
                }
                if ((i & 8) != 0) {
                    list = benefit.description_items;
                }
                if ((i & 16) != 0) {
                    bool = benefit.enabled;
                }
                if ((i & 32) != 0) {
                    str4 = benefit.name;
                }
                if ((i & 64) != 0) {
                    bool2 = benefit.remaining_benefit_text;
                }
                if ((i & 128) != 0) {
                    str5 = benefit.highlighted_info_text;
                }
                if ((i & 256) != 0) {
                    str6 = benefit.image_url;
                }
                if ((i & 512) != 0) {
                    byteString = benefit.unknownFields();
                }
                String str7 = str6;
                ByteString byteString2 = byteString;
                Boolean bool3 = bool2;
                String str8 = str5;
                Boolean bool4 = bool;
                String str9 = str4;
                return benefit.copy(str, str2, str3, list, bool4, str9, bool3, str8, str7, byteString2);
            }

            @Deprecated
            public static /* synthetic */ void getDescription_items$annotations() {
            }

            @Deprecated
            public static /* synthetic */ void getRemaining_benefit_text$annotations() {
            }

            public final Benefit copy(String button_name, String button_client_route, String description, List<String> description_items, Boolean enabled, String name, Boolean remaining_benefit_text, String highlighted_info_text, String image_url, ByteString unknownFields) {
                description_items.getClass();
                unknownFields.getClass();
                return new Benefit(button_name, button_client_route, description, description_items, enabled, name, remaining_benefit_text, highlighted_info_text, image_url, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Benefit)) {
                    return false;
                }
                Benefit benefit = (Benefit) other;
                return Intrinsics.areEqual(unknownFields(), benefit.unknownFields()) && Intrinsics.areEqual(this.button_name, benefit.button_name) && Intrinsics.areEqual(this.button_client_route, benefit.button_client_route) && Intrinsics.areEqual(this.description, benefit.description) && Intrinsics.areEqual(this.description_items, benefit.description_items) && Intrinsics.areEqual(this.enabled, benefit.enabled) && Intrinsics.areEqual(this.name, benefit.name) && Intrinsics.areEqual(this.remaining_benefit_text, benefit.remaining_benefit_text) && Intrinsics.areEqual(this.highlighted_info_text, benefit.highlighted_info_text) && Intrinsics.areEqual(this.image_url, benefit.image_url);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.button_name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.button_client_route;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.description;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.description_items);
                Boolean bool = this.enabled;
                int hashCode4 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str4 = this.name;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                Boolean bool2 = this.remaining_benefit_text;
                int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
                String str5 = this.highlighted_info_text;
                int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
                String str6 = this.image_url;
                int hashCode8 = hashCode7 + (str6 != null ? str6.hashCode() : 0);
                this.hashCode = hashCode8;
                return hashCode8;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.button_name = this.button_name;
                builder.button_client_route = this.button_client_route;
                builder.description = this.description;
                builder.description_items = this.description_items;
                builder.enabled = this.enabled;
                builder.name = this.name;
                builder.remaining_benefit_text = this.remaining_benefit_text;
                builder.highlighted_info_text = this.highlighted_info_text;
                builder.image_url = this.image_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.button_name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_name=", arrayList);
                }
                String str2 = this.button_client_route;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "button_client_route=", arrayList);
                }
                String str3 = this.description;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "description=", arrayList);
                }
                if (!this.description_items.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("description_items=", arrayList, this.description_items);
                }
                Boolean bool = this.enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
                }
                String str4 = this.name;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "name=", arrayList);
                }
                Boolean bool2 = this.remaining_benefit_text;
                if (bool2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("remaining_benefit_text=", bool2, arrayList);
                }
                String str5 = this.highlighted_info_text;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "highlighted_info_text=", arrayList);
                }
                String str6 = this.image_url;
                if (str6 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "image_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Benefit{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Benefit;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Benefit build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Benefit() {
                this(null, null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Benefit(String str, String str2, String str3, List<String> list, Boolean bool, String str4, Boolean bool2, String str5, String str6, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.button_name = str;
                this.button_client_route = str2;
                this.description = str3;
                this.enabled = bool;
                this.name = str4;
                this.remaining_benefit_text = bool2;
                this.highlighted_info_text = str5;
                this.image_url = str6;
                this.description_items = TransactorKt.immutableCopyOf("description_items", list);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GENERIC", "PRIMARY_BANKING_ACTIVE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HeaderImage implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ HeaderImage[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final HeaderImage GENERIC = new HeaderImage("GENERIC", 0, 1);
            public static final HeaderImage PRIMARY_BANKING_ACTIVE = new HeaderImage("PRIMARY_BANKING_ACTIVE", 1, 2);
            private final int value;

            private static final /* synthetic */ HeaderImage[] $values() {
                return new HeaderImage[]{GENERIC, PRIMARY_BANKING_ACTIVE};
            }

            static {
                HeaderImage[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeaderImage.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$HeaderImage$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public RetailerMapBlocker.ExplainerScreen.HeaderImage fromValue(int value) {
                        return RetailerMapBlocker.ExplainerScreen.HeaderImage.INSTANCE.fromValue(value);
                    }
                };
            }

            private HeaderImage(String str, int i, int i2) {
                this.value = i2;
            }

            public static final HeaderImage fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static HeaderImage valueOf(String str) {
                return (HeaderImage) Enum.valueOf(HeaderImage.class, str);
            }

            public static HeaderImage[] values() {
                return (HeaderImage[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$HeaderImage;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final HeaderImage fromValue(int value) {
                    if (value == 1) {
                        return HeaderImage.GENERIC;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return HeaderImage.PRIMARY_BANKING_ACTIVE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit$Builder;", "key", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Limit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Limit> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String key;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String value;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "<init>", "()V", "key", "", "value", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String key;
                public String value;

                @Override // com.squareup.wire.Message.Builder
                public Limit build() {
                    return new Limit(this.key, this.value, buildUnknownFields());
                }

                public final Builder key(String key) {
                    this.key = key;
                    return this;
                }

                public final Builder value(String value) {
                    this.value = value;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Limit.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$ExplainerScreen$Limit$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public RetailerMapBlocker.ExplainerScreen.Limit decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new RetailerMapBlocker.ExplainerScreen.Limit((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RetailerMapBlocker.ExplainerScreen.Limit value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.key);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RetailerMapBlocker.ExplainerScreen.Limit value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.key) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RetailerMapBlocker.ExplainerScreen.Limit redact(RetailerMapBlocker.ExplainerScreen.Limit value) {
                        value.getClass();
                        return RetailerMapBlocker.ExplainerScreen.Limit.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RetailerMapBlocker.ExplainerScreen.Limit value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        protoAdapter2.encodeWithTag(writer, 1, value.key);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Limit(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Limit copy$default(Limit limit, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = limit.key;
                }
                if ((i & 2) != 0) {
                    str2 = limit.value;
                }
                if ((i & 4) != 0) {
                    byteString = limit.unknownFields();
                }
                return limit.copy(str, str2, byteString);
            }

            public final Limit copy(String key, String value, ByteString unknownFields) {
                unknownFields.getClass();
                return new Limit(key, value, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Limit)) {
                    return false;
                }
                Limit limit = (Limit) other;
                return Intrinsics.areEqual(unknownFields(), limit.unknownFields()) && Intrinsics.areEqual(this.key, limit.key) && Intrinsics.areEqual(this.value, limit.value);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.key;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.value;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.key = this.key;
                builder.value = this.value;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.key;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
                }
                String str2 = this.value;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Limit{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Limit;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Limit build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Limit() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Limit(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.key = str;
                this.value = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$ExplainerScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ExplainerScreen build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExplainerScreen(List<Benefit> list, List<Limit> list2, String str, String str2, String str3, HeaderImage headerImage, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.header_title = str;
            this.help_button_text = str2;
            this.help_button_action = str3;
            this.header_image = headerImage;
            this.benefits = TransactorKt.immutableCopyOf("benefits", list);
            this.limits = TransactorKt.immutableCopyOf("limits", list2);
        }

        public ExplainerScreen() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RetailerMapBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RetailerMapBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RetailerMapBlocker((RetailerMapBlocker.ExplainerScreen) obj, (RetailerMapBlocker.MapScreen) obj2, (RetailerMapBlocker.SearchScreen) obj3, (BenefitExplainerScreen) obj4, (RetailerMapBlocker.BenefitReinforcementMessage) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RetailerMapBlocker.ExplainerScreen.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(RetailerMapBlocker.MapScreen.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RetailerMapBlocker.SearchScreen.ADAPTER, reader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(BenefitExplainerScreen.ADAPTER, reader, obj4);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(RetailerMapBlocker.BenefitReinforcementMessage.ADAPTER, reader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RetailerMapBlocker value) {
                writer.getClass();
                value.getClass();
                RetailerMapBlocker.ExplainerScreen.ADAPTER.encodeWithTag(writer, 1, value.explainer_screen);
                RetailerMapBlocker.MapScreen.ADAPTER.encodeWithTag(writer, 2, value.map_screen);
                RetailerMapBlocker.SearchScreen.ADAPTER.encodeWithTag(writer, 3, value.search_screen);
                BenefitExplainerScreen.ADAPTER.encodeWithTag(writer, 4, value.benefit_explainer_screen);
                RetailerMapBlocker.BenefitReinforcementMessage.ADAPTER.encodeWithTag(writer, 5, value.benefit_reinforcement_message);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RetailerMapBlocker value) {
                value.getClass();
                return RetailerMapBlocker.BenefitReinforcementMessage.ADAPTER.encodedSizeWithTag(5, value.benefit_reinforcement_message) + BenefitExplainerScreen.ADAPTER.encodedSizeWithTag(4, value.benefit_explainer_screen) + RetailerMapBlocker.SearchScreen.ADAPTER.encodedSizeWithTag(3, value.search_screen) + RetailerMapBlocker.MapScreen.ADAPTER.encodedSizeWithTag(2, value.map_screen) + RetailerMapBlocker.ExplainerScreen.ADAPTER.encodedSizeWithTag(1, value.explainer_screen) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RetailerMapBlocker redact(RetailerMapBlocker value) {
                value.getClass();
                RetailerMapBlocker.ExplainerScreen explainerScreen = value.explainer_screen;
                RetailerMapBlocker.ExplainerScreen explainerScreen2 = explainerScreen != null ? (RetailerMapBlocker.ExplainerScreen) RetailerMapBlocker.ExplainerScreen.ADAPTER.redact(explainerScreen) : null;
                RetailerMapBlocker.MapScreen mapScreen = value.map_screen;
                RetailerMapBlocker.MapScreen mapScreen2 = mapScreen != null ? (RetailerMapBlocker.MapScreen) RetailerMapBlocker.MapScreen.ADAPTER.redact(mapScreen) : null;
                RetailerMapBlocker.SearchScreen searchScreen = value.search_screen;
                RetailerMapBlocker.SearchScreen searchScreen2 = searchScreen != null ? (RetailerMapBlocker.SearchScreen) RetailerMapBlocker.SearchScreen.ADAPTER.redact(searchScreen) : null;
                BenefitExplainerScreen benefitExplainerScreen = value.benefit_explainer_screen;
                BenefitExplainerScreen benefitExplainerScreen2 = benefitExplainerScreen != null ? (BenefitExplainerScreen) BenefitExplainerScreen.ADAPTER.redact(benefitExplainerScreen) : null;
                RetailerMapBlocker.BenefitReinforcementMessage benefitReinforcementMessage = value.benefit_reinforcement_message;
                RetailerMapBlocker.BenefitReinforcementMessage benefitReinforcementMessage2 = benefitReinforcementMessage != null ? (RetailerMapBlocker.BenefitReinforcementMessage) RetailerMapBlocker.BenefitReinforcementMessage.ADAPTER.redact(benefitReinforcementMessage) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RetailerMapBlocker(explainerScreen2, mapScreen2, searchScreen2, benefitExplainerScreen2, benefitReinforcementMessage2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RetailerMapBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                RetailerMapBlocker.BenefitReinforcementMessage.ADAPTER.encodeWithTag(writer, 5, value.benefit_reinforcement_message);
                BenefitExplainerScreen.ADAPTER.encodeWithTag(writer, 4, value.benefit_explainer_screen);
                RetailerMapBlocker.SearchScreen.ADAPTER.encodeWithTag(writer, 3, value.search_screen);
                RetailerMapBlocker.MapScreen.ADAPTER.encodeWithTag(writer, 2, value.map_screen);
                RetailerMapBlocker.ExplainerScreen.ADAPTER.encodeWithTag(writer, 1, value.explainer_screen);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetailerMapBlocker(ExplainerScreen explainerScreen, MapScreen mapScreen, SearchScreen searchScreen, BenefitExplainerScreen benefitExplainerScreen, BenefitReinforcementMessage benefitReinforcementMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.explainer_screen = explainerScreen;
        this.map_screen = mapScreen;
        this.search_screen = searchScreen;
        this.benefit_explainer_screen = benefitExplainerScreen;
        this.benefit_reinforcement_message = benefitReinforcementMessage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetailerMapBlocker)) {
            return false;
        }
        RetailerMapBlocker retailerMapBlocker = (RetailerMapBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), retailerMapBlocker.unknownFields()) && Intrinsics.areEqual(this.explainer_screen, retailerMapBlocker.explainer_screen) && Intrinsics.areEqual(this.map_screen, retailerMapBlocker.map_screen) && Intrinsics.areEqual(this.search_screen, retailerMapBlocker.search_screen) && Intrinsics.areEqual(this.benefit_explainer_screen, retailerMapBlocker.benefit_explainer_screen) && Intrinsics.areEqual(this.benefit_reinforcement_message, retailerMapBlocker.benefit_reinforcement_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ExplainerScreen explainerScreen = this.explainer_screen;
        int hashCode2 = (hashCode + (explainerScreen != null ? explainerScreen.hashCode() : 0)) * 37;
        MapScreen mapScreen = this.map_screen;
        int hashCode3 = (hashCode2 + (mapScreen != null ? mapScreen.hashCode() : 0)) * 37;
        SearchScreen searchScreen = this.search_screen;
        int hashCode4 = (hashCode3 + (searchScreen != null ? searchScreen.hashCode() : 0)) * 37;
        BenefitExplainerScreen benefitExplainerScreen = this.benefit_explainer_screen;
        int hashCode5 = (hashCode4 + (benefitExplainerScreen != null ? benefitExplainerScreen.hashCode() : 0)) * 37;
        BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
        int hashCode6 = hashCode5 + (benefitReinforcementMessage != null ? benefitReinforcementMessage.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.explainer_screen = this.explainer_screen;
        builder.map_screen = this.map_screen;
        builder.search_screen = this.search_screen;
        builder.benefit_explainer_screen = this.benefit_explainer_screen;
        builder.benefit_reinforcement_message = this.benefit_reinforcement_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ExplainerScreen explainerScreen = this.explainer_screen;
        if (explainerScreen != null) {
            arrayList.add("explainer_screen=" + explainerScreen);
        }
        MapScreen mapScreen = this.map_screen;
        if (mapScreen != null) {
            arrayList.add("map_screen=" + mapScreen);
        }
        SearchScreen searchScreen = this.search_screen;
        if (searchScreen != null) {
            arrayList.add("search_screen=" + searchScreen);
        }
        BenefitExplainerScreen benefitExplainerScreen = this.benefit_explainer_screen;
        if (benefitExplainerScreen != null) {
            arrayList.add("benefit_explainer_screen=" + benefitExplainerScreen);
        }
        BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
        if (benefitReinforcementMessage != null) {
            arrayList.add("benefit_reinforcement_message=" + benefitReinforcementMessage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetailerMapBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage$Builder;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class BenefitReinforcementMessage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BenefitReinforcementMessage> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon icon;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public BenefitReinforcementMessage build() {
                return new BenefitReinforcementMessage(this.icon, this.text, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BenefitReinforcementMessage.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$BenefitReinforcementMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.BenefitReinforcementMessage decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RetailerMapBlocker.BenefitReinforcementMessage((Icon) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RetailerMapBlocker.BenefitReinforcementMessage value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RetailerMapBlocker.BenefitReinforcementMessage value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.BenefitReinforcementMessage redact(RetailerMapBlocker.BenefitReinforcementMessage value) {
                    value.getClass();
                    Icon icon = value.icon;
                    return RetailerMapBlocker.BenefitReinforcementMessage.copy$default(value, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RetailerMapBlocker.BenefitReinforcementMessage value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BenefitReinforcementMessage(Icon icon, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BenefitReinforcementMessage copy$default(BenefitReinforcementMessage benefitReinforcementMessage, Icon icon, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = benefitReinforcementMessage.icon;
            }
            if ((i & 2) != 0) {
                str = benefitReinforcementMessage.text;
            }
            if ((i & 4) != 0) {
                byteString = benefitReinforcementMessage.unknownFields();
            }
            return benefitReinforcementMessage.copy(icon, str, byteString);
        }

        public final BenefitReinforcementMessage copy(Icon icon, String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new BenefitReinforcementMessage(icon, text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BenefitReinforcementMessage)) {
                return false;
            }
            BenefitReinforcementMessage benefitReinforcementMessage = (BenefitReinforcementMessage) other;
            return Intrinsics.areEqual(unknownFields(), benefitReinforcementMessage.unknownFields()) && Intrinsics.areEqual(this.icon, benefitReinforcementMessage.icon) && Intrinsics.areEqual(this.text, benefitReinforcementMessage.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitReinforcementMessage{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$BenefitReinforcementMessage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BenefitReinforcementMessage build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BenefitReinforcementMessage() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BenefitReinforcementMessage(Icon icon, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016Jp\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen$Builder;", "header_title", "", "location_disabled_title_text", "location_disabled_detail_text", "location_disabled_settings_text", "location_disabled_ignore_text", "no_nearby_locations_title_text", "no_nearby_locations_detail_text", "no_nearby_locations_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MapScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MapScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String location_disabled_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String location_disabled_ignore_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String location_disabled_settings_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String location_disabled_title_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
        public final String no_nearby_locations_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String no_nearby_locations_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String no_nearby_locations_title_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "<init>", "()V", "header_title", "", "location_disabled_title_text", "location_disabled_detail_text", "location_disabled_settings_text", "location_disabled_ignore_text", "no_nearby_locations_title_text", "no_nearby_locations_detail_text", "no_nearby_locations_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String header_title;
            public String location_disabled_detail_text;
            public String location_disabled_ignore_text;
            public String location_disabled_settings_text;
            public String location_disabled_title_text;
            public String no_nearby_locations_button_text;
            public String no_nearby_locations_detail_text;
            public String no_nearby_locations_title_text;

            @Override // com.squareup.wire.Message.Builder
            public MapScreen build() {
                return new MapScreen(this.header_title, this.location_disabled_title_text, this.location_disabled_detail_text, this.location_disabled_settings_text, this.location_disabled_ignore_text, this.no_nearby_locations_title_text, this.no_nearby_locations_detail_text, this.no_nearby_locations_button_text, buildUnknownFields());
            }

            public final Builder header_title(String header_title) {
                this.header_title = header_title;
                return this;
            }

            public final Builder location_disabled_detail_text(String location_disabled_detail_text) {
                this.location_disabled_detail_text = location_disabled_detail_text;
                return this;
            }

            public final Builder location_disabled_ignore_text(String location_disabled_ignore_text) {
                this.location_disabled_ignore_text = location_disabled_ignore_text;
                return this;
            }

            public final Builder location_disabled_settings_text(String location_disabled_settings_text) {
                this.location_disabled_settings_text = location_disabled_settings_text;
                return this;
            }

            public final Builder location_disabled_title_text(String location_disabled_title_text) {
                this.location_disabled_title_text = location_disabled_title_text;
                return this;
            }

            public final Builder no_nearby_locations_button_text(String no_nearby_locations_button_text) {
                this.no_nearby_locations_button_text = no_nearby_locations_button_text;
                return this;
            }

            public final Builder no_nearby_locations_detail_text(String no_nearby_locations_detail_text) {
                this.no_nearby_locations_detail_text = no_nearby_locations_detail_text;
                return this;
            }

            public final Builder no_nearby_locations_title_text(String no_nearby_locations_title_text) {
                this.no_nearby_locations_title_text = no_nearby_locations_title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MapScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$MapScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.MapScreen decode(ProtoReader reader) {
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
                            return new RetailerMapBlocker.MapScreen((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RetailerMapBlocker.MapScreen value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.location_disabled_title_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.location_disabled_detail_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.location_disabled_settings_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.location_disabled_ignore_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.no_nearby_locations_title_text);
                    protoAdapter2.encodeWithTag(writer, 7, value.no_nearby_locations_detail_text);
                    protoAdapter2.encodeWithTag(writer, 8, value.no_nearby_locations_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RetailerMapBlocker.MapScreen value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(8, value.no_nearby_locations_button_text) + protoAdapter2.encodedSizeWithTag(7, value.no_nearby_locations_detail_text) + protoAdapter2.encodedSizeWithTag(6, value.no_nearby_locations_title_text) + protoAdapter2.encodedSizeWithTag(5, value.location_disabled_ignore_text) + protoAdapter2.encodedSizeWithTag(4, value.location_disabled_settings_text) + protoAdapter2.encodedSizeWithTag(3, value.location_disabled_detail_text) + protoAdapter2.encodedSizeWithTag(2, value.location_disabled_title_text) + protoAdapter2.encodedSizeWithTag(1, value.header_title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.MapScreen redact(RetailerMapBlocker.MapScreen value) {
                    value.getClass();
                    return RetailerMapBlocker.MapScreen.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RetailerMapBlocker.MapScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 8, value.no_nearby_locations_button_text);
                    protoAdapter2.encodeWithTag(writer, 7, value.no_nearby_locations_detail_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.no_nearby_locations_title_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.location_disabled_ignore_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.location_disabled_settings_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.location_disabled_detail_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.location_disabled_title_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.header_title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ MapScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MapScreen copy$default(MapScreen mapScreen, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mapScreen.header_title;
            }
            if ((i & 2) != 0) {
                str2 = mapScreen.location_disabled_title_text;
            }
            if ((i & 4) != 0) {
                str3 = mapScreen.location_disabled_detail_text;
            }
            if ((i & 8) != 0) {
                str4 = mapScreen.location_disabled_settings_text;
            }
            if ((i & 16) != 0) {
                str5 = mapScreen.location_disabled_ignore_text;
            }
            if ((i & 32) != 0) {
                str6 = mapScreen.no_nearby_locations_title_text;
            }
            if ((i & 64) != 0) {
                str7 = mapScreen.no_nearby_locations_detail_text;
            }
            if ((i & 128) != 0) {
                str8 = mapScreen.no_nearby_locations_button_text;
            }
            if ((i & 256) != 0) {
                byteString = mapScreen.unknownFields();
            }
            String str9 = str8;
            ByteString byteString2 = byteString;
            String str10 = str6;
            String str11 = str7;
            String str12 = str5;
            String str13 = str3;
            return mapScreen.copy(str, str2, str13, str4, str12, str10, str11, str9, byteString2);
        }

        public final MapScreen copy(String header_title, String location_disabled_title_text, String location_disabled_detail_text, String location_disabled_settings_text, String location_disabled_ignore_text, String no_nearby_locations_title_text, String no_nearby_locations_detail_text, String no_nearby_locations_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new MapScreen(header_title, location_disabled_title_text, location_disabled_detail_text, location_disabled_settings_text, location_disabled_ignore_text, no_nearby_locations_title_text, no_nearby_locations_detail_text, no_nearby_locations_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MapScreen)) {
                return false;
            }
            MapScreen mapScreen = (MapScreen) other;
            return Intrinsics.areEqual(unknownFields(), mapScreen.unknownFields()) && Intrinsics.areEqual(this.header_title, mapScreen.header_title) && Intrinsics.areEqual(this.location_disabled_title_text, mapScreen.location_disabled_title_text) && Intrinsics.areEqual(this.location_disabled_detail_text, mapScreen.location_disabled_detail_text) && Intrinsics.areEqual(this.location_disabled_settings_text, mapScreen.location_disabled_settings_text) && Intrinsics.areEqual(this.location_disabled_ignore_text, mapScreen.location_disabled_ignore_text) && Intrinsics.areEqual(this.no_nearby_locations_title_text, mapScreen.no_nearby_locations_title_text) && Intrinsics.areEqual(this.no_nearby_locations_detail_text, mapScreen.no_nearby_locations_detail_text) && Intrinsics.areEqual(this.no_nearby_locations_button_text, mapScreen.no_nearby_locations_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.location_disabled_title_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.location_disabled_detail_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.location_disabled_settings_text;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.location_disabled_ignore_text;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.no_nearby_locations_title_text;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.no_nearby_locations_detail_text;
            int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.no_nearby_locations_button_text;
            int hashCode9 = hashCode8 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_title = this.header_title;
            builder.location_disabled_title_text = this.location_disabled_title_text;
            builder.location_disabled_detail_text = this.location_disabled_detail_text;
            builder.location_disabled_settings_text = this.location_disabled_settings_text;
            builder.location_disabled_ignore_text = this.location_disabled_ignore_text;
            builder.no_nearby_locations_title_text = this.no_nearby_locations_title_text;
            builder.no_nearby_locations_detail_text = this.no_nearby_locations_detail_text;
            builder.no_nearby_locations_button_text = this.no_nearby_locations_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_title=", arrayList);
            }
            String str2 = this.location_disabled_title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_disabled_title_text=", arrayList);
            }
            String str3 = this.location_disabled_detail_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "location_disabled_detail_text=", arrayList);
            }
            String str4 = this.location_disabled_settings_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "location_disabled_settings_text=", arrayList);
            }
            String str5 = this.location_disabled_ignore_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "location_disabled_ignore_text=", arrayList);
            }
            String str6 = this.no_nearby_locations_title_text;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "no_nearby_locations_title_text=", arrayList);
            }
            String str7 = this.no_nearby_locations_detail_text;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "no_nearby_locations_detail_text=", arrayList);
            }
            String str8 = this.no_nearby_locations_button_text;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "no_nearby_locations_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MapScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$MapScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MapScreen build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public MapScreen() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header_title = str;
            this.location_disabled_title_text = str2;
            this.location_disabled_detail_text = str3;
            this.location_disabled_settings_text = str4;
            this.location_disabled_ignore_text = str5;
            this.no_nearby_locations_title_text = str6;
            this.no_nearby_locations_detail_text = str7;
            this.no_nearby_locations_button_text = str8;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen$Builder;", "explanation_title_text", "", "explanation_detail_text", "placeholder_text", "recent_section_header_text", "results_section_header", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SearchScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SearchScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String explanation_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String explanation_title_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String placeholder_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String recent_section_header_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String results_section_header;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "<init>", "()V", "explanation_title_text", "", "explanation_detail_text", "placeholder_text", "recent_section_header_text", "results_section_header", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String explanation_detail_text;
            public String explanation_title_text;
            public String placeholder_text;
            public String recent_section_header_text;
            public String results_section_header;

            @Override // com.squareup.wire.Message.Builder
            public SearchScreen build() {
                return new SearchScreen(this.explanation_title_text, this.explanation_detail_text, this.placeholder_text, this.recent_section_header_text, this.results_section_header, buildUnknownFields());
            }

            public final Builder explanation_detail_text(String explanation_detail_text) {
                this.explanation_detail_text = explanation_detail_text;
                return this;
            }

            public final Builder explanation_title_text(String explanation_title_text) {
                this.explanation_title_text = explanation_title_text;
                return this;
            }

            public final Builder placeholder_text(String placeholder_text) {
                this.placeholder_text = placeholder_text;
                return this;
            }

            public final Builder recent_section_header_text(String recent_section_header_text) {
                this.recent_section_header_text = recent_section_header_text;
                return this;
            }

            public final Builder results_section_header(String results_section_header) {
                this.results_section_header = results_section_header;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SearchScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RetailerMapBlocker$SearchScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.SearchScreen decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RetailerMapBlocker.SearchScreen((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RetailerMapBlocker.SearchScreen value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.explanation_title_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.explanation_detail_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.placeholder_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.recent_section_header_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.results_section_header);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RetailerMapBlocker.SearchScreen value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.results_section_header) + protoAdapter2.encodedSizeWithTag(4, value.recent_section_header_text) + protoAdapter2.encodedSizeWithTag(3, value.placeholder_text) + protoAdapter2.encodedSizeWithTag(2, value.explanation_detail_text) + protoAdapter2.encodedSizeWithTag(1, value.explanation_title_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RetailerMapBlocker.SearchScreen redact(RetailerMapBlocker.SearchScreen value) {
                    value.getClass();
                    return RetailerMapBlocker.SearchScreen.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RetailerMapBlocker.SearchScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.results_section_header);
                    protoAdapter2.encodeWithTag(writer, 4, value.recent_section_header_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.placeholder_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.explanation_detail_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.explanation_title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SearchScreen(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SearchScreen copy$default(SearchScreen searchScreen, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchScreen.explanation_title_text;
            }
            if ((i & 2) != 0) {
                str2 = searchScreen.explanation_detail_text;
            }
            if ((i & 4) != 0) {
                str3 = searchScreen.placeholder_text;
            }
            if ((i & 8) != 0) {
                str4 = searchScreen.recent_section_header_text;
            }
            if ((i & 16) != 0) {
                str5 = searchScreen.results_section_header;
            }
            if ((i & 32) != 0) {
                byteString = searchScreen.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            return searchScreen.copy(str, str2, str3, str4, str6, byteString2);
        }

        public final SearchScreen copy(String explanation_title_text, String explanation_detail_text, String placeholder_text, String recent_section_header_text, String results_section_header, ByteString unknownFields) {
            unknownFields.getClass();
            return new SearchScreen(explanation_title_text, explanation_detail_text, placeholder_text, recent_section_header_text, results_section_header, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SearchScreen)) {
                return false;
            }
            SearchScreen searchScreen = (SearchScreen) other;
            return Intrinsics.areEqual(unknownFields(), searchScreen.unknownFields()) && Intrinsics.areEqual(this.explanation_title_text, searchScreen.explanation_title_text) && Intrinsics.areEqual(this.explanation_detail_text, searchScreen.explanation_detail_text) && Intrinsics.areEqual(this.placeholder_text, searchScreen.placeholder_text) && Intrinsics.areEqual(this.recent_section_header_text, searchScreen.recent_section_header_text) && Intrinsics.areEqual(this.results_section_header, searchScreen.results_section_header);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.explanation_title_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.explanation_detail_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.placeholder_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.recent_section_header_text;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.results_section_header;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.explanation_title_text = this.explanation_title_text;
            builder.explanation_detail_text = this.explanation_detail_text;
            builder.placeholder_text = this.placeholder_text;
            builder.recent_section_header_text = this.recent_section_header_text;
            builder.results_section_header = this.results_section_header;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.explanation_title_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "explanation_title_text=", arrayList);
            }
            String str2 = this.explanation_detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "explanation_detail_text=", arrayList);
            }
            String str3 = this.placeholder_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "placeholder_text=", arrayList);
            }
            String str4 = this.recent_section_header_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "recent_section_header_text=", arrayList);
            }
            String str5 = this.results_section_header;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "results_section_header=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SearchScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker$SearchScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SearchScreen build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SearchScreen() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchScreen(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.explanation_title_text = str;
            this.explanation_detail_text = str2;
            this.placeholder_text = str3;
            this.recent_section_header_text = str4;
            this.results_section_header = str5;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RetailerMapBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RetailerMapBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RetailerMapBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RetailerMapBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
