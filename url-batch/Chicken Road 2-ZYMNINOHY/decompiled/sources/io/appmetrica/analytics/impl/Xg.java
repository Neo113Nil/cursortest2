package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class Xg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final M8 f11268b;

    public Xg(X4 x4) {
        this(x4, x4.j());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        EnumC0559da enumC0559da;
        if (!TextUtils.isEmpty(p5.getName())) {
            M8 m8 = this.f11268b;
            String name = p5.getName();
            if (m8.f10636c == null) {
                m8.a();
            }
            int hashCode = name.hashCode();
            if (m8.f10636c.f10746b.contains(Integer.valueOf(hashCode))) {
                enumC0559da = EnumC0559da.NON_FIRST_OCCURENCE;
            } else {
                O8 o8 = m8.f10636c;
                EnumC0559da enumC0559da2 = o8.f10745a ? EnumC0559da.FIRST_OCCURRENCE : EnumC0559da.UNKNOWN;
                if (o8.f10748d < 1000) {
                    o8.f10746b.add(Integer.valueOf(hashCode));
                    o8.f10748d++;
                } else {
                    o8.f10745a = false;
                }
                R8 r8 = m8.f10635b;
                O8 o82 = m8.f10636c;
                IBinaryDataHelper iBinaryDataHelper = r8.f10878c;
                Q8 q8 = r8.f10877b;
                r8.f10876a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
                enumC0559da = enumC0559da2;
            }
            p5.f10804k = enumC0559da;
        }
        return false;
    }

    public Xg(X4 x4, M8 m8) {
        super(x4);
        this.f11268b = m8;
    }
}
