package d2;

import T.G;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import a0.C0144j;
import a2.C0164d;
import a2.C0165e;
import a2.C0166f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import f.AbstractC0410a;
import f1.E;
import g.AbstractC0432a;
import io.appmetrica.analytics.impl.Zo;
import j0.C1171a;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import k.AbstractC1237x;
import k.C1227n;
import l0.InterfaceC1243a;
import m0.C1280B;
import m0.C1283E;
import m0.C1289b;
import m0.C1300m;
import m0.C1301n;
import m0.RunnableC1302o;
import v2.I;
import v2.a0;
import w0.C1496c;
import x.AbstractC1514c;
import y0.F;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389g implements y0.i, f1.z, h0.s, j0.l, u0.p, y0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8263a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8264b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8265c;

    public /* synthetic */ C0389g(int i4, boolean z) {
        this.f8263a = i4;
    }

    @Override // j0.l
    public void A(w0.j jVar, Handler handler) {
        ((MediaCodec) this.f8264b).setOnFrameRenderedListener(new C1171a(this, jVar, 1), handler);
    }

    @Override // j0.l
    public void B(ArrayList arrayList) {
        ((MediaCodec) this.f8264b).unsubscribeFromVendorParameters(arrayList);
    }

    public void C(Object obj, String str) {
        ((ArrayList) this.f8264b).add(AbstractC1514c.b(str, "=", String.valueOf(obj)));
    }

    public void D() {
        G3.h hVar;
        ImageView imageView = (ImageView) this.f8264b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC1237x.f14120a;
        }
        if (drawable == null || (hVar = (G3.h) this.f8265c) == null) {
            return;
        }
        C1227n.c(drawable, hVar, imageView.getDrawableState());
    }

    public View E(int i4, int i5, int i6, int i7) {
        int s4;
        int i8;
        int t4;
        View o;
        int left;
        int i9;
        int right;
        int i10;
        S0.i iVar = (S0.i) this.f8265c;
        l1.s sVar = (l1.s) this.f8264b;
        switch (sVar.f14253a) {
            case 0:
                s4 = sVar.f14254b.s();
                break;
            default:
                s4 = sVar.f14254b.u();
                break;
        }
        switch (sVar.f14253a) {
            case 0:
                l1.t tVar = sVar.f14254b;
                i8 = tVar.f14260f;
                t4 = tVar.t();
                break;
            default:
                l1.t tVar2 = sVar.f14254b;
                i8 = tVar2.f14261g;
                t4 = tVar2.r();
                break;
        }
        int i11 = i8 - t4;
        int i12 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            switch (sVar.f14253a) {
                case 0:
                    o = sVar.f14254b.o(i4);
                    break;
                default:
                    o = sVar.f14254b.o(i4);
                    break;
            }
            switch (sVar.f14253a) {
                case 0:
                    l1.u uVar = (l1.u) o.getLayoutParams();
                    left = o.getLeft() - ((l1.u) o.getLayoutParams()).f14262a.left;
                    i9 = ((ViewGroup.MarginLayoutParams) uVar).leftMargin;
                    break;
                default:
                    l1.u uVar2 = (l1.u) o.getLayoutParams();
                    left = o.getTop() - ((l1.u) o.getLayoutParams()).f14262a.top;
                    i9 = ((ViewGroup.MarginLayoutParams) uVar2).topMargin;
                    break;
            }
            int i13 = left - i9;
            switch (sVar.f14253a) {
                case 0:
                    l1.u uVar3 = (l1.u) o.getLayoutParams();
                    right = o.getRight() + ((l1.u) o.getLayoutParams()).f14262a.right;
                    i10 = ((ViewGroup.MarginLayoutParams) uVar3).rightMargin;
                    break;
                default:
                    l1.u uVar4 = (l1.u) o.getLayoutParams();
                    right = o.getBottom() + ((l1.u) o.getLayoutParams()).f14262a.bottom;
                    i10 = ((ViewGroup.MarginLayoutParams) uVar4).bottomMargin;
                    break;
            }
            int i14 = right + i10;
            iVar.f2424b = s4;
            iVar.f2425c = i11;
            iVar.f2426d = i13;
            iVar.f2427e = i14;
            if (i6 != 0) {
                iVar.f2423a = i6;
                if (iVar.a()) {
                    return o;
                }
            }
            if (i7 != 0) {
                iVar.f2423a = i7;
                if (iVar.a()) {
                    view = o;
                }
            }
            i4 += i12;
        }
        return view;
    }

    public t2.j F() {
        t2.j jVar;
        l2.g gVar = (l2.g) this.f8264b;
        if (gVar.f14275j.b(gVar.f14274i, 212800000) == 0) {
            c2.i iVar = new c2.i();
            iVar.f5675a = new C0164d[]{X1.c.f3611a};
            iVar.f5678d = new C0144j(22, gVar);
            iVar.f5676b = false;
            iVar.f5677c = 27601;
            jVar = gVar.b(0, iVar.a());
        } else {
            b2.d dVar = new b2.d(new Status(17, null, null, null));
            t2.j jVar2 = new t2.j();
            jVar2.d(dVar);
            jVar = jVar2;
        }
        e0.t tVar = new e0.t(this);
        jVar.getClass();
        L1.q qVar = t2.e.f15408a;
        t2.j jVar3 = new t2.j();
        jVar.f15419b.b(new t2.f(qVar, tVar, jVar3));
        jVar.g();
        return jVar3;
    }

    public y0.n G(Object... objArr) {
        Constructor d4;
        synchronized (((AtomicBoolean) this.f8265c)) {
            if (!((AtomicBoolean) this.f8265c).get()) {
                try {
                    d4 = ((Zo) this.f8264b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f8265c).set(true);
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating extension", e4);
                }
            }
            d4 = null;
        }
        if (d4 == null) {
            return null;
        }
        try {
            return (y0.n) d4.newInstance(objArr);
        } catch (Exception e5) {
            throw new IllegalStateException("Unexpected error creating extractor", e5);
        }
    }

    public void H(int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.f8264b;
        B1.j v = B1.j.v(imageView.getContext(), null, AbstractC0410a.f8474e, i4);
        TypedArray typedArray = (TypedArray) v.f202c;
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0432a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC1237x.f14120a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(v.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1237x.c(typedArray.getInt(3, -1), null));
            }
            v.x();
        } catch (Throwable th) {
            v.x();
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        if (r10.equals("L8") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(C0389g c0389g) {
        C1300m c1300m = (C1300m) this.f8265c;
        C1280B c1280b = C1280B.f14296c;
        String str = (String) ((C1283E) c0389g.f8265c).f14315a.get("range");
        if (str != null) {
            try {
                c1280b = C1280B.a(str);
            } catch (G e4) {
                c1300m.f14404a.e("SDP format error.", e4);
                return;
            }
        }
        Uri uri = c1300m.f14411h;
        d0.g gVar = c1300m.f14404a;
        v2.r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            a0 a0Var = ((C1283E) c0389g.f8265c).f14316b;
            char c4 = 1;
            if (i4 >= a0Var.f15607d) {
                a0 i6 = I.i(i5, objArr);
                if (i6.isEmpty()) {
                    gVar.e("No playable track.", null);
                    return;
                }
                gVar.getClass();
                long j4 = c1280b.f14299b;
                m0.r rVar = (m0.r) gVar.f8130b;
                for (int i7 = 0; i7 < i6.f15607d; i7++) {
                    m0.q qVar = new m0.q(rVar, (m0.v) i6.get(i7), i7, rVar.f14441h);
                    rVar.f14438e.add(qVar);
                    qVar.f14429b.f(qVar.f14428a.f14425b, rVar.f14436c, 0);
                }
                m0.u uVar = (m0.u) rVar.f14440g.f8416a;
                uVar.f14458l = J.M(j4 - c1280b.f14298a);
                uVar.f14459m = !(j4 == -9223372036854775807L);
                uVar.n = j4 == -9223372036854775807L;
                uVar.o = false;
                uVar.x();
                c1300m.f14417p = true;
                return;
            }
            C1289b c1289b = (C1289b) a0Var.get(i4);
            String E4 = U.i.E(c1289b.f14350j.f14338b);
            E4.getClass();
            switch (E4.hashCode()) {
                case -1922091719:
                    if (E4.equals("MPEG4-GENERIC")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2412:
                    break;
                case 64593:
                    if (E4.equals("AC3")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 64934:
                    if (E4.equals("AMR")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 74609:
                    if (E4.equals("L16")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 85182:
                    if (E4.equals("VP8")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 85183:
                    if (E4.equals("VP9")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2194728:
                    if (E4.equals("H264")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2194729:
                    if (E4.equals("H265")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2433087:
                    if (E4.equals("OPUS")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2450119:
                    if (E4.equals("PCMA")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2450139:
                    if (E4.equals("PCMU")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1061166827:
                    if (E4.equals("MP4A-LATM")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1934494802:
                    if (E4.equals("AMR-WB")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1959269366:
                    if (E4.equals("MP4V-ES")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2137188397:
                    if (E4.equals("H263-1998")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2137209252:
                    if (E4.equals("H263-2000")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    m0.v vVar = new m0.v((C1301n) c0389g.f8264b, c1289b, uri);
                    int i8 = i5 + 1;
                    int e5 = v2.C.e(objArr.length, i8);
                    if (e5 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, e5);
                    }
                    objArr[i5] = vVar;
                    i5 = i8;
                    break;
            }
            i4++;
        }
    }

    public void J() {
        C1300m c1300m = (C1300m) this.f8265c;
        AbstractC0124a.t(c1300m.o == 2);
        c1300m.o = 1;
        c1300m.f14419r = false;
        long j4 = c1300m.f14420s;
        if (j4 != -9223372036854775807L) {
            c1300m.k(J.Z(j4));
        }
    }

    public F K(int i4) {
        int i5 = 0;
        while (true) {
            int[] iArr = (int[]) this.f8264b;
            if (i5 >= iArr.length) {
                AbstractC0108a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i4);
                return new y0.m();
            }
            if (i4 == iArr[i5]) {
                return ((q0.a0[]) this.f8265c)[i5];
            }
            i5++;
        }
    }

    @Override // f1.z
    public void a(W.u uVar) {
        f1.C c4 = (f1.C) this.f8265c;
        SparseArray sparseArray = c4.f8514h;
        W.t tVar = (W.t) this.f8264b;
        if (uVar.z() == 0 && (uVar.z() & 128) != 0) {
            uVar.N(6);
            int a3 = uVar.a() / 4;
            for (int i4 = 0; i4 < a3; i4++) {
                uVar.k(tVar.f3345d, 0, 4);
                tVar.q(0);
                int i5 = tVar.i(16);
                tVar.t(3);
                if (i5 == 0) {
                    tVar.t(13);
                } else {
                    int i6 = tVar.i(13);
                    if (sparseArray.get(i6) == null) {
                        sparseArray.put(i6, new f1.A(new T0.j(c4, i6)));
                        c4.n++;
                    }
                }
            }
            if (c4.f8507a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // j0.l
    public void b(Bundle bundle) {
        ((MediaCodec) this.f8264b).setParameters(bundle);
    }

    @Override // j0.l
    public void c(int i4, Z.b bVar, long j4, int i5) {
        ((MediaCodec) this.f8264b).queueSecureInputBuffer(i4, 0, bVar.f3777i, j4, i5);
    }

    @Override // j0.l
    public void e(int i4, int i5, long j4, int i6) {
        ((MediaCodec) this.f8264b).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    @Override // j0.l
    public void f(int i4) {
        ((MediaCodec) this.f8264b).releaseOutputBuffer(i4, false);
    }

    @Override // j0.l
    public void flush() {
        ((MediaCodec) this.f8264b).flush();
    }

    @Override // j0.l
    public MediaFormat g() {
        return ((MediaCodec) this.f8264b).getOutputFormat();
    }

    @Override // j0.l
    public void h() {
        ((MediaCodec) this.f8264b).detachOutputSurface();
    }

    @Override // h0.s
    public u0.p i(h0.o oVar, h0.l lVar) {
        return new C0389g(((h0.s) this.f8264b).i(oVar, lVar), 8, (List) this.f8265c);
    }

    @Override // y0.i
    public y0.h j(y0.o oVar, long j4) {
        long position = oVar.getPosition();
        int min = (int) Math.min(20000L, oVar.getLength() - position);
        W.u uVar = (W.u) this.f8265c;
        uVar.J(min);
        oVar.E(uVar.f3351a, 0, min);
        int i4 = -1;
        int i5 = -1;
        long j5 = -9223372036854775807L;
        while (uVar.a() >= 4) {
            if (D0.c.a(uVar.f3352b, uVar.f3351a) != 442) {
                uVar.N(1);
            } else {
                uVar.N(4);
                long c4 = f1.w.c(uVar);
                if (c4 != -9223372036854775807L) {
                    long b4 = ((W.G) this.f8264b).b(c4);
                    if (b4 > j4) {
                        return j5 == -9223372036854775807L ? new y0.h(-1, b4, position) : new y0.h(0, -9223372036854775807L, position + i5);
                    }
                    if (b4 + 100000 > j4) {
                        return new y0.h(0, -9223372036854775807L, position + uVar.f3352b);
                    }
                    j5 = b4;
                    i5 = uVar.f3352b;
                }
                int i6 = uVar.f3353c;
                if (uVar.a() >= 10) {
                    uVar.N(9);
                    int z = uVar.z() & 7;
                    if (uVar.a() >= z) {
                        uVar.N(z);
                        if (uVar.a() >= 4) {
                            if (D0.c.a(uVar.f3352b, uVar.f3351a) == 443) {
                                uVar.N(4);
                                int G4 = uVar.G();
                                if (uVar.a() < G4) {
                                    uVar.M(i6);
                                } else {
                                    uVar.N(G4);
                                }
                            }
                            while (true) {
                                if (uVar.a() < 4) {
                                    break;
                                }
                                int a3 = D0.c.a(uVar.f3352b, uVar.f3351a);
                                if (a3 == 442 || a3 == 441 || (a3 >>> 8) != 1) {
                                    break;
                                }
                                uVar.N(4);
                                if (uVar.a() < 2) {
                                    uVar.M(i6);
                                    break;
                                }
                                uVar.M(Math.min(uVar.f3353c, uVar.f3352b + uVar.G()));
                            }
                        } else {
                            uVar.M(i6);
                        }
                    } else {
                        uVar.M(i6);
                    }
                } else {
                    uVar.M(i6);
                }
                i4 = uVar.f3352b;
            }
        }
        return j5 != -9223372036854775807L ? new y0.h(-2, j5, position + i4) : y0.h.f16156d;
    }

    @Override // j0.l
    public void k(int i4, long j4) {
        ((MediaCodec) this.f8264b).releaseOutputBuffer(i4, j4);
    }

    @Override // j0.l
    public int l() {
        return ((MediaCodec) this.f8264b).dequeueInputBuffer(0L);
    }

    @Override // j0.l
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f8264b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // j0.l
    public void o(int i4) {
        ((MediaCodec) this.f8264b).setVideoScalingMode(i4);
    }

    @Override // j0.l
    public ByteBuffer q(int i4) {
        return ((MediaCodec) this.f8264b).getInputBuffer(i4);
    }

    @Override // y0.p
    public void r() {
        m0.r rVar = (m0.r) this.f8265c;
        rVar.f14435b.post(new RunnableC1302o(rVar, 0));
    }

    @Override // j0.l
    public void release() {
        B1.j jVar = (B1.j) this.f8265c;
        MediaCodec mediaCodec = (MediaCodec) this.f8264b;
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                mediaCodec.stop();
            }
            if (i4 >= 35 && jVar != null) {
                jVar.A(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
                jVar.A(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // j0.l
    public void s(Surface surface) {
        ((MediaCodec) this.f8264b).setOutputSurface(surface);
    }

    @Override // j0.l
    public ByteBuffer t(int i4) {
        return ((MediaCodec) this.f8264b).getOutputBuffer(i4);
    }

    public String toString() {
        switch (this.f8263a) {
            case 0:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f8265c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f8264b;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append((String) arrayList.get(i4));
                    if (i4 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // u0.p
    public Object u(Uri uri, Y.j jVar) {
        InterfaceC1243a interfaceC1243a = (InterfaceC1243a) ((u0.p) this.f8264b).u(uri, jVar);
        List list = (List) this.f8265c;
        return (list == null || list.isEmpty()) ? interfaceC1243a : (InterfaceC1243a) interfaceC1243a.a(list);
    }

    @Override // h0.s
    public u0.p v() {
        return new C0389g(((h0.s) this.f8264b).v(), 8, (List) this.f8265c);
    }

    @Override // j0.l
    public void w(ArrayList arrayList) {
        ((MediaCodec) this.f8264b).subscribeToVendorParameters(arrayList);
    }

    @Override // y0.i
    public void y() {
        W.u uVar = (W.u) this.f8265c;
        byte[] bArr = J.f3264b;
        uVar.getClass();
        uVar.K(bArr.length, bArr);
    }

    @Override // y0.p
    public F z(int i4, int i5) {
        return (q0.a0) this.f8264b;
    }

    public C0389g(Context context) {
        l2.e eVar;
        this.f8263a = 10;
        this.f8264b = new l2.g(context, C0166f.f4277b);
        synchronized (l2.e.class) {
            try {
                if (l2.e.f14268d == null) {
                    l2.e.f14268d = new l2.e(context.getApplicationContext(), 0);
                }
                eVar = l2.e.f14268d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8265c = eVar;
    }

    public /* synthetic */ C0389g(Object obj, int i4, Object obj2) {
        this.f8263a = i4;
        this.f8264b = obj;
        this.f8265c = obj2;
    }

    public /* synthetic */ C0389g(Object obj) {
        this.f8263a = 0;
        this.f8265c = obj;
        this.f8264b = new ArrayList();
    }

    public C0389g(int i4) {
        this.f8263a = i4;
        switch (i4) {
            case 17:
                this.f8264b = new ReentrantLock();
                this.f8265c = new LinkedHashMap();
                break;
            default:
                C0165e c0165e = C0165e.f4275d;
                this.f8264b = new SparseIntArray();
                this.f8265c = c0165e;
                break;
        }
    }

    public C0389g(ImageView imageView) {
        this.f8263a = 6;
        this.f8264b = imageView;
    }

    public C0389g(W.G g4) {
        this.f8263a = 2;
        this.f8264b = g4;
        this.f8265c = new W.u();
    }

    public C0389g(MediaCodec mediaCodec, B1.j jVar) {
        boolean addMediaCodec;
        this.f8263a = 5;
        this.f8264b = mediaCodec;
        this.f8265c = jVar;
        if (Build.VERSION.SDK_INT < 35 || jVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) jVar.f203d;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC0124a.t(((HashSet) jVar.f201b).add(mediaCodec));
    }

    public C0389g(l1.s sVar) {
        this.f8263a = 9;
        this.f8264b = sVar;
        S0.i iVar = new S0.i();
        iVar.f2423a = 0;
        this.f8265c = iVar;
    }

    public C0389g(C1496c c1496c) {
        this.f8263a = 16;
        this.f8265c = c1496c;
    }

    public C0389g(Matcher matcher, String str) {
        this.f8263a = 18;
        this.f8264b = matcher;
    }

    public C0389g(m0.r rVar, q0.a0 a0Var) {
        this.f8263a = 13;
        this.f8265c = rVar;
        this.f8264b = a0Var;
    }

    @Override // y0.p
    public void x(y0.y yVar) {
    }

    public C0389g(C1300m c1300m) {
        this.f8263a = 11;
        this.f8265c = c1300m;
        this.f8264b = J.o(null);
    }

    public C0389g(f1.C c4) {
        this.f8263a = 3;
        this.f8265c = c4;
        this.f8264b = new W.t(4, new byte[4]);
    }

    public C0389g(Zo zo) {
        this.f8263a = 19;
        this.f8264b = zo;
        this.f8265c = new AtomicBoolean(false);
    }

    @Override // f1.z
    public void d(W.G g4, y0.p pVar, E e4) {
    }
}
