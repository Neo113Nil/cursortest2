package D1;

import S0.f;
import S0.l;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.h;
import s1.j;
import u1.x;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f676a;

    /* renamed from: b, reason: collision with root package name */
    public final l f677b;

    public /* synthetic */ a(l lVar, int i) {
        this.f676a = i;
        this.f677b = lVar;
    }

    @Override // s1.j
    public final x a(Object obj, int i, int i4, h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f676a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return l.m(createSource, i, i4, hVar);
            default:
                createSource2 = ImageDecoder.createSource(N1.b.b((InputStream) obj));
                return l.m(createSource2, i, i4, hVar);
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, h hVar) {
        switch (this.f676a) {
            case 0:
                ImageHeaderParser$ImageType l9 = f.l((ArrayList) this.f677b.f2910u, (ByteBuffer) obj);
                if (l9 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && l9 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                l lVar = this.f677b;
                ImageHeaderParser$ImageType k6 = f.k((ArrayList) lVar.f2910u, (InputStream) obj, (C3112dq) lVar.f2911v);
                if (k6 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && k6 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
