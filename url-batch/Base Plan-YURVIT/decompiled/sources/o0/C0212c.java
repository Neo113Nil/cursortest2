package o0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.datastore.preferences.protobuf.k0;
import java.nio.ByteBuffer;
import l0.j;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212c extends C0211b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0212c(j jVar, int i2) {
        super(0, jVar);
        this.f2916g = i2;
    }

    @Override // o0.C0211b
    public final Bitmap d(ByteBuffer byteBuffer, C0214e c0214e) {
        switch (this.f2916g) {
            case 0:
                Bitmap d2 = super.d(byteBuffer, c0214e);
                if (d2 != null) {
                    return d2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (c0214e.f2920c == 0) {
                    return k0.b(decodeByteArray, c0214e.f2922e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(c0214e.f2920c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return k0.b(createBitmap, c0214e.f2922e);
            default:
                return k0.b(super.d(byteBuffer, c0214e), c0214e.f2922e);
        }
    }
}
