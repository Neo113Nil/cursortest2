package I1;

import C0.e;
import C0.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, int i3) {
        super(6, hVar);
        this.f614c = i3;
    }

    @Override // C0.e
    public final Bitmap e(ByteBuffer byteBuffer, d dVar) {
        switch (this.f614c) {
            case 0:
                Bitmap e3 = super.e(byteBuffer, dVar);
                if (e3 != null) {
                    return e3;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f618c == 0) {
                    return C2.b.b(decodeByteArray, dVar.f620e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f618c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return C2.b.b(createBitmap, dVar.f620e);
            default:
                return C2.b.b(super.e(byteBuffer, dVar), dVar.f620e);
        }
    }
}
