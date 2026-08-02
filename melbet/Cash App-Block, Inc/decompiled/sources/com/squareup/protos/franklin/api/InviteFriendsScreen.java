package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen$Builder;", "", "treatment", "Ljava/lang/String;", "invite_contact_button_text", "invited_contact_toast_subtitle", "contact_access_request_text", "contact_access_request_button_text", "send_invite_button_text", "header_text", "Lcom/squareup/protos/franklin/api/SharingContent;", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "button_order", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "enable_referral_text", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "Lcom/squareup/protos/franklin/api/PromotionUpsell;", "promotion_upsell", "Lcom/squareup/protos/franklin/api/PromotionUpsell;", "", "Lcom/squareup/protos/franklin/api/CountryText;", "sms_text_by_country", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InviteFriendsScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteFriendsScreen> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.InviteFriendsBlockerButtonOrder#ADAPTER", schemaIndex = 9, tag = 10)
    public final InviteFriendsBlockerButtonOrder button_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String contact_access_request_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String contact_access_request_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.InviteFriendsEnableReferralText#ADAPTER", schemaIndex = 10, tag = 11)
    public final InviteFriendsEnableReferralText enable_referral_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String invite_contact_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String invited_contact_toast_subtitle;

    @WireField(adapter = "com.squareup.protos.franklin.api.PromotionUpsell#ADAPTER", schemaIndex = 11, tag = 12)
    public final PromotionUpsell promotion_upsell;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String send_invite_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.SharingContent#ADAPTER", schemaIndex = 8, tag = 9)
    public final SharingContent sharing_content;

    @WireField(adapter = "com.squareup.protos.franklin.api.CountryText#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<CountryText> sms_text_by_country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String treatment;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "<init>", "()V", "treatment", "", "sms_text_by_country", "", "Lcom/squareup/protos/franklin/api/CountryText;", "invite_contact_button_text", "invited_contact_toast_subtitle", "contact_access_request_text", "contact_access_request_button_text", "send_invite_button_text", "header_text", "sharing_content", "Lcom/squareup/protos/franklin/api/SharingContent;", "button_order", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "enable_referral_text", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "promotion_upsell", "Lcom/squareup/protos/franklin/api/PromotionUpsell;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public InviteFriendsBlockerButtonOrder button_order;
        public String contact_access_request_button_text;
        public String contact_access_request_text;
        public InviteFriendsEnableReferralText enable_referral_text;
        public String header_text;
        public String invite_contact_button_text;
        public String invited_contact_toast_subtitle;
        public PromotionUpsell promotion_upsell;
        public String send_invite_button_text;
        public SharingContent sharing_content;
        public List<CountryText> sms_text_by_country = EmptyList.INSTANCE;
        public String treatment;

        @Override // com.squareup.wire.Message.Builder
        public InviteFriendsScreen build() {
            return new InviteFriendsScreen(this.treatment, this.sms_text_by_country, this.invite_contact_button_text, this.invited_contact_toast_subtitle, this.contact_access_request_text, this.contact_access_request_button_text, this.send_invite_button_text, this.header_text, this.sharing_content, this.button_order, this.enable_referral_text, this.promotion_upsell, buildUnknownFields());
        }

        public final Builder button_order(InviteFriendsBlockerButtonOrder button_order) {
            this.button_order = button_order;
            return this;
        }

        public final Builder contact_access_request_button_text(String contact_access_request_button_text) {
            this.contact_access_request_button_text = contact_access_request_button_text;
            return this;
        }

        public final Builder contact_access_request_text(String contact_access_request_text) {
            this.contact_access_request_text = contact_access_request_text;
            return this;
        }

        public final Builder enable_referral_text(InviteFriendsEnableReferralText enable_referral_text) {
            this.enable_referral_text = enable_referral_text;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder invite_contact_button_text(String invite_contact_button_text) {
            this.invite_contact_button_text = invite_contact_button_text;
            return this;
        }

        public final Builder invited_contact_toast_subtitle(String invited_contact_toast_subtitle) {
            this.invited_contact_toast_subtitle = invited_contact_toast_subtitle;
            return this;
        }

        public final Builder promotion_upsell(PromotionUpsell promotion_upsell) {
            this.promotion_upsell = promotion_upsell;
            return this;
        }

        public final Builder send_invite_button_text(String send_invite_button_text) {
            this.send_invite_button_text = send_invite_button_text;
            return this;
        }

        public final Builder sharing_content(SharingContent sharing_content) {
            this.sharing_content = sharing_content;
            return this;
        }

        public final Builder sms_text_by_country(List<CountryText> sms_text_by_country) {
            sms_text_by_country.getClass();
            TransactorKt.checkElementsNotNull(sms_text_by_country);
            this.sms_text_by_country = sms_text_by_country;
            return this;
        }

        public final Builder treatment(String treatment) {
            this.treatment = treatment;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InviteFriendsScreen.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.InviteFriendsScreen$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29 */
            /* JADX WARN: Type inference failed for: r0v32 */
            /* JADX WARN: Type inference failed for: r0v33 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsScreen decode(ProtoReader reader) {
                String str;
                String str2;
                String str3;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Object obj = null;
                InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InviteFriendsScreen(str4, m, str5, str6, str7, str8, str9, str10, (SharingContent) obj, inviteFriendsBlockerButtonOrder, (InviteFriendsEnableReferralText) obj2, (PromotionUpsell) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            m.add(CountryText.ADAPTER.decode(reader));
                            decode = str4;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
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
                            obj = TransactorKt.decodeMessageOrMerge(SharingContent.ADAPTER, reader, obj);
                            decode = str4;
                            break;
                        case 10:
                            try {
                                inviteFriendsBlockerButtonOrder = InviteFriendsBlockerButtonOrder.ADAPTER.decode(reader);
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                str = str5;
                                str2 = str6;
                                str3 = str7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            obj2 = TransactorKt.decodeMessageOrMerge(InviteFriendsEnableReferralText.ADAPTER, reader, obj2);
                            decode = str4;
                            break;
                        case 12:
                            obj3 = TransactorKt.decodeMessageOrMerge(PromotionUpsell.ADAPTER, reader, obj3);
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
            public void encode(ProtoWriter writer, InviteFriendsScreen value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.treatment);
                CountryText.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sms_text_by_country);
                protoAdapter2.encodeWithTag(writer, 3, value.invite_contact_button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.invited_contact_toast_subtitle);
                protoAdapter2.encodeWithTag(writer, 5, value.contact_access_request_text);
                protoAdapter2.encodeWithTag(writer, 6, value.contact_access_request_button_text);
                protoAdapter2.encodeWithTag(writer, 7, value.send_invite_button_text);
                protoAdapter2.encodeWithTag(writer, 8, value.header_text);
                SharingContent.ADAPTER.encodeWithTag(writer, 9, value.sharing_content);
                InviteFriendsBlockerButtonOrder.ADAPTER.encodeWithTag(writer, 10, value.button_order);
                InviteFriendsEnableReferralText.ADAPTER.encodeWithTag(writer, 11, value.enable_referral_text);
                PromotionUpsell.ADAPTER.encodeWithTag(writer, 12, value.promotion_upsell);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InviteFriendsScreen value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return PromotionUpsell.ADAPTER.encodedSizeWithTag(12, value.promotion_upsell) + InviteFriendsEnableReferralText.ADAPTER.encodedSizeWithTag(11, value.enable_referral_text) + InviteFriendsBlockerButtonOrder.ADAPTER.encodedSizeWithTag(10, value.button_order) + SharingContent.ADAPTER.encodedSizeWithTag(9, value.sharing_content) + protoAdapter2.encodedSizeWithTag(8, value.header_text) + protoAdapter2.encodedSizeWithTag(7, value.send_invite_button_text) + protoAdapter2.encodedSizeWithTag(6, value.contact_access_request_button_text) + protoAdapter2.encodedSizeWithTag(5, value.contact_access_request_text) + protoAdapter2.encodedSizeWithTag(4, value.invited_contact_toast_subtitle) + protoAdapter2.encodedSizeWithTag(3, value.invite_contact_button_text) + CountryText.ADAPTER.asRepeated().encodedSizeWithTag(2, value.sms_text_by_country) + protoAdapter2.encodedSizeWithTag(1, value.treatment) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsScreen redact(InviteFriendsScreen value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.sms_text_by_country, CountryText.ADAPTER);
                SharingContent sharingContent = value.sharing_content;
                SharingContent sharingContent2 = sharingContent != null ? (SharingContent) SharingContent.ADAPTER.redact(sharingContent) : null;
                InviteFriendsEnableReferralText inviteFriendsEnableReferralText = value.enable_referral_text;
                InviteFriendsEnableReferralText inviteFriendsEnableReferralText2 = inviteFriendsEnableReferralText != null ? (InviteFriendsEnableReferralText) InviteFriendsEnableReferralText.ADAPTER.redact(inviteFriendsEnableReferralText) : null;
                PromotionUpsell promotionUpsell = value.promotion_upsell;
                PromotionUpsell promotionUpsell2 = promotionUpsell != null ? (PromotionUpsell) PromotionUpsell.ADAPTER.redact(promotionUpsell) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.treatment;
                String str2 = value.invite_contact_button_text;
                String str3 = value.invited_contact_toast_subtitle;
                String str4 = value.contact_access_request_text;
                String str5 = value.contact_access_request_button_text;
                String str6 = value.send_invite_button_text;
                String str7 = value.header_text;
                InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = value.button_order;
                byteString.getClass();
                return new InviteFriendsScreen(str, m1169redactElements, str2, str3, str4, str5, str6, str7, sharingContent2, inviteFriendsBlockerButtonOrder, inviteFriendsEnableReferralText2, promotionUpsell2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InviteFriendsScreen value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PromotionUpsell.ADAPTER.encodeWithTag(writer, 12, value.promotion_upsell);
                InviteFriendsEnableReferralText.ADAPTER.encodeWithTag(writer, 11, value.enable_referral_text);
                InviteFriendsBlockerButtonOrder.ADAPTER.encodeWithTag(writer, 10, value.button_order);
                SharingContent.ADAPTER.encodeWithTag(writer, 9, value.sharing_content);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.header_text);
                protoAdapter2.encodeWithTag(writer, 7, value.send_invite_button_text);
                protoAdapter2.encodeWithTag(writer, 6, value.contact_access_request_button_text);
                protoAdapter2.encodeWithTag(writer, 5, value.contact_access_request_text);
                protoAdapter2.encodeWithTag(writer, 4, value.invited_contact_toast_subtitle);
                protoAdapter2.encodeWithTag(writer, 3, value.invite_contact_button_text);
                CountryText.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.sms_text_by_country);
                protoAdapter2.encodeWithTag(writer, 1, value.treatment);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsScreen(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, SharingContent sharingContent, InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder, InviteFriendsEnableReferralText inviteFriendsEnableReferralText, PromotionUpsell promotionUpsell, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.treatment = str;
        this.invite_contact_button_text = str2;
        this.invited_contact_toast_subtitle = str3;
        this.contact_access_request_text = str4;
        this.contact_access_request_button_text = str5;
        this.send_invite_button_text = str6;
        this.header_text = str7;
        this.sharing_content = sharingContent;
        this.button_order = inviteFriendsBlockerButtonOrder;
        this.enable_referral_text = inviteFriendsEnableReferralText;
        this.promotion_upsell = promotionUpsell;
        this.sms_text_by_country = TransactorKt.immutableCopyOf("sms_text_by_country", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteFriendsScreen)) {
            return false;
        }
        InviteFriendsScreen inviteFriendsScreen = (InviteFriendsScreen) obj;
        return Intrinsics.areEqual(unknownFields(), inviteFriendsScreen.unknownFields()) && Intrinsics.areEqual(this.treatment, inviteFriendsScreen.treatment) && Intrinsics.areEqual(this.sms_text_by_country, inviteFriendsScreen.sms_text_by_country) && Intrinsics.areEqual(this.invite_contact_button_text, inviteFriendsScreen.invite_contact_button_text) && Intrinsics.areEqual(this.invited_contact_toast_subtitle, inviteFriendsScreen.invited_contact_toast_subtitle) && Intrinsics.areEqual(this.contact_access_request_text, inviteFriendsScreen.contact_access_request_text) && Intrinsics.areEqual(this.contact_access_request_button_text, inviteFriendsScreen.contact_access_request_button_text) && Intrinsics.areEqual(this.send_invite_button_text, inviteFriendsScreen.send_invite_button_text) && Intrinsics.areEqual(this.header_text, inviteFriendsScreen.header_text) && Intrinsics.areEqual(this.sharing_content, inviteFriendsScreen.sharing_content) && this.button_order == inviteFriendsScreen.button_order && Intrinsics.areEqual(this.enable_referral_text, inviteFriendsScreen.enable_referral_text) && Intrinsics.areEqual(this.promotion_upsell, inviteFriendsScreen.promotion_upsell);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.treatment;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sms_text_by_country);
        String str2 = this.invite_contact_button_text;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.invited_contact_toast_subtitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.contact_access_request_text;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.contact_access_request_button_text;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.send_invite_button_text;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.header_text;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        SharingContent sharingContent = this.sharing_content;
        int hashCode8 = (hashCode7 + (sharingContent != null ? sharingContent.hashCode() : 0)) * 37;
        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = this.button_order;
        int hashCode9 = (hashCode8 + (inviteFriendsBlockerButtonOrder != null ? inviteFriendsBlockerButtonOrder.hashCode() : 0)) * 37;
        InviteFriendsEnableReferralText inviteFriendsEnableReferralText = this.enable_referral_text;
        int hashCode10 = (hashCode9 + (inviteFriendsEnableReferralText != null ? inviteFriendsEnableReferralText.hashCode() : 0)) * 37;
        PromotionUpsell promotionUpsell = this.promotion_upsell;
        int hashCode11 = hashCode10 + (promotionUpsell != null ? promotionUpsell.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.treatment = this.treatment;
        builder.sms_text_by_country = this.sms_text_by_country;
        builder.invite_contact_button_text = this.invite_contact_button_text;
        builder.invited_contact_toast_subtitle = this.invited_contact_toast_subtitle;
        builder.contact_access_request_text = this.contact_access_request_text;
        builder.contact_access_request_button_text = this.contact_access_request_button_text;
        builder.send_invite_button_text = this.send_invite_button_text;
        builder.header_text = this.header_text;
        builder.sharing_content = this.sharing_content;
        builder.button_order = this.button_order;
        builder.enable_referral_text = this.enable_referral_text;
        builder.promotion_upsell = this.promotion_upsell;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.treatment;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "treatment=", arrayList);
        }
        if (!this.sms_text_by_country.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sms_text_by_country=", arrayList, this.sms_text_by_country);
        }
        String str2 = this.invite_contact_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "invite_contact_button_text=", arrayList);
        }
        String str3 = this.invited_contact_toast_subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "invited_contact_toast_subtitle=", arrayList);
        }
        String str4 = this.contact_access_request_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "contact_access_request_text=", arrayList);
        }
        String str5 = this.contact_access_request_button_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "contact_access_request_button_text=", arrayList);
        }
        String str6 = this.send_invite_button_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "send_invite_button_text=", arrayList);
        }
        String str7 = this.header_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "header_text=", arrayList);
        }
        SharingContent sharingContent = this.sharing_content;
        if (sharingContent != null) {
            arrayList.add("sharing_content=" + sharingContent);
        }
        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = this.button_order;
        if (inviteFriendsBlockerButtonOrder != null) {
            arrayList.add("button_order=" + inviteFriendsBlockerButtonOrder);
        }
        InviteFriendsEnableReferralText inviteFriendsEnableReferralText = this.enable_referral_text;
        if (inviteFriendsEnableReferralText != null) {
            arrayList.add("enable_referral_text=" + inviteFriendsEnableReferralText);
        }
        PromotionUpsell promotionUpsell = this.promotion_upsell;
        if (promotionUpsell != null) {
            arrayList.add("promotion_upsell=" + promotionUpsell);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteFriendsScreen{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InviteFriendsScreen build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
