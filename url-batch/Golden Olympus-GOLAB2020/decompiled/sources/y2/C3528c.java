package y2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3528c extends C3534i {

    /* renamed from: b, reason: collision with root package name */
    private final List f46774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3528c(List missingFields, String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f46774b = missingFields;
    }

    public final List c() {
        return this.f46774b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3528c(List missingFields, String serialName) {
        this(missingFields, r4, null);
        String str;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
    }
}
