package s7;

import android.os.Looper;
import com.google.android.gms.internal.measurement.z5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t3 extends g0 {

    /* renamed from: i, reason: collision with root package name */
    public z5 f9026i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9027r;

    /* renamed from: s, reason: collision with root package name */
    public final l.d f9028s;

    /* renamed from: t, reason: collision with root package name */
    public final s3 f9029t;

    /* renamed from: u, reason: collision with root package name */
    public final c6.l f9030u;

    public t3(q1 q1Var) {
        super(q1Var);
        this.f9027r = true;
        this.f9028s = new l.d(25, this);
        this.f9029t = new s3(this);
        this.f9030u = new c6.l(this);
    }

    @Override // s7.g0
    public final boolean v() {
        return false;
    }

    public final void w() {
        s();
        if (this.f9026i == null) {
            this.f9026i = new z5(Looper.getMainLooper(), 0);
        }
    }
}
