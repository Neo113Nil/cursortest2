package v1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4088e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f4089f = oVar;
        this.f4090g = i;
    }

    @Override // r1.a
    public final long a() {
        switch (this.f4088e) {
            case 0:
                this.f4089f.f4102k.getClass();
                try {
                    this.f4089f.f4114w.m(this.f4090g, 9);
                    synchronized (this.f4089f) {
                        this.f4089f.f4116y.remove(Integer.valueOf(this.f4090g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f4089f.f4102k.getClass();
                try {
                    this.f4089f.f4114w.m(this.f4090g, 9);
                    synchronized (this.f4089f) {
                        this.f4089f.f4116y.remove(Integer.valueOf(this.f4090g));
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
        this.f4089f = oVar;
        this.f4090g = i;
    }
}
