package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUiSection((LocalizableString) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(PerformanceDetailsUiSection.Row.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUiSection performanceDetailsUiSection = (PerformanceDetailsUiSection) obj;
        reverseProtoWriter.getClass();
        performanceDetailsUiSection.getClass();
        ByteString unknownFields = performanceDetailsUiSection.unknownFields();
        String str = performanceDetailsUiSection.title;
        reverseProtoWriter.writeBytes(unknownFields);
        LocalizableString localizableString = performanceDetailsUiSection.localizable_title;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localizableString);
        }
        PerformanceDetailsUiSection.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, performanceDetailsUiSection.rows);
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetailsUiSection performanceDetailsUiSection = (PerformanceDetailsUiSection) obj;
        performanceDetailsUiSection.getClass();
        int size$okio = performanceDetailsUiSection.unknownFields().getSize$okio();
        String str = performanceDetailsUiSection.title;
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str);
        }
        int encodedSizeWithTag = PerformanceDetailsUiSection.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, performanceDetailsUiSection.rows) + size$okio;
        LocalizableString localizableString = performanceDetailsUiSection.localizable_title;
        return localizableString != null ? LocalizableString.ADAPTER.encodedSizeWithTag(3, localizableString) + encodedSizeWithTag : encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUiSection performanceDetailsUiSection = (PerformanceDetailsUiSection) obj;
        performanceDetailsUiSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(performanceDetailsUiSection.rows, PerformanceDetailsUiSection.Row.ADAPTER);
        LocalizableString localizableString = performanceDetailsUiSection.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = performanceDetailsUiSection.title;
        str.getClass();
        byteString.getClass();
        return new PerformanceDetailsUiSection(localizableString2, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUiSection performanceDetailsUiSection = (PerformanceDetailsUiSection) obj;
        performanceDetailsUiSection.getClass();
        String str = performanceDetailsUiSection.title;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        PerformanceDetailsUiSection.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, performanceDetailsUiSection.rows);
        LocalizableString localizableString = performanceDetailsUiSection.localizable_title;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, localizableString);
        }
        protoWriter.writeBytes(performanceDetailsUiSection.unknownFields());
    }
}
