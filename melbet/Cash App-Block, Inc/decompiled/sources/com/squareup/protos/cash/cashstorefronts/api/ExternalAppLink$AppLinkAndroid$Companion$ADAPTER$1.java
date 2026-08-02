package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExternalAppLink$AppLinkAndroid$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExternalAppLink.AppLinkAndroid((String) obj, (String) obj2, (AppVersion) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(AppVersion.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExternalAppLink.AppLinkAndroid appLinkAndroid = (ExternalAppLink.AppLinkAndroid) obj;
        reverseProtoWriter.getClass();
        appLinkAndroid.getClass();
        reverseProtoWriter.writeBytes(appLinkAndroid.unknownFields());
        AppVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 3, appLinkAndroid.min_app_version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appLinkAndroid.app_package);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, appLinkAndroid.app_link_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalAppLink.AppLinkAndroid appLinkAndroid = (ExternalAppLink.AppLinkAndroid) obj;
        appLinkAndroid.getClass();
        int size$okio = appLinkAndroid.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AppVersion.ADAPTER.encodedSizeWithTag(3, appLinkAndroid.min_app_version) + protoAdapter.encodedSizeWithTag(2, appLinkAndroid.app_package) + protoAdapter.encodedSizeWithTag(1, appLinkAndroid.app_link_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalAppLink.AppLinkAndroid appLinkAndroid = (ExternalAppLink.AppLinkAndroid) obj;
        appLinkAndroid.getClass();
        AppVersion appVersion = appLinkAndroid.min_app_version;
        AppVersion appVersion2 = appVersion != null ? (AppVersion) AppVersion.ADAPTER.redact(appVersion) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = appLinkAndroid.app_link_url;
        String str2 = appLinkAndroid.app_package;
        byteString.getClass();
        return new ExternalAppLink.AppLinkAndroid(str, str2, appVersion2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalAppLink.AppLinkAndroid appLinkAndroid = (ExternalAppLink.AppLinkAndroid) obj;
        appLinkAndroid.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, appLinkAndroid.app_link_url);
        protoAdapter.encodeWithTag(protoWriter, 2, appLinkAndroid.app_package);
        AppVersion.ADAPTER.encodeWithTag(protoWriter, 3, appLinkAndroid.min_app_version);
        protoWriter.writeBytes(appLinkAndroid.unknownFields());
    }
}
