package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class o70 implements ho {
    public final /* synthetic */ char[] f;

    @Override // defpackage.ho
    public final Object f(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        charSequence.getClass();
        int a0 = f70.a0(charSequence, this.f, intValue, false);
        if (a0 < 0) {
            return null;
        }
        return new tz(Integer.valueOf(a0), 1);
    }
}
