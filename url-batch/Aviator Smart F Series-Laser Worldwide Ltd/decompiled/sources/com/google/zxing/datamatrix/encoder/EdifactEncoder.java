package com.google.zxing.datamatrix.encoder;

/* loaded from: classes4.dex */
final class EdifactEncoder implements Encoder {
    EdifactEncoder() {
    }

    private static void encodeChar(char c8, StringBuilder sb) {
        if (c8 >= ' ' && c8 <= '?') {
            sb.append(c8);
        } else if (c8 < '@' || c8 > '^') {
            HighLevelEncoder.illegalCharacter(c8);
        } else {
            sb.append((char) (c8 - '@'));
        }
    }

    private static String encodeToCodewords(CharSequence charSequence, int i8) {
        int length = charSequence.length() - i8;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(i8) << 18) + ((length >= 2 ? charSequence.charAt(i8 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i8 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i8 + 3) : (char) 0);
        char c8 = (char) ((charAt >> 16) & 255);
        char c9 = (char) ((charAt >> 8) & 255);
        char c10 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c8);
        if (length >= 2) {
            sb.append(c9);
        }
        if (length >= 3) {
            sb.append(c10);
        }
        return sb.toString();
    }

    private static void handleEOD(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z7 = true;
            if (length == 1) {
                encoderContext.updateSymbolInfo();
                int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                int remainingCharacters = encoderContext.getRemainingCharacters();
                if (remainingCharacters > dataCapacity) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + 1);
                    dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                }
                if (remainingCharacters <= dataCapacity && dataCapacity <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i8 = length - 1;
            String encodeToCodewords = encodeToCodewords(charSequence, 0);
            if (!(!encoderContext.hasMoreCharacters()) || i8 > 2) {
                z7 = false;
            }
            if (i8 <= 2) {
                encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + i8);
                if (encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount() >= 3) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + encodeToCodewords.length());
                    encoderContext.writeCodewords(encodeToCodewords);
                }
            }
            if (z7) {
                encoderContext.resetSymbolInfo();
                encoderContext.pos -= i8;
            }
            encoderContext.writeCodewords(encodeToCodewords);
        } finally {
            encoderContext.signalEncoderChange(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            encodeChar(encoderContext.getCurrentChar(), sb);
            encoderContext.pos++;
            if (sb.length() >= 4) {
                encoderContext.writeCodewords(encodeToCodewords(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        handleEOD(encoderContext, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 4;
    }
}
