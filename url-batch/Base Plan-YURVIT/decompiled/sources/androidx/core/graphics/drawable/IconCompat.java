package androidx.core.graphics.drawable;

import H.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import s.b;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1396k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1398b;

    /* renamed from: j, reason: collision with root package name */
    public String f1406j;

    /* renamed from: a, reason: collision with root package name */
    public int f1397a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1399c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1400d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1401e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1402f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1403g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1404h = f1396k;

    /* renamed from: i, reason: collision with root package name */
    public String f1405i = null;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i2;
        if (this.f1397a == -1) {
            return String.valueOf(this.f1398b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1397a) {
            case 1:
                str = "BITMAP";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
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
        switch (this.f1397a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1398b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1398b).getHeight());
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f1406j);
                sb.append(" id=");
                int i3 = this.f1397a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f1398b;
                    if (i4 >= 28) {
                        i2 = b.a(obj);
                    } else {
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1403g != null) {
                            }
                            if (this.f1404h != f1396k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1403g != null) {
                            }
                            if (this.f1404h != f1396k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f1403g != null) {
                            }
                            if (this.f1404h != f1396k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f1401e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f1401e);
                if (this.f1402f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1402f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f1398b);
                break;
        }
        if (this.f1403g != null) {
            sb.append(" tint=");
            sb.append(this.f1403g);
        }
        if (this.f1404h != f1396k) {
            sb.append(" mode=");
            sb.append(this.f1404h);
        }
        sb.append(")");
        return sb.toString();
    }
}
