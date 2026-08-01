package M;

import G1.AbstractC0001b;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u0.AbstractC0389a;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008d implements InterfaceC0007c, InterfaceC0009e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a;

    /* renamed from: b, reason: collision with root package name */
    public Object f735b;

    /* renamed from: c, reason: collision with root package name */
    public int f736c;

    /* renamed from: d, reason: collision with root package name */
    public int f737d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f738f;

    public /* synthetic */ C0008d() {
        this.f734a = 0;
    }

    @Override // M.InterfaceC0007c
    public void a(Bundle bundle) {
        this.f738f = bundle;
    }

    public void b(t0 t0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((g0) it.next()).f755a.c() & 8) != 0) {
                ((View) this.e).setTranslationY(AbstractC0389a.c(this.f737d, 0, r3.f755a.b()));
                return;
            }
        }
    }

    @Override // M.InterfaceC0007c
    public void c(Uri uri) {
        this.e = uri;
    }

    @Override // M.InterfaceC0009e
    public int d() {
        return this.f736c;
    }

    @Override // M.InterfaceC0009e
    public ClipData f() {
        return (ClipData) this.f735b;
    }

    @Override // M.InterfaceC0007c
    public C0010f h() {
        return new C0010f(new C0008d(this));
    }

    @Override // M.InterfaceC0009e
    public int l() {
        return this.f737d;
    }

    @Override // M.InterfaceC0009e
    public ContentInfo o() {
        return null;
    }

    @Override // M.InterfaceC0007c
    public void p(int i) {
        this.f737d = i;
    }

    public String toString() {
        String str;
        switch (this.f734a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f735b).getDescription());
                sb.append(", source=");
                int i = this.f736c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f737d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0001b.g(sb, ((Bundle) this.f738f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0008d(View view) {
        this.f734a = 2;
        this.f738f = new int[2];
        this.e = view;
    }

    public C0008d(C0008d c0008d) {
        this.f734a = 1;
        ClipData clipData = (ClipData) c0008d.f735b;
        clipData.getClass();
        this.f735b = clipData;
        int i = c0008d.f736c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f736c = i;
            int i2 = c0008d.f737d;
            if ((i2 & 1) == i2) {
                this.f737d = i2;
                this.e = (Uri) c0008d.e;
                this.f738f = (Bundle) c0008d.f738f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
