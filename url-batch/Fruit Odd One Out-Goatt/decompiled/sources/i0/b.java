package i0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.lifecycle.n;
import f0.m;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m mVar, int i2) {
        super(5, mVar);
        this.f375d = i2;
    }

    @Override // androidx.lifecycle.n
    public final Bitmap o(ByteBuffer byteBuffer, d dVar) {
        switch (this.f375d) {
            case 0:
                Bitmap o2 = super.o(byteBuffer, dVar);
                if (o2 != null) {
                    return o2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f379c == 0) {
                    return a.a.b(decodeByteArray, dVar.f381e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f379c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return a.a.b(createBitmap, dVar.f381e);
            default:
                return a.a.b(super.o(byteBuffer, dVar), dVar.f381e);
        }
    }
}
