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
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.InvocationTargetException;
import x.AbstractC0724b;
import x.d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3406k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f3407a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3408b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3409c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3410d;

    /* renamed from: e, reason: collision with root package name */
    public int f3411e;

    /* renamed from: f, reason: collision with root package name */
    public int f3412f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3413g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3414h;

    /* renamed from: i, reason: collision with root package name */
    public String f3415i;

    /* renamed from: j, reason: collision with root package name */
    public String f3416j;

    public IconCompat() {
        this.f3407a = -1;
        this.f3409c = null;
        this.f3410d = null;
        this.f3411e = 0;
        this.f3412f = 0;
        this.f3413g = null;
        this.f3414h = f3406k;
        this.f3415i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z5) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z5) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3411e = i7;
        iconCompat.f3408b = "";
        iconCompat.f3416j = "";
        return iconCompat;
    }

    public final int c() {
        int i7 = this.f3407a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.f3411e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f3408b;
        if (i8 >= 28) {
            return d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        }
    }

    public final int d() {
        int i7 = this.f3407a;
        if (i7 != -1) {
            return i7;
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = this.f3408b;
        if (i8 >= 28) {
            return d.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        }
    }

    public final Uri e() {
        int i7 = this.f3407a;
        if (i7 == -1) {
            return AbstractC0724b.a(this.f3408b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f3408b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f3407a == -1) {
            return String.valueOf(this.f3408b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3407a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "BITMAP";
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
        switch (this.f3407a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3408b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3408b).getHeight());
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f3416j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3411e);
                if (this.f3412f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3412f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3408b);
                break;
        }
        if (this.f3413g != null) {
            sb.append(" tint=");
            sb.append(this.f3413g);
        }
        if (this.f3414h != f3406k) {
            sb.append(" mode=");
            sb.append(this.f3414h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f3409c = null;
        this.f3410d = null;
        this.f3411e = 0;
        this.f3412f = 0;
        this.f3413g = null;
        this.f3414h = f3406k;
        this.f3415i = null;
        this.f3407a = i7;
    }
}
