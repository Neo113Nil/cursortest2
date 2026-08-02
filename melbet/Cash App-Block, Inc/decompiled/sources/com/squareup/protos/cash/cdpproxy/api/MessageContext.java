package com.squareup.protos.cash.cdpproxy.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$#R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/Device;", "device", "Lcom/squareup/protos/cash/cdpproxy/api/Device;", "Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystem;", "operating_system", "Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystem;", "Lcom/squareup/protos/cash/cdpproxy/api/Application;", "application", "Lcom/squareup/protos/cash/cdpproxy/api/Application;", "Lcom/squareup/protos/cash/cdpproxy/api/Library;", "library", "Lcom/squareup/protos/cash/cdpproxy/api/Library;", "", "locale", "Ljava/lang/String;", "Lcom/squareup/protos/cash/cdpproxy/api/Network;", "network", "Lcom/squareup/protos/cash/cdpproxy/api/Network;", "user_agent", "Lcom/squareup/protos/cash/cdpproxy/api/Location;", "location", "Lcom/squareup/protos/cash/cdpproxy/api/Location;", "timezone", "Lcom/squareup/protos/cash/cdpproxy/api/Page;", "page", "Lcom/squareup/protos/cash/cdpproxy/api/Page;", "Lcom/squareup/protos/cash/cdpproxy/api/Browser;", "browser", "Lcom/squareup/protos/cash/cdpproxy/api/Browser;", "Lcom/squareup/protos/cash/cdpproxy/api/Campaign;", "campaign", "Lcom/squareup/protos/cash/cdpproxy/api/Campaign;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MessageContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MessageContext> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Application#ADAPTER", schemaIndex = 2, tag = 3)
    public final Application application;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Browser#ADAPTER", schemaIndex = 10, tag = 11)
    public final Browser browser;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Campaign#ADAPTER", schemaIndex = 11, tag = 12)
    public final Campaign campaign;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Device#ADAPTER", schemaIndex = 0, tag = 1)
    public final Device device;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Library#ADAPTER", schemaIndex = 3, tag = 4)
    public final Library library;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String locale;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Location#ADAPTER", redacted = true, schemaIndex = 7, tag = 8)
    public final Location location;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Network#ADAPTER", schemaIndex = 5, tag = 6)
    public final Network network;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.OperatingSystem#ADAPTER", schemaIndex = 1, tag = 2)
    public final OperatingSystem operating_system;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.Page#ADAPTER", redacted = true, schemaIndex = 9, tag = 10)
    public final Page page;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String user_agent;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/MessageContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "<init>", "()V", "device", "Lcom/squareup/protos/cash/cdpproxy/api/Device;", "operating_system", "Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystem;", "application", "Lcom/squareup/protos/cash/cdpproxy/api/Application;", "library", "Lcom/squareup/protos/cash/cdpproxy/api/Library;", "locale", "", "network", "Lcom/squareup/protos/cash/cdpproxy/api/Network;", "user_agent", "location", "Lcom/squareup/protos/cash/cdpproxy/api/Location;", "timezone", "page", "Lcom/squareup/protos/cash/cdpproxy/api/Page;", "browser", "Lcom/squareup/protos/cash/cdpproxy/api/Browser;", "campaign", "Lcom/squareup/protos/cash/cdpproxy/api/Campaign;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public Application application;
        public Browser browser;
        public Campaign campaign;
        public Device device;
        public Library library;
        public String locale;
        public Location location;
        public Network network;
        public OperatingSystem operating_system;
        public Page page;
        public String timezone;
        public String user_agent;

        public final Builder application(Application application) {
            this.application = application;
            return this;
        }

        public final Builder browser(Browser browser) {
            this.browser = browser;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public MessageContext build() {
            return new MessageContext(this.device, this.operating_system, this.application, this.library, this.locale, this.network, this.user_agent, this.location, this.timezone, this.page, this.browser, this.campaign, buildUnknownFields());
        }

        public final Builder campaign(Campaign campaign) {
            this.campaign = campaign;
            return this;
        }

        public final Builder device(Device device) {
            this.device = device;
            return this;
        }

        public final Builder library(Library library) {
            this.library = library;
            return this;
        }

        public final Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        public final Builder location(Location location) {
            this.location = location;
            return this;
        }

        public final Builder network(Network network) {
            this.network = network;
            return this;
        }

        public final Builder operating_system(OperatingSystem operating_system) {
            this.operating_system = operating_system;
            return this;
        }

        public final Builder page(Page page) {
            this.page = page;
            return this;
        }

        public final Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public final Builder user_agent(String user_agent) {
            this.user_agent = user_agent;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MessageContext.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cdpproxy.api.MessageContext$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v21 */
            /* JADX WARN: Type inference failed for: r7v22 */
            /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public MessageContext decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                ?? r7 = 0;
                Object obj5 = null;
                String str = null;
                Object obj6 = null;
                String str2 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    String str3 = r7;
                    if (nextTag == -1) {
                        return new MessageContext((Device) obj, (OperatingSystem) obj2, (Application) obj3, (Library) obj4, str3, (Network) obj5, str, (Location) obj6, str2, (Page) obj7, (Browser) obj8, (Campaign) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(Device.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(OperatingSystem.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Application.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Library.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            r7 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(Network.ADAPTER, reader, obj5);
                            break;
                        case 7:
                            str = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj6 = TransactorKt.decodeMessageOrMerge(Location.ADAPTER, reader, obj6);
                            break;
                        case 9:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            obj7 = TransactorKt.decodeMessageOrMerge(Page.ADAPTER, reader, obj7);
                            break;
                        case 11:
                            obj8 = TransactorKt.decodeMessageOrMerge(Browser.ADAPTER, reader, obj8);
                            break;
                        case 12:
                            obj9 = TransactorKt.decodeMessageOrMerge(Campaign.ADAPTER, reader, obj9);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                    r7 = str3;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MessageContext value) {
                writer.getClass();
                value.getClass();
                Device.ADAPTER.encodeWithTag(writer, 1, value.device);
                OperatingSystem.ADAPTER.encodeWithTag(writer, 2, value.operating_system);
                Application.ADAPTER.encodeWithTag(writer, 3, value.application);
                Library.ADAPTER.encodeWithTag(writer, 4, value.library);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.locale);
                Network.ADAPTER.encodeWithTag(writer, 6, value.network);
                protoAdapter2.encodeWithTag(writer, 7, value.user_agent);
                Location.ADAPTER.encodeWithTag(writer, 8, value.location);
                protoAdapter2.encodeWithTag(writer, 9, value.timezone);
                Page.ADAPTER.encodeWithTag(writer, 10, value.page);
                Browser.ADAPTER.encodeWithTag(writer, 11, value.browser);
                Campaign.ADAPTER.encodeWithTag(writer, 12, value.campaign);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MessageContext value) {
                value.getClass();
                int encodedSizeWithTag = Library.ADAPTER.encodedSizeWithTag(4, value.library) + Application.ADAPTER.encodedSizeWithTag(3, value.application) + OperatingSystem.ADAPTER.encodedSizeWithTag(2, value.operating_system) + Device.ADAPTER.encodedSizeWithTag(1, value.device) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Campaign.ADAPTER.encodedSizeWithTag(12, value.campaign) + Browser.ADAPTER.encodedSizeWithTag(11, value.browser) + Page.ADAPTER.encodedSizeWithTag(10, value.page) + protoAdapter2.encodedSizeWithTag(9, value.timezone) + Location.ADAPTER.encodedSizeWithTag(8, value.location) + protoAdapter2.encodedSizeWithTag(7, value.user_agent) + Network.ADAPTER.encodedSizeWithTag(6, value.network) + protoAdapter2.encodedSizeWithTag(5, value.locale) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MessageContext redact(MessageContext value) {
                value.getClass();
                Device device = value.device;
                Device device2 = device != null ? (Device) Device.ADAPTER.redact(device) : null;
                OperatingSystem operatingSystem = value.operating_system;
                OperatingSystem operatingSystem2 = operatingSystem != null ? (OperatingSystem) OperatingSystem.ADAPTER.redact(operatingSystem) : null;
                Application application = value.application;
                Application application2 = application != null ? (Application) Application.ADAPTER.redact(application) : null;
                Library library = value.library;
                Library library2 = library != null ? (Library) Library.ADAPTER.redact(library) : null;
                Network network = value.network;
                Network network2 = network != null ? (Network) Network.ADAPTER.redact(network) : null;
                Browser browser = value.browser;
                Browser browser2 = browser != null ? (Browser) Browser.ADAPTER.redact(browser) : null;
                Campaign campaign = value.campaign;
                Campaign campaign2 = campaign != null ? (Campaign) Campaign.ADAPTER.redact(campaign) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.locale;
                String str2 = value.user_agent;
                String str3 = value.timezone;
                byteString.getClass();
                return new MessageContext(device2, operatingSystem2, application2, library2, str, network2, str2, null, str3, null, browser2, campaign2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MessageContext value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Campaign.ADAPTER.encodeWithTag(writer, 12, value.campaign);
                Browser.ADAPTER.encodeWithTag(writer, 11, value.browser);
                Page.ADAPTER.encodeWithTag(writer, 10, value.page);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.timezone);
                Location.ADAPTER.encodeWithTag(writer, 8, value.location);
                protoAdapter2.encodeWithTag(writer, 7, value.user_agent);
                Network.ADAPTER.encodeWithTag(writer, 6, value.network);
                protoAdapter2.encodeWithTag(writer, 5, value.locale);
                Library.ADAPTER.encodeWithTag(writer, 4, value.library);
                Application.ADAPTER.encodeWithTag(writer, 3, value.application);
                OperatingSystem.ADAPTER.encodeWithTag(writer, 2, value.operating_system);
                Device.ADAPTER.encodeWithTag(writer, 1, value.device);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContext(Device device, OperatingSystem operatingSystem, Application application, Library library, String str, Network network, String str2, Location location, String str3, Page page, Browser browser, Campaign campaign, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device = device;
        this.operating_system = operatingSystem;
        this.application = application;
        this.library = library;
        this.locale = str;
        this.network = network;
        this.user_agent = str2;
        this.location = location;
        this.timezone = str3;
        this.page = page;
        this.browser = browser;
        this.campaign = campaign;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageContext)) {
            return false;
        }
        MessageContext messageContext = (MessageContext) obj;
        return Intrinsics.areEqual(unknownFields(), messageContext.unknownFields()) && Intrinsics.areEqual(this.device, messageContext.device) && Intrinsics.areEqual(this.operating_system, messageContext.operating_system) && Intrinsics.areEqual(this.application, messageContext.application) && Intrinsics.areEqual(this.library, messageContext.library) && Intrinsics.areEqual(this.locale, messageContext.locale) && Intrinsics.areEqual(this.network, messageContext.network) && Intrinsics.areEqual(this.user_agent, messageContext.user_agent) && Intrinsics.areEqual(this.location, messageContext.location) && Intrinsics.areEqual(this.timezone, messageContext.timezone) && Intrinsics.areEqual(this.page, messageContext.page) && Intrinsics.areEqual(this.browser, messageContext.browser) && Intrinsics.areEqual(this.campaign, messageContext.campaign);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Device device = this.device;
        int hashCode2 = (hashCode + (device != null ? device.hashCode() : 0)) * 37;
        OperatingSystem operatingSystem = this.operating_system;
        int hashCode3 = (hashCode2 + (operatingSystem != null ? operatingSystem.hashCode() : 0)) * 37;
        Application application = this.application;
        int hashCode4 = (hashCode3 + (application != null ? application.hashCode() : 0)) * 37;
        Library library = this.library;
        int hashCode5 = (hashCode4 + (library != null ? library.hashCode() : 0)) * 37;
        String str = this.locale;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        Network network = this.network;
        int hashCode7 = (hashCode6 + (network != null ? network.hashCode() : 0)) * 37;
        String str2 = this.user_agent;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Location location = this.location;
        int hashCode9 = (hashCode8 + (location != null ? location.hashCode() : 0)) * 37;
        String str3 = this.timezone;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Page page = this.page;
        int hashCode11 = (hashCode10 + (page != null ? page.hashCode() : 0)) * 37;
        Browser browser = this.browser;
        int hashCode12 = (hashCode11 + (browser != null ? browser.hashCode() : 0)) * 37;
        Campaign campaign = this.campaign;
        int hashCode13 = hashCode12 + (campaign != null ? campaign.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.device = this.device;
        builder.operating_system = this.operating_system;
        builder.application = this.application;
        builder.library = this.library;
        builder.locale = this.locale;
        builder.network = this.network;
        builder.user_agent = this.user_agent;
        builder.location = this.location;
        builder.timezone = this.timezone;
        builder.page = this.page;
        builder.browser = this.browser;
        builder.campaign = this.campaign;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Device device = this.device;
        if (device != null) {
            arrayList.add("device=" + device);
        }
        OperatingSystem operatingSystem = this.operating_system;
        if (operatingSystem != null) {
            arrayList.add("operating_system=" + operatingSystem);
        }
        Application application = this.application;
        if (application != null) {
            arrayList.add("application=" + application);
        }
        Library library = this.library;
        if (library != null) {
            arrayList.add("library=" + library);
        }
        String str = this.locale;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
        }
        Network network = this.network;
        if (network != null) {
            arrayList.add("network=" + network);
        }
        String str2 = this.user_agent;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "user_agent=", arrayList);
        }
        if (this.location != null) {
            arrayList.add("location=██");
        }
        String str3 = this.timezone;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "timezone=", arrayList);
        }
        if (this.page != null) {
            arrayList.add("page=██");
        }
        Browser browser = this.browser;
        if (browser != null) {
            arrayList.add("browser=" + browser);
        }
        Campaign campaign = this.campaign;
        if (campaign != null) {
            arrayList.add("campaign=" + campaign);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MessageContext{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/MessageContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext$Builder;", "", "body", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MessageContext build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
