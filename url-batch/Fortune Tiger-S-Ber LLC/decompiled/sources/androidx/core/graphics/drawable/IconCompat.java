package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import d0.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f297k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f299b;

    /* renamed from: j, reason: collision with root package name */
    public String f304j;

    /* renamed from: a, reason: collision with root package name */
    public int f298a = -1;
    public byte[] c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f300d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f301e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f302f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = f297k;

    /* renamed from: i, reason: collision with root package name */
    public String f303i = null;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i4;
        if (this.f298a == -1) {
            return String.valueOf(this.f299b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f298a) {
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
        switch (this.f298a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f299b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f299b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f304j);
                sb.append(" id=");
                int i5 = this.f298a;
                if (i5 == -1) {
                    int i6 = Build.VERSION.SDK_INT;
                    Object obj = this.f299b;
                    if (i6 >= 28) {
                        i4 = a.b(obj);
                    } else {
                        try {
                            i4 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            i4 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i4)));
                            if (this.g != null) {
                            }
                            if (this.h != f297k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                            i4 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i4)));
                            if (this.g != null) {
                            }
                            if (this.h != f297k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                            i4 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i4)));
                            if (this.g != null) {
                            }
                            if (this.h != f297k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i4 = this.f301e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i4)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f301e);
                if (this.f302f != 0) {
                    sb.append(" off=");
                    sb.append(this.f302f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f299b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != f297k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
