package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class kd implements jd, ld {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public kd(kd kdVar) {
        ClipData clipData = kdVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = kdVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            o8.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            o8.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = kdVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = kdVar.j;
            this.k = kdVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.jd
    public md build() {
        return new md(new kd(this));
    }

    @Override // defpackage.ld
    public ClipData d() {
        return this.g;
    }

    @Override // defpackage.ld
    public int k() {
        return this.i;
    }

    @Override // defpackage.ld
    public ContentInfo l() {
        return null;
    }

    @Override // defpackage.jd
    public void p(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.ld
    public int q() {
        return this.h;
    }

    @Override // defpackage.jd
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    @Override // defpackage.jd
    public void t(int i) {
        this.i = i;
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

    public /* synthetic */ kd() {
    }
}
