package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k60 extends pr2 implements Function1 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k60(int i, o30 o30Var, Object obj) {
        super(1, o30Var);
        this.m = i;
        this.o = obj;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        int i = this.m;
        Object obj = this.o;
        switch (i) {
            case 0:
                return new k60(0, o30Var, (wk2) obj);
            default:
                return new k60(1, o30Var, (f70) obj);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o30 o30Var = (o30) obj;
        switch (this.m) {
        }
        return ((k60) create(o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    wk2 wk2Var = (wk2) obj2;
                    this.n = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) wk2Var.e.getValue()).edit();
                    Set set = wk2Var.f;
                    if (set == null) {
                        edit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        dm0.j("Unable to delete migrated keys from SharedPreferences.");
                        return null;
                    }
                    if (((SharedPreferences) wk2Var.e.getValue()).getAll().isEmpty()) {
                        Context context = wk2Var.c;
                        String str = wk2Var.d;
                        if (str != null) {
                            uk2.a(context, str);
                        }
                    }
                    if (set != null) {
                        set.clear();
                    }
                    if (Unit.a == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object invoke = ((f70) obj2).invoke(this);
                    return invoke == b50Var2 ? b50Var2 : invoke;
                }
                if (i3 == 1) {
                    ca2.b(obj);
                    return obj;
                }
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
