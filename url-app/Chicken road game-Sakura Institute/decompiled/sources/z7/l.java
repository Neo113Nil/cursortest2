package z7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends v7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10175e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f10176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i7, List list) {
        super(str, true);
        this.f10176f = nVar;
        this.f10177g = i7;
    }

    @Override // v7.a
    public final long a() {
        switch (this.f10175e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f10176f.f10191p.getClass();
                try {
                    this.f10176f.B.w(this.f10177g, 9);
                    synchronized (this.f10176f) {
                        this.f10176f.D.remove(Integer.valueOf(this.f10177g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f10176f.f10191p.getClass();
                try {
                    this.f10176f.B.w(this.f10177g, 9);
                    synchronized (this.f10176f) {
                        this.f10176f.D.remove(Integer.valueOf(this.f10177g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i7, List list, boolean z8) {
        super(str, true);
        this.f10176f = nVar;
        this.f10177g = i7;
    }
}
