package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiFooter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUiFooter((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUiFooter performanceDetailsUiFooter = (PerformanceDetailsUiFooter) obj;
        reverseProtoWriter.getClass();
        performanceDetailsUiFooter.getClass();
        ByteString unknownFields = performanceDetailsUiFooter.unknownFields();
        String str = performanceDetailsUiFooter.text;
        reverseProtoWriter.writeBytes(unknownFields);
        LocalizableString localizableString = performanceDetailsUiFooter.localizable_text;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localizableString);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetailsUiFooter performanceDetailsUiFooter = (PerformanceDetailsUiFooter) obj;
        performanceDetailsUiFooter.getClass();
        int size$okio = performanceDetailsUiFooter.unknownFields().getSize$okio();
        String str = performanceDetailsUiFooter.text;
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str);
        }
        LocalizableString localizableString = performanceDetailsUiFooter.localizable_text;
        return localizableString != null ? LocalizableString.ADAPTER.encodedSizeWithTag(2, localizableString) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUiFooter performanceDetailsUiFooter = (PerformanceDetailsUiFooter) obj;
        performanceDetailsUiFooter.getClass();
        LocalizableString localizableString = performanceDetailsUiFooter.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = performanceDetailsUiFooter.text;
        str.getClass();
        byteString.getClass();
        return new PerformanceDetailsUiFooter(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUiFooter performanceDetailsUiFooter = (PerformanceDetailsUiFooter) obj;
        performanceDetailsUiFooter.getClass();
        String str = performanceDetailsUiFooter.text;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        LocalizableString localizableString = performanceDetailsUiFooter.localizable_text;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, localizableString);
        }
        protoWriter.writeBytes(performanceDetailsUiFooter.unknownFields());
    }
}
