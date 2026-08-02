package Y;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f3752a;

    /* renamed from: b, reason: collision with root package name */
    public long f3753b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f3754c;

    /* renamed from: d, reason: collision with root package name */
    public Map f3755d;

    public z(h hVar) {
        hVar.getClass();
        this.f3752a = hVar;
        this.f3754c = Uri.EMPTY;
        this.f3755d = Collections.EMPTY_MAP;
    }

    @Override // Y.h
    public final Uri B() {
        return this.f3752a.B();
    }

    @Override // Y.h
    public final long b(k kVar) {
        h hVar = this.f3752a;
        this.f3754c = kVar.f3701a;
        this.f3755d = Collections.EMPTY_MAP;
        try {
            return hVar.b(kVar);
        } finally {
            Uri B4 = hVar.B();
            if (B4 != null) {
                this.f3754c = B4;
            }
            this.f3755d = hVar.t();
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3752a.close();
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f3752a.read(bArr, i4, i5);
        if (read != -1) {
            this.f3753b += read;
        }
        return read;
    }

    @Override // Y.h
    public final Map t() {
        return this.f3752a.t();
    }

    @Override // Y.h
    public final void y(A a3) {
        a3.getClass();
        this.f3752a.y(a3);
    }
}
