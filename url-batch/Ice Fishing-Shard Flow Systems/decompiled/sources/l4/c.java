package l4;

import P0.f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import i4.j;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(j jVar, int i2) {
        super(0, jVar);
        this.f6273i = i2;
    }

    @Override // l4.b
    public final Bitmap r(ByteBuffer byteBuffer, e eVar) {
        switch (this.f6273i) {
            case 0:
                Bitmap r7 = super.r(byteBuffer, eVar);
                if (r7 != null) {
                    return r7;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (eVar.f6277c == 0) {
                    return f.c(decodeByteArray, eVar.f6279e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(eVar.f6277c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return f.c(createBitmap, eVar.f6279e);
            default:
                return f.c(super.r(byteBuffer, eVar), eVar.f6279e);
        }
    }
}
