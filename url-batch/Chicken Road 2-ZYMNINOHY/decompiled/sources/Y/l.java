package Y;

import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3711c;

    /* renamed from: d, reason: collision with root package name */
    public r f3712d;

    /* renamed from: e, reason: collision with root package name */
    public C0122b f3713e;

    /* renamed from: f, reason: collision with root package name */
    public e f3714f;

    /* renamed from: g, reason: collision with root package name */
    public h f3715g;

    /* renamed from: h, reason: collision with root package name */
    public C f3716h;

    /* renamed from: i, reason: collision with root package name */
    public f f3717i;

    /* renamed from: j, reason: collision with root package name */
    public y f3718j;

    /* renamed from: k, reason: collision with root package name */
    public h f3719k;

    public l(Context context, h hVar) {
        this.f3709a = context.getApplicationContext();
        hVar.getClass();
        this.f3711c = hVar;
        this.f3710b = new ArrayList();
    }

    public static void f(h hVar, A a3) {
        if (hVar != null) {
            hVar.y(a3);
        }
    }

    @Override // Y.h
    public final Uri B() {
        h hVar = this.f3719k;
        if (hVar == null) {
            return null;
        }
        return hVar.B();
    }

    public final void a(h hVar) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3710b;
            if (i4 >= arrayList.size()) {
                return;
            }
            hVar.y((A) arrayList.get(i4));
            i4++;
        }
    }

    @Override // Y.h
    public final long b(k kVar) {
        AbstractC0124a.t(this.f3719k == null);
        Uri uri = kVar.f3701a;
        String scheme = uri.getScheme();
        String str = J.f3263a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f3709a;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f3712d == null) {
                    r rVar = new r(false);
                    this.f3712d = rVar;
                    a(rVar);
                }
                this.f3719k = this.f3712d;
            } else {
                if (this.f3713e == null) {
                    C0122b c0122b = new C0122b(context);
                    this.f3713e = c0122b;
                    a(c0122b);
                }
                this.f3719k = this.f3713e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f3713e == null) {
                C0122b c0122b2 = new C0122b(context);
                this.f3713e = c0122b2;
                a(c0122b2);
            }
            this.f3719k = this.f3713e;
        } else if ("content".equals(scheme)) {
            if (this.f3714f == null) {
                e eVar = new e(context);
                this.f3714f = eVar;
                a(eVar);
            }
            this.f3719k = this.f3714f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h hVar = this.f3711c;
            if (equals) {
                if (this.f3715g == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f3715g = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC0108a.s("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.f3715g == null) {
                        this.f3715g = hVar;
                    }
                }
                this.f3719k = this.f3715g;
            } else if ("udp".equals(scheme)) {
                if (this.f3716h == null) {
                    C c4 = new C(8000);
                    this.f3716h = c4;
                    a(c4);
                }
                this.f3719k = this.f3716h;
            } else if ("data".equals(scheme)) {
                if (this.f3717i == null) {
                    f fVar = new f(false);
                    this.f3717i = fVar;
                    a(fVar);
                }
                this.f3719k = this.f3717i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f3718j == null) {
                    y yVar = new y(context);
                    this.f3718j = yVar;
                    a(yVar);
                }
                this.f3719k = this.f3718j;
            } else {
                this.f3719k = hVar;
            }
        }
        return this.f3719k.b(kVar);
    }

    @Override // Y.h
    public final void close() {
        h hVar = this.f3719k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f3719k = null;
            }
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        h hVar = this.f3719k;
        hVar.getClass();
        return hVar.read(bArr, i4, i5);
    }

    @Override // Y.h
    public final Map t() {
        h hVar = this.f3719k;
        return hVar == null ? Collections.EMPTY_MAP : hVar.t();
    }

    @Override // Y.h
    public final void y(A a3) {
        a3.getClass();
        this.f3711c.y(a3);
        this.f3710b.add(a3);
        f(this.f3712d, a3);
        f(this.f3713e, a3);
        f(this.f3714f, a3);
        f(this.f3715g, a3);
        f(this.f3716h, a3);
        f(this.f3717i, a3);
        f(this.f3718j, a3);
    }
}
