package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f11779k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f11780a;

    /* renamed from: b, reason: collision with root package name */
    Object f11781b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11782c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f11783d;

    /* renamed from: e, reason: collision with root package name */
    public int f11784e;

    /* renamed from: f, reason: collision with root package name */
    public int f11785f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f11786g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f11787h;

    /* renamed from: i, reason: collision with root package name */
    public String f11788i;

    /* renamed from: j, reason: collision with root package name */
    public String f11789j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                return -1;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f11780a) {
                case -1:
                    return (Icon) iconCompat.f11781b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f11781b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.f11784e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f11781b, iconCompat.f11784e, iconCompat.f11785f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f11781b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f11781b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f11781b);
                        break;
                    }
                case 6:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream i5 = iconCompat.i(context);
                        if (i5 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        if (i4 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i5), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(i5));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f11786g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f11787h;
            if (mode != IconCompat.f11779k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f11780a = -1;
        this.f11782c = null;
        this.f11783d = null;
        this.f11784e = 0;
        this.f11785f = 0;
        this.f11786g = null;
        this.f11787h = f11779k;
        this.f11788i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = min;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z4) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        A.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f11781b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i4) {
        A.c.c(str);
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f11784e = i4;
        if (resources != null) {
            try {
                iconCompat.f11781b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f11781b = str;
        }
        iconCompat.f11789j = str;
        return iconCompat;
    }

    private static String n(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public Bitmap d() {
        int i4 = this.f11780a;
        if (i4 == -1) {
            Object obj = this.f11781b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i4 == 1) {
            return (Bitmap) this.f11781b;
        }
        if (i4 == 5) {
            return a((Bitmap) this.f11781b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i4 = this.f11780a;
        if (i4 == -1) {
            return a.a(this.f11781b);
        }
        if (i4 == 2) {
            return this.f11784e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i4 = this.f11780a;
        if (i4 == -1) {
            return a.b(this.f11781b);
        }
        if (i4 == 2) {
            String str = this.f11789j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f11781b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : this.f11789j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i4 = this.f11780a;
        return i4 == -1 ? a.c(this.f11781b) : i4;
    }

    public Uri h() {
        int i4 = this.f11780a;
        if (i4 == -1) {
            return a.d(this.f11781b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f11781b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h4 = h();
        String scheme = h4.getScheme();
        if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || b9.h.f15468b.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h4);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + h4, e4);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f11781b));
        } catch (FileNotFoundException e5) {
            Log.w("IconCompat", "Unable to load image from path: " + h4, e5);
            return null;
        }
    }

    public void j() {
        this.f11787h = PorterDuff.Mode.valueOf(this.f11788i);
        switch (this.f11780a) {
            case -1:
                Parcelable parcelable = this.f11783d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f11781b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f11783d;
                if (parcelable2 != null) {
                    this.f11781b = parcelable2;
                    return;
                }
                byte[] bArr = this.f11782c;
                this.f11781b = bArr;
                this.f11780a = 3;
                this.f11784e = 0;
                this.f11785f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f11782c, Charset.forName("UTF-16"));
                this.f11781b = str;
                if (this.f11780a == 2 && this.f11789j == null) {
                    this.f11789j = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f11781b = this.f11782c;
                return;
        }
    }

    public void k(boolean z4) {
        this.f11788i = this.f11787h.name();
        switch (this.f11780a) {
            case -1:
                if (z4) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f11783d = (Parcelable) this.f11781b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z4) {
                    this.f11783d = (Parcelable) this.f11781b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f11781b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f11782c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f11782c = ((String) this.f11781b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f11782c = (byte[]) this.f11781b;
                return;
            case 4:
            case 6:
                this.f11782c = this.f11781b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f11780a == -1) {
            return String.valueOf(this.f11781b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f11780a));
        switch (this.f11780a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f11781b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f11781b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f11789j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f11784e);
                if (this.f11785f != 0) {
                    sb.append(" off=");
                    sb.append(this.f11785f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f11781b);
                break;
        }
        if (this.f11786g != null) {
            sb.append(" tint=");
            sb.append(this.f11786g);
        }
        if (this.f11787h != f11779k) {
            sb.append(" mode=");
            sb.append(this.f11787h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i4) {
        this.f11782c = null;
        this.f11783d = null;
        this.f11784e = 0;
        this.f11785f = 0;
        this.f11786g = null;
        this.f11787h = f11779k;
        this.f11788i = null;
        this.f11780a = i4;
    }
}
