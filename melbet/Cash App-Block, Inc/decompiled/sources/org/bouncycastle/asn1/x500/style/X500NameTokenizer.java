package org.bouncycastle.asn1.x500.style;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class X500NameTokenizer {
    private int index;
    private final char separator;
    private final String value;

    public X500NameTokenizer(String str, char c) {
        str.getClass();
        if (c == '\"' || c == '\\') {
            a$$ExternalSyntheticBUOutline0.m$3("reserved separator character");
            throw null;
        }
        this.value = str;
        this.separator = c;
        this.index = str.length() < 1 ? 0 : -1;
    }

    public boolean hasMoreTokens() {
        return this.index < this.value.length();
    }

    public String nextToken() {
        if (this.index >= this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i2 = this.index + 1;
            this.index = i2;
            if (i2 < this.value.length()) {
                char charAt = this.value.charAt(this.index);
                if (z) {
                    z = false;
                } else if (charAt == '\"') {
                    z2 = !z2;
                } else if (z2) {
                    continue;
                } else if (charAt == '\\') {
                    z = true;
                } else if (charAt == this.separator) {
                    break;
                }
            } else if (z || z2) {
                a$$ExternalSyntheticBUOutline0.m$3("badly formatted directory string");
                return null;
            }
        }
        return this.value.substring(i, this.index);
    }

    public X500NameTokenizer(String str) {
        this(str, ',');
    }
}
