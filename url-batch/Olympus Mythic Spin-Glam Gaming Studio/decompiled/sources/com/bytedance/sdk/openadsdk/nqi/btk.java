package com.bytedance.sdk.openadsdk.nqi;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class btk {
    private static final List<CharsetEncoder> fs = new ArrayList();
    static final /* synthetic */ boolean zmn = true;
    private final int fb;
    private final CharsetEncoder[] zn;

    public btk(String str, Charset charset, int i) {
        int i2;
        boolean z;
        ArrayList<CharsetEncoder> arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            for (CharsetEncoder charsetEncoder : arrayList) {
                char charAt = str.charAt(i3);
                if (charAt == i || charsetEncoder.canEncode(charAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                Iterator<CharsetEncoder> it = fs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i3))) {
                        arrayList.add(next);
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() == 1 && !z2) {
            this.zn = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        } else {
            this.zn = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                this.zn[i4] = (CharsetEncoder) it2.next();
                i4++;
            }
            this.zn[i4] = StandardCharsets.UTF_8.newEncoder();
            this.zn[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            i2 = 0;
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.zn;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.zn[i2].charset().name())) {
                    break;
                } else {
                    i2++;
                }
            }
            this.fb = i2;
            if (zmn && !this.zn[0].charset().equals(StandardCharsets.ISO_8859_1)) {
                throw new AssertionError();
            }
        }
        i2 = -1;
        this.fb = i2;
        if (zmn) {
        }
    }

    public int zmn() {
        return this.zn.length;
    }

    public Charset zmn(int i) {
        if (zmn || i < zmn()) {
            return this.zn[i].charset();
        }
        throw new AssertionError();
    }

    public int fs(int i) {
        return fb.zmn(this.zn[i].charset()).zmn();
    }

    public int fs() {
        return this.fb;
    }

    public boolean zmn(char c, int i) {
        if (zmn || i < zmn()) {
            return this.zn[i].canEncode(String.valueOf(c));
        }
        throw new AssertionError();
    }

    public byte[] zmn(String str, int i) {
        if (zmn || i < zmn()) {
            return str.getBytes(this.zn[i].charset());
        }
        throw new AssertionError();
    }
}
