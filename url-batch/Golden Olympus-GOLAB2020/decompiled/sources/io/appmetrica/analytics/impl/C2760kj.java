package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2760kj extends AbstractC2601eh {
    public C2760kj(@NotNull C2953s5 c2953s5) {
        super(c2953s5);
        c2953s5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NotNull C2773l6 c2773l6) {
        Object remove;
        for (Map.Entry entry : c2773l6.f39391p.entrySet()) {
            Kk kk = this.f38930a.f39785u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                kk.getClass();
                if (bArr.length != 0) {
                    remove = kk.f37900b.put(str, bArr);
                    Ok ok = kk.f37899a;
                    Map<String, byte[]> map = kk.f37900b;
                    IBinaryDataHelper iBinaryDataHelper = ok.f38091d;
                    String str2 = ok.f38088a;
                    Nk nk = ok.f38090c;
                    Lk fromModel = ok.f38089b.fromModel(map);
                    nk.getClass();
                    iBinaryDataHelper.insert(str2, MessageNano.toByteArray(fromModel));
                }
            }
            remove = kk.f37900b.remove(str);
            Ok ok2 = kk.f37899a;
            Map<String, byte[]> map2 = kk.f37900b;
            IBinaryDataHelper iBinaryDataHelper2 = ok2.f38091d;
            String str22 = ok2.f38088a;
            Nk nk2 = ok2.f38090c;
            Lk fromModel2 = ok2.f38089b.fromModel(map2);
            nk2.getClass();
            iBinaryDataHelper2.insert(str22, MessageNano.toByteArray(fromModel2));
        }
        return true;
    }
}
