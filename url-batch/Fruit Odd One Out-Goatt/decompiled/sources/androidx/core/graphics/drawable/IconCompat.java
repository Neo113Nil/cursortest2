package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f12k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f13a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f15c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f16d;

    /* renamed from: e, reason: collision with root package name */
    public int f17e;

    /* renamed from: f, reason: collision with root package name */
    public int f18f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f19g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f20h;

    /* renamed from: i, reason: collision with root package name */
    public String f21i;

    /* renamed from: j, reason: collision with root package name */
    public String f22j;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i2;
        if (this.f13a == -1) {
            return String.valueOf(this.f14b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f13a) {
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
        switch (this.f13a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f14b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f14b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f22j);
                sb.append(" id=");
                int i3 = this.f13a;
                if (i3 == -1) {
                    Object obj = this.f14b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        i2 = a.a(obj);
                    } else {
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f19g != null) {
                            }
                            if (this.f20h != f12k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f19g != null) {
                            }
                            if (this.f20h != f12k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            i2 = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                            if (this.f19g != null) {
                            }
                            if (this.f20h != f12k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f17e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f17e);
                if (this.f18f != 0) {
                    sb.append(" off=");
                    sb.append(this.f18f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f14b);
                break;
        }
        if (this.f19g != null) {
            sb.append(" tint=");
            sb.append(this.f19g);
        }
        if (this.f20h != f12k) {
            sb.append(" mode=");
            sb.append(this.f20h);
        }
        sb.append(")");
        return sb.toString();
    }
}
