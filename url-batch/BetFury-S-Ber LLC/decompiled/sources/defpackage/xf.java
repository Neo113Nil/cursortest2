package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xf implements wf, yf {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public xf(xf xfVar) {
        ClipData clipData = xfVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = xfVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            s9.k("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            s9.k("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = xfVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = xfVar.j;
            this.k = xfVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.wf
    public zf build() {
        return new zf(new xf(this));
    }

    @Override // defpackage.yf
    public ClipData c() {
        return this.g;
    }

    @Override // defpackage.yf
    public int k() {
        return this.i;
    }

    @Override // defpackage.yf
    public ContentInfo l() {
        return null;
    }

    @Override // defpackage.wf
    public void q(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.yf
    public int r() {
        return this.h;
    }

    @Override // defpackage.wf
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f) {
            case 1:
                Uri uri = this.j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.g.getDescription());
                sb.append(", source=");
                int i = this.h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return r7.d(sb, this.k != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wf
    public void u(int i) {
        this.i = i;
    }

    public /* synthetic */ xf() {
    }
}
