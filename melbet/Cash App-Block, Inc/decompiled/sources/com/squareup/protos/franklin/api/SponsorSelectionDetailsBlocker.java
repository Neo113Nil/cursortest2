package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.ui.UiCustomer;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u001a\u001b\u0019\u001c\u001d\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$Builder;", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "sponsor_avatar", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "", "primary_button_text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "primary_button_action", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "cancel_action", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "cancel_button_text", "legal_footer_text", "", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$SelectableRowElement;", "sponsor_details", "Ljava/util/List;", "Companion", "Builder", "PrimaryButtonAction", "SendSelectedSponsorSmsAction", "ConfirmSelectedSponsorAction", "CancelSponsorSelectionAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SponsorSelectionDetailsBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SponsorSelectionDetailsBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction#ADAPTER", schemaIndex = 6, tag = 8)
    public final CancelSponsorSelectionAction cancel_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 9)
    public final String cancel_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 8, tag = 10)
    public final FormBlocker.Element.TextElement legal_footer_text;

    @WireSealedOneof(schemaIndex = 5)
    public final PrimaryButtonAction primary_button_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String primary_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$AvatarElement#ADAPTER", schemaIndex = 0, tag = 1)
    public final FormBlocker.Element.AvatarElement sponsor_avatar;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$SelectableRowElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<FormBlocker.Element.SelectableRowElement> sponsor_details;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 2, tag = 3)
    public final FormBlocker.Element.TextElement subtitle;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 1, tag = 2)
    public final FormBlocker.Element.TextElement title;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker;", "<init>", "()V", "sponsor_avatar", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$AvatarElement;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "sponsor_details", "", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$SelectableRowElement;", "primary_button_text", "", "primary_button_action", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "cancel_action", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "cancel_button_text", "legal_footer_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public CancelSponsorSelectionAction cancel_action;
        public String cancel_button_text;
        public FormBlocker.Element.TextElement legal_footer_text;
        public PrimaryButtonAction primary_button_action;
        public String primary_button_text;
        public FormBlocker.Element.AvatarElement sponsor_avatar;
        public List<FormBlocker.Element.SelectableRowElement> sponsor_details = EmptyList.INSTANCE;
        public FormBlocker.Element.TextElement subtitle;
        public FormBlocker.Element.TextElement title;

        @Override // com.squareup.wire.Message.Builder
        public SponsorSelectionDetailsBlocker build() {
            return new SponsorSelectionDetailsBlocker(this.sponsor_avatar, this.title, this.subtitle, this.sponsor_details, this.primary_button_text, this.primary_button_action, this.cancel_action, this.cancel_button_text, this.legal_footer_text, buildUnknownFields());
        }

        public final Builder cancel_action(CancelSponsorSelectionAction cancel_action) {
            this.cancel_action = cancel_action;
            return this;
        }

        public final Builder cancel_button_text(String cancel_button_text) {
            this.cancel_button_text = cancel_button_text;
            return this;
        }

        public final Builder legal_footer_text(FormBlocker.Element.TextElement legal_footer_text) {
            this.legal_footer_text = legal_footer_text;
            return this;
        }

        public final Builder primary_button_action(PrimaryButtonAction primary_button_action) {
            this.primary_button_action = primary_button_action;
            return this;
        }

        public final Builder primary_button_text(String primary_button_text) {
            this.primary_button_text = primary_button_text;
            return this;
        }

        public final Builder sponsor_avatar(FormBlocker.Element.AvatarElement sponsor_avatar) {
            this.sponsor_avatar = sponsor_avatar;
            return this;
        }

        public final Builder sponsor_details(List<FormBlocker.Element.SelectableRowElement> sponsor_details) {
            sponsor_details.getClass();
            TransactorKt.checkElementsNotNull(sponsor_details);
            this.sponsor_details = sponsor_details;
            return this;
        }

        public final Builder subtitle(FormBlocker.Element.TextElement subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(FormBlocker.Element.TextElement title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SponsorSelectionDetailsBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SponsorSelectionDetailsBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SponsorSelectionDetailsBlocker((FormBlocker.Element.AvatarElement) obj, (FormBlocker.Element.TextElement) obj2, (FormBlocker.Element.TextElement) obj3, m, (String) obj4, primaryButtonAction, (SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction) obj5, (String) obj6, (FormBlocker.Element.TextElement) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.AvatarElement.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            m.add(FormBlocker.Element.SelectableRowElement.ADAPTER.decode(reader));
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            primaryButtonAction = new SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction((SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction) SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.decode(reader));
                            break;
                        case 7:
                            primaryButtonAction = new SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction((SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction) SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction.ADAPTER.decode(reader));
                            break;
                        case 8:
                            obj5 = TransactorKt.decodeMessageOrMerge(SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER, reader, obj5);
                            break;
                        case 9:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            obj7 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SponsorSelectionDetailsBlocker value) {
                writer.getClass();
                value.getClass();
                FormBlocker.Element.AvatarElement.ADAPTER.encodeWithTag(writer, 1, value.sponsor_avatar);
                ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.sponsor_details);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 5, value.primary_button_text);
                SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER.encodeWithTag(writer, 8, value.cancel_action);
                protoAdapter3.encodeWithTag(writer, 9, value.cancel_button_text);
                protoAdapter2.encodeWithTag(writer, 10, value.legal_footer_text);
                SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = value.primary_button_action;
                if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) {
                    SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodeWithTag(writer, 6, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) primaryButtonAction).getValue());
                } else if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) {
                    SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction.ADAPTER.encodeWithTag(writer, 7, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) primaryButtonAction).getValue());
                } else if (primaryButtonAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SponsorSelectionDetailsBlocker value) {
                int encodedSizeWithTag;
                value.getClass();
                int encodedSizeWithTag2 = FormBlocker.Element.AvatarElement.ADAPTER.encodedSizeWithTag(1, value.sponsor_avatar) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                int encodedSizeWithTag3 = FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodedSizeWithTag(4, value.sponsor_details) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(5, value.primary_button_text) + encodedSizeWithTag3;
                SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = value.primary_button_action;
                if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) {
                    encodedSizeWithTag = SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodedSizeWithTag(6, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) primaryButtonAction).getValue());
                } else {
                    if (!(primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction)) {
                        if (primaryButtonAction != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(10, value.legal_footer_text) + protoAdapter3.encodedSizeWithTag(9, value.cancel_button_text) + SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER.encodedSizeWithTag(8, value.cancel_action) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag = SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction.ADAPTER.encodedSizeWithTag(7, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) primaryButtonAction).getValue());
                }
                encodedSizeWithTag4 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(10, value.legal_footer_text) + protoAdapter3.encodedSizeWithTag(9, value.cancel_button_text) + SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER.encodedSizeWithTag(8, value.cancel_action) + encodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SponsorSelectionDetailsBlocker redact(SponsorSelectionDetailsBlocker value) {
                value.getClass();
                FormBlocker.Element.AvatarElement avatarElement = value.sponsor_avatar;
                FormBlocker.Element.AvatarElement avatarElement2 = avatarElement != null ? (FormBlocker.Element.AvatarElement) FormBlocker.Element.AvatarElement.ADAPTER.redact(avatarElement) : null;
                FormBlocker.Element.TextElement textElement = value.title;
                FormBlocker.Element.TextElement textElement2 = textElement != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement) : null;
                FormBlocker.Element.TextElement textElement3 = value.subtitle;
                FormBlocker.Element.TextElement textElement4 = textElement3 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.sponsor_details, FormBlocker.Element.SelectableRowElement.ADAPTER);
                SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction cancelSponsorSelectionAction = value.cancel_action;
                SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction cancelSponsorSelectionAction2 = cancelSponsorSelectionAction != null ? (SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction) SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER.redact(cancelSponsorSelectionAction) : null;
                FormBlocker.Element.TextElement textElement5 = value.legal_footer_text;
                FormBlocker.Element.TextElement textElement6 = textElement5 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement5) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.primary_button_text;
                SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = value.primary_button_action;
                String str2 = value.cancel_button_text;
                byteString.getClass();
                return new SponsorSelectionDetailsBlocker(avatarElement2, textElement2, textElement4, m1169redactElements, str, primaryButtonAction, cancelSponsorSelectionAction2, str2, textElement6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SponsorSelectionDetailsBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = value.primary_button_action;
                if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) {
                    SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodeWithTag(writer, 6, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) primaryButtonAction).getValue());
                } else if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) {
                    SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction.ADAPTER.encodeWithTag(writer, 7, ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) primaryButtonAction).getValue());
                } else if (primaryButtonAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 10, value.legal_footer_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 9, value.cancel_button_text);
                SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.ADAPTER.encodeWithTag(writer, 8, value.cancel_action);
                protoAdapter3.encodeWithTag(writer, 5, value.primary_button_text);
                FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.sponsor_details);
                protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                FormBlocker.Element.AvatarElement.ADAPTER.encodeWithTag(writer, 1, value.sponsor_avatar);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorSelectionDetailsBlocker(FormBlocker.Element.AvatarElement avatarElement, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, List list, String str, PrimaryButtonAction primaryButtonAction, CancelSponsorSelectionAction cancelSponsorSelectionAction, String str2, FormBlocker.Element.TextElement textElement3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sponsor_avatar = avatarElement;
        this.title = textElement;
        this.subtitle = textElement2;
        this.primary_button_text = str;
        this.primary_button_action = primaryButtonAction;
        this.cancel_action = cancelSponsorSelectionAction;
        this.cancel_button_text = str2;
        this.legal_footer_text = textElement3;
        this.sponsor_details = TransactorKt.immutableCopyOf("sponsor_details", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SponsorSelectionDetailsBlocker)) {
            return false;
        }
        SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker = (SponsorSelectionDetailsBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), sponsorSelectionDetailsBlocker.unknownFields()) && Intrinsics.areEqual(this.sponsor_avatar, sponsorSelectionDetailsBlocker.sponsor_avatar) && Intrinsics.areEqual(this.title, sponsorSelectionDetailsBlocker.title) && Intrinsics.areEqual(this.subtitle, sponsorSelectionDetailsBlocker.subtitle) && Intrinsics.areEqual(this.sponsor_details, sponsorSelectionDetailsBlocker.sponsor_details) && Intrinsics.areEqual(this.primary_button_text, sponsorSelectionDetailsBlocker.primary_button_text) && Intrinsics.areEqual(this.primary_button_action, sponsorSelectionDetailsBlocker.primary_button_action) && Intrinsics.areEqual(this.cancel_action, sponsorSelectionDetailsBlocker.cancel_action) && Intrinsics.areEqual(this.cancel_button_text, sponsorSelectionDetailsBlocker.cancel_button_text) && Intrinsics.areEqual(this.legal_footer_text, sponsorSelectionDetailsBlocker.legal_footer_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FormBlocker.Element.AvatarElement avatarElement = this.sponsor_avatar;
        int hashCode2 = (hashCode + (avatarElement != null ? avatarElement.hashCode() : 0)) * 37;
        FormBlocker.Element.TextElement textElement = this.title;
        int hashCode3 = (hashCode2 + (textElement != null ? textElement.hashCode() : 0)) * 37;
        FormBlocker.Element.TextElement textElement2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (textElement2 != null ? textElement2.hashCode() : 0)) * 37, 37, this.sponsor_details);
        String str = this.primary_button_text;
        int hashCode4 = (m + (str != null ? str.hashCode() : 0)) * 37;
        PrimaryButtonAction primaryButtonAction = this.primary_button_action;
        int hashCode5 = (hashCode4 + (primaryButtonAction != null ? primaryButtonAction.hashCode() : 0)) * 37;
        CancelSponsorSelectionAction cancelSponsorSelectionAction = this.cancel_action;
        int hashCode6 = (hashCode5 + (cancelSponsorSelectionAction != null ? cancelSponsorSelectionAction.hashCode() : 0)) * 37;
        String str2 = this.cancel_button_text;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FormBlocker.Element.TextElement textElement3 = this.legal_footer_text;
        int hashCode8 = hashCode7 + (textElement3 != null ? textElement3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sponsor_avatar = this.sponsor_avatar;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.sponsor_details = this.sponsor_details;
        builder.primary_button_text = this.primary_button_text;
        builder.primary_button_action = this.primary_button_action;
        builder.cancel_action = this.cancel_action;
        builder.cancel_button_text = this.cancel_button_text;
        builder.legal_footer_text = this.legal_footer_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FormBlocker.Element.AvatarElement avatarElement = this.sponsor_avatar;
        if (avatarElement != null) {
            arrayList.add("sponsor_avatar=" + avatarElement);
        }
        FormBlocker.Element.TextElement textElement = this.title;
        if (textElement != null) {
            arrayList.add("title=" + textElement);
        }
        FormBlocker.Element.TextElement textElement2 = this.subtitle;
        if (textElement2 != null) {
            arrayList.add("subtitle=" + textElement2);
        }
        if (!this.sponsor_details.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sponsor_details=", arrayList, this.sponsor_details);
        }
        String str = this.primary_button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_text=", arrayList);
        }
        PrimaryButtonAction primaryButtonAction = this.primary_button_action;
        if (primaryButtonAction != null) {
            arrayList.add("primary_button_action=" + primaryButtonAction);
        }
        CancelSponsorSelectionAction cancelSponsorSelectionAction = this.cancel_action;
        if (cancelSponsorSelectionAction != null) {
            arrayList.add("cancel_action=" + cancelSponsorSelectionAction);
        }
        String str2 = this.cancel_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cancel_button_text=", arrayList);
        }
        FormBlocker.Element.TextElement textElement3 = this.legal_footer_text;
        if (textElement3 != null) {
            arrayList.add("legal_footer_text=" + textElement3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SponsorSelectionDetailsBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction$Builder;", "invite_code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CancelSponsorSelectionAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CancelSponsorSelectionAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String invite_code;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "<init>", "()V", "invite_code", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String invite_code;

            @Override // com.squareup.wire.Message.Builder
            public CancelSponsorSelectionAction build() {
                return new CancelSponsorSelectionAction(this.invite_code, buildUnknownFields());
            }

            public final Builder invite_code(String invite_code) {
                this.invite_code = invite_code;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CancelSponsorSelectionAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.invite_code);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.invite_code) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction redact(SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction value) {
                    value.getClass();
                    return SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.invite_code);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CancelSponsorSelectionAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CancelSponsorSelectionAction copy$default(CancelSponsorSelectionAction cancelSponsorSelectionAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cancelSponsorSelectionAction.invite_code;
            }
            if ((i & 2) != 0) {
                byteString = cancelSponsorSelectionAction.unknownFields();
            }
            return cancelSponsorSelectionAction.copy(str, byteString);
        }

        public final CancelSponsorSelectionAction copy(String invite_code, ByteString unknownFields) {
            unknownFields.getClass();
            return new CancelSponsorSelectionAction(invite_code, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CancelSponsorSelectionAction)) {
                return false;
            }
            CancelSponsorSelectionAction cancelSponsorSelectionAction = (CancelSponsorSelectionAction) other;
            return Intrinsics.areEqual(unknownFields(), cancelSponsorSelectionAction.unknownFields()) && Intrinsics.areEqual(this.invite_code, cancelSponsorSelectionAction.invite_code);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.invite_code;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.invite_code = this.invite_code;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.invite_code;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invite_code=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CancelSponsorSelectionAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$CancelSponsorSelectionAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CancelSponsorSelectionAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CancelSponsorSelectionAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelSponsorSelectionAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.invite_code = str;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0006H\u0016J]\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Builder;", "selected_sponsor", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "invite_code", "", "is_added_to_favorites", "", "is_recommended_sponsor", "full_name", "is_cash_customer", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/UiCustomer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/franklin/ui/UiCustomer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConfirmSelectedSponsorAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmSelectedSponsorAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 6)
        public final String full_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
        public final String invite_code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 4)
        public final Boolean is_added_to_favorites;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 7)
        public final Boolean is_cash_customer;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 5)
        public final Boolean is_recommended_sponsor;

        @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", schemaIndex = 0, tag = 1)
        public final UiCustomer selected_sponsor;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "<init>", "()V", "selected_sponsor", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "invite_code", "", "is_added_to_favorites", "", "Ljava/lang/Boolean;", "is_recommended_sponsor", "full_name", "is_cash_customer", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String full_name;
            public String invite_code;
            public Boolean is_added_to_favorites;
            public Boolean is_cash_customer;
            public Boolean is_recommended_sponsor;
            public UiCustomer selected_sponsor;

            @Override // com.squareup.wire.Message.Builder
            public ConfirmSelectedSponsorAction build() {
                return new ConfirmSelectedSponsorAction(this.selected_sponsor, this.invite_code, this.is_added_to_favorites, this.is_recommended_sponsor, this.full_name, this.is_cash_customer, buildUnknownFields());
            }

            public final Builder full_name(String full_name) {
                this.full_name = full_name;
                return this;
            }

            public final Builder invite_code(String invite_code) {
                this.invite_code = invite_code;
                return this;
            }

            public final Builder is_added_to_favorites(Boolean is_added_to_favorites) {
                this.is_added_to_favorites = is_added_to_favorites;
                return this;
            }

            public final Builder is_cash_customer(Boolean is_cash_customer) {
                this.is_cash_customer = is_cash_customer;
                return this;
            }

            public final Builder is_recommended_sponsor(Boolean is_recommended_sponsor) {
                this.is_recommended_sponsor = is_recommended_sponsor;
                return this;
            }

            public final Builder selected_sponsor(UiCustomer selected_sponsor) {
                this.selected_sponsor = selected_sponsor;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmSelectedSponsorAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction decode(ProtoReader reader) {
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
                            return new SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction((UiCustomer) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, (String) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, reader, obj);
                        } else if (nextTag == 3) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag == 5) {
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag == 6) {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 7) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj6 = ProtoAdapter.BOOL.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction value) {
                    writer.getClass();
                    value.getClass();
                    UiCustomer.ADAPTER.encodeWithTag(writer, 1, value.selected_sponsor);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.invite_code);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    protoAdapter3.encodeWithTag(writer, 4, value.is_added_to_favorites);
                    protoAdapter3.encodeWithTag(writer, 5, value.is_recommended_sponsor);
                    protoAdapter2.encodeWithTag(writer, 6, value.full_name);
                    protoAdapter3.encodeWithTag(writer, 7, value.is_cash_customer);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction value) {
                    value.getClass();
                    int encodedSizeWithTag = UiCustomer.ADAPTER.encodedSizeWithTag(1, value.selected_sponsor) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, value.invite_code) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    return protoAdapter3.encodedSizeWithTag(7, value.is_cash_customer) + protoAdapter2.encodedSizeWithTag(6, value.full_name) + protoAdapter3.encodedSizeWithTag(5, value.is_recommended_sponsor) + protoAdapter3.encodedSizeWithTag(4, value.is_added_to_favorites) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction redact(SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction value) {
                    value.getClass();
                    UiCustomer uiCustomer = value.selected_sponsor;
                    return SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.copy$default(value, uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null, null, null, null, null, null, ByteString.EMPTY, 46, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 7, value.is_cash_customer);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 6, value.full_name);
                    protoAdapter2.encodeWithTag(writer, 5, value.is_recommended_sponsor);
                    protoAdapter2.encodeWithTag(writer, 4, value.is_added_to_favorites);
                    protoAdapter3.encodeWithTag(writer, 3, value.invite_code);
                    UiCustomer.ADAPTER.encodeWithTag(writer, 1, value.selected_sponsor);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConfirmSelectedSponsorAction(UiCustomer uiCustomer, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiCustomer, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConfirmSelectedSponsorAction copy$default(ConfirmSelectedSponsorAction confirmSelectedSponsorAction, UiCustomer uiCustomer, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCustomer = confirmSelectedSponsorAction.selected_sponsor;
            }
            if ((i & 2) != 0) {
                str = confirmSelectedSponsorAction.invite_code;
            }
            if ((i & 4) != 0) {
                bool = confirmSelectedSponsorAction.is_added_to_favorites;
            }
            if ((i & 8) != 0) {
                bool2 = confirmSelectedSponsorAction.is_recommended_sponsor;
            }
            if ((i & 16) != 0) {
                str2 = confirmSelectedSponsorAction.full_name;
            }
            if ((i & 32) != 0) {
                bool3 = confirmSelectedSponsorAction.is_cash_customer;
            }
            if ((i & 64) != 0) {
                byteString = confirmSelectedSponsorAction.unknownFields();
            }
            Boolean bool4 = bool3;
            ByteString byteString2 = byteString;
            String str3 = str2;
            Boolean bool5 = bool;
            return confirmSelectedSponsorAction.copy(uiCustomer, str, bool5, bool2, str3, bool4, byteString2);
        }

        public final ConfirmSelectedSponsorAction copy(UiCustomer selected_sponsor, String invite_code, Boolean is_added_to_favorites, Boolean is_recommended_sponsor, String full_name, Boolean is_cash_customer, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConfirmSelectedSponsorAction(selected_sponsor, invite_code, is_added_to_favorites, is_recommended_sponsor, full_name, is_cash_customer, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConfirmSelectedSponsorAction)) {
                return false;
            }
            ConfirmSelectedSponsorAction confirmSelectedSponsorAction = (ConfirmSelectedSponsorAction) other;
            return Intrinsics.areEqual(unknownFields(), confirmSelectedSponsorAction.unknownFields()) && Intrinsics.areEqual(this.selected_sponsor, confirmSelectedSponsorAction.selected_sponsor) && Intrinsics.areEqual(this.invite_code, confirmSelectedSponsorAction.invite_code) && Intrinsics.areEqual(this.is_added_to_favorites, confirmSelectedSponsorAction.is_added_to_favorites) && Intrinsics.areEqual(this.is_recommended_sponsor, confirmSelectedSponsorAction.is_recommended_sponsor) && Intrinsics.areEqual(this.full_name, confirmSelectedSponsorAction.full_name) && Intrinsics.areEqual(this.is_cash_customer, confirmSelectedSponsorAction.is_cash_customer);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiCustomer uiCustomer = this.selected_sponsor;
            int hashCode2 = (hashCode + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37;
            String str = this.invite_code;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.is_added_to_favorites;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_recommended_sponsor;
            int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str2 = this.full_name;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool3 = this.is_cash_customer;
            int hashCode7 = hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.selected_sponsor = this.selected_sponsor;
            builder.invite_code = this.invite_code;
            builder.is_added_to_favorites = this.is_added_to_favorites;
            builder.is_recommended_sponsor = this.is_recommended_sponsor;
            builder.full_name = this.full_name;
            builder.is_cash_customer = this.is_cash_customer;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            UiCustomer uiCustomer = this.selected_sponsor;
            if (uiCustomer != null) {
                arrayList.add("selected_sponsor=" + uiCustomer);
            }
            String str = this.invite_code;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invite_code=", arrayList);
            }
            Boolean bool = this.is_added_to_favorites;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_added_to_favorites=", bool, arrayList);
            }
            Boolean bool2 = this.is_recommended_sponsor;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_recommended_sponsor=", bool2, arrayList);
            }
            if (this.full_name != null) {
                arrayList.add("full_name=██");
            }
            Boolean bool3 = this.is_cash_customer;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmSelectedSponsorAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConfirmSelectedSponsorAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ConfirmSelectedSponsorAction() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmSelectedSponsorAction(UiCustomer uiCustomer, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.selected_sponsor = uiCustomer;
            this.invite_code = str;
            this.is_added_to_favorites = bool;
            this.is_recommended_sponsor = bool2;
            this.full_name = str2;
            this.is_cash_customer = bool3;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction$Builder;", "selected_sponsor_sms_number", "", "message", "action_after_sending_sms", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SendSelectedSponsorSmsAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SendSelectedSponsorSmsAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction#ADAPTER", schemaIndex = 2, tag = 3)
        public final ConfirmSelectedSponsorAction action_after_sending_sms;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String message;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String selected_sponsor_sms_number;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "<init>", "()V", "selected_sponsor_sms_number", "", "message", "action_after_sending_sms", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ConfirmSelectedSponsorAction action_after_sending_sms;
            public String message;
            public String selected_sponsor_sms_number;

            public final Builder action_after_sending_sms(ConfirmSelectedSponsorAction action_after_sending_sms) {
                this.action_after_sending_sms = action_after_sending_sms;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public SendSelectedSponsorSmsAction build() {
                return new SendSelectedSponsorSmsAction(this.selected_sponsor_sms_number, this.message, this.action_after_sending_sms, buildUnknownFields());
            }

            public final Builder message(String message) {
                this.message = message;
                return this;
            }

            public final Builder selected_sponsor_sms_number(String selected_sponsor_sms_number) {
                this.selected_sponsor_sms_number = selected_sponsor_sms_number;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendSelectedSponsorSmsAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction((String) obj, (String) obj2, (SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.selected_sponsor_sms_number);
                    protoAdapter2.encodeWithTag(writer, 2, value.message);
                    SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodeWithTag(writer, 3, value.action_after_sending_sms);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodedSizeWithTag(3, value.action_after_sending_sms) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.selected_sponsor_sms_number) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction redact(SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction value) {
                    value.getClass();
                    SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction confirmSelectedSponsorAction = value.action_after_sending_sms;
                    return value.copy(null, null, confirmSelectedSponsorAction != null ? (SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction) SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.redact(confirmSelectedSponsorAction) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.ADAPTER.encodeWithTag(writer, 3, value.action_after_sending_sms);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.message);
                    protoAdapter2.encodeWithTag(writer, 1, value.selected_sponsor_sms_number);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SendSelectedSponsorSmsAction(String str, String str2, ConfirmSelectedSponsorAction confirmSelectedSponsorAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : confirmSelectedSponsorAction, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SendSelectedSponsorSmsAction copy$default(SendSelectedSponsorSmsAction sendSelectedSponsorSmsAction, String str, String str2, ConfirmSelectedSponsorAction confirmSelectedSponsorAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sendSelectedSponsorSmsAction.selected_sponsor_sms_number;
            }
            if ((i & 2) != 0) {
                str2 = sendSelectedSponsorSmsAction.message;
            }
            if ((i & 4) != 0) {
                confirmSelectedSponsorAction = sendSelectedSponsorSmsAction.action_after_sending_sms;
            }
            if ((i & 8) != 0) {
                byteString = sendSelectedSponsorSmsAction.unknownFields();
            }
            return sendSelectedSponsorSmsAction.copy(str, str2, confirmSelectedSponsorAction, byteString);
        }

        public final SendSelectedSponsorSmsAction copy(String selected_sponsor_sms_number, String message, ConfirmSelectedSponsorAction action_after_sending_sms, ByteString unknownFields) {
            unknownFields.getClass();
            return new SendSelectedSponsorSmsAction(selected_sponsor_sms_number, message, action_after_sending_sms, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SendSelectedSponsorSmsAction)) {
                return false;
            }
            SendSelectedSponsorSmsAction sendSelectedSponsorSmsAction = (SendSelectedSponsorSmsAction) other;
            return Intrinsics.areEqual(unknownFields(), sendSelectedSponsorSmsAction.unknownFields()) && Intrinsics.areEqual(this.selected_sponsor_sms_number, sendSelectedSponsorSmsAction.selected_sponsor_sms_number) && Intrinsics.areEqual(this.message, sendSelectedSponsorSmsAction.message) && Intrinsics.areEqual(this.action_after_sending_sms, sendSelectedSponsorSmsAction.action_after_sending_sms);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.selected_sponsor_sms_number;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ConfirmSelectedSponsorAction confirmSelectedSponsorAction = this.action_after_sending_sms;
            int hashCode4 = hashCode3 + (confirmSelectedSponsorAction != null ? confirmSelectedSponsorAction.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.selected_sponsor_sms_number = this.selected_sponsor_sms_number;
            builder.message = this.message;
            builder.action_after_sending_sms = this.action_after_sending_sms;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.selected_sponsor_sms_number != null) {
                arrayList.add("selected_sponsor_sms_number=██");
            }
            if (this.message != null) {
                arrayList.add("message=██");
            }
            ConfirmSelectedSponsorAction confirmSelectedSponsorAction = this.action_after_sending_sms;
            if (confirmSelectedSponsorAction != null) {
                arrayList.add("action_after_sending_sms=" + confirmSelectedSponsorAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SendSelectedSponsorSmsAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SendSelectedSponsorSmsAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SendSelectedSponsorSmsAction() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendSelectedSponsorSmsAction(String str, String str2, ConfirmSelectedSponsorAction confirmSelectedSponsorAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.selected_sponsor_sms_number = str;
            this.message = str2;
            this.action_after_sending_sms = confirmSelectedSponsorAction;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SponsorSelectionDetailsBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "", "<init>", "()V", "ConfirmAction", "SendSmsAction", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction$ConfirmAction;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction$SendSmsAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class PrimaryButtonAction {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction#ADAPTER", declaredName = "confirm_action", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction$ConfirmAction;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "value", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "<init>", "(Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$ConfirmSelectedSponsorAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmAction extends PrimaryButtonAction {
            private final ConfirmSelectedSponsorAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmAction(ConfirmSelectedSponsorAction confirmSelectedSponsorAction) {
                super(null);
                confirmSelectedSponsorAction.getClass();
                this.value = confirmSelectedSponsorAction;
            }

            public static /* synthetic */ ConfirmAction copy$default(ConfirmAction confirmAction, ConfirmSelectedSponsorAction confirmSelectedSponsorAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmSelectedSponsorAction = confirmAction.value;
                }
                return confirmAction.copy(confirmSelectedSponsorAction);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmSelectedSponsorAction getValue() {
                return this.value;
            }

            public final ConfirmAction copy(ConfirmSelectedSponsorAction value) {
                value.getClass();
                return new ConfirmAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmAction) && Intrinsics.areEqual(this.value, ((ConfirmAction) other).value);
            }

            public final ConfirmSelectedSponsorAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConfirmAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction#ADAPTER", declaredName = "send_sms_action", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction$SendSmsAction;", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$PrimaryButtonAction;", "value", "Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "<init>", "(Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/SponsorSelectionDetailsBlocker$SendSelectedSponsorSmsAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SendSmsAction extends PrimaryButtonAction {
            private final SendSelectedSponsorSmsAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendSmsAction(SendSelectedSponsorSmsAction sendSelectedSponsorSmsAction) {
                super(null);
                sendSelectedSponsorSmsAction.getClass();
                this.value = sendSelectedSponsorSmsAction;
            }

            public static /* synthetic */ SendSmsAction copy$default(SendSmsAction sendSmsAction, SendSelectedSponsorSmsAction sendSelectedSponsorSmsAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    sendSelectedSponsorSmsAction = sendSmsAction.value;
                }
                return sendSmsAction.copy(sendSelectedSponsorSmsAction);
            }

            /* renamed from: component1, reason: from getter */
            public final SendSelectedSponsorSmsAction getValue() {
                return this.value;
            }

            public final SendSmsAction copy(SendSelectedSponsorSmsAction value) {
                value.getClass();
                return new SendSmsAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendSmsAction) && Intrinsics.areEqual(this.value, ((SendSmsAction) other).value);
            }

            public final SendSelectedSponsorSmsAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SendSmsAction(value=" + this.value + ")";
            }
        }

        public /* synthetic */ PrimaryButtonAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PrimaryButtonAction() {
        }
    }
}
