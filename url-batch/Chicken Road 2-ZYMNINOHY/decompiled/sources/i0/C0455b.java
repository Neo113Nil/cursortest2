package i0;

import T.C0097o;
import T.G;
import W.J;
import Z.g;
import Z.i;
import a.AbstractC0124a;
import android.content.Context;
import android.graphics.Point;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455b extends i {
    public final Context n;
    public final int o;

    public C0455b(Context context) {
        super(new Z.f[1], new C0454a[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // Z.i
    public final Z.f f() {
        return new Z.f(1);
    }

    @Override // Z.i
    public final g g() {
        return new C0454a(this);
    }

    @Override // Z.i
    public final Z.d h(Throwable th) {
        return new c("Unexpected decode error", th);
    }

    @Override // Z.i
    public final Z.d i(Z.f fVar, g gVar, boolean z) {
        C0454a c0454a = (C0454a) gVar;
        ByteBuffer byteBuffer = fVar.f3781e;
        byteBuffer.getClass();
        AbstractC0124a.t(byteBuffer.hasArray());
        AbstractC0124a.h(byteBuffer.arrayOffset() == 0);
        try {
            int i4 = this.o;
            if (i4 == -1) {
                Context context = this.n;
                if (context != null) {
                    Point w4 = J.w(context);
                    int i5 = w4.x;
                    int i6 = w4.y;
                    C0097o c0097o = fVar.f3779c;
                    if (c0097o != null) {
                        int i7 = c0097o.f2852M;
                        if (i7 != -1) {
                            i5 *= i7;
                        }
                        int i8 = c0097o.f2853N;
                        if (i8 != -1) {
                            i6 *= i8;
                        }
                    }
                    i4 = (Math.max(i5, i6) * 2) - 1;
                } else {
                    i4 = 4096;
                }
            }
            c0454a.f9278e = AbstractC0347t0.f(byteBuffer.array(), byteBuffer.remaining(), i4);
            c0454a.f3786c = fVar.f3783g;
            return null;
        } catch (G e4) {
            return new c("Could not decode image data with BitmapFactory.", e4);
        } catch (IOException e5) {
            return new c(e5);
        }
    }
}
