package G1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends C1.a {
    public final /* synthetic */ int e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list) {
        super(str, true);
        this.f390f = qVar;
        this.f391g = i;
    }

    @Override // C1.a
    public final long a() {
        switch (this.e) {
            case 0:
                this.f390f.f402k.getClass();
                try {
                    this.f390f.f414w.E(this.f391g, 9);
                    synchronized (this.f390f) {
                        this.f390f.f416y.remove(Integer.valueOf(this.f391g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f390f.f402k.getClass();
                try {
                    this.f390f.f414w.E(this.f391g, 9);
                    synchronized (this.f390f) {
                        this.f390f.f416y.remove(Integer.valueOf(this.f391g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list, boolean z2) {
        super(str, true);
        this.f390f = qVar;
        this.f391g = i;
    }
}
