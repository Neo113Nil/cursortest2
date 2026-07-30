package p5;

import com.realsil.sdk.core.logger.ZLogger;
import com.realtek.sdk.media.opus.OpusCodec;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;

/* loaded from: classes4.dex */
public final class a extends o5.a {
    public static final C0402a Companion = new C0402a(null);
    public static final boolean VDBG = false;

    /* renamed from: i, reason: collision with root package name */
    public OpusCodec f17219i = new OpusCodec();

    /* renamed from: p5.a$a, reason: collision with other inner class name */
    public static final class C0402a {
        public C0402a(o oVar) {
        }
    }

    @Override // o5.a
    public final void a() {
        super.a();
        this.f17219i.createDecoder(16000, 1);
        w wVar = w.INSTANCE;
        String format = String.format(Locale.US, "convert: %s to %s start\ninFrameSize=%d, outFrameSize=%d", Arrays.copyOf(new Object[]{this.f17057c, this.f17059e, 41, 0}, 4));
        s.checkNotNullExpressionValue(format, "format(...)");
        ZLogger.d(format);
        byte[] bArr = new byte[41];
        while (true) {
            try {
                BufferedInputStream bufferedInputStream = this.f17060f;
                s.checkNotNull(bufferedInputStream);
                if (bufferedInputStream.read(bArr) == -1) {
                    BufferedInputStream bufferedInputStream2 = this.f17060f;
                    s.checkNotNull(bufferedInputStream2);
                    bufferedInputStream2.close();
                    RandomAccessFile randomAccessFile = this.f17061g;
                    s.checkNotNull(randomAccessFile);
                    randomAccessFile.close();
                    return;
                }
                byte[] decode = this.f17219i.decode(k.copyOfRange(bArr, 1, 41), 96000, false);
                if (decode.length != 0) {
                    RandomAccessFile randomAccessFile2 = this.f17061g;
                    s.checkNotNull(randomAccessFile2);
                    randomAccessFile2.write(decode, 0, decode.length);
                }
            } catch (IOException e8) {
                ZLogger.w(e8.toString());
                return;
            }
        }
    }

    public final OpusCodec getOpusCodec() {
        return this.f17219i;
    }

    public final void setOpusCodec(OpusCodec opusCodec) {
        s.checkNotNullParameter(opusCodec, "<set-?>");
        this.f17219i = opusCodec;
    }
}
