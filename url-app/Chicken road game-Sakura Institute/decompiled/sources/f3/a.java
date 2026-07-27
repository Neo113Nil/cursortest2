package f3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList missingFields, String str, a aVar) {
        super(str, aVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f6662d = missingFields;
    }
}
