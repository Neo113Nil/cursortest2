package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o0.AbstractC0307a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006d implements InterfaceC0004c, InterfaceC0008e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f431a;

    /* renamed from: b, reason: collision with root package name */
    public Object f432b;

    /* renamed from: c, reason: collision with root package name */
    public int f433c;

    /* renamed from: d, reason: collision with root package name */
    public int f434d;

    /* renamed from: e, reason: collision with root package name */
    public Object f435e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f436f;

    public /* synthetic */ C0006d() {
        this.f431a = 0;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        this.f436f = bundle;
    }

    public void b(B0 b02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((o0) it.next()).f483a.c() & 8) != 0) {
                ((View) this.f435e).setTranslationY(AbstractC0307a.c(this.f434d, 0, r3.f483a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0004c
    public void d(Uri uri) {
        this.f435e = uri;
    }

    @Override // K.InterfaceC0008e
    public int e() {
        return this.f433c;
    }

    @Override // K.InterfaceC0008e
    public ClipData i() {
        return (ClipData) this.f432b;
    }

    @Override // K.InterfaceC0004c
    public C0010f j() {
        return new C0010f(new C0006d(this));
    }

    @Override // K.InterfaceC0008e
    public int m() {
        return this.f434d;
    }

    @Override // K.InterfaceC0008e
    public ContentInfo s() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f431a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f432b).getDescription());
                sb.append(", source=");
                int i = this.f433c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f434d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f435e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f436f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0004c
    public void w(int i) {
        this.f434d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006d(View view) {
        this.f431a = 2;
        this.f436f = new int[2];
        this.f435e = view;
    }

    public C0006d(C0006d c0006d) {
        this.f431a = 1;
        ClipData clipData = (ClipData) c0006d.f432b;
        clipData.getClass();
        this.f432b = clipData;
        int i = c0006d.f433c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f433c = i;
            int i2 = c0006d.f434d;
            if ((i2 & 1) == i2) {
                this.f434d = i2;
                this.f435e = (Uri) c0006d.f435e;
                this.f436f = (Bundle) c0006d.f436f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
