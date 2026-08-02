package a0;

import T.C0097o;
import android.media.MediaFormat;

/* renamed from: a0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126B implements w0.t, i0 {

    /* renamed from: a, reason: collision with root package name */
    public w0.t f3839a;

    /* renamed from: b, reason: collision with root package name */
    public C0126B f3840b;

    @Override // w0.t
    public final void a(long j4, long j5, C0097o c0097o, MediaFormat mediaFormat) {
        w0.t tVar = this.f3839a;
        if (tVar != null) {
            tVar.a(j4, j5, c0097o, mediaFormat);
        }
    }

    public final void b() {
        C0126B c0126b = this.f3840b;
        if (c0126b != null) {
            c0126b.b();
        }
    }

    @Override // a0.i0
    public final void c(int i4, Object obj) {
        if (i4 == 7) {
            this.f3839a = (w0.t) obj;
        } else if (i4 == 8) {
            this.f3840b = (C0126B) obj;
        } else if (i4 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        C0126B c0126b = this.f3840b;
        if (c0126b != null) {
            c0126b.d();
        }
    }
}
