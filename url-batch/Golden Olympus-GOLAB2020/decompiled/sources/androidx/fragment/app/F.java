package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Writer;

/* loaded from: classes.dex */
final class F extends Writer implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final String f12268b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f12269c = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);

    F(String str) {
        this.f12268b = str;
    }

    private void m() {
        if (this.f12269c.length() > 0) {
            Log.d(this.f12268b, this.f12269c.toString());
            StringBuilder sb = this.f12269c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                m();
            } else {
                this.f12269c.append(c4);
            }
        }
    }
}
