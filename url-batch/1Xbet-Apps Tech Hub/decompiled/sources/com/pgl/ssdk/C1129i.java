package com.pgl.ssdk;

import com.pgl.ssdk.AbstractC1123c;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: V2VerifierSimple.java */
/* renamed from: com.pgl.ssdk.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1129i {
    @DungeonFlag
    private static Collection<? extends Certificate> a(ByteBuffer byteBuffer) throws C1121a, NoSuchAlgorithmException, CertificateException {
        ByteBuffer a = C1126f.a(byteBuffer);
        a.get(new byte[a.remaining()]);
        a.flip();
        a.position(0);
        C1126f.a(a);
        return CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(C1126f.b(C1126f.a(a))));
    }

    public static List<Certificate> a(InterfaceC1133m interfaceC1133m, AbstractC1123c.a aVar) throws IOException, C1125e {
        try {
            try {
                ByteBuffer a = C1126f.a(C1126f.a(interfaceC1133m, aVar, 1896449818).a);
                if (!a.hasRemaining()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (a.hasRemaining()) {
                    try {
                        arrayList.addAll(a(C1126f.a(a)));
                    } catch (NoSuchAlgorithmException | CertificateException unused) {
                    }
                }
                return arrayList;
            } catch (C1121a | BufferUnderflowException unused2) {
                return null;
            }
        } catch (C1128h e) {
            throw new C1125e(e.getMessage());
        }
    }
}
