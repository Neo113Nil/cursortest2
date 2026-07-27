package A2;

import a.AbstractC0169a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import c1.f;
import h2.C0482c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends C0482c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i2) {
        super(1, fVar);
        this.f30d = i2;
    }

    @Override // h2.C0482c
    public final Bitmap e(ByteBuffer byteBuffer, e eVar) {
        Bitmap a6;
        switch (this.f30d) {
            case 0:
                Bitmap e3 = super.e(byteBuffer, eVar);
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
                if (eVar.f34c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(eVar.f34c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    a6 = AbstractC0169a.a(createBitmap, eVar.f36e);
                } else {
                    a6 = AbstractC0169a.a(decodeByteArray, eVar.f36e);
                }
                return a6;
            default:
                return AbstractC0169a.a(super.e(byteBuffer, eVar), eVar.f36e);
        }
    }
}
