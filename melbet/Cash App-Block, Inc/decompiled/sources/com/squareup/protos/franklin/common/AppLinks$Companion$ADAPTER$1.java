package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppLinks$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppLinks((AppLinkAndroid) obj, (AppLinkIOS) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AppLinkAndroid.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(AppLinkIOS.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppLinks appLinks = (AppLinks) obj;
        reverseProtoWriter.getClass();
        appLinks.getClass();
        reverseProtoWriter.writeBytes(appLinks.unknownFields());
        AppLinkIOS.ADAPTER.encodeWithTag(reverseProtoWriter, 2, appLinks.ios);
        AppLinkAndroid.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appLinks.f1371android);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppLinks appLinks = (AppLinks) obj;
        appLinks.getClass();
        return AppLinkIOS.ADAPTER.encodedSizeWithTag(2, appLinks.ios) + AppLinkAndroid.ADAPTER.encodedSizeWithTag(1, appLinks.f1371android) + appLinks.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppLinks appLinks = (AppLinks) obj;
        appLinks.getClass();
        AppLinkAndroid appLinkAndroid = appLinks.f1371android;
        AppLinkAndroid appLinkAndroid2 = appLinkAndroid != null ? (AppLinkAndroid) AppLinkAndroid.ADAPTER.redact(appLinkAndroid) : null;
        AppLinkIOS appLinkIOS = appLinks.ios;
        AppLinkIOS appLinkIOS2 = appLinkIOS != null ? (AppLinkIOS) AppLinkIOS.ADAPTER.redact(appLinkIOS) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AppLinks(appLinkAndroid2, appLinkIOS2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppLinks appLinks = (AppLinks) obj;
        appLinks.getClass();
        AppLinkAndroid.ADAPTER.encodeWithTag(protoWriter, 1, appLinks.f1371android);
        AppLinkIOS.ADAPTER.encodeWithTag(protoWriter, 2, appLinks.ios);
        protoWriter.writeBytes(appLinks.unknownFields());
    }
}
