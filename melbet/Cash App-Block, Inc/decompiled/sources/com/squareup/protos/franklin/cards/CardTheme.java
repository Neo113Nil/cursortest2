package com.squareup.protos.franklin.cards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.cards.CardTheme;
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
import kotlin.Deprecated;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00070/12345R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u0012\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u0012\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0005R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0005R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0005R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0005R\u001c\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0005\u0012\u0004\b+\u0010\bR\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/CardTheme$Builder;", "", "token", "Ljava/lang/String;", "title", "getTitle$annotations", "()V", "card_image_url", "getCard_image_url$annotations", "selector_image_url", "getSelector_image_url$annotations", "selector_foreground_color", "getSelector_foreground_color$annotations", "ink_color", "card_color", "card_highlight_color", "selector_border_color", "getSelector_border_color$annotations", "border_color", "Lcom/squareup/protos/franklin/cards/CardTheme$Identifier;", "id", "Lcom/squareup/protos/franklin/cards/CardTheme$Identifier;", "Lcom/squareup/protos/franklin/cards/CardTheme$Gradient;", "gradient_style", "Lcom/squareup/protos/franklin/cards/CardTheme$Gradient;", "Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage;", "background_image", "Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage;", "card_info_text_color", "mag_stripe_color", "back_ink_color", "help_link_color", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "card_customization_margin", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "group_name", "Lcom/squareup/protos/franklin/cards/CardTheme$Font;", "font", "Lcom/squareup/protos/franklin/cards/CardTheme$Font;", "mag_stripe_back_color", "pattern_grid_color", "getPattern_grid_color$annotations", "", "pattern_grid_alpha", "Ljava/lang/Float;", "Companion", "Builder", "Identifier", "Gradient", "BackgroundImage", "CardCustomizationMargin", "Font", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardTheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardTheme> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 16)
    public final String back_ink_color;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$BackgroundImage#ADAPTER", schemaIndex = 12, tag = 13)
    public final BackgroundImage background_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String border_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String card_color;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$CardCustomizationMargin#ADAPTER", schemaIndex = 17, tag = 18)
    public final CardCustomizationMargin card_customization_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String card_highlight_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String card_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    public final String card_info_text_color;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$Font#ADAPTER", schemaIndex = 19, tag = 20)
    public final Font font;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$Gradient#ADAPTER", schemaIndex = 11, tag = 12)
    public final Gradient gradient_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 19)
    public final String group_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 17)
    public final String help_link_color;

    @WireField(adapter = "com.squareup.protos.franklin.cards.CardTheme$Identifier#ADAPTER", schemaIndex = 10, tag = 11)
    public final Identifier id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String ink_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 21)
    public final String mag_stripe_back_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    public final String mag_stripe_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 22, tag = 23)
    public final Float pattern_grid_alpha;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 22)
    public final String pattern_grid_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String selector_border_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String selector_foreground_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String selector_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0012\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010#¨\u0006&"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/CardTheme;", "<init>", "()V", "token", "", "title", "card_image_url", "selector_image_url", "selector_foreground_color", "ink_color", "card_color", "card_highlight_color", "selector_border_color", "border_color", "id", "Lcom/squareup/protos/franklin/cards/CardTheme$Identifier;", "gradient_style", "Lcom/squareup/protos/franklin/cards/CardTheme$Gradient;", "background_image", "Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage;", "card_info_text_color", "mag_stripe_color", "back_ink_color", "help_link_color", "card_customization_margin", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "group_name", "font", "Lcom/squareup/protos/franklin/cards/CardTheme$Font;", "mag_stripe_back_color", "pattern_grid_color", "pattern_grid_alpha", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/cards/CardTheme$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public String back_ink_color;
        public BackgroundImage background_image;
        public String border_color;
        public String card_color;
        public CardCustomizationMargin card_customization_margin;
        public String card_highlight_color;
        public String card_image_url;
        public String card_info_text_color;
        public Font font;
        public Gradient gradient_style;
        public String group_name;
        public String help_link_color;
        public Identifier id;
        public String ink_color;
        public String mag_stripe_back_color;
        public String mag_stripe_color;
        public Float pattern_grid_alpha;
        public String pattern_grid_color;
        public String selector_border_color;
        public String selector_foreground_color;
        public String selector_image_url;
        public String title;
        public String token;

        public final Builder back_ink_color(String back_ink_color) {
            this.back_ink_color = back_ink_color;
            return this;
        }

        public final Builder background_image(BackgroundImage background_image) {
            this.background_image = background_image;
            return this;
        }

        public final Builder border_color(String border_color) {
            this.border_color = border_color;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardTheme build() {
            return new CardTheme(this.token, this.title, this.card_image_url, this.selector_image_url, this.selector_foreground_color, this.ink_color, this.card_color, this.card_highlight_color, this.selector_border_color, this.border_color, this.id, this.gradient_style, this.background_image, this.card_info_text_color, this.mag_stripe_color, this.back_ink_color, this.help_link_color, this.card_customization_margin, this.group_name, this.font, this.mag_stripe_back_color, this.pattern_grid_color, this.pattern_grid_alpha, buildUnknownFields());
        }

        public final Builder card_color(String card_color) {
            this.card_color = card_color;
            return this;
        }

        public final Builder card_customization_margin(CardCustomizationMargin card_customization_margin) {
            this.card_customization_margin = card_customization_margin;
            return this;
        }

        public final Builder card_highlight_color(String card_highlight_color) {
            this.card_highlight_color = card_highlight_color;
            return this;
        }

        @Deprecated
        public final Builder card_image_url(String card_image_url) {
            this.card_image_url = card_image_url;
            return this;
        }

        public final Builder card_info_text_color(String card_info_text_color) {
            this.card_info_text_color = card_info_text_color;
            return this;
        }

        public final Builder font(Font font) {
            this.font = font;
            return this;
        }

        public final Builder gradient_style(Gradient gradient_style) {
            this.gradient_style = gradient_style;
            return this;
        }

        public final Builder group_name(String group_name) {
            this.group_name = group_name;
            return this;
        }

        public final Builder help_link_color(String help_link_color) {
            this.help_link_color = help_link_color;
            return this;
        }

        public final Builder id(Identifier id) {
            this.id = id;
            return this;
        }

        public final Builder ink_color(String ink_color) {
            this.ink_color = ink_color;
            return this;
        }

        public final Builder mag_stripe_back_color(String mag_stripe_back_color) {
            this.mag_stripe_back_color = mag_stripe_back_color;
            return this;
        }

        public final Builder mag_stripe_color(String mag_stripe_color) {
            this.mag_stripe_color = mag_stripe_color;
            return this;
        }

        public final Builder pattern_grid_alpha(Float pattern_grid_alpha) {
            this.pattern_grid_alpha = pattern_grid_alpha;
            return this;
        }

        @Deprecated
        public final Builder pattern_grid_color(String pattern_grid_color) {
            this.pattern_grid_color = pattern_grid_color;
            return this;
        }

        @Deprecated
        public final Builder selector_border_color(String selector_border_color) {
            this.selector_border_color = selector_border_color;
            return this;
        }

        @Deprecated
        public final Builder selector_foreground_color(String selector_foreground_color) {
            this.selector_foreground_color = selector_foreground_color;
            return this;
        }

        @Deprecated
        public final Builder selector_image_url(String selector_image_url) {
            this.selector_image_url = selector_image_url;
            return this;
        }

        @Deprecated
        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardTheme.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$Companion$ADAPTER$1
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
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v60 */
            /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v63 */
            /* JADX WARN: Type inference failed for: r0v64 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public CardTheme decode(ProtoReader reader) {
                String str;
                String str2;
                String str3;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str4 = null;
                Object obj = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                CardTheme.Identifier identifier = null;
                CardTheme.Gradient gradient = null;
                CardTheme.BackgroundImage backgroundImage = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                CardTheme.Font font = null;
                String str18 = null;
                String str19 = null;
                Float f = null;
                String str20 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardTheme(str4, str20, str5, str6, str7, str8, str9, str10, str11, str12, identifier, gradient, backgroundImage, str13, str14, str15, str16, (CardTheme.CardCustomizationMargin) obj, str17, font, str18, str19, f, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str20 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 3:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 4:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 5:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 6:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 7:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 8:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 9:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 10:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 11:
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            try {
                                identifier = CardTheme.Identifier.ADAPTER.decode(reader);
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 12:
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            try {
                                gradient = CardTheme.Gradient.ADAPTER.decode(reader);
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 13:
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            try {
                                backgroundImage = CardTheme.BackgroundImage.ADAPTER.decode(reader);
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 14:
                            str13 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 15:
                            str14 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 16:
                            str15 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 17:
                            str16 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 18:
                            obj = TransactorKt.decodeMessageOrMerge(CardTheme.CardCustomizationMargin.ADAPTER, reader, obj);
                            decode = str4;
                            break;
                        case 19:
                            str17 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 20:
                            try {
                                font = CardTheme.Font.ADAPTER.decode(reader);
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                str = str5;
                                str2 = str6;
                                str3 = str7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 21:
                            str18 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 22:
                            str19 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 23:
                            f = ProtoAdapter.FLOAT.decode(reader);
                            decode = str4;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            decode = str4;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            break;
                    }
                    str4 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardTheme value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.card_image_url);
                protoAdapter2.encodeWithTag(writer, 4, value.selector_image_url);
                protoAdapter2.encodeWithTag(writer, 5, value.selector_foreground_color);
                protoAdapter2.encodeWithTag(writer, 6, value.ink_color);
                protoAdapter2.encodeWithTag(writer, 7, value.card_color);
                protoAdapter2.encodeWithTag(writer, 8, value.card_highlight_color);
                protoAdapter2.encodeWithTag(writer, 9, value.selector_border_color);
                protoAdapter2.encodeWithTag(writer, 10, value.border_color);
                CardTheme.Identifier.ADAPTER.encodeWithTag(writer, 11, value.id);
                CardTheme.Gradient.ADAPTER.encodeWithTag(writer, 12, value.gradient_style);
                CardTheme.BackgroundImage.ADAPTER.encodeWithTag(writer, 13, value.background_image);
                protoAdapter2.encodeWithTag(writer, 14, value.card_info_text_color);
                protoAdapter2.encodeWithTag(writer, 15, value.mag_stripe_color);
                protoAdapter2.encodeWithTag(writer, 16, value.back_ink_color);
                protoAdapter2.encodeWithTag(writer, 17, value.help_link_color);
                CardTheme.CardCustomizationMargin.ADAPTER.encodeWithTag(writer, 18, value.card_customization_margin);
                protoAdapter2.encodeWithTag(writer, 19, value.group_name);
                CardTheme.Font.ADAPTER.encodeWithTag(writer, 20, value.font);
                protoAdapter2.encodeWithTag(writer, 21, value.mag_stripe_back_color);
                protoAdapter2.encodeWithTag(writer, 22, value.pattern_grid_color);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 23, value.pattern_grid_alpha);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardTheme value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.FLOAT.encodedSizeWithTag(23, value.pattern_grid_alpha) + protoAdapter2.encodedSizeWithTag(22, value.pattern_grid_color) + protoAdapter2.encodedSizeWithTag(21, value.mag_stripe_back_color) + CardTheme.Font.ADAPTER.encodedSizeWithTag(20, value.font) + protoAdapter2.encodedSizeWithTag(19, value.group_name) + CardTheme.CardCustomizationMargin.ADAPTER.encodedSizeWithTag(18, value.card_customization_margin) + protoAdapter2.encodedSizeWithTag(17, value.help_link_color) + protoAdapter2.encodedSizeWithTag(16, value.back_ink_color) + protoAdapter2.encodedSizeWithTag(15, value.mag_stripe_color) + protoAdapter2.encodedSizeWithTag(14, value.card_info_text_color) + CardTheme.BackgroundImage.ADAPTER.encodedSizeWithTag(13, value.background_image) + CardTheme.Gradient.ADAPTER.encodedSizeWithTag(12, value.gradient_style) + CardTheme.Identifier.ADAPTER.encodedSizeWithTag(11, value.id) + protoAdapter2.encodedSizeWithTag(10, value.border_color) + protoAdapter2.encodedSizeWithTag(9, value.selector_border_color) + protoAdapter2.encodedSizeWithTag(8, value.card_highlight_color) + protoAdapter2.encodedSizeWithTag(7, value.card_color) + protoAdapter2.encodedSizeWithTag(6, value.ink_color) + protoAdapter2.encodedSizeWithTag(5, value.selector_foreground_color) + protoAdapter2.encodedSizeWithTag(4, value.selector_image_url) + protoAdapter2.encodedSizeWithTag(3, value.card_image_url) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardTheme redact(CardTheme value) {
                value.getClass();
                CardTheme.CardCustomizationMargin cardCustomizationMargin = value.card_customization_margin;
                return CardTheme.copy$default(value, null, cardCustomizationMargin != null ? (CardTheme.CardCustomizationMargin) CardTheme.CardCustomizationMargin.ADAPTER.redact(cardCustomizationMargin) : null, ByteString.EMPTY, 8257535);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardTheme value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 23, value.pattern_grid_alpha);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 22, value.pattern_grid_color);
                protoAdapter2.encodeWithTag(writer, 21, value.mag_stripe_back_color);
                CardTheme.Font.ADAPTER.encodeWithTag(writer, 20, value.font);
                protoAdapter2.encodeWithTag(writer, 19, value.group_name);
                CardTheme.CardCustomizationMargin.ADAPTER.encodeWithTag(writer, 18, value.card_customization_margin);
                protoAdapter2.encodeWithTag(writer, 17, value.help_link_color);
                protoAdapter2.encodeWithTag(writer, 16, value.back_ink_color);
                protoAdapter2.encodeWithTag(writer, 15, value.mag_stripe_color);
                protoAdapter2.encodeWithTag(writer, 14, value.card_info_text_color);
                CardTheme.BackgroundImage.ADAPTER.encodeWithTag(writer, 13, value.background_image);
                CardTheme.Gradient.ADAPTER.encodeWithTag(writer, 12, value.gradient_style);
                CardTheme.Identifier.ADAPTER.encodeWithTag(writer, 11, value.id);
                protoAdapter2.encodeWithTag(writer, 10, value.border_color);
                protoAdapter2.encodeWithTag(writer, 9, value.selector_border_color);
                protoAdapter2.encodeWithTag(writer, 8, value.card_highlight_color);
                protoAdapter2.encodeWithTag(writer, 7, value.card_color);
                protoAdapter2.encodeWithTag(writer, 6, value.ink_color);
                protoAdapter2.encodeWithTag(writer, 5, value.selector_foreground_color);
                protoAdapter2.encodeWithTag(writer, 4, value.selector_image_url);
                protoAdapter2.encodeWithTag(writer, 3, value.card_image_url);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ CardTheme(String str, String str2, String str3, String str4, Identifier identifier, Gradient gradient, BackgroundImage backgroundImage, String str5, String str6, String str7, CardCustomizationMargin cardCustomizationMargin, Font font, Float f, int i) {
        this(str, (i & 2) != 0 ? null : "Black", null, null, null, str2, str3, (i & 128) != 0 ? null : str4, null, null, (i & 1024) != 0 ? null : identifier, (i & 2048) != 0 ? null : gradient, (i & 4096) != 0 ? null : backgroundImage, str5, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : str7, null, (131072 & i) != 0 ? null : cardCustomizationMargin, null, (524288 & i) != 0 ? null : font, (1048576 & i) != 0 ? null : "#FF000000", null, (i & 4194304) != 0 ? null : f, ByteString.EMPTY);
    }

    public static CardTheme copy$default(CardTheme cardTheme, Gradient gradient, CardCustomizationMargin cardCustomizationMargin, ByteString byteString, int i) {
        String str;
        CardCustomizationMargin cardCustomizationMargin2;
        String str2 = cardTheme.token;
        String str3 = cardTheme.title;
        String str4 = cardTheme.card_image_url;
        String str5 = cardTheme.selector_image_url;
        String str6 = cardTheme.selector_foreground_color;
        String str7 = cardTheme.ink_color;
        String str8 = cardTheme.card_color;
        String str9 = cardTheme.card_highlight_color;
        String str10 = cardTheme.selector_border_color;
        String str11 = cardTheme.border_color;
        Identifier identifier = cardTheme.id;
        Gradient gradient2 = (i & 2048) != 0 ? cardTheme.gradient_style : gradient;
        BackgroundImage backgroundImage = cardTheme.background_image;
        Gradient gradient3 = gradient2;
        String str12 = cardTheme.card_info_text_color;
        String str13 = cardTheme.mag_stripe_color;
        String str14 = cardTheme.back_ink_color;
        String str15 = cardTheme.help_link_color;
        if ((i & PKIFailureInfo.unsupportedVersion) != 0) {
            str = str15;
            cardCustomizationMargin2 = cardTheme.card_customization_margin;
        } else {
            str = str15;
            cardCustomizationMargin2 = cardCustomizationMargin;
        }
        String str16 = cardTheme.group_name;
        Font font = cardTheme.font;
        String str17 = cardTheme.mag_stripe_back_color;
        String str18 = cardTheme.pattern_grid_color;
        Float f = cardTheme.pattern_grid_alpha;
        ByteString unknownFields = (i & 8388608) != 0 ? cardTheme.unknownFields() : byteString;
        cardTheme.getClass();
        unknownFields.getClass();
        return new CardTheme(str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, identifier, gradient3, backgroundImage, str12, str13, str14, str, cardCustomizationMargin2, str16, font, str17, str18, f, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardTheme)) {
            return false;
        }
        CardTheme cardTheme = (CardTheme) obj;
        return Intrinsics.areEqual(unknownFields(), cardTheme.unknownFields()) && Intrinsics.areEqual(this.token, cardTheme.token) && Intrinsics.areEqual(this.title, cardTheme.title) && Intrinsics.areEqual(this.card_image_url, cardTheme.card_image_url) && Intrinsics.areEqual(this.selector_image_url, cardTheme.selector_image_url) && Intrinsics.areEqual(this.selector_foreground_color, cardTheme.selector_foreground_color) && Intrinsics.areEqual(this.ink_color, cardTheme.ink_color) && Intrinsics.areEqual(this.card_color, cardTheme.card_color) && Intrinsics.areEqual(this.card_highlight_color, cardTheme.card_highlight_color) && Intrinsics.areEqual(this.selector_border_color, cardTheme.selector_border_color) && Intrinsics.areEqual(this.border_color, cardTheme.border_color) && this.id == cardTheme.id && this.gradient_style == cardTheme.gradient_style && this.background_image == cardTheme.background_image && Intrinsics.areEqual(this.card_info_text_color, cardTheme.card_info_text_color) && Intrinsics.areEqual(this.mag_stripe_color, cardTheme.mag_stripe_color) && Intrinsics.areEqual(this.back_ink_color, cardTheme.back_ink_color) && Intrinsics.areEqual(this.help_link_color, cardTheme.help_link_color) && Intrinsics.areEqual(this.card_customization_margin, cardTheme.card_customization_margin) && Intrinsics.areEqual(this.group_name, cardTheme.group_name) && this.font == cardTheme.font && Intrinsics.areEqual(this.mag_stripe_back_color, cardTheme.mag_stripe_back_color) && Intrinsics.areEqual(this.pattern_grid_color, cardTheme.pattern_grid_color) && Intrinsics.areEqual(this.pattern_grid_alpha, cardTheme.pattern_grid_alpha);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.card_image_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.selector_image_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.selector_foreground_color;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.ink_color;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.card_color;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.card_highlight_color;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.selector_border_color;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.border_color;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        Identifier identifier = this.id;
        int hashCode12 = (hashCode11 + (identifier != null ? identifier.hashCode() : 0)) * 37;
        Gradient gradient = this.gradient_style;
        int hashCode13 = (hashCode12 + (gradient != null ? gradient.hashCode() : 0)) * 37;
        BackgroundImage backgroundImage = this.background_image;
        int hashCode14 = (hashCode13 + (backgroundImage != null ? backgroundImage.hashCode() : 0)) * 37;
        String str11 = this.card_info_text_color;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.mag_stripe_color;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.back_ink_color;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.help_link_color;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        CardCustomizationMargin cardCustomizationMargin = this.card_customization_margin;
        int hashCode19 = (hashCode18 + (cardCustomizationMargin != null ? cardCustomizationMargin.hashCode() : 0)) * 37;
        String str15 = this.group_name;
        int hashCode20 = (hashCode19 + (str15 != null ? str15.hashCode() : 0)) * 37;
        Font font = this.font;
        int hashCode21 = (hashCode20 + (font != null ? font.hashCode() : 0)) * 37;
        String str16 = this.mag_stripe_back_color;
        int hashCode22 = (hashCode21 + (str16 != null ? str16.hashCode() : 0)) * 37;
        String str17 = this.pattern_grid_color;
        int hashCode23 = (hashCode22 + (str17 != null ? str17.hashCode() : 0)) * 37;
        Float f = this.pattern_grid_alpha;
        int hashCode24 = hashCode23 + (f != null ? Float.hashCode(f.floatValue()) : 0);
        this.hashCode = hashCode24;
        return hashCode24;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.title = this.title;
        builder.card_image_url = this.card_image_url;
        builder.selector_image_url = this.selector_image_url;
        builder.selector_foreground_color = this.selector_foreground_color;
        builder.ink_color = this.ink_color;
        builder.card_color = this.card_color;
        builder.card_highlight_color = this.card_highlight_color;
        builder.selector_border_color = this.selector_border_color;
        builder.border_color = this.border_color;
        builder.id = this.id;
        builder.gradient_style = this.gradient_style;
        builder.background_image = this.background_image;
        builder.card_info_text_color = this.card_info_text_color;
        builder.mag_stripe_color = this.mag_stripe_color;
        builder.back_ink_color = this.back_ink_color;
        builder.help_link_color = this.help_link_color;
        builder.card_customization_margin = this.card_customization_margin;
        builder.group_name = this.group_name;
        builder.font = this.font;
        builder.mag_stripe_back_color = this.mag_stripe_back_color;
        builder.pattern_grid_color = this.pattern_grid_color;
        builder.pattern_grid_alpha = this.pattern_grid_alpha;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.card_image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "card_image_url=", arrayList);
        }
        String str4 = this.selector_image_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "selector_image_url=", arrayList);
        }
        String str5 = this.selector_foreground_color;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "selector_foreground_color=", arrayList);
        }
        String str6 = this.ink_color;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "ink_color=", arrayList);
        }
        String str7 = this.card_color;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "card_color=", arrayList);
        }
        String str8 = this.card_highlight_color;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "card_highlight_color=", arrayList);
        }
        String str9 = this.selector_border_color;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "selector_border_color=", arrayList);
        }
        String str10 = this.border_color;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "border_color=", arrayList);
        }
        Identifier identifier = this.id;
        if (identifier != null) {
            arrayList.add("id=" + identifier);
        }
        Gradient gradient = this.gradient_style;
        if (gradient != null) {
            arrayList.add("gradient_style=" + gradient);
        }
        BackgroundImage backgroundImage = this.background_image;
        if (backgroundImage != null) {
            arrayList.add("background_image=" + backgroundImage);
        }
        String str11 = this.card_info_text_color;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "card_info_text_color=", arrayList);
        }
        String str12 = this.mag_stripe_color;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "mag_stripe_color=", arrayList);
        }
        String str13 = this.back_ink_color;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "back_ink_color=", arrayList);
        }
        String str14 = this.help_link_color;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "help_link_color=", arrayList);
        }
        CardCustomizationMargin cardCustomizationMargin = this.card_customization_margin;
        if (cardCustomizationMargin != null) {
            arrayList.add("card_customization_margin=" + cardCustomizationMargin);
        }
        String str15 = this.group_name;
        if (str15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str15, "group_name=", arrayList);
        }
        Font font = this.font;
        if (font != null) {
            arrayList.add("font=" + font);
        }
        String str16 = this.mag_stripe_back_color;
        if (str16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str16, "mag_stripe_back_color=", arrayList);
        }
        String str17 = this.pattern_grid_color;
        if (str17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str17, "pattern_grid_color=", arrayList);
        }
        Float f = this.pattern_grid_alpha;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pattern_grid_alpha=", f, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardTheme{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HOOD_BY_AIR", "HUNDRED_THIEVES", "METAL_OIL_SLICK", "METAL_BLACK", "SHANTELL_MARTIN", "SLIMEGUY", "TAP_DEVICE_TRIAL", "DREAM", "MOOD", "GLITTER", "TORTOISE", "HOLO", "BRAT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BackgroundImage implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BackgroundImage[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final BackgroundImage HOOD_BY_AIR = new BackgroundImage("HOOD_BY_AIR", 0, 1);
        public static final BackgroundImage HUNDRED_THIEVES = new BackgroundImage("HUNDRED_THIEVES", 1, 2);
        public static final BackgroundImage METAL_OIL_SLICK = new BackgroundImage("METAL_OIL_SLICK", 2, 3);
        public static final BackgroundImage METAL_BLACK = new BackgroundImage("METAL_BLACK", 3, 4);
        public static final BackgroundImage SHANTELL_MARTIN = new BackgroundImage("SHANTELL_MARTIN", 4, 5);
        public static final BackgroundImage SLIMEGUY = new BackgroundImage("SLIMEGUY", 5, 6);
        public static final BackgroundImage TAP_DEVICE_TRIAL = new BackgroundImage("TAP_DEVICE_TRIAL", 6, 7);
        public static final BackgroundImage DREAM = new BackgroundImage("DREAM", 7, 8);
        public static final BackgroundImage MOOD = new BackgroundImage("MOOD", 8, 9);
        public static final BackgroundImage GLITTER = new BackgroundImage("GLITTER", 9, 10);
        public static final BackgroundImage TORTOISE = new BackgroundImage("TORTOISE", 10, 11);
        public static final BackgroundImage HOLO = new BackgroundImage("HOLO", 11, 12);
        public static final BackgroundImage BRAT = new BackgroundImage("BRAT", 12, 13);

        private static final /* synthetic */ BackgroundImage[] $values() {
            return new BackgroundImage[]{HOOD_BY_AIR, HUNDRED_THIEVES, METAL_OIL_SLICK, METAL_BLACK, SHANTELL_MARTIN, SLIMEGUY, TAP_DEVICE_TRIAL, DREAM, MOOD, GLITTER, TORTOISE, HOLO, BRAT};
        }

        static {
            BackgroundImage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BackgroundImage.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$BackgroundImage$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardTheme.BackgroundImage fromValue(int value) {
                    return CardTheme.BackgroundImage.INSTANCE.fromValue(value);
                }
            };
        }

        private BackgroundImage(String str, int i, int i2) {
            this.value = i2;
        }

        public static final BackgroundImage fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BackgroundImage valueOf(String str) {
            return (BackgroundImage) Enum.valueOf(BackgroundImage.class, str);
        }

        public static BackgroundImage[] values() {
            return (BackgroundImage[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/cards/CardTheme$BackgroundImage;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BackgroundImage fromValue(int value) {
                switch (value) {
                    case 1:
                        return BackgroundImage.HOOD_BY_AIR;
                    case 2:
                        return BackgroundImage.HUNDRED_THIEVES;
                    case 3:
                        return BackgroundImage.METAL_OIL_SLICK;
                    case 4:
                        return BackgroundImage.METAL_BLACK;
                    case 5:
                        return BackgroundImage.SHANTELL_MARTIN;
                    case 6:
                        return BackgroundImage.SLIMEGUY;
                    case 7:
                        return BackgroundImage.TAP_DEVICE_TRIAL;
                    case 8:
                        return BackgroundImage.DREAM;
                    case 9:
                        return BackgroundImage.MOOD;
                    case 10:
                        return BackgroundImage.GLITTER;
                    case 11:
                        return BackgroundImage.TORTOISE;
                    case 12:
                        return BackgroundImage.HOLO;
                    case 13:
                        return BackgroundImage.BRAT;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin$Builder;", "color", "", "alpha", "", "size", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardCustomizationMargin extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardCustomizationMargin> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float alpha;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
        public final Float size;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "<init>", "()V", "color", "", "alpha", "", "Ljava/lang/Float;", "size", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public Float alpha;
            public String color;
            public Float size;

            public final Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public CardCustomizationMargin build() {
                return new CardCustomizationMargin(this.color, this.alpha, this.size, buildUnknownFields());
            }

            public final Builder color(String color) {
                this.color = color;
                return this;
            }

            public final Builder size(Float size) {
                this.size = size;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardCustomizationMargin.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$CardCustomizationMargin$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CardTheme.CardCustomizationMargin decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CardTheme.CardCustomizationMargin((String) obj, (Float) obj2, (Float) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CardTheme.CardCustomizationMargin value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.color);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 2, value.alpha);
                    protoAdapter2.encodeWithTag(writer, 3, value.size);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CardTheme.CardCustomizationMargin value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.color) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    return protoAdapter2.encodedSizeWithTag(3, value.size) + protoAdapter2.encodedSizeWithTag(2, value.alpha) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CardTheme.CardCustomizationMargin redact(CardTheme.CardCustomizationMargin value) {
                    value.getClass();
                    return CardTheme.CardCustomizationMargin.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CardTheme.CardCustomizationMargin value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 3, value.size);
                    protoAdapter2.encodeWithTag(writer, 2, value.alpha);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.color);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CardCustomizationMargin(String str, Float f, Float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CardCustomizationMargin copy$default(CardCustomizationMargin cardCustomizationMargin, String str, Float f, Float f2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardCustomizationMargin.color;
            }
            if ((i & 2) != 0) {
                f = cardCustomizationMargin.alpha;
            }
            if ((i & 4) != 0) {
                f2 = cardCustomizationMargin.size;
            }
            if ((i & 8) != 0) {
                byteString = cardCustomizationMargin.unknownFields();
            }
            return cardCustomizationMargin.copy(str, f, f2, byteString);
        }

        public final CardCustomizationMargin copy(String color, Float alpha, Float size, ByteString unknownFields) {
            unknownFields.getClass();
            return new CardCustomizationMargin(color, alpha, size, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CardCustomizationMargin)) {
                return false;
            }
            CardCustomizationMargin cardCustomizationMargin = (CardCustomizationMargin) other;
            return Intrinsics.areEqual(unknownFields(), cardCustomizationMargin.unknownFields()) && Intrinsics.areEqual(this.color, cardCustomizationMargin.color) && Intrinsics.areEqual(this.alpha, cardCustomizationMargin.alpha) && Intrinsics.areEqual(this.size, cardCustomizationMargin.size);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.color;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Float f = this.alpha;
            int hashCode3 = (hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.size;
            int hashCode4 = hashCode3 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.color = this.color;
            builder.alpha = this.alpha;
            builder.size = this.size;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.color;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "color=", arrayList);
            }
            Float f = this.alpha;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("alpha=", f, arrayList);
            }
            Float f2 = this.size;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("size=", f2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardCustomizationMargin{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/CardTheme$CardCustomizationMargin;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CardCustomizationMargin build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CardCustomizationMargin() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardCustomizationMargin(String str, Float f, Float f2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.color = str;
            this.alpha = f;
            this.size = f2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Font;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASH_MARKET_LIGHT", "SHANTELL_SANS", "CASH_MARKET_REGULAR", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Font implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Font[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Font CASH_MARKET_LIGHT = new Font("CASH_MARKET_LIGHT", 0, 1);
        public static final Font SHANTELL_SANS = new Font("SHANTELL_SANS", 1, 2);
        public static final Font CASH_MARKET_REGULAR = new Font("CASH_MARKET_REGULAR", 2, 3);

        private static final /* synthetic */ Font[] $values() {
            return new Font[]{CASH_MARKET_LIGHT, SHANTELL_SANS, CASH_MARKET_REGULAR};
        }

        static {
            Font[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Font.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$Font$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardTheme.Font fromValue(int value) {
                    return CardTheme.Font.INSTANCE.fromValue(value);
                }
            };
        }

        private Font(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Font fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Font valueOf(String str) {
            return (Font) Enum.valueOf(Font.class, str);
        }

        public static Font[] values() {
            return (Font[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Font$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/cards/CardTheme$Font;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Font fromValue(int value) {
                if (value == 1) {
                    return Font.CASH_MARKET_LIGHT;
                }
                if (value == 2) {
                    return Font.SHANTELL_SANS;
                }
                if (value != 3) {
                    return null;
                }
                return Font.CASH_MARKET_REGULAR;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Gradient;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIAGONAL_DARK", "DIAGONAL_LIGHT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Gradient implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Gradient[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Gradient DIAGONAL_DARK = new Gradient("DIAGONAL_DARK", 0, 1);
        public static final Gradient DIAGONAL_LIGHT = new Gradient("DIAGONAL_LIGHT", 1, 2);
        private final int value;

        private static final /* synthetic */ Gradient[] $values() {
            return new Gradient[]{DIAGONAL_DARK, DIAGONAL_LIGHT};
        }

        static {
            Gradient[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Gradient.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$Gradient$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardTheme.Gradient fromValue(int value) {
                    return CardTheme.Gradient.INSTANCE.fromValue(value);
                }
            };
        }

        private Gradient(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Gradient fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Gradient valueOf(String str) {
            return (Gradient) Enum.valueOf(Gradient.class, str);
        }

        public static Gradient[] values() {
            return (Gradient[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Gradient$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/cards/CardTheme$Gradient;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Gradient fromValue(int value) {
                if (value == 1) {
                    return Gradient.DIAGONAL_DARK;
                }
                if (value != 2) {
                    return null;
                }
                return Gradient.DIAGONAL_LIGHT;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Identifier;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BLACK", "WHITE", "HOOD_BY_AIR_ID", "GLOW_ID", "HUNDRED_THIEVES_ID", "METAL_OIL_SLICK_ID", "METAL_BLACK_ID", "SHANTELL_MARTIN_ID", "SLIMEGUY_ID", "TAP_DEVICE_TRIAL_ID", "DREAM_ID", "MOOD_ID", "PINK_ID", "HOLO_ID", "GLITTER_ID", "TORTOISE_ID", "BRAT_ID", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Identifier implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Identifier[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Identifier BLACK = new Identifier("BLACK", 0, 1);
        public static final Identifier WHITE = new Identifier("WHITE", 1, 2);
        public static final Identifier HOOD_BY_AIR_ID = new Identifier("HOOD_BY_AIR_ID", 2, 3);
        public static final Identifier GLOW_ID = new Identifier("GLOW_ID", 3, 4);
        public static final Identifier HUNDRED_THIEVES_ID = new Identifier("HUNDRED_THIEVES_ID", 4, 5);
        public static final Identifier METAL_OIL_SLICK_ID = new Identifier("METAL_OIL_SLICK_ID", 5, 6);
        public static final Identifier METAL_BLACK_ID = new Identifier("METAL_BLACK_ID", 6, 7);
        public static final Identifier SHANTELL_MARTIN_ID = new Identifier("SHANTELL_MARTIN_ID", 7, 8);
        public static final Identifier SLIMEGUY_ID = new Identifier("SLIMEGUY_ID", 8, 9);
        public static final Identifier TAP_DEVICE_TRIAL_ID = new Identifier("TAP_DEVICE_TRIAL_ID", 9, 10);
        public static final Identifier DREAM_ID = new Identifier("DREAM_ID", 10, 11);
        public static final Identifier MOOD_ID = new Identifier("MOOD_ID", 11, 12);
        public static final Identifier PINK_ID = new Identifier("PINK_ID", 12, 13);
        public static final Identifier HOLO_ID = new Identifier("HOLO_ID", 13, 14);
        public static final Identifier GLITTER_ID = new Identifier("GLITTER_ID", 14, 15);
        public static final Identifier TORTOISE_ID = new Identifier("TORTOISE_ID", 15, 16);
        public static final Identifier BRAT_ID = new Identifier("BRAT_ID", 16, 17);

        private static final /* synthetic */ Identifier[] $values() {
            return new Identifier[]{BLACK, WHITE, HOOD_BY_AIR_ID, GLOW_ID, HUNDRED_THIEVES_ID, METAL_OIL_SLICK_ID, METAL_BLACK_ID, SHANTELL_MARTIN_ID, SLIMEGUY_ID, TAP_DEVICE_TRIAL_ID, DREAM_ID, MOOD_ID, PINK_ID, HOLO_ID, GLITTER_ID, TORTOISE_ID, BRAT_ID};
        }

        static {
            Identifier[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Identifier.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardTheme$Identifier$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CardTheme.Identifier fromValue(int value) {
                    return CardTheme.Identifier.INSTANCE.fromValue(value);
                }
            };
        }

        private Identifier(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Identifier fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Identifier valueOf(String str) {
            return (Identifier) Enum.valueOf(Identifier.class, str);
        }

        public static Identifier[] values() {
            return (Identifier[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Identifier$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/cards/CardTheme$Identifier;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Identifier fromValue(int value) {
                switch (value) {
                    case 1:
                        return Identifier.BLACK;
                    case 2:
                        return Identifier.WHITE;
                    case 3:
                        return Identifier.HOOD_BY_AIR_ID;
                    case 4:
                        return Identifier.GLOW_ID;
                    case 5:
                        return Identifier.HUNDRED_THIEVES_ID;
                    case 6:
                        return Identifier.METAL_OIL_SLICK_ID;
                    case 7:
                        return Identifier.METAL_BLACK_ID;
                    case 8:
                        return Identifier.SHANTELL_MARTIN_ID;
                    case 9:
                        return Identifier.SLIMEGUY_ID;
                    case 10:
                        return Identifier.TAP_DEVICE_TRIAL_ID;
                    case 11:
                        return Identifier.DREAM_ID;
                    case 12:
                        return Identifier.MOOD_ID;
                    case 13:
                        return Identifier.PINK_ID;
                    case 14:
                        return Identifier.HOLO_ID;
                    case 15:
                        return Identifier.GLITTER_ID;
                    case 16:
                        return Identifier.TORTOISE_ID;
                    case 17:
                        return Identifier.BRAT_ID;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardTheme$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/CardTheme$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/CardTheme;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/CardTheme;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardTheme build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTheme(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Identifier identifier, Gradient gradient, BackgroundImage backgroundImage, String str11, String str12, String str13, String str14, CardCustomizationMargin cardCustomizationMargin, String str15, Font font, String str16, String str17, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.title = str2;
        this.card_image_url = str3;
        this.selector_image_url = str4;
        this.selector_foreground_color = str5;
        this.ink_color = str6;
        this.card_color = str7;
        this.card_highlight_color = str8;
        this.selector_border_color = str9;
        this.border_color = str10;
        this.id = identifier;
        this.gradient_style = gradient;
        this.background_image = backgroundImage;
        this.card_info_text_color = str11;
        this.mag_stripe_color = str12;
        this.back_ink_color = str13;
        this.help_link_color = str14;
        this.card_customization_margin = cardCustomizationMargin;
        this.group_name = str15;
        this.font = font;
        this.mag_stripe_back_color = str16;
        this.pattern_grid_color = str17;
        this.pattern_grid_alpha = f;
    }
}
