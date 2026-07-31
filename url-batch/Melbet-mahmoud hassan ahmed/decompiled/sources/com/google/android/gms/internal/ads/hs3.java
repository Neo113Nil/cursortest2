package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class hs3 extends ss3 {
    hs3(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.ads.ss3
    public final void a() {
        if (!j()) {
            for (int i7 = 0; i7 < b(); i7++) {
                Map.Entry g7 = g(i7);
                if (((rp3) g7.getKey()).c()) {
                    g7.setValue(Collections.unmodifiableList((List) g7.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((rp3) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
