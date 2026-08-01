package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import q0.AbstractC0289a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006d implements InterfaceC0004c, InterfaceC0007e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f444a;

    /* renamed from: b, reason: collision with root package name */
    public Object f445b;

    /* renamed from: c, reason: collision with root package name */
    public int f446c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f447e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f448f;

    public /* synthetic */ C0006d() {
        this.f444a = 0;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        this.f448f = bundle;
    }

    public void b(z0 z0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((m0) it.next()).f480a.c() & 8) != 0) {
                ((View) this.f447e).setTranslationY(AbstractC0289a.c(this.d, 0, r3.f480a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0004c
    public void c(Uri uri) {
        this.f447e = uri;
    }

    @Override // K.InterfaceC0007e
    public int d() {
        return this.f446c;
    }

    @Override // K.InterfaceC0007e
    public ClipData i() {
        return (ClipData) this.f445b;
    }

    @Override // K.InterfaceC0004c
    public C0008f j() {
        return new C0008f(new C0006d(this));
    }

    @Override // K.InterfaceC0007e
    public int m() {
        return this.d;
    }

    @Override // K.InterfaceC0007e
    public ContentInfo r() {
        return null;
    }

    @Override // K.InterfaceC0004c
    public void t(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f444a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f445b).getDescription());
                sb.append(", source=");
                int i = this.f446c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f447e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f448f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006d(View view) {
        this.f444a = 2;
        this.f448f = new int[2];
        this.f447e = view;
    }

    public C0006d(C0006d c0006d) {
        this.f444a = 1;
        ClipData clipData = (ClipData) c0006d.f445b;
        clipData.getClass();
        this.f445b = clipData;
        int i = c0006d.f446c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f446c = i;
            int i2 = c0006d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f447e = (Uri) c0006d.f447e;
                this.f448f = (Bundle) c0006d.f448f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
