package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$MoreInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = "";
        Object obj3 = obj2;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = obj3;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUiSection.Row.MoreInfo((String) obj, (String) obj7, (String) obj2, (String) obj3, (LocalizableString) obj4, (LocalizableString) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = (PerformanceDetailsUiSection.Row.MoreInfo) obj;
        reverseProtoWriter.getClass();
        moreInfo.getClass();
        ByteString unknownFields = moreInfo.unknownFields();
        String str = moreInfo.title;
        String str2 = moreInfo.text;
        String str3 = moreInfo.url;
        String str4 = moreInfo.url_text;
        reverseProtoWriter.writeBytes(unknownFields);
        LocalizableString localizableString = moreInfo.localizable_url_text;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localizableString);
        }
        LocalizableString localizableString2 = moreInfo.localizable_text;
        if (localizableString2 != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localizableString2);
        }
        LocalizableString localizableString3 = moreInfo.localizable_title;
        if (localizableString3 != null) {
            LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localizableString3);
        }
        if (!Intrinsics.areEqual(str4, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, str4);
        }
        if (!Intrinsics.areEqual(str3, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, str3);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = (PerformanceDetailsUiSection.Row.MoreInfo) obj;
        moreInfo.getClass();
        ByteString unknownFields = moreInfo.unknownFields();
        String str = moreInfo.url_text;
        String str2 = moreInfo.url;
        String str3 = moreInfo.text;
        int size$okio = unknownFields.getSize$okio();
        String str4 = moreInfo.title;
        if (!Intrinsics.areEqual(str4, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str4);
        }
        if (!Intrinsics.areEqual(str3, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(2, str3);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(3, str2);
        }
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(4, str);
        }
        LocalizableString localizableString = moreInfo.localizable_title;
        if (localizableString != null) {
            size$okio += LocalizableString.ADAPTER.encodedSizeWithTag(5, localizableString);
        }
        LocalizableString localizableString2 = moreInfo.localizable_text;
        if (localizableString2 != null) {
            size$okio += LocalizableString.ADAPTER.encodedSizeWithTag(6, localizableString2);
        }
        LocalizableString localizableString3 = moreInfo.localizable_url_text;
        return localizableString3 != null ? LocalizableString.ADAPTER.encodedSizeWithTag(7, localizableString3) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = (PerformanceDetailsUiSection.Row.MoreInfo) obj;
        moreInfo.getClass();
        LocalizableString localizableString = moreInfo.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = moreInfo.localizable_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = moreInfo.localizable_url_text;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = moreInfo.title;
        String str2 = moreInfo.text;
        String str3 = moreInfo.url;
        String str4 = moreInfo.url_text;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        byteString.getClass();
        return new PerformanceDetailsUiSection.Row.MoreInfo(str, str2, str3, str4, localizableString2, localizableString4, localizableString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUiSection.Row.MoreInfo moreInfo = (PerformanceDetailsUiSection.Row.MoreInfo) obj;
        moreInfo.getClass();
        String str = moreInfo.title;
        String str2 = moreInfo.url_text;
        String str3 = moreInfo.url;
        String str4 = moreInfo.text;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        if (!Intrinsics.areEqual(str4, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str4);
        }
        if (!Intrinsics.areEqual(str3, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str3);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str2);
        }
        LocalizableString localizableString = moreInfo.localizable_title;
        if (localizableString != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, localizableString);
        }
        LocalizableString localizableString2 = moreInfo.localizable_text;
        if (localizableString2 != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 6, localizableString2);
        }
        LocalizableString localizableString3 = moreInfo.localizable_url_text;
        if (localizableString3 != null) {
            LocalizableString.ADAPTER.encodeWithTag(protoWriter, 7, localizableString3);
        }
        protoWriter.writeBytes(moreInfo.unknownFields());
    }
}
