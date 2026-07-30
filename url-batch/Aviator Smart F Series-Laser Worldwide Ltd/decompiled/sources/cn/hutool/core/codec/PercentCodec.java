package cn.hutool.core.codec;

import cn.hutool.core.lang.q;
import cn.hutool.core.text.l;
import cn.hutool.core.util.g0;
import cn.hutool.core.util.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.BitSet;

/* loaded from: classes.dex */
public class PercentCodec implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean encodeSpaceAsPlus;
    private final BitSet safeCharacters;

    public PercentCodec() {
        this(new BitSet(256));
    }

    public static PercentCodec of(PercentCodec percentCodec) {
        return new PercentCodec((BitSet) percentCodec.safeCharacters.clone());
    }

    public PercentCodec addSafe(char c8) {
        this.safeCharacters.set(c8);
        return this;
    }

    public String encode(CharSequence charSequence, Charset charset, char... cArr) {
        if (charset == null || l.isEmpty(charSequence)) {
            return l.str(charSequence);
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, charset);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (this.safeCharacters.get(charAt) || g0.contains(cArr, charAt)) {
                sb.append(charAt);
            } else if (this.encodeSpaceAsPlus && charAt == ' ') {
                sb.append('+');
            } else {
                try {
                    outputStreamWriter.write(charAt);
                    outputStreamWriter.flush();
                    for (byte b8 : byteArrayOutputStream.toByteArray()) {
                        sb.append('%');
                        z.appendHex(sb, b8, false);
                    }
                    byteArrayOutputStream.reset();
                } catch (IOException unused) {
                    byteArrayOutputStream.reset();
                }
            }
        }
        return sb.toString();
    }

    public PercentCodec or(PercentCodec percentCodec) {
        this.safeCharacters.or(percentCodec.safeCharacters);
        return this;
    }

    public PercentCodec orNew(PercentCodec percentCodec) {
        return of(this).or(percentCodec);
    }

    public PercentCodec removeSafe(char c8) {
        this.safeCharacters.clear(c8);
        return this;
    }

    public PercentCodec setEncodeSpaceAsPlus(boolean z7) {
        this.encodeSpaceAsPlus = z7;
        return this;
    }

    public PercentCodec(BitSet bitSet) {
        this.encodeSpaceAsPlus = false;
        this.safeCharacters = bitSet;
    }

    public static PercentCodec of(CharSequence charSequence) {
        q.notNull(charSequence, "chars must not be null", new Object[0]);
        PercentCodec percentCodec = new PercentCodec();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            percentCodec.addSafe(charSequence.charAt(i8));
        }
        return percentCodec;
    }
}
