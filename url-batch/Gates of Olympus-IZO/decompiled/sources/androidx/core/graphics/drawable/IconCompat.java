package androidx.core.graphics.drawable;

import W0.a;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import h1.C0438i;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3754k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f3756b;

    /* renamed from: j, reason: collision with root package name */
    public String f3764j;

    /* renamed from: a, reason: collision with root package name */
    public int f3755a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3757c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3758d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f3759e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3760f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3761g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3762h = f3754k;

    /* renamed from: i, reason: collision with root package name */
    public String f3763i = null;

    public final String toString() {
        String str;
        int i3;
        if (this.f3755a == -1) {
            return String.valueOf(this.f3756b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3755a) {
            case 1:
                str = "BITMAP";
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
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
        switch (this.f3755a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3756b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3756b).getHeight());
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f3764j);
                sb.append(" id=");
                int i4 = this.f3755a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f3756b;
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
                    i3 = this.f3759e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i3)));
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f3759e);
                if (this.f3760f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3760f);
                    break;
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3756b);
                break;
        }
        if (this.f3761g != null) {
            sb.append(" tint=");
            sb.append(this.f3761g);
        }
        if (this.f3762h != f3754k) {
            sb.append(" mode=");
            sb.append(this.f3762h);
        }
        sb.append(")");
        return sb.toString();
    }
}
