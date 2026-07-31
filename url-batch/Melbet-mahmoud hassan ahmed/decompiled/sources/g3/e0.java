package g3;

import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;

/* loaded from: classes.dex */
final class e0 implements nb3<j> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f16614a;

    e0(f0 f0Var) {
        this.f16614a = f0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* synthetic */ void a(j jVar) {
        io0.b("Initialized webview successfully for SDKCore.");
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        y2.t.p().s(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        f0.U6(this.f16614a, "sgf", "sgf_reason", th.getMessage());
        io0.e("Failed to initialize webview for loading SDKCore. ", th);
    }
}
