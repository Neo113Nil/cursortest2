package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class rb implements yd {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2743d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.yd
    public /* bridge */ /* synthetic */ Object a(xd xdVar) {
        sb a9;
        InputStream d10 = hg.d(xdVar);
        try {
            int i3 = 4096;
            if (this.f2743d) {
                if (d10 instanceof fe) {
                    long length = ((fe) d10).a().length();
                    if (length == 0) {
                        i3 = 512;
                    } else if (length < 4096) {
                        i3 = (int) length;
                    }
                }
                a9 = sb.a(y0.h(d10, i3), true);
            } else {
                a9 = sb.a(y0.h(d10, 4096), false);
            }
            i7.a.G(d10, null);
            return a9;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i7.a.G(d10, th);
                throw th2;
            }
        }
    }
}
