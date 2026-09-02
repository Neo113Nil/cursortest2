package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2720f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ClipData f2721g;

    /* renamed from: h, reason: collision with root package name */
    public int f2722h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f2723j;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f2724k;

    public /* synthetic */ d() {
    }

    @Override // n0.c
    public f build() {
        return new f(new d(this));
    }

    @Override // n0.e
    public ClipData f() {
        return this.f2721g;
    }

    @Override // n0.e
    public int h() {
        return this.i;
    }

    @Override // n0.e
    public ContentInfo l() {
        return null;
    }

    @Override // n0.c
    public void q(Uri uri) {
        this.f2723j = uri;
    }

    @Override // n0.e
    public int r() {
        return this.f2722h;
    }

    @Override // n0.c
    public void setExtras(Bundle bundle) {
        this.f2724k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f2720f) {
            case 1:
                Uri uri = this.f2723j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2721g.getDescription());
                sb.append(", source=");
                int i = this.f2722h;
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
                sb.append(this.f2724k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // n0.c
    public void x(int i) {
        this.i = i;
    }

    public d(d dVar) {
        ClipData clipData = dVar.f2721g;
        clipData.getClass();
        this.f2721g = clipData;
        int i = dVar.f2722h;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f2722h = i;
        int i4 = dVar.i;
        if ((i4 & 1) == i4) {
            this.i = i4;
            this.f2723j = dVar.f2723j;
            this.f2724k = dVar.f2724k;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
