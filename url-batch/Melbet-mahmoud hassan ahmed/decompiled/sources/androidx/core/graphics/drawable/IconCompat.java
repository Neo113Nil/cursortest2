package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import l.a;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f510k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f511a;

    /* renamed from: b, reason: collision with root package name */
    Object f512b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f513c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f514d;

    /* renamed from: e, reason: collision with root package name */
    public int f515e;

    /* renamed from: f, reason: collision with root package name */
    public int f516f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f517g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f518h;

    /* renamed from: i, reason: collision with root package name */
    public String f519i;

    /* renamed from: j, reason: collision with root package name */
    public String f520j;

    public IconCompat() {
        this.f511a = -1;
        this.f513c = null;
        this.f514d = null;
        this.f515e = 0;
        this.f516f = 0;
        this.f517g = null;
        this.f518h = f510k;
        this.f519i = null;
    }

    private IconCompat(int i7) {
        this.f511a = -1;
        this.f513c = null;
        this.f514d = null;
        this.f515e = 0;
        this.f516f = 0;
        this.f517g = null;
        this.f518h = f510k;
        this.f519i = null;
        this.f511a = i7;
    }

    static Bitmap f(Bitmap bitmap, boolean z6) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z6) {
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
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat g(Context context, int i7) {
        if (context != null) {
            return h(context.getResources(), context.getPackageName(), i7);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat h(Resources resources, String str, int i7) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f515e = i7;
        if (resources != null) {
            try {
                iconCompat.f512b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f512b = str;
        }
        iconCompat.f520j = str;
        return iconCompat;
    }

    private static int j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
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

    private static String l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon package", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon package", e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.e("IconCompat", "Unable to get icon package", e9);
            return null;
        }
    }

    private static Resources m(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e7);
            return null;
        }
    }

    private static int o(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e7) {
            e = e7;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e8) {
            e = e8;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri q(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable t(Context context) {
        switch (this.f511a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f512b);
            case 2:
                String k7 = k();
                if (TextUtils.isEmpty(k7)) {
                    k7 = context.getPackageName();
                }
                try {
                    return a.a(m(context, k7), this.f515e, context.getTheme());
                } catch (RuntimeException e7) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f515e), this.f512b), e7);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f512b, this.f515e, this.f516f));
            case 4:
                InputStream r7 = r(context);
                if (r7 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(r7));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), f((Bitmap) this.f512b, false));
            case 6:
                InputStream r8 = r(context);
                if (r8 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(r8))) : new BitmapDrawable(context.getResources(), f(BitmapFactory.decodeStream(r8), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String w(int i7) {
        switch (i7) {
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
                return "UNKNOWN";
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        Parcelable parcelable;
        this.f518h = PorterDuff.Mode.valueOf(this.f519i);
        switch (this.f511a) {
            case -1:
                parcelable = this.f514d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f514d;
                if (parcelable == null) {
                    byte[] bArr = this.f513c;
                    this.f512b = bArr;
                    this.f511a = 3;
                    this.f515e = 0;
                    this.f516f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f513c, Charset.forName("UTF-16"));
                this.f512b = str;
                if (this.f511a == 2 && this.f520j == null) {
                    this.f520j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f512b = this.f513c;
                return;
        }
        this.f512b = parcelable;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        this.f519i = this.f518h.name();
        switch (this.f511a) {
            case -1:
                if (z6) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z6) {
                    Bitmap bitmap = (Bitmap) this.f512b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f513c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f513c = ((String) this.f512b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f513c = (byte[]) this.f512b;
                return;
            case 4:
            case 6:
                this.f513c = this.f512b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f514d = (Parcelable) this.f512b;
    }

    public void e(Context context) {
        Object obj;
        if (this.f511a != 2 || (obj = this.f512b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String k7 = k();
            int identifier = m(context, k7).getIdentifier(str4, str3, str5);
            if (this.f515e != identifier) {
                Log.i("IconCompat", "Id has changed for " + k7 + " " + str);
                this.f515e = identifier;
            }
        }
    }

    public int i() {
        int i7 = this.f511a;
        if (i7 == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.f512b);
        }
        if (i7 == 2) {
            return this.f515e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String k() {
        int i7 = this.f511a;
        if (i7 == -1 && Build.VERSION.SDK_INT >= 23) {
            return l((Icon) this.f512b);
        }
        if (i7 == 2) {
            return TextUtils.isEmpty(this.f520j) ? ((String) this.f512b).split(":", -1)[0] : this.f520j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int n() {
        int i7 = this.f511a;
        return (i7 != -1 || Build.VERSION.SDK_INT < 23) ? i7 : o((Icon) this.f512b);
    }

    public Uri p() {
        int i7 = this.f511a;
        if (i7 == -1 && Build.VERSION.SDK_INT >= 23) {
            return q((Icon) this.f512b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f512b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream r(Context context) {
        StringBuilder sb;
        String str;
        Uri p7 = p();
        String scheme = p7.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(p7);
            } catch (Exception e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f512b));
            } catch (FileNotFoundException e8) {
                e = e8;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(p7);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public Drawable s(Context context) {
        e(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return v(context).loadDrawable(context);
        }
        Drawable t6 = t(context);
        if (t6 != null && (this.f517g != null || this.f518h != f510k)) {
            t6.mutate();
            n.a.a(t6, this.f517g);
            n.a.b(t6, this.f518h);
        }
        return t6;
    }

    public String toString() {
        int height;
        if (this.f511a == -1) {
            return String.valueOf(this.f512b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(w(this.f511a));
        switch (this.f511a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f512b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f512b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f520j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(i())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f515e);
                if (this.f516f != 0) {
                    sb.append(" off=");
                    height = this.f516f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f512b);
                break;
        }
        if (this.f517g != null) {
            sb.append(" tint=");
            sb.append(this.f517g);
        }
        if (this.f518h != f510k) {
            sb.append(" mode=");
            sb.append(this.f518h);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    public Icon u() {
        return v(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r0 >= 26) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Icon v(Context context) {
        Bitmap bitmap;
        Icon createWithResource;
        Bitmap bitmap2;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        switch (this.f511a) {
            case -1:
                return (Icon) this.f512b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                bitmap = (Bitmap) this.f512b;
                createWithResource = Icon.createWithBitmap(bitmap);
                colorStateList = this.f517g;
                if (colorStateList != null) {
                    createWithResource.setTintList(colorStateList);
                }
                mode = this.f518h;
                if (mode != f510k) {
                    createWithResource.setTintMode(mode);
                }
                return createWithResource;
            case 2:
                createWithResource = Icon.createWithResource(k(), this.f515e);
                colorStateList = this.f517g;
                if (colorStateList != null) {
                }
                mode = this.f518h;
                if (mode != f510k) {
                }
                return createWithResource;
            case 3:
                createWithResource = Icon.createWithData((byte[]) this.f512b, this.f515e, this.f516f);
                colorStateList = this.f517g;
                if (colorStateList != null) {
                }
                mode = this.f518h;
                if (mode != f510k) {
                }
                return createWithResource;
            case 4:
                createWithResource = Icon.createWithContentUri((String) this.f512b);
                colorStateList = this.f517g;
                if (colorStateList != null) {
                }
                mode = this.f518h;
                if (mode != f510k) {
                }
                return createWithResource;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmap2 = (Bitmap) this.f512b;
                    createWithResource = Icon.createWithAdaptiveBitmap(bitmap2);
                    colorStateList = this.f517g;
                    if (colorStateList != null) {
                    }
                    mode = this.f518h;
                    if (mode != f510k) {
                    }
                    return createWithResource;
                }
                bitmap2 = (Bitmap) this.f512b;
                bitmap = f(bitmap2, false);
                createWithResource = Icon.createWithBitmap(bitmap);
                colorStateList = this.f517g;
                if (colorStateList != null) {
                }
                mode = this.f518h;
                if (mode != f510k) {
                }
                return createWithResource;
            case 6:
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30) {
                    createWithResource = Icon.createWithAdaptiveBitmapContentUri(p());
                    colorStateList = this.f517g;
                    if (colorStateList != null) {
                    }
                    mode = this.f518h;
                    if (mode != f510k) {
                    }
                    return createWithResource;
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + p());
                }
                InputStream r7 = r(context);
                if (r7 == null) {
                    throw new IllegalStateException("Cannot load adaptive icon from uri: " + p());
                }
                bitmap2 = BitmapFactory.decodeStream(r7);
                break;
                break;
        }
    }
}
