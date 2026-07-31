package e6;

import java.io.IOException;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class q implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final v f4097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f4098g;

    public q(r rVar, v vVar) {
        this.f4098g = rVar;
        this.f4097f = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e6.r] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [e6.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        Throwable th;
        EnumC0356b enumC0356b;
        ?? r02 = this.f4098g;
        v vVar = this.f4097f;
        EnumC0356b enumC0356b2 = EnumC0356b.f4040j;
        ?? r32 = 1;
        IOException e4 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r02.a(r32, enumC0356b2, e4);
                    Y5.c.a(vVar);
                    throw th;
                }
            } catch (IOException e7) {
                e4 = e7;
                enumC0356b = enumC0356b2;
            }
            if (!vVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r32 = enumC0356b2;
                    r02.a(r32, enumC0356b2, e4);
                    Y5.c.a(vVar);
                    throw th;
                }
            } while (vVar.a(false, this));
            enumC0356b = EnumC0356b.f4038h;
            try {
                enumC0356b2 = EnumC0356b.f4043m;
                r02.a(enumC0356b, enumC0356b2, null);
                r32 = enumC0356b;
            } catch (IOException e8) {
                e4 = e8;
                enumC0356b2 = EnumC0356b.f4039i;
                r02.a(enumC0356b2, enumC0356b2, e4);
                r32 = enumC0356b;
                Y5.c.a(vVar);
                return k5.v.f5219a;
            }
            Y5.c.a(vVar);
            return k5.v.f5219a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
