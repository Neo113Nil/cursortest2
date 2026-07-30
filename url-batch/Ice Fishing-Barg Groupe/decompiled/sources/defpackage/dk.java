package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dk {
    public final String PxuCJdSBwIXG;
    public List lS5Rgt96tfkO = p50.rtx2ld2ELZv4;
    public final ArrayList TSizfFm2Yiuu = new ArrayList();
    public final HashSet Y1f8riQaR6yg = new HashSet();
    public final ArrayList e9gEMXR7LXtO = new ArrayList();
    public final ArrayList a92UlCVFR9N8 = new ArrayList();
    public final ArrayList RAsUl2FVSrh6 = new ArrayList();

    public dk(String str) {
        this.PxuCJdSBwIXG = str;
    }

    public static void PxuCJdSBwIXG(dk dkVar, String str, SerialDescriptor serialDescriptor) {
        dkVar.getClass();
        serialDescriptor.getClass();
        if (!dkVar.Y1f8riQaR6yg.add(str)) {
            u9.dgRBjINgWbAK("Element with name '", str, "' is already registered in ", dkVar.PxuCJdSBwIXG);
            return;
        }
        dkVar.TSizfFm2Yiuu.add(str);
        dkVar.e9gEMXR7LXtO.add(serialDescriptor);
        dkVar.a92UlCVFR9N8.add(p50.rtx2ld2ELZv4);
        dkVar.RAsUl2FVSrh6.add(false);
    }
}
