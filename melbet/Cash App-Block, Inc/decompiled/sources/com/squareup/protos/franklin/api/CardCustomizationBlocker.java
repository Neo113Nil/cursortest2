package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.whimsicard.app.Stamp;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.cards.CardCustomizationControlsTheme;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.PaymentMethod;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006'&()*+R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006,"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$Builder;", "", "style_picker_title_text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_style_picker_title_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "style_picker_short_title_text", "localized_style_picker_short_title_text", "customization_prompt_text", "localized_customization_prompt_text", "cashtag_toggle_text", "localized_cashtag_toggle_text", "customization_title_text", "localized_customization_title_text", "stamp_added_text", "localized_stamp_added_text", "return_to_draw_mode_text", "localized_return_to_draw_mode_text", "too_much_ink_message", "localized_too_much_ink_message", "", "maximum_ink_coverage", "Ljava/lang/Float;", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "customization_area", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "formatted_cashtag", "selected_card_option_identifier", "inputted_legal_name", "", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "card_option_sections", "Ljava/util/List;", "Lcom/squareup/protos/cash/whimsicard/app/Stamp;", "available_stamps", "Companion", "Builder", "PreviewHalfSheetContent", "CardPreviewText", "CardOption", "CardOptionSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardCustomizationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardCustomizationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.whimsicard.app.Stamp#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 23)
    public final List<Stamp> available_stamps;

    @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOptionSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 17, tag = 10)
    public final List<CardOptionSection> card_option_sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 4)
    public final String cashtag_toggle_text;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardCustomizationData$CustomizationArea#ADAPTER", schemaIndex = 18, tag = 11)
    public final CardCustomizationData.CustomizationArea customization_area;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 3)
    public final String customization_prompt_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 5)
    public final String customization_title_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 19, tag = 12)
    public final String formatted_cashtag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 21, tag = 22)
    public final String inputted_legal_name;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 7, tag = 17)
    public final LocalizableString localized_cashtag_toggle_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 5, tag = 16)
    public final LocalizableString localized_customization_prompt_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 9, tag = 18)
    public final LocalizableString localized_customization_title_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 13, tag = 20)
    public final LocalizableString localized_return_to_draw_mode_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 11, tag = 19)
    public final LocalizableString localized_stamp_added_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 15)
    public final LocalizableString localized_style_picker_short_title_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 14)
    public final LocalizableString localized_style_picker_title_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 15, tag = 21)
    public final LocalizableString localized_too_much_ink_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 16, tag = 9)
    public final Float maximum_ink_coverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 7)
    public final String return_to_draw_mode_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 13)
    public final String selected_card_option_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 6)
    public final String stamp_added_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 2)
    public final String style_picker_short_title_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String style_picker_title_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 8)
    public final String too_much_ink_message;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010$J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001bJ\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker;", "<init>", "()V", "style_picker_title_text", "", "localized_style_picker_title_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "style_picker_short_title_text", "localized_style_picker_short_title_text", "customization_prompt_text", "localized_customization_prompt_text", "cashtag_toggle_text", "localized_cashtag_toggle_text", "customization_title_text", "localized_customization_title_text", "stamp_added_text", "localized_stamp_added_text", "return_to_draw_mode_text", "localized_return_to_draw_mode_text", "too_much_ink_message", "localized_too_much_ink_message", "maximum_ink_coverage", "", "Ljava/lang/Float;", "card_option_sections", "", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "customization_area", "Lcom/squareup/protos/franklin/cards/CardCustomizationData$CustomizationArea;", "formatted_cashtag", "selected_card_option_identifier", "inputted_legal_name", "available_stamps", "Lcom/squareup/protos/cash/whimsicard/app/Stamp;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<Stamp> available_stamps;
        public List<CardOptionSection> card_option_sections;
        public String cashtag_toggle_text;
        public CardCustomizationData.CustomizationArea customization_area;
        public String customization_prompt_text;
        public String customization_title_text;
        public String formatted_cashtag;
        public String inputted_legal_name;
        public LocalizableString localized_cashtag_toggle_text;
        public LocalizableString localized_customization_prompt_text;
        public LocalizableString localized_customization_title_text;
        public LocalizableString localized_return_to_draw_mode_text;
        public LocalizableString localized_stamp_added_text;
        public LocalizableString localized_style_picker_short_title_text;
        public LocalizableString localized_style_picker_title_text;
        public LocalizableString localized_too_much_ink_message;
        public Float maximum_ink_coverage;
        public String return_to_draw_mode_text;
        public String selected_card_option_identifier;
        public String stamp_added_text;
        public String style_picker_short_title_text;
        public String style_picker_title_text;
        public String too_much_ink_message;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.card_option_sections = emptyList;
            this.available_stamps = emptyList;
        }

        public final Builder available_stamps(List<Stamp> available_stamps) {
            available_stamps.getClass();
            TransactorKt.checkElementsNotNull(available_stamps);
            this.available_stamps = available_stamps;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardCustomizationBlocker build() {
            return new CardCustomizationBlocker(this.style_picker_title_text, this.localized_style_picker_title_text, this.style_picker_short_title_text, this.localized_style_picker_short_title_text, this.customization_prompt_text, this.localized_customization_prompt_text, this.cashtag_toggle_text, this.localized_cashtag_toggle_text, this.customization_title_text, this.localized_customization_title_text, this.stamp_added_text, this.localized_stamp_added_text, this.return_to_draw_mode_text, this.localized_return_to_draw_mode_text, this.too_much_ink_message, this.localized_too_much_ink_message, this.maximum_ink_coverage, this.card_option_sections, this.customization_area, this.formatted_cashtag, this.selected_card_option_identifier, this.inputted_legal_name, this.available_stamps, buildUnknownFields());
        }

        public final Builder card_option_sections(List<CardOptionSection> card_option_sections) {
            card_option_sections.getClass();
            TransactorKt.checkElementsNotNull(card_option_sections);
            this.card_option_sections = card_option_sections;
            return this;
        }

        public final Builder cashtag_toggle_text(String cashtag_toggle_text) {
            this.cashtag_toggle_text = cashtag_toggle_text;
            return this;
        }

        public final Builder customization_area(CardCustomizationData.CustomizationArea customization_area) {
            this.customization_area = customization_area;
            return this;
        }

        public final Builder customization_prompt_text(String customization_prompt_text) {
            this.customization_prompt_text = customization_prompt_text;
            return this;
        }

        public final Builder customization_title_text(String customization_title_text) {
            this.customization_title_text = customization_title_text;
            return this;
        }

        public final Builder formatted_cashtag(String formatted_cashtag) {
            this.formatted_cashtag = formatted_cashtag;
            return this;
        }

        public final Builder inputted_legal_name(String inputted_legal_name) {
            this.inputted_legal_name = inputted_legal_name;
            return this;
        }

        public final Builder localized_cashtag_toggle_text(LocalizableString localized_cashtag_toggle_text) {
            this.localized_cashtag_toggle_text = localized_cashtag_toggle_text;
            return this;
        }

        public final Builder localized_customization_prompt_text(LocalizableString localized_customization_prompt_text) {
            this.localized_customization_prompt_text = localized_customization_prompt_text;
            return this;
        }

        public final Builder localized_customization_title_text(LocalizableString localized_customization_title_text) {
            this.localized_customization_title_text = localized_customization_title_text;
            return this;
        }

        public final Builder localized_return_to_draw_mode_text(LocalizableString localized_return_to_draw_mode_text) {
            this.localized_return_to_draw_mode_text = localized_return_to_draw_mode_text;
            return this;
        }

        public final Builder localized_stamp_added_text(LocalizableString localized_stamp_added_text) {
            this.localized_stamp_added_text = localized_stamp_added_text;
            return this;
        }

        public final Builder localized_style_picker_short_title_text(LocalizableString localized_style_picker_short_title_text) {
            this.localized_style_picker_short_title_text = localized_style_picker_short_title_text;
            return this;
        }

        public final Builder localized_style_picker_title_text(LocalizableString localized_style_picker_title_text) {
            this.localized_style_picker_title_text = localized_style_picker_title_text;
            return this;
        }

        public final Builder localized_too_much_ink_message(LocalizableString localized_too_much_ink_message) {
            this.localized_too_much_ink_message = localized_too_much_ink_message;
            return this;
        }

        public final Builder maximum_ink_coverage(Float maximum_ink_coverage) {
            this.maximum_ink_coverage = maximum_ink_coverage;
            return this;
        }

        public final Builder return_to_draw_mode_text(String return_to_draw_mode_text) {
            this.return_to_draw_mode_text = return_to_draw_mode_text;
            return this;
        }

        public final Builder selected_card_option_identifier(String selected_card_option_identifier) {
            this.selected_card_option_identifier = selected_card_option_identifier;
            return this;
        }

        public final Builder stamp_added_text(String stamp_added_text) {
            this.stamp_added_text = stamp_added_text;
            return this;
        }

        public final Builder style_picker_short_title_text(String style_picker_short_title_text) {
            this.style_picker_short_title_text = style_picker_short_title_text;
            return this;
        }

        public final Builder style_picker_title_text(String style_picker_title_text) {
            this.style_picker_title_text = style_picker_title_text;
            return this;
        }

        public final Builder too_much_ink_message(String too_much_ink_message) {
            this.too_much_ink_message = too_much_ink_message;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000589:;<B\u0099\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010/\u001a\u00020\u0002H\u0016J\u0014\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0082\u0004J\n\u00103\u001a\u000204H\u0096\u0080\u0004J\b\u00105\u001a\u00020\bH\u0016J\u009d\u0002\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0002\u00107R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b)\u0010*R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u0012\u0004\b+\u0010*R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010,R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b-\u0010*R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b.\u0010*R\u0012\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$Builder;", "card_theme", "Lcom/squareup/protos/franklin/cards/CardTheme;", "controls_theme", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "intro_text", "", "localized_intro_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "title", "localized_title", "detail_text", "localized_detail_text", "accessibility_label", "cashtag_eligible", "", "customization_eligible", "accessibility_text", "localized_accessibility_text", "card_preview_text", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "customization_area", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;", "cashtag_display", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;", "presentationStyle", "Lcom/squareup/protos/franklin/api/CardPresentationStyle;", "card_availability", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;", "identifier", "external_identifier", "intro_text_color", "Lcom/squareup/protos/cash/ui/Color;", "payment_method", "Lcom/squareup/protos/franklin/cards/PaymentMethod;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/cards/CardTheme;Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;Lcom/squareup/protos/franklin/api/CardPresentationStyle;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/cards/PaymentMethod;Lokio/ByteString;)V", "getAccessibility_label$annotations", "()V", "getCashtag_eligible$annotations", "Ljava/lang/Boolean;", "getCustomization_area$annotations", "getIdentifier$annotations", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/franklin/cards/CardTheme;Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;Lcom/squareup/protos/franklin/api/CardPresentationStyle;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/cards/PaymentMethod;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "Builder", "Companion", "CustomizationArea", "CashtagDisplay", "CardAvailability", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CardOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 5)
        public final String accessibility_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 8)
        public final String accessibility_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CardAvailability#ADAPTER", schemaIndex = 17, tag = 14)
        public final CardAvailability card_availability;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardPreviewText#ADAPTER", schemaIndex = 13, tag = 9)
        public final CardPreviewText card_preview_text;

        @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme#ADAPTER", schemaIndex = 0, tag = 1)
        public final CardTheme card_theme;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CashtagDisplay#ADAPTER", schemaIndex = 15, tag = 11)
        public final CashtagDisplay cashtag_display;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 6)
        public final Boolean cashtag_eligible;

        @WireField(adapter = "com.squareup.protos.franklin.cards.CardCustomizationControlsTheme#ADAPTER", schemaIndex = 1, tag = 2)
        public final CardCustomizationControlsTheme controls_theme;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CustomizationArea#ADAPTER", schemaIndex = 14, tag = 10)
        public final CustomizationArea customization_area;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 7)
        public final Boolean customization_eligible;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 4)
        public final String detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 16)
        public final String external_identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 15)
        public final String identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 13)
        public final String intro_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 20, tag = 21)
        public final Color intro_text_color;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 12, tag = 20)
        public final LocalizableString localized_accessibility_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 7, tag = 19)
        public final LocalizableString localized_detail_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 17)
        public final LocalizableString localized_intro_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 5, tag = 18)
        public final LocalizableString localized_title;

        @WireField(adapter = "com.squareup.protos.franklin.cards.PaymentMethod#ADAPTER", schemaIndex = 21, tag = 22)
        public final PaymentMethod payment_method;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardPresentationStyle#ADAPTER", schemaIndex = 16, tag = 12)
        public final CardPresentationStyle presentationStyle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 3)
        public final String title;

        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010(J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010(J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0012\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\nJ\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\b\u0010)\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "<init>", "()V", "card_theme", "Lcom/squareup/protos/franklin/cards/CardTheme;", "controls_theme", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "intro_text", "", "localized_intro_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "title", "localized_title", "detail_text", "localized_detail_text", "accessibility_label", "cashtag_eligible", "", "Ljava/lang/Boolean;", "customization_eligible", "accessibility_text", "localized_accessibility_text", "card_preview_text", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "customization_area", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;", "cashtag_display", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;", "presentationStyle", "Lcom/squareup/protos/franklin/api/CardPresentationStyle;", "card_availability", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;", "identifier", "external_identifier", "intro_text_color", "Lcom/squareup/protos/cash/ui/Color;", "payment_method", "Lcom/squareup/protos/franklin/cards/PaymentMethod;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String accessibility_label;
            public String accessibility_text;
            public CardAvailability card_availability;
            public CardPreviewText card_preview_text;
            public CardTheme card_theme;
            public CashtagDisplay cashtag_display;
            public Boolean cashtag_eligible;
            public CardCustomizationControlsTheme controls_theme;
            public CustomizationArea customization_area;
            public Boolean customization_eligible;
            public String detail_text;
            public String external_identifier;
            public String identifier;
            public String intro_text;
            public Color intro_text_color;
            public LocalizableString localized_accessibility_text;
            public LocalizableString localized_detail_text;
            public LocalizableString localized_intro_text;
            public LocalizableString localized_title;
            public PaymentMethod payment_method;
            public CardPresentationStyle presentationStyle;
            public String title;

            @Deprecated
            public final Builder accessibility_label(String accessibility_label) {
                this.accessibility_label = accessibility_label;
                return this;
            }

            public final Builder accessibility_text(String accessibility_text) {
                this.accessibility_text = accessibility_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public CardOption build() {
                return new CardOption(this.card_theme, this.controls_theme, this.intro_text, this.localized_intro_text, this.title, this.localized_title, this.detail_text, this.localized_detail_text, this.accessibility_label, this.cashtag_eligible, this.customization_eligible, this.accessibility_text, this.localized_accessibility_text, this.card_preview_text, this.customization_area, this.cashtag_display, this.presentationStyle, this.card_availability, this.identifier, this.external_identifier, this.intro_text_color, this.payment_method, buildUnknownFields());
            }

            public final Builder card_availability(CardAvailability card_availability) {
                this.card_availability = card_availability;
                return this;
            }

            public final Builder card_preview_text(CardPreviewText card_preview_text) {
                this.card_preview_text = card_preview_text;
                return this;
            }

            public final Builder card_theme(CardTheme card_theme) {
                this.card_theme = card_theme;
                return this;
            }

            public final Builder cashtag_display(CashtagDisplay cashtag_display) {
                this.cashtag_display = cashtag_display;
                return this;
            }

            @Deprecated
            public final Builder cashtag_eligible(Boolean cashtag_eligible) {
                this.cashtag_eligible = cashtag_eligible;
                return this;
            }

            public final Builder controls_theme(CardCustomizationControlsTheme controls_theme) {
                this.controls_theme = controls_theme;
                return this;
            }

            @Deprecated
            public final Builder customization_area(CustomizationArea customization_area) {
                this.customization_area = customization_area;
                return this;
            }

            public final Builder customization_eligible(Boolean customization_eligible) {
                this.customization_eligible = customization_eligible;
                return this;
            }

            public final Builder detail_text(String detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder external_identifier(String external_identifier) {
                this.external_identifier = external_identifier;
                return this;
            }

            @Deprecated
            public final Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public final Builder intro_text(String intro_text) {
                this.intro_text = intro_text;
                return this;
            }

            public final Builder intro_text_color(Color intro_text_color) {
                this.intro_text_color = intro_text_color;
                return this;
            }

            public final Builder localized_accessibility_text(LocalizableString localized_accessibility_text) {
                this.localized_accessibility_text = localized_accessibility_text;
                return this;
            }

            public final Builder localized_detail_text(LocalizableString localized_detail_text) {
                this.localized_detail_text = localized_detail_text;
                return this;
            }

            public final Builder localized_intro_text(LocalizableString localized_intro_text) {
                this.localized_intro_text = localized_intro_text;
                return this;
            }

            public final Builder localized_title(LocalizableString localized_title) {
                this.localized_title = localized_title;
                return this;
            }

            public final Builder payment_method(PaymentMethod payment_method) {
                this.payment_method = payment_method;
                return this;
            }

            public final Builder presentationStyle(CardPresentationStyle presentationStyle) {
                this.presentationStyle = presentationStyle;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$Companion$ADAPTER$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v59 */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v62 */
                /* JADX WARN: Type inference failed for: r0v63 */
                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardOption decode(ProtoReader reader) {
                    Boolean bool;
                    Boolean bool2;
                    String str;
                    ?? decode;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    String str2 = null;
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Boolean bool3 = null;
                    Boolean bool4 = null;
                    String str3 = null;
                    String str4 = null;
                    CardCustomizationBlocker.CardOption.CustomizationArea customizationArea = null;
                    CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = null;
                    CardPresentationStyle cardPresentationStyle = null;
                    CardCustomizationBlocker.CardOption.CardAvailability cardAvailability = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    PaymentMethod paymentMethod = null;
                    String str8 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CardCustomizationBlocker.CardOption((CardTheme) obj, (CardCustomizationControlsTheme) obj2, str2, (LocalizableString) obj4, str4, (LocalizableString) obj6, str7, (LocalizableString) obj8, str8, bool3, bool4, str3, (LocalizableString) obj3, (CardCustomizationBlocker.CardPreviewText) obj5, customizationArea, cashtagDisplay, cardPresentationStyle, cardAvailability, str5, str6, (Color) obj7, paymentMethod, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(CardTheme.ADAPTER, reader, obj);
                                decode = str2;
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(CardCustomizationControlsTheme.ADAPTER, reader, obj2);
                                decode = str2;
                                break;
                            case 3:
                                str4 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 4:
                                str7 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 5:
                                str8 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 6:
                                bool3 = ProtoAdapter.BOOL.decode(reader);
                                decode = str2;
                                break;
                            case 7:
                                bool4 = ProtoAdapter.BOOL.decode(reader);
                                decode = str2;
                                break;
                            case 8:
                                str3 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 9:
                                obj5 = TransactorKt.decodeMessageOrMerge(CardCustomizationBlocker.CardPreviewText.ADAPTER, reader, obj5);
                                decode = str2;
                                break;
                            case 10:
                                bool = bool3;
                                bool2 = bool4;
                                str = str3;
                                try {
                                    customizationArea = CardCustomizationBlocker.CardOption.CustomizationArea.ADAPTER.decode(reader);
                                    bool3 = bool;
                                    bool4 = bool2;
                                    str3 = str;
                                    decode = str2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 11:
                                bool = bool3;
                                bool2 = bool4;
                                str = str3;
                                try {
                                    cashtagDisplay = CardCustomizationBlocker.CardOption.CashtagDisplay.ADAPTER.decode(reader);
                                    bool3 = bool;
                                    bool4 = bool2;
                                    str3 = str;
                                    decode = str2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 12:
                                bool = bool3;
                                bool2 = bool4;
                                str = str3;
                                try {
                                    cardPresentationStyle = CardPresentationStyle.ADAPTER.decode(reader);
                                    bool3 = bool;
                                    bool4 = bool2;
                                    str3 = str;
                                    decode = str2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 13:
                                decode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                bool = bool3;
                                bool2 = bool4;
                                str = str3;
                                try {
                                    cardAvailability = CardCustomizationBlocker.CardOption.CardAvailability.ADAPTER.decode(reader);
                                    bool3 = bool;
                                    bool4 = bool2;
                                    str3 = str;
                                    decode = str2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 15:
                                str5 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 16:
                                str6 = ProtoAdapter.STRING.decode(reader);
                                decode = str2;
                                break;
                            case 17:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                                decode = str2;
                                break;
                            case 18:
                                obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj6);
                                decode = str2;
                                break;
                            case 19:
                                obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj8);
                                decode = str2;
                                break;
                            case 20:
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj3);
                                decode = str2;
                                break;
                            case 21:
                                obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj7);
                                decode = str2;
                                break;
                            case 22:
                                try {
                                    paymentMethod = PaymentMethod.ADAPTER.decode(reader);
                                    decode = str2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    bool = bool3;
                                    bool2 = bool4;
                                    str = str3;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                bool = bool3;
                                bool2 = bool4;
                                str = str3;
                                decode = str2;
                                bool3 = bool;
                                bool4 = bool2;
                                str3 = str;
                                break;
                        }
                        str2 = decode;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CardCustomizationBlocker.CardOption value) {
                    writer.getClass();
                    value.getClass();
                    CardTheme.ADAPTER.encodeWithTag(writer, 1, value.card_theme);
                    CardCustomizationControlsTheme.ADAPTER.encodeWithTag(writer, 2, value.controls_theme);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 13, value.intro_text);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 17, value.localized_intro_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    protoAdapter3.encodeWithTag(writer, 18, value.localized_title);
                    protoAdapter2.encodeWithTag(writer, 4, value.detail_text);
                    protoAdapter3.encodeWithTag(writer, 19, value.localized_detail_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.accessibility_label);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                    protoAdapter4.encodeWithTag(writer, 6, value.cashtag_eligible);
                    protoAdapter4.encodeWithTag(writer, 7, value.customization_eligible);
                    protoAdapter2.encodeWithTag(writer, 8, value.accessibility_text);
                    protoAdapter3.encodeWithTag(writer, 20, value.localized_accessibility_text);
                    CardCustomizationBlocker.CardPreviewText.ADAPTER.encodeWithTag(writer, 9, value.card_preview_text);
                    CardCustomizationBlocker.CardOption.CustomizationArea.ADAPTER.encodeWithTag(writer, 10, value.customization_area);
                    CardCustomizationBlocker.CardOption.CashtagDisplay.ADAPTER.encodeWithTag(writer, 11, value.cashtag_display);
                    CardPresentationStyle.ADAPTER.encodeWithTag(writer, 12, value.presentationStyle);
                    CardCustomizationBlocker.CardOption.CardAvailability.ADAPTER.encodeWithTag(writer, 14, value.card_availability);
                    protoAdapter2.encodeWithTag(writer, 15, value.identifier);
                    protoAdapter2.encodeWithTag(writer, 16, value.external_identifier);
                    Color.ADAPTER.encodeWithTag(writer, 21, value.intro_text_color);
                    PaymentMethod.ADAPTER.encodeWithTag(writer, 22, value.payment_method);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CardCustomizationBlocker.CardOption value) {
                    value.getClass();
                    int encodedSizeWithTag = CardCustomizationControlsTheme.ADAPTER.encodedSizeWithTag(2, value.controls_theme) + CardTheme.ADAPTER.encodedSizeWithTag(1, value.card_theme) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(13, value.intro_text) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(5, value.accessibility_label) + protoAdapter3.encodedSizeWithTag(19, value.localized_detail_text) + protoAdapter2.encodedSizeWithTag(4, value.detail_text) + protoAdapter3.encodedSizeWithTag(18, value.localized_title) + protoAdapter2.encodedSizeWithTag(3, value.title) + protoAdapter3.encodedSizeWithTag(17, value.localized_intro_text) + encodedSizeWithTag2;
                    ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                    return PaymentMethod.ADAPTER.encodedSizeWithTag(22, value.payment_method) + Color.ADAPTER.encodedSizeWithTag(21, value.intro_text_color) + protoAdapter2.encodedSizeWithTag(16, value.external_identifier) + protoAdapter2.encodedSizeWithTag(15, value.identifier) + CardCustomizationBlocker.CardOption.CardAvailability.ADAPTER.encodedSizeWithTag(14, value.card_availability) + CardPresentationStyle.ADAPTER.encodedSizeWithTag(12, value.presentationStyle) + CardCustomizationBlocker.CardOption.CashtagDisplay.ADAPTER.encodedSizeWithTag(11, value.cashtag_display) + CardCustomizationBlocker.CardOption.CustomizationArea.ADAPTER.encodedSizeWithTag(10, value.customization_area) + CardCustomizationBlocker.CardPreviewText.ADAPTER.encodedSizeWithTag(9, value.card_preview_text) + protoAdapter3.encodedSizeWithTag(20, value.localized_accessibility_text) + protoAdapter2.encodedSizeWithTag(8, value.accessibility_text) + protoAdapter4.encodedSizeWithTag(7, value.customization_eligible) + protoAdapter4.encodedSizeWithTag(6, value.cashtag_eligible) + encodedSizeWithTag3;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardOption redact(CardCustomizationBlocker.CardOption value) {
                    CardCustomizationBlocker.CardOption copy;
                    value.getClass();
                    CardTheme cardTheme = value.card_theme;
                    CardTheme cardTheme2 = cardTheme != null ? (CardTheme) CardTheme.ADAPTER.redact(cardTheme) : null;
                    CardCustomizationControlsTheme cardCustomizationControlsTheme = value.controls_theme;
                    CardCustomizationControlsTheme cardCustomizationControlsTheme2 = cardCustomizationControlsTheme != null ? (CardCustomizationControlsTheme) CardCustomizationControlsTheme.ADAPTER.redact(cardCustomizationControlsTheme) : null;
                    LocalizableString localizableString = value.localized_intro_text;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localized_title;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    LocalizableString localizableString5 = value.localized_detail_text;
                    LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                    LocalizableString localizableString7 = value.localized_accessibility_text;
                    LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
                    CardCustomizationBlocker.CardPreviewText cardPreviewText = value.card_preview_text;
                    CardCustomizationBlocker.CardPreviewText cardPreviewText2 = cardPreviewText != null ? (CardCustomizationBlocker.CardPreviewText) CardCustomizationBlocker.CardPreviewText.ADAPTER.redact(cardPreviewText) : null;
                    Color color = value.intro_text_color;
                    copy = value.copy((r41 & 1) != 0 ? value.card_theme : cardTheme2, (r41 & 2) != 0 ? value.controls_theme : cardCustomizationControlsTheme2, (r41 & 4) != 0 ? value.intro_text : null, (r41 & 8) != 0 ? value.localized_intro_text : localizableString2, (r41 & 16) != 0 ? value.title : null, (r41 & 32) != 0 ? value.localized_title : localizableString4, (r41 & 64) != 0 ? value.detail_text : null, (r41 & 128) != 0 ? value.localized_detail_text : localizableString6, (r41 & 256) != 0 ? value.accessibility_label : null, (r41 & 512) != 0 ? value.cashtag_eligible : null, (r41 & 1024) != 0 ? value.customization_eligible : null, (r41 & 2048) != 0 ? value.accessibility_text : null, (r41 & 4096) != 0 ? value.localized_accessibility_text : localizableString8, (r41 & PKIFailureInfo.certRevoked) != 0 ? value.card_preview_text : cardPreviewText2, (r41 & 16384) != 0 ? value.customization_area : null, (r41 & 32768) != 0 ? value.cashtag_display : null, (r41 & 65536) != 0 ? value.presentationStyle : null, (r41 & PKIFailureInfo.unsupportedVersion) != 0 ? value.card_availability : null, (r41 & PKIFailureInfo.transactionIdInUse) != 0 ? value.identifier : null, (r41 & PKIFailureInfo.signerNotTrusted) != 0 ? value.external_identifier : null, (r41 & PKIFailureInfo.badCertTemplate) != 0 ? value.intro_text_color : color != null ? (Color) Color.ADAPTER.redact(color) : null, (r41 & PKIFailureInfo.badSenderNonce) != 0 ? value.payment_method : null, (r41 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
                    return copy;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CardCustomizationBlocker.CardOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentMethod.ADAPTER.encodeWithTag(writer, 22, value.payment_method);
                    Color.ADAPTER.encodeWithTag(writer, 21, value.intro_text_color);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 16, value.external_identifier);
                    protoAdapter2.encodeWithTag(writer, 15, value.identifier);
                    CardCustomizationBlocker.CardOption.CardAvailability.ADAPTER.encodeWithTag(writer, 14, value.card_availability);
                    CardPresentationStyle.ADAPTER.encodeWithTag(writer, 12, value.presentationStyle);
                    CardCustomizationBlocker.CardOption.CashtagDisplay.ADAPTER.encodeWithTag(writer, 11, value.cashtag_display);
                    CardCustomizationBlocker.CardOption.CustomizationArea.ADAPTER.encodeWithTag(writer, 10, value.customization_area);
                    CardCustomizationBlocker.CardPreviewText.ADAPTER.encodeWithTag(writer, 9, value.card_preview_text);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 20, value.localized_accessibility_text);
                    protoAdapter2.encodeWithTag(writer, 8, value.accessibility_text);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                    protoAdapter4.encodeWithTag(writer, 7, value.customization_eligible);
                    protoAdapter4.encodeWithTag(writer, 6, value.cashtag_eligible);
                    protoAdapter2.encodeWithTag(writer, 5, value.accessibility_label);
                    protoAdapter3.encodeWithTag(writer, 19, value.localized_detail_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.detail_text);
                    protoAdapter3.encodeWithTag(writer, 18, value.localized_title);
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    protoAdapter3.encodeWithTag(writer, 17, value.localized_intro_text);
                    protoAdapter2.encodeWithTag(writer, 13, value.intro_text);
                    CardCustomizationControlsTheme.ADAPTER.encodeWithTag(writer, 2, value.controls_theme);
                    CardTheme.ADAPTER.encodeWithTag(writer, 1, value.card_theme);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CardOption(CardTheme cardTheme, CardCustomizationControlsTheme cardCustomizationControlsTheme, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, String str3, LocalizableString localizableString3, String str4, Boolean bool, Boolean bool2, String str5, LocalizableString localizableString4, CardPreviewText cardPreviewText, CustomizationArea customizationArea, CashtagDisplay cashtagDisplay, CardPresentationStyle cardPresentationStyle, CardAvailability cardAvailability, String str6, String str7, Color color, PaymentMethod paymentMethod, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardTheme, (i & 2) != 0 ? null : cardCustomizationControlsTheme, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : localizableString, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : localizableString2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : localizableString3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : localizableString4, (i & PKIFailureInfo.certRevoked) != 0 ? null : cardPreviewText, (i & 16384) != 0 ? null : customizationArea, (i & 32768) != 0 ? null : cashtagDisplay, (i & 65536) != 0 ? null : cardPresentationStyle, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : cardAvailability, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : str6, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : str7, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : color, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : paymentMethod, (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
        }

        @Deprecated
        public static /* synthetic */ void getAccessibility_label$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getCashtag_eligible$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getCustomization_area$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getIdentifier$annotations() {
        }

        public final CardOption copy(CardTheme card_theme, CardCustomizationControlsTheme controls_theme, String intro_text, LocalizableString localized_intro_text, String title, LocalizableString localized_title, String detail_text, LocalizableString localized_detail_text, String accessibility_label, Boolean cashtag_eligible, Boolean customization_eligible, String accessibility_text, LocalizableString localized_accessibility_text, CardPreviewText card_preview_text, CustomizationArea customization_area, CashtagDisplay cashtag_display, CardPresentationStyle presentationStyle, CardAvailability card_availability, String identifier, String external_identifier, Color intro_text_color, PaymentMethod payment_method, ByteString unknownFields) {
            unknownFields.getClass();
            return new CardOption(card_theme, controls_theme, intro_text, localized_intro_text, title, localized_title, detail_text, localized_detail_text, accessibility_label, cashtag_eligible, customization_eligible, accessibility_text, localized_accessibility_text, card_preview_text, customization_area, cashtag_display, presentationStyle, card_availability, identifier, external_identifier, intro_text_color, payment_method, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CardOption)) {
                return false;
            }
            CardOption cardOption = (CardOption) other;
            return Intrinsics.areEqual(unknownFields(), cardOption.unknownFields()) && Intrinsics.areEqual(this.card_theme, cardOption.card_theme) && Intrinsics.areEqual(this.controls_theme, cardOption.controls_theme) && Intrinsics.areEqual(this.intro_text, cardOption.intro_text) && Intrinsics.areEqual(this.localized_intro_text, cardOption.localized_intro_text) && Intrinsics.areEqual(this.title, cardOption.title) && Intrinsics.areEqual(this.localized_title, cardOption.localized_title) && Intrinsics.areEqual(this.detail_text, cardOption.detail_text) && Intrinsics.areEqual(this.localized_detail_text, cardOption.localized_detail_text) && Intrinsics.areEqual(this.accessibility_label, cardOption.accessibility_label) && Intrinsics.areEqual(this.cashtag_eligible, cardOption.cashtag_eligible) && Intrinsics.areEqual(this.customization_eligible, cardOption.customization_eligible) && Intrinsics.areEqual(this.accessibility_text, cardOption.accessibility_text) && Intrinsics.areEqual(this.localized_accessibility_text, cardOption.localized_accessibility_text) && Intrinsics.areEqual(this.card_preview_text, cardOption.card_preview_text) && this.customization_area == cardOption.customization_area && this.cashtag_display == cardOption.cashtag_display && this.presentationStyle == cardOption.presentationStyle && this.card_availability == cardOption.card_availability && Intrinsics.areEqual(this.identifier, cardOption.identifier) && Intrinsics.areEqual(this.external_identifier, cardOption.external_identifier) && Intrinsics.areEqual(this.intro_text_color, cardOption.intro_text_color) && this.payment_method == cardOption.payment_method;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardTheme cardTheme = this.card_theme;
            int hashCode2 = (hashCode + (cardTheme != null ? cardTheme.hashCode() : 0)) * 37;
            CardCustomizationControlsTheme cardCustomizationControlsTheme = this.controls_theme;
            int hashCode3 = (hashCode2 + (cardCustomizationControlsTheme != null ? cardCustomizationControlsTheme.hashCode() : 0)) * 37;
            String str = this.intro_text;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localized_intro_text;
            int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localized_title;
            int hashCode7 = (hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            String str3 = this.detail_text;
            int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString3 = this.localized_detail_text;
            int hashCode9 = (hashCode8 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
            String str4 = this.accessibility_label;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.cashtag_eligible;
            int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.customization_eligible;
            int hashCode12 = (hashCode11 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str5 = this.accessibility_text;
            int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 37;
            LocalizableString localizableString4 = this.localized_accessibility_text;
            int hashCode14 = (hashCode13 + (localizableString4 != null ? localizableString4.hashCode() : 0)) * 37;
            CardPreviewText cardPreviewText = this.card_preview_text;
            int hashCode15 = (hashCode14 + (cardPreviewText != null ? cardPreviewText.hashCode() : 0)) * 37;
            CustomizationArea customizationArea = this.customization_area;
            int hashCode16 = (hashCode15 + (customizationArea != null ? customizationArea.hashCode() : 0)) * 37;
            CashtagDisplay cashtagDisplay = this.cashtag_display;
            int hashCode17 = (hashCode16 + (cashtagDisplay != null ? cashtagDisplay.hashCode() : 0)) * 37;
            CardPresentationStyle cardPresentationStyle = this.presentationStyle;
            int hashCode18 = (hashCode17 + (cardPresentationStyle != null ? cardPresentationStyle.hashCode() : 0)) * 37;
            CardAvailability cardAvailability = this.card_availability;
            int hashCode19 = (hashCode18 + (cardAvailability != null ? cardAvailability.hashCode() : 0)) * 37;
            String str6 = this.identifier;
            int hashCode20 = (hashCode19 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.external_identifier;
            int hashCode21 = (hashCode20 + (str7 != null ? str7.hashCode() : 0)) * 37;
            Color color = this.intro_text_color;
            int hashCode22 = (hashCode21 + (color != null ? color.hashCode() : 0)) * 37;
            PaymentMethod paymentMethod = this.payment_method;
            int hashCode23 = hashCode22 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
            this.hashCode = hashCode23;
            return hashCode23;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.card_theme = this.card_theme;
            builder.controls_theme = this.controls_theme;
            builder.intro_text = this.intro_text;
            builder.localized_intro_text = this.localized_intro_text;
            builder.title = this.title;
            builder.localized_title = this.localized_title;
            builder.detail_text = this.detail_text;
            builder.localized_detail_text = this.localized_detail_text;
            builder.accessibility_label = this.accessibility_label;
            builder.cashtag_eligible = this.cashtag_eligible;
            builder.customization_eligible = this.customization_eligible;
            builder.accessibility_text = this.accessibility_text;
            builder.localized_accessibility_text = this.localized_accessibility_text;
            builder.card_preview_text = this.card_preview_text;
            builder.customization_area = this.customization_area;
            builder.cashtag_display = this.cashtag_display;
            builder.presentationStyle = this.presentationStyle;
            builder.card_availability = this.card_availability;
            builder.identifier = this.identifier;
            builder.external_identifier = this.external_identifier;
            builder.intro_text_color = this.intro_text_color;
            builder.payment_method = this.payment_method;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            CardTheme cardTheme = this.card_theme;
            if (cardTheme != null) {
                arrayList.add("card_theme=" + cardTheme);
            }
            CardCustomizationControlsTheme cardCustomizationControlsTheme = this.controls_theme;
            if (cardCustomizationControlsTheme != null) {
                arrayList.add("controls_theme=" + cardCustomizationControlsTheme);
            }
            String str = this.intro_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "intro_text=", arrayList);
            }
            LocalizableString localizableString = this.localized_intro_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_intro_text=", localizableString, arrayList);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            LocalizableString localizableString2 = this.localized_title;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizableString2, arrayList);
            }
            String str3 = this.detail_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "detail_text=", arrayList);
            }
            LocalizableString localizableString3 = this.localized_detail_text;
            if (localizableString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_detail_text=", localizableString3, arrayList);
            }
            String str4 = this.accessibility_label;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "accessibility_label=", arrayList);
            }
            Boolean bool = this.cashtag_eligible;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("cashtag_eligible=", bool, arrayList);
            }
            Boolean bool2 = this.customization_eligible;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("customization_eligible=", bool2, arrayList);
            }
            String str5 = this.accessibility_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "accessibility_text=", arrayList);
            }
            LocalizableString localizableString4 = this.localized_accessibility_text;
            if (localizableString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_accessibility_text=", localizableString4, arrayList);
            }
            CardPreviewText cardPreviewText = this.card_preview_text;
            if (cardPreviewText != null) {
                arrayList.add("card_preview_text=" + cardPreviewText);
            }
            CustomizationArea customizationArea = this.customization_area;
            if (customizationArea != null) {
                arrayList.add("customization_area=" + customizationArea);
            }
            CashtagDisplay cashtagDisplay = this.cashtag_display;
            if (cashtagDisplay != null) {
                arrayList.add("cashtag_display=" + cashtagDisplay);
            }
            CardPresentationStyle cardPresentationStyle = this.presentationStyle;
            if (cardPresentationStyle != null) {
                arrayList.add("presentationStyle=" + cardPresentationStyle);
            }
            CardAvailability cardAvailability = this.card_availability;
            if (cardAvailability != null) {
                arrayList.add("card_availability=" + cardAvailability);
            }
            String str6 = this.identifier;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "identifier=", arrayList);
            }
            String str7 = this.external_identifier;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "external_identifier=", arrayList);
            }
            Color color = this.intro_text_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("intro_text_color=", color, arrayList);
            }
            PaymentMethod paymentMethod = this.payment_method;
            if (paymentMethod != null) {
                arrayList.add("payment_method=" + paymentMethod);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardOption{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AVAILABLE", "UNAVAILABLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CardAvailability implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CardAvailability[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final CardAvailability AVAILABLE;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final CardAvailability UNAVAILABLE;
            private final int value;

            private static final /* synthetic */ CardAvailability[] $values() {
                return new CardAvailability[]{AVAILABLE, UNAVAILABLE};
            }

            static {
                final CardAvailability cardAvailability = new CardAvailability("AVAILABLE", 0, 0);
                AVAILABLE = cardAvailability;
                UNAVAILABLE = new CardAvailability("UNAVAILABLE", 1, 1);
                CardAvailability[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardAvailability.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, cardAvailability) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CardAvailability$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public CardCustomizationBlocker.CardOption.CardAvailability fromValue(int value) {
                        return CardCustomizationBlocker.CardOption.CardAvailability.INSTANCE.fromValue(value);
                    }
                };
            }

            private CardAvailability(String str, int i, int i2) {
                this.value = i2;
            }

            public static final CardAvailability fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CardAvailability valueOf(String str) {
                return (CardAvailability) Enum.valueOf(CardAvailability.class, str);
            }

            public static CardAvailability[] values() {
                return (CardAvailability[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CardAvailability;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final CardAvailability fromValue(int value) {
                    if (value == 0) {
                        return CardAvailability.AVAILABLE;
                    }
                    if (value != 1) {
                        return null;
                    }
                    return CardAvailability.UNAVAILABLE;
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ALWAYS_HIDDEN", "OPTIONAL", "ALWAYS_SHOW", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CashtagDisplay implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CashtagDisplay[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final CashtagDisplay ALWAYS_HIDDEN;
            public static final CashtagDisplay ALWAYS_SHOW;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final CashtagDisplay OPTIONAL;
            private final int value;

            private static final /* synthetic */ CashtagDisplay[] $values() {
                return new CashtagDisplay[]{ALWAYS_HIDDEN, OPTIONAL, ALWAYS_SHOW};
            }

            static {
                final CashtagDisplay cashtagDisplay = new CashtagDisplay("ALWAYS_HIDDEN", 0, 0);
                ALWAYS_HIDDEN = cashtagDisplay;
                OPTIONAL = new CashtagDisplay("OPTIONAL", 1, 1);
                ALWAYS_SHOW = new CashtagDisplay("ALWAYS_SHOW", 2, 2);
                CashtagDisplay[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashtagDisplay.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, cashtagDisplay) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CashtagDisplay$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public CardCustomizationBlocker.CardOption.CashtagDisplay fromValue(int value) {
                        return CardCustomizationBlocker.CardOption.CashtagDisplay.INSTANCE.fromValue(value);
                    }
                };
            }

            private CashtagDisplay(String str, int i, int i2) {
                this.value = i2;
            }

            public static final CashtagDisplay fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CashtagDisplay valueOf(String str) {
                return (CashtagDisplay) Enum.valueOf(CashtagDisplay.class, str);
            }

            public static CashtagDisplay[] values() {
                return (CashtagDisplay[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CashtagDisplay;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final CashtagDisplay fromValue(int value) {
                    if (value == 0) {
                        return CashtagDisplay.ALWAYS_HIDDEN;
                    }
                    if (value == 1) {
                        return CashtagDisplay.OPTIONAL;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return CashtagDisplay.ALWAYS_SHOW;
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LEGACY", "FULL_FACE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CustomizationArea implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CustomizationArea[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final CustomizationArea FULL_FACE;
            public static final CustomizationArea LEGACY;
            private final int value;

            private static final /* synthetic */ CustomizationArea[] $values() {
                return new CustomizationArea[]{LEGACY, FULL_FACE};
            }

            static {
                final CustomizationArea customizationArea = new CustomizationArea("LEGACY", 0, 0);
                LEGACY = customizationArea;
                FULL_FACE = new CustomizationArea("FULL_FACE", 1, 1);
                CustomizationArea[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CustomizationArea.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, customizationArea) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption$CustomizationArea$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public CardCustomizationBlocker.CardOption.CustomizationArea fromValue(int value) {
                        return CardCustomizationBlocker.CardOption.CustomizationArea.INSTANCE.fromValue(value);
                    }
                };
            }

            private CustomizationArea(String str, int i, int i2) {
                this.value = i2;
            }

            public static final CustomizationArea fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static CustomizationArea valueOf(String str) {
                return (CustomizationArea) Enum.valueOf(CustomizationArea.class, str);
            }

            public static CustomizationArea[] values() {
                return (CustomizationArea[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$CustomizationArea;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final CustomizationArea fromValue(int value) {
                    if (value == 0) {
                        return CustomizationArea.LEGACY;
                    }
                    if (value != 1) {
                        return null;
                    }
                    return CustomizationArea.FULL_FACE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CardOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CardOption() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardOption(CardTheme cardTheme, CardCustomizationControlsTheme cardCustomizationControlsTheme, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, String str3, LocalizableString localizableString3, String str4, Boolean bool, Boolean bool2, String str5, LocalizableString localizableString4, CardPreviewText cardPreviewText, CustomizationArea customizationArea, CashtagDisplay cashtagDisplay, CardPresentationStyle cardPresentationStyle, CardAvailability cardAvailability, String str6, String str7, Color color, PaymentMethod paymentMethod, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.card_theme = cardTheme;
            this.controls_theme = cardCustomizationControlsTheme;
            this.intro_text = str;
            this.localized_intro_text = localizableString;
            this.title = str2;
            this.localized_title = localizableString2;
            this.detail_text = str3;
            this.localized_detail_text = localizableString3;
            this.accessibility_label = str4;
            this.cashtag_eligible = bool;
            this.customization_eligible = bool2;
            this.accessibility_text = str5;
            this.localized_accessibility_text = localizableString4;
            this.card_preview_text = cardPreviewText;
            this.customization_area = customizationArea;
            this.cashtag_display = cashtagDisplay;
            this.presentationStyle = cardPresentationStyle;
            this.card_availability = cardAvailability;
            this.identifier = str6;
            this.external_identifier = str7;
            this.intro_text_color = color;
            this.payment_method = paymentMethod;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016JL\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0010R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "body", "local_image", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage;", "title_ls", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_ls", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "getTitle$annotations", "()V", "getBody$annotations", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "LocalSheetImage", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PreviewHalfSheetContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PreviewHalfSheetContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizableString body;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalizedString body_ls;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalSheetImage local_image;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizableString title;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString title_ls;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "body", "local_image", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage;", "title_ls", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_ls", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizableString body;
            public LocalizedString body_ls;
            public LocalSheetImage local_image;
            public LocalizableString title;
            public LocalizedString title_ls;

            @Deprecated
            public final Builder body(LocalizableString body) {
                this.body = body;
                return this;
            }

            public final Builder body_ls(LocalizedString body_ls) {
                this.body_ls = body_ls;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public PreviewHalfSheetContent build() {
                return new PreviewHalfSheetContent(this.title, this.body, this.local_image, this.title_ls, this.body_ls, buildUnknownFields());
            }

            public final Builder local_image(LocalSheetImage local_image) {
                this.local_image = local_image;
                return this;
            }

            @Deprecated
            public final Builder title(LocalizableString title) {
                this.title = title;
                return this;
            }

            public final Builder title_ls(LocalizedString title_ls) {
                this.title_ls = title_ls;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PreviewHalfSheetContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$PreviewHalfSheetContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.PreviewHalfSheetContent decode(ProtoReader reader) {
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
                            return new CardCustomizationBlocker.PreviewHalfSheetContent((LocalizableString) obj, (LocalizableString) obj2, (CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage) obj3, (LocalizedString) obj4, (LocalizedString) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            try {
                                obj3 = CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 4) {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CardCustomizationBlocker.PreviewHalfSheetContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.ADAPTER.encodeWithTag(writer, 3, value.local_image);
                    ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 4, value.title_ls);
                    protoAdapter3.encodeWithTag(writer, 5, value.body_ls);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CardCustomizationBlocker.PreviewHalfSheetContent value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                    int encodedSizeWithTag = CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.ADAPTER.encodedSizeWithTag(3, value.local_image) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(5, value.body_ls) + protoAdapter3.encodedSizeWithTag(4, value.title_ls) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.PreviewHalfSheetContent redact(CardCustomizationBlocker.PreviewHalfSheetContent value) {
                    value.getClass();
                    LocalizableString localizableString = value.title;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.body;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    LocalizedString localizedString = value.title_ls;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.body_ls;
                    return CardCustomizationBlocker.PreviewHalfSheetContent.copy$default(value, localizableString2, localizableString4, null, localizedString2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY, 4, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CardCustomizationBlocker.PreviewHalfSheetContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.body_ls);
                    protoAdapter2.encodeWithTag(writer, 4, value.title_ls);
                    CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.ADAPTER.encodeWithTag(writer, 3, value.local_image);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 2, value.body);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PreviewHalfSheetContent(LocalizableString localizableString, LocalizableString localizableString2, LocalSheetImage localSheetImage, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizableString, (i & 2) != 0 ? null : localizableString2, (i & 4) != 0 ? null : localSheetImage, (i & 8) != 0 ? null : localizedString, (i & 16) != 0 ? null : localizedString2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PreviewHalfSheetContent copy$default(PreviewHalfSheetContent previewHalfSheetContent, LocalizableString localizableString, LocalizableString localizableString2, LocalSheetImage localSheetImage, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizableString = previewHalfSheetContent.title;
            }
            if ((i & 2) != 0) {
                localizableString2 = previewHalfSheetContent.body;
            }
            if ((i & 4) != 0) {
                localSheetImage = previewHalfSheetContent.local_image;
            }
            if ((i & 8) != 0) {
                localizedString = previewHalfSheetContent.title_ls;
            }
            if ((i & 16) != 0) {
                localizedString2 = previewHalfSheetContent.body_ls;
            }
            if ((i & 32) != 0) {
                byteString = previewHalfSheetContent.unknownFields();
            }
            LocalizedString localizedString3 = localizedString2;
            ByteString byteString2 = byteString;
            return previewHalfSheetContent.copy(localizableString, localizableString2, localSheetImage, localizedString, localizedString3, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getBody$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getTitle$annotations() {
        }

        public final PreviewHalfSheetContent copy(LocalizableString title, LocalizableString body, LocalSheetImage local_image, LocalizedString title_ls, LocalizedString body_ls, ByteString unknownFields) {
            unknownFields.getClass();
            return new PreviewHalfSheetContent(title, body, local_image, title_ls, body_ls, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PreviewHalfSheetContent)) {
                return false;
            }
            PreviewHalfSheetContent previewHalfSheetContent = (PreviewHalfSheetContent) other;
            return Intrinsics.areEqual(unknownFields(), previewHalfSheetContent.unknownFields()) && Intrinsics.areEqual(this.title, previewHalfSheetContent.title) && Intrinsics.areEqual(this.body, previewHalfSheetContent.body) && this.local_image == previewHalfSheetContent.local_image && Intrinsics.areEqual(this.title_ls, previewHalfSheetContent.title_ls) && Intrinsics.areEqual(this.body_ls, previewHalfSheetContent.body_ls);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizableString localizableString = this.title;
            int hashCode2 = (hashCode + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.body;
            int hashCode3 = (hashCode2 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            LocalSheetImage localSheetImage = this.local_image;
            int hashCode4 = (hashCode3 + (localSheetImage != null ? localSheetImage.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title_ls;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body_ls;
            int hashCode6 = hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
            builder.local_image = this.local_image;
            builder.title_ls = this.title_ls;
            builder.body_ls = this.body_ls;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizableString localizableString = this.title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.body;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizableString2, arrayList);
            }
            LocalSheetImage localSheetImage = this.local_image;
            if (localSheetImage != null) {
                arrayList.add("local_image=" + localSheetImage);
            }
            LocalizedString localizedString = this.title_ls;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title_ls=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body_ls;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body_ls=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PreviewHalfSheetContent{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_LOCAL_THEME_UPSELL", "PINK_THEME_UPSELL", "GLITTER_THEME_UPSELL", "TORTOISE_THEME_UPSELL", "BRAT_THEME_UPSELL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LocalSheetImage implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ LocalSheetImage[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final LocalSheetImage BRAT_THEME_UPSELL;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final LocalSheetImage GLITTER_THEME_UPSELL;
            public static final LocalSheetImage PINK_THEME_UPSELL;
            public static final LocalSheetImage TORTOISE_THEME_UPSELL;
            public static final LocalSheetImage UNKNOWN_LOCAL_THEME_UPSELL;
            private final int value;

            private static final /* synthetic */ LocalSheetImage[] $values() {
                return new LocalSheetImage[]{UNKNOWN_LOCAL_THEME_UPSELL, PINK_THEME_UPSELL, GLITTER_THEME_UPSELL, TORTOISE_THEME_UPSELL, BRAT_THEME_UPSELL};
            }

            static {
                final LocalSheetImage localSheetImage = new LocalSheetImage("UNKNOWN_LOCAL_THEME_UPSELL", 0, 0);
                UNKNOWN_LOCAL_THEME_UPSELL = localSheetImage;
                PINK_THEME_UPSELL = new LocalSheetImage("PINK_THEME_UPSELL", 1, 1);
                GLITTER_THEME_UPSELL = new LocalSheetImage("GLITTER_THEME_UPSELL", 2, 2);
                TORTOISE_THEME_UPSELL = new LocalSheetImage("TORTOISE_THEME_UPSELL", 3, 3);
                BRAT_THEME_UPSELL = new LocalSheetImage("BRAT_THEME_UPSELL", 4, 4);
                LocalSheetImage[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalSheetImage.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, localSheetImage) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage fromValue(int value) {
                        return CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.INSTANCE.fromValue(value);
                    }
                };
            }

            private LocalSheetImage(String str, int i, int i2) {
                this.value = i2;
            }

            public static final LocalSheetImage fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static LocalSheetImage valueOf(String str) {
                return (LocalSheetImage) Enum.valueOf(LocalSheetImage.class, str);
            }

            public static LocalSheetImage[] values() {
                return (LocalSheetImage[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$LocalSheetImage;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final LocalSheetImage fromValue(int value) {
                    if (value == 0) {
                        return LocalSheetImage.UNKNOWN_LOCAL_THEME_UPSELL;
                    }
                    if (value == 1) {
                        return LocalSheetImage.PINK_THEME_UPSELL;
                    }
                    if (value == 2) {
                        return LocalSheetImage.GLITTER_THEME_UPSELL;
                    }
                    if (value == 3) {
                        return LocalSheetImage.TORTOISE_THEME_UPSELL;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return LocalSheetImage.BRAT_THEME_UPSELL;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PreviewHalfSheetContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PreviewHalfSheetContent() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreviewHalfSheetContent(LocalizableString localizableString, LocalizableString localizableString2, LocalSheetImage localSheetImage, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizableString;
            this.body = localizableString2;
            this.local_image = localSheetImage;
            this.title_ls = localizedString;
            this.body_ls = localizedString2;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardCustomizationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49 */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v54 */
            /* JADX WARN: Type inference failed for: r0v55 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationBlocker decode(ProtoReader reader) {
                ArrayList arrayList;
                Object obj;
                Object obj2;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                String str2 = null;
                Object obj10 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Float f = null;
                CardCustomizationData.CustomizationArea customizationArea = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardCustomizationBlocker(str, (LocalizableString) obj4, str5, (LocalizableString) obj6, str7, (LocalizableString) obj8, str11, (LocalizableString) obj9, str2, (LocalizableString) obj10, str3, (LocalizableString) obj3, str4, (LocalizableString) obj5, str6, (LocalizableString) obj7, f, m, customizationArea, str8, str9, str10, arrayList2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = arrayList2;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = arrayList2;
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 3:
                            arrayList = arrayList2;
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 4:
                            arrayList = arrayList2;
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 5:
                            arrayList = arrayList2;
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 6:
                            arrayList = arrayList2;
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 7:
                            arrayList = arrayList2;
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 8:
                            arrayList = arrayList2;
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            arrayList = arrayList2;
                            f = ProtoAdapter.FLOAT.decode(reader);
                            decode = str;
                            break;
                        case 10:
                            arrayList = arrayList2;
                            obj = obj3;
                            obj2 = obj4;
                            m.add(CardCustomizationBlocker.CardOptionSection.ADAPTER.decode(reader));
                            decode = str;
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                        case 11:
                            try {
                                customizationArea = CardCustomizationData.CustomizationArea.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                arrayList = arrayList2;
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 12:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 13:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 14:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 15:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj6);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 16:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj8);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 17:
                            obj9 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj9);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 18:
                            obj10 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj10);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 19:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj3);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 20:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 21:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 22:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            decode = str;
                            break;
                        case 23:
                            arrayList2.add(Stamp.ADAPTER.decode(reader));
                            arrayList = arrayList2;
                            obj = obj3;
                            obj2 = obj4;
                            decode = str;
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            arrayList = arrayList2;
                            obj = obj3;
                            obj2 = obj4;
                            decode = str;
                            obj3 = obj;
                            obj4 = obj2;
                            break;
                    }
                    str = decode;
                    arrayList2 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardCustomizationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.style_picker_title_text);
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 14, value.localized_style_picker_title_text);
                protoAdapter2.encodeWithTag(writer, 2, value.style_picker_short_title_text);
                protoAdapter3.encodeWithTag(writer, 15, value.localized_style_picker_short_title_text);
                protoAdapter2.encodeWithTag(writer, 3, value.customization_prompt_text);
                protoAdapter3.encodeWithTag(writer, 16, value.localized_customization_prompt_text);
                protoAdapter2.encodeWithTag(writer, 4, value.cashtag_toggle_text);
                protoAdapter3.encodeWithTag(writer, 17, value.localized_cashtag_toggle_text);
                protoAdapter2.encodeWithTag(writer, 5, value.customization_title_text);
                protoAdapter3.encodeWithTag(writer, 18, value.localized_customization_title_text);
                protoAdapter2.encodeWithTag(writer, 6, value.stamp_added_text);
                protoAdapter3.encodeWithTag(writer, 19, value.localized_stamp_added_text);
                protoAdapter2.encodeWithTag(writer, 7, value.return_to_draw_mode_text);
                protoAdapter3.encodeWithTag(writer, 20, value.localized_return_to_draw_mode_text);
                protoAdapter2.encodeWithTag(writer, 8, value.too_much_ink_message);
                protoAdapter3.encodeWithTag(writer, 21, value.localized_too_much_ink_message);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 9, value.maximum_ink_coverage);
                CardCustomizationBlocker.CardOptionSection.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.card_option_sections);
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(writer, 11, value.customization_area);
                protoAdapter2.encodeWithTag(writer, 12, value.formatted_cashtag);
                protoAdapter2.encodeWithTag(writer, 13, value.selected_card_option_identifier);
                protoAdapter2.encodeWithTag(writer, 22, value.inputted_legal_name);
                Stamp.ADAPTER.asRepeated().encodeWithTag(writer, 23, value.available_stamps);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardCustomizationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.style_picker_title_text) + size$okio;
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                return Stamp.ADAPTER.asRepeated().encodedSizeWithTag(23, value.available_stamps) + protoAdapter2.encodedSizeWithTag(22, value.inputted_legal_name) + protoAdapter2.encodedSizeWithTag(13, value.selected_card_option_identifier) + protoAdapter2.encodedSizeWithTag(12, value.formatted_cashtag) + CardCustomizationData.CustomizationArea.ADAPTER.encodedSizeWithTag(11, value.customization_area) + CardCustomizationBlocker.CardOptionSection.ADAPTER.asRepeated().encodedSizeWithTag(10, value.card_option_sections) + ProtoAdapter.FLOAT.encodedSizeWithTag(9, value.maximum_ink_coverage) + protoAdapter3.encodedSizeWithTag(21, value.localized_too_much_ink_message) + protoAdapter2.encodedSizeWithTag(8, value.too_much_ink_message) + protoAdapter3.encodedSizeWithTag(20, value.localized_return_to_draw_mode_text) + protoAdapter2.encodedSizeWithTag(7, value.return_to_draw_mode_text) + protoAdapter3.encodedSizeWithTag(19, value.localized_stamp_added_text) + protoAdapter2.encodedSizeWithTag(6, value.stamp_added_text) + protoAdapter3.encodedSizeWithTag(18, value.localized_customization_title_text) + protoAdapter2.encodedSizeWithTag(5, value.customization_title_text) + protoAdapter3.encodedSizeWithTag(17, value.localized_cashtag_toggle_text) + protoAdapter2.encodedSizeWithTag(4, value.cashtag_toggle_text) + protoAdapter3.encodedSizeWithTag(16, value.localized_customization_prompt_text) + protoAdapter2.encodedSizeWithTag(3, value.customization_prompt_text) + protoAdapter3.encodedSizeWithTag(15, value.localized_style_picker_short_title_text) + protoAdapter2.encodedSizeWithTag(2, value.style_picker_short_title_text) + protoAdapter3.encodedSizeWithTag(14, value.localized_style_picker_title_text) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationBlocker redact(CardCustomizationBlocker value) {
                value.getClass();
                LocalizableString localizableString = value.localized_style_picker_title_text;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                LocalizableString localizableString3 = value.localized_style_picker_short_title_text;
                LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                LocalizableString localizableString5 = value.localized_customization_prompt_text;
                LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                LocalizableString localizableString7 = value.localized_cashtag_toggle_text;
                LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
                LocalizableString localizableString9 = value.localized_customization_title_text;
                LocalizableString localizableString10 = localizableString9 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString9) : null;
                LocalizableString localizableString11 = value.localized_stamp_added_text;
                LocalizableString localizableString12 = localizableString11 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString11) : null;
                LocalizableString localizableString13 = value.localized_return_to_draw_mode_text;
                LocalizableString localizableString14 = localizableString13 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString13) : null;
                LocalizableString localizableString15 = value.localized_too_much_ink_message;
                LocalizableString localizableString16 = localizableString15 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString15) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.card_option_sections, CardCustomizationBlocker.CardOptionSection.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.available_stamps, Stamp.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.style_picker_title_text;
                String str2 = value.style_picker_short_title_text;
                String str3 = value.customization_prompt_text;
                String str4 = value.cashtag_toggle_text;
                String str5 = value.customization_title_text;
                String str6 = value.stamp_added_text;
                String str7 = value.return_to_draw_mode_text;
                String str8 = value.too_much_ink_message;
                Float f = value.maximum_ink_coverage;
                CardCustomizationData.CustomizationArea customizationArea = value.customization_area;
                String str9 = value.selected_card_option_identifier;
                byteString.getClass();
                return new CardCustomizationBlocker(str, localizableString2, str2, localizableString4, str3, localizableString6, str4, localizableString8, str5, localizableString10, str6, localizableString12, str7, localizableString14, str8, localizableString16, f, m1169redactElements, customizationArea, null, str9, null, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardCustomizationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Stamp.ADAPTER.asRepeated().encodeWithTag(writer, 23, value.available_stamps);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 22, value.inputted_legal_name);
                protoAdapter2.encodeWithTag(writer, 13, value.selected_card_option_identifier);
                protoAdapter2.encodeWithTag(writer, 12, value.formatted_cashtag);
                CardCustomizationData.CustomizationArea.ADAPTER.encodeWithTag(writer, 11, value.customization_area);
                CardCustomizationBlocker.CardOptionSection.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.card_option_sections);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 9, value.maximum_ink_coverage);
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 21, value.localized_too_much_ink_message);
                protoAdapter2.encodeWithTag(writer, 8, value.too_much_ink_message);
                protoAdapter3.encodeWithTag(writer, 20, value.localized_return_to_draw_mode_text);
                protoAdapter2.encodeWithTag(writer, 7, value.return_to_draw_mode_text);
                protoAdapter3.encodeWithTag(writer, 19, value.localized_stamp_added_text);
                protoAdapter2.encodeWithTag(writer, 6, value.stamp_added_text);
                protoAdapter3.encodeWithTag(writer, 18, value.localized_customization_title_text);
                protoAdapter2.encodeWithTag(writer, 5, value.customization_title_text);
                protoAdapter3.encodeWithTag(writer, 17, value.localized_cashtag_toggle_text);
                protoAdapter2.encodeWithTag(writer, 4, value.cashtag_toggle_text);
                protoAdapter3.encodeWithTag(writer, 16, value.localized_customization_prompt_text);
                protoAdapter2.encodeWithTag(writer, 3, value.customization_prompt_text);
                protoAdapter3.encodeWithTag(writer, 15, value.localized_style_picker_short_title_text);
                protoAdapter2.encodeWithTag(writer, 2, value.style_picker_short_title_text);
                protoAdapter3.encodeWithTag(writer, 14, value.localized_style_picker_title_text);
                protoAdapter2.encodeWithTag(writer, 1, value.style_picker_title_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCustomizationBlocker(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, String str3, LocalizableString localizableString3, String str4, LocalizableString localizableString4, String str5, LocalizableString localizableString5, String str6, LocalizableString localizableString6, String str7, LocalizableString localizableString7, String str8, LocalizableString localizableString8, Float f, List list, CardCustomizationData.CustomizationArea customizationArea, String str9, String str10, String str11, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.style_picker_title_text = str;
        this.localized_style_picker_title_text = localizableString;
        this.style_picker_short_title_text = str2;
        this.localized_style_picker_short_title_text = localizableString2;
        this.customization_prompt_text = str3;
        this.localized_customization_prompt_text = localizableString3;
        this.cashtag_toggle_text = str4;
        this.localized_cashtag_toggle_text = localizableString4;
        this.customization_title_text = str5;
        this.localized_customization_title_text = localizableString5;
        this.stamp_added_text = str6;
        this.localized_stamp_added_text = localizableString6;
        this.return_to_draw_mode_text = str7;
        this.localized_return_to_draw_mode_text = localizableString7;
        this.too_much_ink_message = str8;
        this.localized_too_much_ink_message = localizableString8;
        this.maximum_ink_coverage = f;
        this.customization_area = customizationArea;
        this.formatted_cashtag = str9;
        this.selected_card_option_identifier = str10;
        this.inputted_legal_name = str11;
        this.card_option_sections = TransactorKt.immutableCopyOf("card_option_sections", list);
        this.available_stamps = TransactorKt.immutableCopyOf("available_stamps", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardCustomizationBlocker)) {
            return false;
        }
        CardCustomizationBlocker cardCustomizationBlocker = (CardCustomizationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), cardCustomizationBlocker.unknownFields()) && Intrinsics.areEqual(this.style_picker_title_text, cardCustomizationBlocker.style_picker_title_text) && Intrinsics.areEqual(this.localized_style_picker_title_text, cardCustomizationBlocker.localized_style_picker_title_text) && Intrinsics.areEqual(this.style_picker_short_title_text, cardCustomizationBlocker.style_picker_short_title_text) && Intrinsics.areEqual(this.localized_style_picker_short_title_text, cardCustomizationBlocker.localized_style_picker_short_title_text) && Intrinsics.areEqual(this.customization_prompt_text, cardCustomizationBlocker.customization_prompt_text) && Intrinsics.areEqual(this.localized_customization_prompt_text, cardCustomizationBlocker.localized_customization_prompt_text) && Intrinsics.areEqual(this.cashtag_toggle_text, cardCustomizationBlocker.cashtag_toggle_text) && Intrinsics.areEqual(this.localized_cashtag_toggle_text, cardCustomizationBlocker.localized_cashtag_toggle_text) && Intrinsics.areEqual(this.customization_title_text, cardCustomizationBlocker.customization_title_text) && Intrinsics.areEqual(this.localized_customization_title_text, cardCustomizationBlocker.localized_customization_title_text) && Intrinsics.areEqual(this.stamp_added_text, cardCustomizationBlocker.stamp_added_text) && Intrinsics.areEqual(this.localized_stamp_added_text, cardCustomizationBlocker.localized_stamp_added_text) && Intrinsics.areEqual(this.return_to_draw_mode_text, cardCustomizationBlocker.return_to_draw_mode_text) && Intrinsics.areEqual(this.localized_return_to_draw_mode_text, cardCustomizationBlocker.localized_return_to_draw_mode_text) && Intrinsics.areEqual(this.too_much_ink_message, cardCustomizationBlocker.too_much_ink_message) && Intrinsics.areEqual(this.localized_too_much_ink_message, cardCustomizationBlocker.localized_too_much_ink_message) && Intrinsics.areEqual(this.maximum_ink_coverage, cardCustomizationBlocker.maximum_ink_coverage) && Intrinsics.areEqual(this.card_option_sections, cardCustomizationBlocker.card_option_sections) && this.customization_area == cardCustomizationBlocker.customization_area && Intrinsics.areEqual(this.formatted_cashtag, cardCustomizationBlocker.formatted_cashtag) && Intrinsics.areEqual(this.selected_card_option_identifier, cardCustomizationBlocker.selected_card_option_identifier) && Intrinsics.areEqual(this.inputted_legal_name, cardCustomizationBlocker.inputted_legal_name) && Intrinsics.areEqual(this.available_stamps, cardCustomizationBlocker.available_stamps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.style_picker_title_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localized_style_picker_title_text;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.style_picker_short_title_text;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localized_style_picker_short_title_text;
        int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        String str3 = this.customization_prompt_text;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localized_customization_prompt_text;
        int hashCode7 = (hashCode6 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
        String str4 = this.cashtag_toggle_text;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LocalizableString localizableString4 = this.localized_cashtag_toggle_text;
        int hashCode9 = (hashCode8 + (localizableString4 != null ? localizableString4.hashCode() : 0)) * 37;
        String str5 = this.customization_title_text;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        LocalizableString localizableString5 = this.localized_customization_title_text;
        int hashCode11 = (hashCode10 + (localizableString5 != null ? localizableString5.hashCode() : 0)) * 37;
        String str6 = this.stamp_added_text;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString6 = this.localized_stamp_added_text;
        int hashCode13 = (hashCode12 + (localizableString6 != null ? localizableString6.hashCode() : 0)) * 37;
        String str7 = this.return_to_draw_mode_text;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalizableString localizableString7 = this.localized_return_to_draw_mode_text;
        int hashCode15 = (hashCode14 + (localizableString7 != null ? localizableString7.hashCode() : 0)) * 37;
        String str8 = this.too_much_ink_message;
        int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 37;
        LocalizableString localizableString8 = this.localized_too_much_ink_message;
        int hashCode17 = (hashCode16 + (localizableString8 != null ? localizableString8.hashCode() : 0)) * 37;
        Float f = this.maximum_ink_coverage;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode17 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37, 37, this.card_option_sections);
        CardCustomizationData.CustomizationArea customizationArea = this.customization_area;
        int hashCode18 = (m + (customizationArea != null ? customizationArea.hashCode() : 0)) * 37;
        String str9 = this.formatted_cashtag;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.selected_card_option_identifier;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.inputted_legal_name;
        int hashCode21 = this.available_stamps.hashCode() + ((hashCode20 + (str11 != null ? str11.hashCode() : 0)) * 37);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.style_picker_title_text = this.style_picker_title_text;
        builder.localized_style_picker_title_text = this.localized_style_picker_title_text;
        builder.style_picker_short_title_text = this.style_picker_short_title_text;
        builder.localized_style_picker_short_title_text = this.localized_style_picker_short_title_text;
        builder.customization_prompt_text = this.customization_prompt_text;
        builder.localized_customization_prompt_text = this.localized_customization_prompt_text;
        builder.cashtag_toggle_text = this.cashtag_toggle_text;
        builder.localized_cashtag_toggle_text = this.localized_cashtag_toggle_text;
        builder.customization_title_text = this.customization_title_text;
        builder.localized_customization_title_text = this.localized_customization_title_text;
        builder.stamp_added_text = this.stamp_added_text;
        builder.localized_stamp_added_text = this.localized_stamp_added_text;
        builder.return_to_draw_mode_text = this.return_to_draw_mode_text;
        builder.localized_return_to_draw_mode_text = this.localized_return_to_draw_mode_text;
        builder.too_much_ink_message = this.too_much_ink_message;
        builder.localized_too_much_ink_message = this.localized_too_much_ink_message;
        builder.maximum_ink_coverage = this.maximum_ink_coverage;
        builder.card_option_sections = this.card_option_sections;
        builder.customization_area = this.customization_area;
        builder.formatted_cashtag = this.formatted_cashtag;
        builder.selected_card_option_identifier = this.selected_card_option_identifier;
        builder.inputted_legal_name = this.inputted_legal_name;
        builder.available_stamps = this.available_stamps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.style_picker_title_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "style_picker_title_text=", arrayList);
        }
        LocalizableString localizableString = this.localized_style_picker_title_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_style_picker_title_text=", localizableString, arrayList);
        }
        String str2 = this.style_picker_short_title_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "style_picker_short_title_text=", arrayList);
        }
        LocalizableString localizableString2 = this.localized_style_picker_short_title_text;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_style_picker_short_title_text=", localizableString2, arrayList);
        }
        String str3 = this.customization_prompt_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "customization_prompt_text=", arrayList);
        }
        LocalizableString localizableString3 = this.localized_customization_prompt_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_customization_prompt_text=", localizableString3, arrayList);
        }
        String str4 = this.cashtag_toggle_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "cashtag_toggle_text=", arrayList);
        }
        LocalizableString localizableString4 = this.localized_cashtag_toggle_text;
        if (localizableString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_cashtag_toggle_text=", localizableString4, arrayList);
        }
        String str5 = this.customization_title_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "customization_title_text=", arrayList);
        }
        LocalizableString localizableString5 = this.localized_customization_title_text;
        if (localizableString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_customization_title_text=", localizableString5, arrayList);
        }
        String str6 = this.stamp_added_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "stamp_added_text=", arrayList);
        }
        LocalizableString localizableString6 = this.localized_stamp_added_text;
        if (localizableString6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_stamp_added_text=", localizableString6, arrayList);
        }
        String str7 = this.return_to_draw_mode_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "return_to_draw_mode_text=", arrayList);
        }
        LocalizableString localizableString7 = this.localized_return_to_draw_mode_text;
        if (localizableString7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_return_to_draw_mode_text=", localizableString7, arrayList);
        }
        String str8 = this.too_much_ink_message;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "too_much_ink_message=", arrayList);
        }
        LocalizableString localizableString8 = this.localized_too_much_ink_message;
        if (localizableString8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_too_much_ink_message=", localizableString8, arrayList);
        }
        Float f = this.maximum_ink_coverage;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("maximum_ink_coverage=", f, arrayList);
        }
        if (!this.card_option_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("card_option_sections=", arrayList, this.card_option_sections);
        }
        CardCustomizationData.CustomizationArea customizationArea = this.customization_area;
        if (customizationArea != null) {
            arrayList.add("customization_area=" + customizationArea);
        }
        if (this.formatted_cashtag != null) {
            arrayList.add("formatted_cashtag=██");
        }
        String str9 = this.selected_card_option_identifier;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "selected_card_option_identifier=", arrayList);
        }
        if (this.inputted_legal_name != null) {
            arrayList.add("inputted_legal_name=██");
        }
        if (!this.available_stamps.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_stamps=", arrayList, this.available_stamps);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardCustomizationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JP\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection$Builder;", "header_text", "", "localized_header_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "short_title_text", "localized_short_title_text", "options", "", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CardOptionSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardOptionSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 4)
        public final LocalizableString localized_header_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 5)
        public final LocalizableString localized_short_title_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 3)
        public final List<CardOption> options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 2)
        public final String short_title_text;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "<init>", "()V", "header_text", "", "localized_header_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "short_title_text", "localized_short_title_text", "options", "", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String header_text;
            public LocalizableString localized_header_text;
            public LocalizableString localized_short_title_text;
            public List<CardOption> options = EmptyList.INSTANCE;
            public String short_title_text;

            @Override // com.squareup.wire.Message.Builder
            public CardOptionSection build() {
                return new CardOptionSection(this.header_text, this.localized_header_text, this.short_title_text, this.localized_short_title_text, this.options, buildUnknownFields());
            }

            public final Builder header_text(String header_text) {
                this.header_text = header_text;
                return this;
            }

            public final Builder localized_header_text(LocalizableString localized_header_text) {
                this.localized_header_text = localized_header_text;
                return this;
            }

            public final Builder localized_short_title_text(LocalizableString localized_short_title_text) {
                this.localized_short_title_text = localized_short_title_text;
                return this;
            }

            public final Builder options(List<CardOption> options) {
                options.getClass();
                TransactorKt.checkElementsNotNull(options);
                this.options = options;
                return this;
            }

            public final Builder short_title_text(String short_title_text) {
                this.short_title_text = short_title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardOptionSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardOptionSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardOptionSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CardCustomizationBlocker.CardOptionSection((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            m.add(CardCustomizationBlocker.CardOption.ADAPTER.decode(reader));
                        } else if (nextTag == 4) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CardCustomizationBlocker.CardOptionSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header_text);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 4, value.localized_header_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.short_title_text);
                    protoAdapter3.encodeWithTag(writer, 5, value.localized_short_title_text);
                    CardCustomizationBlocker.CardOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CardCustomizationBlocker.CardOptionSection value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.header_text) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    return CardCustomizationBlocker.CardOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.options) + protoAdapter3.encodedSizeWithTag(5, value.localized_short_title_text) + protoAdapter2.encodedSizeWithTag(2, value.short_title_text) + protoAdapter3.encodedSizeWithTag(4, value.localized_header_text) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardOptionSection redact(CardCustomizationBlocker.CardOptionSection value) {
                    value.getClass();
                    LocalizableString localizableString = value.localized_header_text;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localized_short_title_text;
                    return CardCustomizationBlocker.CardOptionSection.copy$default(value, null, localizableString2, null, localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null, TransactorKt.m1169redactElements(value.options, CardCustomizationBlocker.CardOption.ADAPTER), ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CardCustomizationBlocker.CardOptionSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CardCustomizationBlocker.CardOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                    ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.localized_short_title_text);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 2, value.short_title_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.localized_header_text);
                    protoAdapter3.encodeWithTag(writer, 1, value.header_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public CardOptionSection(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : localizableString2, (i & 16) != 0 ? EmptyList.INSTANCE : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CardOptionSection copy$default(CardOptionSection cardOptionSection, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardOptionSection.header_text;
            }
            if ((i & 2) != 0) {
                localizableString = cardOptionSection.localized_header_text;
            }
            if ((i & 4) != 0) {
                str2 = cardOptionSection.short_title_text;
            }
            if ((i & 8) != 0) {
                localizableString2 = cardOptionSection.localized_short_title_text;
            }
            if ((i & 16) != 0) {
                list = cardOptionSection.options;
            }
            if ((i & 32) != 0) {
                byteString = cardOptionSection.unknownFields();
            }
            List list2 = list;
            ByteString byteString2 = byteString;
            return cardOptionSection.copy(str, localizableString, str2, localizableString2, list2, byteString2);
        }

        public final CardOptionSection copy(String header_text, LocalizableString localized_header_text, String short_title_text, LocalizableString localized_short_title_text, List<CardOption> options, ByteString unknownFields) {
            options.getClass();
            unknownFields.getClass();
            return new CardOptionSection(header_text, localized_header_text, short_title_text, localized_short_title_text, options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CardOptionSection)) {
                return false;
            }
            CardOptionSection cardOptionSection = (CardOptionSection) other;
            return Intrinsics.areEqual(unknownFields(), cardOptionSection.unknownFields()) && Intrinsics.areEqual(this.header_text, cardOptionSection.header_text) && Intrinsics.areEqual(this.localized_header_text, cardOptionSection.localized_header_text) && Intrinsics.areEqual(this.short_title_text, cardOptionSection.short_title_text) && Intrinsics.areEqual(this.localized_short_title_text, cardOptionSection.localized_short_title_text) && Intrinsics.areEqual(this.options, cardOptionSection.options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localized_header_text;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.short_title_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localized_short_title_text;
            int hashCode5 = this.options.hashCode() + ((hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_text = this.header_text;
            builder.localized_header_text = this.localized_header_text;
            builder.short_title_text = this.short_title_text;
            builder.localized_short_title_text = this.localized_short_title_text;
            builder.options = this.options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
            }
            LocalizableString localizableString = this.localized_header_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_header_text=", localizableString, arrayList);
            }
            String str2 = this.short_title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "short_title_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localized_short_title_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_short_title_text=", localizableString2, arrayList);
            }
            if (!this.options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardOptionSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardOptionSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CardOptionSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CardOptionSection() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardOptionSection(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, List<CardOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_text = str;
            this.localized_header_text = localizableString;
            this.short_title_text = str2;
            this.localized_short_title_text = localizableString2;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&BÅ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0082\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004J\b\u0010#\u001a\u00020\u0004H\u0016JÄ\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u001bR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText$Builder;", "title", "", "localized_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "body", "localized_body", "customize_card_button_title", "localized_customize_card_button_title", "edit_customization_button_title", "localized_edit_customization_button_title", "order_card_button_title", "localized_order_card_button_title", "app_theme_text", "localized_app_theme_text", "app_theme_text_color_override", "preview_sheet", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "app_theme_ui_text_color_override", "Lcom/squareup/protos/cash/ui/Color;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "getApp_theme_text_color_override$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CardPreviewText extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardPreviewText> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
        public final String app_theme_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
        public final String app_theme_text_color_override;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 14, tag = 15)
        public final Color app_theme_ui_text_color_override;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 3)
        public final String customize_card_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 4)
        public final String edit_customization_button_title;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 11, tag = 12)
        public final LocalizableString localized_app_theme_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 7)
        public final LocalizableString localized_body;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 5, tag = 8)
        public final LocalizableString localized_customize_card_button_title;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 7, tag = 9)
        public final LocalizableString localized_edit_customization_button_title;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 9, tag = 10)
        public final LocalizableString localized_order_card_button_title;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 6)
        public final LocalizableString localized_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 5)
        public final String order_card_button_title;

        @WireField(adapter = "com.squareup.protos.franklin.api.CardCustomizationBlocker$PreviewHalfSheetContent#ADAPTER", schemaIndex = 13, tag = 14)
        public final PreviewHalfSheetContent preview_sheet;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "<init>", "()V", "title", "", "localized_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "body", "localized_body", "customize_card_button_title", "localized_customize_card_button_title", "edit_customization_button_title", "localized_edit_customization_button_title", "order_card_button_title", "localized_order_card_button_title", "app_theme_text", "localized_app_theme_text", "app_theme_text_color_override", "preview_sheet", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$PreviewHalfSheetContent;", "app_theme_ui_text_color_override", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String app_theme_text;
            public String app_theme_text_color_override;
            public Color app_theme_ui_text_color_override;
            public String body;
            public String customize_card_button_title;
            public String edit_customization_button_title;
            public LocalizableString localized_app_theme_text;
            public LocalizableString localized_body;
            public LocalizableString localized_customize_card_button_title;
            public LocalizableString localized_edit_customization_button_title;
            public LocalizableString localized_order_card_button_title;
            public LocalizableString localized_title;
            public String order_card_button_title;
            public PreviewHalfSheetContent preview_sheet;
            public String title;

            public final Builder app_theme_text(String app_theme_text) {
                this.app_theme_text = app_theme_text;
                return this;
            }

            @Deprecated
            public final Builder app_theme_text_color_override(String app_theme_text_color_override) {
                this.app_theme_text_color_override = app_theme_text_color_override;
                return this;
            }

            public final Builder app_theme_ui_text_color_override(Color app_theme_ui_text_color_override) {
                this.app_theme_ui_text_color_override = app_theme_ui_text_color_override;
                return this;
            }

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public CardPreviewText build() {
                return new CardPreviewText(this.title, this.localized_title, this.body, this.localized_body, this.customize_card_button_title, this.localized_customize_card_button_title, this.edit_customization_button_title, this.localized_edit_customization_button_title, this.order_card_button_title, this.localized_order_card_button_title, this.app_theme_text, this.localized_app_theme_text, this.app_theme_text_color_override, this.preview_sheet, this.app_theme_ui_text_color_override, buildUnknownFields());
            }

            public final Builder customize_card_button_title(String customize_card_button_title) {
                this.customize_card_button_title = customize_card_button_title;
                return this;
            }

            public final Builder edit_customization_button_title(String edit_customization_button_title) {
                this.edit_customization_button_title = edit_customization_button_title;
                return this;
            }

            public final Builder localized_app_theme_text(LocalizableString localized_app_theme_text) {
                this.localized_app_theme_text = localized_app_theme_text;
                return this;
            }

            public final Builder localized_body(LocalizableString localized_body) {
                this.localized_body = localized_body;
                return this;
            }

            public final Builder localized_customize_card_button_title(LocalizableString localized_customize_card_button_title) {
                this.localized_customize_card_button_title = localized_customize_card_button_title;
                return this;
            }

            public final Builder localized_edit_customization_button_title(LocalizableString localized_edit_customization_button_title) {
                this.localized_edit_customization_button_title = localized_edit_customization_button_title;
                return this;
            }

            public final Builder localized_order_card_button_title(LocalizableString localized_order_card_button_title) {
                this.localized_order_card_button_title = localized_order_card_button_title;
                return this;
            }

            public final Builder localized_title(LocalizableString localized_title) {
                this.localized_title = localized_title;
                return this;
            }

            public final Builder order_card_button_title(String order_card_button_title) {
                this.order_card_button_title = order_card_button_title;
                return this;
            }

            public final Builder preview_sheet(PreviewHalfSheetContent preview_sheet) {
                this.preview_sheet = preview_sheet;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardPreviewText.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CardCustomizationBlocker$CardPreviewText$Companion$ADAPTER$1
                /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardPreviewText decode(ProtoReader reader) {
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
                    Object obj15 = null;
                    Object obj16 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        Object obj17 = obj8;
                        if (nextTag == -1) {
                            return new CardCustomizationBlocker.CardPreviewText((String) obj3, (LocalizableString) obj4, (String) obj15, (LocalizableString) obj6, (String) obj16, (LocalizableString) obj7, (String) obj17, (LocalizableString) obj9, (String) obj10, (LocalizableString) obj11, (String) obj12, (LocalizableString) obj13, (String) obj14, (CardCustomizationBlocker.PreviewHalfSheetContent) obj2, (Color) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                break;
                            case 2:
                                obj15 = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 3:
                                obj16 = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 4:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                obj = obj3;
                                break;
                            case 5:
                                obj10 = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 6:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                                obj = obj3;
                                obj8 = obj17;
                                break;
                            case 7:
                                obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj6);
                                obj = obj3;
                                obj8 = obj17;
                                break;
                            case 8:
                                obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 9:
                                obj9 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj9);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 10:
                                obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj11);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 11:
                                obj12 = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 12:
                                obj13 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj13);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 13:
                                obj14 = ProtoAdapter.STRING.decode(reader);
                                obj8 = obj17;
                                obj = obj3;
                                break;
                            case 14:
                                obj2 = TransactorKt.decodeMessageOrMerge(CardCustomizationBlocker.PreviewHalfSheetContent.ADAPTER, reader, obj2);
                                obj = obj3;
                                obj8 = obj17;
                                break;
                            case 15:
                                obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                                obj = obj3;
                                obj8 = obj17;
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj3;
                                obj8 = obj17;
                                break;
                        }
                        obj3 = obj;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CardCustomizationBlocker.CardPreviewText value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 6, value.localized_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter3.encodeWithTag(writer, 7, value.localized_body);
                    protoAdapter2.encodeWithTag(writer, 3, value.customize_card_button_title);
                    protoAdapter3.encodeWithTag(writer, 8, value.localized_customize_card_button_title);
                    protoAdapter2.encodeWithTag(writer, 4, value.edit_customization_button_title);
                    protoAdapter3.encodeWithTag(writer, 9, value.localized_edit_customization_button_title);
                    protoAdapter2.encodeWithTag(writer, 5, value.order_card_button_title);
                    protoAdapter3.encodeWithTag(writer, 10, value.localized_order_card_button_title);
                    protoAdapter2.encodeWithTag(writer, 11, value.app_theme_text);
                    protoAdapter3.encodeWithTag(writer, 12, value.localized_app_theme_text);
                    protoAdapter2.encodeWithTag(writer, 13, value.app_theme_text_color_override);
                    CardCustomizationBlocker.PreviewHalfSheetContent.ADAPTER.encodeWithTag(writer, 14, value.preview_sheet);
                    Color.ADAPTER.encodeWithTag(writer, 15, value.app_theme_ui_text_color_override);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CardCustomizationBlocker.CardPreviewText value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    return Color.ADAPTER.encodedSizeWithTag(15, value.app_theme_ui_text_color_override) + CardCustomizationBlocker.PreviewHalfSheetContent.ADAPTER.encodedSizeWithTag(14, value.preview_sheet) + protoAdapter2.encodedSizeWithTag(13, value.app_theme_text_color_override) + protoAdapter3.encodedSizeWithTag(12, value.localized_app_theme_text) + protoAdapter2.encodedSizeWithTag(11, value.app_theme_text) + protoAdapter3.encodedSizeWithTag(10, value.localized_order_card_button_title) + protoAdapter2.encodedSizeWithTag(5, value.order_card_button_title) + protoAdapter3.encodedSizeWithTag(9, value.localized_edit_customization_button_title) + protoAdapter2.encodedSizeWithTag(4, value.edit_customization_button_title) + protoAdapter3.encodedSizeWithTag(8, value.localized_customize_card_button_title) + protoAdapter2.encodedSizeWithTag(3, value.customize_card_button_title) + protoAdapter3.encodedSizeWithTag(7, value.localized_body) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter3.encodedSizeWithTag(6, value.localized_title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CardCustomizationBlocker.CardPreviewText redact(CardCustomizationBlocker.CardPreviewText value) {
                    CardCustomizationBlocker.CardPreviewText copy;
                    value.getClass();
                    LocalizableString localizableString = value.localized_title;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localized_body;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    LocalizableString localizableString5 = value.localized_customize_card_button_title;
                    LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                    LocalizableString localizableString7 = value.localized_edit_customization_button_title;
                    LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
                    LocalizableString localizableString9 = value.localized_order_card_button_title;
                    LocalizableString localizableString10 = localizableString9 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString9) : null;
                    LocalizableString localizableString11 = value.localized_app_theme_text;
                    LocalizableString localizableString12 = localizableString11 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString11) : null;
                    CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent = value.preview_sheet;
                    CardCustomizationBlocker.PreviewHalfSheetContent previewHalfSheetContent2 = previewHalfSheetContent != null ? (CardCustomizationBlocker.PreviewHalfSheetContent) CardCustomizationBlocker.PreviewHalfSheetContent.ADAPTER.redact(previewHalfSheetContent) : null;
                    Color color = value.app_theme_ui_text_color_override;
                    copy = value.copy((r34 & 1) != 0 ? value.title : null, (r34 & 2) != 0 ? value.localized_title : localizableString2, (r34 & 4) != 0 ? value.body : null, (r34 & 8) != 0 ? value.localized_body : localizableString4, (r34 & 16) != 0 ? value.customize_card_button_title : null, (r34 & 32) != 0 ? value.localized_customize_card_button_title : localizableString6, (r34 & 64) != 0 ? value.edit_customization_button_title : null, (r34 & 128) != 0 ? value.localized_edit_customization_button_title : localizableString8, (r34 & 256) != 0 ? value.order_card_button_title : null, (r34 & 512) != 0 ? value.localized_order_card_button_title : localizableString10, (r34 & 1024) != 0 ? value.app_theme_text : null, (r34 & 2048) != 0 ? value.localized_app_theme_text : localizableString12, (r34 & 4096) != 0 ? value.app_theme_text_color_override : null, (r34 & PKIFailureInfo.certRevoked) != 0 ? value.preview_sheet : previewHalfSheetContent2, (r34 & 16384) != 0 ? value.app_theme_ui_text_color_override : color != null ? (Color) Color.ADAPTER.redact(color) : null, (r34 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
                    return copy;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CardCustomizationBlocker.CardPreviewText value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Color.ADAPTER.encodeWithTag(writer, 15, value.app_theme_ui_text_color_override);
                    CardCustomizationBlocker.PreviewHalfSheetContent.ADAPTER.encodeWithTag(writer, 14, value.preview_sheet);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 13, value.app_theme_text_color_override);
                    ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 12, value.localized_app_theme_text);
                    protoAdapter2.encodeWithTag(writer, 11, value.app_theme_text);
                    protoAdapter3.encodeWithTag(writer, 10, value.localized_order_card_button_title);
                    protoAdapter2.encodeWithTag(writer, 5, value.order_card_button_title);
                    protoAdapter3.encodeWithTag(writer, 9, value.localized_edit_customization_button_title);
                    protoAdapter2.encodeWithTag(writer, 4, value.edit_customization_button_title);
                    protoAdapter3.encodeWithTag(writer, 8, value.localized_customize_card_button_title);
                    protoAdapter2.encodeWithTag(writer, 3, value.customize_card_button_title);
                    protoAdapter3.encodeWithTag(writer, 7, value.localized_body);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter3.encodeWithTag(writer, 6, value.localized_title);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CardPreviewText(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, String str3, LocalizableString localizableString3, String str4, LocalizableString localizableString4, String str5, LocalizableString localizableString5, String str6, LocalizableString localizableString6, String str7, PreviewHalfSheetContent previewHalfSheetContent, Color color, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizableString, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : localizableString2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : localizableString3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : localizableString4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : localizableString5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : localizableString6, (i & 4096) != 0 ? null : str7, (i & PKIFailureInfo.certRevoked) != 0 ? null : previewHalfSheetContent, (i & 16384) != 0 ? null : color, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
        }

        @Deprecated
        public static /* synthetic */ void getApp_theme_text_color_override$annotations() {
        }

        public final CardPreviewText copy(String title, LocalizableString localized_title, String body, LocalizableString localized_body, String customize_card_button_title, LocalizableString localized_customize_card_button_title, String edit_customization_button_title, LocalizableString localized_edit_customization_button_title, String order_card_button_title, LocalizableString localized_order_card_button_title, String app_theme_text, LocalizableString localized_app_theme_text, String app_theme_text_color_override, PreviewHalfSheetContent preview_sheet, Color app_theme_ui_text_color_override, ByteString unknownFields) {
            unknownFields.getClass();
            return new CardPreviewText(title, localized_title, body, localized_body, customize_card_button_title, localized_customize_card_button_title, edit_customization_button_title, localized_edit_customization_button_title, order_card_button_title, localized_order_card_button_title, app_theme_text, localized_app_theme_text, app_theme_text_color_override, preview_sheet, app_theme_ui_text_color_override, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CardPreviewText)) {
                return false;
            }
            CardPreviewText cardPreviewText = (CardPreviewText) other;
            return Intrinsics.areEqual(unknownFields(), cardPreviewText.unknownFields()) && Intrinsics.areEqual(this.title, cardPreviewText.title) && Intrinsics.areEqual(this.localized_title, cardPreviewText.localized_title) && Intrinsics.areEqual(this.body, cardPreviewText.body) && Intrinsics.areEqual(this.localized_body, cardPreviewText.localized_body) && Intrinsics.areEqual(this.customize_card_button_title, cardPreviewText.customize_card_button_title) && Intrinsics.areEqual(this.localized_customize_card_button_title, cardPreviewText.localized_customize_card_button_title) && Intrinsics.areEqual(this.edit_customization_button_title, cardPreviewText.edit_customization_button_title) && Intrinsics.areEqual(this.localized_edit_customization_button_title, cardPreviewText.localized_edit_customization_button_title) && Intrinsics.areEqual(this.order_card_button_title, cardPreviewText.order_card_button_title) && Intrinsics.areEqual(this.localized_order_card_button_title, cardPreviewText.localized_order_card_button_title) && Intrinsics.areEqual(this.app_theme_text, cardPreviewText.app_theme_text) && Intrinsics.areEqual(this.localized_app_theme_text, cardPreviewText.localized_app_theme_text) && Intrinsics.areEqual(this.app_theme_text_color_override, cardPreviewText.app_theme_text_color_override) && Intrinsics.areEqual(this.preview_sheet, cardPreviewText.preview_sheet) && Intrinsics.areEqual(this.app_theme_ui_text_color_override, cardPreviewText.app_theme_ui_text_color_override);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localized_title;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localized_body;
            int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            String str3 = this.customize_card_button_title;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString3 = this.localized_customize_card_button_title;
            int hashCode7 = (hashCode6 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
            String str4 = this.edit_customization_button_title;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
            LocalizableString localizableString4 = this.localized_edit_customization_button_title;
            int hashCode9 = (hashCode8 + (localizableString4 != null ? localizableString4.hashCode() : 0)) * 37;
            String str5 = this.order_card_button_title;
            int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
            LocalizableString localizableString5 = this.localized_order_card_button_title;
            int hashCode11 = (hashCode10 + (localizableString5 != null ? localizableString5.hashCode() : 0)) * 37;
            String str6 = this.app_theme_text;
            int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
            LocalizableString localizableString6 = this.localized_app_theme_text;
            int hashCode13 = (hashCode12 + (localizableString6 != null ? localizableString6.hashCode() : 0)) * 37;
            String str7 = this.app_theme_text_color_override;
            int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
            PreviewHalfSheetContent previewHalfSheetContent = this.preview_sheet;
            int hashCode15 = (hashCode14 + (previewHalfSheetContent != null ? previewHalfSheetContent.hashCode() : 0)) * 37;
            Color color = this.app_theme_ui_text_color_override;
            int hashCode16 = hashCode15 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode16;
            return hashCode16;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.localized_title = this.localized_title;
            builder.body = this.body;
            builder.localized_body = this.localized_body;
            builder.customize_card_button_title = this.customize_card_button_title;
            builder.localized_customize_card_button_title = this.localized_customize_card_button_title;
            builder.edit_customization_button_title = this.edit_customization_button_title;
            builder.localized_edit_customization_button_title = this.localized_edit_customization_button_title;
            builder.order_card_button_title = this.order_card_button_title;
            builder.localized_order_card_button_title = this.localized_order_card_button_title;
            builder.app_theme_text = this.app_theme_text;
            builder.localized_app_theme_text = this.localized_app_theme_text;
            builder.app_theme_text_color_override = this.app_theme_text_color_override;
            builder.preview_sheet = this.preview_sheet;
            builder.app_theme_ui_text_color_override = this.app_theme_ui_text_color_override;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            LocalizableString localizableString = this.localized_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizableString, arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            LocalizableString localizableString2 = this.localized_body;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_body=", localizableString2, arrayList);
            }
            String str3 = this.customize_card_button_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "customize_card_button_title=", arrayList);
            }
            LocalizableString localizableString3 = this.localized_customize_card_button_title;
            if (localizableString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_customize_card_button_title=", localizableString3, arrayList);
            }
            String str4 = this.edit_customization_button_title;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "edit_customization_button_title=", arrayList);
            }
            LocalizableString localizableString4 = this.localized_edit_customization_button_title;
            if (localizableString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_edit_customization_button_title=", localizableString4, arrayList);
            }
            String str5 = this.order_card_button_title;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "order_card_button_title=", arrayList);
            }
            LocalizableString localizableString5 = this.localized_order_card_button_title;
            if (localizableString5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_order_card_button_title=", localizableString5, arrayList);
            }
            String str6 = this.app_theme_text;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "app_theme_text=", arrayList);
            }
            LocalizableString localizableString6 = this.localized_app_theme_text;
            if (localizableString6 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_app_theme_text=", localizableString6, arrayList);
            }
            String str7 = this.app_theme_text_color_override;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "app_theme_text_color_override=", arrayList);
            }
            PreviewHalfSheetContent previewHalfSheetContent = this.preview_sheet;
            if (previewHalfSheetContent != null) {
                arrayList.add("preview_sheet=" + previewHalfSheetContent);
            }
            Color color = this.app_theme_ui_text_color_override;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("app_theme_ui_text_color_override=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardPreviewText{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$CardPreviewText;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CardPreviewText build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CardPreviewText() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardPreviewText(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, String str3, LocalizableString localizableString3, String str4, LocalizableString localizableString4, String str5, LocalizableString localizableString5, String str6, LocalizableString localizableString6, String str7, PreviewHalfSheetContent previewHalfSheetContent, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.localized_title = localizableString;
            this.body = str2;
            this.localized_body = localizableString2;
            this.customize_card_button_title = str3;
            this.localized_customize_card_button_title = localizableString3;
            this.edit_customization_button_title = str4;
            this.localized_edit_customization_button_title = localizableString4;
            this.order_card_button_title = str5;
            this.localized_order_card_button_title = localizableString5;
            this.app_theme_text = str6;
            this.localized_app_theme_text = localizableString6;
            this.app_theme_text_color_override = str7;
            this.preview_sheet = previewHalfSheetContent;
            this.app_theme_ui_text_color_override = color;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CardCustomizationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CardCustomizationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardCustomizationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
