package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o0.AbstractC0305a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006d implements InterfaceC0004c, InterfaceC0008e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f430a;

    /* renamed from: b, reason: collision with root package name */
    public Object f431b;

    /* renamed from: c, reason: collision with root package name */
    public int f432c;

    /* renamed from: d, reason: collision with root package name */
    public int f433d;

    /* renamed from: e, reason: collision with root package name */
    public Object f434e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f435f;

    public /* synthetic */ C0006d() {
        this.f430a = 0;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        this.f435f = bundle;
    }

    public void b(B0 b02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((o0) it.next()).f482a.c() & 8) != 0) {
                ((View) this.f434e).setTranslationY(AbstractC0305a.c(this.f433d, 0, r3.f482a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0004c
    public void c(Uri uri) {
        this.f434e = uri;
    }

    @Override // K.InterfaceC0008e
    public int d() {
        return this.f432c;
    }

    @Override // K.InterfaceC0008e
    public ClipData h() {
        return (ClipData) this.f431b;
    }

    @Override // K.InterfaceC0004c
    public C0010f i() {
        return new C0010f(new C0006d(this));
    }

    @Override // K.InterfaceC0008e
    public int l() {
        return this.f433d;
    }

    @Override // K.InterfaceC0008e
    public ContentInfo o() {
        return null;
    }

    @Override // K.InterfaceC0004c
    public void r(int i) {
        this.f433d = i;
    }

    public String toString() {
        String str;
        switch (this.f430a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f431b).getDescription());
                sb.append(", source=");
                int i = this.f432c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f433d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f434e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f435f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006d(View view) {
        this.f430a = 2;
        this.f435f = new int[2];
        this.f434e = view;
    }

    public C0006d(C0006d c0006d) {
        this.f430a = 1;
        ClipData clipData = (ClipData) c0006d.f431b;
        clipData.getClass();
        this.f431b = clipData;
        int i = c0006d.f432c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f432c = i;
            int i2 = c0006d.f433d;
            if ((i2 & 1) == i2) {
                this.f433d = i2;
                this.f434e = (Uri) c0006d.f434e;
                this.f435f = (Bundle) c0006d.f435f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
