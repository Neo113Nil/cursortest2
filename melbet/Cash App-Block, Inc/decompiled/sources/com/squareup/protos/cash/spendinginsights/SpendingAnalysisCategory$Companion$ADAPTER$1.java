package com.squareup.protos.cash.spendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SpendingAnalysisCategory$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SpendingAnalysisCategory((LocalizedString) obj, (LocalizedString) obj2, (Image) obj3, (ColoredButton) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ColoredButton.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SpendingAnalysisCategory spendingAnalysisCategory = (SpendingAnalysisCategory) obj;
        reverseProtoWriter.getClass();
        spendingAnalysisCategory.getClass();
        reverseProtoWriter.writeBytes(spendingAnalysisCategory.unknownFields());
        ColoredButton.ADAPTER.encodeWithTag(reverseProtoWriter, 4, spendingAnalysisCategory.button);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, spendingAnalysisCategory.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, spendingAnalysisCategory.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, spendingAnalysisCategory.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SpendingAnalysisCategory spendingAnalysisCategory = (SpendingAnalysisCategory) obj;
        spendingAnalysisCategory.getClass();
        int size$okio = spendingAnalysisCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ColoredButton.ADAPTER.encodedSizeWithTag(4, spendingAnalysisCategory.button) + Image.ADAPTER.encodedSizeWithTag(3, spendingAnalysisCategory.icon) + protoAdapter.encodedSizeWithTag(2, spendingAnalysisCategory.text) + protoAdapter.encodedSizeWithTag(1, spendingAnalysisCategory.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SpendingAnalysisCategory spendingAnalysisCategory = (SpendingAnalysisCategory) obj;
        spendingAnalysisCategory.getClass();
        LocalizedString localizedString = spendingAnalysisCategory.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = spendingAnalysisCategory.text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = spendingAnalysisCategory.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ColoredButton coloredButton = spendingAnalysisCategory.button;
        ColoredButton coloredButton2 = coloredButton != null ? (ColoredButton) ColoredButton.ADAPTER.redact(coloredButton) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SpendingAnalysisCategory(localizedString2, localizedString4, image2, coloredButton2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SpendingAnalysisCategory spendingAnalysisCategory = (SpendingAnalysisCategory) obj;
        spendingAnalysisCategory.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, spendingAnalysisCategory.title);
        protoAdapter.encodeWithTag(protoWriter, 2, spendingAnalysisCategory.text);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, spendingAnalysisCategory.icon);
        ColoredButton.ADAPTER.encodeWithTag(protoWriter, 4, spendingAnalysisCategory.button);
        protoWriter.writeBytes(spendingAnalysisCategory.unknownFields());
    }
}
