package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569ch extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final R8 f8001b;

    public C0569ch(C0608e5 c0608e5) {
        this(c0608e5, c0608e5.j());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        EnumC0768ka enumC0768ka;
        if (!TextUtils.isEmpty(w5.getName())) {
            R8 r8 = this.f8001b;
            String name = w5.getName();
            if (r8.f7367c == null) {
                r8.a();
            }
            int hashCode = name.hashCode();
            if (r8.f7367c.f7520b.contains(Integer.valueOf(hashCode))) {
                enumC0768ka = EnumC0768ka.NON_FIRST_OCCURENCE;
            } else {
                T8 t8 = r8.f7367c;
                EnumC0768ka enumC0768ka2 = t8.f7519a ? EnumC0768ka.FIRST_OCCURRENCE : EnumC0768ka.UNKNOWN;
                if (t8.f7522d < 1000) {
                    t8.f7520b.add(Integer.valueOf(hashCode));
                    t8.f7522d++;
                } else {
                    t8.f7519a = false;
                }
                W8 w8 = r8.f7366b;
                T8 t82 = r8.f7367c;
                IBinaryDataHelper iBinaryDataHelper = w8.f7666c;
                V8 v8 = w8.f7665b;
                w8.f7664a.getClass();
                iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
                enumC0768ka = enumC0768ka2;
            }
            w5.f7658k = enumC0768ka;
        }
        return false;
    }

    public C0569ch(C0608e5 c0608e5, R8 r8) {
        super(c0608e5);
        this.f8001b = r8;
    }
}
