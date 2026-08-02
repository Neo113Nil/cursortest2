package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SelectionBlocker;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001f\u001e !R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\nR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u0012\u0004\b\u001d\u0010\n¨\u0006\""}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Builder;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon;", "icon", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "getAmount$annotations", "()V", "", "header_text", "Ljava/lang/String;", "main_text", "footer_text", "Lcom/squareup/protos/franklin/api/SelectionOption;", "primary_option", "Lcom/squareup/protos/franklin/api/SelectionOption;", "secondary_option", "", "icon_above_text", "Ljava/lang/Boolean;", "getIcon_above_text$annotations", "", "options", "Ljava/util/List;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "detail_rows", "getDetail_rows$annotations", "Companion", "Builder", "Icon", "DetailRow", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 9)
    public final Money amount;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionBlocker$DetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    public final List<DetailRow> detail_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
    public final String footer_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 2)
    public final String header_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionBlocker$Icon#ADAPTER", schemaIndex = 0, tag = 1)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 8)
    public final Boolean icon_above_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 3)
    public final String main_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 7)
    public final List<SelectionOption> options;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionOption#ADAPTER", schemaIndex = 5, tag = 4)
    public final SelectionOption primary_option;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionOption#ADAPTER", schemaIndex = 6, tag = 5)
    public final SelectionOption secondary_option;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011H\u0007J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectionBlocker;", "<init>", "()V", "icon", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon;", "amount", "Lcom/squareup/protos/common/Money;", "header_text", "", "main_text", "footer_text", "primary_option", "Lcom/squareup/protos/franklin/api/SelectionOption;", "secondary_option", "options", "", "icon_above_text", "", "Ljava/lang/Boolean;", "detail_rows", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/SelectionBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Money amount;
        public List<DetailRow> detail_rows;
        public String footer_text;
        public String header_text;
        public Icon icon;
        public Boolean icon_above_text;
        public String main_text;
        public List<SelectionOption> options;
        public SelectionOption primary_option;
        public SelectionOption secondary_option;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.options = emptyList;
            this.detail_rows = emptyList;
        }

        @Deprecated
        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SelectionBlocker build() {
            return new SelectionBlocker(this.icon, this.amount, this.header_text, this.main_text, this.footer_text, this.primary_option, this.secondary_option, this.options, this.icon_above_text, this.detail_rows, buildUnknownFields());
        }

        @Deprecated
        public final Builder detail_rows(List<DetailRow> detail_rows) {
            detail_rows.getClass();
            TransactorKt.checkElementsNotNull(detail_rows);
            this.detail_rows = detail_rows;
            return this;
        }

        public final Builder footer_text(String footer_text) {
            this.footer_text = footer_text;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        @Deprecated
        public final Builder icon_above_text(Boolean icon_above_text) {
            this.icon_above_text = icon_above_text;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder options(List<SelectionOption> options) {
            options.getClass();
            TransactorKt.checkElementsNotNull(options);
            this.options = options;
            return this;
        }

        public final Builder primary_option(SelectionOption primary_option) {
            this.primary_option = primary_option;
            return this;
        }

        public final Builder secondary_option(SelectionOption secondary_option) {
            this.secondary_option = secondary_option;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016JL\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "label_action", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action;", "label_action_url", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "getLabel_action_url$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 4, tag = 5)
        public final BlockerAction blocker_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.protos.franklin.api.SelectionBlocker$DetailRow$Action#ADAPTER", schemaIndex = 2, tag = 3)
        public final Action label_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String label_action_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String value;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "label_action", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action;", "label_action_url", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BlockerAction blocker_action;
            public String label;
            public Action label_action;
            public String label_action_url;
            public String value;

            public final Builder blocker_action(BlockerAction blocker_action) {
                this.blocker_action = blocker_action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public DetailRow build() {
                return new DetailRow(this.label, this.value, this.label_action, this.label_action_url, this.blocker_action, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder label_action(Action label_action) {
                this.label_action = label_action;
                return this;
            }

            @Deprecated
            public final Builder label_action_url(String label_action_url) {
                this.label_action_url = label_action_url;
                return this;
            }

            public final Builder value(String value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionBlocker$DetailRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectionBlocker.DetailRow decode(ProtoReader reader) {
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
                            return new SelectionBlocker.DetailRow((String) obj, (String) obj2, (SelectionBlocker.DetailRow.Action) obj3, (String) obj4, (BlockerAction) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            try {
                                obj3 = SelectionBlocker.DetailRow.Action.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj5);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectionBlocker.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    SelectionBlocker.DetailRow.Action.ADAPTER.encodeWithTag(writer, 3, value.label_action);
                    protoAdapter2.encodeWithTag(writer, 4, value.label_action_url);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.blocker_action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectionBlocker.DetailRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.ADAPTER.encodedSizeWithTag(5, value.blocker_action) + protoAdapter2.encodedSizeWithTag(4, value.label_action_url) + SelectionBlocker.DetailRow.Action.ADAPTER.encodedSizeWithTag(3, value.label_action) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectionBlocker.DetailRow redact(SelectionBlocker.DetailRow value) {
                    value.getClass();
                    BlockerAction blockerAction = value.blocker_action;
                    return SelectionBlocker.DetailRow.copy$default(value, null, null, null, null, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectionBlocker.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.blocker_action);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.label_action_url);
                    SelectionBlocker.DetailRow.Action.ADAPTER.encodeWithTag(writer, 3, value.label_action);
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DetailRow(String str, String str2, Action action, String str3, BlockerAction blockerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : action, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : blockerAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, String str, String str2, Action action, String str3, BlockerAction blockerAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detailRow.label;
            }
            if ((i & 2) != 0) {
                str2 = detailRow.value;
            }
            if ((i & 4) != 0) {
                action = detailRow.label_action;
            }
            if ((i & 8) != 0) {
                str3 = detailRow.label_action_url;
            }
            if ((i & 16) != 0) {
                blockerAction = detailRow.blocker_action;
            }
            if ((i & 32) != 0) {
                byteString = detailRow.unknownFields();
            }
            BlockerAction blockerAction2 = blockerAction;
            ByteString byteString2 = byteString;
            return detailRow.copy(str, str2, action, str3, blockerAction2, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getLabel_action_url$annotations() {
        }

        public final DetailRow copy(String label, String value, Action label_action, String label_action_url, BlockerAction blocker_action, ByteString unknownFields) {
            unknownFields.getClass();
            return new DetailRow(label, value, label_action, label_action_url, blocker_action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) other;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && this.label_action == detailRow.label_action && Intrinsics.areEqual(this.label_action_url, detailRow.label_action_url) && Intrinsics.areEqual(this.blocker_action, detailRow.blocker_action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Action action = this.label_action;
            int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
            String str3 = this.label_action_url;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            BlockerAction blockerAction = this.blocker_action;
            int hashCode6 = hashCode5 + (blockerAction != null ? blockerAction.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.value = this.value;
            builder.label_action = this.label_action;
            builder.label_action_url = this.label_action_url;
            builder.blocker_action = this.blocker_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            Action action = this.label_action;
            if (action != null) {
                arrayList.add("label_action=" + action);
            }
            String str3 = this.label_action_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label_action_url=", arrayList);
            }
            BlockerAction blockerAction = this.blocker_action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("blocker_action=", blockerAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "OPEN_URL", "BLOCKER_ACTION", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Action implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;

            @Deprecated
            public static final Action NONE = new Action("NONE", 0, 1);

            @Deprecated
            public static final Action OPEN_URL = new Action("OPEN_URL", 1, 2);
            public static final Action BLOCKER_ACTION = new Action("BLOCKER_ACTION", 2, 3);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{NONE, OPEN_URL, BLOCKER_ACTION};
            }

            static {
                Action[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionBlocker$DetailRow$Action$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public SelectionBlocker.DetailRow.Action fromValue(int value) {
                        return SelectionBlocker.DetailRow.Action.INSTANCE.fromValue(value);
                    }
                };
            }

            private Action(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Action fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Action;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Action fromValue(int value) {
                    if (value == 1) {
                        return Action.NONE;
                    }
                    if (value == 2) {
                        return Action.OPEN_URL;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Action.BLOCKER_ACTION;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectionBlocker$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DetailRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DetailRow() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, String str2, Action action, String str3, BlockerAction blockerAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.label_action = action;
            this.label_action_url = str3;
            this.blocker_action = blockerAction;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SelectionBlocker decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SelectionBlocker((SelectionBlocker.Icon) obj3, (Money) obj4, (String) obj5, (String) obj6, (String) obj7, (SelectionOption) obj8, (SelectionOption) obj9, m, (Boolean) obj10, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj3 = SelectionBlocker.Icon.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj8 = TransactorKt.decodeMessageOrMerge(SelectionOption.ADAPTER, reader, obj8);
                            break;
                        case 5:
                            obj9 = TransactorKt.decodeMessageOrMerge(SelectionOption.ADAPTER, reader, obj9);
                            break;
                        case 6:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            m.add(SelectionOption.ADAPTER.decode(reader));
                            obj = obj3;
                            obj2 = obj4;
                            obj4 = obj2;
                            obj3 = obj;
                            break;
                        case 8:
                            obj10 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 9:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            break;
                        case 10:
                            arrayList.add(SelectionBlocker.DetailRow.ADAPTER.decode(reader));
                            obj = obj3;
                            obj2 = obj4;
                            obj4 = obj2;
                            obj3 = obj;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            obj4 = obj2;
                            obj3 = obj;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectionBlocker value) {
                writer.getClass();
                value.getClass();
                SelectionBlocker.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                Money.ADAPTER.encodeWithTag(writer, 9, value.amount);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                protoAdapter2.encodeWithTag(writer, 3, value.main_text);
                protoAdapter2.encodeWithTag(writer, 6, value.footer_text);
                ProtoAdapter protoAdapter3 = SelectionOption.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 4, value.primary_option);
                protoAdapter3.encodeWithTag(writer, 5, value.secondary_option);
                protoAdapter3.asRepeated().encodeWithTag(writer, 7, value.options);
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.icon_above_text);
                SelectionBlocker.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.detail_rows);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectionBlocker value) {
                value.getClass();
                int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(9, value.amount) + SelectionBlocker.Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, value.footer_text) + protoAdapter2.encodedSizeWithTag(3, value.main_text) + protoAdapter2.encodedSizeWithTag(2, value.header_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = SelectionOption.ADAPTER;
                return SelectionBlocker.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(10, value.detail_rows) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.icon_above_text) + protoAdapter3.asRepeated().encodedSizeWithTag(7, value.options) + protoAdapter3.encodedSizeWithTag(5, value.secondary_option) + protoAdapter3.encodedSizeWithTag(4, value.primary_option) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectionBlocker redact(SelectionBlocker value) {
                value.getClass();
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                SelectionOption selectionOption = value.primary_option;
                SelectionOption selectionOption2 = selectionOption != null ? (SelectionOption) SelectionOption.ADAPTER.redact(selectionOption) : null;
                SelectionOption selectionOption3 = value.secondary_option;
                SelectionOption selectionOption4 = selectionOption3 != null ? (SelectionOption) SelectionOption.ADAPTER.redact(selectionOption3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.options, SelectionOption.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.detail_rows, SelectionBlocker.DetailRow.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                SelectionBlocker.Icon icon = value.icon;
                String str = value.footer_text;
                Boolean bool = value.icon_above_text;
                byteString.getClass();
                return new SelectionBlocker(icon, money2, null, null, str, selectionOption2, selectionOption4, m1169redactElements, bool, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SelectionBlocker.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.detail_rows);
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.icon_above_text);
                ProtoAdapter protoAdapter2 = SelectionOption.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 7, value.options);
                protoAdapter2.encodeWithTag(writer, 5, value.secondary_option);
                protoAdapter2.encodeWithTag(writer, 4, value.primary_option);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 6, value.footer_text);
                protoAdapter3.encodeWithTag(writer, 3, value.main_text);
                protoAdapter3.encodeWithTag(writer, 2, value.header_text);
                Money.ADAPTER.encodeWithTag(writer, 9, value.amount);
                SelectionBlocker.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionBlocker(Icon icon, Money money, String str, String str2, String str3, SelectionOption selectionOption, SelectionOption selectionOption2, List list, Boolean bool, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.icon = icon;
        this.amount = money;
        this.header_text = str;
        this.main_text = str2;
        this.footer_text = str3;
        this.primary_option = selectionOption;
        this.secondary_option = selectionOption2;
        this.icon_above_text = bool;
        this.options = TransactorKt.immutableCopyOf("options", list);
        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectionBlocker)) {
            return false;
        }
        SelectionBlocker selectionBlocker = (SelectionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), selectionBlocker.unknownFields()) && this.icon == selectionBlocker.icon && Intrinsics.areEqual(this.amount, selectionBlocker.amount) && Intrinsics.areEqual(this.header_text, selectionBlocker.header_text) && Intrinsics.areEqual(this.main_text, selectionBlocker.main_text) && Intrinsics.areEqual(this.footer_text, selectionBlocker.footer_text) && Intrinsics.areEqual(this.primary_option, selectionBlocker.primary_option) && Intrinsics.areEqual(this.secondary_option, selectionBlocker.secondary_option) && Intrinsics.areEqual(this.options, selectionBlocker.options) && Intrinsics.areEqual(this.icon_above_text, selectionBlocker.icon_above_text) && Intrinsics.areEqual(this.detail_rows, selectionBlocker.detail_rows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.header_text;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.main_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.footer_text;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        SelectionOption selectionOption = this.primary_option;
        int hashCode7 = (hashCode6 + (selectionOption != null ? selectionOption.hashCode() : 0)) * 37;
        SelectionOption selectionOption2 = this.secondary_option;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (selectionOption2 != null ? selectionOption2.hashCode() : 0)) * 37, 37, this.options);
        Boolean bool = this.icon_above_text;
        int hashCode8 = this.detail_rows.hashCode() + ((m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.icon = this.icon;
        builder.amount = this.amount;
        builder.header_text = this.header_text;
        builder.main_text = this.main_text;
        builder.footer_text = this.footer_text;
        builder.primary_option = this.primary_option;
        builder.secondary_option = this.secondary_option;
        builder.options = this.options;
        builder.icon_above_text = this.icon_above_text;
        builder.detail_rows = this.detail_rows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.header_text != null) {
            arrayList.add("header_text=██");
        }
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        String str = this.footer_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "footer_text=", arrayList);
        }
        SelectionOption selectionOption = this.primary_option;
        if (selectionOption != null) {
            arrayList.add("primary_option=" + selectionOption);
        }
        SelectionOption selectionOption2 = this.secondary_option;
        if (selectionOption2 != null) {
            arrayList.add("secondary_option=" + selectionOption2);
        }
        if (!this.options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
        }
        Boolean bool = this.icon_above_text;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_above_text=", bool, arrayList);
        }
        if (!this.detail_rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, this.detail_rows);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSTANT", "ISSUED_CARD", "PHYSICAL_CARD", "PHYSICAL_CARD_UPSELL", "DIRECT_DEPOSIT", "PENDING", "SUCCESS", "FAILURE", "VERIFICATION_REQUIRED", "GOVERNMENT_ID", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Icon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Icon INSTANT = new Icon("INSTANT", 0, 1);
        public static final Icon ISSUED_CARD = new Icon("ISSUED_CARD", 1, 2);

        @Deprecated
        public static final Icon PHYSICAL_CARD = new Icon("PHYSICAL_CARD", 2, 3);

        @Deprecated
        public static final Icon PHYSICAL_CARD_UPSELL = new Icon("PHYSICAL_CARD_UPSELL", 3, 4);

        @Deprecated
        public static final Icon DIRECT_DEPOSIT = new Icon("DIRECT_DEPOSIT", 4, 5);

        @Deprecated
        public static final Icon PENDING = new Icon("PENDING", 5, 6);

        @Deprecated
        public static final Icon SUCCESS = new Icon("SUCCESS", 6, 7);

        @Deprecated
        public static final Icon FAILURE = new Icon("FAILURE", 7, 8);
        public static final Icon VERIFICATION_REQUIRED = new Icon("VERIFICATION_REQUIRED", 8, 9);

        @Deprecated
        public static final Icon GOVERNMENT_ID = new Icon("GOVERNMENT_ID", 9, 10);

        private static final /* synthetic */ Icon[] $values() {
            return new Icon[]{INSTANT, ISSUED_CARD, PHYSICAL_CARD, PHYSICAL_CARD_UPSELL, DIRECT_DEPOSIT, PENDING, SUCCESS, FAILURE, VERIFICATION_REQUIRED, GOVERNMENT_ID};
        }

        static {
            Icon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Icon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionBlocker$Icon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public SelectionBlocker.Icon fromValue(int value) {
                    return SelectionBlocker.Icon.INSTANCE.fromValue(value);
                }
            };
        }

        private Icon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Icon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Icon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Icon fromValue(int value) {
                switch (value) {
                    case 1:
                        return Icon.INSTANT;
                    case 2:
                        return Icon.ISSUED_CARD;
                    case 3:
                        return Icon.PHYSICAL_CARD;
                    case 4:
                        return Icon.PHYSICAL_CARD_UPSELL;
                    case 5:
                        return Icon.DIRECT_DEPOSIT;
                    case 6:
                        return Icon.PENDING;
                    case 7:
                        return Icon.SUCCESS;
                    case 8:
                        return Icon.FAILURE;
                    case 9:
                        return Icon.VERIFICATION_REQUIRED;
                    case 10:
                        return Icon.GOVERNMENT_ID;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectionBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SelectionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
