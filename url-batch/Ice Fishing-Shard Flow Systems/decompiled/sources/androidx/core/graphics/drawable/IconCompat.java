package androidx.core.graphics.drawable;

import C.a;
import C.b;
import C.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3367k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f3368a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3369b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3370c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3371d;

    /* renamed from: e, reason: collision with root package name */
    public int f3372e;

    /* renamed from: f, reason: collision with root package name */
    public int f3373f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3374g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3375h;

    /* renamed from: i, reason: collision with root package name */
    public String f3376i;
    public String j;

    public IconCompat() {
        this.f3368a = -1;
        this.f3370c = null;
        this.f3371d = null;
        this.f3372e = 0;
        this.f3373f = 0;
        this.f3374g = null;
        this.f3375h = f3367k;
        this.f3376i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z7) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z7) {
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

    public static IconCompat b(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3372e = i2;
        iconCompat.f3369b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int c() {
        int i2 = this.f3368a;
        if (i2 != -1) {
            if (i2 == 2) {
                return this.f3372e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f3369b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        }
    }

    public final int d() {
        int i2 = this.f3368a;
        if (i2 != -1) {
            return i2;
        }
        Object obj = this.f3369b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        }
    }

    public final Uri e() {
        int i2 = this.f3368a;
        if (i2 != -1) {
            if (i2 == 4 || i2 == 6) {
                return Uri.parse((String) this.f3369b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f3369b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon createWithBitmap;
        int i2 = this.f3368a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i2) {
            case -1:
                return (Icon) this.f3369b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f3369b);
                break;
            case 2:
                if (i2 == -1) {
                    Object obj = this.f3369b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = b.f(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (NoSuchMethodException e8) {
                            Log.e("IconCompat", "Unable to get icon package", e8);
                        } catch (InvocationTargetException e9) {
                            Log.e("IconCompat", "Unable to get icon package", e9);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f3369b).split(":", -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f3372e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f3369b, this.f3372e, this.f3373f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f3369b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f3369b, false));
                    break;
                } else {
                    createWithBitmap = a.b((Bitmap) this.f3369b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = c.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e10 = e();
                    String scheme = e10.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e10);
                        } catch (Exception e11) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e10, e11);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f3369b));
                        } catch (FileNotFoundException e12) {
                            Log.w("IconCompat", "Unable to load image from path: " + e10, e12);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = a.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f3374g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f3375h;
        if (mode != f3367k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f3368a == -1) {
            return String.valueOf(this.f3369b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3368a) {
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
        switch (this.f3368a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3369b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3369b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3372e);
                if (this.f3373f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3373f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3369b);
                break;
        }
        if (this.f3374g != null) {
            sb.append(" tint=");
            sb.append(this.f3374g);
        }
        if (this.f3375h != f3367k) {
            sb.append(" mode=");
            sb.append(this.f3375h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f3370c = null;
        this.f3371d = null;
        this.f3372e = 0;
        this.f3373f = 0;
        this.f3374g = null;
        this.f3375h = f3367k;
        this.f3376i = null;
        this.f3368a = i2;
    }
}
