package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class b {
    private static final a Companion = new a();
    public final ArrayList TSizfFm2Yiuu;
    public final transient LinkedHashMap Y1f8riQaR6yg;
    public final Bundle a92UlCVFR9N8;
    public final LinkedHashMap e9gEMXR7LXtO;
    public final LinkedHashMap PxuCJdSBwIXG = new LinkedHashMap();
    public final LinkedHashMap lS5Rgt96tfkO = new LinkedHashMap();

    public b() {
        new LinkedHashMap();
        this.TSizfFm2Yiuu = new ArrayList();
        this.Y1f8riQaR6yg = new LinkedHashMap();
        this.e9gEMXR7LXtO = new LinkedHashMap();
        this.a92UlCVFR9N8 = new Bundle();
    }

    public final boolean PxuCJdSBwIXG(int i, int i2, Intent intent) {
        String str = (String) this.PxuCJdSBwIXG.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e9gEMXR7LXtO.remove(str);
        this.a92UlCVFR9N8.putParcelable(str, new P6VAkUObIv30(intent, i2));
        return true;
    }
}
