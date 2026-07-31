package H1;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f893b;

    /* renamed from: a, reason: collision with root package name */
    public A.e f894a;

    public final synchronized E a() {
        String str;
        E e4;
        A.e eVar = this.f894a;
        synchronized (((ArrayDeque) eVar.f10j)) {
            str = (String) ((ArrayDeque) eVar.f10j).peek();
        }
        Pattern pattern = E.f889d;
        e4 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                e4 = new E(split[0], split[1]);
            }
        }
        return e4;
    }
}
