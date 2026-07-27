package m5;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import I4.o;
import f4.v;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class k extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n5.d f11231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n5.d dVar, l lVar, l lVar2, long j2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f11231a = dVar;
        this.f11232b = lVar;
        this.f11233c = lVar2;
        this.f11234d = j2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new k(this.f11231a, this.f11232b, this.f11233c, this.f11234d, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2);
        v vVar = v.f5689a;
        kVar.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        n5.d dVar = this.f11231a;
        boolean z = dVar.f11473b;
        String str = dVar.f11472a;
        if (z) {
            absolutePath = B4.k.e0(str, "file://");
        } else {
            URL url = URI.create(str).toURL();
            kotlin.jvm.internal.i.d(url, "toURL(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream openStream = url.openStream();
            try {
                byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
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
                AbstractC1477a.e(openStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "toByteArray(...)");
                File createTempFile = File.createTempFile("sound", "");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(byteArray);
                    createTempFile.deleteOnExit();
                    AbstractC1477a.e(fileOutputStream, null);
                    absolutePath = createTempFile.getAbsolutePath();
                    kotlin.jvm.internal.i.d(absolutePath, "getAbsolutePath(...)");
                } finally {
                }
            } finally {
            }
        }
        String str2 = absolutePath;
        l lVar = this.f11232b;
        I4.e eVar = lVar.f11237c;
        K4.d dVar2 = E.f459a;
        AbstractC0024y.n(eVar, o.f1316a, 0, new j(lVar, str2, this.f11233c, this.f11231a, this.f11234d, null), 2);
        return v.f5689a;
    }
}
