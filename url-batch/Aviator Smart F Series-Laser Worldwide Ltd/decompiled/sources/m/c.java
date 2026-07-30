package m;

import cn.hutool.core.lang.func.Func1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static Object a(Func1 func1, Object obj) {
        try {
            return func1.call(obj);
        } catch (Exception e8) {
            throw i.b.wrapRuntime(e8);
        }
    }
}
