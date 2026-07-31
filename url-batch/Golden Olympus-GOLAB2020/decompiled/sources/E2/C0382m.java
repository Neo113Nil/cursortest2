package E2;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0382m {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f613a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f614b;

    /* renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f615c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f616d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f617e;

    /* renamed from: f, reason: collision with root package name */
    private char f618f;

    public C0382m(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f613a = inputStream;
        this.f614b = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "charset.newDecoder()\n   …odingErrorAction.REPLACE)");
        this.f615c = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(C0375f.f602c.d());
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(ByteArrayPool8k.take())");
        this.f616d = wrap;
        Intrinsics.checkNotNull(wrap, "null cannot be cast to non-null type java.nio.Buffer");
        wrap.flip();
    }

    private final int a(char[] cArr, int i4, int i5) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i4, i5);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z4 = false;
        while (true) {
            CoderResult decode = this.f615c.decode(this.f616d, wrap, z4);
            if (decode.isUnderflow()) {
                if (z4 || !wrap.hasRemaining()) {
                    break;
                }
                if (b() < 0) {
                    if (wrap.position() == 0 && !this.f616d.hasRemaining()) {
                        z4 = true;
                        break;
                    }
                    this.f615c.reset();
                    z4 = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    wrap.position();
                    break;
                }
                decode.throwException();
            }
        }
        if (z4) {
            this.f615c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    private final int b() {
        this.f616d.compact();
        try {
            int limit = this.f616d.limit();
            int position = this.f616d.position();
            int read = this.f613a.read(this.f616d.array(), this.f616d.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.f616d;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.flip();
            return this.f616d.remaining();
        } finally {
            ByteBuffer byteBuffer2 = this.f616d;
            Intrinsics.checkNotNull(byteBuffer2, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer2.flip();
        }
    }

    private final int c() {
        if (this.f617e) {
            this.f617e = false;
            return this.f618f;
        }
        char[] cArr = new char[2];
        int d4 = d(cArr, 0, 2);
        if (d4 == -1) {
            return -1;
        }
        if (d4 == 1) {
            return cArr[0];
        }
        if (d4 == 2) {
            this.f618f = cArr[1];
            this.f617e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + d4).toString());
    }

    public final int d(char[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        if (i4 < 0 || i4 >= array.length || i5 < 0 || i4 + i5 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i4 + ", " + i5 + ", " + array.length).toString());
        }
        if (this.f617e) {
            array[i4] = this.f618f;
            i4++;
            i5--;
            this.f617e = false;
            if (i5 == 0) {
                return 1;
            }
            i6 = 1;
        }
        if (i5 != 1) {
            return a(array, i4, i5) + i6;
        }
        int c4 = c();
        if (c4 != -1) {
            array[i4] = (char) c4;
            return i6 + 1;
        }
        if (i6 == 0) {
            return -1;
        }
        return i6;
    }

    public final void e() {
        C0375f c0375f = C0375f.f602c;
        byte[] array = this.f616d.array();
        Intrinsics.checkNotNullExpressionValue(array, "byteBuffer.array()");
        c0375f.c(array);
    }
}
