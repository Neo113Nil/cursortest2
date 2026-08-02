package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SettingsGroup$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SettingsGroup((LocalizableString) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(SettingsCategory.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SettingsGroup settingsGroup = (SettingsGroup) obj;
        reverseProtoWriter.getClass();
        settingsGroup.getClass();
        reverseProtoWriter.writeBytes(settingsGroup.unknownFields());
        SettingsCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, settingsGroup.settings_categories);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, settingsGroup.localizable_title);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, settingsGroup.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SettingsGroup settingsGroup = (SettingsGroup) obj;
        settingsGroup.getClass();
        return SettingsCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, settingsGroup.settings_categories) + LocalizableString.ADAPTER.encodedSizeWithTag(3, settingsGroup.localizable_title) + ProtoAdapter.STRING.encodedSizeWithTag(1, settingsGroup.title) + settingsGroup.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SettingsGroup settingsGroup = (SettingsGroup) obj;
        settingsGroup.getClass();
        LocalizableString localizableString = settingsGroup.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(settingsGroup.settings_categories, SettingsCategory.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = settingsGroup.title;
        byteString.getClass();
        return new SettingsGroup(localizableString2, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SettingsGroup settingsGroup = (SettingsGroup) obj;
        settingsGroup.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, settingsGroup.title);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, settingsGroup.localizable_title);
        SettingsCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, settingsGroup.settings_categories);
        protoWriter.writeBytes(settingsGroup.unknownFields());
    }
}
