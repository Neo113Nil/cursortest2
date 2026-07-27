package w;

import A0.C0036g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11312a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public l2.g f11313b;

    /* renamed from: c, reason: collision with root package name */
    public l2.g f11314c;

    /* renamed from: d, reason: collision with root package name */
    public int f11315d;

    /* renamed from: e, reason: collision with root package name */
    public Long f11316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11317f;

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[LOOP:0: B:24:0x005e->B:29:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[EDGE_INSN: B:30:0x0073->B:31:0x0073 BREAK  A[LOOP:0: B:24:0x005e->B:29:0x006e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(G0.y yVar) {
        l2.g gVar;
        this.f11317f = false;
        l2.g gVar2 = this.f11313b;
        if (yVar.equals(gVar2 != null ? (G0.y) gVar2.f7977c : null)) {
            return;
        }
        C0036g c0036g = yVar.f3093a;
        String str = c0036g.f328a;
        l2.g gVar3 = this.f11313b;
        if (Intrinsics.a(str, gVar3 != null ? ((G0.y) gVar3.f7977c).f3093a.f328a : null)) {
            l2.g gVar4 = this.f11313b;
            if (gVar4 == null) {
                return;
            }
            gVar4.f7977c = yVar;
            return;
        }
        this.f11313b = new l2.g(this.f11313b, 15, yVar);
        this.f11314c = null;
        int length = c0036g.f328a.length() + this.f11315d;
        this.f11315d = length;
        if (length > this.f11312a) {
            l2.g gVar5 = this.f11313b;
            if ((gVar5 != null ? (l2.g) gVar5.f7976b : null) == null) {
                return;
            }
            while (true) {
                if (gVar5 != null) {
                    l2.g gVar6 = (l2.g) gVar5.f7976b;
                    if (gVar6 != null) {
                        gVar = (l2.g) gVar6.f7976b;
                        if (gVar != null) {
                            break;
                        } else {
                            gVar5 = (l2.g) gVar5.f7976b;
                        }
                    }
                }
                gVar = null;
                if (gVar != null) {
                }
            }
            if (gVar5 == null) {
                return;
            }
            gVar5.f7976b = null;
        }
    }
}
