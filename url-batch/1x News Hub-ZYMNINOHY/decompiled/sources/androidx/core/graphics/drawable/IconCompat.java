package androidx.core.graphics.drawable;

import E.AbstractC0003d;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2173k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f2175b;

    /* renamed from: j, reason: collision with root package name */
    public String f2182j;

    /* renamed from: a, reason: collision with root package name */
    public int f2174a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2176c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2177d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f2178e = 0;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2179g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2180h = f2173k;

    /* renamed from: i, reason: collision with root package name */
    public String f2181i = null;

    public static IconCompat a(int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2176c = null;
        iconCompat.f2177d = null;
        iconCompat.f = 0;
        iconCompat.f2179g = null;
        iconCompat.f2180h = f2173k;
        iconCompat.f2181i = null;
        iconCompat.f2174a = 2;
        iconCompat.f2178e = i3;
        iconCompat.f2175b = "";
        iconCompat.f2182j = "";
        return iconCompat;
    }

    public final int b() {
        int i3 = this.f2174a;
        if (i3 != -1) {
            if (i3 == 2) {
                return this.f2178e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = this.f2175b;
        if (i4 >= 28) {
            return AbstractC0003d.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        }
    }

    public final Uri c() {
        int i3 = this.f2174a;
        if (i3 != -1) {
            if (i3 == 4 || i3 == 6) {
                return Uri.parse((String) this.f2175b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = this.f2175b;
        if (i4 >= 28) {
            return AbstractC0003d.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f2174a == -1) {
            return String.valueOf(this.f2175b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2174a) {
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
        switch (this.f2174a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2175b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2175b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2182j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2178e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2175b);
                break;
        }
        if (this.f2179g != null) {
            sb.append(" tint=");
            sb.append(this.f2179g);
        }
        if (this.f2180h != f2173k) {
            sb.append(" mode=");
            sb.append(this.f2180h);
        }
        sb.append(")");
        return sb.toString();
    }
}
