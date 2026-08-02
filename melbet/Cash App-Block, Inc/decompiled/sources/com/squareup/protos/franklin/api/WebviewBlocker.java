package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.WebviewBlocker;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0019\u0018\u001a\u001b\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$Builder;", "", "url", "Ljava/lang/String;", "callback_url", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "navigation_header", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "", "allow_popups", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "navigation_footer", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "set_cash_user_agent", "", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "cookie_fields", "Ljava/util/List;", "", "metadata", "Ljava/util/Map;", "Companion", "Builder", "CookieField", "NavigationHeader", "NavigationFooter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebviewBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WebviewBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean allow_popups;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String callback_url;

    @WireField(adapter = "com.squareup.protos.franklin.api.WebviewBlocker$CookieField#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<CookieField> cookie_fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final Map<String, String> metadata;

    @WireField(adapter = "com.squareup.protos.franklin.api.WebviewBlocker$NavigationFooter#ADAPTER", schemaIndex = 6, tag = 7)
    public final NavigationFooter navigation_footer;

    @WireField(adapter = "com.squareup.protos.franklin.api.WebviewBlocker$NavigationHeader#ADAPTER", schemaIndex = 4, tag = 5)
    public final NavigationHeader navigation_header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean set_cash_user_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String url;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WebviewBlocker;", "<init>", "()V", "url", "", "callback_url", "cookie_fields", "", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "metadata", "", "navigation_header", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "allow_popups", "", "Ljava/lang/Boolean;", "navigation_footer", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "set_cash_user_agent", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/WebviewBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean allow_popups;
        public String callback_url;
        public List<CookieField> cookie_fields = EmptyList.INSTANCE;
        public Map<String, String> metadata;
        public NavigationFooter navigation_footer;
        public NavigationHeader navigation_header;
        public Boolean set_cash_user_agent;
        public String url;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.metadata = emptyMap;
        }

        public final Builder allow_popups(Boolean allow_popups) {
            this.allow_popups = allow_popups;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public WebviewBlocker build() {
            return new WebviewBlocker(this.url, this.callback_url, this.cookie_fields, this.metadata, this.navigation_header, this.allow_popups, this.navigation_footer, this.set_cash_user_agent, buildUnknownFields());
        }

        public final Builder callback_url(String callback_url) {
            this.callback_url = callback_url;
            return this;
        }

        public final Builder cookie_fields(List<CookieField> cookie_fields) {
            cookie_fields.getClass();
            TransactorKt.checkElementsNotNull(cookie_fields);
            this.cookie_fields = cookie_fields;
            return this;
        }

        public final Builder metadata(Map<String, String> metadata) {
            metadata.getClass();
            this.metadata = metadata;
            return this;
        }

        public final Builder navigation_footer(NavigationFooter navigation_footer) {
            this.navigation_footer = navigation_footer;
            return this;
        }

        public final Builder navigation_header(NavigationHeader navigation_header) {
            this.navigation_header = navigation_header;
            return this;
        }

        public final Builder set_cash_user_agent(Boolean set_cash_user_agent) {
            this.set_cash_user_agent = set_cash_user_agent;
            return this;
        }

        public final Builder url(String url) {
            this.url = url;
            return this;
        }
    }

    static {
        WebviewBlocker$Companion$ADAPTER$1 webviewBlocker$Companion$ADAPTER$1 = new WebviewBlocker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WebviewBlocker.class), Syntax.PROTO_2);
        ADAPTER = webviewBlocker$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(webviewBlocker$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewBlocker(String str, String str2, List list, Map map, NavigationHeader navigationHeader, Boolean bool, NavigationFooter navigationFooter, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        byteString.getClass();
        this.url = str;
        this.callback_url = str2;
        this.navigation_header = navigationHeader;
        this.allow_popups = bool;
        this.navigation_footer = navigationFooter;
        this.set_cash_user_agent = bool2;
        this.cookie_fields = TransactorKt.immutableCopyOf("cookie_fields", list);
        this.metadata = TransactorKt.immutableCopyOf("metadata", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebviewBlocker)) {
            return false;
        }
        WebviewBlocker webviewBlocker = (WebviewBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), webviewBlocker.unknownFields()) && Intrinsics.areEqual(this.url, webviewBlocker.url) && Intrinsics.areEqual(this.callback_url, webviewBlocker.callback_url) && Intrinsics.areEqual(this.cookie_fields, webviewBlocker.cookie_fields) && Intrinsics.areEqual(this.metadata, webviewBlocker.metadata) && Intrinsics.areEqual(this.navigation_header, webviewBlocker.navigation_header) && Intrinsics.areEqual(this.allow_popups, webviewBlocker.allow_popups) && Intrinsics.areEqual(this.navigation_footer, webviewBlocker.navigation_footer) && Intrinsics.areEqual(this.set_cash_user_agent, webviewBlocker.set_cash_user_agent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.callback_url;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.cookie_fields), this.metadata, 37);
        NavigationHeader navigationHeader = this.navigation_header;
        int hashCode3 = (m + (navigationHeader != null ? navigationHeader.hashCode() : 0)) * 37;
        Boolean bool = this.allow_popups;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        NavigationFooter navigationFooter = this.navigation_footer;
        int hashCode5 = (hashCode4 + (navigationFooter != null ? navigationFooter.hashCode() : 0)) * 37;
        Boolean bool2 = this.set_cash_user_agent;
        int hashCode6 = hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.url = this.url;
        builder.callback_url = this.callback_url;
        builder.cookie_fields = this.cookie_fields;
        builder.metadata = this.metadata;
        builder.navigation_header = this.navigation_header;
        builder.allow_popups = this.allow_popups;
        builder.navigation_footer = this.navigation_footer;
        builder.set_cash_user_agent = this.set_cash_user_agent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.url != null) {
            arrayList.add("url=██");
        }
        if (this.callback_url != null) {
            arrayList.add("callback_url=██");
        }
        if (!this.cookie_fields.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cookie_fields=", arrayList, this.cookie_fields);
        }
        if (!this.metadata.isEmpty()) {
            arrayList.add("metadata=██");
        }
        NavigationHeader navigationHeader = this.navigation_header;
        if (navigationHeader != null) {
            arrayList.add("navigation_header=" + navigationHeader);
        }
        Boolean bool = this.allow_popups;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_popups=", bool, arrayList);
        }
        NavigationFooter navigationFooter = this.navigation_footer;
        if (navigationFooter != null) {
            arrayList.add("navigation_footer=" + navigationFooter);
        }
        Boolean bool2 = this.set_cash_user_agent;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("set_cash_user_agent=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebviewBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0081\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001dR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Builder;", "name", "", "value", "secure", "", "path", "domain", "expires", "", "max_age", "http_only", "session_only", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CookieField extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CookieField> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
        public final String domain;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", redacted = true, schemaIndex = 5, tag = 6)
        public final Long expires;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", redacted = true, schemaIndex = 7, tag = 8)
        public final Boolean http_only;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", redacted = true, schemaIndex = 6, tag = 7)
        public final Long max_age;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
        public final String path;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", redacted = true, schemaIndex = 2, tag = 3)
        public final Boolean secure;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", redacted = true, schemaIndex = 8, tag = 9)
        public final Boolean session_only;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String value;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0013J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "<init>", "()V", "name", "", "value", "secure", "", "Ljava/lang/Boolean;", "path", "domain", "expires", "", "Ljava/lang/Long;", "max_age", "http_only", "session_only", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String domain;
            public Long expires;
            public Boolean http_only;
            public Long max_age;
            public String name;
            public String path;
            public Boolean secure;
            public Boolean session_only;
            public String value;

            @Override // com.squareup.wire.Message.Builder
            public CookieField build() {
                return new CookieField(this.name, this.value, this.secure, this.path, this.domain, this.expires, this.max_age, this.http_only, this.session_only, buildUnknownFields());
            }

            public final Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public final Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            public final Builder http_only(Boolean http_only) {
                this.http_only = http_only;
                return this;
            }

            public final Builder max_age(Long max_age) {
                this.max_age = max_age;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder path(String path) {
                this.path = path;
                return this;
            }

            public final Builder secure(Boolean secure) {
                this.secure = secure;
                return this;
            }

            public final Builder session_only(Boolean session_only) {
                this.session_only = session_only;
                return this;
            }

            public final Builder value(String value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CookieField.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.WebviewBlocker$CookieField$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.CookieField decode(ProtoReader reader) {
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
                    Object obj9 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new WebviewBlocker.CookieField((String) obj, (String) obj2, (Boolean) obj3, (String) obj4, (String) obj5, (Long) obj6, (Long) obj7, (Boolean) obj8, (Boolean) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.INT64.decode(reader);
                                break;
                            case 7:
                                obj7 = ProtoAdapter.INT64.decode(reader);
                                break;
                            case 8:
                                obj8 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 9:
                                obj9 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WebviewBlocker.CookieField value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    protoAdapter3.encodeWithTag(writer, 3, value.secure);
                    protoAdapter2.encodeWithTag(writer, 4, value.path);
                    protoAdapter2.encodeWithTag(writer, 5, value.domain);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                    protoAdapter4.encodeWithTag(writer, 6, value.expires);
                    protoAdapter4.encodeWithTag(writer, 7, value.max_age);
                    protoAdapter3.encodeWithTag(writer, 8, value.http_only);
                    protoAdapter3.encodeWithTag(writer, 9, value.session_only);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WebviewBlocker.CookieField value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, value.domain) + protoAdapter2.encodedSizeWithTag(4, value.path) + protoAdapter3.encodedSizeWithTag(3, value.secure) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                    return protoAdapter3.encodedSizeWithTag(9, value.session_only) + protoAdapter3.encodedSizeWithTag(8, value.http_only) + protoAdapter4.encodedSizeWithTag(7, value.max_age) + protoAdapter4.encodedSizeWithTag(6, value.expires) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.CookieField redact(WebviewBlocker.CookieField value) {
                    value.getClass();
                    return value.copy(null, null, null, null, null, null, null, null, null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WebviewBlocker.CookieField value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                    protoAdapter2.encodeWithTag(writer, 9, value.session_only);
                    protoAdapter2.encodeWithTag(writer, 8, value.http_only);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                    protoAdapter3.encodeWithTag(writer, 7, value.max_age);
                    protoAdapter3.encodeWithTag(writer, 6, value.expires);
                    ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                    protoAdapter4.encodeWithTag(writer, 5, value.domain);
                    protoAdapter4.encodeWithTag(writer, 4, value.path);
                    protoAdapter2.encodeWithTag(writer, 3, value.secure);
                    protoAdapter4.encodeWithTag(writer, 2, value.value);
                    protoAdapter4.encodeWithTag(writer, 1, value.name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CookieField(String str, String str2, Boolean bool, String str3, String str4, Long l, Long l2, Boolean bool2, Boolean bool3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CookieField copy$default(CookieField cookieField, String str, String str2, Boolean bool, String str3, String str4, Long l, Long l2, Boolean bool2, Boolean bool3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cookieField.name;
            }
            if ((i & 2) != 0) {
                str2 = cookieField.value;
            }
            if ((i & 4) != 0) {
                bool = cookieField.secure;
            }
            if ((i & 8) != 0) {
                str3 = cookieField.path;
            }
            if ((i & 16) != 0) {
                str4 = cookieField.domain;
            }
            if ((i & 32) != 0) {
                l = cookieField.expires;
            }
            if ((i & 64) != 0) {
                l2 = cookieField.max_age;
            }
            if ((i & 128) != 0) {
                bool2 = cookieField.http_only;
            }
            if ((i & 256) != 0) {
                bool3 = cookieField.session_only;
            }
            if ((i & 512) != 0) {
                byteString = cookieField.unknownFields();
            }
            Boolean bool4 = bool3;
            ByteString byteString2 = byteString;
            Long l3 = l2;
            Boolean bool5 = bool2;
            String str5 = str4;
            Long l4 = l;
            return cookieField.copy(str, str2, bool, str3, str5, l4, l3, bool5, bool4, byteString2);
        }

        public final CookieField copy(String name, String value, Boolean secure, String path, String domain, Long expires, Long max_age, Boolean http_only, Boolean session_only, ByteString unknownFields) {
            unknownFields.getClass();
            return new CookieField(name, value, secure, path, domain, expires, max_age, http_only, session_only, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CookieField)) {
                return false;
            }
            CookieField cookieField = (CookieField) other;
            return Intrinsics.areEqual(unknownFields(), cookieField.unknownFields()) && Intrinsics.areEqual(this.name, cookieField.name) && Intrinsics.areEqual(this.value, cookieField.value) && Intrinsics.areEqual(this.secure, cookieField.secure) && Intrinsics.areEqual(this.path, cookieField.path) && Intrinsics.areEqual(this.domain, cookieField.domain) && Intrinsics.areEqual(this.expires, cookieField.expires) && Intrinsics.areEqual(this.max_age, cookieField.max_age) && Intrinsics.areEqual(this.http_only, cookieField.http_only) && Intrinsics.areEqual(this.session_only, cookieField.session_only);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.secure;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str3 = this.path;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.domain;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Long l = this.expires;
            int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.max_age;
            int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Boolean bool2 = this.http_only;
            int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Boolean bool3 = this.session_only;
            int hashCode10 = hashCode9 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.value = this.value;
            builder.secure = this.secure;
            builder.path = this.path;
            builder.domain = this.domain;
            builder.expires = this.expires;
            builder.max_age = this.max_age;
            builder.http_only = this.http_only;
            builder.session_only = this.session_only;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.name != null) {
                arrayList.add("name=██");
            }
            if (this.value != null) {
                arrayList.add("value=██");
            }
            if (this.secure != null) {
                arrayList.add("secure=██");
            }
            if (this.path != null) {
                arrayList.add("path=██");
            }
            if (this.domain != null) {
                arrayList.add("domain=██");
            }
            if (this.expires != null) {
                arrayList.add("expires=██");
            }
            if (this.max_age != null) {
                arrayList.add("max_age=██");
            }
            if (this.http_only != null) {
                arrayList.add("http_only=██");
            }
            if (this.session_only != null) {
                arrayList.add("session_only=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CookieField{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WebviewBlocker$CookieField;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CookieField build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CookieField() {
            this(null, null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CookieField(String str, String str2, Boolean bool, String str3, String str4, Long l, Long l2, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.value = str2;
            this.secure = bool;
            this.path = str3;
            this.domain = str4;
            this.expires = l;
            this.max_age = l2;
            this.http_only = bool2;
            this.session_only = bool3;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter$Builder;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class NavigationFooter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NavigationFooter> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 0, tag = 1)
        public final BlockerAction primary_action;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
        public final BlockerAction secondary_action;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "<init>", "()V", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BlockerAction primary_action;
            public BlockerAction secondary_action;

            @Override // com.squareup.wire.Message.Builder
            public NavigationFooter build() {
                return new NavigationFooter(this.primary_action, this.secondary_action, buildUnknownFields());
            }

            public final Builder primary_action(BlockerAction primary_action) {
                this.primary_action = primary_action;
                return this;
            }

            public final Builder secondary_action(BlockerAction secondary_action) {
                this.secondary_action = secondary_action;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NavigationFooter.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.WebviewBlocker$NavigationFooter$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.NavigationFooter decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new WebviewBlocker.NavigationFooter((BlockerAction) obj, (BlockerAction) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WebviewBlocker.NavigationFooter value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.primary_action);
                    protoAdapter2.encodeWithTag(writer, 2, value.secondary_action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WebviewBlocker.NavigationFooter value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(2, value.secondary_action) + protoAdapter2.encodedSizeWithTag(1, value.primary_action) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.NavigationFooter redact(WebviewBlocker.NavigationFooter value) {
                    value.getClass();
                    BlockerAction blockerAction = value.primary_action;
                    BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                    BlockerAction blockerAction3 = value.secondary_action;
                    return value.copy(blockerAction2, blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WebviewBlocker.NavigationFooter value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.secondary_action);
                    protoAdapter2.encodeWithTag(writer, 1, value.primary_action);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ NavigationFooter(BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : blockerAction, (i & 2) != 0 ? null : blockerAction2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ NavigationFooter copy$default(NavigationFooter navigationFooter, BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                blockerAction = navigationFooter.primary_action;
            }
            if ((i & 2) != 0) {
                blockerAction2 = navigationFooter.secondary_action;
            }
            if ((i & 4) != 0) {
                byteString = navigationFooter.unknownFields();
            }
            return navigationFooter.copy(blockerAction, blockerAction2, byteString);
        }

        public final NavigationFooter copy(BlockerAction primary_action, BlockerAction secondary_action, ByteString unknownFields) {
            unknownFields.getClass();
            return new NavigationFooter(primary_action, secondary_action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NavigationFooter)) {
                return false;
            }
            NavigationFooter navigationFooter = (NavigationFooter) other;
            return Intrinsics.areEqual(unknownFields(), navigationFooter.unknownFields()) && Intrinsics.areEqual(this.primary_action, navigationFooter.primary_action) && Intrinsics.areEqual(this.secondary_action, navigationFooter.secondary_action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BlockerAction blockerAction = this.primary_action;
            int hashCode2 = (hashCode + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
            BlockerAction blockerAction2 = this.secondary_action;
            int hashCode3 = hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.primary_action = this.primary_action;
            builder.secondary_action = this.secondary_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BlockerAction blockerAction = this.primary_action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_action=", blockerAction, arrayList);
            }
            BlockerAction blockerAction2 = this.secondary_action;
            if (blockerAction2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationFooter{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationFooter;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ NavigationFooter build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public NavigationFooter() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationFooter(BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_action = blockerAction;
            this.secondary_action = blockerAction2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader$Builder;", "title", "", "should_hide_url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class NavigationHeader extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NavigationHeader> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
        public final Boolean should_hide_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "<init>", "()V", "title", "", "should_hide_url", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Boolean should_hide_url;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public NavigationHeader build() {
                return new NavigationHeader(this.title, this.should_hide_url, buildUnknownFields());
            }

            public final Builder should_hide_url(Boolean should_hide_url) {
                this.should_hide_url = should_hide_url;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NavigationHeader.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.WebviewBlocker$NavigationHeader$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.NavigationHeader decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new WebviewBlocker.NavigationHeader((String) obj, (Boolean) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WebviewBlocker.NavigationHeader value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.should_hide_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WebviewBlocker.NavigationHeader value) {
                    value.getClass();
                    return ProtoAdapter.BOOL.encodedSizeWithTag(2, value.should_hide_url) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WebviewBlocker.NavigationHeader redact(WebviewBlocker.NavigationHeader value) {
                    value.getClass();
                    return WebviewBlocker.NavigationHeader.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WebviewBlocker.NavigationHeader value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.should_hide_url);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ NavigationHeader(String str, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ NavigationHeader copy$default(NavigationHeader navigationHeader, String str, Boolean bool, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigationHeader.title;
            }
            if ((i & 2) != 0) {
                bool = navigationHeader.should_hide_url;
            }
            if ((i & 4) != 0) {
                byteString = navigationHeader.unknownFields();
            }
            return navigationHeader.copy(str, bool, byteString);
        }

        public final NavigationHeader copy(String title, Boolean should_hide_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new NavigationHeader(title, should_hide_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NavigationHeader)) {
                return false;
            }
            NavigationHeader navigationHeader = (NavigationHeader) other;
            return Intrinsics.areEqual(unknownFields(), navigationHeader.unknownFields()) && Intrinsics.areEqual(this.title, navigationHeader.title) && Intrinsics.areEqual(this.should_hide_url, navigationHeader.should_hide_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.should_hide_url;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.should_hide_url = this.should_hide_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            Boolean bool = this.should_hide_url;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("should_hide_url=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationHeader{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WebviewBlocker$NavigationHeader;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ NavigationHeader build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public NavigationHeader() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationHeader(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.should_hide_url = bool;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WebviewBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WebviewBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WebviewBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WebviewBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ WebviewBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
