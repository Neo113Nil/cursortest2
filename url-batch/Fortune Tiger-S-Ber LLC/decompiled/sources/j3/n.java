package j3;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n extends f3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2438e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f2439f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i4, List list) {
        super(str, true);
        this.f2439f = pVar;
        this.g = i4;
    }

    @Override // f3.a
    public final long a() {
        switch (this.f2438e) {
            case 0:
                this.f2439f.f2450p.getClass();
                try {
                    this.f2439f.B.s(this.g, 9);
                    synchronized (this.f2439f) {
                        this.f2439f.D.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f2439f.f2450p.getClass();
                try {
                    this.f2439f.B.s(this.g, 9);
                    synchronized (this.f2439f) {
                        this.f2439f.D.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i4, List list, boolean z3) {
        super(str, true);
        this.f2439f = pVar;
        this.g = i4;
    }
}
