package ru.rustore.sdk.pay.internal;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class qc extends kotlin.jvm.internal.s implements Function1<List<? extends hc>, List<? extends gc>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc f44824a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(rc rcVar) {
        super(1);
        this.f44824a = rcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<hc> keysDto = (List) obj;
        Intrinsics.checkNotNullParameter(keysDto, "keysDto");
        pc pcVar = this.f44824a.f44913c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keysDto, 10));
        for (hc dto : keysDto) {
            pcVar.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            String value = dto.f44233a;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.z(value)) {
                throw new IllegalStateException("Check failed.");
            }
            arrayList.add(new gc(value, dto.f44234b));
        }
        q2 q2Var = this.f44824a.f44912b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            gc key = (gc) obj2;
            q2Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            SharedPreferences.Editor edit = q2Var.f44809a.edit();
            edit.putString(key.f44169a, key.f44170b);
            edit.commit();
        }
        return arrayList;
    }
}
