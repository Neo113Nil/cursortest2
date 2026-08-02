package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ButtonDefault$Builder;", "Lsquareup/cash/ui/arcade/elements/ButtonProminence;", "button_prominence", "Lsquareup/cash/ui/arcade/elements/ButtonProminence;", "", "is_destructive", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/ui/Icon;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "", "tap_client_route", "Ljava/lang/String;", "Lsquareup/cash/analytics/CdfEvent;", "tap_client_route_template_cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonDefault extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonDefault> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ButtonProminence#ADAPTER", schemaIndex = 0, tag = 1)
    public final ButtonProminence button_prominence;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 3, tag = 4)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean is_destructive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String tap_client_route;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", schemaIndex = 5, tag = 6)
    public final CdfEvent tap_client_route_template_cdf_event;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString text;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ButtonDefault$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "<init>", "()V", "button_prominence", "Lsquareup/cash/ui/arcade/elements/ButtonProminence;", "is_destructive", "", "Ljava/lang/Boolean;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "tap_client_route", "", "tap_client_route_template_cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "(Ljava/lang/Boolean;)Lsquareup/cash/ui/arcade/elements/ButtonDefault$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ButtonProminence button_prominence;
        public Icon icon;
        public Boolean is_destructive;
        public String tap_client_route;
        public CdfEvent tap_client_route_template_cdf_event;
        public LocalizedString text;

        @Override // com.squareup.wire.Message.Builder
        public ButtonDefault build() {
            return new ButtonDefault(this.button_prominence, this.is_destructive, this.text, this.icon, this.tap_client_route, this.tap_client_route_template_cdf_event, buildUnknownFields());
        }

        public final Builder button_prominence(ButtonProminence button_prominence) {
            this.button_prominence = button_prominence;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder is_destructive(Boolean is_destructive) {
            this.is_destructive = is_destructive;
            return this;
        }

        public final Builder tap_client_route(String tap_client_route) {
            this.tap_client_route = tap_client_route;
            return this;
        }

        public final Builder tap_client_route_template_cdf_event(CdfEvent tap_client_route_template_cdf_event) {
            this.tap_client_route_template_cdf_event = tap_client_route_template_cdf_event;
            return this;
        }

        public final Builder text(LocalizedString text) {
            this.text = text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonDefault.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ButtonDefault$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ButtonDefault decode(ProtoReader reader) {
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
                        return new ButtonDefault((ButtonProminence) obj, (Boolean) obj2, (LocalizedString) obj3, (Icon) obj4, (String) obj5, (CdfEvent) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj = ButtonProminence.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, reader, obj6);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ButtonDefault value) {
                writer.getClass();
                value.getClass();
                ButtonProminence.ADAPTER.encodeWithTag(writer, 1, value.button_prominence);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_destructive);
                LocalizedString.ADAPTER.encodeWithTag(writer, 3, value.text);
                Icon.ADAPTER.encodeWithTag(writer, 4, value.icon);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.tap_client_route);
                CdfEvent.ADAPTER.encodeWithTag(writer, 6, value.tap_client_route_template_cdf_event);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ButtonDefault value) {
                value.getClass();
                return CdfEvent.ADAPTER.encodedSizeWithTag(6, value.tap_client_route_template_cdf_event) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.tap_client_route) + Icon.ADAPTER.encodedSizeWithTag(4, value.icon) + LocalizedString.ADAPTER.encodedSizeWithTag(3, value.text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.is_destructive) + ButtonProminence.ADAPTER.encodedSizeWithTag(1, value.button_prominence) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ButtonDefault redact(ButtonDefault value) {
                value.getClass();
                LocalizedString localizedString = value.text;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                Icon icon = value.icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                CdfEvent cdfEvent = value.tap_client_route_template_cdf_event;
                CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
                ByteString byteString = ByteString.EMPTY;
                ButtonProminence buttonProminence = value.button_prominence;
                Boolean bool = value.is_destructive;
                String str = value.tap_client_route;
                byteString.getClass();
                return new ButtonDefault(buttonProminence, bool, localizedString2, icon2, str, cdfEvent2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ButtonDefault value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                CdfEvent.ADAPTER.encodeWithTag(writer, 6, value.tap_client_route_template_cdf_event);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.tap_client_route);
                Icon.ADAPTER.encodeWithTag(writer, 4, value.icon);
                LocalizedString.ADAPTER.encodeWithTag(writer, 3, value.text);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_destructive);
                ButtonProminence.ADAPTER.encodeWithTag(writer, 1, value.button_prominence);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonDefault(ButtonProminence buttonProminence, Boolean bool, LocalizedString localizedString, Icon icon, String str, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button_prominence = buttonProminence;
        this.is_destructive = bool;
        this.text = localizedString;
        this.icon = icon;
        this.tap_client_route = str;
        this.tap_client_route_template_cdf_event = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonDefault)) {
            return false;
        }
        ButtonDefault buttonDefault = (ButtonDefault) obj;
        return Intrinsics.areEqual(unknownFields(), buttonDefault.unknownFields()) && this.button_prominence == buttonDefault.button_prominence && Intrinsics.areEqual(this.is_destructive, buttonDefault.is_destructive) && Intrinsics.areEqual(this.text, buttonDefault.text) && Intrinsics.areEqual(this.icon, buttonDefault.icon) && Intrinsics.areEqual(this.tap_client_route, buttonDefault.tap_client_route) && Intrinsics.areEqual(this.tap_client_route_template_cdf_event, buttonDefault.tap_client_route_template_cdf_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonProminence buttonProminence = this.button_prominence;
        int hashCode2 = (hashCode + (buttonProminence != null ? buttonProminence.hashCode() : 0)) * 37;
        Boolean bool = this.is_destructive;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalizedString localizedString = this.text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode5 = (hashCode4 + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.tap_client_route;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.tap_client_route_template_cdf_event;
        int hashCode7 = hashCode6 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.button_prominence = this.button_prominence;
        builder.is_destructive = this.is_destructive;
        builder.text = this.text;
        builder.icon = this.icon;
        builder.tap_client_route = this.tap_client_route;
        builder.tap_client_route_template_cdf_event = this.tap_client_route_template_cdf_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonProminence buttonProminence = this.button_prominence;
        if (buttonProminence != null) {
            arrayList.add("button_prominence=" + buttonProminence);
        }
        Boolean bool = this.is_destructive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_destructive=", bool, arrayList);
        }
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        String str = this.tap_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tap_client_route=", arrayList);
        }
        CdfEvent cdfEvent = this.tap_client_route_template_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("tap_client_route_template_cdf_event=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonDefault{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ButtonDefault$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ButtonDefault$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ButtonDefault build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
