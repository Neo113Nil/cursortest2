package P0;

import b1.d;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f634a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f635b = {"apple", "river", "cloud", "stone", "maple", "ocean", "tiger", "eagle", "flame", "storm", "brave", "coral", "delta", "ember", "frost", "globe", "honey", "ivory", "jade", "karma", "lemon", "mint", "noble", "olive", "pearl", "quest", "rusty", "solar", "terra", "ultra", "vivid", "waltz", "xenon", "yacht", "zebra", "amber", "blaze", "cedar", "dawn", "echo", "fable", "grace", "haven", "inbox", "jewel", "knack", "lotus", "mango", "north", "orbit", "prism", "quartz", "ridge", "spark", "tulip", "unity", "valor", "whale", "xylem", "yield", "zesty", "anchor", "breeze", "cipher", "drift", "elixir", "falcon", "grove", "horizon", "island", "jungle", "knight", "lagoon", "meadow", "nebula", "oasis", "pixel", "quiver", "rocket", "summit", "thunder", "uplift", "vertex", "wonder", "zenith", "arcade", "beacon", "canyon", "dynamo", "enigma", "fusion", "galaxy", "harbor", "ignite", "jigsaw", "kernel", "lunar", "matrix", "nexus", "onyx", "plasma", "quantum", "radar", "signal", "turbo", "vector", "wave", "xray", "yonder", "zephyr", "alpha", "beta", "cosmic", "dragon", "energy", "forest", "guitar", "helix", "indigo", "jovial", "kinetic", "legend", "marble", "nova", "omega", "phoenix", "quasar", "raven", "shadow", "titan", "unique", "vortex", "wizard", "yellow", "zero", "aurora", "bronze", "copper", "diamond", "ember", "falcon", "granite", "harvest", "iron", "jasmine", "krypton", "lilac", "meteor", "nickel", "obsidian", "pebble", "quill", "ruby", "silver", "topaz", "umber", "violet", "willow", "xenial", "yarrow", "zircon"};

    public static String a(int i, List list) {
        SecureRandom secureRandom;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        d.d(sb2, "toString(...)");
        char[] cArr = new char[i];
        int size = list.size();
        int i2 = 0;
        while (true) {
            secureRandom = f634a;
            if (i2 >= size || i2 >= i) {
                break;
            }
            String str = (String) list.get(i2);
            cArr[i2] = str.charAt(secureRandom.nextInt(str.length()));
            i2++;
        }
        for (int size2 = list.size(); size2 < i; size2++) {
            cArr[size2] = sb2.charAt(secureRandom.nextInt(sb2.length()));
        }
        for (int i3 = i - 1; i3 > 0; i3--) {
            int nextInt = secureRandom.nextInt(i3 + 1);
            char c2 = cArr[i3];
            cArr[i3] = cArr[nextInt];
            cArr[nextInt] = c2;
        }
        return new String(cArr);
    }
}
