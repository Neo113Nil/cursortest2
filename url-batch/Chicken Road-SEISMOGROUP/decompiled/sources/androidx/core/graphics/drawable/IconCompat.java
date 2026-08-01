package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i.AbstractC0038a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f472k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f474b;

    /* renamed from: j, reason: collision with root package name */
    public String f482j;

    /* renamed from: a, reason: collision with root package name */
    public int f473a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f475c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f476d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f477e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f478f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f479g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f480h = f472k;

    /* renamed from: i, reason: collision with root package name */
    public String f481i = null;

    public final String toString() {
        String str;
        int i2;
        if (this.f473a == -1) {
            return String.valueOf(this.f474b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f473a) {
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
        switch (this.f473a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f474b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f474b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f482j);
                sb.append(" id=");
                int i3 = this.f473a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f474b;
                    if (i4 >= 28) {
                        i2 = AbstractC0038a.a(obj);
                    } else {
                        i2 = 0;
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f477e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f477e);
                if (this.f478f != 0) {
                    sb.append(" off=");
                    sb.append(this.f478f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f474b);
                break;
        }
        if (this.f479g != null) {
            sb.append(" tint=");
            sb.append(this.f479g);
        }
        if (this.f480h != f472k) {
            sb.append(" mode=");
            sb.append(this.f480h);
        }
        sb.append(")");
        return sb.toString();
    }
}
