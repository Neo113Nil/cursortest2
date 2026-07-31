package o;

/* renamed from: o.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0746w {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6648a = ((float) 0.125d) / 18;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean a(n0.g gVar, long j3) {
        Object obj;
        ?? r6 = gVar.f6214a;
        int size = r6.size();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i3);
            if (n0.l.a(((n0.m) obj).f6223a, j3)) {
                break;
            }
            i3++;
        }
        n0.m mVar = (n0.m) obj;
        if (mVar != null && mVar.f6226d) {
            z3 = true;
        }
        return true ^ z3;
    }
}
