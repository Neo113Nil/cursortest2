package q6;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f8036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6.i f8037e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8038i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Runnable f8039r;

    public /* synthetic */ d(i iVar, k6.i iVar2, int i3, Runnable runnable) {
        this.f8036d = iVar;
        this.f8037e = iVar2;
        this.f8038i = i3;
        this.f8039r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final k6.i iVar = this.f8037e;
        final int i3 = this.f8038i;
        Runnable runnable = this.f8039r;
        final i iVar2 = this.f8036d;
        r6.g gVar = (r6.g) iVar2.f8054d;
        try {
            try {
                r6.g gVar2 = (r6.g) iVar2.f8053c;
                Objects.requireNonNull(gVar2);
                gVar.m(new e(gVar2, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.f8051a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    gVar.m(new s6.b() { // from class: q6.f
                        @Override // s6.b
                        public final Object a() {
                            ((p.e) i.this.f8056f).i(iVar, i3 + 1, false);
                            return null;
                        }
                    });
                } else {
                    iVar2.a(iVar, i3);
                }
                runnable.run();
            } catch (s6.a unused) {
                ((p.e) iVar2.f8056f).i(iVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
