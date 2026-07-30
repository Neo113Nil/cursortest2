package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import t0.AbstractC5051n;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340d implements InterfaceC0338c, InterfaceC0342e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2251n = 0;

    /* renamed from: u, reason: collision with root package name */
    public ClipData f2252u;

    /* renamed from: v, reason: collision with root package name */
    public int f2253v;

    /* renamed from: w, reason: collision with root package name */
    public int f2254w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f2255x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f2256y;

    public /* synthetic */ C0340d() {
    }

    @Override // O.InterfaceC0338c
    public C0344f build() {
        return new C0344f(new C0340d(this));
    }

    @Override // O.InterfaceC0342e
    public int c() {
        return this.f2253v;
    }

    @Override // O.InterfaceC0342e
    public ClipData d() {
        return this.f2252u;
    }

    @Override // O.InterfaceC0338c
    public void e(Bundle bundle) {
        this.f2256y = bundle;
    }

    @Override // O.InterfaceC0338c
    public void h(Uri uri) {
        this.f2255x = uri;
    }

    @Override // O.InterfaceC0338c
    public void i(int i) {
        this.f2254w = i;
    }

    public String toString() {
        String str;
        switch (this.f2251n) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2252u.getDescription());
                sb.append(", source=");
                int i = this.f2253v;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f2254w;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = this.f2255x;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC5051n.g(sb, this.f2256y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // O.InterfaceC0342e
    public int w() {
        return this.f2254w;
    }

    @Override // O.InterfaceC0342e
    public ContentInfo y() {
        return null;
    }

    public C0340d(C0340d c0340d) {
        ClipData clipData = c0340d.f2252u;
        clipData.getClass();
        this.f2252u = clipData;
        int i = c0340d.f2253v;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f2253v = i;
        int i4 = c0340d.f2254w;
        if ((i4 & 1) == i4) {
            this.f2254w = i4;
            this.f2255x = c0340d.f2255x;
            this.f2256y = c0340d.f2256y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
