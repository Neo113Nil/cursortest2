package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static IconCompat c(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(null);
        iconCompat.f = i;
        iconCompat.c = "";
        iconCompat.k = "";
        return iconCompat;
    }

    public final int a() {
        int resId;
        int i = this.b;
        if (i == -1) {
            resId = ((Icon) this.c).getResId();
            return resId;
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final Uri b() {
        Uri uri;
        int i = this.b;
        if (i == -1) {
            uri = ((Icon) this.c).getUri();
            return uri;
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.c);
        }
        toString();
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
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
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(byte[] bArr) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = 2;
    }
}
