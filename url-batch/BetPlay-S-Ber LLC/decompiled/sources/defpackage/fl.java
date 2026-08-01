package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class fl {
    public static final kl a = new kl();
    public static final ml b;

    static {
        ml mlVar = null;
        try {
            mlVar = (ml) sl.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = mlVar;
    }

    public static void a(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
