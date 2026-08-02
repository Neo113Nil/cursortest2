package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdc;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.RequestContext;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ClabeEntryRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClabeEntryRequest> CREATOR;
    public final zzdc clabe_value;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClabeEntryRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ClabeEntryRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                zzdc zzdcVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ClabeEntryRequest((RequestContext) obj, zzdcVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        zzdcVar = new ClabeEntryRequest$ClabeValue$ClabeNumber((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        zzdcVar = new ClabeEntryRequest$ClabeValue$ClabeToken((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzdcVar = new ClabeEntryRequest$ClabeValue$SecondaryActionId((String) ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ClabeEntryRequest clabeEntryRequest = (ClabeEntryRequest) obj;
                reverseProtoWriter.getClass();
                clabeEntryRequest.getClass();
                reverseProtoWriter.writeBytes(clabeEntryRequest.unknownFields());
                zzdc zzdcVar = clabeEntryRequest.clabe_value;
                if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeNumber) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((ClabeEntryRequest$ClabeValue$ClabeNumber) zzdcVar).value);
                } else if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeToken) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((ClabeEntryRequest$ClabeValue$ClabeToken) zzdcVar).value);
                } else if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$SecondaryActionId) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((ClabeEntryRequest$ClabeValue$SecondaryActionId) zzdcVar).value);
                } else if (zzdcVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clabeEntryRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ClabeEntryRequest clabeEntryRequest = (ClabeEntryRequest) obj;
                clabeEntryRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, clabeEntryRequest.request_context) + clabeEntryRequest.unknownFields().getSize$okio();
                zzdc zzdcVar = clabeEntryRequest.clabe_value;
                if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeNumber) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, ((ClabeEntryRequest$ClabeValue$ClabeNumber) zzdcVar).value) + encodedSizeWithTag;
                }
                if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeToken) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, ((ClabeEntryRequest$ClabeValue$ClabeToken) zzdcVar).value) + encodedSizeWithTag;
                }
                if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$SecondaryActionId) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(4, ((ClabeEntryRequest$ClabeValue$SecondaryActionId) zzdcVar).value) + encodedSizeWithTag;
                }
                if (zzdcVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ClabeEntryRequest clabeEntryRequest = (ClabeEntryRequest) obj;
                clabeEntryRequest.getClass();
                RequestContext requestContext = clabeEntryRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ClabeEntryRequest(requestContext2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ClabeEntryRequest clabeEntryRequest = (ClabeEntryRequest) obj;
                clabeEntryRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, clabeEntryRequest.request_context);
                zzdc zzdcVar = clabeEntryRequest.clabe_value;
                if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeNumber) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((ClabeEntryRequest$ClabeValue$ClabeNumber) zzdcVar).value);
                } else if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$ClabeToken) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((ClabeEntryRequest$ClabeValue$ClabeToken) zzdcVar).value);
                } else if (zzdcVar instanceof ClabeEntryRequest$ClabeValue$SecondaryActionId) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ((ClabeEntryRequest$ClabeValue$SecondaryActionId) zzdcVar).value);
                } else if (zzdcVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(clabeEntryRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClabeEntryRequest(RequestContext requestContext, zzdc zzdcVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.clabe_value = zzdcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClabeEntryRequest)) {
            return false;
        }
        ClabeEntryRequest clabeEntryRequest = (ClabeEntryRequest) obj;
        return Intrinsics.areEqual(unknownFields(), clabeEntryRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, clabeEntryRequest.request_context) && Intrinsics.areEqual(this.clabe_value, clabeEntryRequest.clabe_value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzdc zzdcVar = this.clabe_value;
        int hashCode3 = hashCode2 + (zzdcVar != null ? zzdcVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(6);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.clabe_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.clabe_value != null) {
            arrayList.add("clabe_value=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClabeEntryRequest{", "}", 0, null, null, 56);
    }
}
