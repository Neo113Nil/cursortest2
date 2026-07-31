package androidx.core.graphics.drawable;

import Y0.a;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import k1.i;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4954k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f4956b;

    /* renamed from: j, reason: collision with root package name */
    public String f4964j;

    /* renamed from: a, reason: collision with root package name */
    public int f4955a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4957c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4958d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f4959e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4960f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4961g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4962h = f4954k;

    /* renamed from: i, reason: collision with root package name */
    public String f4963i = null;

    public final String toString() {
        String str;
        int i3;
        if (this.f4955a == -1) {
            return String.valueOf(this.f4956b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4955a) {
            case 1:
                str = "BITMAP";
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
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
        switch (this.f4955a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4956b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4956b).getHeight());
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f4964j);
                sb.append(" id=");
                int i4 = this.f4955a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f4956b;
                    if (i5 >= 28) {
                        i3 = a.a(obj);
                    } else {
                        i3 = 0;
                        try {
                            i3 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i3 = this.f4959e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i3)));
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f4959e);
                if (this.f4960f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4960f);
                    break;
                }
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4956b);
                break;
        }
        if (this.f4961g != null) {
            sb.append(" tint=");
            sb.append(this.f4961g);
        }
        if (this.f4962h != f4954k) {
            sb.append(" mode=");
            sb.append(this.f4962h);
        }
        sb.append(")");
        return sb.toString();
    }
}
