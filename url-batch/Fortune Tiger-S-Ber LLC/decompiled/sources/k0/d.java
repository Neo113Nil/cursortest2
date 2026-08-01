package k0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2726f = 0;
    public ClipData g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2727i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f2728j;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f2729k;

    public /* synthetic */ d() {
    }

    @Override // k0.c
    public f build() {
        return new f(new d(this));
    }

    @Override // k0.e
    public ClipData c() {
        return this.g;
    }

    @Override // k0.e
    public int m() {
        return this.f2727i;
    }

    @Override // k0.e
    public ContentInfo n() {
        return null;
    }

    @Override // k0.c
    public void p(Uri uri) {
        this.f2728j = uri;
    }

    @Override // k0.e
    public int q() {
        return this.h;
    }

    @Override // k0.c
    public void s(int i4) {
        this.f2727i = i4;
    }

    @Override // k0.c
    public void setExtras(Bundle bundle) {
        this.f2729k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f2726f) {
            case 1:
                Uri uri = this.f2728j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.g.getDescription());
                sb.append(", source=");
                int i4 = this.h;
                sb.append(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i5 = this.f2727i;
                sb.append((i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f2729k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.g;
        clipData.getClass();
        this.g = clipData;
        int i4 = dVar.h;
        if (i4 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i4 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.h = i4;
        int i5 = dVar.f2727i;
        if ((i5 & 1) == i5) {
            this.f2727i = i5;
            this.f2728j = dVar.f2728j;
            this.f2729k = dVar.f2729k;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
