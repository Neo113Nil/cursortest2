package defpackage;

import android.content.Context;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class chp {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public chp(Map map) {
        this.b = map;
        this.a = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            aej aejVar = (aej) entry.getValue();
            List list = (List) this.a.get(aejVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(aejVar, list);
            }
            list.add((aea) entry.getKey());
        }
    }

    public static void b(List list, aer aerVar, aej aejVar, Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            aea aeaVar = (aea) list.get(size);
            try {
                int i = aeaVar.a;
                if (i == 0) {
                    aeaVar.b.invoke(obj, null);
                } else if (i != 1) {
                    aeaVar.b.invoke(obj, aerVar, aejVar);
                } else {
                    aeaVar.b.invoke(obj, aerVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }

    public final ddi a(String str) {
        try {
            Object obj = this.a;
            String str2 = chi.a;
            return dih.w(cho.c((Context) obj, str));
        } catch (chh | IOException e) {
            return dih.v(e);
        }
    }

    public chp(Context context) {
        this.a = context;
        this.b = hoq.v(new cud(context, 1));
    }
}
