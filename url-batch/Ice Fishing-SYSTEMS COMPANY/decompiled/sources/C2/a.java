package C2;

import A2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C2860Xh;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import q2.C4903n;
import u2.C5107a;

/* loaded from: classes.dex */
public final class a implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final C2860Xh f372a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f373b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f374c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f375d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f376e;

    public a(C2860Xh c2860Xh, C2860Xh c2860Xh2, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3) {
        this.f372a = c2860Xh;
        this.f373b = c2860Xh2;
        this.f374c = c4009uN;
        this.f375d = c4009uN2;
        this.f376e = c4009uN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4903n d() {
        return new C4903n((Context) this.f372a.d(), (C5107a) this.f373b.d(), (PackageInfo) this.f374c.d(), (String) this.f375d.d(), (d) this.f376e.d());
    }
}
