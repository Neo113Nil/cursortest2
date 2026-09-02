package E1;

import E.AbstractC0005f;
import E1.C0035k;
import a0.C0147m;
import a2.C0162b;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import c2.C0284a;
import c2.C0286c;
import d2.InterfaceC0384b;
import java.util.HashMap;
import q0.InterfaceC1352A;

/* renamed from: E1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035k implements InterfaceC0384b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f624a;

    /* renamed from: b, reason: collision with root package name */
    public Object f625b;

    /* renamed from: c, reason: collision with root package name */
    public Object f626c;

    /* renamed from: d, reason: collision with root package name */
    public Object f627d;

    /* renamed from: e, reason: collision with root package name */
    public Object f628e;

    /* renamed from: f, reason: collision with root package name */
    public Object f629f;

    @Override // d2.InterfaceC0384b
    public void a(C0162b c0162b) {
        ((C0286c) this.f629f).f5674m.post(new B.a(this, c0162b, 13, false));
    }

    public u2.m b(int i4) {
        u2.m mVar;
        u2.m mVar2;
        HashMap hashMap = (HashMap) this.f626c;
        u2.m mVar3 = (u2.m) hashMap.get(Integer.valueOf(i4));
        if (mVar3 != null) {
            return mVar3;
        }
        final l2.e eVar = (l2.e) this.f628e;
        eVar.getClass();
        if (i4 == 0) {
            final Class asSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC1352A.class);
            final int i5 = 0;
            mVar = new u2.m() { // from class: q0.o
                @Override // u2.m
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return C1374p.e((Class) asSubclass, eVar);
                        case 1:
                            return C1374p.e((Class) asSubclass, eVar);
                        case 2:
                            return C1374p.e((Class) asSubclass, eVar);
                        default:
                            return new V(eVar, (y0.l) ((C0035k) asSubclass).f625b);
                    }
                }
            };
        } else if (i4 == 1) {
            final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(InterfaceC1352A.class);
            final int i6 = 1;
            mVar = new u2.m() { // from class: q0.o
                @Override // u2.m
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return C1374p.e((Class) asSubclass2, eVar);
                        case 1:
                            return C1374p.e((Class) asSubclass2, eVar);
                        case 2:
                            return C1374p.e((Class) asSubclass2, eVar);
                        default:
                            return new V(eVar, (y0.l) ((C0035k) asSubclass2).f625b);
                    }
                }
            };
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    mVar2 = new C0147m(2, RtspMediaSource$Factory.class.asSubclass(InterfaceC1352A.class));
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(AbstractC0005f.j(i4, "Unrecognized contentType: "));
                    }
                    final int i7 = 3;
                    mVar2 = new u2.m() { // from class: q0.o
                        @Override // u2.m
                        public final Object get() {
                            switch (i7) {
                                case 0:
                                    return C1374p.e((Class) this, eVar);
                                case 1:
                                    return C1374p.e((Class) this, eVar);
                                case 2:
                                    return C1374p.e((Class) this, eVar);
                                default:
                                    return new V(eVar, (y0.l) ((C0035k) this).f625b);
                            }
                        }
                    };
                }
                hashMap.put(Integer.valueOf(i4), mVar2);
                return mVar2;
            }
            final Class asSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC1352A.class);
            final int i8 = 2;
            mVar = new u2.m() { // from class: q0.o
                @Override // u2.m
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return C1374p.e((Class) asSubclass3, eVar);
                        case 1:
                            return C1374p.e((Class) asSubclass3, eVar);
                        case 2:
                            return C1374p.e((Class) asSubclass3, eVar);
                        default:
                            return new V(eVar, (y0.l) ((C0035k) asSubclass3).f625b);
                    }
                }
            };
        }
        mVar2 = mVar;
        hashMap.put(Integer.valueOf(i4), mVar2);
        return mVar2;
    }

    public void c(C0162b c0162b) {
        c2.m mVar = (c2.m) ((C0286c) this.f629f).f5671j.get((C0284a) this.f626c);
        if (mVar != null) {
            mVar.p(c0162b);
        }
    }
}
