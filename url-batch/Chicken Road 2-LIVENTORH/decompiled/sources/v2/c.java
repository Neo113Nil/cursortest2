package v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oriondriftchasers.arordrft.R;
import f1.c0;
import java.util.List;
import s2.h;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends u {
    public c0 Y;

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f3.d.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_info_encyclopedia, viewGroup, false);
        int i = R.id.chapters_recycler_view;
        RecyclerView recyclerView = (RecyclerView) h.a.s(inflate, R.id.chapters_recycler_view);
        if (recyclerView != null) {
            i = R.id.info_subtitle_text;
            if (((TextView) h.a.s(inflate, R.id.info_subtitle_text)) != null) {
                i = R.id.info_title_header;
                if (((TextView) h.a.s(inflate, R.id.info_title_header)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.Y = new c0(constraintLayout, recyclerView);
                    f3.d.d(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        this.Y = null;
    }

    @Override // androidx.fragment.app.u
    public final void z(View view, Bundle bundle) {
        f3.d.e(view, "view");
        List W = a3.f.W(new y2.c("🚀 Cosmic Gliders", "Cosmic gliders are advanced spacecraft designed for high-speed navigation through asteroid fields. These vessels combine cutting-edge propulsion technology with enhanced maneuverability systems.\n                \nKey Features:\n• Ion Propulsion Engines\n• Adaptive Hull Plating\n• Quantum Navigation Systems\n• Emergency Shield Generators\n\nPerformance Metrics:\n→ Max Speed: 25,000 km/s\n→ Turn Radius: 150 meters\n→ Acceleration: 15 G-forces\n→ Hull Integrity: 95%\n\nThe latest models feature AI-assisted drift control, allowing pilots to execute precise maneuvers even in the densest asteroid fields."), new y2.c("🪨 Asteroid Field Navigation", "Navigating asteroid fields requires a combination of skill, technology, and precise calculations. Understanding asteroid behavior is crucial for survival.\n                \nAsteroid Types:\n• Type-A: Rocky, slow-moving (5-10 km/s)\n• Type-B: Metallic, medium density\n• Type-C: Ice-based, high volatility\n• Type-D: Composite, unpredictable\n\nNavigation Techniques:\n1. Predictive Trajectory Analysis\n2. Drift Angle Optimization\n3. Energy Conservation Mode\n4. Emergency Evasion Protocols\n\nCritical Safety Zones:\n⚠️ Red Zone: <50m proximity\n⚠️ Yellow Zone: 50-200m\n✅ Green Zone: >200m\n\nAlways maintain sufficient distance and monitor your velocity relative to asteroid movement patterns."), new y2.c("⚡ Drift Physics", "Drift racing in space follows unique physical principles. Unlike atmospheric racing, space drifting relies on controlled momentum transfer.\n                \nCore Principles:\n• Conservation of Angular Momentum\n• Gravitational Slingshot Effects\n• Thruster Vectoring\n• Inertial Dampening\n\nThe Drift Formula:\nD = (V × M) / (R + A)\n\nWhere:\nD = Drift Angle\nV = Velocity\nM = Mass\nR = Rotation Factor\nA = Asteroid Influence\n\nOptimal Drift Conditions:\n→ Medium velocity (8,000-12,000 km/s)\n→ Low asteroid density (<40%)\n→ Proper mass distribution\n→ Precise thruster timing\n\nMaster pilots can achieve drift angles up to 85° while maintaining full control."), new y2.c("🌌 Famous Race Tracks", "The galaxy hosts numerous legendary racing circuits, each presenting unique challenges and requiring different strategies.\n                \nTop 5 Racing Circuits:\n\n1. Orion's Belt Challenge 🏆\n   • Length: 2,500 km\n   • Asteroids: 15,000+\n   • Difficulty: Extreme\n   • Record: 3m 42s\n\n2. Nebula Storm Circuit ⛈️\n   • Length: 1,800 km\n   • Energy fields present\n   • Difficulty: Hard\n   • Record: 4m 15s\n\n3. Titan's Ring 💫\n   • Length: 3,200 km\n   • Dense ice field\n   • Difficulty: Medium\n   • Record: 5m 33s\n\n4. Mercury Run 🔥\n   • Length: 1,200 km\n   • High temperature zones\n   • Difficulty: Hard\n   • Record: 2m 58s\n\n5. Void Edge 🌑\n   • Length: 4,000 km\n   • Zero visibility zones\n   • Difficulty: Extreme\n   • Record: 7m 12s\n\nEach track requires specific glider configurations and piloting techniques."), new y2.c("🏆 Racing Championships", "The Galactic Racing League hosts annual championships that attract the best pilots from across the cosmos.\n                \nChampionship Structure:\n\nSeason Format:\n• 12 races per season\n• Points-based ranking system\n• Elimination rounds\n• Grand Championship finale\n\nPoint System:\n1st Place: 25 points\n2nd Place: 18 points\n3rd Place: 15 points\n4th-10th: 12-1 points\n\nPilot Rankings:\n⭐⭐⭐ Master Pilot (1000+ pts)\n⭐⭐ Expert Pilot (500-999 pts)\n⭐ Skilled Pilot (100-499 pts)\n🔰 Rookie Pilot (0-99 pts)\n\nPrize Distribution:\n🥇 Champion: 10M credits\n🥈 Runner-up: 5M credits\n🥉 Third Place: 2.5M credits\n\nTop pilots often secure lucrative sponsorship deals and endorsement contracts worth millions."), new y2.c("🛡️ Safety & Equipment", "Safety is paramount in asteroid field racing. Modern gliders come equipped with multiple redundant safety systems.\n                \nEssential Safety Equipment:\n\nPrimary Systems:\n• Emergency Shield Array\n• Auto-eject Pods\n• Hull Breach Sealant\n• Backup Life Support\n\nCommunication Gear:\n• Quantum Comm System\n• Emergency Beacon\n• Race Control Link\n• Team Channel\n\nPersonal Protection:\n• G-Force Dampening Suit\n• Oxygen Reserve (72 hours)\n• Medical Nanobots\n• Neural Interface Helmet\n\nPre-Race Checklist:\n✓ System diagnostics\n✓ Fuel levels (100%)\n✓ Shield integrity check\n✓ Communication test\n✓ Emergency protocols review\n\nRemember: No race is worth risking your life. Always prioritize safety over speed."), new y2.c("💰 Economics of Racing", "Space racing is a multi-billion credit industry with complex economics involving teams, sponsors, and manufacturers.\n                \nCost Breakdown:\n\nGlider Costs:\n• Entry-level: 500K credits\n• Mid-tier: 2M credits\n• Professional: 10M credits\n• Championship-grade: 50M+ credits\n\nOperational Expenses:\n→ Fuel per race: 50K credits\n→ Maintenance: 100K credits/month\n→ Crew salaries: 200K credits/month\n→ Insurance: 300K credits/year\n\nRevenue Streams:\n📊 Prize money: 30%\n📊 Sponsorships: 45%\n📊 Merchandise: 15%\n📊 Media rights: 10%\n\nTop teams employ 50+ specialists including engineers, data analysts, strategists, and medical staff. The investment pays off for championship-winning teams."));
        c0 c0Var = this.Y;
        f3.d.b(c0Var);
        c0Var.f1328a.setLayoutManager(new LinearLayoutManager(1));
        c0 c0Var2 = this.Y;
        f3.d.b(c0Var2);
        c0Var2.f1328a.setAdapter(new h(W));
    }
}
