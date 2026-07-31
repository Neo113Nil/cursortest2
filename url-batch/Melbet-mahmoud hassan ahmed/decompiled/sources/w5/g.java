package w5;

/* loaded from: classes.dex */
public final class g extends q {
    public static /* bridge */ /* synthetic */ Appendable j(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, f6.l lVar, int i8, Object obj) {
        Appendable i9;
        i9 = q.i(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i7, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return i9;
    }
}
