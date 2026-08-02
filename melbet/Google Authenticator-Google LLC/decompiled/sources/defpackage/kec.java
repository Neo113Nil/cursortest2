package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kec extends BidirectionalStream.Callback {
    final /* synthetic */ kef a;
    private List b;

    public kec(kef kefVar) {
        this.a = kefVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0293 A[Catch: all -> 0x02c7, TryCatch #0 {, blocks: (B:49:0x00f9, B:51:0x00fd, B:53:0x0101, B:55:0x010b, B:57:0x010f, B:58:0x02a6, B:61:0x0128, B:63:0x0132, B:64:0x016d, B:66:0x0174, B:67:0x018a, B:69:0x0192, B:71:0x0199, B:72:0x013f, B:74:0x0143, B:75:0x014c, B:77:0x0156, B:78:0x0167, B:79:0x015f, B:80:0x019e, B:82:0x01a2, B:87:0x01c2, B:89:0x01c6, B:90:0x022c, B:91:0x01d9, B:99:0x01f7, B:101:0x01fb, B:104:0x021a, B:114:0x028f, B:116:0x0293, B:122:0x02a9, B:125:0x02c6, B:126:0x02ae, B:84:0x01b4, B:86:0x01b8, B:92:0x01dd, B:94:0x01e7, B:96:0x01ef, B:102:0x020e, B:105:0x0231, B:107:0x0244, B:109:0x024e, B:111:0x0260, B:113:0x0268, B:117:0x0282, B:119:0x0286, B:120:0x028a), top: B:47:0x00f7, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(List list, boolean z) {
        kbq kbqVar;
        kbq a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        int size = arrayList.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        Logger logger = kms.a;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            byte[] bArr2 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr3 = bArr[i4];
            byte[] bArr4 = kms.b;
            if (kms.a(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (kms.a(bArr5, bArr4)) {
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i6 <= length) {
                                        if (i6 == length || bArr6[i6] == 44) {
                                            byte[] h = hpx.d.h(new String(bArr6, i7, i6 - i7, StandardCharsets.US_ASCII));
                                            arrayList2.add(bArr5);
                                            arrayList2.add(h);
                                            i7 = i6 + 1;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        bArr = (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = hpx.d.h(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i3 += 2;
        }
        Charset charset = jyr.a;
        kaa kaaVar = new kaa(bArr.length >> 1, bArr);
        kef kefVar = this.a;
        jzw jzwVar = khg.n;
        khg khgVar = kefVar.r;
        synchronized (khgVar.s) {
            if (z) {
                kbq kbqVar2 = khgVar.o;
                if (kbqVar2 == null && !khgVar.r) {
                    khgVar.o = khg.i(kaaVar);
                    kbqVar2 = khgVar.o;
                    if (kbqVar2 != null) {
                        khgVar.p = kaaVar;
                    }
                }
                if (kbqVar2 != null) {
                    khgVar.o = kbqVar2.a("trailers: ".concat(kaaVar.toString()));
                    khgVar.l(khgVar.o, false, khgVar.p);
                } else {
                    kbq kbqVar3 = (kbq) kaaVar.c(jyt.b);
                    if (kbqVar3 != null) {
                        a = kbqVar3.e((String) kaaVar.c(jyt.a));
                    } else if (khgVar.r) {
                        a = kbq.d.e("missing GRPC status in response");
                    } else {
                        Integer num = (Integer) kaaVar.c(khg.n);
                        a = (num != null ? khd.a(num.intValue()) : kbq.k.e("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
                    }
                    khg.h(kaaVar);
                    if (khgVar.l) {
                        kej.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{a, kaaVar});
                    } else {
                        for (ixj ixjVar : khgVar.h.b) {
                        }
                        khgVar.f(a, false, kaaVar);
                    }
                }
            } else {
                kbq kbqVar4 = khgVar.o;
                if (kbqVar4 != null) {
                    khgVar.o = kbqVar4.a("headers: ".concat(kaaVar.toString()));
                } else {
                    try {
                        if (khgVar.r) {
                            khgVar.o = kbq.k.e("Received headers twice");
                            kbq kbqVar5 = khgVar.o;
                            if (kbqVar5 != null) {
                                khgVar.o = kbqVar5.a("headers: ".concat(kaaVar.toString()));
                                khgVar.p = kaaVar;
                                khgVar.q = khg.g(kaaVar);
                            }
                        } else {
                            Integer num2 = (Integer) kaaVar.c(khg.n);
                            if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                                khgVar.r = true;
                                khgVar.o = khg.i(kaaVar);
                                kbq kbqVar6 = khgVar.o;
                                if (kbqVar6 != null) {
                                    khgVar.o = kbqVar6.a("headers: ".concat(kaaVar.toString()));
                                    khgVar.p = kaaVar;
                                } else {
                                    khg.h(kaaVar);
                                    hoq.I(!khgVar.l, "Received headers on closed stream");
                                    for (ixj ixjVar2 : khgVar.h.b) {
                                        ((jxb) ixjVar2).a();
                                    }
                                    String str = (String) kaaVar.c(khd.c);
                                    if (str != null) {
                                        jxt a2 = khgVar.j.a(str);
                                        if (a2 == null) {
                                            khgVar.k(new kbt(kbq.k.e(String.format("Can't find decompressor for %s", str)), null));
                                            kbqVar = khgVar.o;
                                            if (kbqVar != null) {
                                                khgVar.o = kbqVar.a("headers: ".concat(kaaVar.toString()));
                                                khgVar.p = kaaVar;
                                            }
                                        } else if (a2 != jxc.a) {
                                            khgVar.m.c = a2;
                                        }
                                    }
                                    khgVar.i.c(kaaVar);
                                    kbqVar = khgVar.o;
                                    if (kbqVar != null) {
                                    }
                                }
                                khgVar.q = khg.g(kaaVar);
                            } else {
                                kbq kbqVar7 = khgVar.o;
                                if (kbqVar7 != null) {
                                    khgVar.o = kbqVar7.a("headers: ".concat(kaaVar.toString()));
                                    khgVar.p = kaaVar;
                                    khgVar.q = khg.g(kaaVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        kbq kbqVar8 = khgVar.o;
                        if (kbqVar8 != null) {
                            khgVar.o = kbqVar8.a("headers: ".concat(kaaVar.toString()));
                            khgVar.p = kaaVar;
                            khgVar.q = khg.g(kaaVar);
                        }
                        throw th;
                    }
                }
            }
        }
    }

    private static final kbq b(UrlResponseInfo urlResponseInfo) {
        return khd.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        kbq kbqVar;
        jzw jzwVar = khg.n;
        khg khgVar = this.a.r;
        synchronized (khgVar.s) {
            kbqVar = khgVar.x;
            if (kbqVar == null) {
                kbqVar = urlResponseInfo != null ? b(urlResponseInfo) : kbq.c.e("stream cancelled without reason");
            }
        }
        this.a.c(kbqVar);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.c(kbq.l.d(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        jzw jzwVar = khg.n;
        khg khgVar = this.a.r;
        synchronized (khgVar.s) {
            khgVar.y = z;
            if (byteBuffer.remaining() != 0) {
                khgVar.w += byteBuffer.remaining();
                kkb kkbVar = kkf.a;
                kke kkeVar = new kke(byteBuffer);
                kbq kbqVar = khgVar.o;
                if (kbqVar != null) {
                    Charset charset = khgVar.q;
                    charset.getClass();
                    int f = kkeVar.f();
                    byte[] bArr = new byte[f];
                    kkeVar.j(bArr, 0, f);
                    khgVar.o = kbqVar.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
                    if (khgVar.o.p.length() > 1000) {
                        khgVar.l(khgVar.o, false, khgVar.p);
                    }
                } else if (khgVar.r) {
                    kkeVar.f();
                    if (khgVar.l) {
                        kej.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    } else {
                        try {
                            kjf kjfVar = khgVar.m;
                            if (!kjfVar.b() && !kjfVar.f) {
                                kjfVar.d.h(kkeVar);
                                kjfVar.a();
                            }
                        } catch (Throwable th) {
                            khgVar.k(th);
                        }
                    }
                } else {
                    khgVar.l(kbq.k.e("headers not received before payload"), false, new kaa());
                }
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(this.a.p));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        jzw jzwVar = khg.n;
        khg khgVar = this.a.r;
        synchronized (khgVar.s) {
            z = khgVar.y;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        jzw jzwVar = khg.n;
        khg khgVar = this.a.r;
        synchronized (khgVar.s) {
            khgVar.m();
            khgVar.u = true;
            Collection<ked> collection = khgVar.t;
            for (ked kedVar : collection) {
                khgVar.A.d((ByteBuffer) kedVar.c, kedVar.a, kedVar.b);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        jzw jzwVar = khg.n;
        khg khgVar = this.a.r;
        synchronized (khgVar.s) {
            z = false;
            if (this.b != null && khgVar.y) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        this.a.c(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        jzw jzwVar = khg.n;
        kef kefVar = this.a;
        khg khgVar = kefVar.r;
        synchronized (khgVar.s) {
            boolean z2 = false;
            if (!khgVar.z) {
                khgVar.z = true;
                for (ixj ixjVar : kefVar.g.b) {
                }
            }
            int position = byteBuffer.position();
            synchronized (khgVar.a) {
                hoq.I(khgVar.e, "onStreamAllocated was not called, but it seems the stream is active");
                int i = khgVar.d;
                int i2 = khgVar.g;
                int i3 = i - position;
                khgVar.d = i3;
                if (i >= i2 && i3 < i2) {
                    z2 = true;
                }
            }
            if (z2) {
                khgVar.b();
            }
        }
    }
}
