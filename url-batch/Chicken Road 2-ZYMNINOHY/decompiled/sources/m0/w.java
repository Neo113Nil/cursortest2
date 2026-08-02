package m0;

import a.AbstractC0124a;
import android.os.Handler;
import d2.C0389g;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w implements u0.k {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f14463a;

    /* renamed from: b, reason: collision with root package name */
    public final J1.b f14464b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f14465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f14466d;

    public w(y yVar, InputStream inputStream) {
        this.f14466d = yVar;
        this.f14463a = new DataInputStream(inputStream);
        J1.b bVar = new J1.b();
        bVar.f1158c = new ArrayList();
        bVar.f1156a = 1;
        this.f14464b = bVar;
    }

    @Override // u0.k
    public final void c() {
        String str;
        while (!this.f14465c) {
            byte readByte = this.f14463a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f14463a.readUnsignedByte();
                int readUnsignedShort = this.f14463a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f14463a.readFully(bArr, 0, readUnsignedShort);
                C1285G c1285g = (C1285G) this.f14466d.f14473c.get(Integer.valueOf(readUnsignedByte));
                if (c1285g != null && !this.f14466d.f14476f) {
                    c1285g.f14331e.add(bArr);
                }
            } else if (this.f14466d.f14476f) {
                continue;
            } else {
                C0389g c0389g = this.f14466d.f14471a;
                J1.b bVar = this.f14464b;
                DataInputStream dataInputStream = this.f14463a;
                bVar.getClass();
                v2.I a3 = bVar.a(J1.b.b(readByte, dataInputStream));
                while (a3 == null) {
                    if (bVar.f1156a == 3) {
                        long j4 = bVar.f1157b;
                        if (j4 <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int g4 = O3.d.g(j4);
                        AbstractC0124a.t(g4 != -1);
                        byte[] bArr2 = new byte[g4];
                        dataInputStream.readFully(bArr2, 0, g4);
                        ArrayList arrayList = (ArrayList) bVar.f1158c;
                        AbstractC0124a.t(bVar.f1156a == 3);
                        if (g4 > 0) {
                            int i4 = g4 - 1;
                            if (bArr2[i4] == 10) {
                                if (g4 > 1) {
                                    int i5 = g4 - 2;
                                    if (bArr2[i5] == 13) {
                                        str = new String(bArr2, 0, i5, y.f14470g);
                                        arrayList.add(str);
                                        a3 = v2.I.k(arrayList);
                                        ((ArrayList) bVar.f1158c).clear();
                                        bVar.f1156a = 1;
                                        bVar.f1157b = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i4, y.f14470g);
                                arrayList.add(str);
                                a3 = v2.I.k(arrayList);
                                ((ArrayList) bVar.f1158c).clear();
                                bVar.f1156a = 1;
                                bVar.f1157b = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    a3 = bVar.a(J1.b.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) c0389g.f8264b).post(new g0.p(c0389g, 9, a3));
            }
        }
    }

    @Override // u0.k
    public final void d() {
        this.f14465c = true;
    }
}
