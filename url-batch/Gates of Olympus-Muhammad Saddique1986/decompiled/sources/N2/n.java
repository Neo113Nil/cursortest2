package N2;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends J2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3632e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i3, List list) {
        super(str, true);
        this.f3633f = pVar;
        this.f3634g = i3;
    }

    @Override // J2.a
    public final long a() {
        switch (this.f3632e) {
            case 0:
                this.f3633f.f3650n.getClass();
                try {
                    this.f3633f.f3662z.l(this.f3634g, 9);
                    synchronized (this.f3633f) {
                        this.f3633f.f3639B.remove(Integer.valueOf(this.f3634g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3633f.f3650n.getClass();
                try {
                    this.f3633f.f3662z.l(this.f3634g, 9);
                    synchronized (this.f3633f) {
                        this.f3633f.f3639B.remove(Integer.valueOf(this.f3634g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i3, List list, boolean z3) {
        super(str, true);
        this.f3633f = pVar;
        this.f3634g = i3;
    }
}
