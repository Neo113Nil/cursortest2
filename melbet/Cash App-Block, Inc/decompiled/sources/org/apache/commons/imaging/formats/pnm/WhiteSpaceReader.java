package org.apache.commons.imaging.formats.pnm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;

/* loaded from: classes9.dex */
class WhiteSpaceReader {
    private final InputStream is;

    public WhiteSpaceReader(InputStream inputStream) {
        this.is = inputStream;
    }

    private char read() {
        int read = this.is.read();
        if (read >= 0) {
            return (char) read;
        }
        a$$ExternalSyntheticBUOutline0.m$4("PNM: Unexpected EOF");
        return (char) 0;
    }

    public char nextChar() {
        char read = read();
        if (read == '#') {
            while (read != '\n' && read != '\r') {
                read = read();
            }
        }
        return read;
    }

    public String readLine() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char read = read();
            if (read == '\n' || read == '\r') {
                break;
            }
            sb.append(read);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public String readtoWhiteSpace() {
        char nextChar = nextChar();
        while (Character.isWhitespace(nextChar)) {
            nextChar = nextChar();
        }
        StringBuilder sb = new StringBuilder();
        while (!Character.isWhitespace(nextChar)) {
            sb.append(nextChar);
            nextChar = nextChar();
        }
        return sb.toString();
    }
}
