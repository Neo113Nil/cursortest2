package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf0 implements xr {
    public final /* synthetic */ char[] f;

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        charSequence.getClass();
        int x = mf0.x(charSequence, this.f, intValue, false);
        if (x < 0) {
            return null;
        }
        return new k50(Integer.valueOf(x), 1);
    }
}
