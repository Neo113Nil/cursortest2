package H;

import D.u;
import E.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k kVar, int i2) {
        super(5, kVar);
        this.f237d = i2;
    }

    @Override // D.u
    public final Bitmap j(ByteBuffer byteBuffer, d dVar) {
        Bitmap b2;
        switch (this.f237d) {
            case 0:
                Bitmap j2 = super.j(byteBuffer, dVar);
                if (j2 != null) {
                    return j2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f241c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(dVar.f241c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    b2 = a.a.b(createBitmap, dVar.f243e);
                } else {
                    b2 = a.a.b(decodeByteArray, dVar.f243e);
                }
                return b2;
            default:
                return a.a.b(super.j(byteBuffer, dVar), dVar.f243e);
        }
    }
}
