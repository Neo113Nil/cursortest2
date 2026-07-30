package g0;

import A.j;
import a.AbstractC0069a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import d0.k;
import java.nio.ByteBuffer;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138b extends j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0138b(k kVar, int i2) {
        super(20, kVar);
        this.f2056g = i2;
    }

    @Override // A.j
    public final Bitmap u(ByteBuffer byteBuffer, C0140d c0140d) {
        Bitmap b2;
        switch (this.f2056g) {
            case 0:
                Bitmap u2 = super.u(byteBuffer, c0140d);
                if (u2 != null) {
                    return u2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (c0140d.f2060c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(c0140d.f2060c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    b2 = AbstractC0069a.b(createBitmap, c0140d.f2062e);
                } else {
                    b2 = AbstractC0069a.b(decodeByteArray, c0140d.f2062e);
                }
                return b2;
            default:
                return AbstractC0069a.b(super.u(byteBuffer, c0140d), c0140d.f2062e);
        }
    }
}
