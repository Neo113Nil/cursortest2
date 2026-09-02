package C4;

import Q4.k;
import Q4.n;
import a1.AbstractC0223a;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import u0.C0673c;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O4.c f202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0673c f203d;

    public /* synthetic */ a(b bVar, O4.c cVar, C0673c c0673c, int i7) {
        this.f200a = i7;
        this.f201b = bVar;
        this.f202c = cVar;
        this.f203d = c0673c;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String y;
        switch (this.f200a) {
            case 0:
                C0673c c0673c = this.f203d;
                E4.a aVar = (E4.a) c0673c.f5968f;
                I4.c cVar = (I4.c) obj;
                b bVar = this.f201b;
                n nVar = bVar.f205a;
                int i7 = cVar.f1204b.f3064i;
                Long valueOf = Long.valueOf(i7);
                c0673c.f5969g = valueOf;
                O4.c cVar2 = this.f202c;
                if (i7 >= 200 && i7 < 300) {
                    V3.a c7 = V3.c.c(k.f2033f, valueOf);
                    if (aVar.f661a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    aVar.f661a = true;
                    aVar.a(null, c7);
                    cVar2.e();
                    return;
                }
                String valueOf2 = String.valueOf(i7);
                Long l7 = (Long) c0673c.f5969g;
                V3.a c8 = l7 != null ? V3.c.c(k.f2033f, l7) : V3.a.f2706i;
                if (aVar.f661a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar.f661a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar.a(valueOf2, c8);
                try {
                    bArr = cVar.a();
                } catch (IOException e4) {
                    nVar.a(Level.FINE, "Unable to obtain response body", e4);
                    bArr = null;
                }
                String str2 = cVar.f1204b.f3063h;
                if (bArr != null) {
                    try {
                        y = AbstractC0223a.y(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    nVar.a(Level.WARNING, "Failed to export " + bVar.f207c + "s. Server responded with HTTP status code " + i7 + ". Error message: " + y, null);
                    cVar2.a(new A4.a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                y = C1.c.h(str, str2);
                nVar.a(Level.WARNING, "Failed to export " + bVar.f207c + "s. Server responded with HTTP status code " + i7 + ". Error message: " + y, null);
                cVar2.a(new A4.a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                String name = th.getClass().getName();
                C0673c c0673c2 = this.f203d;
                E4.a aVar2 = (E4.a) c0673c2.f5968f;
                Long l8 = (Long) c0673c2.f5969g;
                V3.a c9 = l8 != null ? V3.c.c(k.f2033f, l8) : V3.a.f2706i;
                if (aVar2.f661a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar2.f661a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar2.a(name, c9);
                b bVar2 = this.f201b;
                bVar2.f205a.a(Level.SEVERE, "Failed to export " + bVar2.f207c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f202c.a(new A4.a(th));
                return;
        }
    }
}
