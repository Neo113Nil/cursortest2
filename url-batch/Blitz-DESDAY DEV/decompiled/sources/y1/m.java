package y1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4231e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4233g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f4232f = oVar;
        this.f4233g = i;
    }

    @Override // u1.a
    public final long a() {
        switch (this.f4231e) {
            case 0:
                this.f4232f.f4245k.getClass();
                try {
                    this.f4232f.f4257w.m(this.f4233g, 9);
                    synchronized (this.f4232f) {
                        this.f4232f.f4259y.remove(Integer.valueOf(this.f4233g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f4232f.f4245k.getClass();
                try {
                    this.f4232f.f4257w.m(this.f4233g, 9);
                    synchronized (this.f4232f) {
                        this.f4232f.f4259y.remove(Integer.valueOf(this.f4233g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z2) {
        super(str, true);
        this.f4232f = oVar;
        this.f4233g = i;
    }
}
