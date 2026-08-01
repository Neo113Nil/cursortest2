package s7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.n6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8669a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8670b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8671c;

    /* renamed from: d, reason: collision with root package name */
    public final n6 f8672d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8673e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f8674f;
    public final Long g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8675h;

    public e2(Context context, n6 n6Var, Long l10, Long l11) {
        this.f8673e = true;
        c7.c0.g(context);
        Context applicationContext = context.getApplicationContext();
        c7.c0.g(applicationContext);
        this.f8669a = applicationContext;
        this.f8674f = l10;
        this.g = l11;
        if (n6Var != null) {
            this.f8672d = n6Var;
            this.f8673e = n6Var.f2572i;
            this.f8671c = n6Var.f2571e;
            this.f8675h = n6Var.f2574s;
            Bundle bundle = n6Var.f2573r;
            if (bundle != null) {
                this.f8670b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
