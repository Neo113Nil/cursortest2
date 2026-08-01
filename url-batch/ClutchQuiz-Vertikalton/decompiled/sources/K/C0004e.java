package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v0.AbstractC0372a;

/* renamed from: K.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e implements InterfaceC0003d, InterfaceC0005f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f386a;

    /* renamed from: b, reason: collision with root package name */
    public Object f387b;

    /* renamed from: c, reason: collision with root package name */
    public int f388c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f389e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f390f;

    public /* synthetic */ C0004e() {
        this.f386a = 0;
    }

    @Override // K.InterfaceC0003d
    public void a(Bundle bundle) {
        this.f390f = bundle;
    }

    public void b(w0 w0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((j0) it.next()).f411a.c() & 8) != 0) {
                ((View) this.f389e).setTranslationY(AbstractC0372a.c(this.d, 0, r3.f411a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0003d
    public void d(Uri uri) {
        this.f389e = uri;
    }

    @Override // K.InterfaceC0005f
    public int e() {
        return this.f388c;
    }

    @Override // K.InterfaceC0005f
    public ClipData h() {
        return (ClipData) this.f387b;
    }

    @Override // K.InterfaceC0003d
    public C0006g j() {
        return new C0006g(new C0004e(this));
    }

    @Override // K.InterfaceC0005f
    public int m() {
        return this.d;
    }

    @Override // K.InterfaceC0005f
    public ContentInfo r() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f386a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f387b).getDescription());
                sb.append(", source=");
                int i = this.f388c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f389e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f390f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0003d
    public void u(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0004e(View view) {
        this.f386a = 2;
        this.f390f = new int[2];
        this.f389e = view;
    }

    public C0004e(C0004e c0004e) {
        this.f386a = 1;
        ClipData clipData = (ClipData) c0004e.f387b;
        clipData.getClass();
        this.f387b = clipData;
        int i = c0004e.f388c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f388c = i;
            int i2 = c0004e.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f389e = (Uri) c0004e.f389e;
                this.f390f = (Bundle) c0004e.f390f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
