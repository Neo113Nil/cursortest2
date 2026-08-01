package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p0.AbstractC0280a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements InterfaceC0002c, InterfaceC0004e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f440a;

    /* renamed from: b, reason: collision with root package name */
    public Object f441b;

    /* renamed from: c, reason: collision with root package name */
    public int f442c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f443e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f444f;

    public /* synthetic */ C0003d() {
        this.f440a = 0;
    }

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        this.f444f = bundle;
    }

    public void b(w0 w0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((j0) it.next()).f469a.c() & 8) != 0) {
                ((View) this.f443e).setTranslationY(AbstractC0280a.c(this.d, 0, r3.f469a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0002c
    public void d(Uri uri) {
        this.f443e = uri;
    }

    @Override // K.InterfaceC0004e
    public int f() {
        return this.f442c;
    }

    @Override // K.InterfaceC0004e
    public ClipData j() {
        return (ClipData) this.f441b;
    }

    @Override // K.InterfaceC0002c
    public C0005f k() {
        return new C0005f(new C0003d(this));
    }

    @Override // K.InterfaceC0004e
    public int n() {
        return this.d;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo t() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f440a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f441b).getDescription());
                sb.append(", source=");
                int i = this.f442c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f443e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f444f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0002c
    public void w(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0003d(View view) {
        this.f440a = 2;
        this.f444f = new int[2];
        this.f443e = view;
    }

    public C0003d(C0003d c0003d) {
        this.f440a = 1;
        ClipData clipData = (ClipData) c0003d.f441b;
        clipData.getClass();
        this.f441b = clipData;
        int i = c0003d.f442c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f442c = i;
            int i2 = c0003d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f443e = (Uri) c0003d.f443e;
                this.f444f = (Bundle) c0003d.f444f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
