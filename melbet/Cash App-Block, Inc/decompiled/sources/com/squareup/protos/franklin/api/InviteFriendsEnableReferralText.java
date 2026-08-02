package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText$Builder;", "", "title", "Ljava/lang/String;", "subtitle", Footer.f1485type, "Lcom/squareup/protos/cash/ui/Image;", "image", "Lcom/squareup/protos/cash/ui/Image;", "", "image_width", "Ljava/lang/Integer;", "image_height", "", "redemption_steps", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InviteFriendsEnableReferralText extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteFriendsEnableReferralText> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String footer;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 4, tag = 5)
    public final Image image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 6, tag = 7)
    public final Integer image_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    public final Integer image_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<String> redemption_steps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "<init>", "()V", "title", "", "subtitle", "redemption_steps", "", Footer.f1485type, "image", "Lcom/squareup/protos/cash/ui/Image;", "image_width", "", "Ljava/lang/Integer;", "image_height", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String footer;
        public Image image;
        public Integer image_height;
        public Integer image_width;
        public List<String> redemption_steps = EmptyList.INSTANCE;
        public String subtitle;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public InviteFriendsEnableReferralText build() {
            return new InviteFriendsEnableReferralText(this.title, this.subtitle, this.redemption_steps, this.footer, this.image, this.image_width, this.image_height, buildUnknownFields());
        }

        public final Builder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public final Builder image(Image image) {
            this.image = image;
            return this;
        }

        public final Builder image_height(Integer image_height) {
            this.image_height = image_height;
            return this;
        }

        public final Builder image_width(Integer image_width) {
            this.image_width = image_width;
            return this;
        }

        public final Builder redemption_steps(List<String> redemption_steps) {
            redemption_steps.getClass();
            TransactorKt.checkElementsNotNull(redemption_steps);
            this.redemption_steps = redemption_steps;
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
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InviteFriendsEnableReferralText.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.InviteFriendsEnableReferralText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsEnableReferralText decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                        return new InviteFriendsEnableReferralText((String) obj, (String) obj2, m, (String) obj3, (Image) obj4, (Integer) obj5, (Integer) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(ProtoAdapter.STRING.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InviteFriendsEnableReferralText value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, value.redemption_steps);
                protoAdapter2.encodeWithTag(writer, 4, value.footer);
                Image.ADAPTER.encodeWithTag(writer, 5, value.image);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 6, value.image_width);
                protoAdapter3.encodeWithTag(writer, 7, value.image_height);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InviteFriendsEnableReferralText value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(5, value.image) + protoAdapter2.encodedSizeWithTag(4, value.footer) + protoAdapter2.asRepeated().encodedSizeWithTag(3, value.redemption_steps) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter3.encodedSizeWithTag(7, value.image_height) + protoAdapter3.encodedSizeWithTag(6, value.image_width) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsEnableReferralText redact(InviteFriendsEnableReferralText value) {
                value.getClass();
                Image image = value.image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                List<String> list = value.redemption_steps;
                String str3 = value.footer;
                Integer num = value.image_width;
                Integer num2 = value.image_height;
                list.getClass();
                byteString.getClass();
                return new InviteFriendsEnableReferralText(str, str2, list, str3, image2, num, num2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InviteFriendsEnableReferralText value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 7, value.image_height);
                protoAdapter2.encodeWithTag(writer, 6, value.image_width);
                Image.ADAPTER.encodeWithTag(writer, 5, value.image);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.footer);
                protoAdapter3.asRepeated().encodeWithTag(writer, 3, value.redemption_steps);
                protoAdapter3.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsEnableReferralText(String str, String str2, List list, String str3, Image image, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.footer = str3;
        this.image = image;
        this.image_width = num;
        this.image_height = num2;
        this.redemption_steps = TransactorKt.immutableCopyOf("redemption_steps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteFriendsEnableReferralText)) {
            return false;
        }
        InviteFriendsEnableReferralText inviteFriendsEnableReferralText = (InviteFriendsEnableReferralText) obj;
        return Intrinsics.areEqual(unknownFields(), inviteFriendsEnableReferralText.unknownFields()) && Intrinsics.areEqual(this.title, inviteFriendsEnableReferralText.title) && Intrinsics.areEqual(this.subtitle, inviteFriendsEnableReferralText.subtitle) && Intrinsics.areEqual(this.redemption_steps, inviteFriendsEnableReferralText.redemption_steps) && Intrinsics.areEqual(this.footer, inviteFriendsEnableReferralText.footer) && Intrinsics.areEqual(this.image, inviteFriendsEnableReferralText.image) && Intrinsics.areEqual(this.image_width, inviteFriendsEnableReferralText.image_width) && Intrinsics.areEqual(this.image_height, inviteFriendsEnableReferralText.image_height);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.redemption_steps);
        String str3 = this.footer;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        Integer num = this.image_width;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.image_height;
        int hashCode6 = hashCode5 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.redemption_steps = this.redemption_steps;
        builder.footer = this.footer;
        builder.image = this.image;
        builder.image_width = this.image_width;
        builder.image_height = this.image_height;
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
        if (!this.redemption_steps.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redemption_steps=", arrayList, this.redemption_steps);
        }
        String str3 = this.footer;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "footer=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Integer num = this.image_width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("image_width=", num, arrayList);
        }
        Integer num2 = this.image_height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("image_height=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteFriendsEnableReferralText{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/InviteFriendsEnableReferralText;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InviteFriendsEnableReferralText build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
