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
public final class ExternalAppLink$AppLinkIOS$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExternalAppLink.AppLinkIOS((String) obj, (String) obj2, (AppVersion) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ExternalAppLink.AppLinkIOS appLinkIOS = (ExternalAppLink.AppLinkIOS) obj;
        reverseProtoWriter.getClass();
        appLinkIOS.getClass();
        reverseProtoWriter.writeBytes(appLinkIOS.unknownFields());
        AppVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 3, appLinkIOS.min_app_version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appLinkIOS.app_store_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, appLinkIOS.app_link_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExternalAppLink.AppLinkIOS appLinkIOS = (ExternalAppLink.AppLinkIOS) obj;
        appLinkIOS.getClass();
        int size$okio = appLinkIOS.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AppVersion.ADAPTER.encodedSizeWithTag(3, appLinkIOS.min_app_version) + protoAdapter.encodedSizeWithTag(2, appLinkIOS.app_store_url) + protoAdapter.encodedSizeWithTag(1, appLinkIOS.app_link_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExternalAppLink.AppLinkIOS appLinkIOS = (ExternalAppLink.AppLinkIOS) obj;
        appLinkIOS.getClass();
        AppVersion appVersion = appLinkIOS.min_app_version;
        AppVersion appVersion2 = appVersion != null ? (AppVersion) AppVersion.ADAPTER.redact(appVersion) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = appLinkIOS.app_link_url;
        String str2 = appLinkIOS.app_store_url;
        byteString.getClass();
        return new ExternalAppLink.AppLinkIOS(str, str2, appVersion2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExternalAppLink.AppLinkIOS appLinkIOS = (ExternalAppLink.AppLinkIOS) obj;
        appLinkIOS.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, appLinkIOS.app_link_url);
        protoAdapter.encodeWithTag(protoWriter, 2, appLinkIOS.app_store_url);
        AppVersion.ADAPTER.encodeWithTag(protoWriter, 3, appLinkIOS.min_app_version);
        protoWriter.writeBytes(appLinkIOS.unknownFields());
    }
}
