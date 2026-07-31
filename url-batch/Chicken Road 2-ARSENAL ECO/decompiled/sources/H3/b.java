package H3;

import E3.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import i6.g;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends J1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1009j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k kVar, int i7) {
        super(7, kVar);
        this.f1009j = i7;
    }

    @Override // J1.c
    public final Bitmap d(ByteBuffer byteBuffer, d dVar) {
        switch (this.f1009j) {
            case 0:
                Bitmap d7 = super.d(byteBuffer, dVar);
                if (d7 != null) {
                    return d7;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f1013c == 0) {
                    return g.c(decodeByteArray, dVar.f1015e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f1013c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return g.c(createBitmap, dVar.f1015e);
            default:
                return g.c(super.d(byteBuffer, dVar), dVar.f1015e);
        }
    }
}
