package s1;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f10549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Bundle bundle, int i2) {
        super(1);
        this.f10548d = i2;
        this.f10549e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10548d) {
            case 0:
                String argName = (String) obj;
                Intrinsics.checkNotNullParameter(argName, "argName");
                return Boolean.valueOf(!this.f10549e.containsKey(argName));
            default:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!this.f10549e.containsKey(key));
        }
    }
}
