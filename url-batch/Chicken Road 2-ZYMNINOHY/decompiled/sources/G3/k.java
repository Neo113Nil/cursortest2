package G3;

import K.Q;
import androidx.lifecycle.E;
import androidx.lifecycle.P;
import c3.C0297i;
import java.io.File;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o3.InterfaceC1328a;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i4, Object obj) {
        super(0);
        this.f930e = i4;
        this.f931f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.j, o3.a] */
    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f930e) {
            case 0:
                return (List) this.f931f;
            case 1:
                try {
                    return (List) ((kotlin.jvm.internal.j) this.f931f).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return d3.q.f8333a;
                }
            case 2:
                Object obj = Q.f1294d;
                File file = (File) this.f931f;
                synchronized (obj) {
                    Q.f1293c.remove(file.getAbsolutePath());
                }
                return C0297i.f5732a;
            case 3:
                l lVar = ((K3.k) this.f931f).f1578e;
                kotlin.jvm.internal.i.b(lVar);
                List a3 = lVar.a();
                ArrayList arrayList = new ArrayList(d3.k.Y(a3));
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 4:
                File file2 = (File) ((M.b) this.f931f).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                String str = "";
                int k02 = AbstractC1510g.k0(name, '.', 0, 6);
                if (k02 != -1) {
                    str = name.substring(k02 + 1, name.length());
                    kotlin.jvm.internal.i.d(str, "substring(...)");
                }
                if (str.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 5:
                return E.e((P) this.f931f);
            default:
                v1.h hVar = (v1.h) this.f931f;
                return BigInteger.valueOf(hVar.f15552a).shiftLeft(32).or(BigInteger.valueOf(hVar.f15553b)).shiftLeft(32).or(BigInteger.valueOf(hVar.f15554c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC1328a interfaceC1328a) {
        super(0);
        this.f930e = 1;
        this.f931f = (kotlin.jvm.internal.j) interfaceC1328a;
    }
}
