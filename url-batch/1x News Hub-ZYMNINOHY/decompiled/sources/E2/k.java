package E2;

import b2.C0195i;
import d2.InterfaceC0300c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import t2.AbstractC1212w;
import t2.D;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class k extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F2.d f442e;
    public final /* synthetic */ l f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(F2.d dVar, l lVar, l lVar2, long j3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f442e = dVar;
        this.f = lVar;
        this.f443g = lVar2;
        this.f444h = j3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new k(this.f442e, this.f, this.f443g, this.f444h, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        F2.d dVar = this.f442e;
        boolean z = dVar.f528b;
        String str = dVar.f527a;
        if (!z) {
            URL url = URI.create(str).toURL();
            kotlin.jvm.internal.j.d(url, "toURL(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream openStream = url.openStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openStream.read(bArr);
                    Integer valueOf = Integer.valueOf(read);
                    if (read <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
                }
                openStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.j.d(byteArray, "toByteArray(...)");
                File createTempFile = File.createTempFile("sound", "");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(byteArray);
                    createTempFile.deleteOnExit();
                    fileOutputStream.close();
                    str = createTempFile.getAbsolutePath();
                    kotlin.jvm.internal.j.d(str, "getAbsolutePath(...)");
                } finally {
                }
            } finally {
            }
        } else if (s2.n.X(str, "file://")) {
            str = str.substring(7);
            kotlin.jvm.internal.j.d(str, "substring(...)");
        }
        String str2 = str;
        l lVar = this.f;
        y2.e eVar = lVar.f447c;
        A2.e eVar2 = D.f10377a;
        AbstractC1212w.g(eVar, y2.o.f10862a, new j(lVar, str2, this.f443g, this.f442e, this.f444h, null), 2);
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj);
        C0195i c0195i = C0195i.f2555a;
        kVar.g(c0195i);
        return c0195i;
    }
}
