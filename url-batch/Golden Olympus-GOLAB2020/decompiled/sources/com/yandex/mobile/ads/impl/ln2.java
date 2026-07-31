package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ln2 extends AbstractC2062l8 {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f28673k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final C2109n8 f28674a;

    /* renamed from: b, reason: collision with root package name */
    private final C2086m8 f28675b;

    /* renamed from: d, reason: collision with root package name */
    private pn2 f28677d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2178q8 f28678e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28682i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28683j;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f28676c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f28679f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28680g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f28681h = UUID.randomUUID().toString();

    ln2(C2086m8 c2086m8, C2109n8 c2109n8) {
        AbstractC2178q8 qn2Var;
        this.f28675b = c2086m8;
        this.f28674a = c2109n8;
        d();
        if (c2109n8.a() == EnumC2132o8.f29939c || c2109n8.a() == EnumC2132o8.f29941e) {
            qn2Var = new qn2(c2109n8.h());
        } else {
            qn2Var = new un2(c2109n8.e(), c2109n8.d());
        }
        this.f28678e = qn2Var;
        this.f28678e.a();
        mn2.a().a(this);
        this.f28678e.a(c2086m8);
    }

    private void d() {
        this.f28677d = new pn2(null);
    }

    final void a(@NonNull JSONObject jSONObject) {
        if (this.f28683j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        this.f28678e.a(jSONObject);
        this.f28683j = true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2062l8
    public final void b() {
        if (this.f28679f) {
            return;
        }
        this.f28679f = true;
        mn2.a().b(this);
        this.f28678e.a(so2.a().d());
        this.f28678e.a(this, this.f28674a);
    }

    public final ArrayList c() {
        return this.f28676c;
    }

    final void e() {
        if (this.f28682i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        this.f28678e.f();
        this.f28682i = true;
    }

    public final View f() {
        return this.f28677d.get();
    }

    public final boolean g() {
        return this.f28679f && !this.f28680g;
    }

    public final boolean h() {
        return this.f28679f;
    }

    public final String i() {
        return this.f28681h;
    }

    public final AbstractC2178q8 j() {
        return this.f28678e;
    }

    public final boolean k() {
        return this.f28680g;
    }

    public final boolean l() {
        return this.f28675b.b();
    }

    public final boolean m() {
        return this.f28675b.c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2062l8
    public final void a(View view, jc0 jc0Var, String str) {
        do2 do2Var;
        if (this.f28680g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f28673k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        ArrayList arrayList = this.f28676c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                do2Var = null;
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            do2Var = (do2) obj;
            if (do2Var.a().get() == view) {
                break;
            }
        }
        if (do2Var == null) {
            this.f28676c.add(new do2(view, jc0Var, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2062l8
    public final void a() {
        if (this.f28680g) {
            return;
        }
        this.f28677d.clear();
        if (!this.f28680g) {
            this.f28676c.clear();
        }
        this.f28680g = true;
        this.f28678e.e();
        mn2.a().c(this);
        this.f28678e.b();
        this.f28678e = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2062l8
    public final void a(View view) {
        if (this.f28680g || this.f28677d.get() == view) {
            return;
        }
        this.f28677d = new pn2(view);
        this.f28678e.g();
        Collection<ln2> b4 = mn2.a().b();
        if (b4 == null || b4.isEmpty()) {
            return;
        }
        for (ln2 ln2Var : b4) {
            if (ln2Var != this && ln2Var.f28677d.get() == view) {
                ln2Var.f28677d.clear();
            }
        }
    }
}
