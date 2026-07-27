package P;

import M2.p;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class j extends p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final j f3668e = new j(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final j f3669i = new j(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i4) {
        super(i2);
        this.f3670d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3670d) {
            case 0:
                return new i(new LinkedHashMap());
            default:
                return null;
        }
    }
}
