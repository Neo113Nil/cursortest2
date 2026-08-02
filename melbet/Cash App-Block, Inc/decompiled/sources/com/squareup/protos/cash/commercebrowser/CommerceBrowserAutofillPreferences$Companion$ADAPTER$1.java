package com.squareup.protos.cash.commercebrowser;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CommerceBrowserAutofillPreferences$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CommerceBrowserAutofillPreferences((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) obj;
        reverseProtoWriter.getClass();
        commerceBrowserAutofillPreferences.getClass();
        reverseProtoWriter.writeBytes(commerceBrowserAutofillPreferences.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, commerceBrowserAutofillPreferences.opt_out);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) obj;
        commerceBrowserAutofillPreferences.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, commerceBrowserAutofillPreferences.opt_out) + commerceBrowserAutofillPreferences.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) obj;
        commerceBrowserAutofillPreferences.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = commerceBrowserAutofillPreferences.opt_out;
        byteString.getClass();
        return new CommerceBrowserAutofillPreferences(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) obj;
        commerceBrowserAutofillPreferences.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, commerceBrowserAutofillPreferences.opt_out);
        protoWriter.writeBytes(commerceBrowserAutofillPreferences.unknownFields());
    }
}
