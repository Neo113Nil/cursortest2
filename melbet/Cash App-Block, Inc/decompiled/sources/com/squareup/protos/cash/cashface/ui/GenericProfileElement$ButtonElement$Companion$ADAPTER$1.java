package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.CartItemCounterViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = null;
        CartItemCounterViewModel.Mode mode = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ButtonElement((String) obj, genericProfileElement$ButtonElement$Style$Tertiary, mode, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                genericProfileElement$ButtonElement$Style$Tertiary = new GenericProfileElement$ButtonElement$Style$Tertiary((GenericProfileElement.ButtonElement.TertiaryStyle) GenericProfileElement.ButtonElement.TertiaryStyle.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                mode = new GenericProfileElement$ButtonElement$Action$Block((GenericProfileElement.ButtonElement.BlockAction) GenericProfileElement.ButtonElement.BlockAction.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                mode = new GenericProfileElement$ButtonElement$Action$Report((GenericProfileElement.ButtonElement.ReportAction) GenericProfileElement.ButtonElement.ReportAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                mode = new GenericProfileElement$ButtonElement$Action$ViewChange((GenericProfileElement.ButtonElement.ViewChangeAction) GenericProfileElement.ButtonElement.ViewChangeAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ButtonElement buttonElement = (GenericProfileElement.ButtonElement) obj;
        reverseProtoWriter.getClass();
        buttonElement.getClass();
        reverseProtoWriter.writeBytes(buttonElement.unknownFields());
        CartItemCounterViewModel.Mode mode = buttonElement.action;
        if (mode instanceof GenericProfileElement$ButtonElement$Action$Block) {
            GenericProfileElement.ButtonElement.BlockAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GenericProfileElement$ButtonElement$Action$Block) mode).value);
        } else if (mode instanceof GenericProfileElement$ButtonElement$Action$Report) {
            GenericProfileElement.ButtonElement.ReportAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GenericProfileElement$ButtonElement$Action$Report) mode).value);
        } else if (mode instanceof GenericProfileElement$ButtonElement$Action$ViewChange) {
            GenericProfileElement.ButtonElement.ViewChangeAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GenericProfileElement$ButtonElement$Action$ViewChange) mode).value);
        } else if (mode != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = buttonElement.style;
        if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            GenericProfileElement.ButtonElement.TertiaryStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, genericProfileElement$ButtonElement$Style$Tertiary.value);
        } else if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, buttonElement.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GenericProfileElement.ButtonElement buttonElement = (GenericProfileElement.ButtonElement) obj;
        buttonElement.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(1, buttonElement.title) + buttonElement.unknownFields().getSize$okio();
        GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = buttonElement.style;
        if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            encodedSizeWithTag2 += GenericProfileElement.ButtonElement.TertiaryStyle.ADAPTER.encodedSizeWithTag(2, genericProfileElement$ButtonElement$Style$Tertiary.value);
        } else if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        CartItemCounterViewModel.Mode mode = buttonElement.action;
        if (mode instanceof GenericProfileElement$ButtonElement$Action$Block) {
            encodedSizeWithTag = GenericProfileElement.ButtonElement.BlockAction.ADAPTER.encodedSizeWithTag(3, ((GenericProfileElement$ButtonElement$Action$Block) mode).value);
        } else if (mode instanceof GenericProfileElement$ButtonElement$Action$Report) {
            encodedSizeWithTag = GenericProfileElement.ButtonElement.ReportAction.ADAPTER.encodedSizeWithTag(4, ((GenericProfileElement$ButtonElement$Action$Report) mode).value);
        } else {
            if (!(mode instanceof GenericProfileElement$ButtonElement$Action$ViewChange)) {
                if (mode == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GenericProfileElement.ButtonElement.ViewChangeAction.ADAPTER.encodedSizeWithTag(5, ((GenericProfileElement$ButtonElement$Action$ViewChange) mode).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ButtonElement buttonElement = (GenericProfileElement.ButtonElement) obj;
        buttonElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = buttonElement.style;
        CartItemCounterViewModel.Mode mode = buttonElement.action;
        byteString.getClass();
        return new GenericProfileElement.ButtonElement(null, genericProfileElement$ButtonElement$Style$Tertiary, mode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ButtonElement buttonElement = (GenericProfileElement.ButtonElement) obj;
        buttonElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonElement.title);
        GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = buttonElement.style;
        if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            GenericProfileElement.ButtonElement.TertiaryStyle.ADAPTER.encodeWithTag(protoWriter, 2, genericProfileElement$ButtonElement$Style$Tertiary.value);
        } else if (genericProfileElement$ButtonElement$Style$Tertiary != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CartItemCounterViewModel.Mode mode = buttonElement.action;
        if (mode instanceof GenericProfileElement$ButtonElement$Action$Block) {
            GenericProfileElement.ButtonElement.BlockAction.ADAPTER.encodeWithTag(protoWriter, 3, ((GenericProfileElement$ButtonElement$Action$Block) mode).value);
        } else if (mode instanceof GenericProfileElement$ButtonElement$Action$Report) {
            GenericProfileElement.ButtonElement.ReportAction.ADAPTER.encodeWithTag(protoWriter, 4, ((GenericProfileElement$ButtonElement$Action$Report) mode).value);
        } else if (mode instanceof GenericProfileElement$ButtonElement$Action$ViewChange) {
            GenericProfileElement.ButtonElement.ViewChangeAction.ADAPTER.encodeWithTag(protoWriter, 5, ((GenericProfileElement$ButtonElement$Action$ViewChange) mode).value);
        } else if (mode != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(buttonElement.unknownFields());
    }
}
