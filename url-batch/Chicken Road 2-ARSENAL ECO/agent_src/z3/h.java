package z3;

/* loaded from: classes.dex */
public final class h extends IllegalArgumentException {

    /* renamed from: f, reason: collision with root package name */
    public final int f6308f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i7, D5.c cVar) {
        super(r0.toString());
        String str;
        StringBuilder sb = new StringBuilder("Unknown enum tag ");
        sb.append(i7);
        sb.append(" for ");
        if (cVar != null) {
            Class a7 = ((kotlin.jvm.internal.c) cVar).a();
            kotlin.jvm.internal.i.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a7.getName();
        } else {
            str = null;
        }
        sb.append(str);
        this.f6308f = i7;
    }
}
