package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f13549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f13550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f13551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Handler f13552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f13553f;

    public /* synthetic */ a(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable, int i4) {
        this.f13548a = i4;
        this.f13549b = flutterLoader;
        this.f13550c = context;
        this.f13551d = strArr;
        this.f13552e = handler;
        this.f13553f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13548a) {
            case 0:
                this.f13549b.lambda$ensureInitializationCompleteAsync$1(this.f13550c, this.f13551d, this.f13552e, this.f13553f);
                break;
            default:
                this.f13549b.lambda$ensureInitializationCompleteAsync$0(this.f13550c, this.f13551d, this.f13552e, this.f13553f);
                break;
        }
    }
}
