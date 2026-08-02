package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FirstTimeBorrowData;
import com.squareup.protos.lending.InitiateLoanData;
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
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006#\"$%&'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/cash/ui/Image;", "image", "Lcom/squareup/protos/cash/ui/Image;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "bullet_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "button_title", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "notice_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "promo_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "Lcom/squareup/protos/lending/InitiateLoanData;", "picker_data", "Lcom/squareup/protos/lending/InitiateLoanData;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect;", "on_display_effect", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect;", "Lcom/squareup/protos/cash/ui/Color;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "getTint_color$annotations", "()V", "Companion", "Builder", "BulletContent", "NoticeContent", "PromoContent", "OnDisplayEffect", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FirstTimeBorrowData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FirstTimeBorrowData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent#ADAPTER", schemaIndex = 3, tag = 4)
    public final BulletContent bullet_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String button_title;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
    public final Image image;

    @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$NoticeContent#ADAPTER", schemaIndex = 5, tag = 6)
    public final NoticeContent notice_content;

    @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$OnDisplayEffect#ADAPTER", schemaIndex = 9, tag = 10)
    public final OnDisplayEffect on_display_effect;

    @WireField(adapter = "com.squareup.protos.lending.InitiateLoanData#ADAPTER", schemaIndex = 7, tag = 8)
    public final InitiateLoanData picker_data;

    @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$PromoContent#ADAPTER", schemaIndex = 6, tag = 7)
    public final PromoContent promo_content;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 8, tag = 9)
    public final BlockerAction secondary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 10, tag = 11)
    public final Color tint_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData;", "<init>", "()V", "title", "", "subtitle", "image", "Lcom/squareup/protos/cash/ui/Image;", "bullet_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "button_title", "notice_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "promo_content", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "picker_data", "Lcom/squareup/protos/lending/InitiateLoanData;", "secondary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "on_display_effect", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public BulletContent bullet_content;
        public String button_title;
        public Image image;
        public NoticeContent notice_content;
        public OnDisplayEffect on_display_effect;
        public InitiateLoanData picker_data;
        public PromoContent promo_content;
        public BlockerAction secondary_action;
        public String subtitle;
        public Color tint_color;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public FirstTimeBorrowData build() {
            return new FirstTimeBorrowData(this.title, this.subtitle, this.image, this.bullet_content, this.button_title, this.notice_content, this.promo_content, this.picker_data, this.secondary_action, this.on_display_effect, this.tint_color, buildUnknownFields());
        }

        public final Builder bullet_content(BulletContent bullet_content) {
            this.bullet_content = bullet_content;
            return this;
        }

        public final Builder button_title(String button_title) {
            this.button_title = button_title;
            return this;
        }

        public final Builder image(Image image) {
            this.image = image;
            return this;
        }

        public final Builder notice_content(NoticeContent notice_content) {
            this.notice_content = notice_content;
            return this;
        }

        public final Builder on_display_effect(OnDisplayEffect on_display_effect) {
            this.on_display_effect = on_display_effect;
            return this;
        }

        public final Builder picker_data(InitiateLoanData picker_data) {
            this.picker_data = picker_data;
            return this;
        }

        public final Builder promo_content(PromoContent promo_content) {
            this.promo_content = promo_content;
            return this;
        }

        public final Builder secondary_action(BlockerAction secondary_action) {
            this.secondary_action = secondary_action;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @Deprecated
        public final Builder tint_color(Color tint_color) {
            this.tint_color = tint_color;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB=\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0005H\u0016J<\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$Builder;", "bullets", "", "", "support_data", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "bullet_items", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;Ljava/util/List;Lokio/ByteString;)V", "getBullets$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "BulletItem", "SupportData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BulletContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BulletContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent$BulletItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<BulletItem> bullet_items;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<String> bullets;

        @WireField(adapter = "com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent$SupportData#ADAPTER", schemaIndex = 1, tag = 2)
        public final SupportData support_data;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "<init>", "()V", "bullets", "", "", "support_data", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "bullet_items", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<BulletItem> bullet_items;
            public List<String> bullets;
            public SupportData support_data;

            public Builder() {
                EmptyList emptyList = EmptyList.INSTANCE;
                this.bullets = emptyList;
                this.bullet_items = emptyList;
            }

            @Override // com.squareup.wire.Message.Builder
            public BulletContent build() {
                return new BulletContent(this.bullets, this.support_data, this.bullet_items, buildUnknownFields());
            }

            public final Builder bullet_items(List<BulletItem> bullet_items) {
                bullet_items.getClass();
                TransactorKt.checkElementsNotNull(bullet_items);
                this.bullet_items = bullet_items;
                return this;
            }

            @Deprecated
            public final Builder bullets(List<String> bullets) {
                bullets.getClass();
                TransactorKt.checkElementsNotNull(bullets);
                this.bullets = bullets;
                return this;
            }

            public final Builder support_data(SupportData support_data) {
                this.support_data = support_data;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulletContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.BulletContent decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FirstTimeBorrowData.BulletContent(m, (FirstTimeBorrowData.BulletContent.SupportData) obj, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ProtoAdapter.STRING.decode(reader));
                        } else if (nextTag == 2) {
                            obj = TransactorKt.decodeMessageOrMerge(FirstTimeBorrowData.BulletContent.SupportData.ADAPTER, reader, obj);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(FirstTimeBorrowData.BulletContent.BulletItem.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FirstTimeBorrowData.BulletContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.bullets);
                    FirstTimeBorrowData.BulletContent.SupportData.ADAPTER.encodeWithTag(writer, 2, value.support_data);
                    FirstTimeBorrowData.BulletContent.BulletItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.bullet_items);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FirstTimeBorrowData.BulletContent value) {
                    value.getClass();
                    return FirstTimeBorrowData.BulletContent.BulletItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.bullet_items) + FirstTimeBorrowData.BulletContent.SupportData.ADAPTER.encodedSizeWithTag(2, value.support_data) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.bullets) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.BulletContent redact(FirstTimeBorrowData.BulletContent value) {
                    value.getClass();
                    FirstTimeBorrowData.BulletContent.SupportData supportData = value.support_data;
                    return FirstTimeBorrowData.BulletContent.copy$default(value, null, supportData != null ? (FirstTimeBorrowData.BulletContent.SupportData) FirstTimeBorrowData.BulletContent.SupportData.ADAPTER.redact(supportData) : null, TransactorKt.m1169redactElements(value.bullet_items, FirstTimeBorrowData.BulletContent.BulletItem.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FirstTimeBorrowData.BulletContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FirstTimeBorrowData.BulletContent.BulletItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.bullet_items);
                    FirstTimeBorrowData.BulletContent.SupportData.ADAPTER.encodeWithTag(writer, 2, value.support_data);
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.bullets);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulletContent(List<String> list, SupportData supportData, List<BulletItem> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.support_data = supportData;
            this.bullets = TransactorKt.immutableCopyOf("bullets", list);
            this.bullet_items = TransactorKt.immutableCopyOf("bullet_items", list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BulletContent copy$default(BulletContent bulletContent, List list, SupportData supportData, List list2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bulletContent.bullets;
            }
            if ((i & 2) != 0) {
                supportData = bulletContent.support_data;
            }
            if ((i & 4) != 0) {
                list2 = bulletContent.bullet_items;
            }
            if ((i & 8) != 0) {
                byteString = bulletContent.unknownFields();
            }
            return bulletContent.copy(list, supportData, list2, byteString);
        }

        @Deprecated
        public static /* synthetic */ void getBullets$annotations() {
        }

        public final BulletContent copy(List<String> bullets, SupportData support_data, List<BulletItem> bullet_items, ByteString unknownFields) {
            bullets.getClass();
            bullet_items.getClass();
            unknownFields.getClass();
            return new BulletContent(bullets, support_data, bullet_items, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BulletContent)) {
                return false;
            }
            BulletContent bulletContent = (BulletContent) other;
            return Intrinsics.areEqual(unknownFields(), bulletContent.unknownFields()) && Intrinsics.areEqual(this.bullets, bulletContent.bullets) && Intrinsics.areEqual(this.support_data, bulletContent.support_data) && Intrinsics.areEqual(this.bullet_items, bulletContent.bullet_items);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.bullets);
            SupportData supportData = this.support_data;
            int hashCode = this.bullet_items.hashCode() + ((m + (supportData != null ? supportData.hashCode() : 0)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.bullets = this.bullets;
            builder.support_data = this.support_data;
            builder.bullet_items = this.bullet_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.bullets.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("bullets=", arrayList, this.bullets);
            }
            SupportData supportData = this.support_data;
            if (supportData != null) {
                arrayList.add("support_data=" + supportData);
            }
            if (!this.bullet_items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("bullet_items=", arrayList, this.bullet_items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BulletContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem$Builder;", "text", "", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BulletItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BulletItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 1, tag = 2)
            public final Icon icon;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "<init>", "()V", "text", "", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Icon icon;
                public String text;

                @Override // com.squareup.wire.Message.Builder
                public BulletItem build() {
                    return new BulletItem(this.text, this.icon, buildUnknownFields());
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
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulletItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent$BulletItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FirstTimeBorrowData.BulletContent.BulletItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FirstTimeBorrowData.BulletContent.BulletItem((String) obj, (Icon) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FirstTimeBorrowData.BulletContent.BulletItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                        Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FirstTimeBorrowData.BulletContent.BulletItem value) {
                        value.getClass();
                        return Icon.ADAPTER.encodedSizeWithTag(2, value.icon) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FirstTimeBorrowData.BulletContent.BulletItem redact(FirstTimeBorrowData.BulletContent.BulletItem value) {
                        value.getClass();
                        Icon icon = value.icon;
                        return FirstTimeBorrowData.BulletContent.BulletItem.copy$default(value, null, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FirstTimeBorrowData.BulletContent.BulletItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ BulletItem(String str, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ BulletItem copy$default(BulletItem bulletItem, String str, Icon icon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bulletItem.text;
                }
                if ((i & 2) != 0) {
                    icon = bulletItem.icon;
                }
                if ((i & 4) != 0) {
                    byteString = bulletItem.unknownFields();
                }
                return bulletItem.copy(str, icon, byteString);
            }

            public final BulletItem copy(String text, Icon icon, ByteString unknownFields) {
                unknownFields.getClass();
                return new BulletItem(text, icon, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof BulletItem)) {
                    return false;
                }
                BulletItem bulletItem = (BulletItem) other;
                return Intrinsics.areEqual(unknownFields(), bulletItem.unknownFields()) && Intrinsics.areEqual(this.text, bulletItem.text) && Intrinsics.areEqual(this.icon, bulletItem.icon);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = hashCode2 + (icon != null ? icon.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.icon = this.icon;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BulletItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$BulletItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ BulletItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public BulletItem() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BulletItem(String str, Icon icon, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.icon = icon;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData$Builder;", "button_title", "", "support_node", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SupportData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SupportData> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String button_title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String support_node;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "<init>", "()V", "button_title", "", "support_node", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String button_title;
                public String support_node;

                @Override // com.squareup.wire.Message.Builder
                public SupportData build() {
                    return new SupportData(this.button_title, this.support_node, buildUnknownFields());
                }

                public final Builder button_title(String button_title) {
                    this.button_title = button_title;
                    return this;
                }

                public final Builder support_node(String support_node) {
                    this.support_node = support_node;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SupportData.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$BulletContent$SupportData$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public FirstTimeBorrowData.BulletContent.SupportData decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new FirstTimeBorrowData.BulletContent.SupportData((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, FirstTimeBorrowData.BulletContent.SupportData value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.button_title);
                        protoAdapter2.encodeWithTag(writer, 2, value.support_node);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FirstTimeBorrowData.BulletContent.SupportData value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.support_node) + protoAdapter2.encodedSizeWithTag(1, value.button_title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FirstTimeBorrowData.BulletContent.SupportData redact(FirstTimeBorrowData.BulletContent.SupportData value) {
                        value.getClass();
                        return FirstTimeBorrowData.BulletContent.SupportData.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FirstTimeBorrowData.BulletContent.SupportData value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.support_node);
                        protoAdapter2.encodeWithTag(writer, 1, value.button_title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ SupportData(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ SupportData copy$default(SupportData supportData, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = supportData.button_title;
                }
                if ((i & 2) != 0) {
                    str2 = supportData.support_node;
                }
                if ((i & 4) != 0) {
                    byteString = supportData.unknownFields();
                }
                return supportData.copy(str, str2, byteString);
            }

            public final SupportData copy(String button_title, String support_node, ByteString unknownFields) {
                unknownFields.getClass();
                return new SupportData(button_title, support_node, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SupportData)) {
                    return false;
                }
                SupportData supportData = (SupportData) other;
                return Intrinsics.areEqual(unknownFields(), supportData.unknownFields()) && Intrinsics.areEqual(this.button_title, supportData.button_title) && Intrinsics.areEqual(this.support_node, supportData.support_node);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.button_title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.support_node;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.button_title = this.button_title;
                builder.support_node = this.support_node;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.button_title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_title=", arrayList);
                }
                String str2 = this.support_node;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_node=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SupportData{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$SupportData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ SupportData build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public SupportData() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportData(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_title = str;
                this.support_node = str2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$BulletContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BulletContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BulletContent() {
            this(null, null, null, null, 15, null);
        }

        public BulletContent(List list, SupportData supportData, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : supportData, (i & 4) != 0 ? EmptyList.INSTANCE : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FirstTimeBorrowData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FirstTimeBorrowData decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                reader.getClass();
                long beginMessage = reader.beginMessage();
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
                    if (nextTag == -1) {
                        return new FirstTimeBorrowData((String) obj4, (String) obj5, (Image) obj6, (FirstTimeBorrowData.BulletContent) obj7, (String) obj8, (FirstTimeBorrowData.NoticeContent) obj9, (FirstTimeBorrowData.PromoContent) obj10, (InitiateLoanData) obj11, (BlockerAction) obj12, (FirstTimeBorrowData.OnDisplayEffect) obj13, (Color) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 2:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 3:
                            obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj6);
                            continue;
                        case 4:
                            obj7 = TransactorKt.decodeMessageOrMerge(FirstTimeBorrowData.BulletContent.ADAPTER, reader, obj7);
                            continue;
                        case 5:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 6:
                            obj9 = TransactorKt.decodeMessageOrMerge(FirstTimeBorrowData.NoticeContent.ADAPTER, reader, obj9);
                            continue;
                        case 7:
                            obj10 = TransactorKt.decodeMessageOrMerge(FirstTimeBorrowData.PromoContent.ADAPTER, reader, obj10);
                            continue;
                        case 8:
                            obj11 = TransactorKt.decodeMessageOrMerge(InitiateLoanData.ADAPTER, reader, obj11);
                            continue;
                        case 9:
                            obj12 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj12);
                            continue;
                        case 10:
                            try {
                                obj13 = FirstTimeBorrowData.OnDisplayEffect.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj4;
                                obj2 = obj13;
                                obj3 = obj14;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            obj14 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj14);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            obj2 = obj13;
                            obj3 = obj14;
                            break;
                    }
                    obj4 = obj;
                    obj14 = obj3;
                    obj13 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FirstTimeBorrowData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                FirstTimeBorrowData.BulletContent.ADAPTER.encodeWithTag(writer, 4, value.bullet_content);
                protoAdapter2.encodeWithTag(writer, 5, value.button_title);
                FirstTimeBorrowData.NoticeContent.ADAPTER.encodeWithTag(writer, 6, value.notice_content);
                FirstTimeBorrowData.PromoContent.ADAPTER.encodeWithTag(writer, 7, value.promo_content);
                InitiateLoanData.ADAPTER.encodeWithTag(writer, 8, value.picker_data);
                BlockerAction.ADAPTER.encodeWithTag(writer, 9, value.secondary_action);
                FirstTimeBorrowData.OnDisplayEffect.ADAPTER.encodeWithTag(writer, 10, value.on_display_effect);
                Color.ADAPTER.encodeWithTag(writer, 11, value.tint_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FirstTimeBorrowData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Color.ADAPTER.encodedSizeWithTag(11, value.tint_color) + FirstTimeBorrowData.OnDisplayEffect.ADAPTER.encodedSizeWithTag(10, value.on_display_effect) + BlockerAction.ADAPTER.encodedSizeWithTag(9, value.secondary_action) + InitiateLoanData.ADAPTER.encodedSizeWithTag(8, value.picker_data) + FirstTimeBorrowData.PromoContent.ADAPTER.encodedSizeWithTag(7, value.promo_content) + FirstTimeBorrowData.NoticeContent.ADAPTER.encodedSizeWithTag(6, value.notice_content) + protoAdapter2.encodedSizeWithTag(5, value.button_title) + FirstTimeBorrowData.BulletContent.ADAPTER.encodedSizeWithTag(4, value.bullet_content) + Image.ADAPTER.encodedSizeWithTag(3, value.image) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FirstTimeBorrowData redact(FirstTimeBorrowData value) {
                value.getClass();
                Image image = value.image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                FirstTimeBorrowData.BulletContent bulletContent = value.bullet_content;
                FirstTimeBorrowData.BulletContent bulletContent2 = bulletContent != null ? (FirstTimeBorrowData.BulletContent) FirstTimeBorrowData.BulletContent.ADAPTER.redact(bulletContent) : null;
                FirstTimeBorrowData.NoticeContent noticeContent = value.notice_content;
                FirstTimeBorrowData.NoticeContent noticeContent2 = noticeContent != null ? (FirstTimeBorrowData.NoticeContent) FirstTimeBorrowData.NoticeContent.ADAPTER.redact(noticeContent) : null;
                FirstTimeBorrowData.PromoContent promoContent = value.promo_content;
                FirstTimeBorrowData.PromoContent promoContent2 = promoContent != null ? (FirstTimeBorrowData.PromoContent) FirstTimeBorrowData.PromoContent.ADAPTER.redact(promoContent) : null;
                InitiateLoanData initiateLoanData = value.picker_data;
                InitiateLoanData initiateLoanData2 = initiateLoanData != null ? (InitiateLoanData) InitiateLoanData.ADAPTER.redact(initiateLoanData) : null;
                BlockerAction blockerAction = value.secondary_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                Color color = value.tint_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.button_title;
                FirstTimeBorrowData.OnDisplayEffect onDisplayEffect = value.on_display_effect;
                byteString.getClass();
                return new FirstTimeBorrowData(str, str2, image2, bulletContent2, str3, noticeContent2, promoContent2, initiateLoanData2, blockerAction2, onDisplayEffect, color2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FirstTimeBorrowData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Color.ADAPTER.encodeWithTag(writer, 11, value.tint_color);
                FirstTimeBorrowData.OnDisplayEffect.ADAPTER.encodeWithTag(writer, 10, value.on_display_effect);
                BlockerAction.ADAPTER.encodeWithTag(writer, 9, value.secondary_action);
                InitiateLoanData.ADAPTER.encodeWithTag(writer, 8, value.picker_data);
                FirstTimeBorrowData.PromoContent.ADAPTER.encodeWithTag(writer, 7, value.promo_content);
                FirstTimeBorrowData.NoticeContent.ADAPTER.encodeWithTag(writer, 6, value.notice_content);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.button_title);
                FirstTimeBorrowData.BulletContent.ADAPTER.encodeWithTag(writer, 4, value.bullet_content);
                Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstTimeBorrowData(String str, String str2, Image image, BulletContent bulletContent, String str3, NoticeContent noticeContent, PromoContent promoContent, InitiateLoanData initiateLoanData, BlockerAction blockerAction, OnDisplayEffect onDisplayEffect, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.image = image;
        this.bullet_content = bulletContent;
        this.button_title = str3;
        this.notice_content = noticeContent;
        this.promo_content = promoContent;
        this.picker_data = initiateLoanData;
        this.secondary_action = blockerAction;
        this.on_display_effect = onDisplayEffect;
        this.tint_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirstTimeBorrowData)) {
            return false;
        }
        FirstTimeBorrowData firstTimeBorrowData = (FirstTimeBorrowData) obj;
        return Intrinsics.areEqual(unknownFields(), firstTimeBorrowData.unknownFields()) && Intrinsics.areEqual(this.title, firstTimeBorrowData.title) && Intrinsics.areEqual(this.subtitle, firstTimeBorrowData.subtitle) && Intrinsics.areEqual(this.image, firstTimeBorrowData.image) && Intrinsics.areEqual(this.bullet_content, firstTimeBorrowData.bullet_content) && Intrinsics.areEqual(this.button_title, firstTimeBorrowData.button_title) && Intrinsics.areEqual(this.notice_content, firstTimeBorrowData.notice_content) && Intrinsics.areEqual(this.promo_content, firstTimeBorrowData.promo_content) && Intrinsics.areEqual(this.picker_data, firstTimeBorrowData.picker_data) && Intrinsics.areEqual(this.secondary_action, firstTimeBorrowData.secondary_action) && this.on_display_effect == firstTimeBorrowData.on_display_effect && Intrinsics.areEqual(this.tint_color, firstTimeBorrowData.tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        BulletContent bulletContent = this.bullet_content;
        int hashCode5 = (hashCode4 + (bulletContent != null ? bulletContent.hashCode() : 0)) * 37;
        String str3 = this.button_title;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        NoticeContent noticeContent = this.notice_content;
        int hashCode7 = (hashCode6 + (noticeContent != null ? noticeContent.hashCode() : 0)) * 37;
        PromoContent promoContent = this.promo_content;
        int hashCode8 = (hashCode7 + (promoContent != null ? promoContent.hashCode() : 0)) * 37;
        InitiateLoanData initiateLoanData = this.picker_data;
        int hashCode9 = (hashCode8 + (initiateLoanData != null ? initiateLoanData.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.secondary_action;
        int hashCode10 = (hashCode9 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        OnDisplayEffect onDisplayEffect = this.on_display_effect;
        int hashCode11 = (hashCode10 + (onDisplayEffect != null ? onDisplayEffect.hashCode() : 0)) * 37;
        Color color = this.tint_color;
        int hashCode12 = hashCode11 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.image = this.image;
        builder.bullet_content = this.bullet_content;
        builder.button_title = this.button_title;
        builder.notice_content = this.notice_content;
        builder.promo_content = this.promo_content;
        builder.picker_data = this.picker_data;
        builder.secondary_action = this.secondary_action;
        builder.on_display_effect = this.on_display_effect;
        builder.tint_color = this.tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        BulletContent bulletContent = this.bullet_content;
        if (bulletContent != null) {
            arrayList.add("bullet_content=" + bulletContent);
        }
        String str3 = this.button_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
        }
        NoticeContent noticeContent = this.notice_content;
        if (noticeContent != null) {
            arrayList.add("notice_content=" + noticeContent);
        }
        PromoContent promoContent = this.promo_content;
        if (promoContent != null) {
            arrayList.add("promo_content=" + promoContent);
        }
        InitiateLoanData initiateLoanData = this.picker_data;
        if (initiateLoanData != null) {
            arrayList.add("picker_data=" + initiateLoanData);
        }
        BlockerAction blockerAction = this.secondary_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction, arrayList);
        }
        OnDisplayEffect onDisplayEffect = this.on_display_effect;
        if (onDisplayEffect != null) {
            arrayList.add("on_display_effect=" + onDisplayEffect);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FirstTimeBorrowData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent$Builder;", "title", "", "body", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoticeContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NoticeContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "<init>", "()V", "title", "", "body", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body;
            public String title;

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public NoticeContent build() {
                return new NoticeContent(this.title, this.body, buildUnknownFields());
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NoticeContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$NoticeContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.NoticeContent decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FirstTimeBorrowData.NoticeContent((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, FirstTimeBorrowData.NoticeContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FirstTimeBorrowData.NoticeContent value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.NoticeContent redact(FirstTimeBorrowData.NoticeContent value) {
                    value.getClass();
                    return FirstTimeBorrowData.NoticeContent.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FirstTimeBorrowData.NoticeContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ NoticeContent(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ NoticeContent copy$default(NoticeContent noticeContent, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noticeContent.title;
            }
            if ((i & 2) != 0) {
                str2 = noticeContent.body;
            }
            if ((i & 4) != 0) {
                byteString = noticeContent.unknownFields();
            }
            return noticeContent.copy(str, str2, byteString);
        }

        public final NoticeContent copy(String title, String body, ByteString unknownFields) {
            unknownFields.getClass();
            return new NoticeContent(title, body, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NoticeContent)) {
                return false;
            }
            NoticeContent noticeContent = (NoticeContent) other;
            return Intrinsics.areEqual(unknownFields(), noticeContent.unknownFields()) && Intrinsics.areEqual(this.title, noticeContent.title) && Intrinsics.areEqual(this.body, noticeContent.body);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NoticeContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$NoticeContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ NoticeContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public NoticeContent() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoticeContent(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "CONFETTI", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnDisplayEffect implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnDisplayEffect[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final OnDisplayEffect CONFETTI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OnDisplayEffect NONE;
        private final int value;

        private static final /* synthetic */ OnDisplayEffect[] $values() {
            return new OnDisplayEffect[]{NONE, CONFETTI};
        }

        static {
            final OnDisplayEffect onDisplayEffect = new OnDisplayEffect("NONE", 0, 0);
            NONE = onDisplayEffect;
            CONFETTI = new OnDisplayEffect("CONFETTI", 1, 1);
            OnDisplayEffect[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OnDisplayEffect.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, onDisplayEffect) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$OnDisplayEffect$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public FirstTimeBorrowData.OnDisplayEffect fromValue(int value) {
                    return FirstTimeBorrowData.OnDisplayEffect.INSTANCE.fromValue(value);
                }
            };
        }

        private OnDisplayEffect(String str, int i, int i2) {
            this.value = i2;
        }

        public static final OnDisplayEffect fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static OnDisplayEffect valueOf(String str) {
            return (OnDisplayEffect) Enum.valueOf(OnDisplayEffect.class, str);
        }

        public static OnDisplayEffect[] values() {
            return (OnDisplayEffect[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$OnDisplayEffect;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OnDisplayEffect fromValue(int value) {
                if (value == 0) {
                    return OnDisplayEffect.NONE;
                }
                if (value != 1) {
                    return null;
                }
                return OnDisplayEffect.CONFETTI;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JL\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$Builder;", "title", "", "subtitle", "button_title", "support_node_routing", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;", "image", "Lcom/squareup/protos/cash/ui/Image;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;Lcom/squareup/protos/cash/ui/Image;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "SupportNodeRouting", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PromoContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PromoContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String button_title;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 4, tag = 6)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireSealedOneof(schemaIndex = 3)
        public final SupportNodeRouting support_node_routing;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "<init>", "()V", "title", "", "subtitle", "button_title", "support_node_routing", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;", "image", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String button_title;
            public Image image;
            public String subtitle;
            public SupportNodeRouting support_node_routing;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public PromoContent build() {
                return new PromoContent(this.title, this.subtitle, this.button_title, this.support_node_routing, this.image, buildUnknownFields());
            }

            public final Builder button_title(String button_title) {
                this.button_title = button_title;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder support_node_routing(SupportNodeRouting support_node_routing) {
                this.support_node_routing = support_node_routing;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PromoContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.PromoContent decode(ProtoReader reader) {
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting buttonSupportNode;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FirstTimeBorrowData.PromoContent((String) obj, (String) obj2, (String) obj3, supportNodeRouting, (Image) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                buttonSupportNode = new FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode((String) ProtoAdapter.STRING.decode(reader));
                                break;
                            case 5:
                                buttonSupportNode = new FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl((String) ProtoAdapter.STRING.decode(reader));
                                break;
                            case 6:
                                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                                continue;
                            default:
                                reader.readUnknownField(nextTag);
                                continue;
                        }
                        supportNodeRouting = buttonSupportNode;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FirstTimeBorrowData.PromoContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = value.support_node_routing;
                    if (supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting).getValue());
                    } else if (supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) supportNodeRouting).getValue());
                    } else if (supportNodeRouting != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Image.ADAPTER.encodeWithTag(writer, 6, value.image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FirstTimeBorrowData.PromoContent value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, value.button_title) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = value.support_node_routing;
                    if (supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) {
                        encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(4, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting).getValue());
                    } else {
                        if (!(supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl)) {
                            if (supportNodeRouting != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            return Image.ADAPTER.encodedSizeWithTag(6, value.image) + encodedSizeWithTag2;
                        }
                        encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) supportNodeRouting).getValue());
                    }
                    encodedSizeWithTag2 += encodedSizeWithTag;
                    return Image.ADAPTER.encodedSizeWithTag(6, value.image) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FirstTimeBorrowData.PromoContent redact(FirstTimeBorrowData.PromoContent value) {
                    value.getClass();
                    Image image = value.image;
                    return FirstTimeBorrowData.PromoContent.copy$default(value, null, null, null, null, image != null ? (Image) Image.ADAPTER.redact(image) : null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FirstTimeBorrowData.PromoContent value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                    Image.ADAPTER.encodeWithTag(writer, 6, value.image);
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = value.support_node_routing;
                    if (supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) {
                        protoAdapter2.encodeWithTag(writer, 4, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting).getValue());
                    } else if (supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) {
                        protoAdapter2.encodeWithTag(writer, 5, ((FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) supportNodeRouting).getValue());
                    } else if (supportNodeRouting != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PromoContent(String str, String str2, String str3, SupportNodeRouting supportNodeRouting, Image image, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : supportNodeRouting, (i & 16) != 0 ? null : image, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PromoContent copy$default(PromoContent promoContent, String str, String str2, String str3, SupportNodeRouting supportNodeRouting, Image image, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promoContent.title;
            }
            if ((i & 2) != 0) {
                str2 = promoContent.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = promoContent.button_title;
            }
            if ((i & 8) != 0) {
                supportNodeRouting = promoContent.support_node_routing;
            }
            if ((i & 16) != 0) {
                image = promoContent.image;
            }
            if ((i & 32) != 0) {
                byteString = promoContent.unknownFields();
            }
            Image image2 = image;
            ByteString byteString2 = byteString;
            return promoContent.copy(str, str2, str3, supportNodeRouting, image2, byteString2);
        }

        public final PromoContent copy(String title, String subtitle, String button_title, SupportNodeRouting support_node_routing, Image image, ByteString unknownFields) {
            unknownFields.getClass();
            return new PromoContent(title, subtitle, button_title, support_node_routing, image, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PromoContent)) {
                return false;
            }
            PromoContent promoContent = (PromoContent) other;
            return Intrinsics.areEqual(unknownFields(), promoContent.unknownFields()) && Intrinsics.areEqual(this.title, promoContent.title) && Intrinsics.areEqual(this.subtitle, promoContent.subtitle) && Intrinsics.areEqual(this.button_title, promoContent.button_title) && Intrinsics.areEqual(this.support_node_routing, promoContent.support_node_routing) && Intrinsics.areEqual(this.image, promoContent.image);
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
            String str3 = this.button_title;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            SupportNodeRouting supportNodeRouting = this.support_node_routing;
            int hashCode5 = (hashCode4 + (supportNodeRouting != null ? supportNodeRouting.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode6 = hashCode5 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.button_title = this.button_title;
            builder.support_node_routing = this.support_node_routing;
            builder.image = this.image;
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
            String str3 = this.button_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
            }
            SupportNodeRouting supportNodeRouting = this.support_node_routing;
            if (supportNodeRouting != null) {
                arrayList.add("support_node_routing=" + supportNodeRouting);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PromoContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PromoContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;", "", "<init>", "()V", "ButtonSupportNode", "ButtonUrl", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting$ButtonSupportNode;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting$ButtonUrl;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class SupportNodeRouting {

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "button_support_node", tag = 4)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting$ButtonSupportNode;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ButtonSupportNode extends SupportNodeRouting {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ButtonSupportNode(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ ButtonSupportNode copy$default(ButtonSupportNode buttonSupportNode, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = buttonSupportNode.value;
                    }
                    return buttonSupportNode.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final ButtonSupportNode copy(String value) {
                    value.getClass();
                    return new ButtonSupportNode(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ButtonSupportNode) && Intrinsics.areEqual(this.value, ((ButtonSupportNode) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonSupportNode(value=", this.value, ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "button_url", tag = 5)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting$ButtonUrl;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$PromoContent$SupportNodeRouting;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ButtonUrl extends SupportNodeRouting {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ButtonUrl(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ ButtonUrl copy$default(ButtonUrl buttonUrl, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = buttonUrl.value;
                    }
                    return buttonUrl.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final ButtonUrl copy(String value) {
                    value.getClass();
                    return new ButtonUrl(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ButtonUrl) && Intrinsics.areEqual(this.value, ((ButtonUrl) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonUrl(value=", this.value, ")");
                }
            }

            public /* synthetic */ SupportNodeRouting(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SupportNodeRouting() {
            }
        }

        public PromoContent() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromoContent(String str, String str2, String str3, SupportNodeRouting supportNodeRouting, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.button_title = str3;
            this.support_node_routing = supportNodeRouting;
            this.image = image;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FirstTimeBorrowData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FirstTimeBorrowData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FirstTimeBorrowData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
