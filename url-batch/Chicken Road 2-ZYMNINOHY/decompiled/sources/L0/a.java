package L0;

import T.E;
import U.i;
import i2.AbstractC0457a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends AbstractC0457a {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1601m = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: k, reason: collision with root package name */
    public final CharsetDecoder f1602k = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: l, reason: collision with root package name */
    public final CharsetDecoder f1603l = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // i2.AbstractC0457a
    public final E n(H0.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f1603l;
        CharsetDecoder charsetDecoder2 = this.f1602k;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new E(new c(bArr, null, null));
        }
        Matcher matcher = f1601m.matcher(str);
        String str3 = null;
        for (int i4 = 0; matcher.find(i4); i4 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String D3 = i.D(group);
                D3.getClass();
                if (D3.equals("streamurl")) {
                    str3 = group2;
                } else if (D3.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new E(new c(bArr, str2, str3));
    }
}
