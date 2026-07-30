package cn.hutool.core.convert;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static Object a(f fVar, Object obj, Object obj2, boolean z7) {
        try {
            return fVar.convert(obj, obj2);
        } catch (Exception e8) {
            if (z7) {
                return obj2;
            }
            throw e8;
        }
    }
}
