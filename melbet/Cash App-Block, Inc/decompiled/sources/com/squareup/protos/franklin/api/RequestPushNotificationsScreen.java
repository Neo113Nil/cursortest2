package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.RequestPushNotificationsScreen;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0016\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/cash/ui/Image;", "icon", "Lcom/squareup/protos/cash/ui/Image;", "skip_button_text", "primary_button_text", "Lcom/squareup/protos/cash/ui/Icon;", "arcade_icon", "Lcom/squareup/protos/cash/ui/Icon;", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint;", "entry_point", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint;", "", "Lcom/squareup/protos/franklin/api/PushNotificationToggle;", "notification_toggles", "Ljava/util/List;", "Companion", "Builder", "EntryPoint", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequestPushNotificationsScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RequestPushNotificationsScreen> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 6)
    public final Icon arcade_icon;

    @WireField(adapter = "com.squareup.protos.franklin.api.RequestPushNotificationsScreen$EntryPoint#ADAPTER", schemaIndex = 6, tag = 7)
    public final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
    public final Image icon;

    @WireField(adapter = "com.squareup.protos.franklin.api.PushNotificationToggle#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<PushNotificationToggle> notification_toggles;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String primary_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String skip_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen;", "<init>", "()V", "title", "", "subtitle", "icon", "Lcom/squareup/protos/cash/ui/Image;", "skip_button_text", "primary_button_text", "arcade_icon", "Lcom/squareup/protos/cash/ui/Icon;", "entry_point", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint;", "notification_toggles", "", "Lcom/squareup/protos/franklin/api/PushNotificationToggle;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Icon arcade_icon;
        public EntryPoint entry_point;
        public Image icon;
        public List<PushNotificationToggle> notification_toggles = EmptyList.INSTANCE;
        public String primary_button_text;
        public String skip_button_text;
        public String subtitle;
        public String title;

        public final Builder arcade_icon(Icon arcade_icon) {
            this.arcade_icon = arcade_icon;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public RequestPushNotificationsScreen build() {
            return new RequestPushNotificationsScreen(this.title, this.subtitle, this.icon, this.skip_button_text, this.primary_button_text, this.arcade_icon, this.entry_point, this.notification_toggles, buildUnknownFields());
        }

        public final Builder entry_point(EntryPoint entry_point) {
            this.entry_point = entry_point;
            return this;
        }

        public final Builder icon(Image icon) {
            this.icon = icon;
            return this;
        }

        public final Builder notification_toggles(List<PushNotificationToggle> notification_toggles) {
            notification_toggles.getClass();
            TransactorKt.checkElementsNotNull(notification_toggles);
            this.notification_toggles = notification_toggles;
            return this;
        }

        public final Builder primary_button_text(String primary_button_text) {
            this.primary_button_text = primary_button_text;
            return this;
        }

        public final Builder skip_button_text(String skip_button_text) {
            this.skip_button_text = skip_button_text;
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
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RequestPushNotificationsScreen.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RequestPushNotificationsScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RequestPushNotificationsScreen decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                        return new RequestPushNotificationsScreen((String) obj, (String) obj2, (Image) obj3, (String) obj4, (String) obj5, (Icon) obj6, (RequestPushNotificationsScreen.EntryPoint) obj7, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            try {
                                obj7 = RequestPushNotificationsScreen.EntryPoint.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            m.add(PushNotificationToggle.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RequestPushNotificationsScreen value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                protoAdapter2.encodeWithTag(writer, 4, value.skip_button_text);
                protoAdapter2.encodeWithTag(writer, 5, value.primary_button_text);
                Icon.ADAPTER.encodeWithTag(writer, 6, value.arcade_icon);
                RequestPushNotificationsScreen.EntryPoint.ADAPTER.encodeWithTag(writer, 7, value.entry_point);
                PushNotificationToggle.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.notification_toggles);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RequestPushNotificationsScreen value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return PushNotificationToggle.ADAPTER.asRepeated().encodedSizeWithTag(8, value.notification_toggles) + RequestPushNotificationsScreen.EntryPoint.ADAPTER.encodedSizeWithTag(7, value.entry_point) + Icon.ADAPTER.encodedSizeWithTag(6, value.arcade_icon) + protoAdapter2.encodedSizeWithTag(5, value.primary_button_text) + protoAdapter2.encodedSizeWithTag(4, value.skip_button_text) + Image.ADAPTER.encodedSizeWithTag(3, value.icon) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RequestPushNotificationsScreen redact(RequestPushNotificationsScreen value) {
                value.getClass();
                Image image = value.icon;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                Icon icon = value.arcade_icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.notification_toggles, PushNotificationToggle.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.skip_button_text;
                String str4 = value.primary_button_text;
                RequestPushNotificationsScreen.EntryPoint entryPoint = value.entry_point;
                byteString.getClass();
                return new RequestPushNotificationsScreen(str, str2, image2, str3, str4, icon2, entryPoint, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RequestPushNotificationsScreen value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PushNotificationToggle.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.notification_toggles);
                RequestPushNotificationsScreen.EntryPoint.ADAPTER.encodeWithTag(writer, 7, value.entry_point);
                Icon.ADAPTER.encodeWithTag(writer, 6, value.arcade_icon);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.primary_button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.skip_button_text);
                Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPushNotificationsScreen(String str, String str2, Image image, String str3, String str4, Icon icon, EntryPoint entryPoint, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.icon = image;
        this.skip_button_text = str3;
        this.primary_button_text = str4;
        this.arcade_icon = icon;
        this.entry_point = entryPoint;
        this.notification_toggles = TransactorKt.immutableCopyOf("notification_toggles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestPushNotificationsScreen)) {
            return false;
        }
        RequestPushNotificationsScreen requestPushNotificationsScreen = (RequestPushNotificationsScreen) obj;
        return Intrinsics.areEqual(unknownFields(), requestPushNotificationsScreen.unknownFields()) && Intrinsics.areEqual(this.title, requestPushNotificationsScreen.title) && Intrinsics.areEqual(this.subtitle, requestPushNotificationsScreen.subtitle) && Intrinsics.areEqual(this.icon, requestPushNotificationsScreen.icon) && Intrinsics.areEqual(this.skip_button_text, requestPushNotificationsScreen.skip_button_text) && Intrinsics.areEqual(this.primary_button_text, requestPushNotificationsScreen.primary_button_text) && Intrinsics.areEqual(this.arcade_icon, requestPushNotificationsScreen.arcade_icon) && this.entry_point == requestPushNotificationsScreen.entry_point && Intrinsics.areEqual(this.notification_toggles, requestPushNotificationsScreen.notification_toggles);
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
        Image image = this.icon;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        String str3 = this.skip_button_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.primary_button_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Icon icon = this.arcade_icon;
        int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode8 = this.notification_toggles.hashCode() + ((hashCode7 + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.icon = this.icon;
        builder.skip_button_text = this.skip_button_text;
        builder.primary_button_text = this.primary_button_text;
        builder.arcade_icon = this.arcade_icon;
        builder.entry_point = this.entry_point;
        builder.notification_toggles = this.notification_toggles;
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
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        String str3 = this.skip_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "skip_button_text=", arrayList);
        }
        String str4 = this.primary_button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "primary_button_text=", arrayList);
        }
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        if (!this.notification_toggles.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("notification_toggles=", arrayList, this.notification_toggles);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestPushNotificationsScreen{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTIVITY_TAB", "POST_SIGN_IN", "P2P_SEND", "P2P_RECEIVE", "CARD_ORDER", "COLD_OPEN", "SETTINGS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final EntryPoint ACTIVITY_TAB = new EntryPoint("ACTIVITY_TAB", 0, 1);
        public static final EntryPoint POST_SIGN_IN = new EntryPoint("POST_SIGN_IN", 1, 2);
        public static final EntryPoint P2P_SEND = new EntryPoint("P2P_SEND", 2, 3);
        public static final EntryPoint P2P_RECEIVE = new EntryPoint("P2P_RECEIVE", 3, 4);
        public static final EntryPoint CARD_ORDER = new EntryPoint("CARD_ORDER", 4, 5);
        public static final EntryPoint COLD_OPEN = new EntryPoint("COLD_OPEN", 5, 6);
        public static final EntryPoint SETTINGS = new EntryPoint("SETTINGS", 6, 7);

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ACTIVITY_TAB, POST_SIGN_IN, P2P_SEND, P2P_RECEIVE, CARD_ORDER, COLD_OPEN, SETTINGS};
        }

        static {
            EntryPoint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RequestPushNotificationsScreen$EntryPoint$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public RequestPushNotificationsScreen.EntryPoint fromValue(int value) {
                    return RequestPushNotificationsScreen.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$EntryPoint;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EntryPoint fromValue(int value) {
                switch (value) {
                    case 1:
                        return EntryPoint.ACTIVITY_TAB;
                    case 2:
                        return EntryPoint.POST_SIGN_IN;
                    case 3:
                        return EntryPoint.P2P_SEND;
                    case 4:
                        return EntryPoint.P2P_RECEIVE;
                    case 5:
                        return EntryPoint.CARD_ORDER;
                    case 6:
                        return EntryPoint.COLD_OPEN;
                    case 7:
                        return EntryPoint.SETTINGS;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RequestPushNotificationsScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RequestPushNotificationsScreen build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
