package org.apache.commons.imaging.formats.rgbe;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;

/* loaded from: classes9.dex */
class InfoHeaderReader {
    private final InputStream is;

    public InfoHeaderReader(InputStream inputStream) {
        this.is = inputStream;
    }

    private char read() {
        int read = this.is.read();
        if (read >= 0) {
            return (char) read;
        }
        a$$ExternalSyntheticBUOutline0.m$4("HDR: Unexpected EOF");
        return (char) 0;
    }

    public String readNextLine() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char read = read();
            if (read == '\n') {
                return sb.toString();
            }
            sb.append(read);
        }
    }
}
