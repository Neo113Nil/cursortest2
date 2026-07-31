package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class vh0 extends hy1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f33624c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f33625a = un.f33183c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f33626b = un.f33182b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.hy1
    protected final wz0 a(zz0 zz0Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f33625a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f33626b.decode(byteBuffer).toString();
                this.f33626b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f33626b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f33626b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f33625a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new wz0(new xh0(bArr, null, null));
        }
        Matcher matcher = f33624c.matcher(str);
        String str3 = null;
        for (int i4 = 0; matcher.find(i4); i4 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String b4 = C2207rf.b(group);
                b4.getClass();
                if (b4.equals("streamurl")) {
                    str3 = group2;
                } else if (b4.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new wz0(new xh0(bArr, str2, str3));
    }
}
