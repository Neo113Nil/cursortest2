package com.squareup.protos.cash.postcard.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAppThemesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppThemesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppTheme.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppThemesResponse getAppThemesResponse = (GetAppThemesResponse) obj;
        reverseProtoWriter.getClass();
        getAppThemesResponse.getClass();
        reverseProtoWriter.writeBytes(getAppThemesResponse.unknownFields());
        AppTheme.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAppThemesResponse.app_themes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppThemesResponse getAppThemesResponse = (GetAppThemesResponse) obj;
        getAppThemesResponse.getClass();
        return AppTheme.ADAPTER.asRepeated().encodedSizeWithTag(1, getAppThemesResponse.app_themes) + getAppThemesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppThemesResponse getAppThemesResponse = (GetAppThemesResponse) obj;
        getAppThemesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAppThemesResponse.app_themes, AppTheme.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAppThemesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppThemesResponse getAppThemesResponse = (GetAppThemesResponse) obj;
        getAppThemesResponse.getClass();
        AppTheme.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAppThemesResponse.app_themes);
        protoWriter.writeBytes(getAppThemesResponse.unknownFields());
    }
}
