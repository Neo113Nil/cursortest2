package N3;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f1872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1873g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, q qVar, int i4, Object obj, int i5) {
        super(str, true);
        this.f1871e = i5;
        this.f1872f = qVar;
        this.f1873g = i4;
    }

    @Override // J3.a
    public final long a() {
        switch (this.f1871e) {
            case 0:
                this.f1872f.f1890k.getClass();
                try {
                    this.f1872f.f1899w.s(this.f1873g, EnumC0078b.CANCEL);
                    synchronized (this.f1872f) {
                        this.f1872f.f1901y.remove(Integer.valueOf(this.f1873g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f1872f.f1890k.getClass();
                try {
                    this.f1872f.f1899w.s(this.f1873g, EnumC0078b.CANCEL);
                    synchronized (this.f1872f) {
                        this.f1872f.f1901y.remove(Integer.valueOf(this.f1873g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                this.f1872f.f1890k.getClass();
                synchronized (this.f1872f) {
                    this.f1872f.f1901y.remove(Integer.valueOf(this.f1873g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i4, List list, boolean z) {
        super(str, true);
        this.f1871e = 0;
        this.f1872f = qVar;
        this.f1873g = i4;
    }
}
