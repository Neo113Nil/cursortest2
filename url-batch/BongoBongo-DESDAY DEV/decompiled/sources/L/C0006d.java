package L;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r0.AbstractC0292a;

/* renamed from: L.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006d implements InterfaceC0004c, InterfaceC0007e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511a;

    /* renamed from: b, reason: collision with root package name */
    public Object f512b;

    /* renamed from: c, reason: collision with root package name */
    public int f513c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f514e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f515f;

    public /* synthetic */ C0006d() {
        this.f511a = 0;
    }

    @Override // L.InterfaceC0004c
    public void a(Bundle bundle) {
        this.f515f = bundle;
    }

    public void b(z0 z0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((m0) it.next()).f548a.c() & 8) != 0) {
                ((View) this.f514e).setTranslationY(AbstractC0292a.c(this.d, 0, r3.f548a.b()));
                return;
            }
        }
    }

    @Override // L.InterfaceC0004c
    public void c(Uri uri) {
        this.f514e = uri;
    }

    @Override // L.InterfaceC0007e
    public int e() {
        return this.f513c;
    }

    @Override // L.InterfaceC0007e
    public ClipData i() {
        return (ClipData) this.f512b;
    }

    @Override // L.InterfaceC0004c
    public C0008f k() {
        return new C0008f(new C0006d(this));
    }

    @Override // L.InterfaceC0007e
    public int n() {
        return this.d;
    }

    @Override // L.InterfaceC0007e
    public ContentInfo r() {
        return null;
    }

    @Override // L.InterfaceC0004c
    public void t(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f511a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f512b).getDescription());
                sb.append(", source=");
                int i = this.f513c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f514e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f515f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006d(View view) {
        this.f511a = 2;
        this.f515f = new int[2];
        this.f514e = view;
    }

    public C0006d(C0006d c0006d) {
        this.f511a = 1;
        ClipData clipData = (ClipData) c0006d.f512b;
        clipData.getClass();
        this.f512b = clipData;
        int i = c0006d.f513c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f513c = i;
            int i2 = c0006d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f514e = (Uri) c0006d.f514e;
                this.f515f = (Bundle) c0006d.f515f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
