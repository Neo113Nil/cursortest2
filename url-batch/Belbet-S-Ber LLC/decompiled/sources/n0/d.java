package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2765f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ClipData f2766g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f2767j;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f2768k;

    public /* synthetic */ d() {
    }

    @Override // n0.c
    public void A(int i) {
        this.i = i;
    }

    @Override // n0.c
    public f build() {
        return new f(new d(this));
    }

    @Override // n0.e
    public ClipData e() {
        return this.f2766g;
    }

    @Override // n0.e
    public int o() {
        return this.i;
    }

    @Override // n0.e
    public ContentInfo r() {
        return null;
    }

    @Override // n0.c
    public void setExtras(Bundle bundle) {
        this.f2768k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f2765f) {
            case 1:
                Uri uri = this.f2767j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2766g.getDescription());
                sb.append(", source=");
                int i = this.h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.i;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f2768k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // n0.c
    public void w(Uri uri) {
        this.f2767j = uri;
    }

    @Override // n0.e
    public int x() {
        return this.h;
    }

    public d(d dVar) {
        ClipData clipData = dVar.f2766g;
        clipData.getClass();
        this.f2766g = clipData;
        int i = dVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.h = i;
        int i4 = dVar.i;
        if ((i4 & 1) == i4) {
            this.i = i4;
            this.f2767j = dVar.f2767j;
            this.f2768k = dVar.f2768k;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
