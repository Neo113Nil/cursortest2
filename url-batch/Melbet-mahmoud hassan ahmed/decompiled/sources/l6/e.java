package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t6, f6.l<? super T, ? extends CharSequence> lVar) {
        CharSequence valueOf;
        kotlin.jvm.internal.i.d(appendable, "<this>");
        if (lVar != null) {
            t6 = (T) lVar.invoke(t6);
        } else {
            if (!(t6 == 0 ? true : t6 instanceof CharSequence)) {
                if (t6 instanceof Character) {
                    appendable.append(((Character) t6).charValue());
                    return;
                } else {
                    valueOf = String.valueOf((Object) t6);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) t6;
        appendable.append(valueOf);
    }
}
