package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import w2.a;
import w2.c;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f755k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f757b;

    /* renamed from: j, reason: collision with root package name */
    public String f765j;

    /* renamed from: a, reason: collision with root package name */
    public int f756a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f758c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f759d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f760e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f761f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f762g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f763h = f755k;

    /* renamed from: i, reason: collision with root package name */
    public String f764i = null;

    public static Bitmap a(Bitmap bitmap, boolean z8) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f9 = min;
        float f10 = 0.5f * f9;
        float f11 = 0.9166667f * f10;
        if (z8) {
            float f12 = 0.010416667f * f9;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f758c = null;
        iconCompat.f759d = null;
        iconCompat.f761f = 0;
        iconCompat.f762g = null;
        iconCompat.f763h = f755k;
        iconCompat.f764i = null;
        iconCompat.f756a = 2;
        iconCompat.f760e = i7;
        iconCompat.f757b = "";
        iconCompat.f765j = "";
        return iconCompat;
    }

    public final int c() {
        int i7 = this.f756a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f760e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f757b;
        if (i8 >= 28) {
            return c.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public final Uri d() {
        int i7 = this.f756a;
        if (i7 == -1) {
            return a.a(this.f757b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f757b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f756a == -1) {
            return String.valueOf(this.f757b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f756a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f756a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f757b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f757b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f765j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f760e);
                if (this.f761f != 0) {
                    sb.append(" off=");
                    sb.append(this.f761f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f757b);
                break;
        }
        if (this.f762g != null) {
            sb.append(" tint=");
            sb.append(this.f762g);
        }
        if (this.f763h != f755k) {
            sb.append(" mode=");
            sb.append(this.f763h);
        }
        sb.append(")");
        return sb.toString();
    }
}
