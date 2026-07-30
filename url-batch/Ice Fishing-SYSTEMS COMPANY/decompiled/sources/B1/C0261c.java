package B1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import v1.InterfaceC5117a;

/* renamed from: B1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261c implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5117a f89b;

    public C0261c() {
        this.f88a = 0;
        this.f89b = new W3.e(28);
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i4, s1.h hVar) {
        switch (this.f88a) {
            case 0:
                return c(A1.a.f(obj), i, i4, hVar);
            default:
                return C0262d.b(((r1.d) obj).b(), this.f89b);
        }
    }

    @Override // s1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s1.h hVar) {
        switch (this.f88a) {
            case 0:
                A1.a.u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C0262d c(ImageDecoder.Source source, int i, int i4, s1.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new A1.d(i, i4, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i4 + "]");
        }
        return new C0262d(decodeBitmap, (W3.e) this.f89b);
    }

    public C0261c(InterfaceC5117a interfaceC5117a) {
        this.f88a = 1;
        this.f89b = interfaceC5117a;
    }
}
