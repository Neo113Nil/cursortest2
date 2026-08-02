package X3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import o3.p;
import w3.AbstractC1510g;
import x3.AbstractC1528C;
import x3.AbstractC1562w;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class j extends h3.g implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y3.d f3633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f3635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y3.d dVar, k kVar, k kVar2, long j4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f3633a = dVar;
        this.f3634b = kVar;
        this.f3635c = kVar2;
        this.f3636d = j4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new j(this.f3633a, this.f3634b, this.f3635c, this.f3636d, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2);
        C0297i c0297i = C0297i.f5732a;
        jVar.invokeSuspend(c0297i);
        return c0297i;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        O3.l.w(obj);
        Y3.d dVar = this.f3633a;
        String str = dVar.f3767a;
        if (dVar.f3768b) {
            absolutePath = AbstractC1510g.m0(str, "file://");
        } else {
            URL url = URI.create(str).toURL();
            kotlin.jvm.internal.i.d(url, "toURL(...)");
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
                kotlin.jvm.internal.i.d(byteArray, "toByteArray(...)");
                File createTempFile = File.createTempFile("sound", "");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(byteArray);
                    createTempFile.deleteOnExit();
                    fileOutputStream.close();
                    absolutePath = createTempFile.getAbsolutePath();
                    kotlin.jvm.internal.i.d(absolutePath, "getAbsolutePath(...)");
                } finally {
                }
            } finally {
            }
        }
        String str2 = absolutePath;
        k kVar = this.f3634b;
        C3.e eVar = kVar.f3639c;
        E3.e eVar2 = AbstractC1528C.f15989a;
        AbstractC1562w.g(eVar, C3.o.f314a, new i(kVar, str2, this.f3635c, this.f3633a, this.f3636d, null), 2);
        return C0297i.f5732a;
    }
}
