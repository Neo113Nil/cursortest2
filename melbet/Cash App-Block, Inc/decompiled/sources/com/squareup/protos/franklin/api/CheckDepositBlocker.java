package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\r\f\u000e\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "amount_entry_data", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "photo_capture_data", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "", "misnap_license_key", "Ljava/lang/String;", "Companion", "Builder", "AmountEntryData", "PhotoCaptureData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckDepositBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckDepositBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$AmountEntryData#ADAPTER", schemaIndex = 0, tag = 1)
    public final AmountEntryData amount_entry_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String misnap_license_key;

    @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData#ADAPTER", schemaIndex = 1, tag = 2)
    public final PhotoCaptureData photo_capture_data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker;", "<init>", "()V", "amount_entry_data", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "photo_capture_data", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "misnap_license_key", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public AmountEntryData amount_entry_data;
        public String misnap_license_key;
        public PhotoCaptureData photo_capture_data;

        public final Builder amount_entry_data(AmountEntryData amount_entry_data) {
            this.amount_entry_data = amount_entry_data;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CheckDepositBlocker build() {
            return new CheckDepositBlocker(this.amount_entry_data, this.photo_capture_data, this.misnap_license_key, buildUnknownFields());
        }

        public final Builder misnap_license_key(String misnap_license_key) {
            this.misnap_license_key = misnap_license_key;
            return this;
        }

        public final Builder photo_capture_data(PhotoCaptureData photo_capture_data) {
            this.photo_capture_data = photo_capture_data;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0019\u001a\u001b\u001cBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Builder;", "title", "", "description", "primary_button_label", "endorsement_instructions", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "front_of_check_controls", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "back_of_check_controls", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Controls", "EndorsementInstructions", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PhotoCaptureData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PhotoCaptureData> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$Controls#ADAPTER", schemaIndex = 5, tag = 6)
        public final Controls back_of_check_controls;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions#ADAPTER", schemaIndex = 3, tag = 4)
        public final EndorsementInstructions endorsement_instructions;

        @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$Controls#ADAPTER", schemaIndex = 4, tag = 5)
        public final Controls front_of_check_controls;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String primary_button_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "<init>", "()V", "title", "", "description", "primary_button_label", "endorsement_instructions", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "front_of_check_controls", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "back_of_check_controls", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Controls back_of_check_controls;
            public String description;
            public EndorsementInstructions endorsement_instructions;
            public Controls front_of_check_controls;
            public String primary_button_label;
            public String title;

            public final Builder back_of_check_controls(Controls back_of_check_controls) {
                this.back_of_check_controls = back_of_check_controls;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public PhotoCaptureData build() {
                return new PhotoCaptureData(this.title, this.description, this.primary_button_label, this.endorsement_instructions, this.front_of_check_controls, this.back_of_check_controls, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder endorsement_instructions(EndorsementInstructions endorsement_instructions) {
                this.endorsement_instructions = endorsement_instructions;
                return this;
            }

            public final Builder front_of_check_controls(Controls front_of_check_controls) {
                this.front_of_check_controls = front_of_check_controls;
                return this;
            }

            public final Builder primary_button_label(String primary_button_label) {
                this.primary_button_label = primary_button_label;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0018\u0019\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JL\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$Builder;", "title", "", "message", "button_title", "front_confirmation", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "back_confirmation", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "FrontConfirmation", "BackConfirmation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EndorsementInstructions extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EndorsementInstructions> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation#ADAPTER", schemaIndex = 4, tag = 5)
            public final BackConfirmation back_confirmation;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String button_title;

            @WireField(adapter = "com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation#ADAPTER", schemaIndex = 3, tag = 4)
            public final FrontConfirmation front_confirmation;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String message;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String title;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "<init>", "()V", "title", "", "message", "button_title", "front_confirmation", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "back_confirmation", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public BackConfirmation back_confirmation;
                public String button_title;
                public FrontConfirmation front_confirmation;
                public String message;
                public String title;

                public final Builder back_confirmation(BackConfirmation back_confirmation) {
                    this.back_confirmation = back_confirmation;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public EndorsementInstructions build() {
                    return new EndorsementInstructions(this.title, this.message, this.button_title, this.front_confirmation, this.back_confirmation, buildUnknownFields());
                }

                public final Builder button_title(String button_title) {
                    this.button_title = button_title;
                    return this;
                }

                public final Builder front_confirmation(FrontConfirmation front_confirmation) {
                    this.front_confirmation = front_confirmation;
                    return this;
                }

                public final Builder message(String message) {
                    this.message = message;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EndorsementInstructions.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions decode(ProtoReader reader) {
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
                                return new CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions((String) obj, (String) obj2, (String) obj3, (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation) obj4, (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 4) {
                                obj4 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.ADAPTER, reader, obj4);
                            } else if (nextTag != 5) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj5 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.ADAPTER, reader, obj5);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.message);
                        protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.ADAPTER.encodeWithTag(writer, 4, value.front_confirmation);
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.ADAPTER.encodeWithTag(writer, 5, value.back_confirmation);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.ADAPTER.encodedSizeWithTag(5, value.back_confirmation) + CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.ADAPTER.encodedSizeWithTag(4, value.front_confirmation) + protoAdapter2.encodedSizeWithTag(3, value.button_title) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions redact(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions value) {
                        value.getClass();
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation frontConfirmation = value.front_confirmation;
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation frontConfirmation2 = frontConfirmation != null ? (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation) CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.ADAPTER.redact(frontConfirmation) : null;
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation backConfirmation = value.back_confirmation;
                        return CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.copy$default(value, null, null, null, frontConfirmation2, backConfirmation != null ? (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation) CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.ADAPTER.redact(backConfirmation) : null, ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.ADAPTER.encodeWithTag(writer, 5, value.back_confirmation);
                        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.ADAPTER.encodeWithTag(writer, 4, value.front_confirmation);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                        protoAdapter2.encodeWithTag(writer, 2, value.message);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ EndorsementInstructions(String str, String str2, String str3, FrontConfirmation frontConfirmation, BackConfirmation backConfirmation, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : frontConfirmation, (i & 16) != 0 ? null : backConfirmation, (i & 32) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ EndorsementInstructions copy$default(EndorsementInstructions endorsementInstructions, String str, String str2, String str3, FrontConfirmation frontConfirmation, BackConfirmation backConfirmation, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = endorsementInstructions.title;
                }
                if ((i & 2) != 0) {
                    str2 = endorsementInstructions.message;
                }
                if ((i & 4) != 0) {
                    str3 = endorsementInstructions.button_title;
                }
                if ((i & 8) != 0) {
                    frontConfirmation = endorsementInstructions.front_confirmation;
                }
                if ((i & 16) != 0) {
                    backConfirmation = endorsementInstructions.back_confirmation;
                }
                if ((i & 32) != 0) {
                    byteString = endorsementInstructions.unknownFields();
                }
                BackConfirmation backConfirmation2 = backConfirmation;
                ByteString byteString2 = byteString;
                return endorsementInstructions.copy(str, str2, str3, frontConfirmation, backConfirmation2, byteString2);
            }

            public final EndorsementInstructions copy(String title, String message, String button_title, FrontConfirmation front_confirmation, BackConfirmation back_confirmation, ByteString unknownFields) {
                unknownFields.getClass();
                return new EndorsementInstructions(title, message, button_title, front_confirmation, back_confirmation, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EndorsementInstructions)) {
                    return false;
                }
                EndorsementInstructions endorsementInstructions = (EndorsementInstructions) other;
                return Intrinsics.areEqual(unknownFields(), endorsementInstructions.unknownFields()) && Intrinsics.areEqual(this.title, endorsementInstructions.title) && Intrinsics.areEqual(this.message, endorsementInstructions.message) && Intrinsics.areEqual(this.button_title, endorsementInstructions.button_title) && Intrinsics.areEqual(this.front_confirmation, endorsementInstructions.front_confirmation) && Intrinsics.areEqual(this.back_confirmation, endorsementInstructions.back_confirmation);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.message;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.button_title;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                FrontConfirmation frontConfirmation = this.front_confirmation;
                int hashCode5 = (hashCode4 + (frontConfirmation != null ? frontConfirmation.hashCode() : 0)) * 37;
                BackConfirmation backConfirmation = this.back_confirmation;
                int hashCode6 = hashCode5 + (backConfirmation != null ? backConfirmation.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.message = this.message;
                builder.button_title = this.button_title;
                builder.front_confirmation = this.front_confirmation;
                builder.back_confirmation = this.back_confirmation;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.message;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                }
                String str3 = this.button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
                }
                FrontConfirmation frontConfirmation = this.front_confirmation;
                if (frontConfirmation != null) {
                    arrayList.add("front_confirmation=" + frontConfirmation);
                }
                BackConfirmation backConfirmation = this.back_confirmation;
                if (backConfirmation != null) {
                    arrayList.add("back_confirmation=" + backConfirmation);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EndorsementInstructions{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016Jd\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation$Builder;", "title", "", "message", "signature_text", "endorsement_text", "verify_checkbox_label", "button_title", "combined_signature_endorsement_plain_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class BackConfirmation extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<BackConfirmation> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
                public final String button_title;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
                public final String combined_signature_endorsement_plain_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
                public final String endorsement_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                public final String message;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
                public final String signature_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String title;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
                public final String verify_checkbox_label;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "<init>", "()V", "title", "", "message", "signature_text", "endorsement_text", "verify_checkbox_label", "button_title", "combined_signature_endorsement_plain_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String button_title;
                    public String combined_signature_endorsement_plain_text;
                    public String endorsement_text;
                    public String message;
                    public String signature_text;
                    public String title;
                    public String verify_checkbox_label;

                    @Override // com.squareup.wire.Message.Builder
                    public BackConfirmation build() {
                        return new BackConfirmation(this.title, this.message, this.signature_text, this.endorsement_text, this.verify_checkbox_label, this.button_title, this.combined_signature_endorsement_plain_text, buildUnknownFields());
                    }

                    public final Builder button_title(String button_title) {
                        this.button_title = button_title;
                        return this;
                    }

                    public final Builder combined_signature_endorsement_plain_text(String combined_signature_endorsement_plain_text) {
                        this.combined_signature_endorsement_plain_text = combined_signature_endorsement_plain_text;
                        return this;
                    }

                    public final Builder endorsement_text(String endorsement_text) {
                        this.endorsement_text = endorsement_text;
                        return this;
                    }

                    public final Builder message(String message) {
                        this.message = message;
                        return this;
                    }

                    public final Builder signature_text(String signature_text) {
                        this.signature_text = signature_text;
                        return this;
                    }

                    public final Builder title(String title) {
                        this.title = title;
                        return this;
                    }

                    public final Builder verify_checkbox_label(String verify_checkbox_label) {
                        this.verify_checkbox_label = verify_checkbox_label;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BackConfirmation.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation decode(ProtoReader reader) {
                            reader.getClass();
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
                                    return new CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                    default:
                                        reader.readUnknownField(nextTag);
                                        break;
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            protoAdapter2.encodeWithTag(writer, 3, value.signature_text);
                            protoAdapter2.encodeWithTag(writer, 4, value.endorsement_text);
                            protoAdapter2.encodeWithTag(writer, 5, value.verify_checkbox_label);
                            protoAdapter2.encodeWithTag(writer, 6, value.button_title);
                            protoAdapter2.encodeWithTag(writer, 7, value.combined_signature_endorsement_plain_text);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(7, value.combined_signature_endorsement_plain_text) + protoAdapter2.encodedSizeWithTag(6, value.button_title) + protoAdapter2.encodedSizeWithTag(5, value.verify_checkbox_label) + protoAdapter2.encodedSizeWithTag(4, value.endorsement_text) + protoAdapter2.encodedSizeWithTag(3, value.signature_text) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation redact(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation value) {
                            value.getClass();
                            return CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, 127, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 7, value.combined_signature_endorsement_plain_text);
                            protoAdapter2.encodeWithTag(writer, 6, value.button_title);
                            protoAdapter2.encodeWithTag(writer, 5, value.verify_checkbox_label);
                            protoAdapter2.encodeWithTag(writer, 4, value.endorsement_text);
                            protoAdapter2.encodeWithTag(writer, 3, value.signature_text);
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ BackConfirmation(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ BackConfirmation copy$default(BackConfirmation backConfirmation, String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = backConfirmation.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = backConfirmation.message;
                    }
                    if ((i & 4) != 0) {
                        str3 = backConfirmation.signature_text;
                    }
                    if ((i & 8) != 0) {
                        str4 = backConfirmation.endorsement_text;
                    }
                    if ((i & 16) != 0) {
                        str5 = backConfirmation.verify_checkbox_label;
                    }
                    if ((i & 32) != 0) {
                        str6 = backConfirmation.button_title;
                    }
                    if ((i & 64) != 0) {
                        str7 = backConfirmation.combined_signature_endorsement_plain_text;
                    }
                    if ((i & 128) != 0) {
                        byteString = backConfirmation.unknownFields();
                    }
                    String str8 = str7;
                    ByteString byteString2 = byteString;
                    String str9 = str5;
                    String str10 = str6;
                    return backConfirmation.copy(str, str2, str3, str4, str9, str10, str8, byteString2);
                }

                public final BackConfirmation copy(String title, String message, String signature_text, String endorsement_text, String verify_checkbox_label, String button_title, String combined_signature_endorsement_plain_text, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new BackConfirmation(title, message, signature_text, endorsement_text, verify_checkbox_label, button_title, combined_signature_endorsement_plain_text, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof BackConfirmation)) {
                        return false;
                    }
                    BackConfirmation backConfirmation = (BackConfirmation) other;
                    return Intrinsics.areEqual(unknownFields(), backConfirmation.unknownFields()) && Intrinsics.areEqual(this.title, backConfirmation.title) && Intrinsics.areEqual(this.message, backConfirmation.message) && Intrinsics.areEqual(this.signature_text, backConfirmation.signature_text) && Intrinsics.areEqual(this.endorsement_text, backConfirmation.endorsement_text) && Intrinsics.areEqual(this.verify_checkbox_label, backConfirmation.verify_checkbox_label) && Intrinsics.areEqual(this.button_title, backConfirmation.button_title) && Intrinsics.areEqual(this.combined_signature_endorsement_plain_text, backConfirmation.combined_signature_endorsement_plain_text);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.title;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.message;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.signature_text;
                    int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                    String str4 = this.endorsement_text;
                    int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                    String str5 = this.verify_checkbox_label;
                    int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
                    String str6 = this.button_title;
                    int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
                    String str7 = this.combined_signature_endorsement_plain_text;
                    int hashCode8 = hashCode7 + (str7 != null ? str7.hashCode() : 0);
                    this.hashCode = hashCode8;
                    return hashCode8;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.title = this.title;
                    builder.message = this.message;
                    builder.signature_text = this.signature_text;
                    builder.endorsement_text = this.endorsement_text;
                    builder.verify_checkbox_label = this.verify_checkbox_label;
                    builder.button_title = this.button_title;
                    builder.combined_signature_endorsement_plain_text = this.combined_signature_endorsement_plain_text;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    String str2 = this.message;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                    }
                    String str3 = this.signature_text;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "signature_text=", arrayList);
                    }
                    String str4 = this.endorsement_text;
                    if (str4 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "endorsement_text=", arrayList);
                    }
                    String str5 = this.verify_checkbox_label;
                    if (str5 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "verify_checkbox_label=", arrayList);
                    }
                    String str6 = this.button_title;
                    if (str6 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "button_title=", arrayList);
                    }
                    String str7 = this.combined_signature_endorsement_plain_text;
                    if (str7 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "combined_signature_endorsement_plain_text=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "BackConfirmation{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$BackConfirmation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ BackConfirmation build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public BackConfirmation() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BackConfirmation(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = str;
                    this.message = str2;
                    this.signature_text = str3;
                    this.endorsement_text = str4;
                    this.verify_checkbox_label = str5;
                    this.button_title = str6;
                    this.combined_signature_endorsement_plain_text = str7;
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016Jp\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation$Builder;", "title", "", "message", "customer_name_text", "amount_template_text", "verify_checkbox_label", "button_title", "customer_name_plain_text", "amount_template_plain_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class FrontConfirmation extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<FrontConfirmation> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
                public final String amount_template_plain_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
                public final String amount_template_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
                public final String button_title;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
                public final String customer_name_plain_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
                public final String customer_name_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                public final String message;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String title;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
                public final String verify_checkbox_label;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "<init>", "()V", "title", "", "message", "customer_name_text", "amount_template_text", "verify_checkbox_label", "button_title", "customer_name_plain_text", "amount_template_plain_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String amount_template_plain_text;
                    public String amount_template_text;
                    public String button_title;
                    public String customer_name_plain_text;
                    public String customer_name_text;
                    public String message;
                    public String title;
                    public String verify_checkbox_label;

                    public final Builder amount_template_plain_text(String amount_template_plain_text) {
                        this.amount_template_plain_text = amount_template_plain_text;
                        return this;
                    }

                    public final Builder amount_template_text(String amount_template_text) {
                        this.amount_template_text = amount_template_text;
                        return this;
                    }

                    @Override // com.squareup.wire.Message.Builder
                    public FrontConfirmation build() {
                        return new FrontConfirmation(this.title, this.message, this.customer_name_text, this.amount_template_text, this.verify_checkbox_label, this.button_title, this.customer_name_plain_text, this.amount_template_plain_text, buildUnknownFields());
                    }

                    public final Builder button_title(String button_title) {
                        this.button_title = button_title;
                        return this;
                    }

                    public final Builder customer_name_plain_text(String customer_name_plain_text) {
                        this.customer_name_plain_text = customer_name_plain_text;
                        return this;
                    }

                    public final Builder customer_name_text(String customer_name_text) {
                        this.customer_name_text = customer_name_text;
                        return this;
                    }

                    public final Builder message(String message) {
                        this.message = message;
                        return this;
                    }

                    public final Builder title(String title) {
                        this.title = title;
                        return this;
                    }

                    public final Builder verify_checkbox_label(String verify_checkbox_label) {
                        this.verify_checkbox_label = verify_checkbox_label;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FrontConfirmation.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation decode(ProtoReader reader) {
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
                                    return new CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
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
                        public void encode(ProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            protoAdapter2.encodeWithTag(writer, 3, value.customer_name_text);
                            protoAdapter2.encodeWithTag(writer, 4, value.amount_template_text);
                            protoAdapter2.encodeWithTag(writer, 5, value.verify_checkbox_label);
                            protoAdapter2.encodeWithTag(writer, 6, value.button_title);
                            protoAdapter2.encodeWithTag(writer, 7, value.customer_name_plain_text);
                            protoAdapter2.encodeWithTag(writer, 8, value.amount_template_plain_text);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(8, value.amount_template_plain_text) + protoAdapter2.encodedSizeWithTag(7, value.customer_name_plain_text) + protoAdapter2.encodedSizeWithTag(6, value.button_title) + protoAdapter2.encodedSizeWithTag(5, value.verify_checkbox_label) + protoAdapter2.encodedSizeWithTag(4, value.amount_template_text) + protoAdapter2.encodedSizeWithTag(3, value.customer_name_text) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation redact(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation value) {
                            value.getClass();
                            return CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 8, value.amount_template_plain_text);
                            protoAdapter2.encodeWithTag(writer, 7, value.customer_name_plain_text);
                            protoAdapter2.encodeWithTag(writer, 6, value.button_title);
                            protoAdapter2.encodeWithTag(writer, 5, value.verify_checkbox_label);
                            protoAdapter2.encodeWithTag(writer, 4, value.amount_template_text);
                            protoAdapter2.encodeWithTag(writer, 3, value.customer_name_text);
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ FrontConfirmation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ FrontConfirmation copy$default(FrontConfirmation frontConfirmation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = frontConfirmation.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = frontConfirmation.message;
                    }
                    if ((i & 4) != 0) {
                        str3 = frontConfirmation.customer_name_text;
                    }
                    if ((i & 8) != 0) {
                        str4 = frontConfirmation.amount_template_text;
                    }
                    if ((i & 16) != 0) {
                        str5 = frontConfirmation.verify_checkbox_label;
                    }
                    if ((i & 32) != 0) {
                        str6 = frontConfirmation.button_title;
                    }
                    if ((i & 64) != 0) {
                        str7 = frontConfirmation.customer_name_plain_text;
                    }
                    if ((i & 128) != 0) {
                        str8 = frontConfirmation.amount_template_plain_text;
                    }
                    if ((i & 256) != 0) {
                        byteString = frontConfirmation.unknownFields();
                    }
                    String str9 = str8;
                    ByteString byteString2 = byteString;
                    String str10 = str6;
                    String str11 = str7;
                    String str12 = str5;
                    String str13 = str3;
                    return frontConfirmation.copy(str, str2, str13, str4, str12, str10, str11, str9, byteString2);
                }

                public final FrontConfirmation copy(String title, String message, String customer_name_text, String amount_template_text, String verify_checkbox_label, String button_title, String customer_name_plain_text, String amount_template_plain_text, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new FrontConfirmation(title, message, customer_name_text, amount_template_text, verify_checkbox_label, button_title, customer_name_plain_text, amount_template_plain_text, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof FrontConfirmation)) {
                        return false;
                    }
                    FrontConfirmation frontConfirmation = (FrontConfirmation) other;
                    return Intrinsics.areEqual(unknownFields(), frontConfirmation.unknownFields()) && Intrinsics.areEqual(this.title, frontConfirmation.title) && Intrinsics.areEqual(this.message, frontConfirmation.message) && Intrinsics.areEqual(this.customer_name_text, frontConfirmation.customer_name_text) && Intrinsics.areEqual(this.amount_template_text, frontConfirmation.amount_template_text) && Intrinsics.areEqual(this.verify_checkbox_label, frontConfirmation.verify_checkbox_label) && Intrinsics.areEqual(this.button_title, frontConfirmation.button_title) && Intrinsics.areEqual(this.customer_name_plain_text, frontConfirmation.customer_name_plain_text) && Intrinsics.areEqual(this.amount_template_plain_text, frontConfirmation.amount_template_plain_text);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.title;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.message;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.customer_name_text;
                    int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                    String str4 = this.amount_template_text;
                    int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                    String str5 = this.verify_checkbox_label;
                    int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
                    String str6 = this.button_title;
                    int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
                    String str7 = this.customer_name_plain_text;
                    int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
                    String str8 = this.amount_template_plain_text;
                    int hashCode9 = hashCode8 + (str8 != null ? str8.hashCode() : 0);
                    this.hashCode = hashCode9;
                    return hashCode9;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.title = this.title;
                    builder.message = this.message;
                    builder.customer_name_text = this.customer_name_text;
                    builder.amount_template_text = this.amount_template_text;
                    builder.verify_checkbox_label = this.verify_checkbox_label;
                    builder.button_title = this.button_title;
                    builder.customer_name_plain_text = this.customer_name_plain_text;
                    builder.amount_template_plain_text = this.amount_template_plain_text;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    String str2 = this.message;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                    }
                    if (this.customer_name_text != null) {
                        arrayList.add("customer_name_text=██");
                    }
                    String str3 = this.amount_template_text;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "amount_template_text=", arrayList);
                    }
                    String str4 = this.verify_checkbox_label;
                    if (str4 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "verify_checkbox_label=", arrayList);
                    }
                    String str5 = this.button_title;
                    if (str5 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "button_title=", arrayList);
                    }
                    if (this.customer_name_plain_text != null) {
                        arrayList.add("customer_name_plain_text=██");
                    }
                    String str6 = this.amount_template_plain_text;
                    if (str6 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "amount_template_plain_text=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "FrontConfirmation{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$FrontConfirmation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ FrontConfirmation build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public FrontConfirmation() {
                    this(null, null, null, null, null, null, null, null, null, 511, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FrontConfirmation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = str;
                    this.message = str2;
                    this.customer_name_text = str3;
                    this.amount_template_text = str4;
                    this.verify_checkbox_label = str5;
                    this.button_title = str6;
                    this.customer_name_plain_text = str7;
                    this.amount_template_plain_text = str8;
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$EndorsementInstructions;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ EndorsementInstructions build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public EndorsementInstructions() {
                this(null, null, null, null, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndorsementInstructions(String str, String str2, String str3, FrontConfirmation frontConfirmation, BackConfirmation backConfirmation, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.message = str2;
                this.button_title = str3;
                this.front_confirmation = frontConfirmation;
                this.back_confirmation = backConfirmation;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PhotoCaptureData.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CheckDepositBlocker.PhotoCaptureData decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CheckDepositBlocker.PhotoCaptureData((String) obj, (String) obj2, (String) obj3, (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions) obj4, (CheckDepositBlocker.PhotoCaptureData.Controls) obj5, (CheckDepositBlocker.PhotoCaptureData.Controls) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                obj4 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER, reader, obj6);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CheckDepositBlocker.PhotoCaptureData value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 3, value.primary_button_label);
                    CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.ADAPTER.encodeWithTag(writer, 4, value.endorsement_instructions);
                    ProtoAdapter protoAdapter3 = CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 5, value.front_of_check_controls);
                    protoAdapter3.encodeWithTag(writer, 6, value.back_of_check_controls);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CheckDepositBlocker.PhotoCaptureData value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.ADAPTER.encodedSizeWithTag(4, value.endorsement_instructions) + protoAdapter2.encodedSizeWithTag(3, value.primary_button_label) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(6, value.back_of_check_controls) + protoAdapter3.encodedSizeWithTag(5, value.front_of_check_controls) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CheckDepositBlocker.PhotoCaptureData redact(CheckDepositBlocker.PhotoCaptureData value) {
                    value.getClass();
                    CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions endorsementInstructions = value.endorsement_instructions;
                    CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions endorsementInstructions2 = endorsementInstructions != null ? (CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions) CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.ADAPTER.redact(endorsementInstructions) : null;
                    CheckDepositBlocker.PhotoCaptureData.Controls controls = value.front_of_check_controls;
                    CheckDepositBlocker.PhotoCaptureData.Controls controls2 = controls != null ? (CheckDepositBlocker.PhotoCaptureData.Controls) CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER.redact(controls) : null;
                    CheckDepositBlocker.PhotoCaptureData.Controls controls3 = value.back_of_check_controls;
                    return CheckDepositBlocker.PhotoCaptureData.copy$default(value, null, null, null, endorsementInstructions2, controls2, controls3 != null ? (CheckDepositBlocker.PhotoCaptureData.Controls) CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER.redact(controls3) : null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CheckDepositBlocker.PhotoCaptureData value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = CheckDepositBlocker.PhotoCaptureData.Controls.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 6, value.back_of_check_controls);
                    protoAdapter2.encodeWithTag(writer, 5, value.front_of_check_controls);
                    CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.ADAPTER.encodeWithTag(writer, 4, value.endorsement_instructions);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 3, value.primary_button_label);
                    protoAdapter3.encodeWithTag(writer, 2, value.description);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PhotoCaptureData(String str, String str2, String str3, EndorsementInstructions endorsementInstructions, Controls controls, Controls controls2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : endorsementInstructions, (i & 16) != 0 ? null : controls, (i & 32) != 0 ? null : controls2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PhotoCaptureData copy$default(PhotoCaptureData photoCaptureData, String str, String str2, String str3, EndorsementInstructions endorsementInstructions, Controls controls, Controls controls2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = photoCaptureData.title;
            }
            if ((i & 2) != 0) {
                str2 = photoCaptureData.description;
            }
            if ((i & 4) != 0) {
                str3 = photoCaptureData.primary_button_label;
            }
            if ((i & 8) != 0) {
                endorsementInstructions = photoCaptureData.endorsement_instructions;
            }
            if ((i & 16) != 0) {
                controls = photoCaptureData.front_of_check_controls;
            }
            if ((i & 32) != 0) {
                controls2 = photoCaptureData.back_of_check_controls;
            }
            if ((i & 64) != 0) {
                byteString = photoCaptureData.unknownFields();
            }
            Controls controls3 = controls2;
            ByteString byteString2 = byteString;
            Controls controls4 = controls;
            String str4 = str3;
            return photoCaptureData.copy(str, str2, str4, endorsementInstructions, controls4, controls3, byteString2);
        }

        public final PhotoCaptureData copy(String title, String description, String primary_button_label, EndorsementInstructions endorsement_instructions, Controls front_of_check_controls, Controls back_of_check_controls, ByteString unknownFields) {
            unknownFields.getClass();
            return new PhotoCaptureData(title, description, primary_button_label, endorsement_instructions, front_of_check_controls, back_of_check_controls, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PhotoCaptureData)) {
                return false;
            }
            PhotoCaptureData photoCaptureData = (PhotoCaptureData) other;
            return Intrinsics.areEqual(unknownFields(), photoCaptureData.unknownFields()) && Intrinsics.areEqual(this.title, photoCaptureData.title) && Intrinsics.areEqual(this.description, photoCaptureData.description) && Intrinsics.areEqual(this.primary_button_label, photoCaptureData.primary_button_label) && Intrinsics.areEqual(this.endorsement_instructions, photoCaptureData.endorsement_instructions) && Intrinsics.areEqual(this.front_of_check_controls, photoCaptureData.front_of_check_controls) && Intrinsics.areEqual(this.back_of_check_controls, photoCaptureData.back_of_check_controls);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.primary_button_label;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            EndorsementInstructions endorsementInstructions = this.endorsement_instructions;
            int hashCode5 = (hashCode4 + (endorsementInstructions != null ? endorsementInstructions.hashCode() : 0)) * 37;
            Controls controls = this.front_of_check_controls;
            int hashCode6 = (hashCode5 + (controls != null ? controls.hashCode() : 0)) * 37;
            Controls controls2 = this.back_of_check_controls;
            int hashCode7 = hashCode6 + (controls2 != null ? controls2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.description = this.description;
            builder.primary_button_label = this.primary_button_label;
            builder.endorsement_instructions = this.endorsement_instructions;
            builder.front_of_check_controls = this.front_of_check_controls;
            builder.back_of_check_controls = this.back_of_check_controls;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            String str3 = this.primary_button_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_button_label=", arrayList);
            }
            EndorsementInstructions endorsementInstructions = this.endorsement_instructions;
            if (endorsementInstructions != null) {
                arrayList.add("endorsement_instructions=" + endorsementInstructions);
            }
            Controls controls = this.front_of_check_controls;
            if (controls != null) {
                arrayList.add("front_of_check_controls=" + controls);
            }
            Controls controls2 = this.back_of_check_controls;
            if (controls2 != null) {
                arrayList.add("back_of_check_controls=" + controls2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PhotoCaptureData{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls$Builder;", AnnotatedPrivateKey.LABEL, "", "button_title", "capture_screen_header_label", "capture_screen_footer_label", "take_photo_button_title", "retake_photo_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getButton_title$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Controls extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Controls> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String button_title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String capture_screen_footer_label;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String capture_screen_header_label;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
            public final String retake_photo_label;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
            public final String take_photo_button_title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "button_title", "capture_screen_header_label", "capture_screen_footer_label", "take_photo_button_title", "retake_photo_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String button_title;
                public String capture_screen_footer_label;
                public String capture_screen_header_label;
                public String label;
                public String retake_photo_label;
                public String take_photo_button_title;

                @Override // com.squareup.wire.Message.Builder
                public Controls build() {
                    return new Controls(this.label, this.button_title, this.capture_screen_header_label, this.capture_screen_footer_label, this.take_photo_button_title, this.retake_photo_label, buildUnknownFields());
                }

                @Deprecated
                public final Builder button_title(String button_title) {
                    this.button_title = button_title;
                    return this;
                }

                public final Builder capture_screen_footer_label(String capture_screen_footer_label) {
                    this.capture_screen_footer_label = capture_screen_footer_label;
                    return this;
                }

                public final Builder capture_screen_header_label(String capture_screen_header_label) {
                    this.capture_screen_header_label = capture_screen_header_label;
                    return this;
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder retake_photo_label(String retake_photo_label) {
                    this.retake_photo_label = retake_photo_label;
                    return this;
                }

                public final Builder take_photo_button_title(String take_photo_button_title) {
                    this.take_photo_button_title = take_photo_button_title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Controls.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$PhotoCaptureData$Controls$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public CheckDepositBlocker.PhotoCaptureData.Controls decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        Object obj6 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new CheckDepositBlocker.PhotoCaptureData.Controls((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.Controls value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        protoAdapter2.encodeWithTag(writer, 2, value.button_title);
                        protoAdapter2.encodeWithTag(writer, 3, value.capture_screen_header_label);
                        protoAdapter2.encodeWithTag(writer, 4, value.capture_screen_footer_label);
                        protoAdapter2.encodeWithTag(writer, 5, value.take_photo_button_title);
                        protoAdapter2.encodeWithTag(writer, 6, value.retake_photo_label);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CheckDepositBlocker.PhotoCaptureData.Controls value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(6, value.retake_photo_label) + protoAdapter2.encodedSizeWithTag(5, value.take_photo_button_title) + protoAdapter2.encodedSizeWithTag(4, value.capture_screen_footer_label) + protoAdapter2.encodedSizeWithTag(3, value.capture_screen_header_label) + protoAdapter2.encodedSizeWithTag(2, value.button_title) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CheckDepositBlocker.PhotoCaptureData.Controls redact(CheckDepositBlocker.PhotoCaptureData.Controls value) {
                        value.getClass();
                        return CheckDepositBlocker.PhotoCaptureData.Controls.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CheckDepositBlocker.PhotoCaptureData.Controls value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 6, value.retake_photo_label);
                        protoAdapter2.encodeWithTag(writer, 5, value.take_photo_button_title);
                        protoAdapter2.encodeWithTag(writer, 4, value.capture_screen_footer_label);
                        protoAdapter2.encodeWithTag(writer, 3, value.capture_screen_header_label);
                        protoAdapter2.encodeWithTag(writer, 2, value.button_title);
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Controls(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Controls copy$default(Controls controls, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = controls.label;
                }
                if ((i & 2) != 0) {
                    str2 = controls.button_title;
                }
                if ((i & 4) != 0) {
                    str3 = controls.capture_screen_header_label;
                }
                if ((i & 8) != 0) {
                    str4 = controls.capture_screen_footer_label;
                }
                if ((i & 16) != 0) {
                    str5 = controls.take_photo_button_title;
                }
                if ((i & 32) != 0) {
                    str6 = controls.retake_photo_label;
                }
                if ((i & 64) != 0) {
                    byteString = controls.unknownFields();
                }
                String str7 = str6;
                ByteString byteString2 = byteString;
                String str8 = str5;
                String str9 = str3;
                return controls.copy(str, str2, str9, str4, str8, str7, byteString2);
            }

            @Deprecated
            public static /* synthetic */ void getButton_title$annotations() {
            }

            public final Controls copy(String label, String button_title, String capture_screen_header_label, String capture_screen_footer_label, String take_photo_button_title, String retake_photo_label, ByteString unknownFields) {
                unknownFields.getClass();
                return new Controls(label, button_title, capture_screen_header_label, capture_screen_footer_label, take_photo_button_title, retake_photo_label, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Controls)) {
                    return false;
                }
                Controls controls = (Controls) other;
                return Intrinsics.areEqual(unknownFields(), controls.unknownFields()) && Intrinsics.areEqual(this.label, controls.label) && Intrinsics.areEqual(this.button_title, controls.button_title) && Intrinsics.areEqual(this.capture_screen_header_label, controls.capture_screen_header_label) && Intrinsics.areEqual(this.capture_screen_footer_label, controls.capture_screen_footer_label) && Intrinsics.areEqual(this.take_photo_button_title, controls.take_photo_button_title) && Intrinsics.areEqual(this.retake_photo_label, controls.retake_photo_label);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.button_title;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.capture_screen_header_label;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.capture_screen_footer_label;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.take_photo_button_title;
                int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
                String str6 = this.retake_photo_label;
                int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.button_title = this.button_title;
                builder.capture_screen_header_label = this.capture_screen_header_label;
                builder.capture_screen_footer_label = this.capture_screen_footer_label;
                builder.take_photo_button_title = this.take_photo_button_title;
                builder.retake_photo_label = this.retake_photo_label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                String str2 = this.button_title;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "button_title=", arrayList);
                }
                String str3 = this.capture_screen_header_label;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "capture_screen_header_label=", arrayList);
                }
                String str4 = this.capture_screen_footer_label;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "capture_screen_footer_label=", arrayList);
                }
                String str5 = this.take_photo_button_title;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "take_photo_button_title=", arrayList);
                }
                String str6 = this.retake_photo_label;
                if (str6 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "retake_photo_label=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Controls{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Controls;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Controls build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Controls() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Controls(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.button_title = str2;
                this.capture_screen_header_label = str3;
                this.capture_screen_footer_label = str4;
                this.take_photo_button_title = str5;
                this.retake_photo_label = str6;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$PhotoCaptureData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PhotoCaptureData build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PhotoCaptureData() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoCaptureData(String str, String str2, String str3, EndorsementInstructions endorsementInstructions, Controls controls, Controls controls2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
            this.primary_button_label = str3;
            this.endorsement_instructions = endorsementInstructions;
            this.front_of_check_controls = controls;
            this.back_of_check_controls = controls2;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CheckDepositBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CheckDepositBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CheckDepositBlocker((CheckDepositBlocker.AmountEntryData) obj, (CheckDepositBlocker.PhotoCaptureData) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.AmountEntryData.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(CheckDepositBlocker.PhotoCaptureData.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckDepositBlocker value) {
                writer.getClass();
                value.getClass();
                CheckDepositBlocker.AmountEntryData.ADAPTER.encodeWithTag(writer, 1, value.amount_entry_data);
                CheckDepositBlocker.PhotoCaptureData.ADAPTER.encodeWithTag(writer, 2, value.photo_capture_data);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.misnap_license_key);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckDepositBlocker value) {
                value.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.misnap_license_key) + CheckDepositBlocker.PhotoCaptureData.ADAPTER.encodedSizeWithTag(2, value.photo_capture_data) + CheckDepositBlocker.AmountEntryData.ADAPTER.encodedSizeWithTag(1, value.amount_entry_data) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckDepositBlocker redact(CheckDepositBlocker value) {
                value.getClass();
                CheckDepositBlocker.AmountEntryData amountEntryData = value.amount_entry_data;
                CheckDepositBlocker.AmountEntryData amountEntryData2 = amountEntryData != null ? (CheckDepositBlocker.AmountEntryData) CheckDepositBlocker.AmountEntryData.ADAPTER.redact(amountEntryData) : null;
                CheckDepositBlocker.PhotoCaptureData photoCaptureData = value.photo_capture_data;
                CheckDepositBlocker.PhotoCaptureData photoCaptureData2 = photoCaptureData != null ? (CheckDepositBlocker.PhotoCaptureData) CheckDepositBlocker.PhotoCaptureData.ADAPTER.redact(photoCaptureData) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new CheckDepositBlocker(amountEntryData2, photoCaptureData2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckDepositBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.misnap_license_key);
                CheckDepositBlocker.PhotoCaptureData.ADAPTER.encodeWithTag(writer, 2, value.photo_capture_data);
                CheckDepositBlocker.AmountEntryData.ADAPTER.encodeWithTag(writer, 1, value.amount_entry_data);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDepositBlocker(AmountEntryData amountEntryData, PhotoCaptureData photoCaptureData, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_entry_data = amountEntryData;
        this.photo_capture_data = photoCaptureData;
        this.misnap_license_key = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckDepositBlocker)) {
            return false;
        }
        CheckDepositBlocker checkDepositBlocker = (CheckDepositBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), checkDepositBlocker.unknownFields()) && Intrinsics.areEqual(this.amount_entry_data, checkDepositBlocker.amount_entry_data) && Intrinsics.areEqual(this.photo_capture_data, checkDepositBlocker.photo_capture_data) && Intrinsics.areEqual(this.misnap_license_key, checkDepositBlocker.misnap_license_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AmountEntryData amountEntryData = this.amount_entry_data;
        int hashCode2 = (hashCode + (amountEntryData != null ? amountEntryData.hashCode() : 0)) * 37;
        PhotoCaptureData photoCaptureData = this.photo_capture_data;
        int hashCode3 = (hashCode2 + (photoCaptureData != null ? photoCaptureData.hashCode() : 0)) * 37;
        String str = this.misnap_license_key;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.amount_entry_data = this.amount_entry_data;
        builder.photo_capture_data = this.photo_capture_data;
        builder.misnap_license_key = this.misnap_license_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AmountEntryData amountEntryData = this.amount_entry_data;
        if (amountEntryData != null) {
            arrayList.add("amount_entry_data=" + amountEntryData);
        }
        PhotoCaptureData photoCaptureData = this.photo_capture_data;
        if (photoCaptureData != null) {
            arrayList.add("photo_capture_data=" + photoCaptureData);
        }
        if (this.misnap_license_key != null) {
            arrayList.add("misnap_license_key=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckDepositBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData$Builder;", "title", "", "subtitle", "maximum_amount", "Lcom/squareup/protos/common/Money;", "primary_button_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AmountEntryData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AmountEntryData> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
        public final Money maximum_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String primary_button_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "<init>", "()V", "title", "", "subtitle", "maximum_amount", "Lcom/squareup/protos/common/Money;", "primary_button_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Money maximum_amount;
            public String primary_button_label;
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public AmountEntryData build() {
                return new AmountEntryData(this.title, this.subtitle, this.maximum_amount, this.primary_button_label, buildUnknownFields());
            }

            public final Builder maximum_amount(Money maximum_amount) {
                this.maximum_amount = maximum_amount;
                return this;
            }

            public final Builder primary_button_label(String primary_button_label) {
                this.primary_button_label = primary_button_label;
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
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountEntryData.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CheckDepositBlocker$AmountEntryData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CheckDepositBlocker.AmountEntryData decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CheckDepositBlocker.AmountEntryData((String) obj, (String) obj2, (Money) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CheckDepositBlocker.AmountEntryData value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    Money.ADAPTER.encodeWithTag(writer, 3, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 4, value.primary_button_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CheckDepositBlocker.AmountEntryData value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.primary_button_label) + Money.ADAPTER.encodedSizeWithTag(3, value.maximum_amount) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CheckDepositBlocker.AmountEntryData redact(CheckDepositBlocker.AmountEntryData value) {
                    value.getClass();
                    Money money = value.maximum_amount;
                    return CheckDepositBlocker.AmountEntryData.copy$default(value, null, null, money != null ? (Money) Money.ADAPTER.redact(money) : null, null, ByteString.EMPTY, 11, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CheckDepositBlocker.AmountEntryData value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.primary_button_label);
                    Money.ADAPTER.encodeWithTag(writer, 3, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AmountEntryData(String str, String str2, Money money, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AmountEntryData copy$default(AmountEntryData amountEntryData, String str, String str2, Money money, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amountEntryData.title;
            }
            if ((i & 2) != 0) {
                str2 = amountEntryData.subtitle;
            }
            if ((i & 4) != 0) {
                money = amountEntryData.maximum_amount;
            }
            if ((i & 8) != 0) {
                str3 = amountEntryData.primary_button_label;
            }
            if ((i & 16) != 0) {
                byteString = amountEntryData.unknownFields();
            }
            ByteString byteString2 = byteString;
            Money money2 = money;
            return amountEntryData.copy(str, str2, money2, str3, byteString2);
        }

        public final AmountEntryData copy(String title, String subtitle, Money maximum_amount, String primary_button_label, ByteString unknownFields) {
            unknownFields.getClass();
            return new AmountEntryData(title, subtitle, maximum_amount, primary_button_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AmountEntryData)) {
                return false;
            }
            AmountEntryData amountEntryData = (AmountEntryData) other;
            return Intrinsics.areEqual(unknownFields(), amountEntryData.unknownFields()) && Intrinsics.areEqual(this.title, amountEntryData.title) && Intrinsics.areEqual(this.subtitle, amountEntryData.subtitle) && Intrinsics.areEqual(this.maximum_amount, amountEntryData.maximum_amount) && Intrinsics.areEqual(this.primary_button_label, amountEntryData.primary_button_label);
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
            Money money = this.maximum_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            String str3 = this.primary_button_label;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.maximum_amount = this.maximum_amount;
            builder.primary_button_label = this.primary_button_label;
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
            Money money = this.maximum_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money, arrayList);
            }
            String str3 = this.primary_button_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_button_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AmountEntryData{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker$AmountEntryData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AmountEntryData build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AmountEntryData() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountEntryData(String str, String str2, Money money, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.maximum_amount = money;
            this.primary_button_label = str3;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CheckDepositBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CheckDepositBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CheckDepositBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CheckDepositBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
