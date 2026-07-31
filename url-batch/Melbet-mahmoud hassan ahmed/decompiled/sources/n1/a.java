package n1;

import j1.e;
import j1.h;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.d;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f19376c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f19377a = d.f18614c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f19378b = d.f18613b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f19377a.decode(byteBuffer).toString();
            charsetDecoder = this.f19377a;
        } catch (CharacterCodingException unused) {
            this.f19377a.reset();
            byteBuffer.rewind();
            try {
                str = this.f19378b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f19378b.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f19378b;
        } catch (Throwable th2) {
            this.f19377a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }

    @Override // j1.h
    protected j1.a b(e eVar, ByteBuffer byteBuffer) {
        String c7 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c7 == null) {
            return new j1.a(new c(bArr, null, null));
        }
        Matcher matcher = f19376c.matcher(c7);
        String str2 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e7 = l4.b.e(group);
                e7.hashCode();
                if (e7.equals("streamurl")) {
                    str2 = group2;
                } else if (e7.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new j1.a(new c(bArr, str, str2));
    }
}
