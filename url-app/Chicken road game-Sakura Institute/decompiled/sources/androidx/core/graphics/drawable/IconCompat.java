package androidx.core.graphics.drawable;

import W0.a;
import W0.c;
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
    public static final PorterDuff.Mode f5228k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f5230b;

    /* renamed from: j, reason: collision with root package name */
    public String f5238j;

    /* renamed from: a, reason: collision with root package name */
    public int f5229a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5231c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f5232d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f5233e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f5234f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f5235g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5236h = f5228k;

    /* renamed from: i, reason: collision with root package name */
    public String f5237i = null;

    public static IconCompat a(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5231c = null;
        iconCompat.f5232d = null;
        iconCompat.f5234f = 0;
        iconCompat.f5235g = null;
        iconCompat.f5236h = f5228k;
        iconCompat.f5237i = null;
        iconCompat.f5229a = 2;
        iconCompat.f5233e = i2;
        iconCompat.f5230b = "";
        iconCompat.f5238j = "";
        return iconCompat;
    }

    public final int b() {
        int i2 = this.f5229a;
        if (i2 != -1) {
            if (i2 == 2) {
                return this.f5233e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = this.f5230b;
        if (i4 >= 28) {
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

    public final Uri c() {
        int i2 = this.f5229a;
        if (i2 == -1) {
            return a.a(this.f5230b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f5230b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f5229a == -1) {
            return String.valueOf(this.f5230b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5229a) {
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
        switch (this.f5229a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5230b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f5230b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5238j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5233e);
                if (this.f5234f != 0) {
                    sb.append(" off=");
                    sb.append(this.f5234f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f5230b);
                break;
        }
        if (this.f5235g != null) {
            sb.append(" tint=");
            sb.append(this.f5235g);
        }
        if (this.f5236h != f5228k) {
            sb.append(" mode=");
            sb.append(this.f5236h);
        }
        sb.append(")");
        return sb.toString();
    }
}
