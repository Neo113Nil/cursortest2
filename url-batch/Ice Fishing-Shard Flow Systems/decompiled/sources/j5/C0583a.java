package j5;

import h5.C0493a;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import l5.AbstractC0663a;
import v5.C0977c;
import x5.k;
import x5.n;
import z1.AbstractC1053a;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0583a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0977c f5991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P0.c f5992d;

    public /* synthetic */ C0583a(b bVar, C0977c c0977c, P0.c cVar, int i2) {
        this.f5989a = i2;
        this.f5990b = bVar;
        this.f5991c = c0977c;
        this.f5992d = cVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String y7;
        switch (this.f5989a) {
            case 0:
                P0.c cVar = this.f5992d;
                AbstractC0663a abstractC0663a = (AbstractC0663a) cVar.f2189e;
                p5.b bVar = (p5.b) obj;
                b bVar2 = this.f5990b;
                n nVar = bVar2.f5994a;
                int i2 = bVar.f7199b.f429l;
                Long valueOf = Long.valueOf(i2);
                cVar.f2190i = valueOf;
                C0977c c0977c = this.f5991c;
                if (i2 >= 200 && i2 < 300) {
                    C4.b b7 = C4.f.b(k.f8397f, valueOf);
                    if (abstractC0663a.f6282a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    abstractC0663a.f6282a = true;
                    abstractC0663a.a(null, b7);
                    c0977c.e();
                    return;
                }
                String valueOf2 = String.valueOf(i2);
                Long l7 = (Long) cVar.f2190i;
                C4.b b8 = l7 != null ? C4.f.b(k.f8397f, l7) : C4.b.f297l;
                if (abstractC0663a.f6282a) {
                    throw new IllegalStateException("Recording already ended");
                }
                abstractC0663a.f6282a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                abstractC0663a.a(valueOf2, b8);
                try {
                    bArr = bVar.a();
                } catch (IOException e7) {
                    nVar.a(Level.FINE, "Unable to obtain response body", e7);
                    bArr = null;
                }
                String str2 = bVar.f7199b.f428i;
                if (bArr != null) {
                    try {
                        y7 = AbstractC1053a.y(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    nVar.a(Level.WARNING, "Failed to export " + bVar2.f5996c + "s. Server responded with HTTP status code " + i2 + ". Error message: " + y7, null);
                    c0977c.a(new C0493a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                y7 = r4.f.i(str, str2);
                nVar.a(Level.WARNING, "Failed to export " + bVar2.f5996c + "s. Server responded with HTTP status code " + i2 + ". Error message: " + y7, null);
                c0977c.a(new C0493a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                String name = th.getClass().getName();
                P0.c cVar2 = this.f5992d;
                AbstractC0663a abstractC0663a2 = (AbstractC0663a) cVar2.f2189e;
                Long l8 = (Long) cVar2.f2190i;
                C4.b b9 = l8 != null ? C4.f.b(k.f8397f, l8) : C4.b.f297l;
                if (abstractC0663a2.f6282a) {
                    throw new IllegalStateException("Recording already ended");
                }
                abstractC0663a2.f6282a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                abstractC0663a2.a(name, b9);
                b bVar3 = this.f5990b;
                bVar3.f5994a.a(Level.SEVERE, "Failed to export " + bVar3.f5996c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f5991c.a(new C0493a(th));
                return;
        }
    }
}
