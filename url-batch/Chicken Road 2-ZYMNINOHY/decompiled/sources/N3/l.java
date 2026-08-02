package N3;

import c3.C0297i;
import java.io.IOException;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class l implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final u f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1866b;

    public l(q qVar, u uVar) {
        this.f1866b = qVar;
        this.f1865a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [N3.q] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [N3.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        Throwable th;
        EnumC0078b enumC0078b;
        ?? r02 = this.f1866b;
        u uVar = this.f1865a;
        EnumC0078b enumC0078b2 = EnumC0078b.INTERNAL_ERROR;
        ?? r32 = 1;
        IOException e4 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r02.a(r32, enumC0078b2, e4);
                    H3.b.c(uVar);
                    throw th;
                }
            } catch (IOException e5) {
                e4 = e5;
                enumC0078b = enumC0078b2;
            }
            if (!uVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r32 = enumC0078b2;
                    r02.a(r32, enumC0078b2, e4);
                    H3.b.c(uVar);
                    throw th;
                }
            } while (uVar.a(false, this));
            enumC0078b = EnumC0078b.NO_ERROR;
            try {
                enumC0078b2 = EnumC0078b.CANCEL;
                r02.a(enumC0078b, enumC0078b2, null);
                r32 = enumC0078b;
            } catch (IOException e6) {
                e4 = e6;
                enumC0078b2 = EnumC0078b.PROTOCOL_ERROR;
                r02.a(enumC0078b2, enumC0078b2, e4);
                r32 = enumC0078b;
                H3.b.c(uVar);
                return C0297i.f5732a;
            }
            H3.b.c(uVar);
            return C0297i.f5732a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
