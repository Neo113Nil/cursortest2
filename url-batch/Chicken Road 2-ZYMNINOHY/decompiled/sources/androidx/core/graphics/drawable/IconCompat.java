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
    public static final PorterDuff.Mode f4507k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f4509b;

    /* renamed from: j, reason: collision with root package name */
    public String f4517j;

    /* renamed from: a, reason: collision with root package name */
    public int f4508a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4510c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4511d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f4512e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4513f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4514g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4515h = f4507k;

    /* renamed from: i, reason: collision with root package name */
    public String f4516i = null;

    public static IconCompat a(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4510c = null;
        iconCompat.f4511d = null;
        iconCompat.f4513f = 0;
        iconCompat.f4514g = null;
        iconCompat.f4515h = f4507k;
        iconCompat.f4516i = null;
        iconCompat.f4508a = 2;
        iconCompat.f4512e = i4;
        iconCompat.f4509b = "";
        iconCompat.f4517j = "";
        return iconCompat;
    }

    public final int b() {
        int i4 = this.f4508a;
        if (i4 != -1) {
            if (i4 == 2) {
                return this.f4512e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f4509b;
        if (i5 >= 28) {
            return AbstractC0003d.d(obj);
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
        int i4 = this.f4508a;
        if (i4 != -1) {
            if (i4 == 4 || i4 == 6) {
                return Uri.parse((String) this.f4509b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f4509b;
        if (i5 >= 28) {
            return AbstractC0003d.m(obj);
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

    public final String toString() {
        String str;
        if (this.f4508a == -1) {
            return String.valueOf(this.f4509b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4508a) {
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
        switch (this.f4508a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4509b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4509b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4517j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4512e);
                if (this.f4513f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4513f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4509b);
                break;
        }
        if (this.f4514g != null) {
            sb.append(" tint=");
            sb.append(this.f4514g);
        }
        if (this.f4515h != f4507k) {
            sb.append(" mode=");
            sb.append(this.f4515h);
        }
        sb.append(")");
        return sb.toString();
    }
}
