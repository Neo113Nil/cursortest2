package y;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import z2.C1442z;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307A {

    /* renamed from: a, reason: collision with root package name */
    public static final C1307A f11444a = new C1307A();

    public final void a(EditorInfo editorInfo, H0.b bVar) {
        H0.b bVar2 = H0.b.f3225i;
        if (Intrinsics.a(bVar, H0.b.f3225i)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(C1442z.h(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((H0.a) it.next()).f3224a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
