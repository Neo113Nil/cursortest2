package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nn extends nm {
    @Override // defpackage.nl, defpackage.nj, defpackage.np
    public void a(nx nxVar, nx nxVar2, Window window, View view, boolean z, boolean z2) {
        yk.b(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator a = new yt(viewGroup, 1).a();
            while (true) {
                if (!a.hasNext()) {
                    break;
                }
                Object tag = ((View) a.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof aaw)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof aaw ? (aaw) obj : null) != null) {
                                int i = ((aaw) obj).a;
                                if (i == 1) {
                                    throw null;
                                }
                                if (i == 2) {
                                    throw null;
                                }
                                if (i == 4) {
                                    throw null;
                                }
                                if (i == 8) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        ym aaeVar = Build.VERSION.SDK_INT >= 35 ? new aae(window) : Build.VERSION.SDK_INT >= 30 ? new aad(window) : new aac(window);
        yn.d(!z, aaeVar);
        yn.c(true ^ z2, aaeVar);
    }
}
