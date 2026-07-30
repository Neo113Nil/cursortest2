package y4;

import P.InterfaceC0144i;
import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k6.InterfaceC0618m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0618m[] f8569a = {new kotlin.jvm.internal.x(L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    public static final S.b f8570b = d4.c.C("FlutterSharedPreferences", null, null, 14);

    public static final InterfaceC0144i a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f8570b.a(context, f8569a[0]);
    }

    public static final boolean b(String key, Object obj, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, r4.d listEncoder) {
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!kotlin.text.p.l(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (!kotlin.text.p.l(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return obj;
            }
            String substring = str.substring(40);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (kotlin.text.p.l(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        String listString = str.substring(40);
        Intrinsics.checkNotNullExpressionValue(listString, "substring(...)");
        listEncoder.getClass();
        Intrinsics.checkNotNullParameter(listString, "listString");
        ByteArrayInputStream input = new ByteArrayInputStream(Base64.decode(listString, 0));
        Intrinsics.checkNotNullParameter(input, "input");
        Object readObject = new N(input).readObject();
        Intrinsics.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) readObject) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
