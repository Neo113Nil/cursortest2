package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.oo0;

/* loaded from: classes.dex */
public final class f1 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final oo0 f64c;

    /* renamed from: d, reason: collision with root package name */
    private final String f65d;

    public f1(Context context, String str, String str2) {
        this.f64c = new oo0(y2.t.q().L(context, str));
        this.f65d = str2;
    }

    @Override // a3.b0
    public final void a() {
        this.f64c.b(this.f65d);
    }
}
