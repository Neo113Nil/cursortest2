package androidx.core.graphics.drawable;

import K.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import u.c;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1557k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1559b;

    /* renamed from: j, reason: collision with root package name */
    public String f1567j;

    /* renamed from: a, reason: collision with root package name */
    public int f1558a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1560c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1561d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1562e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1563f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1564g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1565h = f1557k;

    /* renamed from: i, reason: collision with root package name */
    public String f1566i = null;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i2;
        int i3;
        if (this.f1558a == -1) {
            return String.valueOf(this.f1559b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1558a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1558a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1559b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1559b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1567j);
                sb.append(" id=");
                int i4 = this.f1558a;
                if (i4 == -1 && (i3 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = this.f1559b;
                    if (i3 >= 28) {
                        i2 = c.a(obj);
                    } else {
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1564g != null) {
                            }
                            if (this.f1565h != f1557k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1564g != null) {
                            }
                            if (this.f1565h != f1557k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1564g != null) {
                            }
                            if (this.f1565h != f1557k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f1562e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1562e);
                if (this.f1563f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1563f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f1559b);
                break;
        }
        if (this.f1564g != null) {
            sb.append(" tint=");
            sb.append(this.f1564g);
        }
        if (this.f1565h != f1557k) {
            sb.append(" mode=");
            sb.append(this.f1565h);
        }
        sb.append(")");
        return sb.toString();
    }
}
