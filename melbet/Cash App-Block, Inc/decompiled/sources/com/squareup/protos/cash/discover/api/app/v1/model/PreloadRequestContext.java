package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import coil3.UriKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreloadRequestContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreloadRequestContext> CREATOR;
    public final Map parameters;
    public final UriKt request;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PreloadRequestContext.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.discover.api.app.v1.model.PreloadRequestContext$Companion$ADAPTER$1
            public final Lazy parametersAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.parametersAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(5));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                UriKt uriKt = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new PreloadRequestContext(uriKt, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        uriKt = new PreloadRequestContext$Request$ShopBrowseRequest((ShopBrowseRequest) ShopBrowseRequest.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        uriKt = new PreloadRequestContext$Request$ShopDynamicScreenRequest((ShopDynamicScreenRequest) ShopDynamicScreenRequest.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.putAll((Map) ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PreloadRequestContext preloadRequestContext = (PreloadRequestContext) obj;
                reverseProtoWriter.getClass();
                preloadRequestContext.getClass();
                reverseProtoWriter.writeBytes(preloadRequestContext.unknownFields());
                UriKt uriKt = preloadRequestContext.request;
                if (uriKt instanceof PreloadRequestContext$Request$ShopBrowseRequest) {
                    ShopBrowseRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PreloadRequestContext$Request$ShopBrowseRequest) uriKt).value);
                } else if (uriKt instanceof PreloadRequestContext$Request$ShopDynamicScreenRequest) {
                    ShopDynamicScreenRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PreloadRequestContext$Request$ShopDynamicScreenRequest) uriKt).value);
                } else if (uriKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 4, preloadRequestContext.parameters);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                PreloadRequestContext preloadRequestContext = (PreloadRequestContext) obj;
                preloadRequestContext.getClass();
                int size$okio = preloadRequestContext.unknownFields().getSize$okio();
                UriKt uriKt = preloadRequestContext.request;
                if (uriKt instanceof PreloadRequestContext$Request$ShopBrowseRequest) {
                    encodedSizeWithTag = ShopBrowseRequest.ADAPTER.encodedSizeWithTag(2, ((PreloadRequestContext$Request$ShopBrowseRequest) uriKt).value);
                } else {
                    if (!(uriKt instanceof PreloadRequestContext$Request$ShopDynamicScreenRequest)) {
                        if (uriKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodedSizeWithTag(4, preloadRequestContext.parameters) + size$okio;
                    }
                    encodedSizeWithTag = ShopDynamicScreenRequest.ADAPTER.encodedSizeWithTag(3, ((PreloadRequestContext$Request$ShopDynamicScreenRequest) uriKt).value);
                }
                size$okio += encodedSizeWithTag;
                return ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodedSizeWithTag(4, preloadRequestContext.parameters) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PreloadRequestContext preloadRequestContext = (PreloadRequestContext) obj;
                preloadRequestContext.getClass();
                ByteString byteString = ByteString.EMPTY;
                UriKt uriKt = preloadRequestContext.request;
                Map map = preloadRequestContext.parameters;
                map.getClass();
                byteString.getClass();
                return new PreloadRequestContext(uriKt, map, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PreloadRequestContext preloadRequestContext = (PreloadRequestContext) obj;
                preloadRequestContext.getClass();
                ((ProtoAdapter) this.parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 4, preloadRequestContext.parameters);
                UriKt uriKt = preloadRequestContext.request;
                if (uriKt instanceof PreloadRequestContext$Request$ShopBrowseRequest) {
                    ShopBrowseRequest.ADAPTER.encodeWithTag(protoWriter, 2, ((PreloadRequestContext$Request$ShopBrowseRequest) uriKt).value);
                } else if (uriKt instanceof PreloadRequestContext$Request$ShopDynamicScreenRequest) {
                    ShopDynamicScreenRequest.ADAPTER.encodeWithTag(protoWriter, 3, ((PreloadRequestContext$Request$ShopDynamicScreenRequest) uriKt).value);
                } else if (uriKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(preloadRequestContext.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadRequestContext(UriKt uriKt, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.request = uriKt;
        this.parameters = TransactorKt.immutableCopyOf("parameters", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreloadRequestContext)) {
            return false;
        }
        PreloadRequestContext preloadRequestContext = (PreloadRequestContext) obj;
        return Intrinsics.areEqual(unknownFields(), preloadRequestContext.unknownFields()) && Intrinsics.areEqual(this.request, preloadRequestContext.request) && Intrinsics.areEqual(this.parameters, preloadRequestContext.parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UriKt uriKt = this.request;
        int hashCode2 = this.parameters.hashCode() + ((hashCode + (uriKt != null ? uriKt.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(8);
        EmptyMap.INSTANCE.getClass();
        builder.f1268type = this.request;
        builder.details = this.parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UriKt uriKt = this.request;
        if (uriKt != null) {
            arrayList.add("request=" + uriKt);
        }
        Map map = this.parameters;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("parameters=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreloadRequestContext{", "}", 0, null, null, 56);
    }
}
