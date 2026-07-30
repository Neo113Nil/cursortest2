package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p51 {
    public static q51 PxuCJdSBwIXG(String str) {
        str.getClass();
        e0 PxuCJdSBwIXG = q51.e9gEMXR7LXtO.PxuCJdSBwIXG(str, 0);
        if (PxuCJdSBwIXG == null) {
            u9.XL4ISE6Oc65B(o0.dgRBjINgWbAK("No subtype found for: \"", str, '\"'));
            return null;
        }
        if (((y41) PxuCJdSBwIXG.x50lh2ztY7Y5) == null) {
            PxuCJdSBwIXG.x50lh2ztY7Y5 = new y41(PxuCJdSBwIXG);
        }
        y41 y41Var = (y41) PxuCJdSBwIXG.x50lh2ztY7Y5;
        y41Var.getClass();
        String str2 = (String) y41Var.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (((y41) PxuCJdSBwIXG.x50lh2ztY7Y5) == null) {
            PxuCJdSBwIXG.x50lh2ztY7Y5 = new y41(PxuCJdSBwIXG);
        }
        y41 y41Var2 = (y41) PxuCJdSBwIXG.x50lh2ztY7Y5;
        y41Var2.getClass();
        String lowerCase2 = ((String) y41Var2.get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = PxuCJdSBwIXG.rtx2ld2ELZv4().OPXfSBeufaJ8;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new q51(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            e0 PxuCJdSBwIXG2 = q51.a92UlCVFR9N8.PxuCJdSBwIXG(str, i2);
            if (PxuCJdSBwIXG2 == null) {
                u9.x50lh2ztY7Y5("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            z41 z41Var = (z41) PxuCJdSBwIXG2.dgRBjINgWbAK;
            x41 lS5Rgt96tfkO = z41Var.lS5Rgt96tfkO(1);
            String str3 = lS5Rgt96tfkO != null ? lS5Rgt96tfkO.PxuCJdSBwIXG : null;
            if (str3 == null) {
                i = PxuCJdSBwIXG2.rtx2ld2ELZv4().OPXfSBeufaJ8;
            } else {
                x41 lS5Rgt96tfkO2 = z41Var.lS5Rgt96tfkO(2);
                String str4 = lS5Rgt96tfkO2 != null ? lS5Rgt96tfkO2.PxuCJdSBwIXG : null;
                if (str4 == null) {
                    x41 lS5Rgt96tfkO3 = z41Var.lS5Rgt96tfkO(3);
                    lS5Rgt96tfkO3.getClass();
                    str4 = lS5Rgt96tfkO3.PxuCJdSBwIXG;
                } else if (str4.length() > 0 && ov2.jyegZNwi31qc(str4.charAt(0), '\'', false) && str4.length() > 0 && ov2.jyegZNwi31qc(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = PxuCJdSBwIXG2.rtx2ld2ELZv4().OPXfSBeufaJ8;
            }
        }
    }
}
