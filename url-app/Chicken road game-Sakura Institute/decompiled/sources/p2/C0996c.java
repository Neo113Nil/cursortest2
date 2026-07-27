package p2;

import android.os.Looper;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.text.SimpleDateFormat;
import java.util.Locale;
import s0.V;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9085a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f9085a) {
            case 0:
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            case 1:
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction2);
                newEncoder.onUnmappableCharacter(codingErrorAction2);
                return newEncoder;
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(n3.b.f8562e);
                return simpleDateFormat;
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                V v4 = new V(choreographer, j0.c.t(myLooper));
                return kotlin.coroutines.f.c(v4.f10150r, v4);
        }
    }
}
