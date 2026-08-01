package t0;

import a3.f;
import android.graphics.Rect;
import android.text.InputFilter;
import android.view.View;
import java.util.List;
import l2.y;
import y2.g;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = l(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b4 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b4) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static List e() {
        return f.W(new y2.b(1, "Novice Glider", "🛸", 50, 45, 60, 0L), new y2.b(2, "Swift Runner", "🚀", 65, 55, 50, 15000L), new y2.b(3, "Asteroid Dancer", "✨", 60, 70, 55, 25000L), new y2.b(4, "Nebula Racer", "⚡", 75, 60, 65, 40000L), new y2.b(5, "Cosmic Phantom", "👻", 70, 75, 60, 60000L), new y2.b(6, "Stellar Fury", "🔥", 85, 65, 70, 85000L), new y2.b(7, "Void Chaser", "🌌", 80, 80, 75, 120000L));
    }

    public static List f() {
        return f.W(new y2.f("space_physics", "Space Physics Fundamentals", "⚡", f.W(new g("What is the primary force affecting drift in asteroid fields?", f.W("Gravity", "Inertia", "Magnetism", "Radiation"), 1), new g("Maximum velocity for safe asteroid field navigation is typically?", f.W("5,000 km/s", "15,000 km/s", "25,000 km/s", "50,000 km/s"), 1), new g("What happens when a glider exceeds its drift angle limit?", f.W("Speed increases", "Loss of control", "Shields activate", "Nothing"), 1), new g("Ion propulsion engines work by?", f.W("Chemical reactions", "Nuclear fusion", "Ionized particles", "Solar power"), 2), new g("The optimal drift angle for most maneuvers is?", f.W("15-30°", "45-60°", "70-85°", "90°+"), 1), new g("G-force dampening systems protect against?", f.W("Radiation", "Extreme acceleration", "Cold", "Asteroids"), 1), new g("Quantum navigation systems calculate trajectory using?", f.W("GPS", "Stars", "Quantum entanglement", "Radio waves"), 2), new g("What determines a glider's turning radius?", f.W("Color", "Mass and velocity", "Age", "Pilot skill only"), 1), new g("Emergency shield generators activate when?", f.W("Always on", "Manually", "Collision imminent", "Low fuel"), 2), new g("The conservation of momentum principle states?", f.W("Speed is constant", "Energy is lost", "Total momentum conserved", "Mass changes"), 2), new g("Thruster vectoring allows pilots to?", f.W("Go faster", "Change direction precisely", "Save fuel", "Shield boost"), 1), new g("Inertial dampening systems reduce?", f.W("Speed", "Mass", "G-forces", "Fuel consumption"), 2))), new y2.f("glider_tech", "Glider Technology", "🚀", f.W(new g("What material is used for adaptive hull plating?", f.W("Steel", "Aluminum", "Nano-composite", "Titanium"), 2), new g("Entry-level gliders typically cost?", f.W("100K credits", "500K credits", "2M credits", "10M credits"), 1), new g("Championship-grade gliders can cost up to?", f.W("5M credits", "10M credits", "50M+ credits", "100M+ credits"), 2), new g("What is the purpose of neural interface helmets?", f.W("Protection", "Communication", "Direct ship control", "Oxygen supply"), 2), new g("Hull integrity should always be maintained above?", f.W("50%", "70%", "90%", "95%"), 2), new g("Auto-eject pods are used for?", f.W("Speed boost", "Emergency escape", "Cargo", "Communication"), 1), new g("Fuel consumption per race averages?", f.W("10K credits", "50K credits", "100K credits", "500K credits"), 1), new g("What system allows AI-assisted drift control?", f.W("Manual controls", "Quantum processor", "Radio", "Radar"), 1), new g("Professional gliders typically cost?", f.W("500K", "2M", "10M", "50M"), 2), new g("Emergency beacon range is typically?", f.W("100 km", "1,000 km", "10,000 km", "100,000 km"), 2), new g("Medical nanobots are used for?", f.W("Repairs", "Injury treatment", "Fuel", "Communication"), 1), new g("Backup life support provides oxygen for?", f.W("6 hours", "24 hours", "72 hours", "1 week"), 2), new g("Quantum comm systems operate using?", f.W("Radio waves", "Light signals", "Quantum entanglement", "Sound"), 2))), new y2.f("navigation", "Advanced Navigation", "🧭", f.W(new g("Type-A asteroids move at what speed?", f.W("1-5 km/s", "5-10 km/s", "15-20 km/s", "25+ km/s"), 1), new g("Red zone proximity is defined as?", f.W("<50m", "<100m", "<200m", "<500m"), 0), new g("Green zone safe distance is?", f.W(">50m", ">100m", ">200m", ">500m"), 2), new g("Type-C asteroids are primarily composed of?", f.W("Rock", "Metal", "Ice", "Gas"), 2), new g("Predictive trajectory analysis helps pilots?", f.W("Go faster", "Anticipate asteroid paths", "Save fuel", "Communicate"), 1), new g("Energy conservation mode is used when?", f.W("Racing", "Low fuel", "High speed", "Combat"), 1), new g("Type-D asteroids are known for being?", f.W("Fast", "Slow", "Unpredictable", "Large"), 2), new g("Emergency evasion protocols should be practiced?", f.W("Never", "Rarely", "Regularly", "Once"), 2), new g("The most dangerous asteroid type is?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 3), new g("Drift angle optimization improves?", f.W("Speed", "Maneuverability", "Fuel use", "All of above"), 3), new g("Yellow zone represents what danger level?", f.W("Safe", "Caution", "Danger", "Critical"), 1), new g("Metallic asteroids are classified as?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 1))), new y2.f("racing_history", "Racing History & Tracks", "🏁", f.W(new g("The Orion's Belt Challenge difficulty level is?", f.W("Easy", "Medium", "Hard", "Extreme"), 3), new g("How many asteroids are in Orion's Belt Challenge?", f.W("5,000+", "10,000+", "15,000+", "20,000+"), 2), new g("The record time for Mercury Run is?", f.W("2m 15s", "2m 58s", "3m 42s", "4m 15s"), 1), new g("Nebula Storm Circuit features?", f.W("Ice fields", "Energy fields", "Lava", "Darkness"), 1), new g("Titan's Ring is known for?", f.W("Speed", "Dense ice field", "Heat", "Size"), 1), new g("The longest race track is?", f.W("Mercury Run", "Titan's Ring", "Void Edge", "Orion's Belt"), 2), new g("How many races are in a championship season?", f.W("8", "10", "12", "15"), 2), new g("First place in a race awards how many points?", f.W("15", "18", "20", "25"), 3), new g("Master Pilot ranking requires?", f.W("100+ pts", "500+ pts", "1000+ pts", "2000+ pts"), 2), new g("Championship winner receives?", f.W("1M", "5M", "10M", "25M"), 2), new g("Void Edge is characterized by?", f.W("Speed", "Heat", "Zero visibility", "Ice"), 2), new g("The Galactic Racing League hosts events?", f.W("Monthly", "Quarterly", "Annually", "Daily"), 2), new g("Third place awards how many points?", f.W("10", "12", "15", "18"), 2))), new y2.f("safety", "Safety Protocols", "🛡️", f.W(new g("Pre-race system diagnostics should be?", f.W("Optional", "Recommended", "Mandatory", "Ignored"), 2), new g("Fuel levels before race should be?", f.W("50%", "75%", "90%", "100%"), 3), new g("G-Force dampening suits protect against?", f.W("Cold", "Radiation", "Extreme forces", "Asteroids"), 2), new g("Oxygen reserve in suits lasts for?", f.W("12 hours", "24 hours", "72 hours", "1 week"), 2), new g("Hull breach sealant activates?", f.W("Manually", "Automatically", "Never", "On landing"), 1), new g("Emergency shields should be tested?", f.W("Never", "Yearly", "Before each race", "Monthly"), 2), new g("Race control communication should be?", f.W("Optional", "Active at all times", "Used rarely", "Disabled"), 1), new g("Medical nanobots activate when?", f.W("Always", "Injury detected", "Manually", "At finish"), 1), new g("What is the priority in dangerous situations?", f.W("Speed", "Victory", "Safety", "Records"), 2), new g("Shield integrity check should show?", f.W("50%+", "75%+", "90%+", "100%"), 3), new g("Auto-eject systems should be?", f.W("Disabled", "On standby", "Active", "Removed"), 1), new g("Neural interface helmets should be?", f.W("Calibrated daily", "Never adjusted", "Optional", "Shared"), 0))), new y2.f("asteroids", "Asteroid Classification", "🪨", f.W(new g("Type-A asteroids are primarily?", f.W("Rocky", "Metallic", "Icy", "Gaseous"), 0), new g("Which asteroid type has medium density?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 1), new g("Type-C asteroids have high?", f.W("Speed", "Mass", "Volatility", "Temperature"), 2), new g("The most predictable asteroid type is?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 0), new g("Type-D asteroids are?", f.W("Simple", "Uniform", "Composite", "Small"), 2), new g("Rocky asteroids move at?", f.W("1-5 km/s", "5-10 km/s", "15-20 km/s", "25+ km/s"), 1), new g("Ice-based asteroids can?", f.W("Explode", "Melt", "Fragment", "All above"), 3), new g("Metallic asteroids are valuable for?", f.W("Beauty", "Mining", "Speed", "Color"), 1), new g("The safest asteroid type to navigate is?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 0), new g("Composite asteroids may contain?", f.W("One material", "Two materials", "Multiple materials", "No materials"), 2), new g("Which type requires most caution?", f.W("Type-A", "Type-B", "Type-C", "Type-D"), 3), new g("Asteroid density affects?", f.W("Color", "Drift calculations", "Temperature", "Age"), 1), new g("Type-B asteroids are best identified by?", f.W("Color", "Speed", "Metallic composition", "Size"), 2))));
    }

    public static boolean k(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    public static int l(int i, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return Math.max(0, i4 - i5);
    }

    public static int m(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public abstract int c(View view, int i);

    public abstract int d(View view, int i);

    public abstract InputFilter[] g(InputFilter[] inputFilterArr);

    public abstract float h(y yVar);

    public int i(View view) {
        return 0;
    }

    public int j() {
        return 0;
    }

    public abstract void o(int i);

    public abstract void p(View view, int i, int i4);

    public abstract void q(View view, float f2, float f4);

    public abstract void r(boolean z3);

    public abstract void s(boolean z3);

    public abstract void t(y yVar, float f2);

    public abstract boolean u(View view, int i);

    public void n(View view, int i) {
    }
}
