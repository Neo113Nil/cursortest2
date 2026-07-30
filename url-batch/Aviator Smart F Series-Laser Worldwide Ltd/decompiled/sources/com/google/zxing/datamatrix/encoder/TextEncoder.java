package com.google.zxing.datamatrix.encoder;

/* loaded from: classes4.dex */
final class TextEncoder extends C40Encoder {
    TextEncoder() {
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    int encodeChar(char c8, StringBuilder sb) {
        if (c8 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c8 >= '0' && c8 <= '9') {
            sb.append((char) (c8 - ','));
            return 1;
        }
        if (c8 >= 'a' && c8 <= 'z') {
            sb.append((char) (c8 - 'S'));
            return 1;
        }
        if (c8 < ' ') {
            sb.append((char) 0);
            sb.append(c8);
            return 2;
        }
        if (c8 >= '!' && c8 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c8 - '!'));
            return 2;
        }
        if (c8 >= ':' && c8 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c8 - '+'));
            return 2;
        }
        if (c8 >= '[' && c8 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c8 - 'E'));
            return 2;
        }
        if (c8 == '`') {
            sb.append((char) 2);
            sb.append((char) (c8 - '`'));
            return 2;
        }
        if (c8 >= 'A' && c8 <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c8 - '@'));
            return 2;
        }
        if (c8 < '{' || c8 > 127) {
            sb.append("\u0001\u001e");
            return encodeChar((char) (c8 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c8 - '`'));
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 2;
    }
}
