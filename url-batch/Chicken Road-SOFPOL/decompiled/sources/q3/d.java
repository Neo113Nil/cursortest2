package q3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements c, f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6092d = 0;

    /* renamed from: e, reason: collision with root package name */
    public ClipData f6093e;

    /* renamed from: f, reason: collision with root package name */
    public int f6094f;

    /* renamed from: g, reason: collision with root package name */
    public int f6095g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f6096h;
    public Bundle i;

    public /* synthetic */ d() {
    }

    @Override // q3.c
    public g build() {
        return new g(new d(this));
    }

    @Override // q3.f
    public ClipData c() {
        return this.f6093e;
    }

    @Override // q3.f
    public int i() {
        return this.f6095g;
    }

    @Override // q3.f
    public ContentInfo j() {
        return null;
    }

    @Override // q3.c
    public void m(Uri uri) {
        this.f6096h = uri;
    }

    @Override // q3.f
    public int n() {
        return this.f6094f;
    }

    @Override // q3.c
    public void q(int i) {
        this.f6095g = i;
    }

    @Override // q3.c
    public void setExtras(Bundle bundle) {
        this.i = bundle;
    }

    public String toString() {
        String str;
        switch (this.f6092d) {
            case 1:
                Uri uri = this.f6096h;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f6093e.getDescription());
                sb.append(", source=");
                int i = this.f6094f;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i8 = this.f6095g;
                sb.append((i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.i != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.f6093e;
        clipData.getClass();
        this.f6093e = clipData;
        int i = dVar.f6094f;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f6094f = i;
        int i8 = dVar.f6095g;
        if ((i8 & 1) == i8) {
            this.f6095g = i8;
            this.f6096h = dVar.f6096h;
            this.i = dVar.i;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
