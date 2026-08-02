package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExternalAppLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExternalAppLink((ExternalAppLink.AppLinkAndroid) obj, (ExternalAppLink.AppLinkIOS) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ExternalAppLink.AppLinkAndroid.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ExternalAppLink.AppLinkIOS.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExternalAppLink externalAppLink = (ExternalAppLink) obj;
        reverseProtoWriter.getClass();
        externalAppLink.getClass();
        reverseProtoWriter.writeBytes(externalAppLink.unknownFields());
        ExternalAppLink.AppLinkIOS.ADAPTER.encodeWithTag(reverseProtoWriter, 2, externalAppLink.ios);
        ExternalAppLink.AppLinkAndroid.ADAPTER.encodeWithTag(reverseProtoWriter, 1, externalAppLink.f1256android);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalAppLink externalAppLink = (ExternalAppLink) obj;
        externalAppLink.getClass();
        return ExternalAppLink.AppLinkIOS.ADAPTER.encodedSizeWithTag(2, externalAppLink.ios) + ExternalAppLink.AppLinkAndroid.ADAPTER.encodedSizeWithTag(1, externalAppLink.f1256android) + externalAppLink.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalAppLink externalAppLink = (ExternalAppLink) obj;
        externalAppLink.getClass();
        ExternalAppLink.AppLinkAndroid appLinkAndroid = externalAppLink.f1256android;
        ExternalAppLink.AppLinkAndroid appLinkAndroid2 = appLinkAndroid != null ? (ExternalAppLink.AppLinkAndroid) ExternalAppLink.AppLinkAndroid.ADAPTER.redact(appLinkAndroid) : null;
        ExternalAppLink.AppLinkIOS appLinkIOS = externalAppLink.ios;
        ExternalAppLink.AppLinkIOS appLinkIOS2 = appLinkIOS != null ? (ExternalAppLink.AppLinkIOS) ExternalAppLink.AppLinkIOS.ADAPTER.redact(appLinkIOS) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ExternalAppLink(appLinkAndroid2, appLinkIOS2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalAppLink externalAppLink = (ExternalAppLink) obj;
        externalAppLink.getClass();
        ExternalAppLink.AppLinkAndroid.ADAPTER.encodeWithTag(protoWriter, 1, externalAppLink.f1256android);
        ExternalAppLink.AppLinkIOS.ADAPTER.encodeWithTag(protoWriter, 2, externalAppLink.ios);
        protoWriter.writeBytes(externalAppLink.unknownFields());
    }
}
