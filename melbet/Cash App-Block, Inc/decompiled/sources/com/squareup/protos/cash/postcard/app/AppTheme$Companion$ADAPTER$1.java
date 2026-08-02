package com.squareup.protos.cash.postcard.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppTheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppTheme((AppThemeName) obj, (AppThemeState) obj2, (LocalizedString) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AppThemeName.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = AppThemeState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppTheme appTheme = (AppTheme) obj;
        reverseProtoWriter.getClass();
        appTheme.getClass();
        reverseProtoWriter.writeBytes(appTheme.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, appTheme.finish_action);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, appTheme.finish_button_text);
        AppThemeState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, appTheme.availability_state);
        AppThemeName.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appTheme.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppTheme appTheme = (AppTheme) obj;
        appTheme.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, appTheme.finish_action) + LocalizedString.ADAPTER.encodedSizeWithTag(3, appTheme.finish_button_text) + AppThemeState.ADAPTER.encodedSizeWithTag(2, appTheme.availability_state) + AppThemeName.ADAPTER.encodedSizeWithTag(1, appTheme.name) + appTheme.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppTheme appTheme = (AppTheme) obj;
        appTheme.getClass();
        LocalizedString localizedString = appTheme.finish_button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        AppThemeName appThemeName = appTheme.name;
        AppThemeState appThemeState = appTheme.availability_state;
        String str = appTheme.finish_action;
        byteString.getClass();
        return new AppTheme(appThemeName, appThemeState, localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppTheme appTheme = (AppTheme) obj;
        appTheme.getClass();
        AppThemeName.ADAPTER.encodeWithTag(protoWriter, 1, appTheme.name);
        AppThemeState.ADAPTER.encodeWithTag(protoWriter, 2, appTheme.availability_state);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, appTheme.finish_button_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, appTheme.finish_action);
        protoWriter.writeBytes(appTheme.unknownFields());
    }
}
