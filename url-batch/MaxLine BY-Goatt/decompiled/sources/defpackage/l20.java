package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l20 implements k20, m20 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public l20(l20 l20Var) {
        ClipData clipData = l20Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = l20Var.c;
        if (i < 0) {
            Locale locale = Locale.US;
            lh.e("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            lh.e("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = l20Var.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = l20Var.e;
            this.f = l20Var.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.m20
    public ClipData a() {
        return this.b;
    }

    @Override // defpackage.m20
    public int b() {
        return this.d;
    }

    @Override // defpackage.k20
    public n20 build() {
        return new n20(new l20(this));
    }

    @Override // defpackage.m20
    public ContentInfo c() {
        return null;
    }

    @Override // defpackage.k20
    public void d(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.m20
    public int e() {
        return this.c;
    }

    @Override // defpackage.k20
    public void f(int i) {
        this.d = i;
    }

    @Override // defpackage.k20
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = BuildConfig.FLAVOR;
                if (uri == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.f != null) {
                    str2 = ", hasExtras";
                }
                return q40.p(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l20() {
    }
}
