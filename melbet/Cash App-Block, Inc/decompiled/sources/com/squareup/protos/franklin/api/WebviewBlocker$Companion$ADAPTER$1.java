package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.WebviewBlocker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"com/squareup/protos/franklin/api/WebviewBlocker$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/WebviewBlocker;", "metadataAdapter", "", "", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebviewBlocker$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    public WebviewBlocker$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.blockers.WebviewBlocker", syntax, (Object) null, "squareup/franklin/blockers/webview_blocker.proto");
        this.metadataAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(29));
    }

    private final ProtoAdapter getMetadataAdapter() {
        return (ProtoAdapter) this.metadataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public WebviewBlocker decode(ProtoReader reader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
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
                return new WebviewBlocker((String) obj, (String) obj2, m, linkedHashMap, (WebviewBlocker.NavigationHeader) obj3, (Boolean) obj4, (WebviewBlocker.NavigationFooter) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(reader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    m.add(WebviewBlocker.CookieField.ADAPTER.decode(reader));
                    break;
                case 4:
                    linkedHashMap.putAll((Map) getMetadataAdapter().decode(reader));
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(WebviewBlocker.NavigationHeader.ADAPTER, reader, obj3);
                    break;
                case 6:
                    obj4 = ProtoAdapter.BOOL.decode(reader);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(WebviewBlocker.NavigationFooter.ADAPTER, reader, obj5);
                    break;
                case 8:
                    obj6 = ProtoAdapter.BOOL.decode(reader);
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, WebviewBlocker value) {
        writer.getClass();
        value.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.url);
        protoAdapter.encodeWithTag(writer, 2, value.callback_url);
        WebviewBlocker.CookieField.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.cookie_fields);
        getMetadataAdapter().encodeWithTag(writer, 4, value.metadata);
        WebviewBlocker.NavigationHeader.ADAPTER.encodeWithTag(writer, 5, value.navigation_header);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(writer, 6, value.allow_popups);
        WebviewBlocker.NavigationFooter.ADAPTER.encodeWithTag(writer, 7, value.navigation_footer);
        protoAdapter2.encodeWithTag(writer, 8, value.set_cash_user_agent);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(WebviewBlocker value) {
        value.getClass();
        int size$okio = value.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = WebviewBlocker.NavigationHeader.ADAPTER.encodedSizeWithTag(5, value.navigation_header) + getMetadataAdapter().encodedSizeWithTag(4, value.metadata) + WebviewBlocker.CookieField.ADAPTER.asRepeated().encodedSizeWithTag(3, value.cookie_fields) + protoAdapter.encodedSizeWithTag(2, value.callback_url) + protoAdapter.encodedSizeWithTag(1, value.url) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(8, value.set_cash_user_agent) + WebviewBlocker.NavigationFooter.ADAPTER.encodedSizeWithTag(7, value.navigation_footer) + protoAdapter2.encodedSizeWithTag(6, value.allow_popups) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public WebviewBlocker redact(WebviewBlocker value) {
        value.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.cookie_fields, WebviewBlocker.CookieField.ADAPTER);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        WebviewBlocker.NavigationHeader navigationHeader = value.navigation_header;
        WebviewBlocker.NavigationHeader navigationHeader2 = navigationHeader != null ? (WebviewBlocker.NavigationHeader) WebviewBlocker.NavigationHeader.ADAPTER.redact(navigationHeader) : null;
        WebviewBlocker.NavigationFooter navigationFooter = value.navigation_footer;
        WebviewBlocker.NavigationFooter navigationFooter2 = navigationFooter != null ? (WebviewBlocker.NavigationFooter) WebviewBlocker.NavigationFooter.ADAPTER.redact(navigationFooter) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = value.allow_popups;
        Boolean bool2 = value.set_cash_user_agent;
        byteString.getClass();
        return new WebviewBlocker(null, null, m1169redactElements, emptyMap, navigationHeader2, bool, navigationFooter2, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, WebviewBlocker value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(writer, 8, value.set_cash_user_agent);
        WebviewBlocker.NavigationFooter.ADAPTER.encodeWithTag(writer, 7, value.navigation_footer);
        protoAdapter.encodeWithTag(writer, 6, value.allow_popups);
        WebviewBlocker.NavigationHeader.ADAPTER.encodeWithTag(writer, 5, value.navigation_header);
        getMetadataAdapter().encodeWithTag(writer, 4, value.metadata);
        WebviewBlocker.CookieField.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.cookie_fields);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(writer, 2, value.callback_url);
        protoAdapter2.encodeWithTag(writer, 1, value.url);
    }
}
