package androidx.core.graphics.drawable;

import a2.r;
import a4.j;
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
import e3.k;
import f2.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f476k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f477a;

    /* renamed from: b, reason: collision with root package name */
    public Object f478b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f479c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f480d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f481e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f482f = 0;
    public ColorStateList g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f483h = f476k;

    /* renamed from: i, reason: collision with root package name */
    public String f484i = null;
    public String j;

    public IconCompat(int i3) {
        this.f477a = i3;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f10 = 0.5f * f3;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f3 * 0.020833334f, 1023410176);
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

    public static IconCompat b(int i3) {
        if (i3 == 0) {
            a1.e("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f481e = i3;
        iconCompat.f478b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int c() {
        int i3 = this.f477a;
        if (i3 != -1) {
            if (i3 == 2) {
                return this.f481e;
            }
            r.s(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.f478b;
        if (Build.VERSION.SDK_INT >= 28) {
            return k.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        }
    }

    public final int d() {
        int i3 = this.f477a;
        if (i3 != -1) {
            return i3;
        }
        Object obj = this.f478b;
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        }
    }

    public final Uri e() {
        int i3 = this.f477a;
        if (i3 != -1) {
            if (i3 == 4 || i3 == 6) {
                return Uri.parse((String) this.f478b);
            }
            r.s(this, "called getUri() on ");
            return null;
        }
        Object obj = this.f478b;
        if (Build.VERSION.SDK_INT >= 28) {
            return k.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon createWithBitmap;
        int i3 = this.f477a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i3) {
            case -1:
                return (Icon) this.f478b;
            case 0:
            default:
                a1.e("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f478b);
                break;
            case 2:
                if (i3 == -1) {
                    Object obj = this.f478b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = k.f(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (NoSuchMethodException e9) {
                            Log.e("IconCompat", "Unable to get icon package", e9);
                        } catch (InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        r.s(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f478b).split(":", -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f481e);
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                createWithBitmap = Icon.createWithData((byte[]) this.f478b, this.f481e, this.f482f);
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                createWithBitmap = Icon.createWithContentUri((String) this.f478b);
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                int i10 = Build.VERSION.SDK_INT;
                Object obj2 = this.f478b;
                if (i10 < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) obj2, false));
                    break;
                } else {
                    createWithBitmap = e3.j.b((Bitmap) obj2);
                    break;
                }
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = b.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e11 = e();
                    String scheme = e11.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e11);
                        } catch (Exception e12) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e11, e12);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f478b));
                        } catch (FileNotFoundException e13) {
                            Log.w("IconCompat", "Unable to load image from path: " + e11, e13);
                        }
                    }
                    if (openInputStream == null) {
                        a1.i(e(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = e3.j.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f483h;
        if (mode != f476k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f477a == -1) {
            return String.valueOf(this.f478b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f477a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f477a) {
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f478b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f478b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                sb2.append(" len=");
                sb2.append(this.f481e);
                if (this.f482f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f482f);
                    break;
                }
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                sb2.append(" uri=");
                sb2.append(this.f478b);
                break;
        }
        if (this.g != null) {
            sb2.append(" tint=");
            sb2.append(this.g);
        }
        if (this.f483h != f476k) {
            sb2.append(" mode=");
            sb2.append(this.f483h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
