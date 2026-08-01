package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gd implements fd, hd {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public gd(gd gdVar) {
        ClipData clipData = gdVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = gdVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            t8.k("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            t8.k("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = gdVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = gdVar.j;
            this.k = gdVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.fd
    public id build() {
        return new id(new gd(this));
    }

    @Override // defpackage.hd
    public ClipData d() {
        return this.g;
    }

    @Override // defpackage.hd
    public int n() {
        return this.i;
    }

    @Override // defpackage.hd
    public ContentInfo o() {
        return null;
    }

    @Override // defpackage.fd
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
                sb.append(this.k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fd
    public void u(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.hd
    public int v() {
        return this.h;
    }

    @Override // defpackage.fd
    public void y(int i) {
        this.i = i;
    }

    public /* synthetic */ gd() {
    }
}
