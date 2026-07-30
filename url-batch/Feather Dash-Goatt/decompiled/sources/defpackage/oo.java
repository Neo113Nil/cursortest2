package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oo extends sf1 implements Function1 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo(Object obj, dn dnVar, int i) {
        super(1, dnVar);
        this.i = i;
        this.k = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        dn dnVar = (dn) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new oo((ga1) obj2, dnVar, 0).k(Unit.a);
            default:
                return new oo((jp) obj2, dnVar, 1).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        Context context;
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    ga1 ga1Var = (ga1) obj2;
                    this.j = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) ga1Var.e.getValue()).edit();
                    LinkedHashSet linkedHashSet = ga1Var.f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) ga1Var.e.getValue()).getAll().isEmpty() && (context = ga1Var.c) != null) {
                        ea1.a(context, ga1Var.d);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.a == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    Object invoke = ((jp) obj2).invoke(this);
                    return invoke == tnVar2 ? tnVar2 : invoke;
                }
                if (i3 == 1) {
                    ca0.v(obj);
                    return obj;
                }
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
