package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.SettingsCategory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SettingsCategory$ProgressBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SettingsCategory.ProgressBar((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, (Double) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj5 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SettingsCategory.ProgressBar progressBar = (SettingsCategory.ProgressBar) obj;
        reverseProtoWriter.getClass();
        progressBar.getClass();
        reverseProtoWriter.writeBytes(progressBar.unknownFields());
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, progressBar.progress);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, progressBar.localizable_secondary_display_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, progressBar.secondary_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, progressBar.localizable_primary_display_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, progressBar.primary_display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SettingsCategory.ProgressBar progressBar = (SettingsCategory.ProgressBar) obj;
        progressBar.getClass();
        int size$okio = progressBar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, progressBar.primary_display_text) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return ProtoAdapter.DOUBLE.encodedSizeWithTag(3, progressBar.progress) + protoAdapter2.encodedSizeWithTag(5, progressBar.localizable_secondary_display_text) + protoAdapter.encodedSizeWithTag(2, progressBar.secondary_display_text) + protoAdapter2.encodedSizeWithTag(4, progressBar.localizable_primary_display_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SettingsCategory.ProgressBar progressBar = (SettingsCategory.ProgressBar) obj;
        progressBar.getClass();
        LocalizableString localizableString = progressBar.localizable_primary_display_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = progressBar.localizable_secondary_display_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = progressBar.primary_display_text;
        String str2 = progressBar.secondary_display_text;
        Double d = progressBar.progress;
        byteString.getClass();
        return new SettingsCategory.ProgressBar(str, localizableString2, str2, localizableString4, d, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SettingsCategory.ProgressBar progressBar = (SettingsCategory.ProgressBar) obj;
        progressBar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, progressBar.primary_display_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, progressBar.localizable_primary_display_text);
        protoAdapter.encodeWithTag(protoWriter, 2, progressBar.secondary_display_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, progressBar.localizable_secondary_display_text);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, progressBar.progress);
        protoWriter.writeBytes(progressBar.unknownFields());
    }
}
