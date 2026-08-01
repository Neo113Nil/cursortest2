package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import g0.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f282k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f284b;

    /* renamed from: j, reason: collision with root package name */
    public String f290j;

    /* renamed from: a, reason: collision with root package name */
    public int f283a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f285c = null;
    public Parcelable d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f286e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f287f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f288g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f289h = f282k;
    public String i = null;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i;
        if (this.f283a == -1) {
            return String.valueOf(this.f284b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f283a) {
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
        switch (this.f283a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f284b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f284b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f290j);
                sb.append(" id=");
                int i4 = this.f283a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f284b;
                    if (i5 >= 28) {
                        i = a.b(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f288g != null) {
                            }
                            if (this.f289h != f282k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f288g != null) {
                            }
                            if (this.f289h != f282k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f288g != null) {
                            }
                            if (this.f289h != f282k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.f286e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f286e);
                if (this.f287f != 0) {
                    sb.append(" off=");
                    sb.append(this.f287f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f284b);
                break;
        }
        if (this.f288g != null) {
            sb.append(" tint=");
            sb.append(this.f288g);
        }
        if (this.f289h != f282k) {
            sb.append(" mode=");
            sb.append(this.f289h);
        }
        sb.append(")");
        return sb.toString();
    }
}
