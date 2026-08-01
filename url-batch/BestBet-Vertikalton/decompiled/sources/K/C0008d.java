package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y0.AbstractC0395a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008d implements InterfaceC0007c, InterfaceC0009e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f600a;

    /* renamed from: b, reason: collision with root package name */
    public Object f601b;

    /* renamed from: c, reason: collision with root package name */
    public int f602c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f603e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f604f;

    public /* synthetic */ C0008d() {
        this.f600a = 0;
    }

    @Override // K.InterfaceC0007c
    public void a(Bundle bundle) {
        this.f604f = bundle;
    }

    @Override // K.InterfaceC0007c
    public void b(Uri uri) {
        this.f603e = uri;
    }

    @Override // K.InterfaceC0009e
    public int c() {
        return this.f602c;
    }

    public void d(w0 w0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((j0) it.next()).f628a.c() & 8) != 0) {
                ((View) this.f603e).setTranslationY(AbstractC0395a.c(r3.f628a.b(), this.d, 0));
                return;
            }
        }
    }

    @Override // K.InterfaceC0009e
    public ClipData f() {
        return (ClipData) this.f601b;
    }

    @Override // K.InterfaceC0007c
    public C0010f h() {
        return new C0010f(new C0008d(this));
    }

    @Override // K.InterfaceC0009e
    public int k() {
        return this.d;
    }

    @Override // K.InterfaceC0009e
    public ContentInfo m() {
        return null;
    }

    @Override // K.InterfaceC0007c
    public void o(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f600a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f601b).getDescription());
                sb.append(", source=");
                int i = this.f602c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f603e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f604f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0008d(View view) {
        this.f600a = 2;
        this.f604f = new int[2];
        this.f603e = view;
    }

    public C0008d(C0008d c0008d) {
        this.f600a = 1;
        ClipData clipData = (ClipData) c0008d.f601b;
        clipData.getClass();
        this.f601b = clipData;
        int i = c0008d.f602c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f602c = i;
            int i2 = c0008d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f603e = (Uri) c0008d.f603e;
                this.f604f = (Bundle) c0008d.f604f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
