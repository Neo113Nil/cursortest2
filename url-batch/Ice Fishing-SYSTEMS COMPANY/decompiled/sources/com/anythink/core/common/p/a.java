package com.anythink.core.common.p;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.f;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: b, reason: collision with root package name */
    String f16134b;

    /* renamed from: c, reason: collision with root package name */
    String f16135c;

    /* renamed from: d, reason: collision with root package name */
    b f16136d;

    /* renamed from: f, reason: collision with root package name */
    long f16138f;
    private ATAdRequest i;

    /* renamed from: a, reason: collision with root package name */
    String f16133a = "a";

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f16137e = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    long f16139g = com.anythink.basead.exoplayer.i.a.f8040f;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.t.b f16140h = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.p.a.1
        @Override // java.lang.Runnable
        public final void run() {
            a.this.e();
        }
    };

    public a(String str, String str2) {
        this.f16134b = str;
        this.f16135c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        if (b()) {
            if (this.f16137e.get()) {
                this.f16137e.set(false);
                if (this.f16138f == 0 || SystemClock.elapsedRealtime() - this.f16138f > this.f16139g) {
                    this.f16138f = SystemClock.elapsedRealtime();
                    a(t.b().M(), this.i, 4);
                }
            }
        }
    }

    @Override // com.anythink.core.common.p.d
    public final boolean b() {
        return u.a().e(this.f16134b);
    }

    @Override // com.anythink.core.common.p.d
    public final void c() {
        b bVar;
        if (!b() || (bVar = this.f16136d) == null) {
            return;
        }
        bVar.a(this.f16134b);
    }

    @Override // com.anythink.core.common.p.d
    public final synchronized void d() {
        this.f16137e.set(false);
        com.anythink.core.common.t.d.a().b(this.f16140h);
    }

    @Override // com.anythink.core.common.p.d
    public final synchronized void a(int i) {
        if (this.f16137e.get()) {
            return;
        }
        this.f16137e.set(true);
        com.anythink.core.common.t.d.a().a(this.f16140h, ((long) Math.pow(2.0d, i)) * 1000, false);
    }

    public final ATAdRequest a() {
        return this.i;
    }

    @Override // com.anythink.core.common.p.d
    public final void a(Context context, ATAdRequest aTAdRequest, int i) {
        this.i = aTAdRequest;
        ar arVar = new ar();
        arVar.a(context);
        arVar.a(aTAdRequest);
        arVar.f13704c = i;
        f.a(context, this.f16134b, this.f16135c).b(context, this.f16135c, this.f16134b, arVar, null);
    }

    @Override // com.anythink.core.common.p.d
    public final void a(AdError adError, int i, boolean z8) {
        if (b()) {
            if (z8) {
                a(i);
            }
            b bVar = this.f16136d;
            if (bVar != null) {
                bVar.a(this.f16134b, adError);
            }
        }
    }

    @Override // com.anythink.core.common.p.d
    public final void a(b bVar) {
        this.f16136d = bVar;
    }

    @Override // com.anythink.core.common.p.d
    public final boolean a(int i, List<String> list) {
        String str;
        if (list == null) {
            return true;
        }
        if (i == 4) {
            str = "1";
        } else if (i == 5) {
            str = "2";
        } else if (i == 6) {
            str = "3";
        } else if (i != 7) {
            str = "-1";
        } else {
            str = "4";
        }
        if (TextUtils.equals(str, "-1")) {
            list.toString();
            return true;
        }
        if (list.contains(str)) {
            list.toString();
            return true;
        }
        list.toString();
        return false;
    }
}
