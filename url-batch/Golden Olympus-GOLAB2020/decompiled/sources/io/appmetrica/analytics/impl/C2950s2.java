package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2950s2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2841nm fromModel(@NonNull C2924r2 c2924r2) {
        C2789lm c2789lm;
        C2841nm c2841nm = new C2841nm();
        c2841nm.f39526a = new C2815mm[c2924r2.f39696a.size()];
        for (int i4 = 0; i4 < c2924r2.f39696a.size(); i4++) {
            C2815mm c2815mm = new C2815mm();
            Pair pair = (Pair) c2924r2.f39696a.get(i4);
            c2815mm.f39459a = (String) pair.first;
            if (pair.second != null) {
                c2815mm.f39460b = new C2789lm();
                C2899q2 c2899q2 = (C2899q2) pair.second;
                if (c2899q2 == null) {
                    c2789lm = null;
                } else {
                    C2789lm c2789lm2 = new C2789lm();
                    c2789lm2.f39410a = c2899q2.f39646a;
                    c2789lm = c2789lm2;
                }
                c2815mm.f39460b = c2789lm;
            }
            c2841nm.f39526a[i4] = c2815mm;
        }
        return c2841nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2924r2 toModel(@NonNull C2841nm c2841nm) {
        ArrayList arrayList = new ArrayList();
        for (C2815mm c2815mm : c2841nm.f39526a) {
            String str = c2815mm.f39459a;
            C2789lm c2789lm = c2815mm.f39460b;
            arrayList.add(new Pair(str, c2789lm == null ? null : new C2899q2(c2789lm.f39410a)));
        }
        return new C2924r2(arrayList);
    }
}
