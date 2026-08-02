package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzdi zzdiVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult((String) obj, zzdiVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$AddressResult((SubmitFormRequest.ElementResult.AddressResult) SubmitFormRequest.ElementResult.AddressResult.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$TextInputResult((SubmitFormRequest.ElementResult.TextInputResult) SubmitFormRequest.ElementResult.TextInputResult.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$OptionPickerResult((SubmitFormRequest.ElementResult.OptionPickerResult) SubmitFormRequest.ElementResult.OptionPickerResult.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$CashtagResult((SubmitFormRequest.ElementResult.CashtagResult) SubmitFormRequest.ElementResult.CashtagResult.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$DateInputResult((SubmitFormRequest.ElementResult.DateInputResult) SubmitFormRequest.ElementResult.DateInputResult.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$MoneyInputResult((SubmitFormRequest.ElementResult.MoneyInputResult) SubmitFormRequest.ElementResult.MoneyInputResult.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$EmojiPickerResult((SubmitFormRequest.ElementResult.EmojiPickerResult) SubmitFormRequest.ElementResult.EmojiPickerResult.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult((SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult) SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$WebviewResult((WebViewCallbackInputs) WebViewCallbackInputs.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$CheckBoxResult((SubmitFormRequest.ElementResult.CheckBoxResult) SubmitFormRequest.ElementResult.CheckBoxResult.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$CountrySelectorResult((SubmitFormRequest.ElementResult.CountrySelectorResult) SubmitFormRequest.ElementResult.CountrySelectorResult.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$CellDefaultResult((SubmitFormRequest.ElementResult.CellDefaultResult) SubmitFormRequest.ElementResult.CellDefaultResult.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    zzdiVar = new SubmitFormRequest$ElementResult$Result$EarnerCategoryResult((SubmitFormRequest.ElementResult.EarnerCategoryResult) SubmitFormRequest.ElementResult.EarnerCategoryResult.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult elementResult = (SubmitFormRequest.ElementResult) obj;
        reverseProtoWriter.getClass();
        elementResult.getClass();
        reverseProtoWriter.writeBytes(elementResult.unknownFields());
        zzdi zzdiVar = elementResult.result;
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$AddressResult) {
            SubmitFormRequest.ElementResult.AddressResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SubmitFormRequest$ElementResult$Result$AddressResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$TextInputResult) {
            SubmitFormRequest.ElementResult.TextInputResult.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SubmitFormRequest$ElementResult$Result$TextInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$OptionPickerResult) {
            SubmitFormRequest.ElementResult.OptionPickerResult.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SubmitFormRequest$ElementResult$Result$OptionPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CashtagResult) {
            SubmitFormRequest.ElementResult.CashtagResult.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SubmitFormRequest$ElementResult$Result$CashtagResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$DateInputResult) {
            SubmitFormRequest.ElementResult.DateInputResult.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SubmitFormRequest$ElementResult$Result$DateInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MoneyInputResult) {
            SubmitFormRequest.ElementResult.MoneyInputResult.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((SubmitFormRequest$ElementResult$Result$MoneyInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EmojiPickerResult) {
            SubmitFormRequest.ElementResult.EmojiPickerResult.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SubmitFormRequest$ElementResult$Result$EmojiPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) {
            SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$WebviewResult) {
            WebViewCallbackInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((SubmitFormRequest$ElementResult$Result$WebviewResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CheckBoxResult) {
            SubmitFormRequest.ElementResult.CheckBoxResult.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((SubmitFormRequest$ElementResult$Result$CheckBoxResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CountrySelectorResult) {
            SubmitFormRequest.ElementResult.CountrySelectorResult.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((SubmitFormRequest$ElementResult$Result$CountrySelectorResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CellDefaultResult) {
            SubmitFormRequest.ElementResult.CellDefaultResult.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((SubmitFormRequest$ElementResult$Result$CellDefaultResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) {
            SubmitFormRequest.ElementResult.EarnerCategoryResult.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) zzdiVar).value);
        } else if (zzdiVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, elementResult.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult elementResult = (SubmitFormRequest.ElementResult) obj;
        elementResult.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, elementResult.id) + elementResult.unknownFields().getSize$okio();
        zzdi zzdiVar = elementResult.result;
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$AddressResult) {
            return SubmitFormRequest.ElementResult.AddressResult.ADAPTER.encodedSizeWithTag(2, ((SubmitFormRequest$ElementResult$Result$AddressResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$TextInputResult) {
            return SubmitFormRequest.ElementResult.TextInputResult.ADAPTER.encodedSizeWithTag(3, ((SubmitFormRequest$ElementResult$Result$TextInputResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$OptionPickerResult) {
            return SubmitFormRequest.ElementResult.OptionPickerResult.ADAPTER.encodedSizeWithTag(4, ((SubmitFormRequest$ElementResult$Result$OptionPickerResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CashtagResult) {
            return SubmitFormRequest.ElementResult.CashtagResult.ADAPTER.encodedSizeWithTag(5, ((SubmitFormRequest$ElementResult$Result$CashtagResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$DateInputResult) {
            return SubmitFormRequest.ElementResult.DateInputResult.ADAPTER.encodedSizeWithTag(6, ((SubmitFormRequest$ElementResult$Result$DateInputResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MoneyInputResult) {
            return SubmitFormRequest.ElementResult.MoneyInputResult.ADAPTER.encodedSizeWithTag(7, ((SubmitFormRequest$ElementResult$Result$MoneyInputResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EmojiPickerResult) {
            return SubmitFormRequest.ElementResult.EmojiPickerResult.ADAPTER.encodedSizeWithTag(8, ((SubmitFormRequest$ElementResult$Result$EmojiPickerResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) {
            return SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult.ADAPTER.encodedSizeWithTag(9, ((SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$WebviewResult) {
            return WebViewCallbackInputs.ADAPTER.encodedSizeWithTag(10, ((SubmitFormRequest$ElementResult$Result$WebviewResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CheckBoxResult) {
            return SubmitFormRequest.ElementResult.CheckBoxResult.ADAPTER.encodedSizeWithTag(11, ((SubmitFormRequest$ElementResult$Result$CheckBoxResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CountrySelectorResult) {
            return SubmitFormRequest.ElementResult.CountrySelectorResult.ADAPTER.encodedSizeWithTag(12, ((SubmitFormRequest$ElementResult$Result$CountrySelectorResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CellDefaultResult) {
            return SubmitFormRequest.ElementResult.CellDefaultResult.ADAPTER.encodedSizeWithTag(13, ((SubmitFormRequest$ElementResult$Result$CellDefaultResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) {
            return SubmitFormRequest.ElementResult.EarnerCategoryResult.ADAPTER.encodedSizeWithTag(14, ((SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) zzdiVar).value) + encodedSizeWithTag;
        }
        if (zzdiVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult elementResult = (SubmitFormRequest.ElementResult) obj;
        elementResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = elementResult.id;
        zzdi zzdiVar = elementResult.result;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult(str, zzdiVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult elementResult = (SubmitFormRequest.ElementResult) obj;
        elementResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, elementResult.id);
        zzdi zzdiVar = elementResult.result;
        if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$AddressResult) {
            SubmitFormRequest.ElementResult.AddressResult.ADAPTER.encodeWithTag(protoWriter, 2, ((SubmitFormRequest$ElementResult$Result$AddressResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$TextInputResult) {
            SubmitFormRequest.ElementResult.TextInputResult.ADAPTER.encodeWithTag(protoWriter, 3, ((SubmitFormRequest$ElementResult$Result$TextInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$OptionPickerResult) {
            SubmitFormRequest.ElementResult.OptionPickerResult.ADAPTER.encodeWithTag(protoWriter, 4, ((SubmitFormRequest$ElementResult$Result$OptionPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CashtagResult) {
            SubmitFormRequest.ElementResult.CashtagResult.ADAPTER.encodeWithTag(protoWriter, 5, ((SubmitFormRequest$ElementResult$Result$CashtagResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$DateInputResult) {
            SubmitFormRequest.ElementResult.DateInputResult.ADAPTER.encodeWithTag(protoWriter, 6, ((SubmitFormRequest$ElementResult$Result$DateInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MoneyInputResult) {
            SubmitFormRequest.ElementResult.MoneyInputResult.ADAPTER.encodeWithTag(protoWriter, 7, ((SubmitFormRequest$ElementResult$Result$MoneyInputResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EmojiPickerResult) {
            SubmitFormRequest.ElementResult.EmojiPickerResult.ADAPTER.encodeWithTag(protoWriter, 8, ((SubmitFormRequest$ElementResult$Result$EmojiPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) {
            SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult.ADAPTER.encodeWithTag(protoWriter, 9, ((SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$WebviewResult) {
            WebViewCallbackInputs.ADAPTER.encodeWithTag(protoWriter, 10, ((SubmitFormRequest$ElementResult$Result$WebviewResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CheckBoxResult) {
            SubmitFormRequest.ElementResult.CheckBoxResult.ADAPTER.encodeWithTag(protoWriter, 11, ((SubmitFormRequest$ElementResult$Result$CheckBoxResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CountrySelectorResult) {
            SubmitFormRequest.ElementResult.CountrySelectorResult.ADAPTER.encodeWithTag(protoWriter, 12, ((SubmitFormRequest$ElementResult$Result$CountrySelectorResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$CellDefaultResult) {
            SubmitFormRequest.ElementResult.CellDefaultResult.ADAPTER.encodeWithTag(protoWriter, 13, ((SubmitFormRequest$ElementResult$Result$CellDefaultResult) zzdiVar).value);
        } else if (zzdiVar instanceof SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) {
            SubmitFormRequest.ElementResult.EarnerCategoryResult.ADAPTER.encodeWithTag(protoWriter, 14, ((SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) zzdiVar).value);
        } else if (zzdiVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(elementResult.unknownFields());
    }
}
