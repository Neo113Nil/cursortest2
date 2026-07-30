package defpackage;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uf1 {
    public static final uf1 a = new uf1();

    public final void a(EditorInfo editorInfo, sf1 sf1Var) {
        sf1 sf1Var2 = sf1.o;
        if (Intrinsics.b(sf1Var, sf1.o)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(rv.l(sf1Var, 10));
        Iterator<E> it = sf1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((rf1) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
