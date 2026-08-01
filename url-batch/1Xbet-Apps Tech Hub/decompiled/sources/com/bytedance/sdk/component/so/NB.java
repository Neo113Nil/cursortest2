package com.bytedance.sdk.component.so;

/* compiled from: TTBaseExecutor.java */
/* loaded from: classes.dex */
public class NB {
    private static Wyp pvs = new Wyp() { // from class: com.bytedance.sdk.component.so.NB.1
        @Override // com.bytedance.sdk.component.so.Wyp
        public Mxy createThreadFactory(int i, String str) {
            return new Mxy(i, str);
        }
    };

    public static void pvs(Wyp wyp) {
        pvs = wyp;
    }

    public static Wyp pvs() {
        return pvs;
    }
}
