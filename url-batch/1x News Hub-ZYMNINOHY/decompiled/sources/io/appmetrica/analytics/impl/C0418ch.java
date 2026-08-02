package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418ch extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final R8 f7145b;

    public C0418ch(C0457e5 c0457e5) {
        this(c0457e5, c0457e5.j());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        EnumC0617ka enumC0617ka;
        if (!TextUtils.isEmpty(w5.getName())) {
            R8 r8 = this.f7145b;
            String name = w5.getName();
            if (r8.f6548c == null) {
                r8.a();
            }
            int hashCode = name.hashCode();
            if (r8.f6548c.f6692b.contains(Integer.valueOf(hashCode))) {
                enumC0617ka = EnumC0617ka.NON_FIRST_OCCURENCE;
            } else {
                T8 t8 = r8.f6548c;
                EnumC0617ka enumC0617ka2 = t8.f6691a ? EnumC0617ka.FIRST_OCCURRENCE : EnumC0617ka.UNKNOWN;
                if (t8.f6694d < 1000) {
                    t8.f6692b.add(Integer.valueOf(hashCode));
                    t8.f6694d++;
                } else {
                    t8.f6691a = false;
                }
                W8 w8 = r8.f6547b;
                T8 t82 = r8.f6548c;
                IBinaryDataHelper iBinaryDataHelper = w8.f6831c;
                V8 v8 = w8.f6830b;
                w8.f6829a.getClass();
                iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
                enumC0617ka = enumC0617ka2;
            }
            w5.f6824k = enumC0617ka;
        }
        return false;
    }

    public C0418ch(C0457e5 c0457e5, R8 r8) {
        super(c0457e5);
        this.f7145b = r8;
    }
}
