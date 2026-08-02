package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u001a\u0019\u001b\u001c\u001d\u001e\u001f R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006!"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "turorial_carousel", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "map_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "search_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "merchant_options", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "barcode_expired_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "limits_reached_dialog", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "Lcom/squareup/protos/franklin/api/FormBlocker;", "swipe_to_load_blocker", "Lcom/squareup/protos/franklin/api/FormBlocker;", "deposit_nux_blocker", "Companion", "Builder", "TutorialCarousel", "MapScreen", "SearchScreen", "MerchantOptions", "BarcodeExpiredScreen", "LimitsReachedDialog", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaperCashDepositBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaperCashDepositBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$BarcodeExpiredScreen#ADAPTER", schemaIndex = 4, tag = 5)
    public final BarcodeExpiredScreen barcode_expired_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker#ADAPTER", schemaIndex = 7, tag = 8)
    public final FormBlocker deposit_nux_blocker;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$LimitsReachedDialog#ADAPTER", schemaIndex = 5, tag = 6)
    public final LimitsReachedDialog limits_reached_dialog;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$MapScreen#ADAPTER", schemaIndex = 1, tag = 2)
    public final MapScreen map_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$MerchantOptions#ADAPTER", schemaIndex = 3, tag = 4)
    public final MerchantOptions merchant_options;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$SearchScreen#ADAPTER", schemaIndex = 2, tag = 3)
    public final SearchScreen search_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker#ADAPTER", schemaIndex = 6, tag = 7)
    public final FormBlocker swipe_to_load_blocker;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel#ADAPTER", schemaIndex = 0, tag = 1)
    public final TutorialCarousel turorial_carousel;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker;", "<init>", "()V", "turorial_carousel", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "map_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "search_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "merchant_options", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "barcode_expired_screen", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "limits_reached_dialog", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "swipe_to_load_blocker", "Lcom/squareup/protos/franklin/api/FormBlocker;", "deposit_nux_blocker", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public BarcodeExpiredScreen barcode_expired_screen;
        public FormBlocker deposit_nux_blocker;
        public LimitsReachedDialog limits_reached_dialog;
        public MapScreen map_screen;
        public MerchantOptions merchant_options;
        public SearchScreen search_screen;
        public FormBlocker swipe_to_load_blocker;
        public TutorialCarousel turorial_carousel;

        public final Builder barcode_expired_screen(BarcodeExpiredScreen barcode_expired_screen) {
            this.barcode_expired_screen = barcode_expired_screen;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaperCashDepositBlocker build() {
            return new PaperCashDepositBlocker(this.turorial_carousel, this.map_screen, this.search_screen, this.merchant_options, this.barcode_expired_screen, this.limits_reached_dialog, this.swipe_to_load_blocker, this.deposit_nux_blocker, buildUnknownFields());
        }

        public final Builder deposit_nux_blocker(FormBlocker deposit_nux_blocker) {
            this.deposit_nux_blocker = deposit_nux_blocker;
            return this;
        }

        public final Builder limits_reached_dialog(LimitsReachedDialog limits_reached_dialog) {
            this.limits_reached_dialog = limits_reached_dialog;
            return this;
        }

        public final Builder map_screen(MapScreen map_screen) {
            this.map_screen = map_screen;
            return this;
        }

        public final Builder merchant_options(MerchantOptions merchant_options) {
            this.merchant_options = merchant_options;
            return this;
        }

        public final Builder search_screen(SearchScreen search_screen) {
            this.search_screen = search_screen;
            return this;
        }

        public final Builder swipe_to_load_blocker(FormBlocker swipe_to_load_blocker) {
            this.swipe_to_load_blocker = swipe_to_load_blocker;
            return this;
        }

        public final Builder turorial_carousel(TutorialCarousel turorial_carousel) {
            this.turorial_carousel = turorial_carousel;
            return this;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0004H\u0016J¬\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$Builder;", "header_title", "", "show_barcode_button_text", "search_button_accessibility_label", "tutorial_button_accessibility_label", "search_header_title_prefix", "no_nearby_locations_title_text", "no_nearby_locations_detail_text", "no_nearby_locations_button_text", "location_disabled_title_text", "location_disabled_detail_text", "location_disabled_settings_text", "location_disabled_ignore_text", "benefit_reinforcement_message", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "BenefitReinforcementMessage", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MapScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MapScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage#ADAPTER", schemaIndex = 12, tag = 13)
        public final BenefitReinforcementMessage benefit_reinforcement_message;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
        public final String location_disabled_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
        public final String location_disabled_ignore_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
        public final String location_disabled_settings_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
        public final String location_disabled_title_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
        public final String no_nearby_locations_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String no_nearby_locations_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String no_nearby_locations_title_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String search_button_accessibility_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String search_header_title_prefix;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String show_barcode_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String tutorial_button_accessibility_label;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "<init>", "()V", "header_title", "", "show_barcode_button_text", "search_button_accessibility_label", "tutorial_button_accessibility_label", "search_header_title_prefix", "no_nearby_locations_title_text", "no_nearby_locations_detail_text", "no_nearby_locations_button_text", "location_disabled_title_text", "location_disabled_detail_text", "location_disabled_settings_text", "location_disabled_ignore_text", "benefit_reinforcement_message", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BenefitReinforcementMessage benefit_reinforcement_message;
            public String header_title;
            public String location_disabled_detail_text;
            public String location_disabled_ignore_text;
            public String location_disabled_settings_text;
            public String location_disabled_title_text;
            public String no_nearby_locations_button_text;
            public String no_nearby_locations_detail_text;
            public String no_nearby_locations_title_text;
            public String search_button_accessibility_label;
            public String search_header_title_prefix;
            public String show_barcode_button_text;
            public String tutorial_button_accessibility_label;

            public final Builder benefit_reinforcement_message(BenefitReinforcementMessage benefit_reinforcement_message) {
                this.benefit_reinforcement_message = benefit_reinforcement_message;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public MapScreen build() {
                return new MapScreen(this.header_title, this.show_barcode_button_text, this.search_button_accessibility_label, this.tutorial_button_accessibility_label, this.search_header_title_prefix, this.no_nearby_locations_title_text, this.no_nearby_locations_detail_text, this.no_nearby_locations_button_text, this.location_disabled_title_text, this.location_disabled_detail_text, this.location_disabled_settings_text, this.location_disabled_ignore_text, this.benefit_reinforcement_message, buildUnknownFields());
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

            public final Builder search_button_accessibility_label(String search_button_accessibility_label) {
                this.search_button_accessibility_label = search_button_accessibility_label;
                return this;
            }

            public final Builder search_header_title_prefix(String search_header_title_prefix) {
                this.search_header_title_prefix = search_header_title_prefix;
                return this;
            }

            public final Builder show_barcode_button_text(String show_barcode_button_text) {
                this.show_barcode_button_text = show_barcode_button_text;
                return this;
            }

            public final Builder tutorial_button_accessibility_label(String tutorial_button_accessibility_label) {
                this.tutorial_button_accessibility_label = tutorial_button_accessibility_label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MapScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$MapScreen$Companion$ADAPTER$1
                /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.MapScreen decode(ProtoReader reader) {
                    Object obj;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    Object obj13 = null;
                    Object obj14 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        Object obj15 = obj3;
                        if (nextTag == -1) {
                            return new PaperCashDepositBlocker.MapScreen((String) obj2, (String) obj15, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                break;
                            case 2:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                obj = obj2;
                                break;
                            case 3:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 4:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 5:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 6:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 7:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 8:
                                obj9 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 9:
                                obj10 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 10:
                                obj11 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 11:
                                obj12 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 12:
                                obj13 = ProtoAdapter.STRING.decode(reader);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            case 13:
                                obj14 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.ADAPTER, reader, obj14);
                                obj3 = obj15;
                                obj = obj2;
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj2;
                                obj3 = obj15;
                                break;
                        }
                        obj2 = obj;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.MapScreen value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.show_barcode_button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.search_button_accessibility_label);
                    protoAdapter2.encodeWithTag(writer, 4, value.tutorial_button_accessibility_label);
                    protoAdapter2.encodeWithTag(writer, 5, value.search_header_title_prefix);
                    protoAdapter2.encodeWithTag(writer, 6, value.no_nearby_locations_title_text);
                    protoAdapter2.encodeWithTag(writer, 7, value.no_nearby_locations_detail_text);
                    protoAdapter2.encodeWithTag(writer, 8, value.no_nearby_locations_button_text);
                    protoAdapter2.encodeWithTag(writer, 9, value.location_disabled_title_text);
                    protoAdapter2.encodeWithTag(writer, 10, value.location_disabled_detail_text);
                    protoAdapter2.encodeWithTag(writer, 11, value.location_disabled_settings_text);
                    protoAdapter2.encodeWithTag(writer, 12, value.location_disabled_ignore_text);
                    PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.ADAPTER.encodeWithTag(writer, 13, value.benefit_reinforcement_message);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.MapScreen value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.ADAPTER.encodedSizeWithTag(13, value.benefit_reinforcement_message) + protoAdapter2.encodedSizeWithTag(12, value.location_disabled_ignore_text) + protoAdapter2.encodedSizeWithTag(11, value.location_disabled_settings_text) + protoAdapter2.encodedSizeWithTag(10, value.location_disabled_detail_text) + protoAdapter2.encodedSizeWithTag(9, value.location_disabled_title_text) + protoAdapter2.encodedSizeWithTag(8, value.no_nearby_locations_button_text) + protoAdapter2.encodedSizeWithTag(7, value.no_nearby_locations_detail_text) + protoAdapter2.encodedSizeWithTag(6, value.no_nearby_locations_title_text) + protoAdapter2.encodedSizeWithTag(5, value.search_header_title_prefix) + protoAdapter2.encodedSizeWithTag(4, value.tutorial_button_accessibility_label) + protoAdapter2.encodedSizeWithTag(3, value.search_button_accessibility_label) + protoAdapter2.encodedSizeWithTag(2, value.show_barcode_button_text) + protoAdapter2.encodedSizeWithTag(1, value.header_title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.MapScreen redact(PaperCashDepositBlocker.MapScreen value) {
                    PaperCashDepositBlocker.MapScreen copy;
                    value.getClass();
                    PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage benefitReinforcementMessage = value.benefit_reinforcement_message;
                    copy = value.copy((r29 & 1) != 0 ? value.header_title : null, (r29 & 2) != 0 ? value.show_barcode_button_text : null, (r29 & 4) != 0 ? value.search_button_accessibility_label : null, (r29 & 8) != 0 ? value.tutorial_button_accessibility_label : null, (r29 & 16) != 0 ? value.search_header_title_prefix : null, (r29 & 32) != 0 ? value.no_nearby_locations_title_text : null, (r29 & 64) != 0 ? value.no_nearby_locations_detail_text : null, (r29 & 128) != 0 ? value.no_nearby_locations_button_text : null, (r29 & 256) != 0 ? value.location_disabled_title_text : null, (r29 & 512) != 0 ? value.location_disabled_detail_text : null, (r29 & 1024) != 0 ? value.location_disabled_settings_text : null, (r29 & 2048) != 0 ? value.location_disabled_ignore_text : null, (r29 & 4096) != 0 ? value.benefit_reinforcement_message : benefitReinforcementMessage != null ? (PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage) PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.ADAPTER.redact(benefitReinforcementMessage) : null, (r29 & PKIFailureInfo.certRevoked) != 0 ? value.unknownFields() : ByteString.EMPTY);
                    return copy;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.MapScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.ADAPTER.encodeWithTag(writer, 13, value.benefit_reinforcement_message);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 12, value.location_disabled_ignore_text);
                    protoAdapter2.encodeWithTag(writer, 11, value.location_disabled_settings_text);
                    protoAdapter2.encodeWithTag(writer, 10, value.location_disabled_detail_text);
                    protoAdapter2.encodeWithTag(writer, 9, value.location_disabled_title_text);
                    protoAdapter2.encodeWithTag(writer, 8, value.no_nearby_locations_button_text);
                    protoAdapter2.encodeWithTag(writer, 7, value.no_nearby_locations_detail_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.no_nearby_locations_title_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.search_header_title_prefix);
                    protoAdapter2.encodeWithTag(writer, 4, value.tutorial_button_accessibility_label);
                    protoAdapter2.encodeWithTag(writer, 3, value.search_button_accessibility_label);
                    protoAdapter2.encodeWithTag(writer, 2, value.show_barcode_button_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.header_title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ MapScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BenefitReinforcementMessage benefitReinforcementMessage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? benefitReinforcementMessage : null, (i & PKIFailureInfo.certRevoked) != 0 ? ByteString.EMPTY : byteString);
        }

        public final MapScreen copy(String header_title, String show_barcode_button_text, String search_button_accessibility_label, String tutorial_button_accessibility_label, String search_header_title_prefix, String no_nearby_locations_title_text, String no_nearby_locations_detail_text, String no_nearby_locations_button_text, String location_disabled_title_text, String location_disabled_detail_text, String location_disabled_settings_text, String location_disabled_ignore_text, BenefitReinforcementMessage benefit_reinforcement_message, ByteString unknownFields) {
            unknownFields.getClass();
            return new MapScreen(header_title, show_barcode_button_text, search_button_accessibility_label, tutorial_button_accessibility_label, search_header_title_prefix, no_nearby_locations_title_text, no_nearby_locations_detail_text, no_nearby_locations_button_text, location_disabled_title_text, location_disabled_detail_text, location_disabled_settings_text, location_disabled_ignore_text, benefit_reinforcement_message, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MapScreen)) {
                return false;
            }
            MapScreen mapScreen = (MapScreen) other;
            return Intrinsics.areEqual(unknownFields(), mapScreen.unknownFields()) && Intrinsics.areEqual(this.header_title, mapScreen.header_title) && Intrinsics.areEqual(this.show_barcode_button_text, mapScreen.show_barcode_button_text) && Intrinsics.areEqual(this.search_button_accessibility_label, mapScreen.search_button_accessibility_label) && Intrinsics.areEqual(this.tutorial_button_accessibility_label, mapScreen.tutorial_button_accessibility_label) && Intrinsics.areEqual(this.search_header_title_prefix, mapScreen.search_header_title_prefix) && Intrinsics.areEqual(this.no_nearby_locations_title_text, mapScreen.no_nearby_locations_title_text) && Intrinsics.areEqual(this.no_nearby_locations_detail_text, mapScreen.no_nearby_locations_detail_text) && Intrinsics.areEqual(this.no_nearby_locations_button_text, mapScreen.no_nearby_locations_button_text) && Intrinsics.areEqual(this.location_disabled_title_text, mapScreen.location_disabled_title_text) && Intrinsics.areEqual(this.location_disabled_detail_text, mapScreen.location_disabled_detail_text) && Intrinsics.areEqual(this.location_disabled_settings_text, mapScreen.location_disabled_settings_text) && Intrinsics.areEqual(this.location_disabled_ignore_text, mapScreen.location_disabled_ignore_text) && Intrinsics.areEqual(this.benefit_reinforcement_message, mapScreen.benefit_reinforcement_message);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.show_barcode_button_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.search_button_accessibility_label;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.tutorial_button_accessibility_label;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.search_header_title_prefix;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.no_nearby_locations_title_text;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.no_nearby_locations_detail_text;
            int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.no_nearby_locations_button_text;
            int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
            String str9 = this.location_disabled_title_text;
            int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
            String str10 = this.location_disabled_detail_text;
            int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
            String str11 = this.location_disabled_settings_text;
            int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
            String str12 = this.location_disabled_ignore_text;
            int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 37;
            BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
            int hashCode14 = hashCode13 + (benefitReinforcementMessage != null ? benefitReinforcementMessage.hashCode() : 0);
            this.hashCode = hashCode14;
            return hashCode14;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_title = this.header_title;
            builder.show_barcode_button_text = this.show_barcode_button_text;
            builder.search_button_accessibility_label = this.search_button_accessibility_label;
            builder.tutorial_button_accessibility_label = this.tutorial_button_accessibility_label;
            builder.search_header_title_prefix = this.search_header_title_prefix;
            builder.no_nearby_locations_title_text = this.no_nearby_locations_title_text;
            builder.no_nearby_locations_detail_text = this.no_nearby_locations_detail_text;
            builder.no_nearby_locations_button_text = this.no_nearby_locations_button_text;
            builder.location_disabled_title_text = this.location_disabled_title_text;
            builder.location_disabled_detail_text = this.location_disabled_detail_text;
            builder.location_disabled_settings_text = this.location_disabled_settings_text;
            builder.location_disabled_ignore_text = this.location_disabled_ignore_text;
            builder.benefit_reinforcement_message = this.benefit_reinforcement_message;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_title=", arrayList);
            }
            String str2 = this.show_barcode_button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "show_barcode_button_text=", arrayList);
            }
            String str3 = this.search_button_accessibility_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "search_button_accessibility_label=", arrayList);
            }
            String str4 = this.tutorial_button_accessibility_label;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "tutorial_button_accessibility_label=", arrayList);
            }
            String str5 = this.search_header_title_prefix;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "search_header_title_prefix=", arrayList);
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
            String str9 = this.location_disabled_title_text;
            if (str9 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "location_disabled_title_text=", arrayList);
            }
            String str10 = this.location_disabled_detail_text;
            if (str10 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "location_disabled_detail_text=", arrayList);
            }
            String str11 = this.location_disabled_settings_text;
            if (str11 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "location_disabled_settings_text=", arrayList);
            }
            String str12 = this.location_disabled_ignore_text;
            if (str12 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "location_disabled_ignore_text=", arrayList);
            }
            BenefitReinforcementMessage benefitReinforcementMessage = this.benefit_reinforcement_message;
            if (benefitReinforcementMessage != null) {
                arrayList.add("benefit_reinforcement_message=" + benefitReinforcementMessage);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MapScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage$Builder;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage((Icon) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage value) {
                        writer.getClass();
                        value.getClass();
                        Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage redact(PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage value) {
                        value.getClass();
                        Icon icon = value.icon;
                        return PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage.copy$default(value, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, null, ByteString.EMPTY, 2, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.MapScreen.BenefitReinforcementMessage value) {
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

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$BenefitReinforcementMessage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MapScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BenefitReinforcementMessage benefitReinforcementMessage, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header_title = str;
            this.show_barcode_button_text = str2;
            this.search_button_accessibility_label = str3;
            this.tutorial_button_accessibility_label = str4;
            this.search_header_title_prefix = str5;
            this.no_nearby_locations_title_text = str6;
            this.no_nearby_locations_detail_text = str7;
            this.no_nearby_locations_button_text = str8;
            this.location_disabled_title_text = str9;
            this.location_disabled_detail_text = str10;
            this.location_disabled_settings_text = str11;
            this.location_disabled_ignore_text = str12;
            this.benefit_reinforcement_message = benefitReinforcementMessage;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaperCashDepositBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaperCashDepositBlocker decode(ProtoReader reader) {
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
                        return new PaperCashDepositBlocker((PaperCashDepositBlocker.TutorialCarousel) obj, (PaperCashDepositBlocker.MapScreen) obj2, (PaperCashDepositBlocker.SearchScreen) obj3, (PaperCashDepositBlocker.MerchantOptions) obj4, (PaperCashDepositBlocker.BarcodeExpiredScreen) obj5, (PaperCashDepositBlocker.LimitsReachedDialog) obj6, (FormBlocker) obj7, (FormBlocker) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.TutorialCarousel.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.MapScreen.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.SearchScreen.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.MerchantOptions.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.BarcodeExpiredScreen.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(PaperCashDepositBlocker.LimitsReachedDialog.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(FormBlocker.ADAPTER, reader, obj7);
                            break;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(FormBlocker.ADAPTER, reader, obj8);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaperCashDepositBlocker value) {
                writer.getClass();
                value.getClass();
                PaperCashDepositBlocker.TutorialCarousel.ADAPTER.encodeWithTag(writer, 1, value.turorial_carousel);
                PaperCashDepositBlocker.MapScreen.ADAPTER.encodeWithTag(writer, 2, value.map_screen);
                PaperCashDepositBlocker.SearchScreen.ADAPTER.encodeWithTag(writer, 3, value.search_screen);
                PaperCashDepositBlocker.MerchantOptions.ADAPTER.encodeWithTag(writer, 4, value.merchant_options);
                PaperCashDepositBlocker.BarcodeExpiredScreen.ADAPTER.encodeWithTag(writer, 5, value.barcode_expired_screen);
                PaperCashDepositBlocker.LimitsReachedDialog.ADAPTER.encodeWithTag(writer, 6, value.limits_reached_dialog);
                ProtoAdapter protoAdapter2 = FormBlocker.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, value.swipe_to_load_blocker);
                protoAdapter2.encodeWithTag(writer, 8, value.deposit_nux_blocker);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaperCashDepositBlocker value) {
                value.getClass();
                int encodedSizeWithTag = PaperCashDepositBlocker.LimitsReachedDialog.ADAPTER.encodedSizeWithTag(6, value.limits_reached_dialog) + PaperCashDepositBlocker.BarcodeExpiredScreen.ADAPTER.encodedSizeWithTag(5, value.barcode_expired_screen) + PaperCashDepositBlocker.MerchantOptions.ADAPTER.encodedSizeWithTag(4, value.merchant_options) + PaperCashDepositBlocker.SearchScreen.ADAPTER.encodedSizeWithTag(3, value.search_screen) + PaperCashDepositBlocker.MapScreen.ADAPTER.encodedSizeWithTag(2, value.map_screen) + PaperCashDepositBlocker.TutorialCarousel.ADAPTER.encodedSizeWithTag(1, value.turorial_carousel) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = FormBlocker.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(8, value.deposit_nux_blocker) + protoAdapter2.encodedSizeWithTag(7, value.swipe_to_load_blocker) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaperCashDepositBlocker redact(PaperCashDepositBlocker value) {
                value.getClass();
                PaperCashDepositBlocker.TutorialCarousel tutorialCarousel = value.turorial_carousel;
                PaperCashDepositBlocker.TutorialCarousel tutorialCarousel2 = tutorialCarousel != null ? (PaperCashDepositBlocker.TutorialCarousel) PaperCashDepositBlocker.TutorialCarousel.ADAPTER.redact(tutorialCarousel) : null;
                PaperCashDepositBlocker.MapScreen mapScreen = value.map_screen;
                PaperCashDepositBlocker.MapScreen mapScreen2 = mapScreen != null ? (PaperCashDepositBlocker.MapScreen) PaperCashDepositBlocker.MapScreen.ADAPTER.redact(mapScreen) : null;
                PaperCashDepositBlocker.SearchScreen searchScreen = value.search_screen;
                PaperCashDepositBlocker.SearchScreen searchScreen2 = searchScreen != null ? (PaperCashDepositBlocker.SearchScreen) PaperCashDepositBlocker.SearchScreen.ADAPTER.redact(searchScreen) : null;
                PaperCashDepositBlocker.MerchantOptions merchantOptions = value.merchant_options;
                PaperCashDepositBlocker.MerchantOptions merchantOptions2 = merchantOptions != null ? (PaperCashDepositBlocker.MerchantOptions) PaperCashDepositBlocker.MerchantOptions.ADAPTER.redact(merchantOptions) : null;
                PaperCashDepositBlocker.BarcodeExpiredScreen barcodeExpiredScreen = value.barcode_expired_screen;
                PaperCashDepositBlocker.BarcodeExpiredScreen barcodeExpiredScreen2 = barcodeExpiredScreen != null ? (PaperCashDepositBlocker.BarcodeExpiredScreen) PaperCashDepositBlocker.BarcodeExpiredScreen.ADAPTER.redact(barcodeExpiredScreen) : null;
                PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog = value.limits_reached_dialog;
                PaperCashDepositBlocker.LimitsReachedDialog limitsReachedDialog2 = limitsReachedDialog != null ? (PaperCashDepositBlocker.LimitsReachedDialog) PaperCashDepositBlocker.LimitsReachedDialog.ADAPTER.redact(limitsReachedDialog) : null;
                FormBlocker formBlocker = value.swipe_to_load_blocker;
                FormBlocker formBlocker2 = formBlocker != null ? (FormBlocker) FormBlocker.ADAPTER.redact(formBlocker) : null;
                FormBlocker formBlocker3 = value.deposit_nux_blocker;
                FormBlocker formBlocker4 = formBlocker3 != null ? (FormBlocker) FormBlocker.ADAPTER.redact(formBlocker3) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new PaperCashDepositBlocker(tutorialCarousel2, mapScreen2, searchScreen2, merchantOptions2, barcodeExpiredScreen2, limitsReachedDialog2, formBlocker2, formBlocker4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = FormBlocker.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 8, value.deposit_nux_blocker);
                protoAdapter2.encodeWithTag(writer, 7, value.swipe_to_load_blocker);
                PaperCashDepositBlocker.LimitsReachedDialog.ADAPTER.encodeWithTag(writer, 6, value.limits_reached_dialog);
                PaperCashDepositBlocker.BarcodeExpiredScreen.ADAPTER.encodeWithTag(writer, 5, value.barcode_expired_screen);
                PaperCashDepositBlocker.MerchantOptions.ADAPTER.encodeWithTag(writer, 4, value.merchant_options);
                PaperCashDepositBlocker.SearchScreen.ADAPTER.encodeWithTag(writer, 3, value.search_screen);
                PaperCashDepositBlocker.MapScreen.ADAPTER.encodeWithTag(writer, 2, value.map_screen);
                PaperCashDepositBlocker.TutorialCarousel.ADAPTER.encodeWithTag(writer, 1, value.turorial_carousel);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperCashDepositBlocker(TutorialCarousel tutorialCarousel, MapScreen mapScreen, SearchScreen searchScreen, MerchantOptions merchantOptions, BarcodeExpiredScreen barcodeExpiredScreen, LimitsReachedDialog limitsReachedDialog, FormBlocker formBlocker, FormBlocker formBlocker2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.turorial_carousel = tutorialCarousel;
        this.map_screen = mapScreen;
        this.search_screen = searchScreen;
        this.merchant_options = merchantOptions;
        this.barcode_expired_screen = barcodeExpiredScreen;
        this.limits_reached_dialog = limitsReachedDialog;
        this.swipe_to_load_blocker = formBlocker;
        this.deposit_nux_blocker = formBlocker2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaperCashDepositBlocker)) {
            return false;
        }
        PaperCashDepositBlocker paperCashDepositBlocker = (PaperCashDepositBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), paperCashDepositBlocker.unknownFields()) && Intrinsics.areEqual(this.turorial_carousel, paperCashDepositBlocker.turorial_carousel) && Intrinsics.areEqual(this.map_screen, paperCashDepositBlocker.map_screen) && Intrinsics.areEqual(this.search_screen, paperCashDepositBlocker.search_screen) && Intrinsics.areEqual(this.merchant_options, paperCashDepositBlocker.merchant_options) && Intrinsics.areEqual(this.barcode_expired_screen, paperCashDepositBlocker.barcode_expired_screen) && Intrinsics.areEqual(this.limits_reached_dialog, paperCashDepositBlocker.limits_reached_dialog) && Intrinsics.areEqual(this.swipe_to_load_blocker, paperCashDepositBlocker.swipe_to_load_blocker) && Intrinsics.areEqual(this.deposit_nux_blocker, paperCashDepositBlocker.deposit_nux_blocker);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TutorialCarousel tutorialCarousel = this.turorial_carousel;
        int hashCode2 = (hashCode + (tutorialCarousel != null ? tutorialCarousel.hashCode() : 0)) * 37;
        MapScreen mapScreen = this.map_screen;
        int hashCode3 = (hashCode2 + (mapScreen != null ? mapScreen.hashCode() : 0)) * 37;
        SearchScreen searchScreen = this.search_screen;
        int hashCode4 = (hashCode3 + (searchScreen != null ? searchScreen.hashCode() : 0)) * 37;
        MerchantOptions merchantOptions = this.merchant_options;
        int hashCode5 = (hashCode4 + (merchantOptions != null ? merchantOptions.hashCode() : 0)) * 37;
        BarcodeExpiredScreen barcodeExpiredScreen = this.barcode_expired_screen;
        int hashCode6 = (hashCode5 + (barcodeExpiredScreen != null ? barcodeExpiredScreen.hashCode() : 0)) * 37;
        LimitsReachedDialog limitsReachedDialog = this.limits_reached_dialog;
        int hashCode7 = (hashCode6 + (limitsReachedDialog != null ? limitsReachedDialog.hashCode() : 0)) * 37;
        FormBlocker formBlocker = this.swipe_to_load_blocker;
        int hashCode8 = (hashCode7 + (formBlocker != null ? formBlocker.hashCode() : 0)) * 37;
        FormBlocker formBlocker2 = this.deposit_nux_blocker;
        int hashCode9 = hashCode8 + (formBlocker2 != null ? formBlocker2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.turorial_carousel = this.turorial_carousel;
        builder.map_screen = this.map_screen;
        builder.search_screen = this.search_screen;
        builder.merchant_options = this.merchant_options;
        builder.barcode_expired_screen = this.barcode_expired_screen;
        builder.limits_reached_dialog = this.limits_reached_dialog;
        builder.swipe_to_load_blocker = this.swipe_to_load_blocker;
        builder.deposit_nux_blocker = this.deposit_nux_blocker;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TutorialCarousel tutorialCarousel = this.turorial_carousel;
        if (tutorialCarousel != null) {
            arrayList.add("turorial_carousel=" + tutorialCarousel);
        }
        MapScreen mapScreen = this.map_screen;
        if (mapScreen != null) {
            arrayList.add("map_screen=" + mapScreen);
        }
        SearchScreen searchScreen = this.search_screen;
        if (searchScreen != null) {
            arrayList.add("search_screen=" + searchScreen);
        }
        MerchantOptions merchantOptions = this.merchant_options;
        if (merchantOptions != null) {
            arrayList.add("merchant_options=" + merchantOptions);
        }
        BarcodeExpiredScreen barcodeExpiredScreen = this.barcode_expired_screen;
        if (barcodeExpiredScreen != null) {
            arrayList.add("barcode_expired_screen=" + barcodeExpiredScreen);
        }
        LimitsReachedDialog limitsReachedDialog = this.limits_reached_dialog;
        if (limitsReachedDialog != null) {
            arrayList.add("limits_reached_dialog=" + limitsReachedDialog);
        }
        FormBlocker formBlocker = this.swipe_to_load_blocker;
        if (formBlocker != null) {
            arrayList.add("swipe_to_load_blocker=" + formBlocker);
        }
        FormBlocker formBlocker2 = this.deposit_nux_blocker;
        if (formBlocker2 != null) {
            arrayList.add("deposit_nux_blocker=" + formBlocker2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaperCashDepositBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen$Builder;", "title_text", "", "detail_text", "reload_barcode_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class BarcodeExpiredScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BarcodeExpiredScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String reload_barcode_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "<init>", "()V", "title_text", "", "detail_text", "reload_barcode_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String detail_text;
            public String reload_barcode_button_text;
            public String title_text;

            @Override // com.squareup.wire.Message.Builder
            public BarcodeExpiredScreen build() {
                return new BarcodeExpiredScreen(this.title_text, this.detail_text, this.reload_barcode_button_text, buildUnknownFields());
            }

            public final Builder detail_text(String detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder reload_barcode_button_text(String reload_barcode_button_text) {
                this.reload_barcode_button_text = reload_barcode_button_text;
                return this;
            }

            public final Builder title_text(String title_text) {
                this.title_text = title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BarcodeExpiredScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$BarcodeExpiredScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.BarcodeExpiredScreen decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaperCashDepositBlocker.BarcodeExpiredScreen((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.BarcodeExpiredScreen value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.reload_barcode_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.BarcodeExpiredScreen value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.reload_barcode_button_text) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.BarcodeExpiredScreen redact(PaperCashDepositBlocker.BarcodeExpiredScreen value) {
                    value.getClass();
                    return PaperCashDepositBlocker.BarcodeExpiredScreen.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.BarcodeExpiredScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.reload_barcode_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BarcodeExpiredScreen(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BarcodeExpiredScreen copy$default(BarcodeExpiredScreen barcodeExpiredScreen, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = barcodeExpiredScreen.title_text;
            }
            if ((i & 2) != 0) {
                str2 = barcodeExpiredScreen.detail_text;
            }
            if ((i & 4) != 0) {
                str3 = barcodeExpiredScreen.reload_barcode_button_text;
            }
            if ((i & 8) != 0) {
                byteString = barcodeExpiredScreen.unknownFields();
            }
            return barcodeExpiredScreen.copy(str, str2, str3, byteString);
        }

        public final BarcodeExpiredScreen copy(String title_text, String detail_text, String reload_barcode_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new BarcodeExpiredScreen(title_text, detail_text, reload_barcode_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BarcodeExpiredScreen)) {
                return false;
            }
            BarcodeExpiredScreen barcodeExpiredScreen = (BarcodeExpiredScreen) other;
            return Intrinsics.areEqual(unknownFields(), barcodeExpiredScreen.unknownFields()) && Intrinsics.areEqual(this.title_text, barcodeExpiredScreen.title_text) && Intrinsics.areEqual(this.detail_text, barcodeExpiredScreen.detail_text) && Intrinsics.areEqual(this.reload_barcode_button_text, barcodeExpiredScreen.reload_barcode_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.reload_barcode_button_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title_text = this.title_text;
            builder.detail_text = this.detail_text;
            builder.reload_barcode_button_text = this.reload_barcode_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            String str3 = this.reload_barcode_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "reload_barcode_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BarcodeExpiredScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$BarcodeExpiredScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BarcodeExpiredScreen build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BarcodeExpiredScreen() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodeExpiredScreen(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title_text = str;
            this.detail_text = str2;
            this.reload_barcode_button_text = str3;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog$Builder;", "title_text", "", "detail_text", "dismiss_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class LimitsReachedDialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitsReachedDialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String dismiss_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "<init>", "()V", "title_text", "", "detail_text", "dismiss_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String detail_text;
            public String dismiss_button_text;
            public String title_text;

            @Override // com.squareup.wire.Message.Builder
            public LimitsReachedDialog build() {
                return new LimitsReachedDialog(this.title_text, this.detail_text, this.dismiss_button_text, buildUnknownFields());
            }

            public final Builder detail_text(String detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder dismiss_button_text(String dismiss_button_text) {
                this.dismiss_button_text = dismiss_button_text;
                return this;
            }

            public final Builder title_text(String title_text) {
                this.title_text = title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LimitsReachedDialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$LimitsReachedDialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.LimitsReachedDialog decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaperCashDepositBlocker.LimitsReachedDialog((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.LimitsReachedDialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.LimitsReachedDialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.dismiss_button_text) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.LimitsReachedDialog redact(PaperCashDepositBlocker.LimitsReachedDialog value) {
                    value.getClass();
                    return PaperCashDepositBlocker.LimitsReachedDialog.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.LimitsReachedDialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LimitsReachedDialog(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LimitsReachedDialog copy$default(LimitsReachedDialog limitsReachedDialog, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitsReachedDialog.title_text;
            }
            if ((i & 2) != 0) {
                str2 = limitsReachedDialog.detail_text;
            }
            if ((i & 4) != 0) {
                str3 = limitsReachedDialog.dismiss_button_text;
            }
            if ((i & 8) != 0) {
                byteString = limitsReachedDialog.unknownFields();
            }
            return limitsReachedDialog.copy(str, str2, str3, byteString);
        }

        public final LimitsReachedDialog copy(String title_text, String detail_text, String dismiss_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new LimitsReachedDialog(title_text, detail_text, dismiss_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LimitsReachedDialog)) {
                return false;
            }
            LimitsReachedDialog limitsReachedDialog = (LimitsReachedDialog) other;
            return Intrinsics.areEqual(unknownFields(), limitsReachedDialog.unknownFields()) && Intrinsics.areEqual(this.title_text, limitsReachedDialog.title_text) && Intrinsics.areEqual(this.detail_text, limitsReachedDialog.detail_text) && Intrinsics.areEqual(this.dismiss_button_text, limitsReachedDialog.dismiss_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dismiss_button_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title_text = this.title_text;
            builder.detail_text = this.detail_text;
            builder.dismiss_button_text = this.dismiss_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            String str3 = this.dismiss_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismiss_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsReachedDialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$LimitsReachedDialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LimitsReachedDialog build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LimitsReachedDialog() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitsReachedDialog(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title_text = str;
            this.detail_text = str2;
            this.dismiss_button_text = str3;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions$Builder;", "directions_button_text", "", "show_barcode_button_text", "copy_address_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MerchantOptions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MerchantOptions> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String copy_address_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String directions_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String show_barcode_button_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "<init>", "()V", "directions_button_text", "", "show_barcode_button_text", "copy_address_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String copy_address_button_text;
            public String directions_button_text;
            public String show_barcode_button_text;

            @Override // com.squareup.wire.Message.Builder
            public MerchantOptions build() {
                return new MerchantOptions(this.directions_button_text, this.show_barcode_button_text, this.copy_address_button_text, buildUnknownFields());
            }

            public final Builder copy_address_button_text(String copy_address_button_text) {
                this.copy_address_button_text = copy_address_button_text;
                return this;
            }

            public final Builder directions_button_text(String directions_button_text) {
                this.directions_button_text = directions_button_text;
                return this;
            }

            public final Builder show_barcode_button_text(String show_barcode_button_text) {
                this.show_barcode_button_text = show_barcode_button_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MerchantOptions.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$MerchantOptions$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.MerchantOptions decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaperCashDepositBlocker.MerchantOptions((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.MerchantOptions value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.directions_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.show_barcode_button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.copy_address_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.MerchantOptions value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.copy_address_button_text) + protoAdapter2.encodedSizeWithTag(2, value.show_barcode_button_text) + protoAdapter2.encodedSizeWithTag(1, value.directions_button_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.MerchantOptions redact(PaperCashDepositBlocker.MerchantOptions value) {
                    value.getClass();
                    return PaperCashDepositBlocker.MerchantOptions.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.MerchantOptions value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.copy_address_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.show_barcode_button_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.directions_button_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ MerchantOptions(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MerchantOptions copy$default(MerchantOptions merchantOptions, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantOptions.directions_button_text;
            }
            if ((i & 2) != 0) {
                str2 = merchantOptions.show_barcode_button_text;
            }
            if ((i & 4) != 0) {
                str3 = merchantOptions.copy_address_button_text;
            }
            if ((i & 8) != 0) {
                byteString = merchantOptions.unknownFields();
            }
            return merchantOptions.copy(str, str2, str3, byteString);
        }

        public final MerchantOptions copy(String directions_button_text, String show_barcode_button_text, String copy_address_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new MerchantOptions(directions_button_text, show_barcode_button_text, copy_address_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MerchantOptions)) {
                return false;
            }
            MerchantOptions merchantOptions = (MerchantOptions) other;
            return Intrinsics.areEqual(unknownFields(), merchantOptions.unknownFields()) && Intrinsics.areEqual(this.directions_button_text, merchantOptions.directions_button_text) && Intrinsics.areEqual(this.show_barcode_button_text, merchantOptions.show_barcode_button_text) && Intrinsics.areEqual(this.copy_address_button_text, merchantOptions.copy_address_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.directions_button_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.show_barcode_button_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.copy_address_button_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.directions_button_text = this.directions_button_text;
            builder.show_barcode_button_text = this.show_barcode_button_text;
            builder.copy_address_button_text = this.copy_address_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.directions_button_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "directions_button_text=", arrayList);
            }
            String str2 = this.show_barcode_button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "show_barcode_button_text=", arrayList);
            }
            String str3 = this.copy_address_button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "copy_address_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantOptions{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$MerchantOptions;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MerchantOptions build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public MerchantOptions() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantOptions(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.directions_button_text = str;
            this.show_barcode_button_text = str2;
            this.copy_address_button_text = str3;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen$Builder;", "search_bar_placeholder", "", "explanation_title_text", "explanation_detail_text", "recent_section_header_text", "results_section_header_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SearchScreen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SearchScreen> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String explanation_detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String explanation_title_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String recent_section_header_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String results_section_header_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String search_bar_placeholder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "<init>", "()V", "search_bar_placeholder", "", "explanation_title_text", "explanation_detail_text", "recent_section_header_text", "results_section_header_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String explanation_detail_text;
            public String explanation_title_text;
            public String recent_section_header_text;
            public String results_section_header_text;
            public String search_bar_placeholder;

            @Override // com.squareup.wire.Message.Builder
            public SearchScreen build() {
                return new SearchScreen(this.search_bar_placeholder, this.explanation_title_text, this.explanation_detail_text, this.recent_section_header_text, this.results_section_header_text, buildUnknownFields());
            }

            public final Builder explanation_detail_text(String explanation_detail_text) {
                this.explanation_detail_text = explanation_detail_text;
                return this;
            }

            public final Builder explanation_title_text(String explanation_title_text) {
                this.explanation_title_text = explanation_title_text;
                return this;
            }

            public final Builder recent_section_header_text(String recent_section_header_text) {
                this.recent_section_header_text = recent_section_header_text;
                return this;
            }

            public final Builder results_section_header_text(String results_section_header_text) {
                this.results_section_header_text = results_section_header_text;
                return this;
            }

            public final Builder search_bar_placeholder(String search_bar_placeholder) {
                this.search_bar_placeholder = search_bar_placeholder;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SearchScreen.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$SearchScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.SearchScreen decode(ProtoReader reader) {
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
                            return new PaperCashDepositBlocker.SearchScreen((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.SearchScreen value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.search_bar_placeholder);
                    protoAdapter2.encodeWithTag(writer, 2, value.explanation_title_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.explanation_detail_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.recent_section_header_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.results_section_header_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.SearchScreen value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.results_section_header_text) + protoAdapter2.encodedSizeWithTag(4, value.recent_section_header_text) + protoAdapter2.encodedSizeWithTag(3, value.explanation_detail_text) + protoAdapter2.encodedSizeWithTag(2, value.explanation_title_text) + protoAdapter2.encodedSizeWithTag(1, value.search_bar_placeholder) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.SearchScreen redact(PaperCashDepositBlocker.SearchScreen value) {
                    value.getClass();
                    return PaperCashDepositBlocker.SearchScreen.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.SearchScreen value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.results_section_header_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.recent_section_header_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.explanation_detail_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.explanation_title_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.search_bar_placeholder);
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
                str = searchScreen.search_bar_placeholder;
            }
            if ((i & 2) != 0) {
                str2 = searchScreen.explanation_title_text;
            }
            if ((i & 4) != 0) {
                str3 = searchScreen.explanation_detail_text;
            }
            if ((i & 8) != 0) {
                str4 = searchScreen.recent_section_header_text;
            }
            if ((i & 16) != 0) {
                str5 = searchScreen.results_section_header_text;
            }
            if ((i & 32) != 0) {
                byteString = searchScreen.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            return searchScreen.copy(str, str2, str3, str4, str6, byteString2);
        }

        public final SearchScreen copy(String search_bar_placeholder, String explanation_title_text, String explanation_detail_text, String recent_section_header_text, String results_section_header_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new SearchScreen(search_bar_placeholder, explanation_title_text, explanation_detail_text, recent_section_header_text, results_section_header_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SearchScreen)) {
                return false;
            }
            SearchScreen searchScreen = (SearchScreen) other;
            return Intrinsics.areEqual(unknownFields(), searchScreen.unknownFields()) && Intrinsics.areEqual(this.search_bar_placeholder, searchScreen.search_bar_placeholder) && Intrinsics.areEqual(this.explanation_title_text, searchScreen.explanation_title_text) && Intrinsics.areEqual(this.explanation_detail_text, searchScreen.explanation_detail_text) && Intrinsics.areEqual(this.recent_section_header_text, searchScreen.recent_section_header_text) && Intrinsics.areEqual(this.results_section_header_text, searchScreen.results_section_header_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.search_bar_placeholder;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.explanation_title_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.explanation_detail_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.recent_section_header_text;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.results_section_header_text;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.search_bar_placeholder = this.search_bar_placeholder;
            builder.explanation_title_text = this.explanation_title_text;
            builder.explanation_detail_text = this.explanation_detail_text;
            builder.recent_section_header_text = this.recent_section_header_text;
            builder.results_section_header_text = this.results_section_header_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.search_bar_placeholder;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "search_bar_placeholder=", arrayList);
            }
            String str2 = this.explanation_title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "explanation_title_text=", arrayList);
            }
            String str3 = this.explanation_detail_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "explanation_detail_text=", arrayList);
            }
            String str4 = this.recent_section_header_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "recent_section_header_text=", arrayList);
            }
            String str5 = this.results_section_header_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "results_section_header_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SearchScreen{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$SearchScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this.search_bar_placeholder = str;
            this.explanation_title_text = str2;
            this.explanation_detail_text = str3;
            this.recent_section_header_text = str4;
            this.results_section_header_text = str5;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0007H\u0016J8\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Builder;", "pages", "", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "next_page_button_text", "", "submit_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Page", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TutorialCarousel extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TutorialCarousel> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String next_page_button_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel$Page#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Page> pages;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String submit_button_text;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "<init>", "()V", "pages", "", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "next_page_button_text", "", "submit_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String next_page_button_text;
            public List<Page> pages = EmptyList.INSTANCE;
            public String submit_button_text;

            @Override // com.squareup.wire.Message.Builder
            public TutorialCarousel build() {
                return new TutorialCarousel(this.pages, this.next_page_button_text, this.submit_button_text, buildUnknownFields());
            }

            public final Builder next_page_button_text(String next_page_button_text) {
                this.next_page_button_text = next_page_button_text;
                return this;
            }

            public final Builder pages(List<Page> pages) {
                pages.getClass();
                TransactorKt.checkElementsNotNull(pages);
                this.pages = pages;
                return this;
            }

            public final Builder submit_button_text(String submit_button_text) {
                this.submit_button_text = submit_button_text;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aBE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0006H\u0016JD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Builder;", "illustration", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration;", "title", "", "description", "elements", "", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Illustration", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Page extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Page> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String description;

            @WireField(adapter = "squareup.cash.bankingbenefits.ui.BenefitExplainerScreen$Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
            public final List<BenefitExplainerScreen.Element> elements;

            @WireField(adapter = "com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel$Page$Illustration#ADAPTER", schemaIndex = 0, tag = 1)
            public final Illustration illustration;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String title;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "<init>", "()V", "illustration", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration;", "title", "", "description", "elements", "", "Lsquareup/cash/bankingbenefits/ui/BenefitExplainerScreen$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String description;
                public List<BenefitExplainerScreen.Element> elements = EmptyList.INSTANCE;
                public Illustration illustration;
                public String title;

                @Override // com.squareup.wire.Message.Builder
                public Page build() {
                    return new Page(this.illustration, this.title, this.description, this.elements, buildUnknownFields());
                }

                public final Builder description(String description) {
                    this.description = description;
                    return this;
                }

                public final Builder elements(List<BenefitExplainerScreen.Element> elements) {
                    elements.getClass();
                    TransactorKt.checkElementsNotNull(elements);
                    this.elements = elements;
                    return this;
                }

                public final Builder illustration(Illustration illustration) {
                    this.illustration = illustration;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Page.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel$Page$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaperCashDepositBlocker.TutorialCarousel.Page decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaperCashDepositBlocker.TutorialCarousel.Page((PaperCashDepositBlocker.TutorialCarousel.Page.Illustration) obj, (String) obj2, (String) obj3, m, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                try {
                                    obj = PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                m.add(BenefitExplainerScreen.Element.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PaperCashDepositBlocker.TutorialCarousel.Page value) {
                        writer.getClass();
                        value.getClass();
                        PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.ADAPTER.encodeWithTag(writer, 1, value.illustration);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        BenefitExplainerScreen.Element.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.elements);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaperCashDepositBlocker.TutorialCarousel.Page value) {
                        value.getClass();
                        int encodedSizeWithTag = PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.ADAPTER.encodedSizeWithTag(1, value.illustration) + value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return BenefitExplainerScreen.Element.ADAPTER.asRepeated().encodedSizeWithTag(4, value.elements) + protoAdapter2.encodedSizeWithTag(3, value.description) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaperCashDepositBlocker.TutorialCarousel.Page redact(PaperCashDepositBlocker.TutorialCarousel.Page value) {
                        value.getClass();
                        return PaperCashDepositBlocker.TutorialCarousel.Page.copy$default(value, null, null, null, TransactorKt.m1169redactElements(value.elements, BenefitExplainerScreen.Element.ADAPTER), ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.TutorialCarousel.Page value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BenefitExplainerScreen.Element.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.elements);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.description);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.ADAPTER.encodeWithTag(writer, 1, value.illustration);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public Page(Illustration illustration, String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : illustration, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Page copy$default(Page page, Illustration illustration, String str, String str2, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    illustration = page.illustration;
                }
                if ((i & 2) != 0) {
                    str = page.title;
                }
                if ((i & 4) != 0) {
                    str2 = page.description;
                }
                if ((i & 8) != 0) {
                    list = page.elements;
                }
                if ((i & 16) != 0) {
                    byteString = page.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str3 = str2;
                return page.copy(illustration, str, str3, list, byteString2);
            }

            public final Page copy(Illustration illustration, String title, String description, List<BenefitExplainerScreen.Element> elements, ByteString unknownFields) {
                elements.getClass();
                unknownFields.getClass();
                return new Page(illustration, title, description, elements, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Page)) {
                    return false;
                }
                Page page = (Page) other;
                return Intrinsics.areEqual(unknownFields(), page.unknownFields()) && this.illustration == page.illustration && Intrinsics.areEqual(this.title, page.title) && Intrinsics.areEqual(this.description, page.description) && Intrinsics.areEqual(this.elements, page.elements);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Illustration illustration = this.illustration;
                int hashCode2 = (hashCode + (illustration != null ? illustration.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.description;
                int hashCode4 = this.elements.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.illustration = this.illustration;
                builder.title = this.title;
                builder.description = this.description;
                builder.elements = this.elements;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Illustration illustration = this.illustration;
                if (illustration != null) {
                    arrayList.add("illustration=" + illustration);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.description;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
                }
                if (!this.elements.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Page{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FIND_A_LOCATION", "SHOW_THE_BARCODE", "GIVE_CASH_TO_CASHIER", "SWIPE_TO_DEPOSIT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Illustration implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Illustration[] $VALUES;
                public static final ProtoAdapter ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private final int value;
                public static final Illustration FIND_A_LOCATION = new Illustration("FIND_A_LOCATION", 0, 1);
                public static final Illustration SHOW_THE_BARCODE = new Illustration("SHOW_THE_BARCODE", 1, 2);
                public static final Illustration GIVE_CASH_TO_CASHIER = new Illustration("GIVE_CASH_TO_CASHIER", 2, 3);
                public static final Illustration SWIPE_TO_DEPOSIT = new Illustration("SWIPE_TO_DEPOSIT", 3, 4);

                private static final /* synthetic */ Illustration[] $values() {
                    return new Illustration[]{FIND_A_LOCATION, SHOW_THE_BARCODE, GIVE_CASH_TO_CASHIER, SWIPE_TO_DEPOSIT};
                }

                static {
                    Illustration[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Illustration.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel$Page$Illustration$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public PaperCashDepositBlocker.TutorialCarousel.Page.Illustration fromValue(int value) {
                            return PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.INSTANCE.fromValue(value);
                        }
                    };
                }

                private Illustration(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final Illustration fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static Illustration valueOf(String str) {
                    return (Illustration) Enum.valueOf(Illustration.class, str);
                }

                public static Illustration[] values() {
                    return (Illustration[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Illustration;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final Illustration fromValue(int value) {
                        if (value == 1) {
                            return Illustration.FIND_A_LOCATION;
                        }
                        if (value == 2) {
                            return Illustration.SHOW_THE_BARCODE;
                        }
                        if (value == 3) {
                            return Illustration.GIVE_CASH_TO_CASHIER;
                        }
                        if (value != 4) {
                            return null;
                        }
                        return Illustration.SWIPE_TO_DEPOSIT;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Page;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Page build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Page() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Page(Illustration illustration, String str, String str2, List<BenefitExplainerScreen.Element> list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.illustration = illustration;
                this.title = str;
                this.description = str2;
                this.elements = TransactorKt.immutableCopyOf("elements", list);
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TutorialCarousel.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaperCashDepositBlocker$TutorialCarousel$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.TutorialCarousel decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaperCashDepositBlocker.TutorialCarousel(m, (String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(PaperCashDepositBlocker.TutorialCarousel.Page.ADAPTER.decode(reader));
                        } else if (nextTag == 2) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaperCashDepositBlocker.TutorialCarousel value) {
                    writer.getClass();
                    value.getClass();
                    PaperCashDepositBlocker.TutorialCarousel.Page.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pages);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.next_page_button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaperCashDepositBlocker.TutorialCarousel value) {
                    value.getClass();
                    int encodedSizeWithTag = PaperCashDepositBlocker.TutorialCarousel.Page.ADAPTER.asRepeated().encodedSizeWithTag(1, value.pages) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.submit_button_text) + protoAdapter2.encodedSizeWithTag(2, value.next_page_button_text) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaperCashDepositBlocker.TutorialCarousel redact(PaperCashDepositBlocker.TutorialCarousel value) {
                    value.getClass();
                    return PaperCashDepositBlocker.TutorialCarousel.copy$default(value, TransactorKt.m1169redactElements(value.pages, PaperCashDepositBlocker.TutorialCarousel.Page.ADAPTER), null, null, ByteString.EMPTY, 6, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaperCashDepositBlocker.TutorialCarousel value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.next_page_button_text);
                    PaperCashDepositBlocker.TutorialCarousel.Page.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pages);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public TutorialCarousel(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TutorialCarousel copy$default(TutorialCarousel tutorialCarousel, List list, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tutorialCarousel.pages;
            }
            if ((i & 2) != 0) {
                str = tutorialCarousel.next_page_button_text;
            }
            if ((i & 4) != 0) {
                str2 = tutorialCarousel.submit_button_text;
            }
            if ((i & 8) != 0) {
                byteString = tutorialCarousel.unknownFields();
            }
            return tutorialCarousel.copy(list, str, str2, byteString);
        }

        public final TutorialCarousel copy(List<Page> pages, String next_page_button_text, String submit_button_text, ByteString unknownFields) {
            pages.getClass();
            unknownFields.getClass();
            return new TutorialCarousel(pages, next_page_button_text, submit_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TutorialCarousel)) {
                return false;
            }
            TutorialCarousel tutorialCarousel = (TutorialCarousel) other;
            return Intrinsics.areEqual(unknownFields(), tutorialCarousel.unknownFields()) && Intrinsics.areEqual(this.pages, tutorialCarousel.pages) && Intrinsics.areEqual(this.next_page_button_text, tutorialCarousel.next_page_button_text) && Intrinsics.areEqual(this.submit_button_text, tutorialCarousel.submit_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.pages);
            String str = this.next_page_button_text;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.submit_button_text;
            int hashCode2 = hashCode + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.pages = this.pages;
            builder.next_page_button_text = this.next_page_button_text;
            builder.submit_button_text = this.submit_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.pages.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("pages=", arrayList, this.pages);
            }
            String str = this.next_page_button_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_page_button_text=", arrayList);
            }
            String str2 = this.submit_button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "submit_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TutorialCarousel{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$TutorialCarousel;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TutorialCarousel build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TutorialCarousel() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TutorialCarousel(List<Page> list, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.next_page_button_text = str;
            this.submit_button_text = str2;
            this.pages = TransactorKt.immutableCopyOf("pages", list);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaperCashDepositBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaperCashDepositBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
