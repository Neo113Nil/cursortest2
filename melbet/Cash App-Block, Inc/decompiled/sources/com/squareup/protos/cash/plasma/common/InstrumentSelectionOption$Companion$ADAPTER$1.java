package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ErrorEvent.Csp.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentSelectionOption(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new InstrumentSelectionOption$SelectionOption$NewLink((NewLinkSelectionOption) NewLinkSelectionOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                companion = new InstrumentSelectionOption$SelectionOption$ReplaceLink((ReplaceLinkSelectionOption) ReplaceLinkSelectionOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                companion = new InstrumentSelectionOption$SelectionOption$ExistingLink((ExistingLinkSelectionOption) ExistingLinkSelectionOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                companion = new InstrumentSelectionOption$SelectionOption$DigitalWallet((DigitalWalletSelectionOption) DigitalWalletSelectionOption.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new InstrumentSelectionOption$SelectionOption$ExistingCustom((ExistingCustomSelectionOption) ExistingCustomSelectionOption.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentSelectionOption instrumentSelectionOption = (InstrumentSelectionOption) obj;
        reverseProtoWriter.getClass();
        instrumentSelectionOption.getClass();
        reverseProtoWriter.writeBytes(instrumentSelectionOption.unknownFields());
        ErrorEvent.Csp.Companion companion = instrumentSelectionOption.selection_option;
        if (companion instanceof InstrumentSelectionOption$SelectionOption$NewLink) {
            NewLinkSelectionOption.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((InstrumentSelectionOption$SelectionOption$NewLink) companion).value);
            return;
        }
        if (companion instanceof InstrumentSelectionOption$SelectionOption$ReplaceLink) {
            ReplaceLinkSelectionOption.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InstrumentSelectionOption$SelectionOption$ReplaceLink) companion).value);
            return;
        }
        if (companion instanceof InstrumentSelectionOption$SelectionOption$ExistingLink) {
            ExistingLinkSelectionOption.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((InstrumentSelectionOption$SelectionOption$ExistingLink) companion).value);
            return;
        }
        if (companion instanceof InstrumentSelectionOption$SelectionOption$DigitalWallet) {
            DigitalWalletSelectionOption.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((InstrumentSelectionOption$SelectionOption$DigitalWallet) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ExistingCustom) {
            ExistingCustomSelectionOption.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((InstrumentSelectionOption$SelectionOption$ExistingCustom) companion).value);
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InstrumentSelectionOption instrumentSelectionOption = (InstrumentSelectionOption) obj;
        instrumentSelectionOption.getClass();
        int size$okio = instrumentSelectionOption.unknownFields().getSize$okio();
        ErrorEvent.Csp.Companion companion = instrumentSelectionOption.selection_option;
        if (companion instanceof InstrumentSelectionOption$SelectionOption$NewLink) {
            encodedSizeWithTag = NewLinkSelectionOption.ADAPTER.encodedSizeWithTag(1, ((InstrumentSelectionOption$SelectionOption$NewLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ReplaceLink) {
            encodedSizeWithTag = ReplaceLinkSelectionOption.ADAPTER.encodedSizeWithTag(2, ((InstrumentSelectionOption$SelectionOption$ReplaceLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ExistingLink) {
            encodedSizeWithTag = ExistingLinkSelectionOption.ADAPTER.encodedSizeWithTag(3, ((InstrumentSelectionOption$SelectionOption$ExistingLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$DigitalWallet) {
            encodedSizeWithTag = DigitalWalletSelectionOption.ADAPTER.encodedSizeWithTag(4, ((InstrumentSelectionOption$SelectionOption$DigitalWallet) companion).value);
        } else {
            if (!(companion instanceof InstrumentSelectionOption$SelectionOption$ExistingCustom)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ExistingCustomSelectionOption.ADAPTER.encodedSizeWithTag(5, ((InstrumentSelectionOption$SelectionOption$ExistingCustom) companion).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentSelectionOption instrumentSelectionOption = (InstrumentSelectionOption) obj;
        instrumentSelectionOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        ErrorEvent.Csp.Companion companion = instrumentSelectionOption.selection_option;
        byteString.getClass();
        return new InstrumentSelectionOption(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentSelectionOption instrumentSelectionOption = (InstrumentSelectionOption) obj;
        instrumentSelectionOption.getClass();
        ErrorEvent.Csp.Companion companion = instrumentSelectionOption.selection_option;
        if (companion instanceof InstrumentSelectionOption$SelectionOption$NewLink) {
            NewLinkSelectionOption.ADAPTER.encodeWithTag(protoWriter, 1, ((InstrumentSelectionOption$SelectionOption$NewLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ReplaceLink) {
            ReplaceLinkSelectionOption.ADAPTER.encodeWithTag(protoWriter, 2, ((InstrumentSelectionOption$SelectionOption$ReplaceLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ExistingLink) {
            ExistingLinkSelectionOption.ADAPTER.encodeWithTag(protoWriter, 3, ((InstrumentSelectionOption$SelectionOption$ExistingLink) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$DigitalWallet) {
            DigitalWalletSelectionOption.ADAPTER.encodeWithTag(protoWriter, 4, ((InstrumentSelectionOption$SelectionOption$DigitalWallet) companion).value);
        } else if (companion instanceof InstrumentSelectionOption$SelectionOption$ExistingCustom) {
            ExistingCustomSelectionOption.ADAPTER.encodeWithTag(protoWriter, 5, ((InstrumentSelectionOption$SelectionOption$ExistingCustom) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(instrumentSelectionOption.unknownFields());
    }
}
