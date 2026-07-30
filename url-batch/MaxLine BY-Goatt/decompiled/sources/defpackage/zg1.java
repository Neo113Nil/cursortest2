package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zg1 {
    public final LinkedHashMap a;

    public zg1(int i) {
        switch (i) {
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public zg1(gz1 gz1Var) {
        Map map = gz1Var.m;
        map.getClass();
        this.a = new LinkedHashMap(map);
    }
}
