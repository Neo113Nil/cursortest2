package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalUserIntent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        zzja zzjaVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalUserIntent((String) obj, (String) obj2, (Long) obj3, (Long) obj4, zzjaVar, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    zzjaVar = new LocalUserIntent$Intent$RemoteOrdering((LocalRemoteOrderingIntent) LocalRemoteOrderingIntent.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzjaVar = new LocalUserIntent$Intent$InStoreOrdering((LocalInStoreOrderingIntent) LocalInStoreOrderingIntent.ADAPTER.decode(protoReader));
                    break;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    m.add(LocalErrorResponse.Error.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalUserIntent localUserIntent = (LocalUserIntent) obj;
        reverseProtoWriter.getClass();
        localUserIntent.getClass();
        reverseProtoWriter.writeBytes(localUserIntent.unknownFields());
        zzja zzjaVar = localUserIntent.intent;
        if (zzjaVar instanceof LocalUserIntent$Intent$RemoteOrdering) {
            LocalRemoteOrderingIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((LocalUserIntent$Intent$RemoteOrdering) zzjaVar).value);
        } else if (zzjaVar instanceof LocalUserIntent$Intent$InStoreOrdering) {
            LocalInStoreOrderingIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((LocalUserIntent$Intent$InStoreOrdering) zzjaVar).value);
        } else if (zzjaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, localUserIntent.errors);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localUserIntent.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localUserIntent.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, localUserIntent.brand_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, localUserIntent.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalUserIntent localUserIntent = (LocalUserIntent) obj;
        localUserIntent.getClass();
        int size$okio = localUserIntent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, localUserIntent.brand_token) + protoAdapter.encodedSizeWithTag(1, localUserIntent.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(4, localUserIntent.updated_at) + protoAdapter2.encodedSizeWithTag(3, localUserIntent.created_at) + encodedSizeWithTag2;
        zzja zzjaVar = localUserIntent.intent;
        if (zzjaVar instanceof LocalUserIntent$Intent$RemoteOrdering) {
            encodedSizeWithTag = LocalRemoteOrderingIntent.ADAPTER.encodedSizeWithTag(5, ((LocalUserIntent$Intent$RemoteOrdering) zzjaVar).value);
        } else {
            if (!(zzjaVar instanceof LocalUserIntent$Intent$InStoreOrdering)) {
                if (zzjaVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return LocalErrorResponse.Error.ADAPTER.asRepeated().encodedSizeWithTag(8, localUserIntent.errors) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = LocalInStoreOrderingIntent.ADAPTER.encodedSizeWithTag(6, ((LocalUserIntent$Intent$InStoreOrdering) zzjaVar).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return LocalErrorResponse.Error.ADAPTER.asRepeated().encodedSizeWithTag(8, localUserIntent.errors) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalUserIntent localUserIntent = (LocalUserIntent) obj;
        localUserIntent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localUserIntent.errors, LocalErrorResponse.Error.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = localUserIntent.token;
        String str2 = localUserIntent.brand_token;
        Long l = localUserIntent.created_at;
        Long l2 = localUserIntent.updated_at;
        zzja zzjaVar = localUserIntent.intent;
        byteString.getClass();
        return new LocalUserIntent(str, str2, l, l2, zzjaVar, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalUserIntent localUserIntent = (LocalUserIntent) obj;
        localUserIntent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localUserIntent.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localUserIntent.brand_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, localUserIntent.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 4, localUserIntent.updated_at);
        LocalErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, localUserIntent.errors);
        zzja zzjaVar = localUserIntent.intent;
        if (zzjaVar instanceof LocalUserIntent$Intent$RemoteOrdering) {
            LocalRemoteOrderingIntent.ADAPTER.encodeWithTag(protoWriter, 5, ((LocalUserIntent$Intent$RemoteOrdering) zzjaVar).value);
        } else if (zzjaVar instanceof LocalUserIntent$Intent$InStoreOrdering) {
            LocalInStoreOrderingIntent.ADAPTER.encodeWithTag(protoWriter, 6, ((LocalUserIntent$Intent$InStoreOrdering) zzjaVar).value);
        } else if (zzjaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localUserIntent.unknownFields());
    }
}
