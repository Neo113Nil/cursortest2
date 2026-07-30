package Y5;

import com.google.android.gms.internal.ads.CL;

/* loaded from: classes2.dex */
public final class h extends IllegalArgumentException {

    /* renamed from: n, reason: collision with root package name */
    public final int f3994n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i, K7.c cVar) {
        super(r0.toString());
        String str;
        StringBuilder l9 = CL.l(i, "Unknown enum tag ", " for ");
        if (cVar != null) {
            Class a9 = ((kotlin.jvm.internal.c) cVar).a();
            kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a9.getName();
        } else {
            str = null;
        }
        l9.append(str);
        this.f3994n = i;
    }
}
