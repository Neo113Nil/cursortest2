package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.facebook.internal.security.OidcSecurityUtil;
import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ff0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                of0 of0Var = (of0) obj5;
                es2 es2Var = (es2) obj4;
                es2 es2Var2 = (es2) obj3;
                View view = (View) obj;
                Window window = ((re) obj2).getWindow();
                window.getClass();
                Function1 function1 = es2Var.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function12 = es2Var2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                of0Var.b(es2Var, es2Var2, window, view, booleanValue, ((Boolean) function12.invoke(resources2)).booleanValue());
                break;
            default:
                OidcSecurityUtil.getRawKeyFromEndPoint$lambda$1((URL) obj5, (c82) obj4, (String) obj3, (ReentrantLock) obj2, (Condition) obj);
                break;
        }
    }
}
