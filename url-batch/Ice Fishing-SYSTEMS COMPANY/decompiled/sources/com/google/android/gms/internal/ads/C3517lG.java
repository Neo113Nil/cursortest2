package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3517lG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3517lG f32558b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f32559a = new AtomicReference(new HG(new PE(1)));

    static {
        try {
            C3517lG c3517lG = new C3517lG();
            c3517lG.a(new XF(C3085dG.class, DF.f24385D));
            f32558b = c3517lG;
        } catch (Exception e6) {
            throw new B0.c(e6);
        }
    }

    public final synchronized void a(XF xf) {
        AtomicReference atomicReference = this.f32559a;
        PE pe = new PE((HG) atomicReference.get());
        pe.b(xf);
        atomicReference.set(new HG(pe));
    }

    public final synchronized void b(VF vf) {
        AtomicReference atomicReference = this.f32559a;
        PE pe = new PE((HG) atomicReference.get());
        pe.e(vf);
        atomicReference.set(new HG(pe));
    }

    public final synchronized void c(C3733pG c3733pG) {
        AtomicReference atomicReference = this.f32559a;
        PE pe = new PE((HG) atomicReference.get());
        pe.g(c3733pG);
        atomicReference.set(new HG(pe));
    }

    public final synchronized void d(C3625nG c3625nG) {
        AtomicReference atomicReference = this.f32559a;
        PE pe = new PE((HG) atomicReference.get());
        pe.h(c3625nG);
        atomicReference.set(new HG(pe));
    }

    public final XC e(BG bg) {
        HG hg = (HG) this.f32559a.get();
        hg.getClass();
        FG fg = new FG(BG.class, bg.f24013b);
        HashMap hashMap = hg.f25341b;
        if (hashMap.containsKey(fg)) {
            return ((VF) hashMap.get(fg)).f28229b.a(bg);
        }
        String fg2 = fg.toString();
        throw new GeneralSecurityException(D.y.o(new StringBuilder(fg2.length() + 47), "No Key Parser for requested key type ", fg2, " available"));
    }

    public final EG f(XC xc) {
        HG hg = (HG) this.f32559a.get();
        hg.getClass();
        GG gg = new GG(xc.getClass(), BG.class);
        HashMap hashMap = hg.f25340a;
        if (hashMap.containsKey(gg)) {
            return ((XF) hashMap.get(gg)).f28625b.c(xc);
        }
        String gg2 = gg.toString();
        throw new GeneralSecurityException(D.y.o(new StringBuilder(gg2.length() + 32), "No Key serializer for ", gg2, " available"));
    }

    public final AbstractC4000uE g(CG cg) {
        HG hg = (HG) this.f32559a.get();
        hg.getClass();
        FG fg = new FG(CG.class, cg.f24158a);
        HashMap hashMap = hg.f25343d;
        if (hashMap.containsKey(fg)) {
            return ((C3625nG) hashMap.get(fg)).f32846b.b(cg);
        }
        String fg2 = fg.toString();
        throw new GeneralSecurityException(D.y.o(new StringBuilder(fg2.length() + 54), "No Parameters Parser for requested key type ", fg2, " available"));
    }

    public final EG h(AbstractC4000uE abstractC4000uE) {
        HG hg = (HG) this.f32559a.get();
        hg.getClass();
        GG gg = new GG(abstractC4000uE.getClass(), CG.class);
        HashMap hashMap = hg.f25342c;
        if (hashMap.containsKey(gg)) {
            return ((C3733pG) hashMap.get(gg)).f33375b.e(abstractC4000uE);
        }
        String gg2 = gg.toString();
        throw new GeneralSecurityException(D.y.o(new StringBuilder(gg2.length() + 39), "No Key Format serializer for ", gg2, " available"));
    }
}
