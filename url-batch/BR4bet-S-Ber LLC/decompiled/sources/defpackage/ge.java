package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ge implements fe, he {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public ge(ge geVar) {
        ClipData clipData = geVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = geVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            g9.i("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            g9.i("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = geVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = geVar.j;
            this.k = geVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.fe
    public ie build() {
        return new ie(new ge(this));
    }

    @Override // defpackage.he
    public ClipData c() {
        return this.g;
    }

    @Override // defpackage.he
    public int m() {
        return this.i;
    }

    @Override // defpackage.he
    public ContentInfo n() {
        return null;
    }

    @Override // defpackage.fe
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    @Override // defpackage.fe
    public void t(Uri uri) {
        this.j = uri;
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
                sb.append(this.k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.he
    public int u() {
        return this.h;
    }

    @Override // defpackage.fe
    public void x(int i) {
        this.i = i;
    }

    public /* synthetic */ ge() {
    }
}
