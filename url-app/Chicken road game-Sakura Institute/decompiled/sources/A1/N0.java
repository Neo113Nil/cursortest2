package A1;

import A.AbstractC0017m;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import androidx.compose.foundation.layout.FillElement;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;
import z2.C1441y;

/* loaded from: classes.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f513a = C1441y.e(new M0("Age groups", "Group athletes by birth year on Jan 1 of the meet year.\n• U10 — turning 9 or younger\n• U12 — 10–11\n• U14 — 12–13\n• U16 — 14–15\n• U18 — 16–17\n• Open — anyone older."), new M0("False start", "Any athlete leaving the blocks before the gun is a false start.\nSchool / village rule of thumb: one warning, second false start = disqualification.\nAt a strict district meet, no warning — first false start eliminates the offender."), new M0("Wind reading (sprint & jumps)", "Record wind for 100 m, 200 m and horizontal jumps.\nTailwind beyond +2.0 m/s makes the mark wind-aided — note it on the sheet, but the athlete still gets their place.\nRecords require wind ≤ +2.0 m/s."), new M0("Sprint distances", "Track event distances by group:\n• U10: 60 m\n• U12: 60 m, 600 m\n• U14: 80 m, 150 m, 800 m\n• U16: 100 m, 300 m, 1000 m\n• U18+: 100 m, 200 m, 400 m, 800 m, 1500 m, 3000 m."), new M0("Field events: attempts", "Long jump, shot, discus, javelin — 3 attempts in the qualifying round, top 8 get 3 more for a total of 6.\nBest result wins; ties broken by second-best."), new M0("High jump", "Each athlete has 3 attempts at every height.\nThree failures at any single height eliminates them.\nBar raises by at least 2 cm at school meets, 5 cm later in the competition."), new M0("Relay 4 × 100 m", "Hand off the baton inside a 20 m exchange zone.\nDrop the baton — the runner who dropped it must pick it up; nobody else.\nStep on the inside line in the curves — disqualification."), new M0("Cross-country", "Mark a loop with flags or tape; checkpoints every ~1 km.\nMake the route safe — no roads, no livestock fields without a fence.\nProvide water at the start and at every checkpoint past the first kilometre."), new M0("Scoring (team meet)", "Default school scoring: 5 / 3 / 1 (gold / silver / bronze).\nDistrict meets often use 8 / 6 / 4 / 3 / 2 / 1 down to sixth place.\nSet the scheme before the meet — don't change it on the fly."), new M0("Safety basics", "Mark the throw sector with cones — 5 m clearance both sides.\nLong-jump sand should be raked and watered between athletes.\nStop racing if a thunderstorm is within 10 km — no exceptions."));

    public static final void a(int i2, C0216p c0216p) {
        c0216p.U(-385811282);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, AbstractC1365I.f11800a, Z.K.f4461a);
            C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i4 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                AbstractC0017m.r(i4, c0216p, i4, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            AbstractC0864b.j("Rules", "A village-meet referee's pocket book", c0216p, 54);
            S.o h4 = androidx.compose.foundation.layout.b.h(fillElement, 14);
            C1028g c1028g = new C1028g(10);
            c0216p.S(683917049);
            Object I3 = c0216p.I();
            if (I3 == C0208l.f2826a) {
                I3 = new v0(3);
                c0216p.c0(I3);
            }
            c0216p.q(false);
            m3.s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I3, c0216p, 100687878, 238);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, 1);
        }
    }
}
