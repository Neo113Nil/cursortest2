package r1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends n1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3565e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3567g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3566f = oVar;
        this.f3567g = i;
    }

    @Override // n1.a
    public final long a() {
        switch (this.f3565e) {
            case 0:
                this.f3566f.f3579k.getClass();
                try {
                    this.f3566f.f3591w.m(this.f3567g, 9);
                    synchronized (this.f3566f) {
                        this.f3566f.f3593y.remove(Integer.valueOf(this.f3567g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3566f.f3579k.getClass();
                try {
                    this.f3566f.f3591w.m(this.f3567g, 9);
                    synchronized (this.f3566f) {
                        this.f3566f.f3593y.remove(Integer.valueOf(this.f3567g));
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
        this.f3566f = oVar;
        this.f3567g = i;
    }
}
