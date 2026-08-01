package M;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r0.AbstractC0260a;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements InterfaceC0002c, InterfaceC0004e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f534a;

    /* renamed from: b, reason: collision with root package name */
    public Object f535b;

    /* renamed from: c, reason: collision with root package name */
    public int f536c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f537e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f538f;

    public /* synthetic */ C0003d() {
        this.f534a = 0;
    }

    @Override // M.InterfaceC0002c
    public void a(Bundle bundle) {
        this.f538f = bundle;
    }

    public void b(v0 v0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((i0) it.next()).f559a.c() & 8) != 0) {
                ((View) this.f537e).setTranslationY(AbstractC0260a.c(this.d, 0, r3.f559a.b()));
                return;
            }
        }
    }

    @Override // M.InterfaceC0002c
    public void c(Uri uri) {
        this.f537e = uri;
    }

    @Override // M.InterfaceC0004e
    public int d() {
        return this.f536c;
    }

    @Override // M.InterfaceC0004e
    public ClipData i() {
        return (ClipData) this.f535b;
    }

    @Override // M.InterfaceC0002c
    public C0005f j() {
        return new C0005f(new C0003d(this));
    }

    @Override // M.InterfaceC0004e
    public int m() {
        return this.d;
    }

    @Override // M.InterfaceC0004e
    public ContentInfo r() {
        return null;
    }

    @Override // M.InterfaceC0002c
    public void t(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f534a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f535b).getDescription());
                sb.append(", source=");
                int i = this.f536c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f537e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f538f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0003d(View view) {
        this.f534a = 2;
        this.f538f = new int[2];
        this.f537e = view;
    }

    public C0003d(C0003d c0003d) {
        this.f534a = 1;
        ClipData clipData = (ClipData) c0003d.f535b;
        clipData.getClass();
        this.f535b = clipData;
        int i = c0003d.f536c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f536c = i;
            int i2 = c0003d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f537e = (Uri) c0003d.f537e;
                this.f538f = (Bundle) c0003d.f538f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
