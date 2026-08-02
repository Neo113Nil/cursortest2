package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.SettingsCategory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SettingsCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SettingsCategory((String) obj, (LocalizableString) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(SettingsCategory.ProgressBar.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SettingsCategory settingsCategory = (SettingsCategory) obj;
        reverseProtoWriter.getClass();
        settingsCategory.getClass();
        reverseProtoWriter.writeBytes(settingsCategory.unknownFields());
        SettingsCategory.ProgressBar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, settingsCategory.progress_bars);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, settingsCategory.items);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, settingsCategory.localizable_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, settingsCategory.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SettingsCategory settingsCategory = (SettingsCategory) obj;
        settingsCategory.getClass();
        int size$okio = settingsCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SettingsCategory.ProgressBar.ADAPTER.asRepeated().encodedSizeWithTag(3, settingsCategory.progress_bars) + protoAdapter.asRepeated().encodedSizeWithTag(2, settingsCategory.items) + LocalizableString.ADAPTER.encodedSizeWithTag(4, settingsCategory.localizable_header) + protoAdapter.encodedSizeWithTag(1, settingsCategory.header) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SettingsCategory settingsCategory = (SettingsCategory) obj;
        settingsCategory.getClass();
        LocalizableString localizableString = settingsCategory.localizable_header;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(settingsCategory.progress_bars, SettingsCategory.ProgressBar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = settingsCategory.header;
        List list = settingsCategory.items;
        list.getClass();
        byteString.getClass();
        return new SettingsCategory(str, localizableString2, list, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SettingsCategory settingsCategory = (SettingsCategory) obj;
        settingsCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, settingsCategory.header);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, settingsCategory.localizable_header);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, settingsCategory.items);
        SettingsCategory.ProgressBar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, settingsCategory.progress_bars);
        protoWriter.writeBytes(settingsCategory.unknownFields());
    }
}
