package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2758kh extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final C2620f9 f39352b;

    public C2758kh(@NonNull C2953s5 c2953s5) {
        this(c2953s5, c2953s5.i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        EnumC3114ya enumC3114ya;
        if (!TextUtils.isEmpty(c2773l6.getName())) {
            C2620f9 c2620f9 = this.f39352b;
            String name = c2773l6.getName();
            if (c2620f9.f38963c == null) {
                c2620f9.a();
            }
            int hashCode = name.hashCode();
            if (c2620f9.f38963c.f39132b.contains(Integer.valueOf(hashCode))) {
                enumC3114ya = EnumC3114ya.NON_FIRST_OCCURENCE;
            } else {
                C2673h9 c2673h9 = c2620f9.f38963c;
                EnumC3114ya enumC3114ya2 = c2673h9.f39131a ? EnumC3114ya.FIRST_OCCURRENCE : EnumC3114ya.UNKNOWN;
                if (c2673h9.f39134d < 1000) {
                    c2673h9.f39132b.add(Integer.valueOf(hashCode));
                    c2673h9.f39134d++;
                } else {
                    c2673h9.f39131a = false;
                }
                C2750k9 c2750k9 = c2620f9.f38962b;
                C2673h9 c2673h92 = c2620f9.f38963c;
                IBinaryDataHelper iBinaryDataHelper = c2750k9.f39332c;
                C2724j9 c2724j9 = c2750k9.f39331b;
                c2750k9.f39330a.getClass();
                P9 a4 = C2699i9.a(c2673h92);
                c2724j9.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(a4));
                enumC3114ya = enumC3114ya2;
            }
            c2773l6.f39386k = enumC3114ya;
        }
        return false;
    }

    public C2758kh(C2953s5 c2953s5, C2620f9 c2620f9) {
        super(c2953s5);
        this.f39352b = c2620f9;
    }
}
