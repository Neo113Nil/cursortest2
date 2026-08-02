package com.squareup.protos.cash.appthemes;

import androidx.room.TransactorKt;
import app.cash.local.primitives.BrandKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppThemeDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        BrandKt brandKt = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppThemeDefinition((AppThemeName) obj, brandKt, (ButtonColors) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AppThemeName.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                brandKt = new AppThemeDefinition$ColorScheme$Gradient((Gradient) Gradient.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                brandKt = new AppThemeDefinition$ColorScheme$BackgroundColor((BackgroundColor) BackgroundColor.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ButtonColors.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppThemeDefinition appThemeDefinition = (AppThemeDefinition) obj;
        reverseProtoWriter.getClass();
        appThemeDefinition.getClass();
        reverseProtoWriter.writeBytes(appThemeDefinition.unknownFields());
        BrandKt brandKt = appThemeDefinition.color_scheme;
        if (brandKt instanceof AppThemeDefinition$ColorScheme$Gradient) {
            Gradient.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AppThemeDefinition$ColorScheme$Gradient) brandKt).value);
        } else if (brandKt instanceof AppThemeDefinition$ColorScheme$BackgroundColor) {
            BackgroundColor.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((AppThemeDefinition$ColorScheme$BackgroundColor) brandKt).value);
        } else if (brandKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ButtonColors.ADAPTER.encodeWithTag(reverseProtoWriter, 4, appThemeDefinition.button_colors);
        AppThemeName.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appThemeDefinition.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AppThemeDefinition appThemeDefinition = (AppThemeDefinition) obj;
        appThemeDefinition.getClass();
        int encodedSizeWithTag2 = AppThemeName.ADAPTER.encodedSizeWithTag(1, appThemeDefinition.name) + appThemeDefinition.unknownFields().getSize$okio();
        BrandKt brandKt = appThemeDefinition.color_scheme;
        if (brandKt instanceof AppThemeDefinition$ColorScheme$Gradient) {
            encodedSizeWithTag = Gradient.ADAPTER.encodedSizeWithTag(2, ((AppThemeDefinition$ColorScheme$Gradient) brandKt).value);
        } else {
            if (!(brandKt instanceof AppThemeDefinition$ColorScheme$BackgroundColor)) {
                if (brandKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ButtonColors.ADAPTER.encodedSizeWithTag(4, appThemeDefinition.button_colors) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = BackgroundColor.ADAPTER.encodedSizeWithTag(3, ((AppThemeDefinition$ColorScheme$BackgroundColor) brandKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ButtonColors.ADAPTER.encodedSizeWithTag(4, appThemeDefinition.button_colors) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppThemeDefinition appThemeDefinition = (AppThemeDefinition) obj;
        appThemeDefinition.getClass();
        ButtonColors buttonColors = appThemeDefinition.button_colors;
        ButtonColors buttonColors2 = buttonColors != null ? (ButtonColors) ButtonColors.ADAPTER.redact(buttonColors) : null;
        ByteString byteString = ByteString.EMPTY;
        AppThemeName appThemeName = appThemeDefinition.name;
        BrandKt brandKt = appThemeDefinition.color_scheme;
        byteString.getClass();
        return new AppThemeDefinition(appThemeName, brandKt, buttonColors2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppThemeDefinition appThemeDefinition = (AppThemeDefinition) obj;
        appThemeDefinition.getClass();
        AppThemeName.ADAPTER.encodeWithTag(protoWriter, 1, appThemeDefinition.name);
        ButtonColors.ADAPTER.encodeWithTag(protoWriter, 4, appThemeDefinition.button_colors);
        BrandKt brandKt = appThemeDefinition.color_scheme;
        if (brandKt instanceof AppThemeDefinition$ColorScheme$Gradient) {
            Gradient.ADAPTER.encodeWithTag(protoWriter, 2, ((AppThemeDefinition$ColorScheme$Gradient) brandKt).value);
        } else if (brandKt instanceof AppThemeDefinition$ColorScheme$BackgroundColor) {
            BackgroundColor.ADAPTER.encodeWithTag(protoWriter, 3, ((AppThemeDefinition$ColorScheme$BackgroundColor) brandKt).value);
        } else if (brandKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appThemeDefinition.unknownFields());
    }
}
